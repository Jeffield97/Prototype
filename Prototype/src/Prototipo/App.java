package Prototipo;

import java.util.ArrayList;
import java.util.List;

import Prototipo.Rectangulo;
import Prototipo.Circulo;
import Prototipo.Figura;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Figura> figuras = new ArrayList<>();
		List<Figura> copiasFigura = new ArrayList<>();
		
		Circulo circulo = new Circulo();
		Circulo circulo2 = new Circulo();
		circulo.x = 10;
		circulo.y = 20;
		circulo.radio = 15;
		circulo.color = "Verde";
		
		
		Rectangulo rectangulo = new Rectangulo();
		figuras.add(rectangulo);
		figuras.add(circulo);
		figuras.add(circulo2);
		
		
		
		cloneAndCompare(figuras, copiasFigura);
	}
	
	private static void cloneAndCompare(List<Figura> figuras, List<Figura> copiasFigura) {
		for (Figura figura : figuras) {
			copiasFigura.add(figura.clone());
		}

		for (int i = 0; i < figuras.size(); i++) {
			if (figuras.get(i) != copiasFigura.get(i)) {
				System.out.println(i + ": Son diferentes objetos");
				if (figuras.get(i).equals(copiasFigura.get(i))) {
					System.out.println(i + ": Son objetos idénticos");
				} else {
					System.out.println(i + ": No son objetos idénticos");
				}
			} else {
				System.out.println(i + ": Son los mismos objetos");
			}
		}

	}

}
