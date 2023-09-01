public class maintriangulo {
    public static void main(String[] args) {
        triangulo triangulocriado = new triangulo(3,3,3);
        boolean trianguloequilatero = triangulocriado.ehEquilatero(triangulocriado.lado1, triangulocriado.lado2, triangulocriado.lado3);

        System.out.println("O triangulo eh equilatero? " + trianguloequilatero);
    }
}
