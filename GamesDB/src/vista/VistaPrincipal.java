package vista;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

import modelo.Usuario;

public class VistaPrincipal extends JPanel {
	private JPasswordField passwordField;
	private ArrayList<String> nombresUsuario;
	private ArrayList<String> passwordUsuario;
	private ArrayList<String> equipoFavorito;
	private Usuario modeloU;

	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {
		modeloU = new Usuario();
		nombresUsuario = new ArrayList<String>();
		nombresUsuario = modeloU.load();
		passwordUsuario = new ArrayList<String>();
		passwordUsuario = modeloU.loadpass();
		equipoFavorito = new ArrayList<String>();
		equipoFavorito = modeloU.loadEquipo();
		setBounds(0, 0, 400, 400);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Juegos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(239, 81, 117, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Perfil");
		btnNewButton_1.setBounds(239, 122, 117, 29);
		add(btnNewButton_1);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 207, 62, 22);
		add(lblUsuario);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(10, 259, 80, 22);
		add(lblPass);
		
		JLabel label = new JLabel("Equipo");
		label.setBounds(234, 210, 62, 22);
		add(label);
		
		
		JButton btnNewButton_2 = new JButton("Registrate");
		btnNewButton_2.setBounds(10, 322, 117, 29);
		add(btnNewButton_2);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(10, 363, 117, 29);
		add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/img/usuario.png")));
		lblNewLabel.setBounds(35, 6, 228, 189);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 230, 173, 27);
		for(int i = 0; i<nombresUsuario.size();i++){
			comboBox.addItem(nombresUsuario.get(i));
		}
		add(comboBox);
		
		JComboBox combo = new JComboBox();
		combo.setBounds(10, 279, 169, 28);
		for(int i = 0; i<passwordUsuario.size();i++){
			combo.addItem(passwordUsuario.get(i));
		}
		add(combo);
	
		
		JComboBox comboEquipo = new JComboBox();
		comboEquipo.setBounds(191, 230, 173, 27);
		for(int i = 0; i<equipoFavorito.size();i++){
			comboEquipo.addItem(equipoFavorito.get(i));
		}
		add(comboEquipo);
	}
}
