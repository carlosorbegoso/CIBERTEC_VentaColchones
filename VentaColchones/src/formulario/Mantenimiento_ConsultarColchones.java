package formulario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bdColchones.DatosColchones;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;


public class Mantenimiento_ConsultarColchones extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblMarca;
	private JLabel lblPrecios;
	private JLabel lblGarantaaos;
	private JLabel lblTamao;
	private JLabel lblMaterial;
	private JComboBox<?> cboMarca;
	private JTextField txtPrecio;
	private JTextField txtGarantia;
	private JTextField txtTamaño;
	private JTextField txtMaterial;
	public static String marca0 = "Suavestar";
	public static double precio0 = 499.0;
	public static int garantia0 = 7;
	public static String tamaño0 = "1 1/2 Plaza";
	public static String material0 = "Tela Tricot Acolc";
	private JButton btnCerrar;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mantenimiento_ConsultarColchones dialog = new Mantenimiento_ConsultarColchones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mantenimiento_ConsultarColchones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Carlos\\Desktop\\Proyecto Base\\VENTA_DE _COLCHONES\\bin\\image\\26968441-libre-de-consultar-icono-o-bot\u00F3n-de-ayuda-e-informaci\u00F3n-servicio-de-soporte-al-cliente-\u00F3ptimo-servicio-de-con.jpg"));
		setTitle("Consultar colch\u00F3n");
		setBounds(100, 100, 450, 209);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(24, 21, 46, 14);
		contentPanel.add(lblMarca);
		
		lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setBounds(24, 46, 66, 14);
		contentPanel.add(lblPrecios);
		
		lblGarantaaos = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblGarantaaos.setBounds(21, 71, 100, 14);
		contentPanel.add(lblGarantaaos);
		
		lblTamao = new JLabel("Tama\u00F1o");
		lblTamao.setBounds(24, 96, 46, 14);
		contentPanel.add(lblTamao);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(24, 121, 46, 14);
		contentPanel.add(lblMaterial);
		
		cboMarca = new JComboBox();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(131, 18, 128, 20);
		contentPanel.add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(131, 43, 128, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtGarantia = new JTextField();
		txtGarantia.setEditable(false);
		txtGarantia.setBounds(131, 68, 128, 20);
		contentPanel.add(txtGarantia);
		txtGarantia.setColumns(10);
		
		txtTamaño = new JTextField();
		txtTamaño.setEditable(false);
		txtTamaño.setBounds(131, 93, 128, 20);
		contentPanel.add(txtTamaño);
		txtTamaño.setColumns(10);
		
		txtMaterial = new JTextField();
		txtMaterial.setEditable(false);
		txtMaterial.setBounds(131, 118, 128, 20);
		contentPanel.add(txtMaterial);
		txtMaterial.setColumns(10);
		
		btnCerrar = new JButton("cerrar");
		btnCerrar.setIcon(null);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(343, 11, 81, 28);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
	}
	protected void actionPerformedBtnCerra(ActionEvent arg0) {
		System.exit(0);
	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
		int marca= cboMarca.getSelectedIndex();
		
		switch (marca) {
		case 0:
			txtPrecio.setText(""+DatosColchones.precio0);
			txtGarantia.setText(""+DatosColchones.garantia0);
			txtTamaño.setText(""+DatosColchones.tamaño0);
			txtMaterial.setText(""+DatosColchones.material0);
			break;
		case 1:
			txtPrecio.setText(""+DatosColchones.precio1);
			txtGarantia.setText(""+DatosColchones.garantia1);
			txtTamaño.setText(""+DatosColchones.tamaño1);
			txtMaterial.setText(""+DatosColchones.material1);
			break;
		case 2:
			txtPrecio.setText(""+DatosColchones.precio2);
			txtGarantia.setText(""+DatosColchones.garantia2);
			txtTamaño.setText(""+DatosColchones.tamaño2);
			txtMaterial.setText(""+DatosColchones.material2);
			break;
		case 3:
			txtPrecio.setText(""+DatosColchones.precio3);
			txtGarantia.setText(""+DatosColchones.garantia3);
			txtTamaño.setText(""+DatosColchones.tamaño3);
			txtMaterial.setText(""+DatosColchones.material3);
			break;
		case 4:
			txtPrecio.setText(""+DatosColchones.precio4);
			txtGarantia.setText(""+DatosColchones.garantia4);
			txtTamaño.setText(""+DatosColchones.tamaño4);
			txtMaterial.setText(""+DatosColchones.material4);
			break;
		
		
		}
		
		
		}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	}
	 
	
