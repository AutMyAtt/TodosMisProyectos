package collecciones;

public class Profesor extends Persona{

    public String especialidad;

    @Override
    public String toString() {
        //return "Profesor{" + "name=" + name + ", lastName=" + lastName + "especialidad=" + especialidad + '}';
        return super.toString() + "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
}
