package pob_av2_060723;
import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

	public static int Busca(int id){

		for(int i : ){
			if(i == id)
				return id;
		}
	}
	public static Alter(){

		for(int i : altera){

			if(i == id){
				
			}
		}
	}
	public static Insere(){

		for(int j : insere){

			if(j == insere){
				
			} 
		}
	}
	public static Exclui(){

		for(int j : exclui){

			if(j == exclui){
				
			}
		}
	}
	public static Lista(){

		for(int k : lista){

			System.out.println(id + ": " );
		}
	}
	static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner digite = new Scanner(System.in);
		Cama cama = new Cama();
		Cliente cliente = new Cliente();
		Quarto quarto = new Quarto();
		Reserva reserva = new reserva();
		
		ArrayList<Integer> cama = new ArrayList<Integer>();
		ArrayList<Integer> cliente = new ArrayList<Integer>();
		ArrayList<Integer> quarto = new ArrayList<Integer>();
		ArrayList<Integer> reserva = new ArrayList<Integer>();

		int op, opcao, i, j, k, l;
		i = j = k = l = 1;
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

					String Nome, End, Email, Pais, Num_pas;
					int Id, Cpf, Dt_nasc, Cep;
					boolean ok;
					Nome = End = Email = Pais = Num_pas = NULL;
					Id = Cpf = Dt_nasc = Cep = 0;
					
					System.out.println("Digite os dados do cliente: nome, cpf, data de nascimento(dd/mm/aa, endereco, cep,
							   email, numero do passaporte, Pais");

					Scanner nome = new Scanner(System.in);
					Id = i;
					Nome = nome.next();
					if(Nome == NULL){
						while(Nome == NULL)
							System.out.println("Digite o nome do cliente");
					}
					Scanner end = new Scanner(System.in);
					End = end.next();
					if(end == NULL){
						while(end == NULL)
							System.out.println("Digite o endereco");
					}
					Scanner email = new Scanner(System.in);
					ok = false;
					while(ok != true){
						Email = nome.next();
						Pattern verif = Pattern.compile(["@."|"@.com"|"@.com."|"^\b."|\s], pattern.LITERAL);
						Matcher compara = verif.matcher(Email);
						ok = matcher.find();
						if(ok == false)
						System.out.println("email invalido");
					}
					Scanner pais = new Scanner(System.in);
					Pais = pais.next();
					Scanner num_pas = new Scanner(System.in);
					Num_pas = num_pas.next();
					Scanner cpf = new Scanner(System.in);
					Cpf = cpf.nextInt();
					if(Cpf == 0){
						while(Cpf == 0)
							System.out.println("Digite o CPF");
					}
					Scanner dt_nasc = new Scanner(System.in);
					ok = false;
					while(ok != true){
						Dt_nasc = nome.nextInt();
						Pattern verif = Pattern.compile([0-9|"/"|^a-z|^A-Z|\s]);
						Matcher compara = verif.matcher(Email);
						ok = matcher.find();
						if(ok == false)
						System.out.println("data de nascimento invalida");
					}
					Scanner cep = new Scanner(System.in);
					Cep = cep.nextInt();

					Cliente cliente[i] = new Cliente(Id, Cep, Cpf, Dt_nasc, Nome, End, Pais, Num_pas, Email);
					cliente.add(Id);
					i = i + 1;
				}
				if(opcao == 2){

					System.out.println("Digite o Id do cliente");
					int ident = nextInt();
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
					int ident = nextInt();
					for(Integer i : cliente)
						if(ident == i){
							System.out.println("Id : " + cliente[ident].getId());
							System.out.println("Cep : " + cliente[ident].getCep());
							System.out.println("Cpf : " + cliente[ident].getCpf());
							System.out.println("Data de Nascimento : " + cliente[ident].getDt_nasc());
							System.out.println("Nome : " + cliente[ident].getNome());
							System.out.println("Endereço : " + cliente[ident].getEnd());
							System.out.println("País : " + cliente[ident].getPais());
							System.out.println("Numero do passaporte : " + cliente[ident].getNum_pas());
							System.out.println("Email : " + cliente[ident].getEmail());
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
								int alter = digite.nextInt();
								if(alter < 1 || alter > 9)
									System.out.println("Opção invalida ");
								if(alter == 1){

									Scanner nome = new Scanner(System.in);
									System.out.println("Digite o novo nome");
    									String Nome = nome.next();
									cliente[ident].setNome(Nome);
								}
							}
						} else
							System.out.println("Cliente não encontrado!");
				}

			}
		}
	}

}
