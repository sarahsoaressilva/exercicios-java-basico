import java.util.Scanner;

class Pgm04 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner leitor2;
        
        leitor2 = new Scanner(System.in);
        

        System.out.print(" Digite a: ");
        a = leitor2.nextInt(); 

        System.out.print(" Digite b: ");
        b = leitor2.nextInt();

        System.out.print(" Digite c: ");
        c = leitor2.nextInt();

        leitor2.close();

        if ( (a+b>c) && (b+c>a) && (a+c>b) ) { //primeiro if
            System.out.println("Capaz de formar um triangulo!");
            if ( (a == b) && (b ==c ) ) //segundo if.
                System.out.println("Equilatero!");
            else if ( (a == b) || (a == c) || (b == c) )
                System.out.println("Isoceles!");
            else
                System.out.println("Escaleno!");
            } 

        else {
                System.out.println("Nao forma triangulo!");
        } //final primeiro.

    }
}
