import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.print.attribute.AttributeSetUtilities;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
public Ventana() {

			//Atributos de la ventana
			this.setVisible(true);
			this.setSize(1000,750);
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

		this.login();
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLayout(null);
		registro.setBackground(Color.GREEN);
		registro.setLocation(500,0);
		this.add(registro);
		
		//Etiqueta titulo
		JLabel tituloRegistro = new JLabel("Registro", 0);
		tituloRegistro.setSize(300, 80);
		tituloRegistro.setLocation(100,20);
		tituloRegistro.setOpaque(true);
		tituloRegistro.setFont(new Font ("Agency FB", Font.BOLD, 40));
		tituloRegistro.setBackground(Color.CYAN);
		tituloRegistro.setForeground(Color.black);
		registro.add(tituloRegistro);
		
		//Etiqueta User
		JLabel nombreUser = new JLabel(" Nombre de usuario:", 0);
		nombreUser.setBounds(50,120,400,40);
		nombreUser.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(nombreUser);
		
		//TextField user
		JTextField registroUser = new JTextField();
		registroUser.setHorizontalAlignment(0);
		registroUser.setFont(new Font ("Agency FB", Font.BOLD, 20));
		registroUser.setBounds(50,160,400,40);
		registroUser.setOpaque(true);
		registroUser.setBackground(Color.white);
		registro.add(registroUser);
		
		//Etiqueta User
		JLabel bioRegistro = new JLabel("Bio",0);
		bioRegistro.setBounds(50,180,400,80);
		bioRegistro.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(bioRegistro);
		
		//Textarea de la bio
		JTextArea textoBio = new JTextArea();
		textoBio.setBounds(50,240,400,80);
		textoBio.setFont(new Font ("Agency FB", Font.BOLD, 20));
		registro.add(textoBio);
		
		//Etiqueta preferencias
		JLabel preferencias = new JLabel("Preferencias",0);
		preferencias.setBounds(50,300,400,80);
		preferencias.setFont(new Font ("Agency FB", Font.BOLD, 25));
		registro.add(preferencias);
		
		//CheckBox preferencias
		JCheckBox check1 = new JCheckBox("Dulce");
		check1.setBounds(50,360,80,40);
		check1.setFont(new Font ("Agency FB", Font.BOLD, 25));
		check1.setBorderPainted(true);
		check1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		check1.setOpaque(false);
		registro.add(check1);
		
		//CheckBox preferencias
		JCheckBox check2 = new JCheckBox("Salado");
		check2.setBounds(140,360,80,40);
		check2.setFont(new Font ("Agency FB", Font.BOLD, 25));
		check2.setBorderPainted(true);
		check2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		check2.setOpaque(false);
		registro.add(check2);
		
		//CheckBox preferencias
		JCheckBox check3 = new JCheckBox("Saludable");
		check3.setBounds(230,360,110,40);
		check3.setFont(new Font ("Agency FB", Font.BOLD, 25));
		check3.setBorderPainted(true);
		check3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		check3.setOpaque(false);
		registro.add(check3);
		
		//Etiqueta terminos
		JLabel terminos = new JLabel("Terminos",0);
		terminos.setBounds(50,410,400,40);
		terminos.setFont(new Font ("Agency FB", Font.BOLD, 25));
		terminos.setOpaque(true);
		terminos.setBackground(Color.white);
		registro.add(terminos);
		
		//RadioButton aceptar
		JRadioButton aceptar = new JRadioButton("Acepto los terminos");
		aceptar.setBounds(50,450,180,40);
		aceptar.setOpaque(false);
		aceptar.setFont(new Font ("Agency FB", Font.BOLD, 22));
		registro.add(aceptar);
		
		//RadioButton no acepto
		JRadioButton noAceptar = new JRadioButton("No acepto los terminos");
		noAceptar.setBounds(250,450,190,40);
		noAceptar.setOpaque(false);
		noAceptar.setFont(new Font ("Agency FB", Font.BOLD, 22));
		registro.add(noAceptar);
		
		//Grupo de botones terminos
		ButtonGroup terminosGroup = new ButtonGroup();
		terminosGroup.add(aceptar);
		terminosGroup.add(noAceptar);
		
		//Grupo de botones preferencias
		ButtonGroup preferenciasGroup = new ButtonGroup();
		preferenciasGroup.add(check1);
		preferenciasGroup.add(check2);
		preferenciasGroup.add(check3);
		
		//String para el combobox
		String colonias[] = {"Centro" , "Camino real", "Pedregal", "Conchalito"};
		
		//Combobox Colonias
		JComboBox comboColonias = new JComboBox(colonias);
		comboColonias.setBounds(50,500,400, 40);
		comboColonias.setFont(new Font ("Agency FB", Font.BOLD, 22));
		registro.add(comboColonias);
		
		//Boton crear cuenta
		JButton btnCrear = new JButton("Crear Cuenta");
		btnCrear.setBounds(150,560,170,50);
		btnCrear.setFont(new Font ("Agency FB", Font.BOLD, 30));
		registro.add(btnCrear);
		
		this.repaint();
		//Size
		//Location
		//Background - opaque
		//String constructor
	}
	
	public void login() {
		
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
				tituloLogin.setForeground(Color.black);
				login.add(tituloLogin);

				//Etiqueta User
				JLabel nombreUser = new JLabel(" Nombre de usuario:");
				nombreUser.setBounds(90,120,180,40);
				nombreUser.setFont(new Font ("Agency FB", Font.BOLD, 25));
				login.add(nombreUser);

				//TextField user
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

				this.repaint();
	}
}