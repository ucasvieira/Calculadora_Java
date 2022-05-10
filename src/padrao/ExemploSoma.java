package padrao;

import javax.swing.*;

public class ExemploSoma extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;
    

    public static void main(String[] args) {
        Soma app = new Soma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 