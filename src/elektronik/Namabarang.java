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
public class Namabarang {
    String nama;
        public Namabarang ( String n){
            nama=n;
        }
        
        public String getn(){
            return(nama);
        }
        
         public void display(){
            System.out.println("Nama Barang     : "+getn());
        }
}
