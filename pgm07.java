import java.util.Scanner;

class Pgm07 {
    
    public static void main(String[] args) {
        int x, menor, maior;
        int soma = 0, qtd = 0;
        double media;
        Scanner ler = new Scanner(System.in);
        
        System.out.print(" Qual o primeiro valor de X? ");
        x = ler.nextInt(); 
        menor = x;
        maior = x;

        while ( x > 0 )  {
            soma += x;
            qtd += 1;
            if (x < menor)
                menor = x;
            if (x > maior)
                maior = x;
            System.out.println(" Digite x: ");
            x = ler.nextInt();
        }
        media = (double) soma / qtd; //ou multiplica por 1.0.

        System.out.println("Menor valor = " + menor);
        System.out.println("Maior valor = " + maior);
        System.out.println("Quantidade = " + qtd);
        System.out.println("Media = " + media);

        ler.close();
    }
}