package pob_av2_060723;

public class Reserva {

	public int getDt_in() {
		return Dt_in;
	}

	public void setDt_in(int Dt_in) {
		this.Dt_in = Dt_in;
	}

	public int getDt_out() {
		return Dt_out;
	}

	public void setDt_out(int Dt_out) {
		this.Dt_out = Dt_out;
	}

	public int getId_reserva() {
		return Id_reserva;
	}

	public int getId_quarto() {
		return Id_quarto;
	}

	public int getId_cliente() {
		return Id_cliente;
	}

	public int getId_cama() {
		return Id_cama;
	}

	private Reserva(int Id_reserva, int Id_quarto, int Id_cliente, int Id_cama, int Dt_in, int Dt_out) {
		super();
		this.Id_reserva = Id_reserva;
		this.Id_quarto = Id_quarto;
		this.Id_cliente = Id_cliente;
		this.Id_cama = Id_cama;
		this.Dt_in = Dt_in;
		this.Dt_out = Dt_out;
	}

	int Id_reserva, Id_quarto, Id_cliente, Id_cama, Dt_in, Dt_out;
}
