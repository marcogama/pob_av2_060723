package pob_av2_060723;

public class Quarto {

		public int getQtde_cama() {
		return qtde_cama;
	}
	public void setQtde_cama(int qtde_cama) {
		this.qtde_cama = qtde_cama;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isTem_ban() {
		return tem_ban;
	}
	public void setTem_ban(boolean tem_ban) {
		this.tem_ban = tem_ban;
	}
	public int getiD_quarto() {
		return iD_quarto;
	}
	public String getNomeQuarto() {
		return nomeQuarto;
	}
		private Quarto(int iD_quarto, int qtde_cama, String nomeQuarto, String descricao, boolean tem_ban) {
		super();
		this.iD_quarto = iD_quarto;
		this.qtde_cama = qtde_cama;
		this.nomeQuarto = nomeQuarto;
		this.descricao = descricao;
		this.tem_ban = tem_ban;
	}
		int iD_quarto, qtde_cama;
		String nomeQuarto, descricao;
		boolean tem_ban;
}
