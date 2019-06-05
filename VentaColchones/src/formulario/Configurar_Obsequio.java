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

public class Configurar_Obsequio extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidad;
	private JTextField txtOsequio;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_Obsequio dialog = new Configurar_Obsequio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_Obsequio() {
		setResizable(false);
		setTitle("Configurar obsequio");
		setBounds(100, 100, 573, 171);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadMinimaDe = new JLabel("Cantidad minima de colchones adquiridos");
			lblCantidadMinimaDe.setBounds(10, 11, 244, 14);
			contentPanel.add(lblCantidadMinimaDe);
		}
		{
			JLabel lblObsequio = new JLabel("Obsequio");
			lblObsequio.setBounds(10, 36, 86, 14);
			contentPanel.add(lblObsequio);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(282, 8, 86, 20);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			txtOsequio = new JTextField();
			txtOsequio.setColumns(10);
			txtOsequio.setBounds(282, 33, 86, 20);
			contentPanel.add(txtOsequio);
		}
		{
			JButton btnAceptar = new JButton("aceptar");
			btnAceptar.setBounds(468, 7, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(468, 32, 89, 23);
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
