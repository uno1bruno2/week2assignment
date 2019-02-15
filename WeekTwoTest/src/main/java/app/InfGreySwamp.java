package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfGreySwamp {
	
	public void play() {

		int[] xaxis = { 3, 4, -2 , 0 , -5 , 8 , 7 , -3 };
		int[] yaxis = { 2, -1, -2 , 0 , 5 , 0 , -1 , -4 };
		
		List<Integer> xposition = new ArrayList<Integer>();
		List<Integer> yposition = new ArrayList<Integer>();
		String[] swamps = {
			"You've hit your first swamp. This could lead "
			+ "you to get your intended light. Do you want "
			+ "to take the chance and jump in? Type yes or no. "
			+ "Remember, if you jump in and it is not the light "
			+ "then you lose!",
			"You've hit your second swamp. This could lead "
			+ "you to get your intended light. Do you want "
			+ "to take the chance and jump in? Type yes or no. "
			+ "Remember, if you jump in and it is not the light "
			+ "then you lose!",
			"You've hit your third swamp. This could lead "
			+ "you to get your intended light. Do you want "
			+ "to take the chance and jump in? Type yes or no. "
			+ "Remember, if you jump in and it is not the light "
			+ "then you lose!",
			"You've hit your fourth swamp. This could lead "
			+ "you to get your intended light. Do you want "
			+ "to take the chance and jump in? Type yes or no. "
			+ "Remember, if you jump in and it is not the light "
			+ "then you lose!",
			"You've hit your fifth swamp. This could lead "
			+ "you to get your intended light. Do you want "
			+ "to take the chance and jump in? Type yes or no. "
			+ "Remember, if you jump in and it is not the light "
			+ "then you lose!",
			"You've hit your sixth swamp. This could lead "
			+ "you to get your intended light. Do you want "
			+ "to take the chance and jump in? Type yes or no. "
			+ "Remember, if you jump in and it is not the light "
			+ "then you lose!",
			"You've hit your seventh swamp. This could lead "
			+ "you to get your intended light. Do you want "
			+ "to take the chance and jump in? Type yes or no. "
			+ "Remember, if you jump in and it is not the light "
			+ "then you lose!",
			"You've hit your eighth swamp. This could lead "
			+ "you to get your intended light. Do you want "
			+ "to take the chance and jump in? Type yes or no. "
			+ "Remember, if you jump in and it is not the light "
			+ "then you lose!"
		};
		xposition.add(0);
		yposition.add(0);
		
		
		Treasure tres = new Treasure();
		Compass c = new Compass();

		int i = 0;
		int j = 0;

		c.setXaxis(xaxis);
		c.setYaxis(yaxis);
		c.setXposition(xposition);
		c.setYposition(yposition);
		
		String s = "  ";
		
		Scanner sc = new Scanner(System.in);

		System.out.println("You enter a world filled with grey possibility!");
		System.out.println("Everyone in this new world is full of optimism");
		System.out.println("and enjoyment but you see it as a dark lifeless ");
		System.out.println("environment.");
		System.out.println("However, ");
		System.out.println(" ");
		System.out.println("To quit the game press q");
		System.out.println(" ");
		
		while(true) {
			
			if (c.mainread(j, i, s) == -2) {	
				if(j == 8) {
					System.out.println("Game has been exited. Thanks for playing!");
					break;
				}
				System.out.println(swamps[j]);
				String swamp = sc.nextLine();
				if ("yes".equals(swamp.toLowerCase())) {
					if (tres.isThere(j)) {
						System.out.println("You have found the light. Congratulations!");
						System.out.println("You have given a new found happyness to this");
						System.out.println("world. Thanks for playing");
						break;
					} else {
						System.out.println("You've entered the wrong swamp unfortunately");
						System.out.println("and the game has exited. Thanks for playing!");
						break;
					}
				} else {
					System.out.println("You've decided not to go in this swamp.");
					System.out.println("This means you can make your way to the next swamp.");
					System.out.println("");
				}
			}
			
			System.out.println("Your compass says the next swamp is " + c.mainread(j, i, s) + " meters. Where are you going now?");
			String sOld = s;
			s = sc.nextLine();
			int exit = 0;
						
			if(c.mainread(j, i, s) == -1) {
				while(true) {
					System.out.println("Invalid input, try again. If you type an invalid input " + (2 - exit) + " times, the game will be exited");
					exit++;
					System.out.println("Your compass says the next swamp is " + c.mainread(j, i, sOld) + " meters. Where are you going now?");
					s = sc.nextLine();
					
					if (c.mainread(j, i, s) != -1) {
						break;
					} else if (exit > 2) {
						break;
					}
				}
			}
			
			if ("q".equals(s.toLowerCase())) {
				System.out.println("You've exited the game. Thanks for playing!");
				break;
			} else if (exit > 2) {
				System.out.println("Game has been exited. Thanks for playing!");
				break;
			}
			
			
			
			
			i++;
			
			
			
		}
		
		
		
	}

}
