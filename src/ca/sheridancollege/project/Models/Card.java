/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project.Models;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye, 2018
 */
public class Card {

    private final suits s;
    private final int r;

    //default modifier for child classes
    enum suits {
        Spades(1), Hearts(2), Diamonds(3), Clubs(4);
        public int value;

        suits(int value) {
            this.value = value;
        }
    };
    final static int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public suits getS() {
        return s;
    }

    public int getR() {
        return r;
    }

    public static int[] getRanks() {
        return ranks;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    Card(suits s, int rank) {
        this.s = s;
        this.r = rank;
    }

    @Override
    public String toString() {
        return "Card{" + "s=" + s + ", r=" + r + '}';
    }

}
