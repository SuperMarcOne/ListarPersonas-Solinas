import java.util.ArrayList;
import java.util.List;
//creando la clase persona con los getters y setters
public class Persona {
    String nombre;
    String apellido;
//creando un constructor que va a servir para crear objetos
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
//getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

