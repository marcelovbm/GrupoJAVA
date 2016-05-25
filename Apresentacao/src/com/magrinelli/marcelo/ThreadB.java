package com.magrinelli.marcelo;

public class ThreadB extends Thread {

	private int total = 0;
	
	@Override
	public void run(){
		synchronized(this){
			for(int i = 0; i < 20 ; i++){
				total += i;
			}
			notify();
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}