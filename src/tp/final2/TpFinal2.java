package tp.final2;

import java.util.ArrayList;
import tp.final2.menu.BienvenidoMenu;

public class TpFinal2 {

    public static void main(String[] args) {
        /*  BienvenidoMenu menu = new BienvenidoMenu();
        menu.imprimirMenu();*/
        
        /** TREESET TO FILE /*  
         * 
         */
        
        /*Set<String> s1 = new TreeSet<>();
        s1.add(name);
        s1.add(gender);
        s1.add(dob);
        File f = new File("D:\\east.txt");
         f.createNewFile();
         FileWriter fw = new FileWriter(f);
        for (String s: s1) {
        fw.write(s+"\r\n");
         }
        fw.close();
        }*/

        ArrayList<Recepcionista> empleado = new ArrayList<Recepcionista>();
        empleado.add(new Recepcionista("agustindominguez95@hotmail.com", "123", "Agustin", "Dominguez"));
        empleado.add(new Recepcionista("ag@hotmail.com", "619", "Andres", "Dum"));
        empleado.add(new Recepcionista("teamchilegodoflevel@hotmail.com", "123456789", "pepe", "grillo"));
        
        for(Recepcionista e: empleado){
            
            System.out.println(e.toString());
        }
    
    }

                                   }
