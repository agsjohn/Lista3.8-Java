package lista3_8;

import javax.swing.JOptionPane;

public class Lista3_8 {
    public static void main(String[] args) {
        int escolha;
        int base, altura, raio;
        float area;
        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção para cálculo de área: \n1. Retângulo"
                    + "\n2. Triângulo\n3. Círculo\n0. Para finalizar o programa"));
            switch(escolha){
                case 1:
                    base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base: "));
                    altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura: "));
                    base *= altura;
                    JOptionPane.showMessageDialog(null, "A área do retângulo é: " +base);
                    break;
                case 2:
                    base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base: "));
                    altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura: "));
                    area = (float) (altura * base) / 2;
                    JOptionPane.showMessageDialog(null, "A área do triângulo é: " +area);
                    break;
                case 3:
                    raio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o raio: "));
                    area = (float) 3.14 * (raio*raio);
                    JOptionPane.showMessageDialog(null, "A área do círculo é: " +area);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }while(escolha != 0);
    }    
}
