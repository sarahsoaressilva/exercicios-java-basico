package src;

public class OficinaDeCarroeMoto extends Oficina {

    @Override
    public Integer OrcamentoVeiculo(Veiculo veiculo) {
        Integer valorTotalDoOrcamento = 0;
        peçasVeiculos peçasNovas = new peçasVeiculos();

        if(veiculo instanceof Carro) {
            System.out.println("\nConsertando o carro");
            Carro carro = (Carro) veiculo;

            if(carro.isPortasTrancando()) {
                System.out.println("As portas não precisam de reparo.");
            } else {
                System.out.println("As portas precisam ser consertadas.");
                valorTotalDoOrcamento += 550;
            }

        } else if (veiculo instanceof Moto) {
            System.out.println("\nConsertando a moto");
            Moto moto = (Moto) veiculo;

            System.out.println("Adicionado Cabo de Freio");
            peçasNovas.setNomePeça("Cabo de Freio");
            peçasNovas.setValorpeça(33);
            valorTotalDoOrcamento += 33;
        }
        
        if(veiculo.isPneusBons()) {
            System.out.println("Os pneus não precisam ser trocados.");
        } else {
            System.out.println("Os pneus precisam ser trocados.");
            valorTotalDoOrcamento += 150;
        }

        return valorTotalDoOrcamento;
    }
    
}