package tp.final2.menu;

import java.util.Scanner;

//el asignar permiso a usuario es cuando el administrador crea un usuario de culquiera de los 3 tipo:admin,pasajero,recepcionista.
public class BienvenidoMenu {
    
    public void imprimirMenu() { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Bienvenido al Hotel ===");
        System.out.println("1. Administrador");
        System.out.println("2. Recepcionista");
        System.out.print("Ingrese la opcion: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
        
         switch (seleccion) {
            case 1:  
                     break;
            case 2:  
                     break;
            default: break;
        }
    }        
}