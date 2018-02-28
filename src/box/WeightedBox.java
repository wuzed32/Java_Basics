package box;

public class WeightedBox extends Box {
	
	double weight;
	
	public WeightedBox(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}
}
