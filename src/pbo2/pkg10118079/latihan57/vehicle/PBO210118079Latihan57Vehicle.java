/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan57.vehicle;

/**
 *
 * @author User
 */
public class PBO210118079Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bicycle hasil = new bicycle();
        hasil.setMybrand("Trek Bike");
        hasil.setMymodel("7.4");
        hasil.setMygearcount((int) 23);
        hasil.bicycle();
        System.out.println("");
        skateboard hasil1 = new skateboard();
        hasil1.setMybrand("Ally Skate");
        hasil1.setMymodel("rocket");
        hasil1.setMyboardlength((double)54.5);
        hasil1.skateboard();
    }
    
}
