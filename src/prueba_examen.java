/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ByteOrtega
 */
public class prueba_examen {
    
//CREACION DE METODOS PARA CADA FUNCION
    
//Crea un metodo para imprimir un string con tu nombre, nombre del metodo apellido_nombre_string
public String paredes_ortega_nombre_string() {
    return "Jorge paredes ortega";
}
//Crea un metodo para realizar una suma de dos valores de tipo byte, nombre del metodo apellido_suma_byte
public Byte paredes_ortega_suma_byte(byte valor1, byte valor2){
    return (byte)(valor1+valor2);
}
//Crea un metodo para realizar una resta de dos valores de tipo short, nombre del metodo apellido_resta_short
public Short paredes_ortega_resta_short(short valor1, short valor2){
    return (short)(valor1-valor2);
}
//Crea un metodo para multiplicar dos valores de tipo int, nombre del metodo apellido_multiplicacion_int
public int paredes_ortega_multiplicaion_int (int valor1, int valor2){
    return (int)(valor1*valor2);
}
//Crear un metodo para dividir dos valores de tipo long, nombre del metodo apellido_division_long
public Long paredes_ortega_division_long(long valor1, long valor2){
    return (long)(valor1/valor2);
}
//Crea un metodo para realizar una division de dos valores de tipo float,nombre del metodo apellido_division_float
public float paredes_ortega_division_float (float valor1, float valor2){
    return (float)(valor1/valor2);
}
//Crea un metodo para realizar una division de dos valores tipo double,nombre del metodo apellido_division_double
public double paredes_ortega_division_double (double valor1, double valor2){
    return (double)(valor1/valor2);
}
// FIN DE CREACION DE LOS METODOS

//CREACION DEL EJECUTADOR
public static void main(String[] args) {
    prueba_examen ejecuta = new prueba_examen();
    System.out.println("El nombre es: " + ejecuta.paredes_ortega_nombre_string());
    System.out.println("La suma byte es " + ejecuta.paredes_ortega_suma_byte((byte) 15,(byte) 15));
    System.out.println("La resta short es: " + ejecuta.paredes_ortega_resta_short((short) 15, (short) 15));
    System.out.println("La multiplicacion es: " + ejecuta.paredes_ortega_multiplicaion_int(15, 15));
    System.out.println("La division long es: " + ejecuta.paredes_ortega_division_long(15, 15));
    System.out.println("La division float es: " + ejecuta.paredes_ortega_division_float(15.15f, 15.15f));
    System.out.println("La division double es: " + ejecuta.paredes_ortega_division_double(15, 15));
    }
}
