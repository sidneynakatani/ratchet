package br.com.sidney.ratchet.retangle.adapter;



import br.com.sidney.ratchet.api.retangle.NewRetangle;
import br.com.sidney.ratchet.retangle.Retangle;

public class RetangleAdapter implements Retangle {
	
	private NewRetangle newRetangle;

	@Override
	public void draw(int width, int height) {
		this.newRetangle = new NewRetangle();
		this.newRetangle.draw(height, width);
	}

}
