public class triangulo {
    //Crie uma classe chamada "Triangulo" com os atributos "lado1", "lado2" e "lado3". Implemente um método
    // "ehEquilatero" que retorna true se o triângulo for equilátero (todos os lados iguais), e false caso contrário.
    // Crie um objeto da classe "Triangulo", atribua valores aos lados e teste o método para verificar se o triângulo é equilátero.

    public int lado1;
    public int lado2;
    public int lado3;

    public triangulo (int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    public boolean ehEquilatero (int lado1, int lado2, int lado3){
        return (lado1 == lado2) && (lado2 == lado3);

    }


}
