package corrida;

public class Main {

    public static void main(String[] args) {
        Piloto pilotoVermelho = new Piloto("Red", 20, Sexo.FEMININO);
        CarroCorrida carroVermelho = new CarroCorrida(10, pilotoVermelho, 150, 100, true);
        System.out.println(carroVermelho);
        carroVermelho.acelerar(25);
        System.out.println("Velocidade atual é " + carroVermelho.getVelocidadeAtual());
        carroVermelho.frear(50);
        System.out.println("Velocidade atual é " + carroVermelho.getVelocidadeAtual());
        carroVermelho.acelerar(100);
        System.out.println("Velocidade atual é " + carroVermelho.getVelocidadeAtual());
        carroVermelho.desligar();
        carroVermelho.frear(100);
        carroVermelho.parar();
        carroVermelho.desligar();
        carroVermelho.acelerar(10);
    }


}