package dudas.preguntas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjemploCotizacion extends JFrame implements ActionListener {

	private static final long serialVersionUID = -5051853266468223310L;
	JLabel lblCotizacion;
	JCheckBox checkSeguros, checkAire, checkAudio;
	JButton btnCalculo;
	JTextField txtNombre, txtApellido;
	JTextArea textArea;
	Cotizacion cotizacion;
	String[] vehiculos;
	JComboBox<String> comboVehiculos;

	public EjemploCotizacion() {
		lblCotizacion = new JLabel("ELIJA AUTO Y ACCESORIOS");
		lblCotizacion.setBounds(50, 50, 300, 20);
		txtNombre=new JTextField();  
        txtNombre.setBounds(50,100,150,20);  
        txtApellido=new JTextField();  
        txtApellido.setBounds(50,150,150,20);
        String[] vehiculos = { "Automovil", "Camioneta", "Furgon" };
		comboVehiculos = new JComboBox(vehiculos);
		comboVehiculos.setBounds(50,200,150,20);
		checkSeguros = new JCheckBox("Seguros @ 15000");
		checkSeguros.setBounds(100, 250, 150, 20);
		checkAire = new JCheckBox("Aire Acondici. @ 10000");
		checkAire.setBounds(100, 300, 250, 20);
		checkAudio = new JCheckBox("Audio @ 5000");
		checkAudio.setBounds(100, 350, 150, 20);
		btnCalculo = new JButton("Cálculo total");
		btnCalculo.setBounds(100, 390, 80, 30);
		
		btnCalculo.addActionListener(this);
		add(lblCotizacion);
		add(checkSeguros);
		add(checkAire);
		add(checkAudio);
		add(btnCalculo);
		add(comboVehiculos);
		add(txtNombre);
		add(txtApellido);
		setSize(600, 600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String nombre=txtNombre.getText();  
        String apellido=txtApellido.getText();
        if(!datosValidos(nombre) || !datosValidos(apellido)) {
        	try {
				throw new Exception("Datos no válidos");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
        }
        
        
		float cantidadVehiculo = 0;
		float cantidadAdicional = 0;
		float cantidadTotal = 0;
		
		String msg = "";
		String vehiculoSeleccionado = comboVehiculos.getItemAt(comboVehiculos.getSelectedIndex());
		
		switch(vehiculoSeleccionado) {
			case "Automovil":
				cantidadVehiculo= 30000;
				break;
			case "Camioneta":
				cantidadVehiculo=40000;
				break;
			case "Furgoneta":
				cantidadVehiculo=50000;
				break;
			}
		if (checkSeguros.isSelected()) {
			cantidadAdicional += 15000;
			msg = "Seguros: 15000\n";
		}
		if (checkAudio.isSelected()) {
			cantidadAdicional += 5000;
			msg += "Audio: 5000\n";
		}
		if (checkAire.isSelected()) {
			cantidadAdicional += 10000;
			msg += "Aire acondicionado: 10000\n";
		}
		
		Cotizacion cotizacion = new Cotizacion();
		cotizacion.setNombre(nombre);
		cotizacion.setApellido(apellido);
		cotizacion.setValorVehiculo(cantidadVehiculo);
		cotizacion.setValorCaracteristicasAdicionales(cantidadAdicional);
		msg += "-----------------\n";
		cantidadTotal = cantidadVehiculo + cantidadAdicional;
		JOptionPane.showMessageDialog(this, msg + nombre + " "+apellido+" "+"Total:"  + cantidadTotal+" La cotización creada es: " + cotizacion.toString());
		
	}
	
	private boolean datosValidos(String texto) {
		boolean result = false;
		if(texto != null && !texto.equals("")) {
			result = true;
		}
		if(texto != null && !texto.equals("") && !texto.matches(".*[^a-zA-Z].*")) {
			result = true;
		}
		
		return result;
	}

	public static void main(String[] args) {
		new EjemploCotizacion();
	}

}
