/*
 * Class :      Alien
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import java.awt.Image;
import javax.swing.ImageIcon;





/**
 * <h1>Alien</h1>
 * <p>
 * public class Alien<br/>
 extends Living
 </p>
 *
 * @author Constantin MASSON
 */
public abstract class Alien extends Living{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    protected   Image   img1;
    protected   Image   img2;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Alien (type 1) at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Alien(int pX, int pY){
        super(pX, pY);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        if(this.img==this.img1){
            this.img    = this.img2;
        }
        else{
            this.img    = this.img1;
        }
        super.move();
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
