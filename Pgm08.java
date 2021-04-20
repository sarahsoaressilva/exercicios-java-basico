import java.util.Scanner;

class Pgm08 {
    
    public static void main(String[] args) {
        int x, min, max;
        int soma = 0, qtd = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.print(" Qual o valor de Min? ");
        min = ler.nextInt(); 

        System.out.print(" Qual o valor de Max? ");
        max = ler.nextInt(); 

        if (min > max) {
            System.out.println("Valores ao contrário!");
            x = min;
            min = max;
            max = x;
        }

        System.out.println(" Digite x: ");
        x = ler.nextInt();

        while ( x > 0 )  {

            if ( (min <= x) && (x <= max) ) {
              soma += x;
              qtd++;
            } 
            else 
                 System.out.println("Valor fora do intervalo [" + min + " , " + max + "] ignorado na totalizacao");
            
            System.out.println(" Digite x: ");
            x = ler.nextInt();
        }

        //terminar essa parte.
        if (qtd > 0) {
           System.out.println("Soma dos valores = " + soma);
           System.out.println("Quantidade = " + qtd);
           ler.close();
        }
    }
}