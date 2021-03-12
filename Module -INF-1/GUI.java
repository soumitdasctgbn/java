import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

class GUI
{
    public static void main(String[] args)
    {
        JFrame main_frame = new JFrame("GUI APP-1");
        
        main_frame.setSize(300,600);
        main_frame.setLayout(null);
        main_frame.setVisible(true);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        new UserInfo(main_frame);   
        
    }
}

class UserInfo
{
    public UserInfo(JFrame main_frame)
    {
        /// name label
        JLabel name_label = new JLabel("Name");
        main_frame.add(name_label);
        name_label.setBounds(0,50,50,30);
        ///name label ends

        ///name textfield
        JTextField name_TextField =new JTextField();  
        main_frame.add(name_TextField);
        name_TextField.setBounds(52,50,200,30);  
        ///name textfield ends
        
        ///roll label
        JLabel roll_label = new JLabel("Roll");
        main_frame.add(roll_label);
        roll_label.setBounds(0,100,50,30);
        //roll label ends

        ///roll textfield
        JTextField roll_TextField =new JTextField();  
        main_frame.add(roll_TextField);
        roll_TextField.setBounds(52,100,200,30);  
        ///roll textfield ends

        ///bio label
        JLabel bio_label = new JLabel("Bio");
        main_frame.add(bio_label);
        bio_label.setBounds(0,150,50,30);
        //bio label ends

        ///bio text-area 
        JTextArea bio_TextArea=new JTextArea();
        main_frame.add(bio_TextArea);
        bio_TextArea.setBounds(52,150,200,150);  
        ///bio text-area ends
       
        ///submit button
        JButton submit_button=new JButton(new ImageIcon("submit.jpeg")); 
        main_frame.add(submit_button);
        submit_button.setBounds(26,355,247,113); 
        ///submit button ends

        ///submit button action listener
         submit_button.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                String name_string = "name :" + name_TextField.getText();
                String roll_string = "roll :" + roll_TextField.getText();
                String bio_string =  "bio  :" + bio_TextArea.getText();                
                System.out.println(name_string);
                System.out.println(roll_string);
                System.out.println(bio_string);
                

            }  
        });  
        ///submit button action listener ends
    }    
}

