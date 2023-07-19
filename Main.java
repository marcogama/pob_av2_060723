package pob_av2_060723;
import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

	static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		Scanner digite = new Scanner(System.in);             //OBJETO SCANNER DE ENTRADA DADOS

		// ARRAYS PARA GUARDAR AS IDS DOS OBJETOS
		
		ArrayList<Integer> cama = new ArrayList<Integer>();
		ArrayList<Integer> cliente = new ArrayList<Integer>();
		ArrayList<Integer> quarto = new ArrayList<Integer>();
		ArrayList<Integer> reserva = new ArrayList<Integer>();


		// VARIAVEIS
		
		Int Id_cliente, Id_quarto, Id_reserva, Id_cama;
		Id_cliente = Id_quarto = Id_reserva = Id_cama = 1;
		int op, opcao, ident, alter;
		String Nome, End, Email, Pais, Num_pas, NomeQuarto, Descr, Pos_cama, Descr_cama;
		int Cpf, Dt_nasc, Cep, Dt_in, Dt_out, tem_bath, Qtde_cama, Cod_cama, eh_bel;
		boolean ok, Tem_bath, Eh_bel;

		// OPÇÕES DE ACESSO AO OBJETO
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

				//OPÇÕES DO OBJETO CLIENTE
				
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
					while(Nome == NULL){                                   // NOME NAO PODE FICAR VAZIO
						System.out.println("Digite o nome do cliente");
						Nome = digite.next();
					}

					End = NULL;
					while(End == NULL){                                   // ENDEREÇO NAO PODE FICAR VAZIO
							
						System.out.println("Digite o endereco");
						End = digite.next();
					}
					
					ok = false;

					// VERIFICANDO O PADRÃO DE ENTRADA DO EMAIL
					
					while(ok != true){
						
						System.out.println("Digite o email");
						Email = digite.next();
						Pattern verif = Pattern.compile(["@."|"@.com"|"@.com."|"^\b."|\s], pattern.LITERAL);
						Matcher compara = verif.matcher(Email);
						ok = matcher.find();
						if(ok == false)
						System.out.println("email invalido");
					}
					
					Pais = digite.next();
					
					Num_pas = digite.next();

					Cpf = 0;
					while(Cpf == 0){                                  //CPF NÃO PODE FICAR VAZIO
						System.out.println("Digite o CPF");
						Cpf = digite.nextInt();
					}
					
					ok = false;

					// VERIFICANDO O PADRÃO DE ENTRADA DA DATA DE NASCIMENTO
					
					while(ok != true){ 
						Dt_nasc = digite.nextInt();
						Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
						Matcher compara = verif.matcher(Dt_nasc);
						ok = matcher.find();
						if(ok == false)
						System.out.println("data de nascimento invalida");
					}
					
					Cep = digite.nextInt();

					// CRIANDO UM OBJETO CLIENTE COM SEUS ATRIBUTOS
					
					Cliente cliente[Id_cliente] = new Cliente(Id_cliente, Cep, Cpf, Dt_nasc, Nome, End, Pais, Num_pas, Email);
					cliente.add(Id_cliente);                                                     //ADICIONANDO ID_CLIENTE NA ARRAY
					try{
					   File clienteArq = new File("cliente" + Id_cliente + ".txt");              //CRIANDO O OBJETO CLIENTE DA CLASSE FILE
					}catch(IOException e){
						System.out.println("Erro ao criar arquivo");
						e.printStackTrace();
					}
					try{
					   FileWriter clienteArq = new FileWriter("cliente" + Id_cliente + ".txt"); //CRIANDO O OBJETO CLIENTE DA CLASSE FILEWRITER
					   clienteArq.write(Id_cliente + "|" Nome + "|" + Cpf + "|" + Dt_nasc + "|" + End + "|" + Cep + "|" +
							    Email + "|" + Num_pas + "|" + Pais );
				           clienteArq.close();
					}catch(IOException e){
						System.out.println("Erro na gravação");
					}
					
					
					Id_cliente += 1;                                                            //ID_CLIENTE É AUTOINCREMENTAL
				}
				if(opcao == 2){

					System.out.println("Digite o Id do cliente");
					ident = digite.nextInt();
					for(Integer i : cliente){

						if(ident == i)
							cliente.remove(i);
						else if(i == cliente.size())
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
					
					for(Integer i : cliente){                                              //PERCORRENDO A ARRAY CLIENTE
						if(ident == i){                                                //LISTANDO UM CLIENTE
							System.out.println("Id : " + cliente[ident].getId_cli());
							System.out.println("Cep : " + cliente[ident].getPos_code_cli());
							System.out.println("Cpf : " + cliente[ident].getCpf_cli());
							System.out.println("Data de Nascimento : " + cliente[ident].getDt_nasc_cli());
							System.out.println("Nome : " + cliente[ident].getNome_cli());
							System.out.println("Endereço : " + cliente[ident].getEnd_cli());
							System.out.println("País : " + cliente[ident].getNome_pais_cli());
							System.out.println("Numero do passaporte : " + cliente[ident].getPass_cli());
							System.out.println("Email : " + cliente[ident].getEmail_cli());

							//OPÇÕES DE ALTERAÇÃO DO OBJETO CLIENTE
							
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
										Nome = digite.next();
									}
									cliente[ident].setNome_cli(Nome);
								}
								if(alter == 2){

									Cpf = 0;
									while(Cpf == 0){
										System.out.println("Digite o novo cpf");
										Cpf = digite.nextInt();
									}
									cliente[ident].setCpf_cli(Cpf);
								}
								if(alter == 3){

									ok = false;
									while(ok != true){
										System.out.println("Digite a nova data de nascimento");
										Dt_nasc = digite.nextInt();
										Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
										Matcher compara = verif.matcher(Dt_nasc);
										ok = matcher.find();
										if(ok == false)
										System.out.println("data de nascimento invalida");
									}
									cliente[ident].setDt_nasc_cli(Data);
								}
								if(alter == 4){
									
									End = NULL;
									while(End == NULL){
										System.out.println("Digite o novo endereço");
										End = digite.next();
									}
									cliente[ident].setEnd_cli(End);
								}
								if(alter == 5){

									System.out.println("Digite o novo cep");
    									Cep = digite.nextInt();
									cliente[ident].setPos_code_cli(Cep);
								}
								if(alter == 6){

									System.out.println("Digite o novo passaporte");
    									String NumPas = numPas.next();
									cliente[ident].setPass_cli(NumPas);
								}
								if(alter == 7){

									System.out.println("Digite o País");
    									Pais = digite.next();
									cliente[ident].setNome_pais_cli(Pais);
								}
								if(alter == 8){

									ok = false;
									while(ok != true){
										System.out.println("Digite o novo email");
										Email = digite.next();
										Pattern verif = Pattern.compile(["@."|"@.com"|"@.com."|"^\b."|\s], pattern.LITERAL);
										Matcher compara = verif.matcher(Email);
										ok = matcher.find();
										if(ok == false)
										System.out.println("email invalido");
									}
									cliente[ident].setEmail_cli(Email);
								}

								//ATUALIZANDO O ARQUIVO CLIENTE
								
								try{
					                	   FileWriter clienteArq = new FileWriter("cliente" + ident + ".txt"); //SOBRESCREVE O OBJETO CLIENTE DA CLASSE FILEWRITER
					                           clienteArq.write(cliente[ident].getId_cliente() + "|" cliente[ident].getNome() + "|" + cliente[ident].getCpf() + "|" + 
										    cliente[ident].getDt_nasc() + "|" + cliente[ident].getEnd() + "|" + cliente[ident]getCep() + "|" +
							                            cliente[ident].getEmail() + "|" + cliente[ident].getNum_pas() + "|" + cliente[ident].getPais());
				           			   clienteArq.close();
								}catch(IOException e){
									System.out.println("Erro na gravação");
								}
							}
							while(alter != 9);
							}
							else if(i == cliente.size())
								System.out.println("Cliente não encontrado!");
						}
					}
				}
				while(opcao != 5);
			}

			//CRUD QUARTO
			
			if(op == 2){ 

				//OPÇÕES DO OBJETO QUARTO

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
						NomeQuarto = digite.next();
					}
					
					Descr = NULL;
					while(Descr == NULL){
							System.out.println("Descreva o quarto");
							Descr = digite.next();
					}
				
					System.out.println("Tem banheiro no quarto : 1 - sim, 2 - nao");
					tem_bath = digite.nextInt();
					if(tem_bath < 1 || tem_bath > 2)
						System.out.println("Opcao invalida);
					else if(tem_bath == 1)
						Tem_bath = true;
					else
						Tem_bath = false;

					System.out.println("Quantas camas tem no quarto?");
					Qtde_cama = digite.nextInt();

					Cliente cliente[Id_quarto] = new Cliente(Id_quarto, Qtde_cama, NomeQuarto, Descr,Tem_bath);  //CRIANDO UM OBJETO QUARTO
					cliente.add(Id_quarto);                                                                      //ADICIONANDO ID_QUARTO N0 ARRAY

					try{
					   File quartoArq = new File("quarto" + Id_quarto + ".txt");                                 //CRIANDO O OBJETO QUARTO DA CLASSE FILE
					}catch(IOException e){
						System.out.println("Erro ao criar arquivo");
						e.printStackTrace();
					}
					try{
					   FileWriter quartoArq = new FileWriter("quarto" + Id_quarto + ".txt");                     //CRIANDO O OBJETO QUARTO DA CLASSE FILEWRITER
					   quartoArq.write(Id_quarto + "|" NomeQuarto + "|" + Descr + "|" + Qtde_cama + "|" + Tem_bath);
				           clienteArq.close();
					}catch(IOException e){
						System.out.println("Erro na gravação");
					}
					Id_quarto += 1;                                                                              //ID_QUARTO É AUTOINCREMENTAL
				}
				if(opcao == 2){

					System.out.println("Digite o Id do quarto");
					ident = digite.nextInt();
					for(Integer i : quarto){

						if(ident == i)
							cliente.remove(i);
						else if(i + 1 == quarto.size())
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
					for(Integer i : quarto){                                //PERCORRRENDO A ARRAY QUARTO
						if(ident == i){                                 //LISTANDO UM OBJETO
							System.out.println("Id : " + quarto[ident].getId_quarto());
							System.out.println("Quantidade de camas : " + quarto[ident].getQtde_cama());
							System.out.println("Nome do quarto : " + quarto[ident].getNomeQuarto());
							System.out.println("Descrição do quarto : " + quarto[ident].getDescricao());
							if(quarto[ident].isTem_bath())
								System.out.println("Tem banheiro");
							else
								System.out.println("Não tem banheiro");

							//OPÇÕES DE ALTERAÇÃO DO OBJETO QUARTO
							
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
										NomeQuarto = digite.next();
									}
									quarto[ident].setNomeQuarto(NomeQuarto);
								}
								
								if(alter == 2){

									Descr = NULL;;
									while(Descr == NULL){
										System.out.println("Descreva o quarto");
							 			Descr = digite.next();
									}
									quarto[ident].setDescricao(Descr);
								}
								
								if(alter == 3){

									System.out.println("Digite a nova quantidade");
									Qtde_cama = digite.nextInt();
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

								//ATUALIZANDO O ARQUIVO QUARTO
								
								try{
					                	   FileWriter quartoArq = new FileWriter("quarto" + ident + ".txt"); //SOBRESCREVE O OBJETO CLIENTE DA CLASSE FILEWRITER
					                           clienteArq.write(quarto[ident].getId_quarto() + "|" quarto[ident].getNome() + "|" + quarto[ident].getDescr() + "|" + 
										    quarto[ident].getQtde_cama() + "|" + quarto[ident].isTem_bath());
				           			   clienteArq.close();
								}catch(IOException e){
									System.out.println("Erro na gravação");
								}
							}
							while(alter != 5);
						} else if(i + 1 == quarto.size())
							System.out.println("Quarto não encontrado!");
					}
				}
			}
			while(opcao != 5);
			}

			// CRUD RESERVA
			
			if(op == 3){

				//OPÇÕES DO OBJETO RESERVA
				
				do{
				System.out.println("\nMenu de Opcoes\n");
				System.out.println("1 : Inserir Reserva");
				System.out.println("2 : Excluir Reserva");
				System.out.println("3 : Listar Reserva");
				System.out.println("4 : Alterar Reserva");
				System.out.println("5 : Sair");
 
				opcao = digite.nextInt();
				if(opcao < 1 || opcao > 5)
					System.out.println("Opcao invalida");
				if(opcao == 1){
					
					for(Integer i : cliente)                    // LISTA DE ARRAY CLIENTE
						System.out.println(i);         

					for(Integer i : quarto)                     // LISTA DE ARRAY QUARTO
						System.out.println(i);

					for(Integer i : cama)                       // LISTA DE ARRAY CAMA
						System.out.println(i);

					Reserva reserva[Id_reserva] = new Cliente(Id_reserva, 0, 0, 0, 0, 0);                             //CRIANDO UM OBJETO RESERVA
					System.out.println("Digite o Id do quarto, Id do Cliente, Id da cama, data de entrada e saída");

					// INSERINDO O ID DO QUARTO - VALOR FIXO E AUTOINCREMENTAL
					
					System.out.println("Digite o Id do quarto");
					ident = digite.nextInt();
					ok = false;
					while(ok != true){

						for(Integer i : quarto){                                                                  //PERCORRENDO A ARRAY QUARTO
							
							if(ident == i){
								ok = true;
								reserva[ident].setId_quarto(i);
							}else if(i == quarto.size())
								System.out.println("Id do quarto não encontrado");
						}
					}

					// INSERINDO O ID DO CLIENTE - VALOR FIXO E AUTOINCREMENTAL
					
					System.out.println("Digite o Id do cliente");
					ident = digite.nextInt();
					ok = false;
					while(ok != true){

						for(Integer i : cliente){                                                                 //PERCORRENDO A ARRAY CLIENTE
							
							if(ident == i){
								ok = true;
								reserva[ident].setId_cliente(i);
							}else if(i == quarto.size())
								System.out.println("Id do cliente não encontrado");
						}
					}

					// INSERINDO O ID DA CAMA - VALOR FIXO E AUTOINCREMENTAL
					
					System.out.println("Digite o Id da cama");
					ident = digite.nextInt();
					ok = false;
					while(ok != true){

						for(Integer i : cama){                                                                    //PERCORRENDO A ARRAY CAMA							
							if(ident == i){
								ok = true;
								reserva[ident].setId_cama(i);
							}else if(i == quarto.size())
								System.out.println("Id da cama não encontrado");
						}
					}

					ok = false;

					//VERIFICANDO O FORMATO DA DATA DE ENTRADA
					
					while(ok != true){
						System.out.println("Digite a data de entrada do cliente");
						Dt_in = digite.nextInt();
						Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
						Matcher compara = verif.matcher(Dt_in);
						ok = matcher.find();
						if(ok == false)
						System.out.println("data de entrada inválida");
					}
					reserva[ident].setDt_in(Dt_in);                                                                  //SET DA DATA DE ENTRADA NO OBJETO RESERVA

					ok = false;

					//VERIFICANDO O FORMATO DA DATA DE SAÍDA
					
					while(ok != true){
						System.out.println("Digite a data de saída do cliente");
						Dt_out = digite.nextInt();
						Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
						Matcher compara = verif.matcher(Dt_out);
						ok = matcher.find();
						if(ok == false)
						System.out.println("data de entrada invalida");
					}
					reserva[ident].setDt_out(Dt_out);                                                                //SET DA DATA DE SAÍDA NO OBJETO RESERVA

					reserva.add(Id_reserva);                                                                         //ADICIONANDO O ID RESERVA AO ARRAYLIST
					try{
					   File reservaeArq = new File("reserva" + Id_reserva + ".txt");                                 //CRIANDO O OBJETO RESERVA DA CLASSE FILE
					}catch(IOException e){
						System.out.println("Erro ao criar arquivo");
						e.printStackTrace();
					}
					try{
					   FileWriter reservaArq = new FileWriter("reserva" + Id_reserva + ".txt");                      //CRIANDO O OBJETO RESERVA DA CLASSE FILEWRITER
					   reservaArq.write(Id_reserva + "|" reserva[ident].getId_cliente() + "|" + reserva[ident].getId_quarto() + "|" + reserva[ident].getId_cama() + 
							    "|" + reserva[ident].getDt_in() + "|" + reserva[ident].getDt_in() + "|" + reserva[ident].getDt_out());
				           clienteArq.close();
					}catch(IOException e){
						System.out.println("Erro na gravação");
					}
					Id_reserva += 1;                                                                                 //INCREMENTANDO ID_RESERVA
				}

					
				if(opcao == 2){

					System.out.println("Digite o Id da reserva");
					ident = digite.nextInt();
					for(Integer i : reserva){

						if(ident == i)
							reserva.remove(i);
						else if(i == reserva.size())
							System.out.println("Reserva não encontrada");
					} 
				}
				if(opcao == 3){

					for(Integer i : reserva)
						System.out.println("- Reserva" + i + " Id = " + i);
				}
				if(opcao == 4){

					System.out.println("Digite o id da reserva para alterar");
					ident = digite.nextInt();
					for(Integer i : reserva){

						//LISTANDO A RESERVA SELECIONADA
						
						if(ident == i){
							System.out.println("Id : " + reserva[ident].getId_reserva());
							System.out.println("Id : " + reserva[ident].getId_cliente());
							System.out.println("Id : " + reserva[ident].getId_quarto());
							System.out.println("Id : " + reserva[ident].getId_cama());
							System.out.println("Data de entrada: " + reserva[ident].getDt_in());
							System.out.println("Data de saída: " + reserva[ident].getDt_out());

							//OPÇOES DE ALTERAÇÃO
							
							do{
								System.out.println("\nOpções:\n");
								System.out.println("1 : Id cliente ");
								System.out.println("2 : Id quarto ");
								System.out.println("3 : Id cama ");
								System.out.println("4 : Data de entrada ");
								System.out.println("5 : Data de saída ");
								System.out.println("6 : Sair ");

								System.out.println("Digite a opção ");
								alter = digite.nextInt();
								if(alter < 1 || alter > 6)
									System.out.println("Opção invalida ");
								if(alter == 1){

									System.out.println("Digite o Id do cliente");
									ident = digite.nextInt();
									ok = false;
									while(ok != true){

										for(Integer i : cliente){                                          //PERCORRENDO O ARRAY CLIENTE
							
											if(ident == i){
												ok = true;
												reserva[ident].setId_cliente(i);
											}else if(i == quarto.size())
												System.out.println("Id do cliente não encontrado");
										}
									}
								}
								
								if(alter == 2){

									System.out.println("Digite o Id do quarto");
									ident = digite.nextInt();
									ok = false;
									while(ok != true){

										for(Integer i : quarto){                                          //PERCORRENDO O ARRAY QUARTO
							
											if(ident == i){
												ok = true;
												reserva[ident].setId_quarto(i);
											}else if(i == quarto.size())
												System.out.println("Id do quarto não encontrado");
										}
									}
								}
								
								if(alter == 3){

									System.out.println("Digite o Id da cama");
									ident = digite.nextInt();
									ok = false;
									while(ok != true){

										for(Integer i : cama){                                        //PERCORRENDO O ARRAY CAMA
							
											if(ident == i){
												ok = true;
												reserva[ident].setId_cama(i);
											}else if(i == quarto.size())
												System.out.println("Id da cama não encontrado");
										}
									}
								}
								
								if(alter == 4){

									ok = false;

									//VERIFICANDO O FORMATO DA DATA DE ENTRADA
					
									while(ok != true){
										System.out.println("Digite a nova data");
										Dt_in = digite.nextInt();
										Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
										Matcher compara = verif.matcher(Dt_in);
										ok = matcher.find();
										if(ok == false)
											System.out.println("data de entrada inválida");
									}
									reserva[ident].setDt_in(Dt_in);                                      //SET DA DATA DE ENTRADA NO OBJETO RESERVA

								}
								if(alter == 5){

									ok = false;

									//VERIFICANDO O FORMATO DA DATA DE SAÍDA
					
									while(ok != true){
										System.out.println("Digite a data de saída do cliente");
										Dt_out = digite.nextInt();
										Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
										Matcher compara = verif.matcher(Dt_out);
										ok = matcher.find();
										if(ok == false)
											System.out.println("data de entrada invalida");
									}
									reserva[ident].setDt_out(Dt_out);
								}

								//ATUALIZANDO O ARQUIVO RESERVA
								
								try{
					                	   FileWriter reservaArq = new FileWriter("reserva" + ident + ".txt"); //SOBRESCREVE O OBJETO RESERVA DA CLASSE FILEWRITER
					                           reservaArq.write(reserva[ident].getId_reserva() + "|" reserva[ident].getId_cliente() + "|" + reserva[ident].getId_quarto() + "|" + 
										    reserva[ident].getId_cama() + "|" + reserva[ident].getDt_in() + "|" + reserva[ident].getDt_out());
				           			   clienteArq.close();
								}catch(IOException e){
									System.out.println("Erro na gravação");
								}
							}
								while(alter != 6);
						} else
							System.out.println("Reserva não encontrada!");
					}
				}
			}
			while(opcao != 5);
			}

			}

			// CRUD CAMA
			
			if(op == 4){

			//OPÇÕES DO OBJETO CAMA
			
			do{
				System.out.println("\nMenu de Opcoes\n");
				System.out.println("1 : Inserir Cama");
				System.out.println("2 : Excluir Cama");
				System.out.println("3 : Listar Cama");
				System.out.println("4 : Alterar Cama");
				System.out.println("5 : Sair");
 
				opcao = digite.nextInt();
				if(opcao < 1 || opcao > 5)
					System.out.println("Opcao invalida");
				if(opcao == 1){

					Cama cama[Id_cama] = new Cliente(Id_cama, 0, NULL, NULL, Eh_bel);                          //CRIANDO O OBJETO CAMA
					System.out.println("Digite o Codigo da cama, a posição, a descrição da cama e se é beliche");
					
					System.out.println("Digite o Código da cama");
					ident = digite.nextInt();
					cama[Id_cama].setCod_cama(ident);
					
					System.out.println("Digite a posição da cama");
					ident = digite.next();
					cama[Id_cama].setPos_cama(ident);
					
					System.out.println("Descreva a cama");
					ident = digite.next();
					cama[Id_cama].setDescr_cama(ident);

					System.out.println("É beliche : 1 - sim, 2 - nao");
					eh_bel = digite.nextInt();
					if(eh_bel < 1 || eh_bel > 2)
						System.out.println("Opcao invalida);
					else if(eh_bel == 1){
						Eh_bel = true;
						cama[Id_cama].setEh_bel(Eh_bel);
					}
					else{
						Eh_bel = false;
						cama[Id_cama].setEh_bel(Eh_bel);
					}
					cama.add(Id_cama);                                                                   //ADICIONANDO O ID_CAMA NO ARRAYLIST
					try{
					   File reservaeArq = new File("reserva" + Id_reserva + ".txt");                     //CRIANDO O OBJETO RESERVA DA CLASSE FILE
					}catch(IOException e){
						System.out.println("Erro ao criar arquivo");
						e.printStackTrace();
					}
					try{
					   FileWriter camaArq = new FileWriter("cama" + Id_cama + ".txt");                   //CRIANDO O OBJETO CAMA DA CLASSE FILEWRITER
					   camaArq.write(Id_cama + "|" cama[ident].getCod_cama() + "|" + cama[ident].getPos_cama() + "|" + cama[ident].getDescr_cama() + 
							    "|" + cama[ident].getEh_bel());
				           clienteArq.close();
					}catch(IOException e){
						System.out.println("Erro na gravação");
					}
					Id_cama += i;                                                                        //INCREMENTANDO O ID_CAMA

				}

					
				if(opcao == 2){

					System.out.println("Digite o Id da cama");
					ident = digite.nextInt();
					for(Integer i : cama){                                                               //PERCORRENDO O ARRAY CAMA

						if(ident == i)
							cama.remove(i);
						else if(i == cama.size())                  
							System.out.println("Cama não encontrada");
					} 
				}
				if(opcao == 3){

					for(Integer i : cama)
						System.out.println("- Cama" + i + " Id = " + i);
				}
				if(opcao == 4){

					System.out.println("Digite o id da cama para alterar");
					ident = digite.nextInt();
					for(Integer i : cama){

						//LISTANDO A CAMA SELECIONADA
						
						if(ident == i){
							System.out.println("Id : " + cama[ident].getId_cama());
							System.out.println("Código : " + cama[ident].getCod_cama());
							System.out.println("Posição : " + cama[ident].getPos_cama());
							System.out.println("Id : " + cama[ident].getDescr_cama());
							if(quarto[ident].isEh_bel())
								System.out.println("É beliche");
							else
								System.out.println("Não É beliche");

							//OPÇÕES DE ALTERAÇÃO DO OBJETO CAMA
							
							do{
								System.out.println("\nOpções:\n");
								System.out.println("1 : Código da cama ");
								System.out.println("2 : Posição ");
								System.out.println("3 : Descrição ");
								System.out.println("4 : É beliche? ");
								System.out.println("5 : Sair ");

								System.out.println("Digite a opção ");
								alter = digite.nextInt();
								if(alter < 1 || alter > 5)
									System.out.println("Opção invalida ");
								if(alter == 1){

									System.out.println("Digite o Código da cama");
					                                Cod_cama = digite.nextInt();
					                                cama[ident].setCod_cama(Cod_cama);	
								}
								
								if(alter == 2){

									System.out.println("Digite a posição da cama");
									Pos_cama = digite.next();
									cama[ident].setPos_cama(Pos_cama);
								}
								
								if(alter == 3){

									System.out.println("Descreva a cama");
					                                Descr_cama = digite.next();
					 				cama[ident].setDescr_cama(Descr_cama);
								}
								
								if(alter == 4){

									System.out.println("É beliche : 1 - sim, 2 - nao");
									eh_bel = digite.nextInt();
									if(eh_bel < 1 || eh_bel > 2)
										System.out.println("Opcao invalida);
									else if(eh_bel == 1){
										Eh_bel = true;
										cama[ident].setEhbel(Eh_bel);
									}
									else{
										Eh_bel = false;
										cama[ident].setEhbel(Eh_bel);
									}	
								}

								//ATUALIZANDO O ARQUIVO CAMA
								
								try{
				   				  FileWriter camaArq = new FileWriter("cama" + ident + ".txt"); //SOBRESCREVE O OBJETO RESERVA DA CLASSE FILEWRITER
				                                  camaArq.write(cama[ident].getId_cama() + "|" cama[ident].getCod_cama() + "|" + cama[ident].getPos_cama() + "|" + 
				                                  reserva[ident].getDescr_cama() + "|" + reserva[ident].isEh_bel());
				                                  clienteArq.close();
				                                  }catch(IOException e){
					                          System.out.println("Erro na gravação");
				                                }
							}
								while(alter != 5);
						} else
							System.out.println("Cama não encontrada!");
					}
				}
				
			}
			while(opcao != 5);
			}
			
		}
		while(op != 5);
	}

}
