
package standardcalculator;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class StandardCalculator extends Frame {
    
    
    StandardCalculator(){
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
        setSize(350,600);
        
        Label name = new Label();
        name.setAlignment(0);
        name.setBounds(10,40,330,30);
        name.setText("Standard Calculator");
        name.setFont(new Font("Lucida",Font.BOLD,24));
        name.setForeground(Color.white);
        add(name);
        
        
        
        Label screen = new Label();
        screen.setAlignment(2);
        screen.setBounds(10,80,330,120);
        screen.setText("HI BROSA");
        screen.setFont(new Font("Lucida",Font.PLAIN,30));
        screen.setForeground(Color.white);
        add(screen);
        
        
        
        Font buttonFont = new Font("Lucida",Font.BOLD,20);
        
        
        
        Button seven = new Button("7");
        seven.setFont(buttonFont);
        seven.setBounds(8, 335, 80, 60);
        add(seven);
        
        Button eight = new Button("8");
        eight.setFont(buttonFont);
        eight.setBounds(93, 335, 80, 60);
        add(eight);
        
        Button nine = new Button("9");
        nine.setFont(buttonFont);
        nine.setBounds(178, 335, 80, 60);
        add(nine);
        
        Button multification = new Button("*");
        multification.setFont(buttonFont);
        multification.setBounds(263, 335, 80, 60);
        add(multification);
        
        
        Button four = new Button("4");
        four.setFont(buttonFont);
        four.setBounds(8, 400, 80, 60);
        add(four);
        
        Button five = new Button("5");
        five.setFont(buttonFont);
        five.setBounds(93, 400, 80, 60);
        add(five);
        
        Button six = new Button("6");
        six.setFont(buttonFont);
        six.setBounds(178, 400, 80, 60);
        add(six);
        
        Button division = new Button("/");
        division.setFont(buttonFont);
        division.setBounds(263, 400, 80, 60);
        add(division);
        
        
        
        
        
        
        Button one = new Button("1");
        one.setFont(buttonFont);
        one.setBounds(8, 465, 80, 60);
        add(one);
        
        Button two = new Button("2");
        two.setFont(buttonFont);
        two.setBounds(93, 465, 80, 60);
        add(two);
        
        Button three = new Button("3");
        three.setFont(buttonFont);
        three.setBounds(178, 465, 80, 60);
        add(three);
        
        Button plus = new Button("+");
        plus.setFont(buttonFont);
        plus.setBounds(263, 465, 80, 60);
        add(plus);
        
        
        Button toggleSign = new Button("+/-");
        toggleSign.setFont(buttonFont);
        toggleSign.setBounds(8, 530, 80, 60);
        add(toggleSign);
        
        Button zero = new Button("0");
        zero.setFont(buttonFont);
        zero.setBounds(93, 530, 80, 60);
        add(zero);
        
        Button dot = new Button(".");
        dot.setFont(buttonFont);
        dot.setBounds(178, 530, 80, 60);
        add(dot);
        
        Button equal = new Button("=");
        equal.setFont(buttonFont);
        equal.setBounds(263, 530, 80, 60);
        add(equal);
       
        
        
        
        
        setResizable(false);
        setBackground(Color.gray);
        setLayout(null);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        new StandardCalculator();
    }

}
