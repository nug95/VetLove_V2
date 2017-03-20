package application;

import controller.GestorCliente;
import misc.MData;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MData.fillData();

		GestorCliente gc = new GestorCliente();
		
		gc.addClient(MData.cl);
		
		System.out.println(gc.getCliente(0).getNome());
	}

}
