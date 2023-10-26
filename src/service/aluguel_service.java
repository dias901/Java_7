package service;

import java.time.Duration;

import entities.al_carro;
import entities.folha_paga;

public class aluguel_service {

	private Double preço_hora;
	private Double preço_dia;
	private tax_service tax;
	
	public aluguel_service(Double preço_hora,Double preço_dia,tax_service tax){
		this.preço_dia=preço_dia;
		this.preço_hora=preço_hora;
		this.tax=tax;
	}
	
	public void processo(al_carro car) {
		double minutes = Duration.between(car.getStart(), car.getFinish()).toMinutes();
		double horas = minutes/60;
		double tt;
		if(horas<=12) {
			tt = preço_hora*Math.ceil(horas);
		}else {
			tt = preço_dia*Math.ceil(horas/24);
		}
		double taxa = tax.taxa(tt);
		car.setFp(new folha_paga(tt,taxa));
	}
}
