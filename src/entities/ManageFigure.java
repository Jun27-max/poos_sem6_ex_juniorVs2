package entities;

public class ManageFigure {

	public ManageFigure() {

	}

	public void calculateArea(Shape s) {
		System.out.println(String.format("%.2f", s.area()));

	}

	public void calculatePerimetro(Bidimensional b) {
		System.out.println(String.format("%.2f", b.perimetro()));
	}

	public void calculateVolume(Tridimensional t) {
		System.out.println(String.format("%.2f", t.volume()));
	}

}
