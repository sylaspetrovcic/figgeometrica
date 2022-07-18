
public class Principal  {

		
	public static void main(String[] args) {
		AreaQuadrado a = new AreaQuadrado();
		a.lado = 3;
		System.out.println("A área do quadrado é: " +a.area());
		
		AreaTriangulo b = new AreaTriangulo();
		b.lado = 3;
		b.altura=4;
		System.out.println("A área do triângulo é : " + b.area());
		
		AreaCirculo c = new AreaCirculo();
		c.raio=3.2;
		System.out.println(" A área do circulo é: " + c.area());
		

	}

}
