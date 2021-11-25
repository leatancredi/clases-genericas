package genericos;


public class ClaseGenerica <T> {
    //llamamos a la clase generica T -> de tipo
    T objeto;
    // agregamos un constructor para esta clase
    public ClaseGenerica(T objeto){
        // iniciamos el atributo de la clase
        this.objeto = objeto;
    }
    
    //imprimimos el tipo cuando mandemos a imprimir el tipo
    public void obtenerTipo(){
            System.out.println("El tipo es  = " + objeto.getClass().getSimpleName());//para obtener el tipo de la clase)
}
}
