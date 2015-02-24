package rebellion.learning;

public abstract class Learning {

	/**
	 * Critique the utility value of the last step's action.
	 * 
	 * @return a double representing the utility value of the prior step's
	 *         action, where 1 is ideal and 0 is death.
	 */
	public double critique();

}
