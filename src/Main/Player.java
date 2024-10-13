package Main;

import java.util.Scanner;

public class Player {
	
	Scanner scan = new Scanner(System.in);
	
	
	

	private int damage;
	private int health;
	private int money;
	private int miss;
	
	private String name;
	private String charName;
	
	public Player(String Name) {
		this.name = Name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}
	
	public void selectChar () {
		int i = 0;
		
		System.out.println("Karakterler");
		System.out.println("---------------------");
		System.out.println("Lütfen bir karakter seçiniz..");
		System.out.println(" 1-Samuray \n 2-Şövalye \n 3-Okçu");
		
		GameChar[] charList = {new Samurai(), new Knight(), new Archer()};
		
		for (GameChar gameChar : charList) {
			System.out.println(" Karakter: " + gameChar.getName() 
			+ "\t Hasar " + gameChar.getDamage()
			+ "\t Sağlık " + gameChar.getHealth()
			+ "\t Para " + gameChar.getMoney() );
		}
		
		System.out.println("-----------------------");
		System.out.print("Seçiminiz = ");
		int selectChar = scan.nextInt();
		
		switch(selectChar) {
		case 1:
			initPlayer(new Samurai());
			break;
		case 2:
			initPlayer(new Knight());
			break;
		case 3:
			initPlayer(new Archer());
			break;
		}
		System.out.println("Harika işte karakterini seçtin.");
		System.out.println("Seçtiğiniz Karakter : "+this.getCharName() +
						   "\t Hasar :" 	+this.getDamage() 		   +
						   "\t Sağlık :"	+this.getHealth()		   +
						   "\t Para :"    +this.getMoney()
							
				);
		System.out.println("------------------------------");
		System.out.println("Şimdi Gitmek istediğin yeri seç.");
		
		
	}
	
	public int getMiss() {
		return miss;
	}

	public void setMiss(int miss) {
		this.miss = miss;
	}

	public void initPlayer(GameChar gameChar) {
		this.setCharName(gameChar.getName());
		this.setHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
		this.setDamage(gameChar.getDamage());
	}
	
	
	
	public void selectLocation (Player player) {
		Location location = new Location(player);
		characterInfo characterInfo = new characterInfo(player);
		BattleLoc battleLoc = new BattleLoc(player);
		
			while (player.health > 0) {
		System.out.println("Nereye gitmek istersiniz ?");
		System.out.println(" 1-Güvenli Bölge \n 2-Mağaza \n 3-Karakter Bilgileri \n 4-Arena");
		System.out.print("Lütfen seçiniz = ");
		
		int selectLoc = scan.nextInt();
		System.out.println("-----------------------------");
			switch (selectLoc) {
			case 1:
				location.safeHouse();
				break;
			case 2:
				location.market();
				return;
			case 3:
				characterInfo.charInfo();
				break;
			case 4:
				battleLoc.runbattleLoc();
				break;
			}
			
			}
	}
	
	
	
	
	
	
}
