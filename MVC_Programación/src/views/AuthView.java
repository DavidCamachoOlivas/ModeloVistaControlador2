package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controllers.AuthController;
import controllers.homeController;
import models.AuthModel;

public class AuthView extends JFrame {
	private AuthModel model,altaUser;
	private AuthController controller;
	private homeController home;
	public AuthView(AuthController controller, AuthModel model) {
		this.controller = controller;
		this.model = model;
		altaUser = new AuthModel();
	}

	public JFrame login() {
		
		setTitle("login");
		setBounds(100, 100, 750, 700);
		setResizable(true);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	    Font titulos = new Font("Inika", Font.BOLD, 32);
	    Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
	    Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);

	    
	    JPanel fondo = new JPanel();
	    fondo.setBounds(0, 0, 750, 700);
	    fondo.setBackground(new Color(0, 128, 128));
	    fondo.setLayout(null);
	    add(fondo); 

	    JPanel etiqueta1 = new JPanel();
	    etiqueta1.setSize(600, 600);
	    etiqueta1.setLocation(50, 30);
	    etiqueta1.setOpaque(false);
	    etiqueta1.setForeground(Color.black); 
	    etiqueta1.setLayout(null);
	    fondo.add(etiqueta1);
		
		JLabel titulo = new JLabel("Inicio de sesión");
		
		titulo.setSize(500, 50);
		titulo.setLocation(50,40);
		titulo.setHorizontalAlignment(JLabel.CENTER); 
		titulo.setVerticalAlignment(JLabel.CENTER); 
		titulo.setVisible(true);
		titulo.setOpaque(false);
		titulo.setBackground(null);
		titulo.setForeground(Color.white);
		titulo.setFont(titulos);
		
		etiqueta1.add(titulo);

		JLabel nombre = new JLabel("Nombre de usuario:");
		
		nombre.setSize(450, 50);
		nombre.setLocation(30,130);
		nombre.setBackground(new Color(0, 128, 128));
		nombre.setHorizontalAlignment(JLabel.LEFT); 
		nombre.setVerticalAlignment(JLabel.CENTER); 
		nombre.setVisible(true);
		nombre.setOpaque(true);
		nombre.setForeground(Color.white);
		nombre.setFont(texto);
		etiqueta1.add(nombre);
		
		JTextField nombreInp = new JTextField();
		
		nombreInp.setBounds(20, 180, 500, 40);
		nombreInp.setBackground(Color.white);
		nombreInp.setForeground(Color.black);
		nombreInp.setVisible(true);
		nombreInp.setOpaque(true);
		nombreInp.setFont(texto);
		nombreInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(nombreInp);
		
		JLabel contraseña = new JLabel("Contraseña:");
		
		contraseña.setSize(450, 50);
		contraseña.setLocation(30,260);
		contraseña.setBackground(new Color(0, 128, 128));
		contraseña.setHorizontalAlignment(JLabel.LEFT); 
		contraseña.setVerticalAlignment(JLabel.CENTER); 
		contraseña.setVisible(true);
		contraseña.setOpaque(true);
		contraseña.setForeground(Color.white);
		contraseña.setFont(texto);
		etiqueta1.add(contraseña);
		
		JPasswordField contraInp = new JPasswordField();
		
		contraInp.setBounds(20, 310, 500, 40);
		contraInp.setBackground(Color.white);
		contraInp.setForeground(Color.black);
		contraInp.setVisible(true);
		contraInp.setOpaque(true);
		contraInp.setFont(texto);
		contraInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(contraInp);
		
		JCheckBox caja = new JCheckBox();
		
		caja.setBounds(20, 370, 170, 30);
		caja.setText("Recordar mi usuario");
		caja.setVisible(true);
		caja.setOpaque(true);
		caja.setForeground(Color.black);
		caja.setFont(texto);
		etiqueta1.add(caja);
		
		
		JButton contraOlvidada = new JButton();
		
		contraOlvidada.setBounds(280, 370, 260, 30);
		contraOlvidada.setText("<html><u>¿Olvidaste tu contraseña?</u></html>");
		contraOlvidada.setVisible(true);
		contraOlvidada.setOpaque(true);
		contraOlvidada.setForeground(Color.black);
		contraOlvidada.setBorderPainted(false);
		contraOlvidada.setFont(texto);
		etiqueta1.add(contraOlvidada);
		this.setVisible(true);
		
		
		JButton enter = new JButton();
		
