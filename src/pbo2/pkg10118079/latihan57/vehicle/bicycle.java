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
public class bicycle extends vehicle{
    private int mygearcount;

    public void bicycle() {
        System.out.println("Bicycle");
        System.out.println("Brand : "+getMybrand());
        System.out.println("Model : "+getMymodel());
        System.out.println("Jumlah Gear : "+mygearcount);
    }

    public int getMygearcount() {
        
        return mygearcount;
    }

    public void setMygearcount(int mygearcount) {
        this.mygearcount = mygearcount;
    }
    
    
    
}
