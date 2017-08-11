package ordenar;

public class Alumno implements Comparable<Alumno> {

    public String nombre;
    public String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // Generado automáticamente al implements Comparable<Alumno>
    // De esta forma ordena por el nombre
/*    @Override
    public int compareTo(Alumno o) {
        return nombre.compareTo( o.nombre );
    }
*/
    // De esta forma ordena por nombre y luego por edad
    @Override
    public int compareTo(Alumno o) {
        String a = new String( this.nombre + String.valueOf( this.edad ) );
        String b = new String( o.getNombre() + String.valueOf( o.getEdad() ) );
        
        // Ordenamiento ascendente
        return a.compareTo( b );
    }
    
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
