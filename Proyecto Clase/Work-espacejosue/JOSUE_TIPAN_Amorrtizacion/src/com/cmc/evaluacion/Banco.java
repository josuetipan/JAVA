package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco () {
		clientes=new ArrayList<Cliente>();
		prestamos=new ArrayList<Prestamo>();
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public Cliente buscarCliente(String cedula) {
		Cliente clienteEncotrado=null;
		for (Cliente cliente : clientes) {
			if(cliente.getCedula().equals(cedula)) {
				clienteEncotrado=cliente;
				break;
			}
		}
		return clienteEncotrado;
	}
	public void registrarCliente(Cliente cl) {
		boolean existe=false;
		for (Cliente cliente : clientes) {
			
			if(cliente.getCedula().equals(cl.getCedula())) {
				System.out.println("El cliente ya existe "+cliente.getCedula());
				existe=true;
			}
		}
		if (!existe) {
			clientes.add(cl);
		}
	}

	public void asignarPrestamo(String cedula,Prestamo prestamo) {
		Cliente clienteEcontrado= buscarCliente(cedula);
		if(clienteEcontrado==null) {
			System.out.println("No es cliente del banco");
		}else {
			clienteEcontrado.agregarPrestamo(prestamo);
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamos= null;
		Cliente cl = buscarCliente(cedula);
		if(cl!= null) {
			if(cl.getPrestamos().size()>0 ||cl.getPrestamos()!=null) {
				prestamos=cl.getPrestamos();
			}else {
				System.out.println("El cliente no tiene prestamos");
			}
		}
		return prestamos;
	}
}
