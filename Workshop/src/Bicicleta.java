package src;

public class Bicicleta extends Veiculo {
    

    private Boolean liquidoSelanteOk = true;


    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    public Boolean isLiquidoSelanteOk() {
        return liquidoSelanteOk;
    }

    public void setLiquidoSelante(Boolean liquidosOk) {
        liquidoSelanteOk =  liquidosOk;
    }



    @Override
    public void acelera(Integer kmporHora) {
        this.velocidade = velocidade + kmporHora;
    }

    @Override
    public void desacelera(Integer kmporHora) {
        this.velocidade = velocidade - kmporHora;
    }

}