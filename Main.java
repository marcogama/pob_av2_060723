package pob_av2_060723;
import java.util.*;
import java.util.regex.*;
public class Main {

	public static int Busca(){

		ArrayList<Integer> busca = new ArrayList<Integer>();
		for(int i : busca){
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
		
		ArrayList<cama> = new ArrayList<cama>();
		ArrayList<cliente> = new ArrayList<cliente>();
		ArrayList<quarto> = new ArrayList<quarto>();
		ArrayList<reserva> = new ArrayList<reserva>();

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
					int Cpf, Dt_nasc, Cep;
					boolean ok;
					
					cliente.add("cliente" + i);
					System.out.println("Digite os dados do cliente: nome, cpf, data de nascimento(dd/mm/aa, endereco, cep,
							   email, numero do passaporte, Pais");

					Scanner nome = new Scanner(System.in);
					Nome = nome.next();
					Scanner end = new Scanner(System.in);
					End = end.next();
					Scanner email = new Scanner(System.in);
					ok = false;
					while(ok != true){
						Email = nome.next();
						Pattern verif = Pattern.compile(["@."|"@.com"|"com."|"^\b."|\s], pattern.LITERAL);
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
					Cpf = nome.nextInt();
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
					
				}

			}
		}
	}

}
