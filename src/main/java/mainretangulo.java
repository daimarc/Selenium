public class mainretangulo {
    public static void main(String[] args) {
        retangulo retangulocriado = new retangulo (3, 4);
        int areadoretangulo = retangulocriado.calcularArea(retangulocriado.largura, retangulocriado.altura);
        System.out.println("Area do retangulo é: " + areadoretangulo);

    }

}
