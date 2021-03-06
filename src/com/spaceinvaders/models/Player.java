/*
 * Class :      Player
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.MoveLivingPlayer;
import com.spaceinvaders.behaviors.ShootMissile;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;





/**
 * <h1>Player</h1>
 * <p>
 public class Player<br/>
 extends Living
 </p>
 *
 * @author Constantin MASSON
 */
public class Player extends Living{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     int             nbLife;
    private     final Point     barrel;//Extremity canon position from the Player center
    private     final Image     img1;
    private     final Image     img2;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Player at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     * @param pMap
     * @param pNbLives
     */
    public Player(int pX, int pY, Map pMap, int pNbLives){
        super(pX, pY, pMap);
        this.barrel         = new Point(0, -(PLAYER_HEIGHT/2));
        this.shootType      = new ShootMissile(((Living)this), barrel, 1); //Ammo = 1
        this.moveType       = new MoveLivingPlayer(this);
        this.width          = PLAYER_WIDTH;
        this.height         = PLAYER_HEIGHT;
        
        ImageIcon i         = new ImageIcon(PATH_PLAYER_IMG+"player.png");
        ImageIcon ii        = new ImageIcon(PATH_PLAYER_IMG+"playerHurt.png");
        this.img1           = i.getImage();
        this.img2           = ii.getImage();
        this.img            = this.img1;
        
        this.nbLife         = pNbLives;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Earn one more life
     */
    public void earnOneLife(){
        this.nbLife += 1;
    }
    
    /**
     * Lost one life
     * if nb lives equals 0, this player will be dead
     */
    public void lostOneLife(){
        this.nbLife--;
        this.img = this.img2;
        if(this.nbLife==0){
            this.isAlive = false;
        }
    }
    
    
    /**
     * Reload weapon (With one ammo)
     * @return 
     */
    public boolean reload(){
        return this.shootType.reload(1);
    }
    
    public void resetImg(){
        this.img = this.img1;
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    public int getNbLife(){
        return this.nbLife;
    }
}
