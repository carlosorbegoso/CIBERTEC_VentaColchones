package formulario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcercaDe extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JSeparator separator;
	private JLabel lblAutores;
	private JLabel lblCarlosOrbegsoLoayza;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaDe dialog = new AcercaDe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaDe() {
		setResizable(false);
		setTitle("Acerca de la Tienda");
		setBounds(100, 100, 496, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTienda = new JLabel("Tienda 1.0");
			lblTienda.setFont(new Font("Calibri", Font.PLAIN, 50));
			lblTienda.setBounds(131, 11, 223, 61);
			contentPanel.add(lblTienda);
		}
		
		separator = new JSeparator();
		separator.setBounds(20, 78, 429, 2);
		contentPanel.add(separator);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setToolTipText("");
		lblAutores.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblAutores.setBounds(203, 98, 88, 20);
		contentPanel.add(lblAutores);
		
		lblCarlosOrbegsoLoayza = new JLabel("Carlos Orbegoso Loayza");
		lblCarlosOrbegsoLoayza.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCarlosOrbegsoLoayza.setBounds(177, 122, 143, 20);
		contentPanel.add(lblCarlosOrbegsoLoayza);
		
		btnCerrar = new JButton("cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(176, 226, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
}
