package Main;

public class ArmorMarket {

	
	String Hafif;
	String Orta;
	String Agir;
	
	int hafifPrice = 15;
	int ortaPrice = 25;
	int agirPrice = 40;
	
	public ArmorMarket() {
		this.Hafif = "Hafif Zırh";
		this.Orta = "Orta Zırh";
		this.Agir = "Ağır Zırh";
	}
	
	public void armorPrint () {
		System.out.println(this.Hafif + " Fiyatı = " + hafifPrice + "\n"
						+ this.Orta + " Fiyatı = " + ortaPrice + "\n"
						+ this.Agir + " Fiyatı = " + agirPrice );
		
	}
	
}
