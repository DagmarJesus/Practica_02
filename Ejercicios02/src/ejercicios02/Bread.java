/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios02;
public class Bread {
    private String tipodepan;
    private Integer Rodaja;
   
    public final static String Lema="El personal de la vida";
     public Bread(String tipe,Integer rodaja){
         this.tipodepan=tipe;
         this.Rodaja=rodaja;
     }
      public String getTipodepan() {
        return tipodepan;
    }
    public Integer getRodaja() {
        return Rodaja;
    }
}