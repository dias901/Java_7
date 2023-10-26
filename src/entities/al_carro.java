package entities;

import java.time.LocalDateTime;

public class al_carro {

	private LocalDateTime start;
	private LocalDateTime finish;
	private Veiculo veiculo;
	private folha_paga fp;
	
	public al_carro() {
		
	}
	
	public al_carro(LocalDateTime start, LocalDateTime finish, Veiculo veiculo) {
		this.start = start;
		this.finish = finish;
		this.veiculo = veiculo;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public folha_paga getFp() {
		return fp;
	}

	public void setFp(folha_paga fp) {
		this.fp = fp;
	}
	
}
