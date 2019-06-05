package formulario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventas_GenerarReportes extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventas_GenerarReportes dialog = new Ventas_GenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventas_GenerarReportes() {
		setTitle("Generar reportes");
		setBounds(100, 100, 482, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTipoDeReporte = new JLabel("Tipo de reporte");
			lblTipoDeReporte.setBounds(10, 11, 100, 20);
			contentPanel.add(lblTipoDeReporte);
		}
		{
			JComboBox cboTipo = new JComboBox();
			cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por marca", "Marcas con venta \u00F3ptima", "Precios en relaci\u00F3n al promedio", "Precio promedio, mayor y menor"}));
			cboTipo.setBounds(102, 10, 200, 23);
			contentPanel.add(cboTipo);
		}
		{
			btnCerrar = new JButton("cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(361, 10, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			JTextArea txtS = new JTextArea();
			txtS.setBounds(20, 42, 430, 208);
			contentPanel.add(txtS);
		}
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
