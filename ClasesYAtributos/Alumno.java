
package ClasesYAtributos;

public class Alumno {
    //Atributos
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    
    //Constructor usando this
    
    public Alumno(String nombre, String apellido, String direccion,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    
    //Metodos setters y getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setEdad(int edad){
        this.edad = edad;        
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;        
    }
    public String getDireccion(){
        return direccion;
    }
    public int getEdad(){
        return edad;
    }
    
    //Mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
    }
    
    // Método principal para probar la clase
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Fabiola","Hernández", "Av. Marina Nacional 200",28);
        alumno1.mostrarInformacion();
    }
    
            
}
