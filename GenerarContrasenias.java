import java.util.Scanner;

public class GenerarContrasenias {
public static void CalculoContrasenia(String nombre,String ciudad,int numero){
    Scanner sc=new Scanner(System.in);
    do{
        try{
    System.out.println("introduce nombre: ");
     nombre=sc.nextLine();
    System.out.println("introduce ciudad: ");
    ciudad=sc.nextLine();
    
    }
    System.out.println("introduce numero de la suerte: ");
numero=sc.nextInt();sc.nextLine();
String contrasenia=nombre.substring(0,3)+numero+ciudad.substring(ciudad.length()-2);
System.out.println(contrasenia);
sc.close();

}
public static void main(String[] args) {
    CalculoContrasenia(null, null, 0);
}
}
