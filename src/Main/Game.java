package Main;

import java.util.Scanner;

public class Game {
	
	Scanner scan = new Scanner(System.in);
	
	String player;
	String location;
	
	
	
	
	public void start () {
		System.out.println("Macera oyununa hoşgeldiniz.");
		System.out.print("Lütfen isminizi giriniz = ");
		String playerName = scan.next();
		Player player = new Player(playerName);
		System.out.println("Merhaba "+playerName + " Savaş diyarına Hoşgeldin.");
		System.out.println("Burada hayatta kalman için savaşman gerek.");
		System.out.println("Canavarlarla savaşman için önce karakterini seçmen lazım.");
		player.selectChar();
		player.selectLocation(player);
		
	}
	

}
