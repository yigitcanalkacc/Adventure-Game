package Main;

import java.util.Random;
import java.util.Scanner;

public class BattleLoc {
	
	Scanner scanner = new Scanner(System.in);
	Player player;
	BattleGame battleGame;
	
	
	public BattleLoc(Player name) {
		this.player = name;
	

	}
	
	public int RandomObstacle () {
		Random random = new Random();
		
		
		return random.nextInt(4) + 1  ;
	}
	
	public void runbattleLoc () {
		
		System.out.println("Savaş Arenasına Hoşgeldin. "+player.getName());
		System.out.println("Kendine çok güveniyorsun sanırım.");
		System.out.println("Burada Canavarlar ile karşılaşabileceğini biliyorsundur umarım.. !!");
		System.out.println("Ozaman seç bakalım.");
		System.out.println(" 1- Mağara --- Zombilerle karşılaşabilirsin.. ");
		System.out.println(" 2- Orman  --- Kan Emici Vampirler olabilir.. ");
		System.out.println(" 3- Nehir  --- Ayılara dikkat etmelisin.");
		System.out.print("Seçimin = ");
		int select = scanner.nextInt();
		
			switch (select) {
			case 1:
				System.out.println("Burada " +RandomObstacle() + " Zombi Yaşıyor.");
				Zombie zombie = new Zombie();
				battleGame = new BattleGame(player, zombie, player);
				battleGame.battleStats();
				break;
			case 2:
				Vampire vampire = new Vampire();
				battleGame = new BattleGame(player, vampire, player);
				System.out.println("Burada " +RandomObstacle() + " Vampir Yaşıyor.");
				battleGame.battleStats();
				break;
			case 3:
				Bear bear = new Bear();
				battleGame = new BattleGame(player, bear, player);
				System.out.println("Burada " +RandomObstacle() + " Ayı Yaşıyor.");
				battleGame.battleStats();
				break;
			}
		
			System.out.println("-------------------------------------");
			
			System.out.println("1-Savaş yada 2-Kaç");
			System.out.print("Seçiminiz = ");
			int savkac = scanner.nextInt();
			
			switch (savkac) {
			case 1:
				System.out.println("İşte savaş başlıyor..");
				battleGame.battleStart();
				break;
			case 2:
				System.out.println("Ucuz atlattın. Şimdi ne yapacaksın ? ");
				break;

			}
			
			System.out.println("-------------------------------------");
		
	}

}