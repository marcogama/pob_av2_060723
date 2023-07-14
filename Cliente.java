package pob_av2_060723;

public class Cliente {

	public int getPos_code_cli() {
		return pos_code_cli;
	}
	public void setPos_code_cli(int pos_code_cli) {
		this.pos_code_cli = pos_code_cli;
	}
	public int getCpf_cli() {
		return cpf_cli;
	}
	public void setCpf_cli(int cpf_cli) {
		this.cpf_cli = cpf_cli;
	}
	public int getDt_nasc_cli() {
		return dt_nasc_cli;
	}
	public void setDt_nasc_cli(int dt_nasc_cli) {
		this.dt_nasc_cli = dt_nasc_cli;
	}
	public String getNome_cli() {
		return nome_cli;
	}
	public void setNome_cli(String nome_cli) {
		this.nome_cli = nome_cli;
	}
	public String getEnd_cli() {
		return end_cli;
	}
	public void setEnd_cli(String end_cli) {
		this.end_cli = end_cli;
	}
	public String getNome_pais_cli() {
		return nome_pais_cli;
	}
	public void setNome_pais_cli(String nome_pais_cli) {
		this.nome_pais_cli = nome_pais_cli;
	}
	public String getEmail_cli() {
		return email_cli;
	}
	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}
	public int getId_cli() {
		return id_cli;
	}
	public String getPass_cli() {
		return pass_cli;
	}
	public Cliente(int id_cli, int pos_code_cli, int cpf_cli, int dt_nasc_cli, String nome_cli, String end_cli,
			String nome_pais_cli, String pass_cli, String email_cli) {
		super();
		this.id_cli = id_cli;
		this.pos_code_cli = pos_code_cli;
		this.cpf_cli = cpf_cli;
		this.dt_nasc_cli = dt_nasc_cli;
		this.nome_cli = nome_cli;
		this.end_cli = end_cli;
		this.nome_pais_cli = nome_pais_cli;
		this.pass_cli = pass_cli;
		this.email_cli = email_cli;
	}
	int id_cli, pos_code_cli, cpf_cli, dt_nasc_cli;
	String nome_cli, end_cli, nome_pais_cli, pass_cli, email_cli;
}
