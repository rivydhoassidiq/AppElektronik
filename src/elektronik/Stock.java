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
public class Stock {
    String stock;
        public Stock ( String s){
            stock=s;
        }
        
        public String gets(){
            return ( stock );
        }
        
         public void display(){
            System.out.println("Stock Barang     : "+gets());
        }
}
