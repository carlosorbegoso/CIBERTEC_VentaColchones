package formulario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bdColchones.DatosDescuentos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configurar_Porcentaje extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUno;
	private JTextField txtDos;
	private JTextField txtTres;
	private JTextField txtCuatro;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configurar_Porcentaje dialog = new Configurar_Porcentaje();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configurar_Porcentaje() {
		setResizable(false);
		setTitle("Configurar porcentaje de descuento");
		setBounds(100, 100, 450, 258);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("1 a 5 unidades ");
			lblNewLabel.setBounds(17, 16, 107, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblA = new JLabel("6 a 10 unidades");
			lblA.setBounds(17, 41, 107, 14);
			contentPanel.add(lblA);
		}
		{
			JLabel lblA_1 = new JLabel("11 a 15 unidades");
			lblA_1.setBounds(17, 66, 107, 14);
			contentPanel.add(lblA_1);
		}
		{
			JLabel lblMasDe = new JLabel("Mas de 15 unidades");
			lblMasDe.setBounds(17, 91, 122, 14);
			contentPanel.add(lblMasDe);
		}
		{
			txtUno = new JTextField();
			txtUno.setBounds(134, 8, 86, 20);
			contentPanel.add(txtUno);
			txtUno.setColumns(10);
		}
		{
			txtDos = new JTextField();
			txtDos.setColumns(10);
			txtDos.setBounds(134, 33, 86, 20);
			contentPanel.add(txtDos);
		}
		{
			txtTres = new JTextField();
			txtTres.setColumns(10);
			txtTres.setBounds(134, 63, 86, 20);
			contentPanel.add(txtTres);
		}
		{
			txtCuatro = new JTextField();
			txtCuatro.setColumns(10);
			txtCuatro.setBounds(134, 88, 86, 20);
			contentPanel.add(txtCuatro);
		}
		{
			btnAceptar = new JButton("aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 12, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 37, 89, 23);
			contentPanel.add(btnCancelar);
		}
		{
			label = new JLabel("%");
			label.setBounds(230, 8, 32, 17);
			contentPanel.add(label);
		}
		{
			label_1 = new JLabel("%");
			label_1.setBounds(230, 35, 32, 17);
			contentPanel.add(label_1);
		}
		{
			label_2 = new JLabel("%");
			label_2.setBounds(230, 66, 32, 17);
			contentPanel.add(label_2);
		}
		{
			label_3 = new JLabel("%");
			label_3.setBounds(230, 91, 32, 17);
			contentPanel.add(label_3);
		}
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(279, 178, 46, 14);
		contentPanel.add(lblMensaje);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		
		DatosDescuentos.porcentaje1=Double.parseDouble(txtUno.getText());
		DatosDescuentos.porcentaje2=Double.parseDouble(txtDos.getText());
		DatosDescuentos.porcentaje3=Double.parseDouble(txtTres.getText());
		DatosDescuentos.porcentaje4=Double.parseDouble(txtCuatro.getText());
	
	}
}
