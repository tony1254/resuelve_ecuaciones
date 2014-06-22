package scanner;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author TOny
 */

public class scan {
public int sta;
public String demo = "prueba.txt";
    lex Token = new lex();	//tipo de dato devuelto
    String Lexema;			//token que se esta formando
    Integer Letra;			//byte leido del archivo
    PushbackInputStream Archivo;		//stream de entrada (archivo)
    Boolean Salida;			//indica que el token ya se formo
    Integer Estado;			//estado en que se encuentra el scanner
    final int Estado_Inicial = 1000;
    final int Estado_Identificador = 1001;
    final int Estado_Numero = 1002;
    final int Estado_Final = 5000;
    final int Estado_Error = 9999;
    //SIGNOS
    final int Estado_Mas = 43;
    final int Estado_Menos =45;
    final int Estado_Igual=61;
    final int Estado_Divi=47;
    final int Estado_Multi=42;
    final int Estado_Elevado=94;
    final int Estado_otros=-1;
    

    /** Procedimiento que abre al archivo */
    void AbrirArchivo(String nombre) {
        try {
            Archivo = new PushbackInputStream(new FileInputStream(nombre));
              sta=1;
        } catch (IOException e) {
   
            System.out.println("error en la apertura del archivo");
        JOptionPane.showMessageDialog(
   null,
   "ERROR: Archivo No Enconterado, favor colocar nombre valido","ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    /** Procedimiento que cierra el archivo */
    public void CerrarArchivo() {
        try {
            Archivo.close();
        } catch (IOException e) {
            System.out.println("error al cerrar el archivo");
        }
    }

    /** Funcion que lee un simbolo del archivo */
    int LeerCaracter() {
        int retorno = 0;
        try {
            if (Archivo.available() > 0) {
                retorno = Archivo.read();
                if (retorno == 195) //por los caracteres especiales doble codigo
                {
                    if (Archivo.available() > 0) {
                        retorno = Archivo.read();
                        retorno += 64;
                    }
                }
            } else {
                Salida = true;
                Estado = Estado_Final;
            }
        } catch (IOException e) {
            Estado = Estado_Error;
            System.out.println("ERROR: Leer Caracter");
        }
        return retorno;
    }

    /** procedimiento que devuelve un byte al stream */
    void Retornar_Lectura() {
        try {
            Archivo.unread(Letra);
        } catch (IOException e) {
            Estado = Estado_Error;
            System.out.println("ERROR: Retornar Caracter");
        }
    }

    /** procedimiento que define el estado inicial del scanner */
    void Proc_Inicial() {
        if ((Letra == 10) || (Letra == 9) || (Letra == 32)||(Letra==13)) {
        //ignorar estos caracteres
            
            if(Letra==13){
              //  System.out.println("ENTRO");
                Token.linea++;
            }
            
        }else if (Letra == 61) //es el signo =
        {
            
            Estado = Estado_Igual;
            Lexema = Lexema + String.format("%1$c", Letra);
            Token.decir=Integer.toString(Estado);
        } else if (((Letra > 64) && (Letra < 91)) || ((Letra > 96) && (Letra < 123))) //es letra
        {
            Estado = Estado_Identificador;
            Lexema = Lexema + String.format("%1$c", Letra);
        } else if ((Letra > 47) && (Letra < 58)) //es digito
        {
            Estado = Estado_Numero;
            Lexema = Lexema + String.format("%1$c", Letra);
        } else if (Letra == 43) //es el signo +
        {// SIGNOS
            Estado = Estado_Mas;
            Lexema = Lexema + String.format("%1$c", Letra);
        }else if (Letra == 45) //es el signo -
        {
            Estado = Estado_Menos;
            Lexema = Lexema + String.format("%1$c", Letra);
            Token.decir=Integer.toString(Estado);
        }else if (Letra == 42) //es el signo *
        {
            Estado = Estado_Multi;
            Lexema = Lexema + String.format("%1$c", Letra);
            Token.decir=Integer.toString(Estado);
        } else if (Letra == 47) //es el signo /
        {
            Estado = Estado_Divi;
            Lexema = Lexema + String.format("%1$c", Letra);
            Token.decir=Integer.toString(Estado);
        }else if (Letra == 94) //es el signo ^
        {
            Estado = Estado_Elevado;
            Lexema = Lexema + String.format("%1$c", Letra);
            Token.decir=Integer.toString(Estado);
        }else if (((Letra> 32)&&(Letra<127))||((Letra> 128)&&(Letra<255))) //es el signo todos
        {
            Estado = Estado_otros;
            Lexema = Lexema + String.format("%1$c", Letra);
            Token.decir=Integer.toString(Estado);
        }else if (Letra == 00) //es el fin de archivo
        {
            Estado = Estado_Final;
        } else //cualquier caracter no especificado es un error
        {
            Estado = Estado_Error;
            Salida = true;
        }
    }

    /** procedimiento que define el estado identificador */
    void Proc_Identificador() {
        if ((Letra > 47) && (Letra < 61)||(Letra > 61) && (Letra < 123)) {
            Estado = Estado_Identificador;
            Lexema = Lexema + String.format("%1$c", Letra);
        } else {
            Retornar_Lectura();
            Salida = true;
        }
    }

    /** procedimiento que define el estado numero */
    void Proc_Numero() {
        if ((Letra > 47) && (Letra < 58)) {
            Estado = Estado_Numero;
            Lexema = Lexema + String.format("%1$c", Letra);
        } else {
            Retornar_Lectura();
            Salida = true;
        }
    }

    /** Funcion que devuelve los tokens */
    public lex GetToken() {
        Estado = Estado_Inicial;
        Lexema = "";
        Letra = 0;
        Salida = false;
        while (!Salida && (Estado != Estado_Final)) {
            Letra = LeerCaracter();		//obtiene un caracter del stream
            switch (Estado) {
                case Estado_Inicial:
                    Proc_Inicial();
                    break;
                case Estado_Identificador:
                    Proc_Identificador();
                    break;
                case Estado_Numero:
                    Proc_Numero();
                    break;
                default: {
                    Retornar_Lectura();
                    Salida = true;
                    break;
                }
            }
        }
if(Estado==1001){
    Token.decir="Identificador";
}else if(Estado==1002){
    Token.decir="Numero";
}else if(Estado==43){
    Token.decir="Signo +";
}else if(Estado==42){
    Token.decir="Signo *";
}else if(Estado==45){
    Token.decir="Signo -";
}else if(Estado==47){
    Token.decir="Signo /";
}else if(Estado==61){
    Token.decir="Signo =";
}else if(Estado==-1){
    Token.decir="Otros Signos";
}
        Token.Lexema = Lexema;
        Token.Atributo = Estado;
      
        return Token;
    }
}
