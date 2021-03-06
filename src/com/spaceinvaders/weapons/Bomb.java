/*
 * Class :      Bomb
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.behaviors.FireSmokeBomb;
import com.spaceinvaders.behaviors.MoveShotBomb;
import com.spaceinvaders.models.Living;
import com.spaceinvaders.models.GameModel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;





/**
 * <h1>Bomb</h1>
 * <p>
 public class Bomb<br/>
 * extends Projectile
 * </p>
 *
 * @author Constantin MASSON
 */
public class Bomb extends Projectile{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new bomb
     * @param pX        x coordinate
     * @param pY        y coordinate
     * @param pOwner    owner
     */
    public Bomb(int pX, int pY, Living pOwner){
        super(pX, pY, MISSILE_WIDTH, MISSILE_WIDTH, pOwner);
        ImageIcon i         = new ImageIcon(IMG_WEAPONS+"bomb.png");
        this.img            = i.getImage();
        this.moveShootType  = new MoveShotBomb(this);
        this.fireSmokeType  = new FireSmokeBomb();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public Object checkCollision(GameModel map){
        Rectangle r1 = this.getBounds();
        return r1.intersects(map.getPlayer().getBounds()) ? map.getPlayer() : null;
    }
}
