package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class VistaPrincipal extends JPanel {
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {

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
		add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 279, 169, 28);
		add(passwordField);
	}
}