		enter.setBounds(400, 532, 160, 40);
		enter.setText("Ingresar");
		enter.setVisible(true);
		enter.setOpaque(true);
		enter.setForeground(Color.black);
		enter.setFont(texto);
		etiqueta1.add(enter);
		this.setVisible(true);
		
		
		
		enter.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usuario= new String(nombreInp.getText());
				String contraseña= new String(contraInp.getPassword());
				Boolean flag1=false,flag2=false;
				
				
				if(usuario.equals("")) {
					nombreInp.setBorder(BorderFactory.createLineBorder(Color.red,2));
					JOptionPane.showMessageDialog(AuthView.this, "No se agregó nombre de usuario","Error al acceder",JOptionPane.WARNING_MESSAGE);
				}
				else {
					flag2=true;
				}
				if(contraseña.equals("")) {
					contraInp.setBorder(BorderFactory.createLineBorder(Color.red,2));
					JOptionPane.showMessageDialog(AuthView.this, "No se agregó contraseña","Error al acceder",JOptionPane.WARNING_MESSAGE);
				}
				else {
					flag1=true;
				}
				if(flag1&&flag2) {
					boolean user_auth = model.access(usuario,contraseña);
					if(user_auth) {
						nombreInp.setBorder(BorderFactory.createLineBorder(Color.green,2));
						contraInp.setBorder(BorderFactory.createLineBorder(Color.green,2));
						JOptionPane.showMessageDialog(AuthView.this, "Usuario ingresado con exito.");
						dispose();
						homeController controller = new homeController();
						controller.home();
					}
					else {
						JOptionPane.showMessageDialog(AuthView.this, "Usuario o contraseña incorrectas","Error al acceder",JOptionPane.WARNING_MESSAGE);
					}
				}
			}});
		
		JButton ir_a_registro = new JButton("<html><u>¿No tienes cuenta?</u></html>");
		ir_a_registro.setSize(200,50);
		ir_a_registro.setLocation(25,450);
		ir_a_registro.setBackground(null);
		ir_a_registro.setOpaque(true);
		ir_a_registro.setForeground(Color.white);
		ir_a_registro.setBorderPainted(false);
		ir_a_registro.setFont(texto);
		ir_a_registro.setFocusPainted(true);
		ir_a_registro.setContentAreaFilled(false);
		ir_a_registro.setVisible(true);
		ir_a_registro.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("registro");
				}
			});
		
		etiqueta1.add(ir_a_registro);
		
		
		
        setVisible(true);
		
        return this;
	}
	
	public JFrame registro() {
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		//JFrame frameRegistro = new JFrame();
		setTitle("login");
		setBounds(100, 100, 750, 700);
		setResizable(true);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		JPanel registro = new JPanel();
		registro.setLocation(0,0);
		registro.setSize(1000, 700);
		registro.setOpaque(true);
		registro.setBackground(Color.black);
		registro.setVisible(true);
		registro.setLayout(null);
		add(registro);
		
		
		
		JPanel etiqueta1 = new JPanel();
		etiqueta1.setSize(600, 600);
		etiqueta1.setLocation(50, 30);
		etiqueta1.setBackground(new Color(0, 128, 128));
		etiqueta1.setVisible(true);
		etiqueta1.setOpaque(true);
		etiqueta1.setForeground(Color.decode("#bdc2bc")); 
		etiqueta1.setLayout(null);
		
		registro.add(etiqueta1);
		
		JLabel titulo = new JLabel("Registro");
		
		titulo.setSize(500, 50);
		titulo.setLocation(50,40);
		titulo.setBackground(null);
		titulo.setHorizontalAlignment(JLabel.CENTER); 
		titulo.setVerticalAlignment(JLabel.CENTER); 
		titulo.setVisible(true);
		titulo.setOpaque(true);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(titulos);
		
		etiqueta1.add(titulo);

		JLabel nombre = new JLabel("Nombre(s):");
		
		nombre.setSize(250, 50);
		nombre.setLocation(20,100);
		nombre.setBackground(null);
		nombre.setHorizontalAlignment(JLabel.LEFT); 
		nombre.setVerticalAlignment(JLabel.CENTER); 
		nombre.setVisible(true);
		nombre.setOpaque(true);
		nombre.setForeground(Color.WHITE);
		nombre.setFont(texto);
		etiqueta1.add(nombre);
		
		JTextField nombreInp = new JTextField();
		
		nombreInp.setBounds(20, 140, 250, 40);
		nombreInp.setBackground(Color.white);
		nombreInp.setForeground(Color.black);
		nombreInp.setVisible(true);
		nombreInp.setOpaque(true);
		nombreInp.setFont(texto);
		nombreInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(nombreInp);
		nombreInp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isLetter(c)&&!Character.isWhitespace(c)) {
					e.consume();
				}
			}
		});
		
		JLabel apellidos = new JLabel("Apellidos:");
		
		apellidos.setSize(250, 50);
		apellidos.setLocation(20,170);
		apellidos.setBackground(null);
		apellidos.setHorizontalAlignment(JLabel.LEFT); 
		apellidos.setVerticalAlignment(JLabel.CENTER); 
		apellidos.setVisible(true);
		apellidos.setOpaque(true);
		apellidos.setForeground(Color.WHITE);
		apellidos.setFont(texto);
		etiqueta1.add(apellidos);
		
		JTextField apellidosInp = new JTextField();
		
		apellidosInp.setBounds(20, 210, 250, 40);
		apellidosInp.setBackground(Color.white);
		apellidosInp.setForeground(Color.black);
		apellidosInp.setVisible(true);
		apellidosInp.setOpaque(true);
		apellidosInp.setFont(texto);
		apellidosInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(apellidosInp);
		apellidosInp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isLetter(c)&&!Character.isWhitespace(c)) {
					e.consume();
				}
			}
		});
		
		JLabel empresa = new JLabel("Empresa:");
		
		empresa.setSize(250, 40);
		empresa.setLocation(20,250);
		empresa.setBackground(null);
		empresa.setHorizontalAlignment(JLabel.LEFT); 
		empresa.setVerticalAlignment(JLabel.CENTER); 
		empresa.setVisible(true);
		empresa.setOpaque(true);
		empresa.setForeground(Color.WHITE);
		empresa.setFont(texto);
		etiqueta1.add(empresa);
		
		JTextField empresaInp = new JTextField();
		
		empresaInp.setBounds(20, 290, 250, 40);
		empresaInp.setBackground(Color.white);
		empresaInp.setForeground(Color.black);
		empresaInp.setVisible(true);
		empresaInp.setOpaque(true);
		empresaInp.setFont(texto);
		empresaInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(empresaInp);
		empresaInp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isLetterOrDigit(c)&&!Character.isWhitespace(c)) {
					e.consume();
				}
			}
		});
		
		JLabel cargo = new JLabel("Cargo:");
		
		cargo.setSize(250, 40);
		cargo.setLocation(20,330);
		cargo.setBackground(null);
		cargo.setHorizontalAlignment(JLabel.LEFT); 
		cargo.setVerticalAlignment(JLabel.CENTER); 
		cargo.setVisible(true);
		cargo.setOpaque(true);
		cargo.setForeground(Color.WHITE);
		cargo.setFont(texto);
		etiqueta1.add(cargo);
		cargo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isLetter(c)&&!Character.isWhitespace(c)) {
					e.consume();
				}
			}
		});
		
		JTextField cargoInp = new JTextField();
		
		cargoInp.setBounds(20, 370, 250, 40);
		cargoInp.setBackground(Color.white);
		cargoInp.setForeground(Color.black);
		cargoInp.setVisible(true);
		cargoInp.setOpaque(true);
		cargoInp.setFont(texto);
		cargoInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(cargoInp);
		
		
		JLabel ambito = new JLabel("Ámbito de la empresa:");
		
		ambito.setSize(170, 50);
		ambito.setLocation(20,410);
		ambito.setBackground(null);
		ambito.setHorizontalAlignment(JLabel.LEFT); 
		ambito.setVerticalAlignment(JLabel.CENTER); 
		ambito.setVisible(true);
		ambito.setOpaque(true);
		ambito.setForeground(Color.WHITE);
		ambito.setFont(texto);
		etiqueta1.add(ambito);
		
		String [] ambito_dataset = {"Tecnología","Salud","Educación","Comercio","Otro"};
		
		JComboBox ambitoInp = new JComboBox(ambito_dataset);
		
		ambitoInp.setSize(170, 30);
		ambitoInp.setLocation(200,420);
		ambitoInp.setBackground(Color.white);
		ambitoInp.setVisible(true);
		ambitoInp.setOpaque(true);
		ambitoInp.setForeground(Color.black);
		ambitoInp.setFont(texto);
		etiqueta1.add(ambitoInp); 
		
		JLabel nombreUser = new JLabel("Usuario:");
		
		nombreUser.setSize(250, 50);
		nombreUser.setLocation(300,100);
		nombreUser.setBackground(null);
		nombreUser.setHorizontalAlignment(JLabel.LEFT); 
		nombreUser.setVerticalAlignment(JLabel.CENTER); 
		nombreUser.setVisible(true);
		nombreUser.setOpaque(true);
		nombreUser.setForeground(Color.WHITE);
		nombreUser.setFont(texto);
		etiqueta1.add(nombreUser);
		
		JTextField userInp = new JTextField();
		
		userInp.setBounds(300, 140, 250, 40);
		userInp.setBackground(Color.white);
		userInp.setForeground(Color.black);
		userInp.setVisible(true);
		userInp.setOpaque(true);
		userInp.setFont(texto);
		userInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(userInp);
		userInp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isLetterOrDigit(c)&&!Character.isWhitespace(c)&&!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		
		JLabel contra = new JLabel("Contraseña:");
		
		contra.setSize(250, 50);
		contra.setLocation(300,170);
		contra.setBackground(null);
		contra.setHorizontalAlignment(JLabel.LEFT); 
		contra.setVerticalAlignment(JLabel.CENTER); 
		contra.setVisible(true);
		contra.setOpaque(true);
		contra.setForeground(Color.WHITE);
		contra.setFont(texto);
		etiqueta1.add(contra);
		
		JPasswordField contraInp = new JPasswordField();
		
		contraInp.setBounds(300, 210, 250, 40);
		contraInp.setBackground(Color.white);
		contraInp.setForeground(Color.black);
		contraInp.setVisible(true);
		contraInp.setOpaque(true);
		contraInp.setFont(texto);
		contraInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(contraInp);
		contraInp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isWhitespace(c)) {
					e.consume();
				}
			}
		});
		
		JLabel contra1 = new JLabel("Confirmar contraseña:");
		
		contra1.setSize(250, 50);
		contra1.setLocation(300,250);
		contra1.setBackground(null);
		contra1.setHorizontalAlignment(JLabel.LEFT); 
		contra1.setVerticalAlignment(JLabel.CENTER); 
		contra1.setVisible(true);
		contra1.setOpaque(true);
		contra1.setForeground(Color.WHITE);
		contra1.setFont(texto);
		etiqueta1.add(contra1);
		
		JPasswordField contraInp1 = new JPasswordField();
		
		contraInp1.setBounds(300, 290, 250, 40);
		contraInp1.setBackground(Color.white);
		contraInp1.setForeground(Color.black);
		contraInp1.setVisible(true);
		contraInp1.setOpaque(true);
		contraInp1.setFont(texto);
		contraInp1.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(contraInp1);
		contraInp1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isWhitespace(c)) {
					e.consume();
				}
			}
		});
		
		JLabel correo = new JLabel("Correo electrónico:");
		
		correo.setSize(250, 50);
		correo.setLocation(300,330);
		correo.setBackground(null);
		correo.setHorizontalAlignment(JLabel.LEFT); 
		correo.setVerticalAlignment(JLabel.CENTER); 
		correo.setVisible(true);
		correo.setOpaque(true);
		correo.setForeground(Color.WHITE);
		correo.setFont(texto);
		etiqueta1.add(correo);
		
		JTextField correoInp = new JTextField();
		
		correoInp.setBounds(300, 370, 250, 40);
		correoInp.setBackground(Color.white);
		correoInp.setForeground(Color.black);
		correoInp.setVisible(true);
		correoInp.setOpaque(true);
		correoInp.setFont(texto);
		correoInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(correoInp);
		correoInp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isWhitespace(c)) {
					e.consume();
				}
			}
		});
		
		
		JLabel terminos = new JLabel("Terminos:");
		
		terminos.setSize(200, 50);
		terminos.setLocation(20,450);
		//terminos.setBackground(Color.decode("#2c8444"));
		terminos.setBackground(null);
		terminos.setHorizontalAlignment(JLabel.LEFT); 
		terminos.setVerticalAlignment(JLabel.CENTER); 
		terminos.setVisible(true);
		terminos.setOpaque(true);
		terminos.setForeground(Color.WHITE);
		terminos.setFont(texto);
		etiqueta1.add(terminos);
		
		ButtonGroup terminosCheck = new ButtonGroup();
		
		JRadioButton terms1 = new JRadioButton("Acepto los terminos", true);
		terms1.setBounds(20, 490, 170, 30);
		//terms1.setBackground(Color.decode("#2c8444"));
		terms1.setBackground(null);
		terms1.setFont(texto);
		terms1.setForeground(Color.WHITE);
		terms1.setBorderPainted(true);
		//terms1.setBorder(BorderFactory.createLineBorder(Color.red));
		etiqueta1.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("No acepto los terminos");
		terms2.setBounds(250, 490, 200, 30);
		terms2.setBackground(null);
		//terms2.setBackground(Color.decode("#2c8444"));
		terms2.setFont(texto);
		terms2.setForeground(Color.WHITE);
		terms2.setBorderPainted(true);
		//terms2.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		etiqueta1.add(terms2);
		
		terminosCheck.add(terms1);
		terminosCheck.add(terms2);
		
		
		
		JButton enter = new JButton();
		
		enter.setBounds(400, 532, 160, 40);
		enter.setText("Ingresar");
		enter.setVisible(true);
		enter.setOpaque(true);
		enter.setForeground(Color.black);
		enter.setFont(texto);
		
		this.setVisible(true);
		
		enter.addActionListener(new ActionListener() {
			boolean nombres = false;
			boolean apellidos = false;
			boolean empresa = false;
			boolean cargo = false;
			boolean usuario = false;
			boolean contraseña = false;
			boolean contraseñaConfirm = false;
			boolean correo = false;
			boolean terminos = false;
			boolean copia = false;

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//---------------------------------------validacion nombres
				if (nombreInp.getText().equals("")) {
				    nombreInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				    
				    JOptionPane.showMessageDialog(null, "Llene los espacios correspondientes", "Advertencia", JOptionPane.WARNING_MESSAGE);

				}
				else {
					nombreInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					nombres= true;
				    
				}
				
				//---------------------------------------validación apellidos
				if(apellidosInp.getText().equals("")) {
					apellidosInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
				else {
					apellidosInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					apellidos = true;
				}
				//---------------------------------------validación empresa
				if(empresaInp.getText().equals("")) {
					empresaInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
				else {
					empresaInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					empresa = true;
				}
				//---------------------------------------validación cargo
				if(cargoInp.getText().equals("")) {
					cargoInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
				else {
					cargoInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					cargo = true;
				}
				//---------------------------------------validación user
				if(userInp.getText().equals("")) {
					userInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
				else {
					userInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					usuario = true;
				}
				//---------------------------------------validación contraseña
				if(contraInp.getText().equals("")) {
					contraInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
				else {
					contraInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					contraseña = true;
				}
				//---------------------------------------validación contraseña Confirm
				if(contraInp1.getText().equals("")) {
					contraInp1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
				else {
					contraInp1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					contraseñaConfirm = true;
				}
				//---------------------------------------validación correo
				if(correoInp.getText().equals("")) {
					correoInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				}
				else {
					correoInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					correo = true;
				}
				
				//---------------------------------------validación terminos y condiciones
				if(!terms1.isSelected()) {
					terms1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
					JOptionPane.showMessageDialog(null, "Acepte los terminos y condiciones",  "Advertencia",JOptionPane.WARNING_MESSAGE);
				}
				else {
					terms1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					terminos=true;
				}
				
				//--------------------------------------------------------------------------------------------
				if(contraInp.getText().equals(contraInp1.getText())) {
					if(nombres && apellidos && empresa && cargo && usuario && contraseña && contraseñaConfirm && correo && terminos) {
						copia = altaUser.altaUser(nombreInp.getText(),apellidosInp.getText(),empresaInp.getText(),cargoInp.getText(),userInp.getText(),contraInp.getText(),contraInp1.getText(),correoInp.getText());
						System.out.println("nuevo user: "+copia);
						if(copia) {
							JOptionPane.showMessageDialog(null,"Registro de nuevo usuario exitoso", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
			}});
		etiqueta1.add(enter);
		
		JButton ir_a_login = new JButton("<html><u>Iniciar sesión</u></html>");
		ir_a_login.setSize(150,50);
		ir_a_login.setLocation(20,530);
		ir_a_login.setAlignmentX(LEFT_ALIGNMENT);
		ir_a_login.setBackground(null);
		ir_a_login.setVisible(true);
		ir_a_login.setOpaque(true);
		ir_a_login.setForeground(Color.white);
		ir_a_login.setBorderPainted(false);
		ir_a_login.setFont(texto);
		
		etiqueta1.add(ir_a_login);
		
		ir_a_login.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				manager("login");
			}});
		setVisible(true);
		return this;
	}
	
	
	
	public void manager(String target) {
		this.getContentPane().removeAll();
		if(target.equals("login")) {
			dispose();
			login();
			//this.getContentPane().add(login());
		}
		if(target.equals("registro")) {
			dispose();
			registro();
			//this.getContentPane().add(registro());
		}
		/*if(target.equals("home")) {
			this.add(home.home());
		}*/
		this.repaint();
		this.revalidate();
	}
	
	
}
