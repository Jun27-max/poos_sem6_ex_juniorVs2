package entities;

public class Sphere extends Tridimensional {

	private Double radius;

	public Sphere() {

	}

	public Sphere(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	public double volume() {
		return 4 * Math.PI * Math.pow(radius, 3) / 3.0;
	}

}
