/*
 * Class :      ViewApplication
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.controllers.ControllerGame;
import com.spaceinvaders.controllers.ControllerToolsBar;
import com.spaceinvaders.models.ModelGame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 * <h1>ViewApplication</h1>
 * <p>
 public class ViewApplication<br/>
 * extends JFrame<br/>
 * implements Commons
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewApplication extends JFrame implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     JPanel                  mainContent;
    private     JPanel                  panTop;
    private     JPanel                  panLeft;
    private     JPanel                  panCenter;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Start the application
     * Create the JPanel and initialize the listener
     * Also call for toolBar function and left Panel creation
     */
    public ViewApplication(){
        this.setTitle("Mini games launcher");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setMinimumSize(DIM_FRAME_MIN);
        this.setAlwaysOnTop(false);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.initComponents();
    }
    
    
    /*
     * Initialize JPanel components used by the program
     */
    private void initComponents(){
        ModelGame           m   = new ModelGame();
        ControllerGame      c   = new ControllerGame(m);
        ViewGame            v   = new ViewGame(c);
        
        ControllerToolsBar  c2  = new ControllerToolsBar(m);
        
        this.mainContent        = new JPanel();
        this.panTop             = new ViewToolsBar(c2);
        this.panLeft            = new ViewLeftPanel();
        this.panCenter          = v;
        
        this.mainContent.setLayout(new BorderLayout());
        this.mainContent.setBackground(Color.BLACK);
        
        this.mainContent.add(this.panTop, BorderLayout.NORTH);
        this.mainContent.add(this.panLeft, BorderLayout.WEST);
        this.mainContent.add(this.panCenter, BorderLayout.CENTER);
        
        this.setContentPane(this.mainContent);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
