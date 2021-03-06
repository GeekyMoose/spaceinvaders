/*
 * Class :      Commons
 * Creation:    Jan 18, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.constants;

import java.awt.Dimension;





/**
 * <h1>Commons</h1>
 * <p>public interface Commons</p>
 *
 * @author Constantin MASSON
 */
public interface Commons {
    //**************************************************************************
    // Game constants
    //**************************************************************************
    public static final int NB_LIVES                        = 1;
    
    //Timer
    public static final int DELAY_GENERAL                   = 5;
    public static final int DELAY_PLAYER                    = 5;
    public static final int DELAY_ALIEN                     = 400;
    public static final int DELAY_SHOOT                     = 5;
    public static final int DELAY_EXPLOSION                 = 15;
    public static final int DELAY_SMOKE_FIRE_MISSILE        = 15;
    
    public static final int DELAY_BREAK                     = 1000;
    
    //Alien gap
    public static final int GAP_LEFT                        = 50;
    public static final int GAP_TOP                         = 50;
    public static final int GAP_BETWEEN_ALIENS              = 70;
    
    //Score
    public static final int SCORE_VALUE_ALIEN1              = 10;
    public static final int SCORE_VALUE_ALIEN2              = 20;
    public static final int SCORE_VALUE_ALIEN3              = 40;
    
    //Mode game
    public static final int MODE_WEAK                       = 5;
    public static final int MODE_NORMAL                     = 3;
    public static final int MODE_HARDCORE                   = 1;
    
    
    
    //**************************************************************************
    // Dimension elements
    //**************************************************************************
    //Weapons
    public static final int BOMB_WIDTH                      = 3;
    public static final int BOMB_HEIGHT                     = 10;
    public static final int LASER_WIDTH                     = 1;
    public static final int LASER_HEIGHT                    = 5;
    public static final int MISSILE_WIDTH                   = 3;
    public static final int MISSILE_HEIGHT                  = 10;
    
    //ALien and player size
    public static final int ALIEN1_WIDTH                    = 30;
    public static final int ALIEN1_HEIGHT                   = 30;
    public static final int ALIEN2_WIDTH                    = 50;
    public static final int ALIEN2_HEIGHT                   = 33;
    public static final int ALIEN3_WIDTH                    = 50;
    public static final int ALIEN3_HEIGHT                   = 33;
    public static final int PLAYER_WIDTH                    = 50;
    public static final int PLAYER_HEIGHT                   = 33;
    
    
    //Dynamics elements dimension (Explosion)
    public static final int EXPLOSION_ALIEN_WIDTH           = 40;
    public static final int EXPLOSION_ALIEN_HEIGHT          = 32;
    
    //Game dimension
    public static final int GAME_WIDTH                      = 950;
    public static final int GAME_HEIGHT                     = 600;
    public static final int GROUND                          = GAME_HEIGHT-20;
    public static final int DEFAULT_PLAYER_POS_X            = 100;
    public static final int DEFAULT_PLAYER_POS_Y            = GROUND-PLAYER_HEIGHT-3;
    
    public static final int MIN_PLAYER_POSITION             = PLAYER_WIDTH+5;
    public static final int MAX_PLAYER_POSITION             = GAME_WIDTH-(PLAYER_WIDTH+5);
    
    
    
    //**************************************************************************
    // View - dimension constants
    //**************************************************************************
    public static final Dimension   DIM_ICON_TOOLS          = new Dimension(40,40);
    public static final Dimension   DIM_FRAME_MIN           = new Dimension(450,250);
    public static final Dimension   DIM_FRAME               = new Dimension(650,450);
    public static final Dimension   DIM_GAME                = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    
    
    
    //**************************************************************************
    // Label - Font constants
    //**************************************************************************
    public static final int         LEFT_LABEL_SIZE         = 20;
    public static final int         LEFT_LABEL_TITLE_SIZE   = 25;
    public static final int         TOP_LABEL_FONT_SIZE     = 10;
    public static final int         FONT_SCORE_SIZE         = 25;
    
    
    
    //**************************************************************************
    // Paths constants for image
    //**************************************************************************
    public static final String PATH_IMG_EXPLOSION   = "data/img/explosions/miniatures/";
    public static final String PATH_IMG_SMOKE       = "data/img/smoke/miniatures/";
    public static final String PATH_IMG_ICON_TOOLS  = "data/img/icons/miniatures/";
    public static final String PATH_PLAYER_IMG      = "data/img/player/miniatures/";
    public static final String PATH_ALIENS_IMG      = "data/img/aliens/miniatures/";
    public static final String IMG_WEAPONS          = "data/img/weapons/miniatures/";
    public static final String IMG_THEME            = "data/img/theme/miniatures/";
    
    
    
    //**************************************************************************
    // Paths constants for sounds
    //**************************************************************************
    public static final String PATH_SOUNDS          = "/sounds/";
    
}
