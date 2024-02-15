
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		//Sirve para modificar el tamaño
		this.setSize(300,300);
		
		//Sirve para modificar la visibilidad de la ventana
		this.setVisible(true);
		
		//Sirve cerrar la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Sirve para modificar la ubicacion de la ventana
		this.setLocation(200,100);
				
				
		//Sirve para la modificacion del tamaño de la ventana
		this.setResizable(true);
		
		//Sirve para cambiar el nombre de la ventana
		this.setTitle("Mi ventana");
		;
		//Sirven para limitar el cambio de tamaño
		this.setMinimumSize(new Dimension(250,250));
		
		this.setMaximumSize(new Dimension(750,750));
		
		//Centrar la ventana
		this.setLocationRelativeTo(null);
		
		//Llamos la funcion para iniciar el panel
		this.iniciarComponentes();
		
	}
	
	//Metodo para crear el panel
	public void iniciarComponentes() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.BLUE);
		this.add(login);
	}
}
