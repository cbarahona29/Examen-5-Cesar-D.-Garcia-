
package examenlabsemana5;

import java.util.Scanner;


public class ExamenLabSemana5 {

  
    public static void main(String[] args) {
              int menu;
          Scanner entrada= new Scanner(System.in);
          
         //Menu 
         while(true){
                while(true){
       System.out.println("-----Menu-----\n"
        +"Favor seleccione lo que desea ejecutar:\n"
        +"1. Piramide\n"
        +"2. El Mayor\n"
        +"3. Ingresar Datos\n"
        +"4. Caracteres Vocales\n"
        +"5. Salir");
            menu=entrada.nextInt();
            
            //Verificar que los numeros solo sean los indicados
            if(menu<6 && menu>0)
                break;
            else 
                System.out.println("Favor ingrese unicamente las opciones sugeridas en el menu.");
        }
        switch (menu){

        case 1:
            //Piramide
            int filas;
            int numeroa;
            
            //Ingreso de filas deseadas
            System.out.println("Ingrese la cantidad de filas para la piramide");
            filas=entrada.nextInt();
            
             numeroa = 1;

        for (int i = 1; i <= filas; i++) {
            int sumaFila = 0;

            // Impresion de numeros par e impar
            for (int j = 0; j < i; j++) {
                System.out.print(numeroa + " ");
                sumaFila += numeroa;
                numeroa += 2;
            }
            //Resultado Final
            System.out.println("= " + sumaFila);
        }
            break;
            
        //El Mayor
        case 2:
        int numero;
        int maximo = 0;
        int suma = 0;
        int contador = 0;
        int cont;
        double promedio;

        do {
            System.out.println("Ingrese un número:");
            numero = entrada.nextInt();

            // Encontrar el numero maximo
            if (numero > maximo) {
                maximo = numero;
            }

            // Sumar del numero que se ingreso y del contador
            suma += numero;
            contador++;

            System.out.println("Quieres continuar?\n"+" 1. SI\n"+" 2. NO:");
            cont = entrada.nextInt();
        } while (cont==1);

        // Promedio 
        promedio=suma/contador;

        //Resultados
        System.out.println("El mayor numero ingresado es: " + maximo);
        System.out.println("El promedio de los números ingresados es: " + promedio);
            break;
        
        //Ingresar Datos    
        case 3:
             Scanner scanner = new Scanner(System.in);
        
        //Nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
    
        int normales = 0;
        int hd = 0;
        int tcanales = 0;
        
        // Ingresar canales con un do-while
        String respuesta;
        do {
            // Solicitar tipo de canal
            System.out.print("Ingrese el tipo de canal HD o NORMAL: ");
            String tipoCanal = entrada.next().toUpperCase();
            
            // Canal
            if (tipoCanal.equals("NORMAL")) {
                normales++;
                tcanales += 20; 
            } else if (tipoCanal.equals("HD")) {
                hd++;
                tcanales += 30;
            } else {
                System.out.println("Opción no válida. Por favor ingrese 'HD' o 'NORMAL'.");
                
            }
            
            // Preguntar si desea ingresar otro canal
            System.out.print("¿Desea ingresar otro canal? (SI o NO): ");
            respuesta = entrada.next().toUpperCase();
            
        } while (respuesta.equals("SI"));
        
        String tipocaja = "";
        int tcaja = 0;
        do {
            System.out.print("Ingrese el tipo de Caja Digital\n"
                    +"LIGHTBOX\n"
                    +"HDBOX\n"
                    +"DVRBOX:\n");
            tipocaja = scanner.nextLine().toUpperCase();
            
          
            if (tipocaja.equals("LIGHTBOX")) {
                tcaja = 50;
            } else if (tipocaja.equals("HDBOX")) {
                tcaja = 100;
            } else if (tipocaja.equals("DVRBOX")) {
                tcaja = 150;
            } else {
                System.out.println("Opción no válida. Por favor ingrese LIGHTBOX, HDBOX o DVRBOX");
            }
        } while (!tipocaja.equals("LIGHTBOX") || !tipocaja.equals("HDBOX") || !tipocaja.equals("DVRBOX"));
        
        
        int subtotal = tcanales + tcaja;
        
       
        double impuesto = subtotal * 0.15;
        
        // Total 
        double total = subtotal + impuesto;
        
        // Impresion de Resultados
        System.out.println("\nDetalles para "+nombreCliente+" :"
        +"Canales Normales: "+normales+"\n"
        +"Canales HD: " + hd+"\n"
        +"Subtotal de canales: Lps."+tcanales+"\n"
        +"Costo de la caja " + tipocaja + ": Lps. " +tcaja+"\n"
        +"Subtotal a pagar: Lps. " + subtotal+"\n"
        +"Impuesto (15%): Lps. " + impuesto+"\n"
        +"Total a Pagar: Lps. " +total+"\n)");
    
        break;
        
        //Contar Vocales
        case 4:
            String cadena;
            System.out.println("Ingrese una cadena de texto");
            cadena=entrada.next();
            int conta=0;
            
            for (int i = 0; i <cadena.length(); i++) {
                char vocalmin=cadena.charAt(i);
                
                switch(vocalmin){
                case 'a':
                    conta++;
                    break; 
                case 'e':
                    conta++;
                    break; 
                case 'i':
                    conta++;
                    break; 
                case 'o':
                    conta++;
                    break; 
                case 'u':
                    conta++;
                    break;
                default:
                    break;
            }
        }

        //Total
        System.out.println("La cantidad de vocales minusculas es: "+conta);
            break;
            
         //Salida
         case 5:
            System.out.println("HASTA LUEGO");
            System.exit(0);

        }
    }
    
    }
}
