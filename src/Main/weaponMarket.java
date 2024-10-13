package Main;

public class weaponMarket {
	
	String Tabanca;
	String kilic;
	String tufek;
	
	int tabancaPrice = 10;
	int kilicPrice = 5;
	int tufekPrice = 15;
	
	
	public weaponMarket() {
		this.Tabanca = "Tabanca";
		this.kilic = "Kılıç";
		this.tufek = "Tüfek";
	}

	public void weaponPrint () {
		System.out.println(this.Tabanca + " Fiyatı = " + tabancaPrice + "\n"
						+ this.kilic + " Fiyatı = " + kilicPrice + "\n"
						+ this.tufek + " Fiyatı = " + tufekPrice );
		
	}
	
	
}
