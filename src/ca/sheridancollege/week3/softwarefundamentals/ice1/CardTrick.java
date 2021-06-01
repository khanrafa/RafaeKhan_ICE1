/*
 * Rafae Khan 
 * ICE 1 Exercise
 * Student Number: 991603862
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Sivagama
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13) + 1);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 3) + 1]);

            magicHand[i] = c;

            System.out.println(c.getSuit() + " " + c.getValue());
        }
        //insert code to ask the user for Card value and suit, create their card
        int value;
        String suit;

        System.out.println("Enter Suit");
        suit = input.nextLine();

        System.out.println("Enter Value");
        value = input.nextInt();

        boolean result = false;

        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            if (value == magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit())) {

                result = true;
            } else {
                result = false;
            }
        }

        //Then report the result here
        if (result == true) {
            System.out.println("You guessed right!");
        } else {
            System.out.println("Your guess was wrong");
        }

    }

}
