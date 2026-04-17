package controlador;

import javax.swing.JButton;

import modelo.Logica;
import vista.InterfazCalculadora;

public class Controlador {
	Logica logica;
	InterfazCalculadora interfazCalculadora=new InterfazCalculadora();
	
	public Controlador(Logica logica,InterfazCalculadora interfazCalculadora) {
		this.logica=logica;
		this.interfazCalculadora=interfazCalculadora;
		interfazCalculadora.setVisible(true);
		
		interfazCalculadora.agregarListenerBorones(e->{
			JButton botonPulsado = (JButton) e.getSource();
		    String texto = botonPulsado.getText();

		    interfazCalculadora.agregarAlaPantalla(texto);
		});
		
		interfazCalculadora.agregarListenerIgual(e->{
			String exprsion=interfazCalculadora.obtenerOperacion();
			interfazCalculadora.mostrarResultado(logica.devolverResultado(exprsion)+"");
		});
		
		
	}

}
