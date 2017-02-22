
package ejercicios02;
import static ejercicios02.Bread.Lema;
public class TestBread {
    public static void main(String[] args) {
        Bread Pansito = new Bread("Centeno", 20);
        System.out.println("Lema: " + Lema + " tipo de pan: " + Pansito.getTipodepan() + " calorias por rodaja: " + Pansito.getRodaja());
        Bread Pansito2 = new Bread("Granola", 40);
        System.out.println("Lema: " + Lema + " tipo de pan: " + Pansito2.getTipodepan() + " calorias por rodaja: " + Pansito2.getRodaja());
        Bread Pansito3 = new Bread("Avena", 50);
        System.out.println("Lema: " + Lema + " tipo de pan: " + Pansito3.getTipodepan() + " calorias por rodaja: " + Pansito3.getRodaja());
    }
}
