package formulario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
public class tienda extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnAr;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultarColchn;
	private JMenuItem mntmModificarCikchn;
	private JMenuItem mntmListarColchones;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenu mnConfiguracin;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDeTienda;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private JSeparator separator_10;
	private JSeparator separator_11;
	private JSeparator separator_12;
	private JSeparator separator_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tienda frame = new tienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tienda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Carlos\\Desktop\\Proyecto Base\\VENTA_DE _COLCHONES\\bin\\image\\images.jpg"));
		setTitle("tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 382);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAr = new JMenu("Archivo");
		mnAr.setSelectedIcon(new ImageIcon("C:\\Users\\Carlos\\Desktop\\Proyecto Base\\VENTA_DE _COLCHONES\\bin\\image\\archivo-300x248.jpg"));
		menuBar.add(mnAr);
		
		separator_3 = new JSeparator();
		mnAr.add(separator_3);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnAr.add(mntmSalir);
		
		separator_13 = new JSeparator();
		mnAr.add(separator_13);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		separator_2 = new JSeparator();
		mnMantenimiento.add(separator_2);
		
		mntmConsultarColchn = new JMenuItem("Consultar colch\u00F3n");
		mntmConsultarColchn.addActionListener(this);
		mnMantenimiento.add(mntmConsultarColchn);
		
		separator = new JSeparator();
		mnMantenimiento.add(separator);
		
		mntmModificarCikchn = new JMenuItem("Modificar colch\u00F3n");
		mntmModificarCikchn.addActionListener(this);
		mnMantenimiento.add(mntmModificarCikchn);
		
		separator_1 = new JSeparator();
		mnMantenimiento.add(separator_1);
		
		mntmListarColchones = new JMenuItem("Listar colchones");
		mntmListarColchones.addActionListener(this);
		mnMantenimiento.add(mntmListarColchones);
		
		separator_12 = new JSeparator();
		mnMantenimiento.add(separator_12);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		separator_4 = new JSeparator();
		mnVentas.add(separator_4);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		separator_11 = new JSeparator();
		mnVentas.add(separator_11);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos ");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		separator_5 = new JSeparator();
		mnConfiguracin.add(separator_5);
		
		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarObsequio);
		
		separator_6 = new JSeparator();
		mnConfiguracin.add(separator_6);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de colchones vendidos");
		mntmConfigurarCantidadptima.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		separator_7 = new JSeparator();
		mnConfiguracin.add(separator_7);
		
		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracin.add(mntmConfigurarPremioSorpresa);
		
		separator_10 = new JSeparator();
		mnConfiguracin.add(separator_10);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		separator_8 = new JSeparator();
		mnAyuda.add(separator_8);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		
		separator_9 = new JSeparator();
		mnAyuda.add(separator_9);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(arg0);
		}
		if (arg0.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadptima) {
			actionPerformedMntmConfigurarCantidadptima(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmListarColchones) {
			actionPerformedMntmListarColchones(arg0);
		}
		if (arg0.getSource() == mntmModificarCikchn) {
			actionPerformedMntmModificarCikchn(arg0);
		}
		if (arg0.getSource() == mntmConsultarColchn) {
			actionPerformedMntmConsultarColchn(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
	System.exit(0);
	}
	protected void actionPerformedMntmConsultarColchn(ActionEvent arg0) {
		Mantenimiento_ConsultarColchones dc;
		dc = new Mantenimiento_ConsultarColchones ();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmModificarCikchn(ActionEvent arg0) {
		Mantenimiento_ModificarColchones dc;
		dc= new Mantenimiento_ModificarColchones();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmListarColchones(ActionEvent arg0) {
		Mantenimiento_ListarColchones dc;
		dc = new Mantenimiento_ListarColchones();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		Ventas_Vender dc;
		dc= new Ventas_Vender();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) {
		Configurar_Porcentaje dc;
		dc= new Configurar_Porcentaje();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		Configurar_Obsequio dc;
		dc= new Configurar_Obsequio();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCantidadptima(ActionEvent arg0) {
		Configurar_CantidadOptima dc;
		dc= new Configurar_CantidadOptima();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent arg0) {
		Configurar_PremioSorpresa dc;
		dc= new Configurar_PremioSorpresa();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent arg0) {
		AcercaDe dc;
		dc= new AcercaDe();
		dc.setLocationRelativeTo(this);
		dc.setVisible(true);
	}
}
