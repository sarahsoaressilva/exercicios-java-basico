import java.util.Scanner;

class Pgm09a {
    
    public static void main(String[] args) {
        int x, min, max, i;
        int soma = 0, qtd = 0;
        int v[];
        v = new int[100];
        //o tamanho do vetor não pode ser alterado depois.
        Scanner ler = new Scanner(System.in);
        
        System.out.print(" Qual o valor de Min? ");
        min = ler.nextInt(); 

        System.out.print(" Qual o valor de Max? ");
        max = ler.nextInt(); 

        if (min > max) {
            System.out.println("Valores ao contr�rio!");
            x = min;
            min = max;
            max = x;
        }

        System.out.println(" Digite x: ");
        x = ler.nextInt();

        while ( x > 0 )  {

            if ( (min <= x) && (x <= max) ) {
              v[qtd] = x;
              soma += x;
              qtd++;
            } 
            else 
                 System.out.println("Valor fora do intervalo [" + min + " , " + max + "] ignorado na totalização");
            
            System.out.println(" Digite x: ");
            x = ler.nextInt();
        }
        ler.close();
        //terminar essa parte.
        if (qtd > 0) {
            for (i=0; i < qtd; i++)
                System.out.print("[" + i + "]:" + v[i] + " ");

           System.out.println("\nSoma dos valores = " + soma);
           System.out.println("Quantidade = " + qtd);
        }
    }
}