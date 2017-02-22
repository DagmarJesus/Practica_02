package ejercicios02;
public class TestCircle {
    public static void main(String[] args) {
        Circle circulo = new Circle();
	circulo.setRadio();
	System.out.println("Radio del circulo:  " + circulo.getRadio());
	System.out.println("Area del circulo:  " + circulo.getArea());
	System.out.println("Diametro del Circulo: " + circulo.getDiametro());
    }
}