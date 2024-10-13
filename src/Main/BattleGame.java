package Main;

public class BattleGame extends BattleLoc {
	
	BattleLoc battleLoc = new BattleLoc(null);
	Obstacle obstacle;
	Player player;
	characterInfo characterInfo;

	public BattleGame(Player name, Obstacle obstacle, Player player) {
		super(name);
		this.player = player;
		this.obstacle = obstacle;
	}
	
	
	
	public void battleStats () {
	System.out.println("Sizin Canınız = "+player.getHealth());
	System.out.println(obstacle.getObsName() + " Can Toplamı = " + (obstacle.getHealth() * battleLoc.RandomObstacle()));
	}
	

	
	public void battleStart () {
			while (true) {
		if (obstacle.getHealth() > 0 && player.getHealth() > 0 ) {
			System.out.println("İkinizden birisi sağ kalacak..");
			System.out.println("Savaş başladı.");
			System.out.println("-------------");
			
			obstacle.setHealth(obstacle.getHealth() - player.getDamage());
			
				if (obstacle.getHealth() > 0 ) {
					System.out.println("Canavara vurdun ama oda sana vurdu.");
					
					player.setHealth((player.getHealth() + player.getMiss()) - obstacle.getDamage());
				} else {
					System.out.println("Canavarı Öldürdün...");
					System.out.println("İşte Ödülün..");
					System.out.println("Biraz can kazandın ve biraz para aldın.");
					player.setHealth(player.getHealth() + 5);
					player.setMoney(player.getMoney() + 25);
					
					characterInfo = new characterInfo(player);
					characterInfo.charInfo();
					return;
				}
				
				if (player.getHealth() < 0 ) {
					System.out.println("Olamaz ağır yaralandın...");
					System.out.println("Hastaneye gitmen gerekiyor...");
					player.selectLocation(player);
					return;
					
				}
				
				
		}
	
			
			
		}
	}
	
	

	
}
