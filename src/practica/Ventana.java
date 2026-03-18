package practica;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Ventana extends JFrame {

    public Ventana() {

        // configuraciones basicas
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //this.setSize(500 ,500);
      //this.setLocation(100,100);
        this.setBounds(200,200,1000,800);
        this.setMinimumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(800,800));
        this.setLocationRelativeTo(null);
        this.setTitle("Hola");
        this.setLayout(null);
        //this.setBackground(Color.blue);
      	//this.setOpacity(1);
        this.getContentPane().setBackground(Color.pink);
        
        try {
        	
        	Image IconImage = ImageIO.read(getClass().getResource("/imagen/black-cat.png"));
        	
        	this.setIconImage(IconImage);
        	
        } catch (IOException e) {
        	
        	e.printStackTrace();
        	      	
        }
        
        JMenuBar barra = new JMenuBar();
        this.setJMenuBar(barra);
        
        JMenu menu1 = new JMenu("Archivo");
        barra.add(menu1);
        
        JMenuItem opt1_mi = new JMenuItem("Abrir");
        menu1.add(opt1_mi);
        
        JMenuItem opt2_mi = new JMenuItem("Nuevo");
        menu1.add(opt2_mi);
        
        JMenuItem opt3_mi = new JMenuItem("Cerrar");
        menu1.add(opt3_mi);
        
        menu1.addSeparator();
        
        JMenu menu2 = new JMenu("Guardar");
        menu1.add(menu2);
        
        JMenuItem opt4_mi = new JMenuItem("Guardar");
        menu2.add(opt4_mi);
        
        JMenuItem opt5_mi = new JMenuItem("Guardar como");
        menu2.add(opt5_mi);
        
             
        //this.login();
        //this.registro();
        //this.calculadora();
        //this.calculadora_layout();
        //this.pintar();
        this.Dibujo();
        
        this.setVisible(true);
        
        //this.users();
        this.repaint();
    
    }
    

    public void pintar() {
    	
    	JPanel pane = new JPanel(){
    		@Override
    		
    		protected void paintComponent(Graphics g) {
    			super.paintComponents(g);

    			
    			Graphics2D g2d = (Graphics2D) g;
    			
    			g2d.drawLine(0, 0, 1000,700);
    			
    			g2d.setColor(Color.ORANGE);
    			g2d.drawOval(100, 100, 150, 50);
    			
    			g2d.setStroke(new BasicStroke(3));
    			g2d.setColor(Color.MAGENTA);
    			g2d.drawPolygon(new int[] {300,100,500}, new int[] {100,300,300},3);
    			
    			g2d.drawRect(250, 300, 100, 100);
    			g2d.drawRoundRect(500,150,100,100,10,10);
    			
    			g2d.drawArc(400, 100, 100, 100, 0, 90);
    			
    			g2d.setFont(new Font("Arial",Font.BOLD,22));
    			g2d.drawString("Hola",100,100);
    			
    			g2d.setColor(Color.black);
    			g2d.fillOval(500, 50, 50, 50);
    			
    			g2d.fillPolygon(new int[] {500,300,700}, new int[] {300,500,500},3);
    			
    			g2d.fillRect(550, 500, 100, 100);
    			
    			g2d.setColor(Color.orange);
    			g2d.fillRoundRect(500, 500, 100, 100, 10, 10);
    			
    			g2d.fillArc(450, 150, 100, 100, 0, 300);
    			
    			BufferedImage image;
				try {
					image = ImageIO.read(new File("src/imagen/black-cat.png"));
					g2d.drawImage(image, 0, 0, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			
    			
    		}
    	};
    	pane.setSize(1000,700);
    	pane.setLocation(0,0);
    	this.add(pane);
    }

       public void login() {
       JPanel login_container = new JPanel();
        login_container.setBounds(70,100,400,600);
        login_container.setBackground(Color.LIGHT_GRAY);
        login_container.setLayout(null);
        this.add(login_container);

        // Añadiendo elementos

        JLabel tag_title = new JLabel();
        tag_title.setText("Bienvenido");
        tag_title.setBounds(100,40,200,50);
        tag_title.setBackground(new Color(255,192,203));
        tag_title.setForeground(Color.BLACK);
        tag_title.setOpaque(true);
        tag_title.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        tag_title.setVerticalAlignment(JLabel.CENTER);
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(tag_title);

        // Email
        JLabel mail_label = new JLabel();
        mail_label.setText("Correo electónico");
        mail_label.setBounds(50,130,300,20);
        mail_label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        login_container.add(mail_label);
        
        JTextField email_input = new JTextField();
        email_input.setBounds(50,160,300,40);
        login_container.add(email_input);

        // Contraseña
        JLabel pass_label = new JLabel();
        pass_label.setText("Contraseña");
        pass_label.setBounds(50,220,300,20);
        pass_label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        login_container.add(pass_label);
        
        JPasswordField password_input = new JPasswordField();
        password_input.setBounds(50,240,300,40);
        login_container.add(password_input);

        // Checkbox
        JCheckBox rememberme = new JCheckBox("Recordarme");
        rememberme.setBounds(50,300,150,30);
        rememberme.setOpaque(false);
        login_container.add(rememberme);

        // Botón
        JButton access_btn = new JButton();
        access_btn.setText("Acceder");
        access_btn.setBounds(125,360,150,45);
        access_btn.setOpaque(true);
        access_btn.setBackground(new Color(255,192,203));
        access_btn.setForeground(Color.black);
        access_btn.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        login_container.add(access_btn);
        
       }
       public void registro() {
        //panel  
        JPanel register_container= new JPanel();
        register_container.setBounds(530,100,400,600);
        register_container.setOpaque(true);
        register_container.setBackground(Color.LIGHT_GRAY);
        register_container.setLayout(null);
        this.add(register_container);
        
        //titulo
        JLabel register_title = new JLabel();
        register_title.setText("Registro");
        register_title.setBounds(100,40,200,50);
        register_title.setBackground(new Color(255,192,203));
        register_title.setForeground(Color.BLACK);
        register_title.setOpaque(true);
        register_title.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        register_title.setVerticalAlignment(JLabel.CENTER);
        register_title.setHorizontalAlignment(JLabel.CENTER);
        register_container.add(register_title);
        
        //label name
        JLabel name_label = new JLabel("Nombre de usuario");
        name_label.setBounds(50, 120, 300, 35);
        name_label.setOpaque(true);
        name_label.setBackground(new Color(255,192,203));
        name_label.setForeground(Color.BLACK);
        name_label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        register_container.add(name_label);
        
        JTextField name_input = new JTextField();
        name_input.setBounds(50,160,300,40);
        register_container.add(name_input);
        
        
        
        //label bio
        JLabel bio_tag = new JLabel("Bio");
        bio_tag.setBounds(50,210,300,20);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        bio_tag.setOpaque(false);
        register_container.add(bio_tag);
        
        
         // text area
        
        JTextArea bio_text = new JTextArea("asd, 10,10");
        bio_text.setBounds(50,240,300,80);
        register_container.add(bio_text);
        
        
        //preferencias
        
        
        JLabel pref_label = new JLabel("Preferencias");
        pref_label.setBounds(50,330,300,20);
        pref_label.setHorizontalAlignment(JLabel.CENTER);
        pref_label.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        register_container.add(pref_label);
        
          //check box
        
        JCheckBox opt_sweet= new JCheckBox("Dulce");
        opt_sweet.setBounds(50, 360, 100, 30);
        opt_sweet.setOpaque(false);
        register_container.add(opt_sweet);
        
        JCheckBox opt_salty = new JCheckBox("Salado");
        opt_salty.setBounds(150, 360, 100, 30);
        opt_salty.setOpaque(false);
        register_container.add(opt_salty);
        
        
        JCheckBox opt_healty =new JCheckBox("Saludable");
        opt_healty.setOpaque(false);
        opt_healty.setBounds(250, 360, 100, 30);
       register_container.add(opt_healty);
       
       
       //terms 
       JLabel terms_label = new JLabel("Terminos");
       terms_label.setBounds(50,400,300,20);
       terms_label.setOpaque(true);
       terms_label.setBackground(new Color(255,192,203));
       terms_label.setForeground(Color.BLACK);
       terms_label.setHorizontalAlignment(JLabel.CENTER);
       terms_label.setFont(new Font("Segoe UI", Font.PLAIN, 18));
       register_container.add(terms_label);
       
       
       
       //  label terms
       
       JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
       accept_terms.setBounds(50, 430, 160, 30);
       accept_terms.setOpaque(false);
       register_container.add(accept_terms);
       
       JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
       reject_terms.setOpaque(false);
       reject_terms.setBounds(210, 430, 200, 30);
       register_container.add(reject_terms);
       
       ButtonGroup terms = new ButtonGroup();
       terms.add(accept_terms);
       terms.add(reject_terms);
       
       //combo
       String[] colonias = {"Camino real" , "Arcoiris", "8 de octubre"};
       
       JComboBox colonias_combo = new JComboBox(colonias);
         colonias_combo.setBounds(50,470,300,30);
         
         register_container.add(colonias_combo);
         
         //Button
         
         JButton register_btn = new JButton ("Crear cuenta");
         register_btn.setOpaque(true);
         register_btn.setBackground(new Color(255,192,203));
         register_btn.setForeground(Color.BLACK);
         register_btn.setBounds(50, 530, 300, 45);
        register_container.add(register_btn);
    	
       }
    	public void users() {
    		JPanel panel_users = new JPanel();
    		panel_users.setBounds(50, 50, 850, 550);
    		panel_users.setOpaque(true);
    		//panel_users.setBackground(Color.white);
    		//panel_users.setBorder(BorderFactory.createLineBorder(Color.decode("#18272b"), 4, true));
    		panel_users.setLayout(null);
    		this.add(panel_users);
    		
    		String [] table_head = {"No. Control", "Nombre", "Apellidos", "Correo electrónico", "Semestre", "Carrera", "Acciones"};
    		
    		Object [][] table_body = {
    			    {"20451234", "Luis", "Hernández", "luis.hdz@example.com", "3", "Ingeniería en Sistemas", "Acciones"},
    			    {"20457891", "María", "Gómez", "maria.gmz@example.com", "5", "Arquitectura", "Acciones"},
    			    {"20453422", "Jorge", "Ramírez", "jorge.rz@example.com", "2", "Contaduría", "Acciones"},
    			    {"20458977", "Ana", "López", "ana.lp@example.com", "7", "Administración", "Acciones"},
    			    {"20452311", "Carlos", "Martínez", "carlos.mtz@example.com", "4", "Ingeniería Civil", "Acciones"},
    			    {"20455678", "Fernanda", "Soto", "fer.soto@example.com", "6", "Diseño Gráfico", "Acciones"},
    			    {"20459832", "Ricardo", "Pérez", "ricardo.pz@example.com", "1", "Ingeniería Mecánica", "Acciones"},
    			    {"20454490", "Daniela", "Vargas", "daniela.vg@example.com", "8", "Psicología", "Acciones"},
    			    {"20457701", "Héctor", "Castro", "hector.cs@example.com", "9", "Derecho", "Acciones"},
    			    {"20456642", "Sofía", "Navarro", "sofia.nv@example.com", "3", "Medicina", "Acciones"},
    			    {"20453387", "Miguel", "Ortega", "miguel.og@example.com", "10", "Ingeniería Industrial", "Acciones"},
    			    {"20451298", "Paola", "Reyes", "paola.ry@example.com", "2", "Mercadotecnia", "Acciones"}
    		};
    		
    		
    		JTable students = new JTable(table_body,table_head);
    		
    		JScrollPane final_table = new JScrollPane(students);
    		final_table.setSize(700, 150);
    		final_table.setLocation(100, 100);
    		
    		panel_users.add(final_table);
    		
    
              
       }
    	
    	public void calculadora() {
    		
    		JPanel panel_users= new JPanel();
    		panel_users.setSize(500,500);
    		panel_users.setLocation(250,50);
    		panel_users.setBackground(Color.decode("#DDDEA6"));
    		panel_users.setLayout(null);
    		this.add(panel_users);
    		
    		
    		JLabel field = new JLabel("180,00");
    		field.setSize(480,40);
    		field.setLocation(10,10);
    		field.setOpaque(true);
    		field.setBackground(Color.WHITE);
    		field.setFont(new Font("Arial", Font.BOLD,22));
    		field.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
    		panel_users.add(field);
    		
    		int cor_x = 30, cor_y = 60;
    		String [] botones = {"CE", "", "", "","7","8","9","/","4","5","6","*","1","2","3", "+","0",".","-","="};
    		
    		for(int i = 0; i < 20; i++) {
    		
    		JButton ce = new JButton(botones[i]);
    		ce.setSize(100,100);
    		ce.setLocation(cor_x, cor_y);
    		
    		cor_x += 110;
    		panel_users.add(ce);
    		
    		if(cor_x >= 420) {
    			cor_x = 30;
    			cor_y += 110;
    			
    		}
    		
    	}
    	
    }
    	public void calculadora_layout() {
    		
    		JPanel panel_users = new JPanel();
    		panel_users.setSize(500,700);
    		panel_users.setLocation(250,50);
    		panel_users.setBackground(Color.decode("#DDDEA6"));
    		panel_users.setLayout(null);
    		this.add(panel_users);
    		
    		BorderLayout mi_layout = new BorderLayout();
    		mi_layout.setVgap(20);
    		
    		panel_users.setLayout(mi_layout);
    		this.add(panel_users);
    		
    		
    		JLabel field = new JLabel("180.00");
    		field.setOpaque(true);
    	    field.setBackground(Color.WHITE);
    	    field.setFont(new Font("Segoe UI", Font.BOLD, 22));
    	    field.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
    	    panel_users.add(field,BorderLayout.NORTH);
    	    
    	    JPanel centro = new JPanel();
    	    centro.setBackground(Color.gray);
    	    centro.setLayout(new GridLayout (4,3));
    	    panel_users.add(centro,BorderLayout.CENTER);
    	    
    	    String [] botones = {"9","8","7","6","5","4","3","2","1","0","."};
    	    
    	    for (int i = 0; i < botones.length; i++) {
    	    
    	    JButton ce = new JButton(botones[i]);
    	    ce.setSize(100,100);
    	    ce.setFont(new Font("Arial",Font.BOLD,22));
    	    centro.add(ce);
    	    
    	   
    	    }
    	    
    	    JPanel sidebar = new JPanel();
    	    sidebar.setBackground(Color.black);
    	    sidebar.setLayout(new GridLayout(6,1));
    	    panel_users.add(sidebar,BorderLayout.EAST);
    	    
    	    String [] botones2 = {"+","-","*","/","=","CE"};
    	    
    	    for (int i = 0; i < botones2.length; i++) {
    	    	 JButton ce = new JButton(botones[i]);
    	    	  ce.setSize(100,100);
    	    	  ce.setFont(new Font("Arial",Font.BOLD,22));
    	    	  centro.add(ce);
    	    }
    	    	
    	    	
    	    }

    	    
    	    	
    	
    	
    	public void Dibujo() {
    	    
    	    JPanel pane = new JPanel() {
    	        @Override
    	        protected void paintComponent(Graphics g) {
    	            super.paintComponent(g); // ojo: aquí era paintComponent

    	            Graphics2D g2d = (Graphics2D) g;

    	         
    	            g2d.setColor(new Color(173, 216, 230));
    	            g2d.fillRect(0, 0, 1000, 700);

    	          
    	            g2d.setColor(new Color(34, 139, 34));
    	            g2d.fillRect(0, 400, 1000, 100);

    	            
    	            g2d.setColor(new Color(139, 69, 19));
    	            g2d.fillRect(0, 500, 1000, 200);

    	            
    	            g2d.setColor(new Color(240, 220, 130));
    	            g2d.fillRect(350, 250, 250, 180);

    	           
    	            g2d.setColor(Color.RED);
    	            g2d.fillPolygon(
    	                new int[]{330, 475, 620},
    	                new int[]{250, 150, 250},3 );
    	            
    	            g2d.setColor(new Color(101, 67, 33));
    	            g2d.fillRect(400, 300, 70, 130);

    	            
    	            g2d.setColor(Color.WHITE);
    	            g2d.fillOval(455, 360, 10, 10);

    	            
    	            g2d.setColor(new Color(173, 216, 230));
    	            g2d.fillRect(500, 300, 80, 80);

    	           
    	            g2d.setColor(Color.BLACK);
    	            g2d.drawLine(540, 300, 540, 380);
    	            g2d.drawLine(500, 340, 580, 340);

    	            
    	            g2d.setColor(Color.GRAY);
    	            g2d.fillRect(520, 170, 40, 80);
    	            
    	            g2d.setColor(new Color(222, 184, 135));

    	            for (int i = 0; i < 1000; i += 30) {
    	                g2d.fillRect(i, 350, 15, 70);
    	            }

    	  
    	            g2d.setColor(new Color(160, 120, 70));
    	            g2d.fillRect(0, 370, 1000, 10);
    	            g2d.fillRect(0, 400, 1000, 10);

    	        }
    	    };

    	    JFrame frame = new JFrame("Casa con cerco");
    	    frame.add(pane);
    	    frame.setSize(1000, 700);
    	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    frame.setLocationRelativeTo(null);
    	    frame.setVisible(true);
    	}
    	    		 

    public static void main(String[] args) {
        new Ventana();
    }
}