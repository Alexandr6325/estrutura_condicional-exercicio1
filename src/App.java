import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        if (n<0){
            System.out.println("NEGATIVO!!");
        }else {
            System.out.println("NAO NEGATIVO");
        }
    }
}
