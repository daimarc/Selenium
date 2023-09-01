public class main {
    public static void main(String[] args) {
        //Criando dois objetos (pessoa e pessoa2) da classe pessoa
        pessoa pessoa = new pessoa("Daimar", 37);
        pessoa pessoa2 = new pessoa("Ana", 23);
        //Chamando o método da classe pessoa, para os 2 objetos
        pessoa.mostrarInformacoes();
        pessoa2.mostrarInformacoes();
    }

}
