package generation.org.sasec7;
import java.util.HashMap;
import java.util.Scanner;

public class SASEC7 {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        //Se corrige Hash Map, variables Strings
        HashMap<String, String> capitales = new HashMap<>();
        
        
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México"); 
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador"); //se agrega la capital
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Ciudad de Panamá");
        //Corregimos String y definimos entrada de pais
        String pais = "";
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital (o escribe 'salir' para salir): ");
            pais = s.nextLine();
            
            if (!pais.equals("salir")) {
            	//Cambio Key y capitales
                if (capitales.containsKey(pais)) {
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
                    String capital = s.nextLine();
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }//Agrego )
        } while (!pais.equals("salir"));
        
        s.close(); // Cerramos el Scanner al finalizar
    }
}
