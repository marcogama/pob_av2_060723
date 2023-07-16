package pob_av2_060723;

public class Quarto {

		public int getQtde_cama() {
		return Qtde_cama;
	}
	public void setQtde_cama(int Qtde_cama) {
		this.Qtde_cama = Qtde_cama;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}
	public boolean isTem_bath() {
		return Tem_bath;
	}
	public void setTem_bath(boolean Tem_bath) {
		this.Tem_bath = Tem_bath;
	}
	public int getId_quarto() {
		return Id_quarto;
	}
	public String getNomeQuarto() {
		return NomeQuarto;
	}
		private Quarto(int Id_quarto, int Qtde_cama, String NomeQuarto, String Descricao, boolean Tem_bath) {
		super();
		this.Id_quarto = Id_quarto;
		this.Qtde_cama = Qtde_cama;
		this.NomeQuarto = NomeQuarto;
		this.Descricao = Descricao;
		this.Tem_bath = Tem_bath;
	}
		int Id_quarto, Qtde_cama;
		String NomeQuarto, Descricao;
		boolean Tem_bath;
}
