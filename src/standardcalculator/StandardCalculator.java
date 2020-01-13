
package standardcalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class StandardCalculator extends Frame {
    
    
    private static final String about = "Thank You";
    
    private String str = "0";
    private double currentNumber = 0;
    private double numberOne , numberTwo;
    private byte sign = 0; 
    
    // 1 for add
    // 2 for sub
    // 3 for mul
    // 4 for div
    // 5 for %
    
    StandardCalculator(){
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
        setSize(350,685);
        
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
        screen.setText(str);
        screen.setFont(new Font("Lucida",Font.PLAIN,26));
        screen.setForeground(Color.black);
        add(screen);
        
        
        Font buttonFont = new Font("Lucida",Font.PLAIN,20);
        
        
        Button percentage = new Button("%");
        percentage.setFont(buttonFont);
        percentage.setBounds(8, 205, 80, 60);
        add(percentage);
        
        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sign == 0){
                    numberOne = Double.parseDouble(str);
                    sign = 5;
                    str = "0";
                    screen.setText(str); 
                    System.out.println("Number One: " + numberOne);
                }else{
                    numberTwo = Double.parseDouble(str);
                    numberOne = numberOne * ( numberTwo / 100 );
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                if(numberOne == 0.0){
                    str = "0";
                    screen.setText(str);
                }
            }
        });
        
        
        
        Button CE = new Button("CE");
        CE.setFont(buttonFont);
        CE.setBounds(93, 205, 80, 60);
        add(CE);
        
        CE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = "0";
                screen.setText(str);
            }
        });
        
        Button C = new Button("C");
        C.setFont(buttonFont);
        C.setBounds(178, 205, 80, 60);
        add(C);
        
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = "0";
                numberOne = 0;
                numberTwo = 0;
                screen.setText(str);
            }
        });
        
        Button back = new Button("del");
        back.setFont(buttonFont);
        back.setBounds(263, 205, 80, 60);
        add(back);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String newString = "";
                for(int i = 0 ; i < str.length()-1 ; i++){
                    newString += str.charAt(i);
                }
                str = newString;
                if(str.length()==0){
                    str = "0";
                }
                screen.setText(str);
            }
        });
        
        
        Button inverse = new Button("1/x");
        inverse.setFont(buttonFont);
        inverse.setBounds(8, 270, 80, 60);
        add(inverse);
        
        inverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber = Double.parseDouble(str);
                currentNumber = 1/currentNumber;
                str = String.valueOf(currentNumber);
                screen.setText(str);
            }
        });
        
        Button square = new Button("x²");
        square.setFont(buttonFont);
        square.setBounds(93, 270, 80, 60);
        add(square);
        
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber = Double.parseDouble(str);
                currentNumber *= currentNumber;
                str = String.valueOf(currentNumber);
                screen.setText(str);
            }
        });
        
        Button squareroot = new Button("√x");
        squareroot.setFont(buttonFont);
        squareroot.setBounds(178, 270, 80, 60);
        add(squareroot);
        
        squareroot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber = Double.parseDouble(str);
                currentNumber = Math.sqrt(currentNumber);
                str = String.valueOf(currentNumber);
                screen.setText(str);
            }
        });
        
        Button divide = new Button("/");
        divide.setFont(buttonFont);
        divide.setBounds(263, 270, 80, 60);
        add(divide);
        
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sign == 0){
                    numberOne = Double.parseDouble(str);
                    sign = 4;
                    str = "0";
                    screen.setText(str); 
                    System.out.println("Number One: " + numberOne);
                }else{
                    numberTwo = Double.parseDouble(str);
                    numberOne /= numberTwo;
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                if(numberOne == 0.0){
                    str = "0";
                    screen.setText(str);
                }
            }
        });
        
        
        
        Button seven = new Button("7");
        seven.setFont(buttonFont);
        seven.setBounds(8, 335, 80, 60);
        add(seven);
        
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='7';
                else 
                    str = "7";
                screen.setText(str);
            }
        });
        
        Button eight = new Button("8");
        eight.setFont(buttonFont);
        eight.setBounds(93, 335, 80, 60);
        add(eight);
        
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='8';
                else 
                    str = "8";
                screen.setText(str);
            }
        });
        
        Button nine = new Button("9");
        nine.setFont(buttonFont);
        nine.setBounds(178, 335, 80, 60);
        add(nine);
        
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='9';
                else 
                    str = "9";
                screen.setText(str);
            }
        });
        
        
        Button multification = new Button("*");
        multification.setFont(buttonFont);
        multification.setBounds(263, 335, 80, 60);
        add(multification);
        
        
        multification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sign == 0){
                    numberOne = Double.parseDouble(str);
                    sign = 3;
                    str = "0";
                    screen.setText(str); 
                    System.out.println("Number One: " + numberOne);
                }else{
                    numberTwo = Double.parseDouble(str);
                    numberOne *= numberTwo;
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                if(numberOne == 0.0){
                    str = "0";
                    screen.setText(str);
                }
            }
        });
        
        
        Button four = new Button("4");
        four.setFont(buttonFont);
        four.setBounds(8, 400, 80, 60);
        add(four);
        
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='4';
                else 
                    str = "4";
                screen.setText(str);
            }
        });
        
        Button five = new Button("5");
        five.setFont(buttonFont);
        five.setBounds(93, 400, 80, 60);
        add(five);
        
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='5';
                else 
                    str = "5";
                screen.setText(str);
            }
        });
        
        Button six = new Button("6");
        six.setFont(buttonFont);
        six.setBounds(178, 400, 80, 60);
        add(six);
        
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='6';
                else 
                    str = "6";
                screen.setText(str);
            }
        });
        
        Button subtraction = new Button("-");
        subtraction.setFont(buttonFont);
        subtraction.setBounds(263, 400, 80, 60);
        add(subtraction);
        
        
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sign == 0){
                    numberOne = Double.parseDouble(str);
                    sign = 2;
                    str = "0";
                    screen.setText(str); 
                    System.out.println("Number One: " + numberOne);
                }else{
                    numberTwo = Double.parseDouble(str);
                    numberOne -= numberTwo;
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                if(numberOne == 0.0){
                    str = "0";
                    screen.setText(str);
                }
            }
        });
        
        
        
        
        Button one = new Button("1");
        one.setFont(buttonFont);
        one.setBounds(8, 465, 80, 60);
        add(one);
        
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='1';
                else 
                    str = "1";
                screen.setText(str);
            }
        });
        
        Button two = new Button("2");
        two.setFont(buttonFont);
        two.setBounds(93, 465, 80, 60);
        add(two);
        
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='2';
                else 
                    str = "2";
                screen.setText(str);
            }
        });
        
        Button three = new Button("3");
        three.setFont(buttonFont);
        three.setBounds(178, 465, 80, 60);
        add(three);
        
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='3';
                else 
                    str = "3";
                screen.setText(str);
            }
        });
        
        Button plus = new Button("+");
        plus.setFont(buttonFont);
        plus.setBounds(263, 465, 80, 60);
        add(plus);
        
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sign == 0){
                    numberOne = Double.parseDouble(str);
                    sign = 1;
                    str = "0";
                    screen.setText(str); 
                    System.out.println("Number One: " + numberOne);
                }else{
                    numberTwo = Double.parseDouble(str);
                    numberOne += numberTwo;
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                if(numberOne == 0.0){
                    str = "0";
                    screen.setText(str);
                }
            }
        });
        
        Button toggleSign = new Button("+/-");
        toggleSign.setFont(buttonFont);
        toggleSign.setBounds(8, 530, 80, 60);
        add(toggleSign);
        
        toggleSign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber = Double.parseDouble(str);
                currentNumber *= -1;
                str = String.valueOf(currentNumber);
                screen.setText(str);
            }
        });
        
        Button zero = new Button("0");
        zero.setFont(buttonFont);
        zero.setBounds(93, 530, 80, 60);
        add(zero);
        
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!str.equals("0"))
                    str+='0';
                else 
                    str = "0";
                screen.setText(str);
            }
        });
        
        Button dot = new Button(".");
        dot.setFont(buttonFont);
        dot.setBounds(178, 530, 80, 60);
        add(dot);
        
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(str.contains(".")){
                    return;
                }
                if(!str.equals("0"))
                    str+='.';
                else 
                    str = ".";
                screen.setText(str);
            }
        });
        
        Button equal = new Button("=");
        equal.setFont(buttonFont);
        equal.setBounds(263, 530, 80, 60);
        add(equal);
       
        
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sign == 0 ){
                    str = "0";
                    screen.setText(str);
                    return;
                }
                else if (sign == 1){
                    numberTwo = Double.parseDouble(str);
                    numberOne += numberTwo;
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                else if (sign == 2){
                    numberTwo = Double.parseDouble(str);
                    numberOne -= numberTwo;
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                else if (sign == 3){
                    numberTwo = Double.parseDouble(str);
                    numberOne *= numberTwo;
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                else if (sign == 4){
                    numberTwo = Double.parseDouble(str);
                    numberOne /= numberTwo;
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                else if (sign == 5){
                    numberTwo = Double.parseDouble(str);
                    numberOne = numberOne * ( numberTwo / 100 );
                    str = String.valueOf(numberOne);
                    screen.setText(str);
                    sign = 0;
                }
                
                if(numberOne == 0.0){
                    str = "0";
                    screen.setText(str);
                }
                
            }
        });
        
        
        Label aboutMe = new Label();
        
        aboutMe.setAlignment(1);
        aboutMe.setBounds(10,595,330,80);
        aboutMe.setText(about);
        aboutMe.setBackground(Color.gray);
        aboutMe.setFont(new Font("Lucida",Font.BOLD,22));
        aboutMe.setForeground(Color.white);
        add(aboutMe);
        
        setResizable(false);
        setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        new StandardCalculator();
    }
    
    

}
