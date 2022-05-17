package padrao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Soma extends JFrame{
    ExemploSoma som = new ExemploSoma();
    
    public Soma(){
        super("Exemplo de Soma");
        Container tela = getContentPane();
        setLayout(null);
        som.rotulo1 = new JLabel("1º Número");
        som.rotulo2 = new JLabel("1º Número");
        som.texto1 = new JTextField(5);
        som.texto2 = new JTextField(5);
        som.exibir = new JLabel("");
        som.somar = new JButton("Somar");
        som.subtrair = new JButton("Subtrair");
        som.dividir = new JButton("Dividir");
        som.multiplicar = new JButton("Multiplicar");
        som.desabilitar = new JButton("Desabilitar");
        som.habilitar = new JButton("Habilitar");
        som.exibirbotao = new JButton("Exibir Entrada");
        som.ocultar = new JButton("Ocultar Entrada");
        
        som.rotulo1.setBounds(50,20,100,20);
        som.rotulo2.setBounds(50,60,100,20);
        som.texto1.setBounds(120,20,200,20);
        som.texto2.setBounds(120,60,200,20);
        som.exibir.setBounds(50,160,200,20);
        som.somar.setBounds(20,120,80,20);
        som.subtrair.setBounds(100,120,80,20);
        som.dividir.setBounds(180, 120, 80, 20);
        som.multiplicar.setBounds(260,120,100,20);
        som.desabilitar.setBounds(100,220,100,20);
        som.habilitar.setBounds(200,220,100,20);
        som.ocultar.setBounds(60,180,150,20);
        som.exibirbotao.setBounds(200,180,150,20);
        
        som.ocultar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        som.rotulo1.setVisible(false);
                        som.rotulo2.setVisible(false);
                    }
                }
        );
        
        som.exibirbotao.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        som.rotulo1.setVisible(true);
                        som.rotulo2.setVisible(true);
                    }
                }
        );
        
        som.desabilitar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        som.rotulo1.setEnabled(false);
                        som.rotulo2.setEnabled(false);
                    }
                }
        );
        
        som.habilitar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        som.rotulo1.setEnabled(true);
                        som.rotulo2.setEnabled(true);
                    }
                }
        );
                
        som.somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double numero1,numero2,soma;
                        soma=0;
                        numero1=Double.parseDouble(som.texto1.getText());
                        numero2=Double.parseDouble(som.texto2.getText());;
                        soma=numero1+numero2;
                        som.exibir.setVisible(true);
                        som.exibir.setText("A soma é: "+soma);
                    }
                }
        );
        som.subtrair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double numero1,numero2,subtração;
                        subtração=0;
                        numero1=Double.parseDouble(som.texto1.getText());
                        numero2=Double.parseDouble(som.texto2.getText());;
                        subtração=numero1-numero2;
                        som.exibir.setVisible(true);
                        som.exibir.setText("A subtração é: "+subtração);
                    }
                }
        );
        som.dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double numero1,numero2,divisão;
                        divisão=0;
                        numero1=Double.parseDouble(som.texto1.getText());
                        numero2=Double.parseDouble(som.texto2.getText());;
                        divisão=numero1/numero2;
                        som.exibir.setVisible(true);
                        som.exibir.setText("A divisão é: "+divisão);
                    }
                }
        );
        som.multiplicar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double numero1,numero2,multiplicação;
                        multiplicação=0;
                        numero1=Double.parseDouble(som.texto1.getText());
                        numero2=Double.parseDouble(som.texto2.getText());;
                        multiplicação=numero1*numero2;
                        som.exibir.setVisible(true);
                        som.exibir.setText("A multiplicação é: "+multiplicação);
                    }
                }
        );
        som.exibir.setVisible(false);
        
        tela.add(som.rotulo1);
        tela.add(som.rotulo2);
        tela.add(som.texto1);
        tela.add(som.texto2);
        tela.add(som.exibir);
        tela.add(som.somar);
        tela.add(som.subtrair);
        tela.add(som.dividir);
        tela.add(som.multiplicar);
        tela.add(som.desabilitar);
        tela.add(som.habilitar);
        tela.add(som.ocultar);
        tela.add(som.exibirbotao);
        
        setSize(400,350);
        setVisible(true);
    }
}
