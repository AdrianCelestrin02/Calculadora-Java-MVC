package app;

import controlador.Controlador;
import modelo.Logica;
import vista.InterfazCalculadora;


public class Main {

	public static void main(String[] args) {
		InterfazCalculadora vista=new InterfazCalculadora();
		Logica logica=new Logica();
		Controlador c=new Controlador(logica,vista);
	}

	}


