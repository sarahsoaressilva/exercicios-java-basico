import java.util.Scanner;


class Pgm05 {
    
    public static void main(String[] args) {
        String nome; 
        double peso; 
        String categoria;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        

        System.out.print(" Qual o nome do lutador? ");
        nome = teclado.nextLine(); 

        System.out.print(" Qual o peso do lutador? ");
        peso = teclado.nextDouble();

        teclado.close();

        if ( peso < 65 ) 
            categoria = "Ligeiro";
        else if (peso < 86 ) 
            categoria = "Meio Medio";
        else if ( peso < 93 )
            categoria = "Medio";
        else if (peso < 100)
            categoria = "Meio Pesado";
        else
            categoria = "Pesado";
        System.out.println("O (a) lutador(a) " + nome + " pesa " + peso + " e sua categoria é" + categoria);
    }
}