package gameReal;

public class Animation implements Runnable {

	BlockBreakerPanel blockBreaker;
	
	public Animation(BlockBreakerPanel bp) {
		this.blockBreaker = bp;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			blockBreaker.update();
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
