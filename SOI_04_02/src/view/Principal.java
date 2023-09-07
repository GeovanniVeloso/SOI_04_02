package view;

import controller.threadCalc;

public class Principal {

	public static void main(String[] args) {
		
		int[][]matriz = new int [3][5];
		
		for(int line = 0 ; line < 3 ; line ++) {
			for(int i = 0 ; i < 5 ; i ++) {
				matriz[line][i] = (int)((Math.random()*100)+1);
			}
		}
		
		for(int line = 0 ; line < 3 ; line ++) {
			Thread thCalc = new threadCalc(0,matriz,line);
			thCalc.start();
		}
		
	}

}
