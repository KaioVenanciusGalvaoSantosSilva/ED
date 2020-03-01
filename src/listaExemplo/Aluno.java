package listaExemplo;

public class Aluno {

	String nome;
	String RA;
	int idade;

	public Aluno(String nome, String RA, int idade) {

		this.nome = nome;
		this.RA = RA;
		this.idade = idade;
	}

	public void imprimiDado() {
		System.out.println("Nome= " + nome);

		System.out.println("RA= " + RA);

		System.out.println("Idade= " + idade);
	}

}
