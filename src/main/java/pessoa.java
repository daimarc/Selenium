
//Classe
public class pessoa {
    public String nome;
    public int idade;
    public String endereco;

    //Construtor é o que essa classe pessoa precisa para criar um objeto
    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }
    //Método
    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);

    }
}
