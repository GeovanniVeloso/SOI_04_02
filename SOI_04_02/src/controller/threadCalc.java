package controller;

public class threadCalc extends Thread {

	private int res;
	private int [][] vet;
	private int line;
	
	public threadCalc(int res, int[][] vet, int line) {
		this.res = res;
		this.vet = vet;
		this.line = line;
	}
	
	@Override
	public void run() {
	soma();
	}

	private void soma() {
		for(int i = 0 ; i < 3 ; i ++) {
			res += vet[line][i];
		}
		
		System.out.println("Soma da linha "+line+" é "+res);
	}
	
}
