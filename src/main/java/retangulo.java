public class retangulo {
    //Crie uma classe chamada "Retangulo" com os atributos "largura" e "altura".
    // Implemente um método chamado "calcularArea" que retorna a área do retângulo (largura * altura).
    // Em seguida, crie um objeto dessa classe, atribua valores aos atributos e
    // chame o método "calcularArea" para exibir o resultado.

    public int largura;
    public int altura;


    public retangulo (int largura, int altura){
        this.altura = altura;
        this.largura = largura;



    }
    //Metodo
    public int calcularArea(int largura, int altura){
        return largura * altura;

    }

}
