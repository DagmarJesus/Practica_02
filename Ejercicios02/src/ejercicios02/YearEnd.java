package ejercicios02;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class YearEnd {
    public static void main(String[] args) {
        int DiaActual,diasenaño;
        GregorianCalendar hoy = new GregorianCalendar();
	DiaActual = (hoy.get(Calendar.DAY_OF_YEAR) + 1);
        System.out.println("Hoy es " + DiaActual + "dia del año.");
	diasenaño = hoy.getMaximum(Calendar.DAY_OF_YEAR);
	System.out.println("Queda " + (diasenaño - DiaActual) + " dias en el baño");
    }
} 
