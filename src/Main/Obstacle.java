package Main;


public abstract class Obstacle {
	
	private String obsName;
	private int damage;
	private int health;
	
	public Obstacle(String obsName, int damage, int health) {
		this.obsName = obsName;
		this.damage = damage;
		this.health = health;
	}

	public String getObsName() {
		return obsName;
	}

	public void setObsName(String obsName) {
		this.obsName = obsName;
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
	
	
	
}
