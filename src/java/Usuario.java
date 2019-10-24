
import java.util.Scanner;

public class Usuario {
    static String nome;
    static String email;
    static String senha;
    
        
    static void pedirnome (){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite seu nome: " );
        nome = scanner.nextLine();
           }
    
    static void pediremail (){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite seu email: " );
        email = scanner.nextLine();
           }
    
    static void pedirsenha (){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite sua senha: " );
        senha = scanner.nextLine();
           }
    
    
}
