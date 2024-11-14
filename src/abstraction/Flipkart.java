package abstraction;

class Flipkart extends discount {
	public Flipkart() {
		super();
		discount = 10;
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
