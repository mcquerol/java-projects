package CS05WorkingwithAnArrayOfTemperatures;

public class CS05WorkingWithAnArrayOfTemperatures {
	
	private static final double TEMPERATURES[] = {18.5,21.2,19.7,18.3,20.4,20.5,22.2,23.9,24.6,
			 						   23.0,22.8,19.2,18.1,17.2,20.5,20.6,19.4,19.6,19.8,19.3}; 
			// declare constant array to use as "global variable"
																		
	
	public static void main(String[] args){
		   
	   
	   	System.out.println("----------------------------------");
	    fDisplayTemps();
	    
	    //fComputeAverageTemp();
	    //fFindMinAndMaxTemps();
	    //fFindMinDelta();
	    //fFindMaxDelta();
	    //fIsArray2Symetrical();
	    //fDisplayParallelArrays(); 
	}
    
    // ---------------------------------------------------
    public static void fDisplayTemps(){
        for (double T : TEMPERATURES){
            System.out.println(T);
        }    
    }        
    
    
    // ---------------------------------------------------
    public static void fComputeAverageTemp(){
        double SUM = 0;
        int NBEROFTEMP = 0;

        for (double T : TEMPERATURES){
            SUM=SUM + T;
            NBEROFTEMP++;        
        }
    
        System.out.println("Sum = " + SUM);
        System.out.println("Count = " + NBEROFTEMP);
        System.out.println("Average = " + SUM/NBEROFTEMP);    
    }
    
    
    // ---------------------------------------------------
    public static void fFindMinAndMaxTemps(){
        
        double MIN = 100;
        double MAX = 0;

        for(double T : TEMPERATURES){
            if(T>MAX){
                MAX=T;
            }
                
            if(T<MIN){
                MIN=T;
            }    
        }
    
        System.out.println("Max = " + MAX);
        System.out.println("Min = " + MIN);
    }

    
    // ---------------------------------------------------
    public static void fFindMinDelta(){    
        double D = 0;
        double MIND = 100;
        int POS = 0;
        
        for(int X=0; X<19; X++){
            D = Math.abs(TEMPERATURES[X]-TEMPERATURES[X+1]);
    
            if(D<MIND){
                MIND = D;
                POS = X;
            } 
        }
          
       System.out.println("Min Delta = " + MIND);
       System.out.println("Between elements " + (POS+1) + " and " + (POS+2));
       System.out.println("temperatures = " + (TEMPERATURES[POS]) + " and " + (TEMPERATURES[POS+1]));
         
    }
    
    
    // ---------------------------------------------------
    public static void fFindMaxDelta(){
  
        double D = 0;
        double MAXD = 100;
        int POS = 0;
        
        for(int X=0; X<19; X++){
            D = Math.abs(TEMPERATURES[X]-TEMPERATURES[X+1]);
    
            if(D>MAXD){
                MAXD = D;
                POS = X;
            } 
        }
          
        System.out.println("Max Delta = " + MAXD);
        System.out.println("Between elements " + (POS+1) + " and " + (POS+2));
        System.out.println("temperatures " + (TEMPERATURES[POS]) + " and " + (TEMPERATURES[POS+1]));    
    }

    
    // ---------------------------------------------------
    public static void fIsArray2Symetrical(){
    
    }

    
    // ---------------------------------------------------
    public static void fDisplayParallelArrays(){
    
    }

    
    // ---------------------------------------------------
    public static void fSortParrallelArrays(){
    
    }
	
	
}
