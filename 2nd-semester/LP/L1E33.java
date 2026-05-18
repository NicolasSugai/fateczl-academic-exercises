/*Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N*/

import javax.swing.JOptionPane;

public class L1E33 {
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número referência: "));

        double serie = 0.0;

        for (int i = 1; i <= n; i++) {
            serie = serie + (1.0/i);
        }

        JOptionPane.showMessageDialog(null, "O valor da série é: "+serie);

    }
}
