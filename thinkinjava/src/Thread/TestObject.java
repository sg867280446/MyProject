package Thread;

public class TestObject implements Runnable{
	public int index;
	public TestObject(int index){
		this.index=index;
	}
    public  synchronized void test1() {
    	for(int i=0;i<5;i++){
    		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println(index);
    	}   	
    }   
    
    
    public static void main(String args[]){
    	new Thread(new TestObject(1)).start();
    	new Thread(new TestObject(2)).start();
    }

	@Override
	public void run() {
		test1();
	}
}
