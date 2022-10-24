package corrida;

public class Main {

    public static void main(String[] args) {
        Piloto pilotoVermelho = new Piloto("Red", 20, Sexo.FEMININO);
        CarroCorrida carroVermelho = new CarroCorrida(10, pilotoVermelho, 150, 100, true);
        System.out.println(carroVermelho);
        carroVermelho.acelerar(25);
        System.out.println("Velocidade atual é " + carroVermelho.getVelocidadeAtual());
    }


}