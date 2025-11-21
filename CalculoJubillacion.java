import java.util.Scanner;

public class CalculoJubillacion {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("introduce tu edad: ");
    int edad=sc.nextInt();
    System.out.print("edad de jubilacion: ");
    int jubilacion=sc.nextInt();sc.nextLine();
    CalculoEdad(edad, jubilacion);
sc.close();
}
public static void CalculoEdad(int edad,int jubilacion){
    if(jubilacion>edad){
    int edadRestante=jubilacion-edad;
      System.out.printf("faltan %d años para tu jubilacion",edadRestante);
}
    else{
        System.out.println("ya se ha jubilado");
    }
    
}
}
