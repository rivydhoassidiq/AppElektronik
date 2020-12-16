/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elektronik;

/**
 *
 * @author Pido
 */
public class Hargabarang {
    String harga;
        public Hargabarang ( String h){
            harga=h;
        }
        
        public String geth(){
            return(harga);
        }
        
         public void display(){
            System.out.println("Harga Barang     : "+geth());
        }
}
