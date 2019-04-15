/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Deep
 */
public class Main {

    static String suits;
    static int rank;
    public final static String gameName = "War Game";
    public static String PlayerName;

    public static void main(String[] args) {
        Game g1 = new GamePlay(gameName);
        GroupOfCards cardHand = new GroupOfCards(52);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        PlayerName = sc.next();
        Player player = new HumanPlayer(PlayerName, cardHand.gethPlayer());
        Player comPlayer = new ComputerPlayer("Computer", cardHand.getcPlayer());
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player);
        players.add(comPlayer);
        g1.setPlayers(players);

        System.out.println("Game Started.");
        int game = 0;
        int max = 24;
        while (game < 26) {
            int r1 = selectCard(players.get(0));
            System.out.println("::Computer Turn::");

            int r2 = comTurn(players.get(1), max);
            countScore(r1, r2);
            max--;
            game++;
        }
    }

    public static void countScore(int r1, int r2) {
        int player = 0;
        int complayer = 0;
        int draw = 0;
        for (int i = 0; i < 26; i++) {
            if (r1 < r2) {
                complayer++;
            } else if (r1 > r2) {
                player++;
            } else {
                draw++;
            }
        }
        if (player < complayer) {
            System.out.println("Player 1 Won.");
        } else if (player > complayer) {
            System.out.println("Computer Won.");
        } else {
            System.out.println("Match Draw.");
        }
    }

    public static int comTurn(Player comPlayer, int max) {
        int CardNo = (int) ((Math.random() * max) + 1);
        Card c = comPlayer.cards.get(CardNo);
        int r = c.getR();

        comPlayer.cards.remove(CardNo);
        return r;
    }

    public static boolean getSuitInput(String suits) {
        return suits.toLowerCase().charAt(0) == 'd' || suits.toLowerCase().charAt(0) == 'c' || suits.toLowerCase().charAt(0) == 's' || suits.toLowerCase().charAt(0) == 'h';
    }

    public static boolean getRankInput(int rank) {
        
        if (rank >= 1 && rank <= 13) {
            return true;
        } else {
            return false;
        }

    }

    public static int selectCard(Player player) {

        System.out.println("::Your Turn::");
        System.out.println(player.getPlayerID() + "'s Card: " + player.getCard());
        int i = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Suits: ");
        suits = sc.next();
        System.out.print("rank: ");
        rank = sc.nextInt();
        if (getRankInput(rank) && getSuitInput(suits)) {
            for (Card c : player.getCard()) {
                i++;
                if (suits.equalsIgnoreCase(c.getS().toString())) {
                    if (rank == c.getR()) {
                        player.cards.remove(i);
                        break;
                    }
                }
            }
        }
        return rank;
    }
}
