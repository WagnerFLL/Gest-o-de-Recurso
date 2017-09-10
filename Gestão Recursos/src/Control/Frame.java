package Control;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

import Activitys.Activity;
import Activitys.Class;
import Activitys.ClassLab;
import Activitys.Presentation;
import Persons.*;
import Resources.*;

public class Frame {

    // User
    private LinkedList<PrivateAcess> users;
    private LinkedList<Student> students;
    private Student studentPrototype;
    private Professor professorPrototype;
    private Researcher reseacherPrototype;
    private int countUser;
    private int countStd;

    // Resource
    private LinkedList<ResourcePrototype> classrooms;
    private LinkedList<ResourcePrototype> auditoriums;
    private LinkedList<ResourcePrototype> laboratories;
    private LinkedList<ResourcePrototype> projectors;
    private Classroom classroomPrototype;
    private Auditorium auditoriumPrototype;
    private Laboratory laboratoryPrototype;
    private Projector projectorPrototype;

    // Alocations
    private LinkedList<Activity> activities;
    private int countActivities;

    private Scanner scanStr;
    private Scanner scanInt;

    public Frame() {
        this.activities = new LinkedList<Activity>();
        this.users = new LinkedList<PrivateAcess>();
        this.students = new LinkedList<Student>();
        this.auditoriums = new LinkedList<>();
        this.classrooms = new LinkedList<>();
        this.laboratories = new LinkedList<>();
        this.projectors = new LinkedList<>();
        this.professorPrototype = new Professor();
        this.studentPrototype = new Student();
        this.reseacherPrototype = new Researcher();
        this.classroomPrototype = new Classroom();
        this.auditoriumPrototype = new Auditorium();
        this.laboratoryPrototype = new Laboratory();
        this.projectorPrototype = new Projector();
        this.countUser = 0;
        this.countStd = 0;
        this.countActivities = 0;
        this.scanInt = new Scanner(System.in);
        this.scanStr = new Scanner(System.in);
        initialize();
    }

    private void initialize() {
        System.out.println("Digite o número de salas:");
        int n_class = scanInt.nextInt();
        for (int i = 0; i < n_class; i++)
            this.classrooms.add(this.classroomPrototype.clonar(i));

        System.out.println("Digite o número de auditórios:");
        int n_audi = scanInt.nextInt();
        for (int i = 0; i < n_audi; i++)
            this.auditoriums.add(this.auditoriumPrototype.clonar(i));

        System.out.println("Digite o número de laboratórios:");
        int n_lab = scanInt.nextInt();
        for (int i = 0; i < n_lab; i++)
            this.laboratories.add(this.laboratoryPrototype.clonar(i));

        System.out.println("Digite o número de prjetores:");
        int n_projt = scanInt.nextInt();
        for (int i = 0; i < n_projt; i++)
            this.projectors.add(this.projectorPrototype.clonar(i));
    }

    public void addUser() {

        System.out.println("Selecione o tipo de usuário:\n"
                + "1 - Aluno.\n"
                + "2 - Professor.\n"
                + "3 - Pesquisador.\n");

        int option = scanInt.nextInt();

        PersonPrototype user;

        switch (option) {
            case 1:
                user = studentPrototype.clonar();
                user.setAtributs(++countStd);
                students.add((Student) user);
                break;
            case 2:
                user = professorPrototype.clonar();
                user.setAtributs(++countUser);
                users.add((PrivateAcess) user);
                break;
            case 3:
                user = reseacherPrototype.clonar();
                user.setAtributs(++countUser);
                users.add((PrivateAcess) user);
                break;
            default:
                user = studentPrototype.clonar();
                user.setAtributs(++countStd);
                students.add((Student) user);
                break;
        }
        System.out.println("Usuário " + user.getName() + " adicionado! ID = " + user.getID());

    }

    public void allocation() {
        Activity activity;

        try {
            System.out.println("\tEscolha a atividade:\n" +
                    "\t|1| Aula tradicional.\n" +
                    "\t|2| Apresentação.\n" +
                    "\t|3| Laboratório.");
            int option = scanInt.nextInt();

            switch (option) {
                case 1:
                    activity = new Class();
                    break;
                case 2:
                    activity = new Presentation();
                    break;
                case 3:
                    activity = new ClassLab();
                    break;
                default:
                    activity = new Presentation();
                    break;
            }

            System.out.println("\tEscolha o recurso:\n" +
                    "\t|1| Sala.\n" +
                    "\t|2| Sala de laboratório.\n" +
                    "\t|3| Projetor.\n" +
                    "\t|4| Auditório.\n");
            option = scanInt.nextInt();

            System.out.println("\tDigite o ID do recurso:");
            int id_option = scanInt.nextInt();
            switch (option) {
                case 1:
                    activity.setResource(classrooms.get(id_option));
                    break;
                case 2:
                    activity.setResource(laboratories.get(id_option));
                    break;
                case 3:
                    activity.setResource(projectors.get(id_option));
                    break;
                case 4:
                    activity.setResource(auditoriums.get(id_option));
                    break;
                default:
                    activity.setResource(auditoriums.get(10000));
            }

            System.out.println("Informe o título da atividade:");
            activity.setTitle(scanStr.nextLine());

            System.out.println("Informe a hora de início: (Int)");
            Calendar hour = Calendar.getInstance();
            hour.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE, scanInt.nextInt(), 0);
            activity.setHourStart(hour);

            System.out.println("Informe a hora de término: (Int)");
            Calendar hour2 = Calendar.getInstance();
            hour2.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE, scanInt.nextInt(), 0);
            activity.setHourEnd(hour2);

