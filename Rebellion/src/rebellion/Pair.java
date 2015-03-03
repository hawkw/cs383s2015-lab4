package rebellion;

public class Pair {
	private int numCops;
	private double weight;
	
	public Pair(int numCops, double weight) {
		this.numCops = numCops;
		this.weight = weight;
	}
	
	public int getNumCops () { return this.numCops; }
	public double getWeight ()  { return this.weight;  }
}
