package Promedio;
/*
@autor:
 * Jhon velasco
 * @ frediv0406
 * Estudiante: Ing.Sistemas UDI
*/
import javax.swing.*;//ibreria de manejo grafico de java
public class PromedioEstudiante {
    public static void main(String[] args) {
    float nt=0,n,p;//nt equibale almacenamiento de notas
    int con=0;//contador de materias
    n=Integer.parseInt(JOptionPane.showInputDialog("digite la nota del estudiante (0-5)\n presione 8 para terminar"));
    while(n<=5){//se comprueba que la nota ingresada sea <=5(Escala de evalucion 0-5)
        con=con+1;
        nt=nt+n;
        n=Integer.parseInt(JOptionPane.showInputDialog("digite la nota del estudiante (0-5)\n presione 8 para terminar"));
        
    }
    p=nt/con;//promedio del estudiante
    if(p<3.2){//se verifica si su estado es condicional 
        JOptionPane.showMessageDialog(null,"Promedio es de: "+p);
        JOptionPane.showMessageDialog(null,"!!!Estado condicional¡¡¡ ");
    }
    else{
        JOptionPane.showMessageDialog(null,"Promedio es de: "+p);
    }
    }
    
}
