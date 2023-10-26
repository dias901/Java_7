package service;

public class taxa_service implements tax_service {
	
	public double taxa(double amount) {
		if(amount <= 100) {
			return amount * 0.20;
		}else {
			return amount * 0.15;
		}
	}

}
