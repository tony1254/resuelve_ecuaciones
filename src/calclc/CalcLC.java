/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calclc;

/**
 *
 * @author Tony
 */
import java.io.StringReader;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
public class CalcLC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String busca;    
        String vars=new String(),vars2=new String();

            JFileChooser fc = new JFileChooser("\\");
            fc.setDialogTitle("S E L E C C I O N E    A R C H I V O    P A R A    R E V I S A R");
            fc.setFileFilter(new FileNameExtensionFilter("TEXTO (*.txt)", "txt")); 
            fc.showOpenDialog(null);
                try{
                vars=fc.getSelectedFile().getPath();
                vars2=fc.getSelectedFile().getName();
                busca=vars;
                }catch (Exception e){
                busca="entrada.txt";
                System.out.print("No Selecciono Nada");
             
                }
        File file=new File(busca); // se encuentra dentro de la carpeta calcLC
        try{
        
        FileReader fr=new FileReader(file);
         lex Escaner = null; 
        parser oParser = null; // Con 'P' al inicio. 
       
        try 
        { 
            busca="";
            busca=busca+"5+6";
            StringReader f= new StringReader(busca);
            Escaner = new lex(f);           
            oParser = new parser(Escaner); 
            oParser.busca=busca;
            
            oParser.parse(); 
            
            System.out.println(Escaner.st[0][0]);
            
            System.out.println("\n\nAUTRO:\t\tLuis Antonio Garcia Aguirre \nUNIVERSIDAD:\tUniversidad Mariano Galves de Guatemala\n");
            
        } 
        catch (Exception ex) 
        { 
            System.out.println(ex.toString()); 
        }
        
	}catch(Exception e){ 
            System.out.println(e);
        }
    }
public void leer(){
 


}
}
