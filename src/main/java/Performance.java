import main.Timer;

public class Performance {

    public static final int N = 200000000;

    public static void main(String[] args) {

    	Timer t2;
    	try {
    		t2= new Timer();
    		t2.stop();
    	}
    	catch(Exception e) {
     	}
        
        int[] myArray = new int[N];
        int rta;
        
    	// generate array
        for (int rec = N; rec > 0; rec--)
            myArray[N - rec] = rec;

         
        t2= new Timer();
        rta = AlgoA.max(myArray);
        t2.stop();
        System.out.println(String.format("max Algo A %d. Delay %d (ms)", rta, t2.getElapsedTime()));
        
        // generate array
        for (int rec = N; rec > 0; rec--)
            myArray[N - rec] = rec;
        
        t2= new Timer();
        rta = AlgoB.max(myArray);
        t2.stop();
        System.out.println(String.format("max Algo B %d. Delay %d (ms)", rta, t2.getElapsedTime()));

    }

}