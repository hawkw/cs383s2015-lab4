package rebellion;

import repast.simphony.engine.schedule.ScheduledMethod;

public interface Agent {

	/*
	 * Step
	 */
	public abstract void step();

	/*
	 * overrid for debugging purpose
	 */
	public abstract String toString();

}