package tw.acelan;

public class Test {
	public static void main(String[] args) throws Exception{
		
		//�Q�Τ@�ӹ�@Runnable�������ΦW���O new �X�@�� Thread �������
		Thread thread = new Thread(new Runnable(){
			public void run() {
				System.out.println("thread is running");
			}
		});
		
		//�Ұ�thread
		thread.start();
		
		System.out.println("main function is finished.");
	}
}
