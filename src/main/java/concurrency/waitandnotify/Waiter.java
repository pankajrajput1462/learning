package concurrency.waitandnotify;

public class Waiter implements Runnable {

	Message message;

	public Waiter(Message message) {
		this.message = message;
	}

	public void run() {

		synchronized (message) {
			try {
				System.out.println(message.getMsg());
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
