package ejercicios02;
public class SandwichFilling {
    private String llenado;
    private Integer calorias;
    public  SandwichFilling(String tipollenado, Integer calor){
        this.llenado=tipollenado;
        this.calorias=calor;
    }
    public String getLlenado() {
        return llenado;
    }
    public Integer getCalorias() {
        return calorias;
    }
    
}