package src;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Honda", "City");
        Moto moto = new Moto("Harley-Davidson", "XLCR 1000");
        Bicicleta bicicleta = new Bicicleta("Caloi", "MTB aro 29");

        Oficina oficina = new OficinaDeCarroeMoto();
        Oficina oficinaBike = new OficinaDeBicicleta();

        carro.setPortasTrancando(false);
        bicicleta.setLiquidoSelante(false);
        moto.setPneusBons(false);

        System.out.println("-------- OFICINA DE CARRO E MOTO ---------\n");
        Integer valorDoReparo = oficina.OrcamentoVeiculo(carro);
        System.out.println("O custo do reparo do meu carro é R$" + valorDoReparo);

        valorDoReparo = oficina.OrcamentoVeiculo(moto);
        System.out.println("O custo do reparo da minha moto é R$" + valorDoReparo);



        System.out.println("\n-------- OFICINA DE BIBICLETA ---------\n");
        Integer valorReparo2 = oficinaBike.OrcamentoVeiculo(bicicleta);
        System.out.println("O custo do reparo da minha bicicleta é R$" + valorReparo2);


        
    } 
}
