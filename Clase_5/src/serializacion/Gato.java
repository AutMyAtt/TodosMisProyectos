package serializacion;

import java.io.Serializable;

public class Gato implements Serializable {
    
    // Es necesario declarar el identificador para reconocer el objeto
    // Yo inventé este, pero buscar cómo generarlo
    private static final long serialVersionUID = 54354478673543528L;
    
    public String nombre;
    public String raza;

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
}
