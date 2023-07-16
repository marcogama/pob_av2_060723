package pob_av2_060723;
import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

	static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner digite = new Scanner(System.in);
		Scanner nome = new Scanner(System.in);
		Scanner end = new Scanner(System.in);
		Scanner email = new Scanner(System.in);
		Scanner pais = new Scanner(System.in);
		Scanner num_pas = new Scanner(System.in);
		Scanner cpf = new Scanner(System.in);
		Scanner dt_nasc = new Scanner(System.in);
		Scanner cep = new Scanner(System.in);
		Scanner nomeQuarto = new Scanner(System.in);
		Scanner descr = new Scanner(System.in);
		Scanner tem_bath = new Scanner(System.in);
		Scanner qtde_cama = new Scanner(System.in);
		Scanner descr = new Scanner(System.in);
		
		ArrayList<Integer> cama = new ArrayList<Integer>();
		ArrayList<Integer> cliente = new ArrayList<Integer>();
		ArrayList<Integer> quarto = new ArrayList<Integer>();
		ArrayList<Integer> reserva = new ArrayList<Integer>();

		Int Id_cliente, Id_quarto, ;
		int op, opcao, ident, alter;
		String Nome, End, Email, Pais, Num_pas;
		int Cpf, Dt_nasc, Cep;
		boolean ok;
		String Nome_quarto, Descr;
		int Qtde_cama;
		boolean Tem_bath;
		
		do{
			System.out.println("\nMenu de Opcoes\n");
			System.out.println("1 : Cliente");
			System.out.println("2 : Quarto");
			System.out.println("3 : Reserva");
			System.out.println("4 : Cama");
			System.out.println("5 : Sair");

			op = digite.nextInt();
			if(op < 1 || op > 5)
				System.out.println("Opcao invalida");
			if(op == 1){

				do{
				System.out.println("\nMenu de Opcoes\n");
				System.out.println("1 : Inserir Cliente");
				System.out.println("2 : Remover Cliente");
				System.out.println("3 : Listar Cliente");
				System.out.println("4 : Alterar Cliente");
				System.out.println("5 : Sair");

				opcao = digite.nextInt();
				if(opcao < 1 || opcao > 5)
					System.out.println("Opcao invalida");
				if(opcao == 1){
					
					System.out.println("Digite os dados do cliente: nome, cpf, data de nascimento(dd/mm/aa, endereco, cep,
							   email, numero do passaporte, Pais");
					Nome = NULL;
					while(Nome == NULL){
						System.out.println("Digite o nome do cliente");
						Nome = nome.next();
					}

					End = NULL;
					while(End == NULL){
							System.out.println("Digite o endereco");
							End = end.next();
					}
					
					ok = false;
					while(ok != true){
						Email = email.next();
						Pattern verif = Pattern.compile(["@."|"@.com"|"@.com."|"^\b."|\s], pattern.LITERAL);
						Matcher compara = verif.matcher(Email);
						ok = matcher.find();
						if(ok == false)
						System.out.println("email invalido");
					}
					
					Pais = pais.next();
					
					Num_pas = num_pas.next();

					Cpf = 0;
					while(Cpf == 0){
						System.out.println("Digite o CPF");
						Cpf = cpf.nextInt();
					}
					
					ok = false;
					while(ok != true){
						Dt_nasc = dt_nasc.nextInt();
						Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
						Matcher compara = verif.matcher(Dt_nasc);
						ok = matcher.find();
						if(ok == false)
						System.out.println("data de nascimento invalida");
					}
					
					Cep = cep.nextInt();

					Cliente cliente[Id_cliente] = new Cliente(Id_cliente, Cep, Cpf, Dt_nasc, Nome, End, Pais, Num_pas, Email);
					cliente.add(Id_cliente);
					Id_cliente += 1;
				}
				if(opcao == 2){

					System.out.println("Digite o Id do cliente");
					ident = digite.nextInt();
					for(Integer i : cliente){

						if(ident == i)
							cliente.remove(i);
						else
							System.out.println("Cliente não encontrado");
					} 
				}
				if(opcao == 3){

					for(Integer i : cliente)
						System.out.println("- Cliente" + i + " Id = " + i);
				}
				if(opcao == 4){

					System.out.println("Digite o id do cliente para alterar");
					ident = digite.nextInt();
					for(Integer i : cliente){
						if(ident == i){
							System.out.println("Id : " + cliente[ident].getId_cli());
							System.out.println("Cep : " + cliente[ident].getPos_code_cli());
							System.out.println("Cpf : " + cliente[ident].getCpf_cli());
							System.out.println("Data de Nascimento : " + cliente[ident].getDt_nasc_cli());
							System.out.println("Nome : " + cliente[ident].getNome_cli());
							System.out.println("Endereço : " + cliente[ident].getEnd_cli());
							System.out.println("País : " + cliente[ident].getNome_pais_cli());
							System.out.println("Numero do passaporte : " + cliente[ident].getPass_cli());
							System.out.println("Email : " + cliente[ident].getEmail_cli());
							do{
								System.out.println("\nOpções:\n");
								System.out.println("1 : Nome ");
								System.out.println("2 : Cpf ");
								System.out.println("3 : Data Nascimento ");
								System.out.println("4 : Endereço ");
								System.out.println("5 : Cep ");
								System.out.println("6 : Numero passaporte ");
								System.out.println("7 : País ");
								System.out.println("8 : Email ");
								System.out.println("9 : Sair ");

								System.out.println("Digite a opção ");
								alter = digite.nextInt();
								if(alter < 1 || alter > 9)
									System.out.println("Opção invalida ");
								if(alter == 1){

									Nome = NULL;
									while(Nome == NULL){
										System.out.println("Digite o novo nome");
										Nome = nome.next();
									}
									cliente[ident].setNome_cli(Nome);
								}
								if(alter == 2){

									Cpf = 0;
									while(Cpf == 0){
										System.out.println("Digite o novo cpf");
										Cpf = cpf.nextInt();
									}
									cliente[ident].setCpf_cli(Cpf);
								}
								if(alter == 3){

									ok = false;
									while(ok != true){
										System.out.println("Digite a nova data de nascimento");
										Integer Dt_nasc = dt_nasc.nextInt();
										Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
										Matcher compara = verif.matcher(Dt_nasc);
										ok = matcher.find();
										if(ok == false)
										System.out.println("data de nascimento invalida");
									}
									cliente[ident].setDt_nasc_cli(Data);
								}
								if(alter == 4){
									
									String End = NULL;
									while(End == NULL){
										System.out.println("Digite o novo endereço");
										End = nome.next();
									}
									cliente[ident].setEnd_cli(End);
								}
								if(alter == 5){

									System.out.println("Digite o novo cep");
    									String Cep = cep.nextInt();
									cliente[ident].setPos_code_cli(Cep);
								}
								if(alter == 6){

									System.out.println("Digite o novo passaporte");
    									String NumPas = numPas.next();
									cliente[ident].setPass_cli(NumPas);
								}
								if(alter == 7){

									System.out.println("Digite o País");
    									String Pais = pais.next();
									cliente[ident].setNome_pais_cli(Pais);
								}
								if(alter == 8){

									ok = false;
									while(ok != true){
										System.out.println("Digite o novo email");
										String Email = email.next();
										Pattern verif = Pattern.compile(["@."|"@.com"|"@.com."|"^\b."|\s], pattern.LITERAL);
										Matcher compara = verif.matcher(Email);
										ok = matcher.find();
										if(ok == false)
										System.out.println("email invalido");
									}
									cliente[ident].setEmail_cli(Email);
								}
							}
							while(alter != 9);
							}
							else
								System.out.println("Cliente não encontrado!");
						}
					}
				}
				while(opcao != 5);
			}

			//CRUD QUARTO
			
			if(op == 2){ 

				do{
				System.out.println("\nMenu de Opcoes\n");
				System.out.println("1 : Inserir Quarto");
				System.out.println("2 : Remover Quarto");
				System.out.println("3 : Listar Quarto");
				System.out.println("4 : Alterar Quarto");
				System.out.println("5 : Sair");

				opcao = digite.nextInt();
				if(opcao < 1 || opcao > 5)
					System.out.println("Opcao invalida");
				if(opcao == 1){
					
					System.out.println("Digite as informações do quarto: nome do quarto, descrição, quantidade de camas,
							   banheiro");
					NomeQuarto = NULL;
					while(NomeQuarto == NULL){
						System.out.println("Digite o nome do quarto");
						NomeQuarto = nomeQuarto.next();
					}
					
					Descr = NULL;
					while(Descr == NULL){
							System.out.println("Descreva o quarto");
							Descr = descr.next();
					}
				
					System.out.println("Tem banheiro no quarto : 1 - sim, 2 - nao");
					tem_bath = digite.nextInt();
					if(tem_bath < 1 || tem_bath > 2)
						System.out.println("Opcao invalida);
					else if(tem_bath == 1)
						Tem_bath = true;
					else
						Tem_bath = false;
					
					Qtde_cama = qtde_cama.nextInt();

					Cliente cliente[Id_quarto] = new Cliente(Id_quarto, Qtde_cama, Nome_quarto, Descr,Tem_bath);
					cliente.add(Id_quarto);
					Id_quarto += 1;
				}
				if(opcao == 2){

					System.out.println("Digite o Id do quarto");
					ident = digite.nextInt();
					for(Integer i : quarto){

						if(ident == i)
							cliente.remove(i);
						else
							System.out.println("Cliente não encontrado");
					} 
				}
				if(opcao == 3){

					for(Integer i : quarto)
						System.out.println("- Quarto" + i + " Id = " + i);
				}
				if(opcao == 4){

					System.out.println("Digite o id do quarto para alterar");
					ident = digite.nextInt();
					for(Integer i : quarto){
						if(ident == i){
							System.out.println("Id : " + quarto[ident].getId_quarto());
							System.out.println("Quantidade de camas : " + quarto[ident].getQtde_cama());
							System.out.println("Nome do quarto : " + quarto[ident].getNome_quarto());
							System.out.println("Descrição do quarto : " + quarto[ident].getDescricao());
							if(quarto[ident].isTem_bath())
								System.out.println("Tem banheiro");
							else
								System.out.println("Não tem banheiro");
							
							do{
								System.out.println("\nOpções:\n");
								System.out.println("1 : Nome ");
								System.out.println("2 : Descrição ");
								System.out.println("3 : Quantidade de camas ");
								System.out.println("4 : Tem banheiro ");
								System.out.println("5 : Sair ");

								System.out.println("Digite a opção ");
								alter = digite.nextInt();
								if(alter < 1 || alter > 5)
									System.out.println("Opção invalida ");
								if(alter == 1){

									NomeQuarto = NULL;
									while(Nome == NULL){
										System.out.println("Digite o novo nome");
										NomeQuarto = nomeQuarto.next();
									}
									quarto[Id_quarto].setNome_quarto(NomeQuarto);
								}
								
								if(alter == 2){

									descr = NULL;;
									while(descr == NULL){
										System.out.println("Descreva o quarto");
							 			Descr = descr.next();
									}
									quarto[ident].setDescricao(Descr);
								}
								
								if(alter == 3){

									System.out.println("Digite a nova quantidade");
									Qtde_cama = qtde_cama.nextInt();
									quarto[ident].setQtde_cama(Qtde_cama);
								}
								
								if(alter == 4){

									System.out.println("Tem banheiro no quarto : 1 - sim, 2 - nao");
									tem_bath = digite.nextInt();
									if(tem_bath < 1 || tem_bath > 2)
										System.out.println("Opcao invalida);
									else if(tem_bath == 1)
										Tem_bath = true;
									else
										Tem_bath = false;
									quarto[ident].setTem_bath(Tem_bath);
								}
							}
							while(alter != 5);
						} else
							System.out.println("Cliente não encontrado!");
					}
				}
			}
			while(opcao != 5);
			}

			// CRUD RESERVA
			
			if(op == 3){}

			// CRUD CAMA
			
			if(op == 4){}
			
		}
		while(op != 5);
	}

}
