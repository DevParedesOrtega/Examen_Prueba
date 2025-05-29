/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ByteOrtega
 */
public class paredes_Ortega_tipos_datos {

    public void paredes_nombre_string() {
        System.out.println("Mi nombre es Jorge Paredes Ortega");
    }

    public byte paredes_suma_byte(byte valor1, byte valor2) {
        return (byte)(valor1 + valor2);
    }

    public short paredes_resta_short(short valor1, short valor2) {
        return (short)(valor1 - valor2);
    }

    public int paredes_multiplicacion_int(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public long paredes_division_long(long valor1, long valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            System.out.println("Error: División por cero (long)");
            return 0;
        }
    }

    public float paredes_division_float(float valor1, float valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            System.out.println("Error: División por cero (float)");
            return 0;
        }
    }

    public double paredes_division_double(double valor1, double valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            System.out.println("Error: División por cero (double)");
            return 0;
        }
    }

    public static void main(String[] args) {
        paredes_Ortega_tipos_datos metodos = new paredes_Ortega_tipos_datos();

        metodos.paredes_nombre_string();

        System.out.println("Suma byte: " + metodos.paredes_suma_byte((byte)10, (byte)20));
        System.out.println("Resta short: " + metodos.paredes_resta_short((short)1000, (short)750));
        System.out.println("Multiplicación int: " + metodos.paredes_multiplicacion_int(25, 4));
        System.out.println("División long: " + metodos.paredes_division_long(100000L, 2000L));
        System.out.println("División float: " + metodos.paredes_division_float(9.5f, 2.5f));
        System.out.println("División double: " + metodos.paredes_division_double(18.0, 3.0));
    }
}
