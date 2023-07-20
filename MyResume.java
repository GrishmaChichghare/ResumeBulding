package ResumeBulding;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyResume extends JFrame 
{
    MyResume()
    {
        setLayout(new BorderLayout());
        JLabel l=new JLabel("MY RESUME BUILDER");
        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
        JPanel jp3=new JPanel();

        jp2.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();

        JLabel l2=new JLabel("Name :");
        gbc.gridx=0;
        gbc.gridy=0;
        jp2.add(l2,gbc);
        l2.setFont(new Font("Dialog", Font.BOLD, 16));

        JTextField t2=new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.gridwidth=2;
        jp2.add(t2,gbc);

        JLabel l3=new JLabel("DOB :");
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=1;
        jp2.add(l3,gbc);
        l3.setFont(new Font("Dialog", Font.BOLD, 16));

        JTextField t3=new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.gridwidth=2;
        jp2.add(t3,gbc);

        JLabel l4=new JLabel("Gender :");
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=1;
        jp2.add(l4,gbc);
        l4.setFont(new Font("Dialog", Font.BOLD, 16));

        JRadioButton r1=new JRadioButton("Male");
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.gridwidth=1;
        jp2.add(r1,gbc);

        JRadioButton r2=new JRadioButton("Female");
        gbc.gridx=2;
        gbc.gridy=2;
        gbc.gridwidth=1;
        jp2.add(r2,gbc);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l5=new JLabel("Address :");
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=1;
        jp2.add(l5,gbc);
        l5.setFont(new Font("Dialog", Font.BOLD, 16));

        JTextArea ta=new JTextArea(10,20);
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.gridwidth=2;
        jp2.add(ta,gbc);
        
        JLabel l7=new JLabel("Email :");
        gbc.gridx=0;
        gbc.gridy=10;
        gbc.gridwidth=1;
        jp2.add(l7,gbc);
        l7.setFont(new Font("Dialog", Font.BOLD, 16));

        JTextField t5=new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=10;
        gbc.gridwidth=2;
        jp2.add(t5,gbc);

        JButton b1=new JButton("OK");
        JButton b2=new JButton("SAVE");
        JButton b3=new JButton("Cancel");
        JButton b4=new JButton("RESET");

        jp1.setLayout(new FlowLayout());
        jp3.setLayout(new FlowLayout());

        jp1.add(l);

        jp3.add(b1);
        jp3.add(b2);
        jp3.add(b3);
        jp3.add(b4);

        add(jp1,BorderLayout.NORTH);
        add(jp2,BorderLayout.CENTER);
        add(jp3,BorderLayout.SOUTH);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) 
    {
        new MyResume();
    }
}
