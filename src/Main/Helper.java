package Main;



public class Helper {
	
	
	ArmorMarket armor = new ArmorMarket();
	weaponMarket weaponMarket = new weaponMarket();
	Player player;
	int param;
	
	
	public Helper(Player player) {
		this.player = player;
	}
	

	
	// Armor metod burada başlar..
	public void ArmorSetHelper (int sayi) {  
		
		
		
		 if (sayi == 1)  {
			if (player.getMoney() >= armor.hafifPrice) {
				param = player.getMoney() - armor.hafifPrice ;
				player.setMiss(player.getMiss()+1);
				System.out.println("Hafif Zırh Satın Aldınız.");
				player.setMoney(param); 

				} else {
					 System.out.println("Bu işlemi yapamazsın, paran yetersiz.");
					
					
				}									
			}
			
		 
		else if (sayi == 2 ) {
			if (player.getMoney() >= armor.ortaPrice) {
				param = player.getMoney() - armor.ortaPrice;
	            player.setMiss(player.getMiss()+3);
	            System.out.println("Orta Zırh Satın Aldınız.");
	            player.setMoney(param); } 
			else {
	            	System.out.println("Bu işlemi yapamazsın, paran yetersiz.");
				}		
			
		}
		
		else if (sayi == 3) {
	        if (player.getMoney() >= armor.agirPrice) {
	            param = player.getMoney() - armor.agirPrice;
	            player.setMiss(player.getMiss()+5);
	            System.out.println("Ağır Zırh Satın Aldınız.");
	            player.setMoney(param);
	        } else {
	            System.out.println("Bu işlemi yapamazsın, paran yetersiz.");
	        }
		 
			System.out.println("Kalan paranız = "+player.getMoney());
			
	}

		 System.out.println("Kalan Paranız = "+player.getMoney());
		 System.out.println("----------------------------------");
		 player.selectLocation(player);
}  
	
	// Armor metod sonlandı.
	
	
	public void weaponSetHelper (int sayi) {
	    if (sayi == 1) { // Tabanca
	        if (player.getMoney() >= weaponMarket.tabancaPrice) {
	            param = player.getMoney() - weaponMarket.tabancaPrice;
	            player.setDamage(player.getDamage() + 2);
	            System.out.println("Tabanca satın aldınız.");
	            player.setMoney(param);
	        } else {
	            System.out.println("Bu işlemi yapamazsın, paran yetersiz.");
	        }
	    } else if (sayi == 2) { // Kılıç
	        if (player.getMoney() >= weaponMarket.kilicPrice) {
	            param = player.getMoney() - weaponMarket.kilicPrice;
	            player.setDamage(player.getDamage() + 3); // Mevcut hasara ekleme
	            System.out.println("Kılıç satın aldınız.");
	            player.setMoney(param);
	        } else {
	            System.out.println("Bu işlemi yapamazsın, paran yetersiz.");
	        }
	    } else if (sayi == 3) { // Tüfek
	        if (player.getMoney() >= weaponMarket.tufekPrice) {
	            param = player.getMoney() - weaponMarket.tufekPrice;
	            player.setDamage(player.getDamage() + 7); // Mevcut hasara ekleme
	            System.out.println("Tüfek satın aldınız.");
	            player.setMoney(param);
	        } else {
	            System.out.println("Bu işlemi yapamazsın, paran yetersiz.");
	        }
	    }
	    
	    
	    System.out.println("Kalan Paranız = " + player.getMoney());
	    System.out.println("----------------------------------");

	    
	    player.selectLocation(player);
	}

	
}
