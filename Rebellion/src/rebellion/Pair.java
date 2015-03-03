package rebellion;

/**
 * Holds an observed number of active agents associated with a positive or
 * negative reinforcement.
 * 
 * This class is only necessary because Java doesn't have tuples.
 *
 * Instances of <code>Pair</code> are immutable and cannot be modified.
 * 
 * @author Hawk Weisman <hawk@meteorcodelabs.com>
 *
 */
public class Pair {
	private int numActive;
	private double reinforcement;

	/**
	 * Create a new <code>Pair</code> with the specified number of active agents
	 * and reinforcement value.
	 * 
	 * @param numActive
	 *            the observed number of active agents
	 * @param reinforcement
	 *            the positive or negative reinforcement
	 */
	public Pair(int numActive, double reinforcement) {
		this.numActive = numActive;
		this.reinforcement = reinforcement;
	}

	/**
	 * @return the number of active agents at the time of this observation
	 */
	public int getNumActive() {
		return this.numActive;
	}

	/**
	 * @return the positive or negative reinforcement value associated with this
	 *         observation.
	 */
	public double getReinforcement() {
		return this.reinforcement;
	}
}
