package tw.acelan;

public class Test {
	public static void main(String[] args) throws Exception{
		
		//利用一個實作Runnable介面的匿名類別 new 出一個 Thread 物件實體
		Thread thread = new Thread(new Runnable(){
			public void run() {
				System.out.println("thread is running");
			}
		});
		
		//啟動thread
		thread.start();
		
		System.out.println("main function is finished.");
	}
}
