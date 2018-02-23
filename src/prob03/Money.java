package prob03;

public class Money {

	private int amount;
    
	public Money(int amount) {
		this.amount = amount;
	}
	
	public Money add(Money money) {
		int answer = amount + money.amount;
		return new Money(answer);
	}
	
	public Money minus(Money money) {
		int answer = amount - money.amount;
		return new Money(answer);
	}
	
	public Money multiply(Money money) {
		int answer = amount * money.amount;
		return new Money(answer);
	}
	
	public Money devide(Money money) {
		int answer = amount / money.amount;
		return new Money(answer);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Money) {
			if(((Money) obj).amount == this.amount) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	
}
