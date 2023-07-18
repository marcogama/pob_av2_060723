package pob_av2_060723;

public class Cama {

	public String getPos_cama() {
		return pos_cama;
	}
	public void setPos_cama(String pos_cama) {
		this.pos_cama = pos_cama;
	}
	public String getDescr_cama() {
		return descr_cama;
	}
	public void setDescr_cama(String descr_cama) {
		this.descr_cama = descr_cama;
	}
	public int getId_cama() {
		return id_cama;
	}
	public int getCod_cama() {
		return cod_cama;
	}
	public boolean isEh_bel() {
		return eh_beliche;
	}
	private Cama(int id_cama, int cod_cama, String pos_cama, String descr_cama, boolean eh_bel) {
		super();
		this.id_cama = id_cama;
		this.cod_cama = cod_cama;
		this.pos_cama = pos_cama;
		this.descr_cama = descr_cama;
		this.eh_beliche = eh_beliche;
	}
	int id_cama, cod_cama;
	String pos_cama, descr_cama;
	boolean eh_bel;
}
