package formulario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configurar_PremioSorpresa extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNumero;
	private JTextField txtSorpresa;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_PremioSorpresa dialog = new Configurar_PremioSorpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_PremioSorpresa() {
		setResizable(false);
		setTitle("Configurar premio sorpresa");
		setBounds(100, 100, 450, 144);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNumeroDeCliente = new JLabel("Numero de cliente");
			lblNumeroDeCliente.setBounds(10, 11, 121, 14);
			contentPanel.add(lblNumeroDeCliente);
		}
		{
			JLabel lblPremioSorpresa = new JLabel("Premio sorpresa");
			lblPremioSorpresa.setBounds(10, 36, 121, 14);
			contentPanel.add(lblPremioSorpresa);
		}
		{
			txtNumero = new JTextField();
			txtNumero.setBounds(125, 8, 86, 20);
			contentPanel.add(txtNumero);
			txtNumero.setColumns(10);
		}
		{
			txtSorpresa = new JTextField();
			txtSorpresa.setColumns(10);
			txtSorpresa.setBounds(125, 33, 86, 20);
			contentPanel.add(txtSorpresa);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(335, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 32, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		dispose();
	}
}
