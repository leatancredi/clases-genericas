package test;

import genericos.*;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer/*usamos la clase envolvente equivalente, no usamos peimitivos
                */> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenerTipo();
        
    }
}
