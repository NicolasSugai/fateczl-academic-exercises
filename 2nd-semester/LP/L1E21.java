/*Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
Mostre a mensagem de acordo com a média: 
a.  Se a média for >= 6,0 exibir “APROVADO”; 
b.  Se a média for >= 3,0 ou < 6,0 exibir “EXAME”; 
c.  Se a média for < 3,0 exibir “RETIDO” */

import javax.swing.JOptionPane;

public class L1E21 {
    public static void main (String[] args){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota N1: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota N2: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota N3: "));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota N4: "));
        
        double media = ((n1+n2+n3+n4)/4);

        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "APROVADO");
        } else if (media >= 3 && media < 6) {
            JOptionPane.showMessageDialog(null, "EXAME");
        } else {
            JOptionPane.showMessageDialog(null, "REPROVADO");
        }

    }
}
