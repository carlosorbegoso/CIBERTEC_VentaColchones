package formulario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bdColchones.DatosColchones;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventas_Vender extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox<Object> cboMarca;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtS;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventas_Vender dialog = new Ventas_Vender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventas_Vender() {
		setResizable(false);
		setTitle("vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMarca = new JLabel("Marca ");
			lblMarca.setBounds(10, 11, 66, 14);
			contentPanel.add(lblMarca);
		}
		{
			JLabel lblPrecios = new JLabel("Precio (S/.)");
			lblPrecios.setBounds(10, 36, 66, 14);
			contentPanel.add(lblPrecios);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setBounds(10, 61, 66, 14);
			contentPanel.add(lblCantidad);
		}
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(86, 33, 105, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(86, 58, 105, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboMarca = new JComboBox<Object>();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(86, 8, 105, 20);
		contentPanel.add(cboMarca);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(324, 7, 89, 23);
		contentPanel.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(324, 32, 89, 23);
		contentPanel.add(btnCerrar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 86, 403, 164);
		contentPanel.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
		if (arg0.getSource() == btnVender) {
			actionPerformedBtnVender(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		System.exit(0);
	}
	protected void actionPerformedBtnVender(ActionEvent arg0) {
		
	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
		
	
		}
		
	}

