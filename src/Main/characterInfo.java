package Main;

public class characterInfo {
	
	Player player;
	
	
	public characterInfo(Player player) {
		this.player = player;
	}
	
	
	public void charInfo () {
		System.out.println(" Karakterinizin Adı = " +player.getName() + "("+player.getCharName()+")"
							+ "\t\t Hasar = " + player.getDamage()
							+ "\t\t Güncel Paranız = " + player.getMoney()
							+ "\t\t Bloklama Gücü = "+player.getMiss()
							+ "\t\t Sağlık = " +player.getHealth()
				);
		System.out.println("-----------------------------");
	}

}
