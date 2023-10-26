package entities;

public class folha_paga {

	private Double pg_basic;
	private Double taxa;
	
	public folha_paga() {
	}

	public folha_paga(Double pg_basic, Double taxa) {
		this.pg_basic = pg_basic;
		this.taxa = taxa;
	}

	public Double getPg_basic() {
		return pg_basic;
	}

	public void setPg_basic(Double pg_basic) {
		this.pg_basic = pg_basic;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double total() {
		return pg_basic + taxa;
	}
	
}
