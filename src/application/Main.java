package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ManageFigure;
import entities.Rectangle;
import entities.Sphere;
import entities.Triangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Entre com os lados do Retangulo: ");
		System.out.print("Largura: ");
		double largura = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		Rectangle rectangle =  new Rectangle(largura, altura);
		
		System.out.println();
		System.out.println("Enter com os lados do triangulo:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		Triangle triangle = new Triangle(a, b, c);
		
		System.out.println();
		System.out.println("Entre com o raio da esfera : ");
		double radius = sc.nextDouble();
		Sphere sphere = new Sphere(radius);

		ManageFigure m = new ManageFigure();
		
		System.out.println("Área do Triangulo: ");
		m.calculateArea(triangle);
		
		System.out.println("Perímetro do Retángulo: ");
		m.calculatePerimetro(rectangle);
		
		System.out.println("Volume da esfera : ");
		m.calculateVolume(sphere);

		sc.close();

	}

}
