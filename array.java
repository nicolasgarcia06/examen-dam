
 
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class array {
    static Scanner sc = new Scanner(System.in);
    public static String newPassword (){
        String password="";
        int n=0;
        int contador=0;
        do {
            System.out.print("Introduce tu nombre: ");
            String name = sc.nextLine();
            System.out.print("Introduce tu ciudad: ");
            String city = sc.nextLine();
            System.out.print("Introduce tu número de la suerte: ");
            try {
            String number =  sc.nextLine();
            n=Integer.parseInt(number);
                password = name.substring(0, 4) + n + city.substring(city.length()-2);
            } catch (StringIndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("Input no válido");
            }
            finally{
                contador++;
            }
        } while (password.equals(""));
        System.out.println("intentos:"+contador);
        return password;
    }
    public static void main(String[] args) {
        System.out.printf("Tu contraseña es <%s>", newPassword());
    }
}
