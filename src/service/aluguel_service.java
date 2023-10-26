package service;

import java.time.Duration;

import entities.al_carro;
import entities.folha_paga;

public class aluguel_service {

	private Double pre�o_hora;
	private Double pre�o_dia;
	private tax_service tax;
	
	public aluguel_service(Double pre�o_hora,Double pre�o_dia,tax_service tax){
		this.pre�o_dia=pre�o_dia;
		this.pre�o_hora=pre�o_hora;
		this.tax=tax;
	}
	
	public void processo(al_carro car) {
		double minutes = Duration.between(car.getStart(), car.getFinish()).toMinutes();
		double horas = minutes/60;
		double tt;
		if(horas<=12) {
			tt = pre�o_hora*Math.ceil(horas);
		}else {
			tt = pre�o_dia*Math.ceil(horas/24);
		}
		double taxa = tax.taxa(tt);
		car.setFp(new folha_paga(tt,taxa));
	}
}
