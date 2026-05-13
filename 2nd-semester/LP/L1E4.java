/* Receba  a  temperatura  em  graus  Celsius.  Calcule  e  mostre  a  sua 
temperatura convertida em fahrenheit F = (9*C+160)/5 */

import javax.swing.JOptionPane;

public class L1E4 {
    public static void main(String[] args) {
        String c = JOptionPane.showInputDialog("Digite a temperatura em celsius: ");

        double celsius = Double.parseDouble(c);

        double fahrenheit = (9*celsius+160)/5;

        JOptionPane.showMessageDialog(null, "Esta temperatura em Fahrenheit equivale a: "+fahrenheit+"°F");
    }
}