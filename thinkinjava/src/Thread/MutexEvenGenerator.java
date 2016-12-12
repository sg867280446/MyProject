package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator extends IntGenerator{
    private int cucrrentEvenValue = 0;
    private Lock lock = new ReentrantLock();
	@Override
	public int next() {
		lock.lock();
		try{
			++cucrrentEvenValue;			
			Thread.yield();
			++cucrrentEvenValue;
			return cucrrentEvenValue;
		}finally{
			lock.unlock();
		}
		
	}
	
	public static void main(String args[]){
		EvenChecker.test(new MutexEvenGenerator());
	}

}
