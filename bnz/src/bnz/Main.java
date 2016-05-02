package bnz;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		ArrayList<Being> beings = new ArrayList<>();
		beings.add(new Bonk(null, 0, 0));
		//not sure
		beings.add(new Zap());
		beings.stream().forEach(e -> System.out.println(e));
		
		Bonk bonk = new Bonk(null, 0, 0);
		//not sure
		Zap zap = new Zap();
		
	}
}
