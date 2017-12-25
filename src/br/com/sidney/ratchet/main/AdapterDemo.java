package br.com.sidney.ratchet.main;



import br.com.sidney.ratchet.api.retangle.NewRetangle;
import br.com.sidney.ratchet.retangle.Retangle;
import br.com.sidney.ratchet.retangle.adapter.RetangleAdapter;
import br.com.sidney.ratchet.retangle.impl.RetangleImpl;

public class AdapterDemo {
	
	public static void main(String[] args){
		
		int width  = 100;
		int height = 50;
		
		Retangle    legacyRetangle = new RetangleImpl();
		NewRetangle newApiRetangle = new NewRetangle();
		
		legacyRetangle.draw(width, height);
		newApiRetangle.draw(height, width);
		
		
		System.out.println("--- Using Retangle Adapter ---");
		System.out.println("");
		
		Retangle adapterRetangle = new RetangleAdapter();
		adapterRetangle.draw(width, height);
		
	}

}
