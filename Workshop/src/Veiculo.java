package src;

public abstract class Veiculo {

   //Parte encapsulada.
    private String marca;
    private String modelo;
    protected Integer velocidade = 0;
    private Boolean pneusBons = true;
    
    //Definição de um construtor.
    public Veiculo(String marcaDoVeiculo, String modeloDoVeiculo) {  
      marcaDoVeiculo = marca;
      modeloDoVeiculo = modelo;
   }

    public Boolean isPneusBons() {
       return pneusBons;
    }

    public void setPneusBons(Boolean pneusEstaoBons) {
       pneusBons = pneusEstaoBons;
    };
   
    public String getDescricao() {
       return marca + " " + modelo;
    }

    public Integer getVelocidade() {
       return velocidade;
    }

    public abstract void acelera(Integer kmporHora);
    public abstract void desacelera(Integer kmporHora);
    
    public String getMarca() { 
      return marca; 
    }
      
    public String getModelo() { 
       return modelo;
    }
       
     public void setMarca(String novaMarca) {
         marca = novaMarca;
     }
         
     public void setModelo(String novoModelo) {
        modelo = novoModelo;    
     }

}        
