package lista3_8;

import javax.swing.JOptionPane;

public class Lista3_8 {
    public static void main(String[] args) {
        int escolha;
        int base, altura, raio;
        float area;
        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma op��o para c�lculo de �rea: \n1. Ret�ngulo"
                    + "\n2. Tri�ngulo\n3. C�rculo\n0. Para finalizar o programa"));
            switch(escolha){
                case 1:
                    base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base: "));
                    altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura: "));
                    base *= altura;
                    JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo �: " +base);
                    break;
                case 2:
                    base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base: "));
                    altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura: "));
                    area = (float) (altura * base) / 2;
                    JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo �: " +area);
                    break;
                case 3:
                    raio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o raio: "));
                    area = (float) 3.14 * (raio*raio);
                    JOptionPane.showMessageDialog(null, "A �rea do c�rculo �: " +area);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida");
            }
        }while(escolha != 0);
    }    
}
