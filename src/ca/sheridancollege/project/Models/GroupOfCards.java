/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project.Models;

import ca.sheridancollege.project.Models.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards = new ArrayList<Card>();
    private List<Card> hPlayer = new ArrayList<Card>();
    private List<Card> cPlayer = new ArrayList<Card>();

    private int size;//the size of the grouping

    public GroupOfCards(int givenSize) {
        size = givenSize;
        generateHand();
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> showCards() {
        return cards;
    }

    public List<Card> gethPlayer() {
        return hPlayer;
    }

    public void sethPlayer(List<Card> hPlayer) {
        this.hPlayer = hPlayer;
    }

    public List<Card> getcPlayer() {
        return cPlayer;
    }

    public void setcPlayer(List<Card> cPlayer) {
        this.cPlayer = cPlayer;
    }

    public void generateHand() {
        int countCards = 0;
        for (Card.suits s : Card.suits.values()) {
            for (int i : Card.ranks) {
                cards.add(new Card(s, i));
                countCards++;
            }
        }
        shuffle();
        hPlayer.addAll(cards.subList(0, (size/2)-1));
        cPlayer.addAll(cards.subList(size/2, size-1));
    }
//    public ArrayList<Card> distributeHand(Player player){
//        
//    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}//end class
