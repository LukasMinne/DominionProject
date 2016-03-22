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
public class TreasureCards {
    private int value;
    private int cost;
    
    public TreasureCards(String TreasureCard){
        switch (TreasureCard){
            case "copper":  copper();
            break;
            case "silver":  silver();
            break;
            case "gold":    gold();
        }
    }
    public void copper(){
        this.cost = 0;
        this.value = 1;
    }
     public void silver(){
        this.cost = 3;
        this.value = 2;
    }
    public void gold(){
        this.cost = 6;
        this.value = 3;
    }
    public int getValue(){
        return this.value;
    }
    public int getCost(){
        return this.cost;
    }    
}
