package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.AuthController;
import controllers.homeController;
import models.AuthModel;
import models.homeModel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class homeView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public homeView() {
		setTitle("Home");
		setBounds(100, 100, 750, 700);
	    setResizable(true);
	    getContentPane().setLayout(new BorderLayout());
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(false);
	    setLocationRelativeTo(null);
		
	    contentPane = new JPanel();
	    contentPane.setLayout(null);
	    setContentPane(contentPane);
	    
	    homeViewP();
	}

	public void homeViewP() {
		
	    Font titulos = new Font("Inika", Font.BOLD, 32);
	    Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
	    Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);

	    
	    JPanel homeFondo = new JPanel();
	    homeFondo.setBounds(0, 0, 750, 700);
	    homeFondo.setBackground(new Color(0, 128, 128));
	    getContentPane().add(homeFondo);
	    homeFondo.setLayout(null);
	    contentPane.add(homeFondo);
	    
	    JPanel widget1 = new JPanel();
	    widget1.setBounds(21, 131, 156, 76);
	    homeFondo.add(widget1);
	    widget1.setLayout(null);
	    
	    JLabel textW1 = new JLabel("543 usuarios activos");
	    textW1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    textW1.setHorizontalAlignment(SwingConstants.CENTER);
	    textW1.setBounds(10, 37, 136, 29);
	    widget1.add(textW1);
	    
	    JPanel widget2 = new JPanel();
	    widget2.setBounds(199, 131, 156, 76);
	    homeFondo.add(widget2);
	    widget2.setLayout(null);
	    
	    JLabel lblNotificaciones = new JLabel("23 notificaciones");
	    lblNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNotificaciones.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNotificaciones.setBounds(10, 37, 136, 29);
	    widget2.add(lblNotificaciones);
	    
	    JPanel widget3 = new JPanel();
	    widget3.setBounds(381, 131, 156, 76);
	    homeFondo.add(widget3);
	    widget3.setLayout(null);
	    
	    JLabel lblAm = new JLabel("08:22 a.m.");
	    lblAm.setHorizontalAlignment(SwingConstants.CENTER);
	    lblAm.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblAm.setBounds(10, 37, 136, 29);
	    widget3.add(lblAm);
	    
	    JPanel widget4 = new JPanel();
	    widget4.setBounds(559, 131, 156, 76);
	    homeFondo.add(widget4);
	    widget4.setLayout(null);
	    
	    JLabel lblEstadisticasGenerales = new JLabel("Estadisticas generales");
	    lblEstadisticasGenerales.setHorizontalAlignment(SwingConstants.CENTER);
	    lblEstadisticasGenerales.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEstadisticasGenerales.setBounds(10, 37, 136, 29);
	    widget4.add(lblEstadisticasGenerales);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(21, 21, 695, 80);
	    homeFondo.add(panel);
	    panel.setLayout(null);
	    
	    JLabel lblHome = new JLabel("Home");
	    lblHome.setHorizontalAlignment(SwingConstants.CENTER);
	    lblHome.setFont(new Font("Tahoma", Font.PLAIN, 28));
	    lblHome.setBounds(224, 10, 241, 61);
	    panel.add(lblHome);
	    
	    JButton btnNewButton = new JButton("Usuarios");
	    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
	    btnNewButton.setBounds(21, 267, 230, 120);
	    homeFondo.add(btnNewButton);
	    
	    JButton btnNewButton_1 = new JButton("Registro");
	    btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnNewButton_1.setBounds(261, 267, 230, 120);
	    homeFondo.add(btnNewButton_1);
	    
	    JButton btnNewButton_2 = new JButton("Configuración");
	    btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
	    btnNewButton_2.setBounds(497, 267, 230, 120);
	    homeFondo.add(btnNewButton_2);
	    
	    
	}
}
