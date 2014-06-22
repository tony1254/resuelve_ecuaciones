/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package scanner;

/**
 *
 * @author Administrador
 */
public class lex {

    String Lexema;			//almacena el token reconocido
    Integer Atributo,linea;		//un codigo que identifica el tipo de token
    String decir;
    
    lex() {
        Lexema = "";
        Atributo = 1111;
        decir="";
        linea=1;
        
    }
}
