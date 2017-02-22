package ejercicios02;
public class TestSandwich {
    public static void main(String[] args) {
        Sandwich orden1 = new Sandwich("lechuga", "queso", 12);
        System.out.println(orden1.getRellenito());
        System.out.println(orden1.getRellenote());
        System.out.println(orden1.getCalorias());
        Sandwich orden2 = new Sandwich("pasta", "salami con jamon serrano", 10);
        System.out.println(orden2.getRellenito());
        System.out.println(orden2.getRellenote());
        System.out.println(orden2.getCalorias());
        Sandwich orden3 = new Sandwich(orden1, orden2);
    }
}