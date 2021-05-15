package hashcode;

public class D {
	public static void main(String[] args) {
		final int[] cnt=new int[]{0};
		for(int i=0;i<100;i++){
			new Thread(){
				public void run(){
					System.out.println(++cnt[0]);
				}
			}.start();
		}
	}
}
