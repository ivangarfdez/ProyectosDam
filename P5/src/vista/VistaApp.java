package vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaApp extends JFrame {

	
	private JPanel contentPane;

	//Genera la vista de la APP.
	public VistaApp() {
		
		//Creamos el JFrame
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 456);
		
		//Creamos los Menus
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mPrincipal = new JMenu ("Principal");
		menuBar.add(mPrincipal);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mPrincipal.add(mntmPrincipal);
		
		JMenu mJuegos = new JMenu ("Juegos");
		menuBar.add(mJuegos);
		
		JMenuItem mntmJuegos= new JMenuItem("Juegos");
		mJuegos.add(mntmJuegos);
		

		JMenu mPerfil = new JMenu ("Perfil");
		menuBar.add(mPerfil);
		
		JMenuItem mntmPerfil= new JMenuItem("Perfil");
		mPerfil.add(mntmPerfil);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		VistaPrincipal vp = new VistaPrincipal();
		contentPane.add(vp, "Principal");
		
		
	
		
	}
}
