package formulario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bdColchones.DatosColchones;

import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mantenimiento_ListarColchones extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;
	private JButton btnListar;
	private JTextArea txtS;
	private JScrollBar scrollBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mantenimiento_ListarColchones dialog = new Mantenimiento_ListarColchones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mantenimiento_ListarColchones() {
		setTitle("Listado de colchones");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(135, 227, 89, 23);
		contentPanel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(231, 227, 89, 23);
		contentPanel.add(btnListar);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(407, 11, 17, 206);
		contentPanel.add(scrollBar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 11, 414, 206);
		contentPanel.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
	
		txtS.append("Marca\t:"+DatosColchones.marca1);
		txtS.append("\nPrecio\t:"+DatosColchones.precio1);
		txtS.append("\nGarantia\t:"+DatosColchones.garantia1);
		txtS.append("\nTamaño\t:"+DatosColchones.tamaño1);
		txtS.append("\nMaterial\t:"+DatosColchones.material1);
		
	}
}
