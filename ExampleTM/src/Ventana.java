import javax.swing.JFrame;

public class Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame("Prueba");
		ventana.setVisible(true);
		ventana.setSize(600,800);
		ventana.setLocation(300,100);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		
		//Centrar en la pantalla
		ventana.setLocationRelativeTo(null);
	}

}
