import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main { //creando clase, lista y objetos
    public static void main(String[] args){
        List<Persona>personas = new ArrayList<>();
        personas.add(new Persona("Marc","Solinas"));
        personas.add(new Persona("Richard","Fort"));
        personas.add(new Persona("Maria","Gutierrez"));
        personas.add(new Persona("Julieta","Ramirez"));
        personas.add(new Persona("Mario","Almeda"));
        //ordenando alfabeticamente por nombre
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        //ordenando alfabeticamente por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }

        //ordenando inversamente por apellido
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }
    }
}
