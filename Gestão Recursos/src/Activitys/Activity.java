package Activitys;

import java.util.Calendar;
import java.util.LinkedList;
import Persons.PersonPrototype;
import Persons.PrivateAcess;
import Resources.ResourcePrototype;

public abstract class Activity implements ActivityState{
	
	private String title;
	private String status;
	private String description;
	private String material;
	private Calendar hourStart;
	private Calendar hourEnd;
	private PrivateAcess responsible;
	private ResourcePrototype resource;
	private int ID;

	@Override
	public ActivityState setEmAndamento() {
		this.setStatus("Em andamento");
		return this;
	}

	@Override
	public ActivityState setConcluido() {
		this.setStatus("Concluido");
		return this;
	}

	@Override
	public ActivityState setAlocado() {
		this.setStatus("Alocado");
		return this;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public ResourcePrototype getResource() {
		return resource;
	}

	public void setResource(ResourcePrototype resource) {
		this.resource = resource;
	}

	public PrivateAcess getResponsible() {
		return responsible;
	}

	public void setResponsible(PrivateAcess responsible) {
		this.responsible = responsible;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Calendar getHourStart() {
		return hourStart;
	}

	public void setHourStart(Calendar hourStart) {
		this.hourStart = hourStart;
	}

	public Calendar getHourEnd() {
		return hourEnd;
	}

	public void setHourEnd(Calendar hourEnd) {
		this.hourEnd = hourEnd;
	}
}
