/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo;
import java.io.*;
/**
 *
 * @author santi
 */
public class KeyboardInput {
    
    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Lectura de un valor int del teclado. El valor por omision es 0
    /**
     * 
     * @return value 
     */
    public final synchronized int readInteger() {
        String input = "";
        int value = 0;

        try {
            input = in.readLine();
        } catch (IOException e) {
        }
        if (input != null) {
            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
            }
        }
        return value;
    }

    // Lectura de un valor long del teclado. El valor por omision es 0L
    /**
     * 
     * @return value
     */
    public final synchronized long readLong() {
        String input = "";
        long value = 0L;

        try {
            input = in.readLine();
        } catch (IOException e) {
        }
        if (input != null) {
            try {
                value = Long.parseLong(input);
            } catch (NumberFormatException e) {
            }
        }
        return value;
    }

    // Lectura de un valor double del teclado. El valor por omision es 0.0
    /**
     * 
     * @return value
     */
    public final synchronized double readDouble() {
        String input = "";
        double value = 0.0;

        try {
            input = in.readLine();
        } catch (IOException e) {
        }
        if (input != null) {
            try {
                value = Double.parseDouble(input);
            } catch (NumberFormatException e) {
            }
        }
        return value;
    }

    // Lectura de un valor float del teclado. El valor por omision es 0.0f
    /**
     * 
     * @return value
     */
    public final synchronized float readFloat() {
        String input = "";
        float value = 0.0f;

        try {
            input = in.readLine();
        } catch (IOException e) {
        }
        if (input != null) {
            try {
                value = Float.parseFloat(input);
            } catch (NumberFormatException e) {
            }
        }
        return value;
    }

    // Lectura de un valor char del teclado. El valor por omision es ' ' (espacio)
    /**
     * 
     * @return c
     */
    public final synchronized char readCharacter() {
        char c = ' ';

        try {
            c = (char) in.read();
        } catch (IOException e) {
        }
        return c;
    }

    // Lectura de un valor String del teclado. El valor por omision es "" (Cadena vacia
    /**
     * 
     * @return s
     */
    public final synchronized String readString() {
        String s = "";
        try {
            s = in.readLine();
        } catch (IOException e) {
        }
        if (s == null) {
            s = "";
        }
        return s;
    }
}
