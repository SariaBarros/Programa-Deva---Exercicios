package corrida;

import java.security.KeyStore;

public class CarroCorrida {
    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    //Construtor
    public CarroCorrida(Integer numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }
    //Setters e Getters

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    //Metodos

    public void acelerar(float valor){
        float novaVelocidade = getVelocidadeAtual()+valor;
        if(ligado && novaVelocidade <= getVelocidadeMaxima()){
            setVelocidadeAtual(novaVelocidade);
        }
    }
    public void frear(float valor){
        float novaVelocidade = getVelocidadeAtual()-valor;
        if (novaVelocidade >= 0.0 && ligado){
            setVelocidadeAtual(novaVelocidade);
        }else if(ligado){
           parar();
        }
    }
    public void parar(){
        setVelocidadeAtual(0);
    }
    public void ligar(){
        setLigado(true);
    }
    public void desligar(){
        setLigado(false);
    }
}
