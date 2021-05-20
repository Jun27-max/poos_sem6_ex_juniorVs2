package entities;

public class Rectangle extends Bidimensional {

	private Double width;
	private Double height;

	public Rectangle() {

	}

	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimetro() {
		return 2 * width + 2 * height;
	}

}
