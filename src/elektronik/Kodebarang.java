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

public class Kodebarang {
    String kode;
        public Kodebarang ( String k){
        kode=k;
        }
        
        public String getk(){
            return (kode);
        }
        
        public void display(){
            System.out.println("Kode Barang     : "+getk());
        }
}   
