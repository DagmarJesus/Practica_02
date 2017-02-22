package ejercicios02;
import java.util.Scanner;
public class BloodData {
    private String Sangretipo;
    private String factr;
    
    public void setSangretipo(String s){
        s=Sangretipo;
    }
    public String getSangretipo(){
        return Sangretipo;
    }
    public void setfactor(String F){
        F=factr;
    }
    public String getfactor(){
        return factr;
    } 
    public BloodData(String s, String F){
        Scanner teclado= new Scanner(System.in);
        Sangretipo=s;
        factr=F;
        System.out.println("¿Qué tipo de sangre tiens? (O, A, B, AB)");
        Sangretipo=teclado.next();
        System.out.println("¿Qué factor? (+, -)");
        factr=teclado.next();
        System.out.println(Sangretipo+" "+factr);
    }
      public BloodData(){
        Sangretipo="O";
        factr="+";
        System.out.println(Sangretipo+" "+factr);
    }  
}
