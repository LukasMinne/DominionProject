/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmeerproject;

/**
 *
 * @author laurens
 */
public class VictoryCards {
    private int value;
    private int cost;
    
    public VictoryCards(String victoryCard){
        switch (victoryCard){
            case "estate":  estate();
            break;
            case "duchy":  duchy();
            break;
            case "province":    province();
        }
    }
    public void estate(){
        this.value = 1;
        this.cost = 2;
    }
    public void duchy(){
        this.value = 3;
        this.cost = 5;
    }
    public void province(){
        this.value = 6;
        this.cost = 8;
    }
    public int getValue(){
        return this.value;
    }
    public int getCost(){
        return this.cost;
    }
}
