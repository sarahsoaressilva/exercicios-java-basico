package src;

public class OficinaDeBicicleta extends Oficina {
    

    @Override
    public Integer OrcamentoVeiculo(Veiculo veiculo) {
        Bicicleta bicicleta = (Bicicleta) veiculo;
        Integer valorTotalDoOrcamento = 0;

        if(bicicleta.isPneusBons()) {
            System.out.println("Os pneus da sua bicicleta não precisam ser trocados.");
        } else {
            System.out.println("Os pneus estão danificados.");
            valorTotalDoOrcamento += 150;
        }

        if(bicicleta.isLiquidoSelanteOk()) {
            System.out.println("Sua bicicleta tem líquido selante nas rodas.");
        } else {
            System.out.println("Seu liquido selante precisa ser recolocado.");
            valorTotalDoOrcamento += 45;
        }


        return valorTotalDoOrcamento;
    }
    
}