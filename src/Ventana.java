import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.print.attribute.AttributeSetUtilities;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
public Ventana() {
	
			//Atinutos de la ventana
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

	//Metodo para los componentes
	public void IniciarComponentes() {

		//Primer panel
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.CYAN);
		login.setLayout(null);
		this.add(login);

		//Etiqueta titulo
		JLabel tituloLogin = new JLabel("Inicio de sesion", 0);
		tituloLogin.setSize(300, 80);
		tituloLogin.setLocation(100,20);
		tituloLogin.setOpaque(true);
		tituloLogin.setFont(new Font ("Agency FB", Font.BOLD, 40));
		tituloLogin.setBackground(Color.CYAN);
		tituloLogin.setForeground(Color.pink);
		login.add(tituloLogin);
		
		//Etiqueta User
		JLabel nombreUser = new JLabel(" Nombre de usuario:");
		nombreUser.setBounds(90,120,180,40);
		nombreUser.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(nombreUser);
		
		//TextBox user
		JTextField ingresarUser = new JTextField();
		ingresarUser.setBounds(90,170,300,35);
		ingresarUser.setOpaque(true);
		ingresarUser.setBackground(Color.white);
		login.add(ingresarUser);
		
		
		//Etiqueta contraseña
		JLabel password = new JLabel(" Contraseña:");
		password.setBounds(90,220,180,40);
		password.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(password);
		
		//Passwordfield para la contraseña
		JPasswordField ingresarContra = new JPasswordField();
		ingresarContra.setBounds(90,260,300,35);
		ingresarContra.setFont(new Font ("Agency FB", Font.BOLD, 25));
		login.add(ingresarContra);
		
		//CheckBox para recordarme
		JCheckBox recordarme = new JCheckBox("Recordarme");
		recordarme.setBounds(90,320,110,30);
		recordarme.setFont(new Font ("Agency FB", Font.BOLD, 20));
		recordarme.setOpaque(false);
		login.add(recordarme);
		
		//Etiqueta contraseña
		JLabel olvidarContra = new JLabel("¿Olvidó su contraseña?");
		olvidarContra.setBounds(250,314,180,40);
		olvidarContra.setFont(new Font ("Agency FB", Font.BOLD, 20));
		login.add(olvidarContra);
		
		//Boton acceder
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setBounds(150,370,170,50);
		btnAcceder.setFont(new Font ("Agency FB", Font.BOLD, 30));
		login.add(btnAcceder);
		
		login.repaint();

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