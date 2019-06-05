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

public class Configurar_CantidadOptima extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidad;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_CantidadOptima dialog = new Configurar_CantidadOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_CantidadOptima() {
		setResizable(false);
		setTitle("Configurar cantidad \u00F3ptima de colchones vendidos");
		setBounds(100, 100, 450, 166);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCantidadptimaDe = new JLabel("Cantidad \u00F3ptima de colchones vendidos");
			lblCantidadptimaDe.setBounds(10, 22, 189, 14);
			contentPanel.add(lblCantidadptimaDe);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(229, 19, 66, 20);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(335, 11, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 37, 89, 23);
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
