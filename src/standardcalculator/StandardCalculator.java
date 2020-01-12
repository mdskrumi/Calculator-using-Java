
package standardcalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        name.setForeground(Color.black);
        add(name);
        
        
        
        Label screen = new Label();
        screen.setAlignment(2);
        screen.setBounds(10,80,330,120);
        screen.setText("0");
        screen.setFont(new Font("Lucida",Font.PLAIN,30));
        screen.setForeground(Color.black);
        add(screen);
        
        
        Font buttonFont = new Font("Lucida",Font.BOLD,20);
        
        
        Button percentage = new Button("%");
        percentage.setFont(buttonFont);
        percentage.setBounds(8, 205, 80, 60);
        add(percentage);
        
        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        
        Button CE = new Button("CE");
        CE.setFont(buttonFont);
        CE.setBounds(93, 205, 80, 60);
        add(CE);
        
        CE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button C = new Button("C");
        C.setFont(buttonFont);
        C.setBounds(178, 205, 80, 60);
        add(C);
        
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button back = new Button("del");
        back.setFont(buttonFont);
        back.setBounds(263, 205, 80, 60);
        add(back);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        Button inverse = new Button("1/x");
        inverse.setFont(buttonFont);
        inverse.setBounds(8, 270, 80, 60);
        add(inverse);
        
        inverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button square = new Button("x^2");
        square.setFont(buttonFont);
        square.setBounds(93, 270, 80, 60);
        add(square);
        
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button squareroot = new Button("√x");
        squareroot.setFont(buttonFont);
        squareroot.setBounds(178, 270, 80, 60);
        add(squareroot);
        
        squareroot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button divide = new Button("/");
        divide.setFont(buttonFont);
        divide.setBounds(263, 270, 80, 60);
        add(divide);
        
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        
        Button seven = new Button("7");
        seven.setFont(buttonFont);
        seven.setBounds(8, 335, 80, 60);
        add(seven);
        
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button eight = new Button("8");
        eight.setFont(buttonFont);
        eight.setBounds(93, 335, 80, 60);
        add(eight);
        
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button nine = new Button("9");
        nine.setFont(buttonFont);
        nine.setBounds(178, 335, 80, 60);
        add(nine);
        
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        Button multification = new Button("*");
        multification.setFont(buttonFont);
        multification.setBounds(263, 335, 80, 60);
        add(multification);
        
        
        multification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        Button four = new Button("4");
        four.setFont(buttonFont);
        four.setBounds(8, 400, 80, 60);
        add(four);
        
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button five = new Button("5");
        five.setFont(buttonFont);
        five.setBounds(93, 400, 80, 60);
        add(five);
        
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button six = new Button("6");
        six.setFont(buttonFont);
        six.setBounds(178, 400, 80, 60);
        add(six);
        
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button subtraction = new Button("-");
        subtraction.setFont(buttonFont);
        subtraction.setBounds(263, 400, 80, 60);
        add(subtraction);
        
        
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        
        
        Button one = new Button("1");
        one.setFont(buttonFont);
        one.setBounds(8, 465, 80, 60);
        add(one);
        
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button two = new Button("2");
        two.setFont(buttonFont);
        two.setBounds(93, 465, 80, 60);
        add(two);
        
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button three = new Button("3");
        three.setFont(buttonFont);
        three.setBounds(178, 465, 80, 60);
        add(three);
        
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button plus = new Button("+");
        plus.setFont(buttonFont);
        plus.setBounds(263, 465, 80, 60);
        add(plus);
        
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button toggleSign = new Button("+/-");
        toggleSign.setFont(buttonFont);
        toggleSign.setBounds(8, 530, 80, 60);
        add(toggleSign);
        
        toggleSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button zero = new Button("0");
        zero.setFont(buttonFont);
        zero.setBounds(93, 530, 80, 60);
        add(zero);
        
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button dot = new Button(".");
        dot.setFont(buttonFont);
        dot.setBounds(178, 530, 80, 60);
        add(dot);
        
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Button equal = new Button("=");
        equal.setFont(buttonFont);
        equal.setBounds(263, 530, 80, 60);
        add(equal);
       
        
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        
        setResizable(false);
        setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        new StandardCalculator();
    }

}
