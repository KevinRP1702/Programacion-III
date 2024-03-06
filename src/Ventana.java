import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.print.attribute.AttributeSetUtilities;
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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame{
public Ventana() {

			//Atributos de la ventana
			this.setVisible(true);
			this.setSize(1400,750);
			this.setLocation(200,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(true);
			this.setTitle("Super Mario Bros. 3");
			this.setMinimumSize(new Dimension(250,250));
			this.setMaximumSize(new Dimension(1000,750));
			this.setLocationRelativeTo(null);

			this.setLayout(null);

			this.IniciarComponentes();
		}

	//Metodo para los componentes
	public void IniciarComponentes() {

		this.fondo();
		this.repaint();
	}
	
	public void fondo() {
		
		//Primer panel
		JPanel fondo = new JPanel();
		fondo.setSize(this.getWidth(), this.getHeight());
		fondo.setBackground(Color.decode("#a2f0ff"));
		fondo.setLayout(null);
		this.add(fondo);
	}
	
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;
	
		//Primer cubo
		g2d.setColor(Color.decode("#ff8954"));
		g2d.fillRect(50, 300, 80, 80);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRect(50, 300, 80, 80);
		
		g2d.fillOval(60, 310, 10, 10);
		g2d.fillOval(60, 360, 10, 10);
		g2d.fillOval(110, 310, 10, 10);
		g2d.fillOval(110, 360, 10, 10);
		
		//2 cubos
		g2d.setColor(Color.decode("#ff8954"));
		g2d.fillRect(280, 100, 80, 80);
						
		g2d.fillRect(365, 100, 80, 80);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRect(280, 100, 80, 80);
		
		g2d.fillOval(290, 110, 10, 10);
		g2d.fillOval(290, 160, 10, 10);
		g2d.fillOval(340, 110, 10, 10);
		g2d.fillOval(340, 160, 10, 10);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRect(365, 100, 80, 80);
		
		g2d.fillOval(370, 110, 10, 10);
		g2d.fillOval(370, 160, 10, 10);
		g2d.fillOval(430, 110, 10, 10);
		g2d.fillOval(430, 160, 10, 10);
		
		//Cubos tercero
		g2d.setColor(Color.decode("#ff8954"));
		g2d.fillRect(1250, 170, 80, 80);
				
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRect(1250, 170, 80, 80);
				
		g2d.fillOval(1260, 180, 10, 10);
		g2d.fillOval(1260, 230, 10, 10);
		g2d.fillOval(1310, 180, 10, 10);
		g2d.fillOval(1310, 230, 10, 10);

				
		//Plataforma azul
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(480, 295, 250, 400, 10,10);
		
		g2d.setColor(Color.decode("#84c0ff"));
		g2d.fillRoundRect(480, 295, 250, 400, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawOval(485, 300, 25, 25);
	
		g2d.drawOval(700, 300, 25, 25);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(730, 340, 40, 360, 10, 10);
		
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(490, 302, 505, 320);
		g2d.drawLine(720, 302, 705, 320);
		
		//Plataforma rosa
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(300, 495, 200, 200, 10, 10);
		
		
		g2d.setColor(Color.decode("#ffc3b8"));
		g2d.fillRoundRect(300, 495, 200, 200, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(500, 520, 40, 180, 10, 10);
		
		g2d.setStroke(new BasicStroke(2));
		g2d.drawOval(305, 500, 25, 25);
	
		g2d.drawOval(470, 500, 25, 25);
		
		g2d.drawOval(305, 665, 25, 25);
	
		g2d.drawOval(470, 665, 25, 25);
		
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(310, 502, 325, 520);
		g2d.drawLine(475, 502, 490, 520);
		g2d.drawLine(325, 667, 310, 685);
		g2d.drawLine(490, 667, 475, 685);
		
		//Plataforma verde
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(1200, 495, 200, 200, 10, 10);
		
		g2d.setColor(Color.decode("#51d96b"));
		g2d.fillRoundRect(1200, 495, 200, 200, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(2));
		
		g2d.drawOval(1205, 500, 25, 25);
		
		g2d.drawOval(1205, 665, 25, 25);
		
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(1225, 667, 1209, 685);
		g2d.drawLine(1210, 502, 1225, 520);
				
		//Imagen mario
		try {
			BufferedImage Image = ImageIO.read(new File("src/imgMario.png"));
			
			g2d.drawImage(Image, 630, 560, null);
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Tuberia
		g2d.setColor(Color.decode("#55dd67"));
		g2d.fillRect(900, 550, 150, 150);
		
		g2d.fillRect(880, 470, 190, 80);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(900, 550, 150, 150, 10, 10);
		
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(880, 470, 190, 80, 10, 10);
		
		//Imagen planta
		try {
			BufferedImage Image = ImageIO.read(new File("src/ImgPlanta.png"));
			
			g2d.drawImage(Image, 890, 290, null);
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Arbusto
		
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.black);
		g2d.drawOval(20, 650, 30, 60);
		g2d.drawOval(30, 640, 40, 60);
		g2d.drawOval(35, 650, 40, 60);
		g2d.setColor(Color.decode("#51d96b"));
		g2d.fillOval(20, 650, 30, 60);
		g2d.fillOval(30, 640, 40, 60);
		g2d.fillOval(35, 650, 40, 60);
		
		
		//Primer piso
		g2d.setColor(Color.decode("#f8cbb8"));
		g2d.fillRect(0, 700, 1408, 20);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawRect(0, 700, 1408, 20);

		//Segundo piso
		g2d.setColor(Color.decode("#b16f3b"));
		g2d.fillRect(0, 720, 1408, 60);
		
	}
}