package formulario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.SwingPropertyChangeSupport;

import bdColchones.DatosColchones;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Mantenimiento_ModificarColchones extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JComboBox cboMarca;
	private JTextField txtPrecio;
	private JTextField txtGarantia;
	private JTextField txtTamaño;
	private JTextField txtMaterial;
	private JButton button;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mantenimiento_ModificarColchones dialog = new Mantenimiento_ModificarColchones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mantenimiento_ModificarColchones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Carlos\\Desktop\\Proyecto Base\\VENTA_DE _COLCHONES\\bin\\image\\prestashop_configurarmetadescripcion.jpg"));
		setTitle("Modificar colch\u00F3n");
		setBounds(100, 100, 450, 206);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 434, 170);
		contentPanel.add(panel);
		
		label = new JLabel("Marca");
		label.setBounds(24, 21, 46, 14);
		panel.add(label);
		
		label_1 = new JLabel("Precio (S/)");
		label_1.setBounds(24, 46, 81, 14);
		panel.add(label_1);
		
		label_2 = new JLabel("Garant\u00EDa (a\u00F1os)");
		label_2.setBounds(21, 71, 100, 14);
		panel.add(label_2);
		
		label_3 = new JLabel("Tama\u00F1o");
		label_3.setBounds(24, 96, 46, 14);
		panel.add(label_3);
		
		label_4 = new JLabel("Material");
		label_4.setBounds(24, 121, 46, 14);
		panel.add(label_4);
		
		cboMarca = new JComboBox();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(131, 18, 117, 20);
		panel.add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(131, 43, 117, 20);
		panel.add(txtPrecio);
		
		txtGarantia = new JTextField();
		txtGarantia.setColumns(10);
		txtGarantia.setBounds(131, 68, 117, 20);
		panel.add(txtGarantia);
		
		txtTamaño = new JTextField();
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(131, 93, 117, 20);
		panel.add(txtTamaño);
		
		txtMaterial = new JTextField();
		txtMaterial.setColumns(10);
		txtMaterial.setBounds(131, 118, 117, 20);
		panel.add(txtMaterial);
		
		button = new JButton("cerrar");
		button.addActionListener(this);
		button.setBounds(335, 11, 89, 23);
		panel.add(button);
		
		btnGrabar = new JButton("grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(335, 42, 89, 23);
		panel.add(btnGrabar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
		if (arg0.getSource() == cboMarca) {
			actionPerformedCboMarca(arg0);
		}
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
	}
	protected void actionPerformedButton(ActionEvent arg0) {
		dispose();
	}
	int indiceCombo(){
		return cboMarca.getSelectedIndex();
	}
	protected void actionPerformedCboMarca(ActionEvent arg0) {
		
		switch (indiceCombo()) {
		case 0:
			txtPrecio.setText(""+DatosColchones.precio0);
			txtGarantia.setText(""+DatosColchones.garantia1);
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
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		switch(indiceCombo()){
		case 0: 
			DatosColchones.precio0=Double.parseDouble(txtPrecio.getText());
			DatosColchones.garantia0=Integer.parseInt(txtGarantia.getText());
			DatosColchones.tamaño0=txtTamaño.getText();
			DatosColchones.material0=txtMaterial.getText();
break;
		case 1: 
			DatosColchones.precio1=Double.parseDouble(txtPrecio.getText());
			DatosColchones.garantia1=Integer.parseInt(txtGarantia.getText());
			DatosColchones.tamaño1=txtTamaño.getText();
			DatosColchones.material1=txtMaterial.getText();
break;
		case 2: 
			DatosColchones.precio2=Double.parseDouble(txtPrecio.getText());
			DatosColchones.garantia2=Integer.parseInt(txtGarantia.getText());
			DatosColchones.tamaño2=txtTamaño.getText();
			DatosColchones.material2=txtMaterial.getText();
break;
		case 3: 
			DatosColchones.precio3=Double.parseDouble(txtPrecio.getText());
			DatosColchones.garantia3=Integer.parseInt(txtGarantia.getText());
			DatosColchones.tamaño3=txtTamaño.getText();
			DatosColchones.material3=txtMaterial.getText();
break;
		case 4: 
			DatosColchones.precio4=Double.parseDouble(txtPrecio.getText());
			DatosColchones.garantia4=Integer.parseInt(txtGarantia.getText());
			DatosColchones.tamaño4=txtTamaño.getText();
			DatosColchones.material4=txtMaterial.getText();
break;
		
		
		}
		
		
		
	}
}
