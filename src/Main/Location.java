	package Main;
	
	import java.util.Scanner;
	
	public class Location {
		
		Scanner scanner = new Scanner(System.in);
		Player player;
		weaponMarket weaponMarket = new weaponMarket();
		ArmorMarket armorMarket = new ArmorMarket();
		Helper helper;
		
		public Location(Player player) {
			this.player = player;
			this.helper = new Helper(player);
		}
	
		
	
	
		
	
		public void safeHouse () {
			System.out.println("Güvenli Bölgeye hoşgeldiniz. Bu bölgede canınız yenilecektir.");
			
		}
		
		public void market () {
		
			System.out.println("Markete Hoşgeldiniz. Burada aşağıdaki silahları satın alabilirsiniz.");
			System.out.println("Paranız = "+player.getMoney());
			System.out.println(" 1-Silahlar \n 2-Zırhlar \n 3-Çıkış Yap");
			System.out.print("Seçiminiz = ");
			int selectMark = scanner.nextInt();
			
				switch (selectMark) {
				case 1:
					weaponMarket.weaponPrint();
					System.out.println("===================");
					System.out.println(" 1-Tabanca \n 2-Kılıç \n 3-Tüfek \n 4-Çıkış");
					System.out.print("Satın alınacak silah = ");
					int secSilah = scanner.nextInt();
					
					helper.weaponSetHelper(secSilah);
							if (secSilah == 4) {
								break;
								}
					
					break;
				case 2:
					
					armorMarket.armorPrint();
					System.out.println("---------------------------------------------------");
					System.out.println(" Paranız = " +player.getMoney());
					System.out.println(" 1-Hafif Zırh \n 2-Orta Zırh \n 3-Ağır Zırh \n 4-Çıkış");
					System.out.print("Satın alınacak zırh = ");
					int secZirh = scanner.nextInt();
					
					helper.ArmorSetHelper(secZirh);
						if (secZirh == 4) {
							break;
						}
						
						
					
					break;
				case 3: 
					System.out.println("Bir daha bekleriz.");
					break;
					
				}
			
			
			
		}
		
	}
