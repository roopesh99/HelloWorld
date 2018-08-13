package org.Error;



import java.util.Date;

public class LangOutOfMemoryError  {

	public static void main(String[] args) throws Exception {
		LangOutOfMemoryError memoryTest = new LangOutOfMemoryError();
		LangOutOfMemoryError.generate();
	}
 
	private static void generate() throws Exception {
		int iteratorValue = 20;
		Runtime runtime=Runtime.getRuntime();
		long starttime=System.currentTimeMillis();
		
		System.out.println("start time in milliseconds "+starttime);
		//Date date=new Date();
		//System.out.println("Start time :"+date.toString());
		
		try{
			for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
		
			System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory()); 
			int loop1 = 2;
			int[] memoryFillIntVar = new int[iteratorValue];
			// feel memoryFillIntVar array in loop..
			do {
				memoryFillIntVar[loop1] = 0;
				loop1--;
			} while (loop1 > 0);
			iteratorValue = iteratorValue * 5;
			System.out.println("\nRequired Memory for next loop: " + iteratorValue);
			Thread.sleep(1000);
		}
		}
	
	catch(Throwable e){
	long endtime=System.currentTimeMillis();
	long freememory=runtime.freeMemory();
	long allocatedmemory=runtime.totalMemory();
	long maxmemory=runtime.maxMemory();
	System.out.println( "Endtime in ms :"+endtime+"\n");
	System.out.println("Total time taken by application is "+((endtime-starttime)*0.001)+"seconds");
	System.out.println( "\n \n \n After application terminted free memory: "+((freememory/1024)/1024));
	System.out.println( "Allocated Memory: "+((allocatedmemory/1024)/1024));
	System.out.println( "max Memory: "+((maxmemory/1024)/1024));
		e.printStackTrace();
		
	}
		
		
	}
 
}