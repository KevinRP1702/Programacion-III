import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.print.attribute.AttributeSetUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	public Ventana() {
			this.setVisible(true);
			this.setSize(1000,500);
			this.setLocation(200,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(true);
			this.setTitle("Mi Ventana");
			this.setMinimumSize(new Dimension(250,250));
			this.setMaximumSize(new Dimension(1000,750));
			this.setLocationRelativeTo(null);
			
			this.setLayout(null);
			
			this.IniciarComponentes();
		}
	
	public void IniciarComponentes() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.gray);
		login.setLayout(null);
		this.add(login);
		
		JLabel tituloLogin = new JLabel("Acceder", 0);
		tituloLogin.setSize(300, 80);
		tituloLogin.setLocation(100,20);
		tituloLogin.setOpaque(true);
		tituloLogin.setFont(new Font ("Agency FB", Font.BOLD, 40));
		tituloLogin.setBackground(Color.red);
		tituloLogin.setForeground(Color.white);
		login.add(tituloLogin);
		
		/*
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.GREEN);
		registro.setLocation(500,0);
		this.add(registro);
		*/
		//Size
		//Location
		//Background - opaque
		//String constructor
	}
}
