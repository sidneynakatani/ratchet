package br.com.sidney.ratchet.retangle.impl;

import br.com.sidney.ratchet.retangle.Retangle;

public class RetangleImpl implements Retangle {

	@Override
	public void draw(int width, int height) {
		System.out.println("Legacy Retangle.");
		System.out.println("Width: "+width + " | Height: "+ height);
		System.out.println("");
	}

}
