import java.util.Scanner;


class Pgm06 {
    
    public static void main(String[] args) {
        int x; 
        Scanner ler = new Scanner(System.in);
        
        System.out.print(" Qual o primeiro valor de X? ");
        x = ler.nextInt(); 

        //executa a condicão antes dos comandos.
        // do while --> executa o comando antes da condição.
        
        while (x != 0) {
            if (x > 0) 
                System.out.println("X = positivo");
            else
                System.out.println("X = negativo");
            
            System.out.println("Proximo valor: ");
            x = ler.nextInt();
        }
        ler.close();
    }
}