package Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class CardShuffle {
	/*
	 * initializing Arraylist 
	 */
	ArrayList<String> cards=new ArrayList<String>();
	ArrayList<String> temp=new ArrayList<String>();
	
	Scanner sc=new Scanner(System.in);
	
	/*
	 * method for deck of cards
	 */
	public void deckOfCards() {
		
		String[] suit = {"Clubs","Diamonds","Hearts","Spades"};
		String[] rank= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int numOfCards=suit.length*rank.length;
		
		System.out.println("Number of cards in the deck ="+numOfCards+"\n");
		
		for(int i=0;i<rank.length;i++) {
			for(int j=0;j<suit.length;j++) {
				cards.add(rank[i] +" of "+ suit[j]);
			}
		}
		
		for(String sets : cards) {
			System.out.println("cards in Deck ="+sets);
		}		
	}
	
	/*
	 * method for no. of players play and shuffle the cards
	 */
	public void noOfPlayers() {
		
		System.out.println("/nEnter the Number of Players:");
		int player = sc.nextInt();
		int cardDist=9;
		
		if(player >=2 && player<=4) {
			while(!cards.isEmpty()) {
				int n=(int)Math.random()*cards.size();
				temp.add(cards.get(n));
				cards.remove(n);
			}
			cards=temp;
			
			for(int i =1;i<=player;i++) {
				System.out.println("\nplayer "+(i) +" gets...\n");
				for(int j=0;j<cardDist;j++) {
					System.out.println("\n"+cards.get(i+j*player));
				}
			}
		}else {
			System.out.println("Only 4 Players is Allowed... Please Enter the players in range");
			noOfPlayers();
		}
	}
}
