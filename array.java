import java.util.Arrays;

public class array {
public static void main(String[] args) {
   String[] ciudades = new String[]{"Málaga","Madrid","Sevilla"};
   String [] mayuscula=ArrayMayuscula(ciudades);
   System.out.println(Arrays.toString(mayuscula));
}
 public static String[] ArrayMayuscula(String[]ciudades){
    String[] resultado=new String[ciudades.length];
    for (int i = 0; i < ciudades.length; i++) {
        resultado[i]=ciudades[i].toUpperCase();
    }
    return resultado;
 }
}
