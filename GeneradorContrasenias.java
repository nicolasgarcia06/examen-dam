import java.util.Scanner;

public class GeneradorContrasenias {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("introduce tu nombre: ");
    String nombre=sc.nextLine();
    System.out.print("tu ciudad es : ");
    String ciudad=sc.nextLine();
    System.out.print("tu numero de la suerte es: ");
    int numero=sc.nextInt();sc.nextLine();
    ContraseniaEfectiva(nombre,ciudad,numero);
    sc.close();
}
public static void ContraseniaEfectiva(String nombre, String ciudad, int numero){
    
String primeraLetras=nombre.substring(0,3);
String ultimaLetra=ciudad.substring(ciudad.length()-2);
var contrasenia=primeraLetras+ultimaLetra+numero;
System.out.print("tu contraseñagenerada es :<"+contrasenia+">");
}
}
