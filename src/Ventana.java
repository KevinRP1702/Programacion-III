import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame{
public Ventana() {

			//Atributos de la ventana
			this.setVisible(true);
			this.setSize(1000,800);
			this.setLocation(200,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(true);
			this.setTitle("User Login");
			this.setMinimumSize(new Dimension(250,250));
			this.setMaximumSize(new Dimension(1000,750));
			this.setLocationRelativeTo(null);

			this.setLayout(null);

			this.IniciarComponentes();
		}

	//Metodo para los componentes
	public void IniciarComponentes() {

		this.login();
	}
	
	public void login() {
		
		//Primer panel
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.decode("#154c79"));
		login.setLayout(null);
		this.add(login);
		
		//Primer panel
		JPanel centro = new JPanel();
		centro.setBounds(100,100,800,550);
		centro.setBackground(Color.decode("#063970"));
		centro.setBorder(new BevelBorder(BevelBorder.RAISED));
		centro.setLayout(null);
		login.add(centro);
		
		//Etiqueta titulo
		JLabel tituloLogin = new JLabel("User Login", 0);
		tituloLogin.setBounds(350, 10, 300, 80);
		//tituloLogin.setOpaque(true);
		tituloLogin.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 50));
		tituloLogin.setBackground(Color.CYAN);
		tituloLogin.setForeground(Color.white);
		login.add(tituloLogin);
		
		//Etiqueta titulo
		JLabel lblMiCuenta = new JLabel("My Account", 0);
		lblMiCuenta.setBounds(250, 60, 300, 80);
		//tituloLogin.setOpaque(true);
		lblMiCuenta.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 70));
		lblMiCuenta.setBackground(Color.CYAN);
		lblMiCuenta.setForeground(Color.decode("#d4c58c"));
		centro.add(lblMiCuenta);
		
		//Etiqueta titulo
		JLabel lblUser = new JLabel("Enter your username");
		lblUser.setBounds(150, 160, 200, 80);
		//lblUser.setOpaque(true);
		lblUser.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 25));
		lblUser.setBackground(Color.CYAN);
		lblUser.setForeground(Color.white);
		centro.add(lblUser);
		
		//Etiqueta titulo
		JLabel lblTextoUser = new JLabel("", 0);
		lblTextoUser.setBounds(150, 240, 500, 50);
		lblTextoUser.setOpaque(true);
		lblTextoUser.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 25));
		lblTextoUser.setBackground(Color.white);
		lblTextoUser.setForeground(Color.white);
		lblTextoUser.setBorder(new LineBorder(Color.decode("#03F0FF"),2,true));
		centro.add(lblTextoUser);
		
		JLabel lblImgUser = new JLabel();
		lblImgUser.setIcon(new ImageIcon(getClass().getResource("UserIcon.png")));
		lblImgUser.setBounds(107, 240, 50, 50);
		centro.add(lblImgUser);
		
		JLabel lblFondoImgUser = new JLabel();
		lblFondoImgUser.setBounds(100, 245, 40, 40);
		lblFondoImgUser.setOpaque(true);
		lblFondoImgUser.setBackground(Color.decode("#d9d0a0"));
		centro.add(lblFondoImgUser);
		
		//Etiqueta titulo
		JLabel lblPassword = new JLabel("Enter your password");
		lblPassword.setBounds(150, 300, 200, 80);
		//lblUser.setOpaque(true);
		lblPassword.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 25));
		lblPassword.setBackground(Color.CYAN);
		lblPassword.setForeground(Color.white);
		centro.add(lblPassword);
		
		//Etiqueta titulo
		JLabel lblTextoPassword = new JLabel("  PASSWORD");
		lblPassword.setAlignmentX(LEFT_ALIGNMENT);
		lblTextoPassword.setBounds(150, 380, 500, 50);
		lblTextoPassword.setOpaque(true);
		lblTextoPassword.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 25));
		lblTextoPassword.setBackground(Color.white);
		lblTextoPassword.setForeground(Color.gray);
		centro.add(lblTextoPassword);

		//label imagen contraseña
		JLabel lblImgPassword = new JLabel();
		lblImgPassword.setIcon(new ImageIcon(getClass().getResource("PasswordIcon.png")));
		lblImgPassword.setBounds(107, 380, 50, 50);
		centro.add(lblImgPassword);
		
		//label color de fondo
		JLabel lblFondoImg = new JLabel();
		lblFondoImg.setBounds(100, 385, 40, 40);
		lblFondoImg.setOpaque(true);
		lblFondoImg.setBackground(Color.decode("#d9d0a0"));
		centro.add(lblFondoImg);

		//Boton login
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(300,450,200,80);
		btnLogin.setFont(new Font ("Agency FB", Font.BOLD, 30));
		btnLogin.setBackground(Color.decode("#edd88b"));
		centro.add(btnLogin);
		
		//label no tienes cuenta
		JLabel lblSinCuenta = new JLabel("Don't have an account?");
		lblSinCuenta.setBounds(430,660, 180, 40);
		lblSinCuenta.setFont(new Font ("Agency FB", Font.BOLD, 20));
		lblSinCuenta.setForeground(Color.white);
		login.add(lblSinCuenta);
		
		//lbl crear cuenta
		JButton lblCrearCuenta = new JButton("Sign Up");
		lblCrearCuenta.setBounds(410,710,180, 60);
		lblCrearCuenta.setFont(new Font ("Agency FB", Font.BOLD, 30));
		lblCrearCuenta.setBackground(Color.decode("#edd88b"));
		lblCrearCuenta.setForeground(Color.black);
		login.add(lblCrearCuenta);

		this.repaint();
	}
}