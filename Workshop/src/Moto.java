package src;

public class Moto extends Veiculo {
    
    public Moto(String marcaDaMoto, String modeloDaMoto) {
        super(marcaDaMoto, modeloDaMoto);
    }

    @Override
    public void acelera(Integer kmporHora) {
        System.out.println("Acelerando a moto....");
        this.velocidade = velocidade + kmporHora;
        
    }

    @Override
    public void desacelera(Integer kmporHora) {
        System.out.println("Desacelerando a moto....");
        this.velocidade = velocidade + kmporHora;
        
    }
}
