/*Calcule  a  quantidade  de  litros  gastos  em  uma  viagem,  sabendo  que  o 
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.*/

import javax.swing.JOptionPane;

public class L1E17 {
    public static void main(String[] args){

        double velocidade_media = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média do veículo: "));

        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso: "));

        double distancia_percorrida = (velocidade_media*tempo);

        double gasolina_litros = (distancia_percorrida/12);

        JOptionPane.showMessageDialog(null, String.format("O carro consumiu %.2f L durante o trajeto!", gasolina_litros));
    }
}
