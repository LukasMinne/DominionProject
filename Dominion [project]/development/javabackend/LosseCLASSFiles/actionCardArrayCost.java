/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominionproject;

/**
 *
 * @author Lukas
 */
public class actionCardArrayCost 
{

    private String[] name;
    private String cardName;
    private int cost;
    /**
     * @param args the command line arguments
     */

    public String[] actionCard()
    {
        name[0] = "Adventurer";
        name[1] = "Cellar";
        name[2] = "Chapel"; 
        name[3] = "Moat" ;
        name[4] = "Chancellor";
        name[5] = "Village";
        name[6] = "Woodcutter" ;
        name[7] = "Workshop" ;
        name[8] = "Bureaucrat" ;
        name[9] = "Feast";
        name[10] = "Gardens" ;
        name[11] = "Militia";
        name[12] = "Moneylender";
        name[13] = "Remodel";
        name[14] = "Smithy";
        name[15] = "Spy";
        name[16] = "Thief";
        name[17] = "Throne Room";
        name[18] = "Council Room";
        name[19] = "Festival";
        name[20] = "Laboratory";
        name[21] = "Library";
        name[22] = "Market";
        name[23] = "Mine";
        name[24] = "Witch";  
        
        return name;
    }
    
    public void playActionCard()
    {
        int cost = this.cost;
        String cardName = this.cardName;
        String type = "action";
        switch(name)
        {
            case (0):
                cost = 6;
                cardName = "Adventurer";
                break;
            case (1):
                cost = 2;
                cardName = "Cellar";
                break;
            case (2):
                cost = 2;
                cardName = "Chapel";
                break;
            case (3):
                cost = 2;
                cardName = "Moat";
                break;
            case (4):
                cost = 3;
                cardName = "Chancellor";
                break;
            case (5):
                cost = 3;
                cardName = "Village";
                break;
            case (6):
                cost = 3;
                cardName = "Woodcutter";
                break;
            case (7):
                cost = 3;
                cardName = "Workshop";
                break;
            case (8):
                cost = 4;
                cardName = "Bureaucrat";
                break;
            case (9):
                cost = 4;
                cardName = "Feast";
                break;
            case (10):
                cost = 4;
                cardName = "Gardens";
                break;
            case (11):
                cost = 4;
                cardName = "Militia";
                break;
            case (12):
                cost = 4;
                cardName = "Moneylender";
                break;
            case (13):
                cost = 4;
                cardName = "Remodel";
                break;
            case (14):
                cost = 4;
                cardName = "Smithy";
                break;
            case (15):
                cost = 4;
                cardName = "Spy";
                break;
            case (16):
                cost = 4;
                cardName = "Thief";
                break;
            case (17):
                cost = 4;
                cardName = "Throne Room";
                break;
            case (18):
                cost = 5;
                cardName = "Council Room";
                break;
            case (19):
                cost = 5;
                cardName = "Festival";
                break;
            case (20):
                cost = 5;
                cardName = "Laboratory";
                break;              
            case (21):
                cost = 5;
                cardName = "Library";
                break;
            case (22):
                cost = 5;
                cardName = "Market";
                break;
            case (23):
                cost = 5;
                cardName = "Mine";
                break;
            case (24):
                cost = 5;
                cardName = "Witch";
                break;
        }
    }
}

