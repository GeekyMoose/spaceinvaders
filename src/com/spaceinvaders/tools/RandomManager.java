/*
 * Class :      RandomManager
 * Creation:    Jan 20, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;





/**
 * <h1>RandomManager</h1>
 * <p>
 * public class RandomManager
 * </p>
 * 
 * <p>
 * This class manage all random tools
 * </p>
 *
 * @author Constantin MASSON
 */
public abstract class RandomManager {
    
    /**
     * Get random number between pMin and pMax
     * @param pMin min value (included)
     * @param pMax max value (included)
     * @return int number random
     */
    public static int getRandomBetween(int pMin, int pMax){
        return (int)(Math.random() * (pMax+1-pMin))+ pMin;
    }
}
