package src;

public class Carro extends Veiculo {
    
    private Boolean portasTrancando = true;

    public Carro(String marcaDoCarro, String modeloDoCarro) {
        super(marcaDoCarro, modeloDoCarro);
    }

    public Boolean isPortasTrancando() {
        return portasTrancando;
    }

    public void setPortasTrancando(Boolean portasEstaoTrancando) {
        portasTrancando =  portasEstaoTrancando;
    }


    @Override
    public void acelera(Integer kmporHora) {
        System.out.println("Acelerando o carro....");
        this.velocidade = velocidade + kmporHora;
    }

    @Override
    public void desacelera(Integer kmporHora) {
        System.out.println("Desacelerando o carro....");
        this.velocidade = velocidade + kmporHora;
    }

}