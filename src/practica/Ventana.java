package practica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Ventana extends JFrame {

    public Ventana() {

        // configuraciones basicas
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //this.setSize(500 ,500);
      //this.setLocation(100,100);
        this.setBounds(200,200,500,500);
        this.setMinimumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(800,800));
        this.setLocationRelativeTo(null);
        this.setTitle("Hola");
        this.setLayout(null);
        //this.setBackground(Color.blue);
      	//this.setOpacity(1);
        this.getContentPane().setBackground(Color.pink);

        JPanel login_container = new JPanel();
        login_container.setSize(400,400);
        login_container.setLocation(50,50);
        login_container.setBackground(Color.gray);
        login_container.setLayout(null);
        this.add(login_container);

        // Añadiendo elementos

        JLabel tag_title = new JLabel();
        tag_title.setText("Bienvenido");
        tag_title.setSize(150,30);
        tag_title.setLocation(125,20);
        tag_title.setBackground(Color.pink);
        tag_title.setOpaque(true);
        tag_title.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        tag_title.setVerticalAlignment(JLabel.CENTER);
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(tag_title);

        // Email
        JLabel mail_label = new JLabel();
        mail_label.setText("Correo electónico");
        mail_label.setSize(150,20);
        mail_label.setLocation(60,80);
        mail_label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        login_container.add(mail_label);
        
        JTextField email_input = new JTextField();
        email_input.setSize(280,40);
        email_input.setLocation(60,100);
        login_container.add(email_input);

        // Contraseña
        JLabel pass_label = new JLabel();
        pass_label.setText("Contraseña");
        pass_label.setSize(100,20);
        pass_label.setLocation(60,140);
        pass_label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        login_container.add(pass_label);
        
        JPasswordField password_input = new JPasswordField();
        password_input.setSize(280,40);
        password_input.setLocation(60,160);
        login_container.add(password_input);

        // Checkbox
        JCheckBox rememberme = new JCheckBox("Recordarme");
        rememberme.setSize(140,40);
        rememberme.setLocation(60,220);
        rememberme.setOpaque(false);
        login_container.add(rememberme);

        // Botón
        JButton access_btn = new JButton();
        access_btn.setText("Acceder");
        access_btn.setSize(150,40);
        access_btn.setLocation(120,280);
        access_btn.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        login_container.add(access_btn);

        this.repaint();
    }

    public static void main(String[] args) {
        new Ventana();
    }
}