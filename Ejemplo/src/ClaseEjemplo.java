
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValeriaG
 */
public class ClaseEjemplo implements Comparable<Object>, Comparator<Object> {

//    
//    pupblic static void main (String ar[]) {
//        System.out.println("Hola mundo");
//             Persona valeria = new Persona(13,"valeria");
//   
//        System.out.println(valeria);
//        Object vector []= new Object [3];
//        vector [0]= valeria;
//        System.out.println(valeria);
//        System.out.println(vector[0].getClass());
//        valeria=null;
//        System.out.println(valeria);
//    }  
    

    @Override
    public int compareTo(Object o) {
     
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
