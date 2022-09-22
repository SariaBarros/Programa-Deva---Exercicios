public class CalculoCombustivel {
    public static void main(String[] args) {
        double distancia, tempo, velocidadeMedia, litrosUsados;
        final double kmPorLitro = 12.0;

        tempo = 10.0;
        velocidadeMedia = 45.0;

        distancia = tempo*velocidadeMedia;
        litrosUsados = distancia/kmPorLitro;

        System.out.printf("A velocidade média é: %.2f\n", velocidadeMedia);
        System.out.printf("O tempo gasto é: %.2f\n", tempo);
        System.out.printf("A distancia percorrida foi de: %.2f\n", distancia);
        System.out.printf("A quantidade de litros usados é %.2f\n:", litrosUsados);
    }
}
