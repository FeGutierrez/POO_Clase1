import java.util.Date;

/**
 *
 * @author Flexxo333
 */
public class Empleado {
    
    int id;
    String nombre;
    String apellido;
    String genero;
    String imagenAsociada;
    Date fechaDeIngreso;
    
    public Empleado(int id, String nombre, String apellido, String genero, String imagenAsociada, Date fechaDeIngreso){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
        this.imagenAsociada=imagenAsociada;
        this.fechaDeIngreso=fechaDeIngreso;
    };
    
    
};
