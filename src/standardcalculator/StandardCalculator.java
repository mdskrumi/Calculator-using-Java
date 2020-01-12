
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
        
        
        
        
        
        
        
        Button equal = new Button("=");
        equal.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
       
        
        
        
        
        setResizable(false);
        setBackground(Color.gray);
        setLayout(null);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        new StandardCalculator();
    }

}
