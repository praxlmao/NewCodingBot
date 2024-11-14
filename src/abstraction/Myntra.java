package abstraction;

class Myntra extends discount {
	public Myntra() {
		super();
		discount = 20;
	}

	@Override
	public int getDiscount(int amount) {
		if (amount > 1000) {
			return amount * discount / 100;
		} else {
			return amount * 5 / 100;
		}
	}
}