            do {
                System.out.println("Digite o ID do usuário responsável:");
                PrivateAcess a = users.get(scanInt.nextInt() - 1);
                if (a.getNumAllocations() == 0) {
                    activity.setResponsible(a);
                    a.setNumAllocations(1);
                    activity.setEmAndamento();
                    activities.add(activity);
                    System.out.println("Alocação concluída. ID = " + countActivities);
                    ++countActivities;
                    break;
                } else
                    System.out.println("Este usuário já possui alocações em andamento.\n" +
                            "Selecione outro usuário.");
            } while (true);

        } catch (Exception e) {
            System.out.println(">>> Ocorreu um erro e a alocaçao foi canelada! <<<");
        }
    }

    public void changeStatus() {
        try {
            System.out.println("Informe o ID da alocação:");
            int option = scanInt.nextInt();
            Activity activity = activities.get(option);

            System.out.println("Status atual: " + activity.getStatus());
            System.out.println("Selecione o novo status: \n" +
                    "|1| Em andamento.\n" +
                    "|2| Alocado.\n" +
                    "|3| Concluido.\n");
            option = scanInt.nextInt();

            boolean flag = false;
            if (activity.getResponsible().getNumAllocations() == 1)
                flag = true;

            switch (option) {
                case 1:
                    activity.setEmAndamento();
                    flag = false;
                    break;
                case 2:
                    activity.setAlocado();
                    break;
                case 3:
                    activity.setConcluido();
                    break;
                default:
                    break;
            }

            if (flag)
                activity.getResponsible().setNumAllocations(0);

        } catch (Exception e) {
            System.out.println(">>> Ocorreu um erro, talvez essa alocação não exista.");
        }
    }

    public void addInfo() {
        try {
            System.out.println("Informe o ID da alocação: ");
            Activity activity = activities.get(scanInt.nextInt());

            System.out.println("Adicionar:\n" +
                    "|1| Descrição.\n" +
                    "|2| Material\n");
            switch (scanInt.nextInt()) {
                case 1:
                    System.out.println("> ");
                    activity.setDescription(scanStr.nextLine());
                    break;
                case 2:
                    System.out.println("> ");
                    activity.setMaterial(scanStr.nextLine());
                    break;
            }
        } catch (Exception e) {
            System.out.println(">>> Ocorreu um erro! Talvez a alocação não exista. <<<");
        }
    }

    public void searchUser() {
        try {
            System.out.println("Informe o ID do usuário:");

            int id_option = scanInt.nextInt();
            PrivateAcess user = users.get(id_option - 1);

            System.out.println("Nome do uduário: " + user.getName());

            boolean flag = false;
            for (Activity activity : activities) {
                if (user.equals(activity.getResponsible())) {
                    System.out.println("Atividade: " + activity.getTitle());
                    System.out.println("Status: " + activity.getStatus());
                    flag = true;
                }
            }
            if (!flag)
                System.out.println("O usuário ainda não possue alocações.");
        } catch (Exception e) {
            System.out.println(">>> Erro! Talvez o usuário não exista! <<<");
        }
    }

    public void searchResource() {
        try {
            System.out.println("Informe o tipo de recurso:\n" +
                    "\t|1| Sala.\n" +
                    "\t|2| Sala de laboratório.\n" +
                    "\t|3| Projetor.\n" +
                    "\t|4| Auditório.\n");
            int resourceType = scanInt.nextInt();

            ResourcePrototype resource;
            switch (resourceType) {
                case 1:
                    resource = classroomPrototype.clonar(0);
                    break;
                case 2:
                    resource = laboratoryPrototype.clonar(0);
                    break;
                case 3:
                    resource = projectorPrototype.clonar(0);
                    break;
                case 4:
                    resource = auditoriumPrototype.clonar(0);
                    break;
                default:
                    resource = classroomPrototype.clonar(0);
                    break;
            }

            boolean flag = false;
            for (Activity activity : activities) {
                if (activity.getResource().toString().equals(resource.toString())) {
                    System.out.println("Atividade: " + activity.getTitle());
                    System.out.println("Status: " + activity.getStatus());
                    System.out.println("Id da alocação: " + activity.getID());
                    System.out.println("Id do recurso: " + activity.getResource().getID());
                    System.out.println("Responsável: " + activity.getResponsible().getName());
                    System.out.println(" ------------------------- ");
                    flag = true;
                }
            }
            if (!flag)
                System.out.println("Este recurso nunca foi alocado!");

        } catch (Exception e) {
            System.out.println(">>> Erro #1001! <<<");
        }


    }

    public void report(){
        System.out.println("\n ------- Relatório ------- ");
        System.out.println("Número de alunos: "+this.countStd);
        System.out.println("Número de professores e pesquisadores: "+this.countUser);
        System.out.println("Número de alocações: "+this.countActivities);
        int a = 0, b = 0, c = 0, d = 0, e =0, f = 0;
        for (Activity activity : activities){
            if (activity.getStatus().equals("Em andamento"))
                ++d;
            else if (activity.getStatus().equals("Concluido"))
                ++e;
            else if (activity.getStatus().equals("Alocado"))
                ++f;

            if (activity instanceof Class)
                ++a;
            else if (activity instanceof ClassLab)
                ++b;
            else if (activity instanceof Presentation)
                ++c;
        }
        System.out.println("Número de aulas tradicionais: "+a);
        System.out.println("Número de aulas em laboratórios: "+b);
        System.out.println("Número de apresentações: "+c);
        System.out.println("Em andamento: "+d);
        System.out.println("Concluidos: "+e);
        System.out.println("Alocados: "+f);

    }
}

