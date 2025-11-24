import java.util.Scanner;

public class CentroControl {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=0;
    do{
        System.out.println(" === CENTRO DE CONTROL ===");
        System.out.println("1. Mostrar saludo");
        System.out.println("2. Calcular descuento");
        System.out.println("3. Evaluar temperatura");
        System.out.println("Elige una opción (1-3):");
      try{
        String opcion=sc.nextLine();
        n=Integer.parseInt(opcion);
        switch (n) {
           case 1 -> System.out.println("hola a todos");
           case 2 ->CalcularMetodo();
          
           case 3 ->TemperaturaGrados();
           default ->System.out.println("error");
        }
      }
      catch(Exception e){
        System.out.println("error , introduce otro numero: ");
      }
    }
    while(n !=3);
    sc.close();
}
public static void CalcularMetodo(){
    Scanner sc=new Scanner(System.in);
    System.out.println("introduce el precio en euro:");
double precio=sc.nextDouble();sc.nextLine();
double descuento=precio*10/100;
double precioFinal=precio-descuento;
System.out.printf("el precio final es %f ",precioFinal);

sc.close();
}
public static void TemperaturaGrados(){
     Scanner sc=new Scanner(System.in);
     System.out.println("introduce temperatura");
int temperatura=sc.nextInt();
if(temperatura<=15){
    System.out.println("hace frio");
}
else if(temperatura>=16 && temperatura<=25){
    System.out.println("templado");
}
else{
    System.out.println("hace calor");
}
sc.close();
}
}
