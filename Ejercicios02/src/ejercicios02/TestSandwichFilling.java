package ejercicios02;
public class TestSandwichFilling {
    public static void main(String[] args) {
        SandwichFilling orden1=new SandwichFilling("jamon",30);
        System.out.println("Tipo de llenado: "+orden1.getLlenado()+" calorias por porcion: "+orden1.getCalorias());
        SandwichFilling orden2=new SandwichFilling("quesillo",10);
        System.out.println("Tipo de llenado: "+orden2.getLlenado()+" calorias por porcion: "+orden2.getCalorias());
        SandwichFilling comida3=new SandwichFilling("milanesa con quesillo",50);
        System.out.println("Tipo de llenado: "+comida3.getLlenado()+" Calorias por porcion: "+comida3.getCalorias());
    }
}