package pob_av2_060723;

public class Reserva {

	public int getDt_in() {
		return dt_in;
	}

	public void setDt_in(int dt_in) {
		this.dt_in = dt_in;
	}

	public int getDt_out() {
		return dt_out;
	}

	public void setDt_out(int dt_out) {
		this.dt_out = dt_out;
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public int getId_quarto() {
		return id_quarto;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	private Reserva(int id_reserva, int id_quarto, int id_cliente, int dt_in, int dt_out) {
		super();
		this.id_reserva = id_reserva;
		this.id_quarto = id_quarto;
		this.id_cliente = id_cliente;
		this.dt_in = dt_in;
		this.dt_out = dt_out;
	}

	int id_reserva, id_quarto, id_cliente, dt_in, dt_out;
}
