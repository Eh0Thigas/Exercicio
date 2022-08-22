import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;

        System.out.println("Digite um valor pra X");
        x = s.nextInt();

        if(x%2 == 0){
            System.out.println(x + " / 2  = ");
            x = x/2;
            System.out.println(x);
            
        }else if (x%2 == 1){
            System.out.println(x + " = " + " 3 * " + x + " + 1 = ");
            x = 3 * x + 1;
            System.out.println(x);
        }

    }
}
