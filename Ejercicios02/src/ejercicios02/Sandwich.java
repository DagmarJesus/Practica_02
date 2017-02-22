package ejercicios02;
public class Sandwich {
   private String llenos;
   private String llenoderrellenos;
   private Integer calorias;
   
   public String getRellenito() {
        return llenos;
    }
    public String getRellenote() {
        return llenoderrellenos;
    }
    public Integer getCalorias() {
        return calorias;
    }
    public Sandwich(Sandwich a, Sandwich b){
        llenos=a.llenos;
        llenoderrellenos=a.llenoderrellenos;
        calorias=a.calorias;
        llenos=b.llenos;
        llenoderrellenos=b.llenoderrellenos;
        calorias=b.calorias;   
    }
     public Sandwich(String relleno,String relleno2,Integer calorias){
        this.llenos=relleno;
        this.llenoderrellenos=relleno2;
        this.calorias=calorias*2;
    }
 
    
}