/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project.Models;

import ca.sheridancollege.project.Models.Card;
import java.util.List;

/**
 * 
 * @author Deep
 */
public class ComputerPlayer extends Player{

    public ComputerPlayer(String name, List<Card> card) {
        super(name,card);
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
