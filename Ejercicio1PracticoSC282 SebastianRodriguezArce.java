/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.practico.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    int empleados;
    double salarios = 0;
     
    
    String cantidad;
    
    cantidad = JOptionPane.showInputDialog("Digite la cantidad de empleados de la empresa");
    empleados = Integer.parseInt(cantidad);
    
    
    for (int i = 0; i < empleados; i++) {
        
        salarios = Double.parseDouble(JOptionPane.showInputDialog("digite el salario de el trabajador"));
    }
     
    JOptionPane.showMessageDialog(null,"Su salario con la rebaja del seguro de enfermedad y maternidad es de :"+ salarios*0.095);
    JOptionPane.showMessageDialog(null,"Su salario con la rebaja del seguro de invalidez, vejez y muerte es de :"+ salarios*0.0508);
    JOptionPane.showMessageDialog(null,"En total la empresa debera abonar a la CCSS por conceptos de SEM y IVM un total de :"+salarios);
    
    }
    
    
}
