package com.tresEnRayas.main;

import java.awt.EventQueue;

import views.InterfazGrafica;

/**
 * @author  Ingrid Dominguez
 * 			Miguel A. Sastre
 * 			Vyacheslav Khaydorov
 *
 */
public class App 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica frame = new InterfazGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
