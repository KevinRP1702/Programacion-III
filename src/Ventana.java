import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.print.attribute.AttributeSetUtilities;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
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
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.border.Border;

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

	
		this.calculadora();
		//this.registro();
		//this.admin();
		this.repaint();	
	}
	
	public void calculadora() {
		this.setSize(480,650);
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#35E4F1"));
		panel.setLayout(new BorderLayout());
		
		JLabel text = new JLabel("100.00", 4);
		text.setOpaque(true);
		text.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 40));
		panel.add(text, BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#CF7F54"));
		centro.setLayout(new GridLayout(4,3));
		panel.add(centro, BorderLayout.CENTER);
		
		
		String btns[] = {"7", "8", "9", "6", "5", "4", "3", "2", "1", "0", ".", "/"};
		for(int i = 0; i<12; i++) {
			JButton boton = new JButton(btns[i]);
			centro.add(boton);
		}
		
		JPanel east = new JPanel();
		east.setBackground(Color.decode("#98E055"));
		east.setLayout(new GridLayout(3,1));
		panel.add(east, BorderLayout.EAST);
		
		String btns2[] = {"+", "-", "="};
		for(int i = 0; i<3; i++) {
			JButton boton = new JButton(btns2[i]);
			east.add(boton);
		}
		
		JPanel west = new JPanel();
		west.setBackground(Color.DARK_GRAY);
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		panel.add(west, BorderLayout.WEST);
		
		String btns3[] = {"MC", "M+", "*"};
		for(int i = 0; i<3; i++) {
			JButton boton = new JButton(btns3[i]);
			west.add(boton);
		}
		
		this.add(panel);
	}
}