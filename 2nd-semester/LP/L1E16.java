/*Receba a quantidade de horas trabalhadas, o valor por hora, o percentual 
de desconto e o número de descendentes. Calcule o salário que serão as 
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário 
Bruto  – desconto). A cada dependente será acrescido R$ 100 no Salário 
Líquido. Exiba o salário a receber*/

import javax.swing.JOptionPane;

public class L1E16 {
    public static void main(String[] args) {
        double horas_trabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de horas trabalhadas: "));
        double valor_phora = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário por hora: "));
        double percentual_desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));

        double salario_bruto = (horas_trabalhadas * valor_phora);
        double desconto = (salario_bruto*(percentual_desconto/100));
        double bonus_dependentes = (dependentes*100);

        double salario_liquido = (salario_bruto-desconto+bonus_dependentes);

        JOptionPane.showMessageDialog(null, "Salário a receber de: "+salario_liquido);

    }
    
}
