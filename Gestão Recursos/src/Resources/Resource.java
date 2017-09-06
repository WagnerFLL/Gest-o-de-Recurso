package Resources;

import java.util.Calendar;
import Persons.PrivateAcess;

public abstract class Resource implements ResourceState {
	
	protected String status;
	protected Calendar startTime;
	protected Calendar endTime;
	protected PrivateAcess responsible;
	
}
