package br.com.byte_bank_v5.test;

import br.com.byte_bank_v5.models.*;

public class TestingReference {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.setName("Guilherme Nunes");
		manager.setRemuneration(5000.0);
				
		VideoEditor videoEditor = new VideoEditor();
		videoEditor.setName("Maria");
		videoEditor.setRemuneration(2500.00);
		
		BonusControl control = new BonusControl();
		
		control.register(manager);
		control.register(videoEditor);
		
		System.out.println(control.getSum());
	}
}
