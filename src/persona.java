/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class persona {
    String nombre;
    String nombre2;
    String apellido;
    String apellido2;
    String matricula;
    String telefono;
    persona() { 
      apellido = apellido2 = nombre = nombre2  = matricula = telefono = "";
    }
    void ver(){
        System.out.println("\nNombre 1:"+nombre+" \nNombre 2:"+nombre2+" \nApellido 1:"+apellido+" \nApellido 2:"+apellido2+" \nMatricula: "+matricula+" \nTelefono: "+telefono+"");
    }
    void ver2(){
        System.out.println("\""+nombre+" "+nombre2+"\" \""+apellido+" "+apellido2+"\" \""+matricula+"\" \""+telefono+"\"");
    }
    int getAscii(){
        int ascii = 0;
        for (int i = 0; i < nombre.length(); i++) {
            ascii+=(nombre.charAt(i)+0);
        }
        for (int i = 0; i < nombre2.length(); i++) {
            ascii+=(nombre2.charAt(i)+0);
        }
        for (int i = 0; i < apellido.length(); i++) {
            ascii+=(apellido.charAt(i)+0);
        }
        for (int i = 0; i < apellido2.length(); i++) {
            ascii+=(apellido2.charAt(i)+0);
        }
        return ascii;
    }
    String getPath(){
        return nombre+" "+nombre2+" "+apellido+" "+apellido2;
    }
}
