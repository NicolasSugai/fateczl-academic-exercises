/*Receba um número inteiro. Calcule e mostre o seu fatorial*/

import javax.swing.JOptionPane;

public class L1E32 {
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser fatorado: "));

        int n_fatorial = 1;

        for (int i = n; i > 1; i--) {
            n_fatorial = n_fatorial * i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de "+n+" é: "+n_fatorial);

    }
}
