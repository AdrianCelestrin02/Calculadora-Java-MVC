package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField resultadoField;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnmenos;
	private JButton btnmas;
	private JButton btnpor;
	private JButton btndiv;
	private JButton btnigual;
	private JButton btnBorrar;

	

	/**
	 * Create the frame.
	 */
	public InterfazCalculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		resultadoField = new JTextField();
		resultadoField.setBounds(55, 24, 323, 31);
		contentPane.add(resultadoField);
		resultadoField.setColumns(10);
		
		 btn1 = new JButton("1");
		btn1.setBounds(10, 82, 89, 23);
		contentPane.add(btn1);
		
		 btn2 = new JButton("2");
		btn2.setBounds(109, 82, 89, 23);
		contentPane.add(btn2);
		
		 btn3 = new JButton("3");
		btn3.setBounds(213, 82, 89, 23);
		contentPane.add(btn3);
		
		btnmas = new JButton("+");
		btnmas.setBounds(335, 82, 89, 23);
		contentPane.add(btnmas);
		
		 btn4 = new JButton("4");
		btn4.setBounds(10, 137, 89, 23);
		contentPane.add(btn4);
		
		 btn5 = new JButton("5");
		btn5.setBounds(109, 137, 89, 23);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(213, 137, 89, 23);
		contentPane.add(btn6);
		
		btnmenos = new JButton("-");
		btnmenos.setBounds(335, 137, 89, 23);
		contentPane.add(btnmenos);
		
		btn7 = new JButton("7");
		btn7.setBounds(10, 192, 89, 23);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(109, 192, 89, 23);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(213, 192, 89, 23);
		contentPane.add(btn9);
		
		btnpor = new JButton("*");
		btnpor.setBounds(335, 192, 89, 23);
		contentPane.add(btnpor);
		
		btndiv = new JButton("/");
		btndiv.setBounds(335, 238, 89, 23);
		contentPane.add(btndiv);
		
		 btnigual = new JButton("=");
		
		btnigual.setBounds(109, 226, 89, 23);
		contentPane.add(btnigual);
		
	    btn0 = new JButton("0");
		btn0.setBounds(10, 226, 89, 23);
		contentPane.add(btn0);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(213, 226, 89, 23);
		contentPane.add(btnBorrar);
		
		btnBorrar.addActionListener(e->borrarPantalla());
		


	}
	
	public void agregarAlaPantalla(String pulsado) {
	    resultadoField.setText( resultadoField.getText()+""+pulsado);
	}
	
	public void agregarListenerBorones(ActionListener listener) {
		btn0.addActionListener(listener);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
	    btn4.addActionListener(listener);
		btn5.addActionListener(listener);
		btn6.addActionListener(listener);
		btn7.addActionListener(listener);
		btn8.addActionListener(listener);
		btn9.addActionListener(listener);
		btnmenos.addActionListener(listener);
		btnmas.addActionListener(listener);
		btnpor.addActionListener(listener);
		btndiv.addActionListener(listener);
	}
	
	public void agregarListenerIgual(ActionListener listener) {
		btnigual.addActionListener(listener);
	}
	
	public void agregarListenerBorrar(ActionListener listener) {
		btnigual.addActionListener(listener);
	}
	
	
	public void mostrarResultado(String mensaje) {
		resultadoField.setText(mensaje);
	}
	
	public String obtenerOperacion() {
		return resultadoField.getText();
	}
	
	public void borrarPantalla() {
		resultadoField.setText("");
	}
	


}
