import java.util.Scanner;

public class duroo {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("introduce numeros enteros separados por coma: ");
    String numeros=sc.nextLine();
    String[] elementos=numeros.split(",");
int [] numbers=ConvertirArray(elementos);
MaxMin(numbers);
sc.close();
}
public static int[] ConvertirArray(String[] elementos){
    
int[] numbers=new int[elementos.length];
for (int i = 0; i < elementos.length; i++) {
    try{
      numbers[i]  =Integer.parseInt(elementos[i]);
     
    }
    catch(Exception e){
        System.out.println("Error: uno de los valores introducidos no es un número entero válido.");

    }
    
}
 System.out.println("se han introducido: "+numbers.length);

return numbers;
}
public static void MaxMin(int[] numbers){
int max=0;
int min=0;
for (int i = 1; i < numbers.length; i++) {
if(numbers[i]>numbers[max]){
    max=i;
}
}
for (int i = 1; i < numbers.length; i++) {
if(numbers[i]<numbers[min]){
    min=i;
}
}
System.out.print("el valor maximo es :"+numbers[max]+"y el valor minimo es :"+numbers[min]);
}
}