package controller;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Vacina;

public class GestorCliente {
	ArrayList<Cliente> arCliente;
	
	public GestorCliente() {
		this.arCliente = new ArrayList<Cliente>();	
	}
	
	public void addClient(String nome, String morada, String email, String telefone) {
		Cliente c = new Cliente(nome, morada, email, telefone);
		int novoId = arCliente.size();
		
		c.setId(novoId);
		
		arCliente.add(c);
		
	}
	
	public void addClient(Cliente c) {
		int novoId = arCliente.size();
		
		c.setId(novoId);
		
		arCliente.add(c);
	}
	
	public Cliente getCliente(int id) {
		/* 
		 * foreach
		 * 
		 * Para cada cliente, sob a variavel c , dentro da colecao arCliente, faz:
		 */
		for (Cliente c : arCliente) {
			if (c.getId() == id)
				return c;
		}
		
		return null;
	}
	
	public double getGastoVacinas(Cliente c) {
		
	/*	
	 * Alternativa trivial ao foreach
	 * for ( int i = 0; i < arCliente.size(); i++) {
			Cliente c = arCliente.get(i);
			// continuar...
		}
		*/
			double totalVacAnimais = 0;
			for (Animal a : c.getAnimais()) { // para cada animal
				
				double totalVacinaAnimal = 0;
				for (Vacina v : a.getFicha().getVacinas()){ //para cada vacina
					totalVacinaAnimal += v.getPreco();
				}
				totalVacAnimais += totalVacinaAnimal;
				/*
				 * Pode ser substituido por 
				 */
//				totalVacAnimais += a.getGastosVacinas();
			}			
		
		return totalVacAnimais;
	}
	
}
