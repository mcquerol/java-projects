package CS05WorkingwithAnArrayOfTemperatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CS04WorkingWithAnArrayOfNames {
	
	// ----Declare variables ----------------------------------------------------------------------------------   
	public static String[] NAMES = {"Helen Bennett","Judy Moore","Jeffrey Peterson","Keith Rogers","Ann Thompson",
		                    "Gloria Ross","Beverly Martinez","Annie Diaz","Kathleen Green","Brandon Nelson",
		                    "Rose James","Louise Williams","Jesse Perez","Tammy Ross","Martha Green",
		                    "Gloria Mitchell","Jerry Rodriguez","John Lopez","Ronald Adams","Alan Carter"};
	public static int Rear = NAMES.length;
	public static int Front = (NAMES.length-1)-NAMES.length;
		public static void main(String[] args){
 
		    System.out.println("----------------------------------");
		    //fDisplayArray();
		    System.out.println("----------------------------------");
		    //fDisplayArray2();
		    //fDisplayEvery3rdName();
		    System.out.println("----------------------------------");
		    //fSequentialSearch();
		    System.out.println("----------------------------------");
		    //fSequentialSearch2();
		    System.out.println("----------------------------------");
		    //fBinarySearch(0, NAMES.length);
		    System.out.println("----------------------------------");
		   // fReverseArray();
		    System.out.println("----------------------------------");
		    //fReverseArray2();
		    System.out.println("----------------------------------");
		   // fArrayPush();
		    System.out.println("----------------------------------");
		    //fArrayPop();
		    System.out.println("----------------------------------");
		    //fModifyArray();
		    System.out.println("----------------------------------");
		    //fBubbleSortArray();
		    System.out.println("----------------------------------");
		    //fSelectionSortArray();
		    System.out.println("----------------------------------");
		    //fSelectionSortArray2();
		    System.out.println("----------------------------------");
		    //fIdentifyDuplicates();
		    System.out.println("----------------------------------");
		    //fMoveFirst();
		    System.out.println("----------------------------------");
		    //fMoveNext();
		    System.out.println("----------------------------------");
		    //fMovePrevious();
		    System.out.println("----------------------------------");
		    //fMoveLast();    
		    System.out.println("----------------------------------");
		}
    
    // ---- Functions -----------------------------------------------------------------------------------------

    // ---------------------------------------------------
    public static void fDisplayArray(){
        
        for(String N : NAMES){
          System.out.println(N);
        }
        
        
    }

    
    // ---------------------------------------------------
    public static void fDisplayArray2(){
        
        for(int X = 0; X < NAMES.length; X++){
            System.out.println(NAMES[X]);
        }
        
    }
    
    
    
    
    
    // ---------------------------------------------------
    public static void  fDisplayEvery3rdName(){
        
        for(int X = 2; X < NAMES.length; X = X + 3){
        	System.out.println(NAMES[X]);
        }

    }

    
    // ---------------------------------------------------
    public static void fSequentialSearch(){
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Type a name");
        String N = scan.nextLine();        
        
        for(String K : NAMES){       
	        if(K == N) {
	            System.out.println(N + " is in the list");
	            break;
	        } else if (K != N) {
	        	System.out.println(N + " is not in the list");
	            break;
	        }
        }
        scan.close();
    }
    // TODO FIX THIS
    
    
    
    
    
    
    
    // ---------------------------------------------------
    public static void fSequentialSearch2(){
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Type a name");
        String N = scan.nextLine(); 
                
        for(int X = 0; X < NAMES.length; X++){
            System.out.println(X);
            if (NAMES[X]==N){
            	System.out.println(" is in the list");
            } else {
            	System.out.println(N + " is not in the list");
	            break;
            }
        }
        scan.close();
    }
    // TODO FIX THIS
    
    // ---------------------------------------------------
    public static void fBinarySearch(int F, int L){

    	Scanner scan = new Scanner(System.in);
    	System.out.println("What Name?");
    	
    	String N = scan.nextLine();
		int M;
		
		if (F > L) {
			System.out.println(N + " Not found...");
			
		}
		M = (int)(F +(L-F)/2);
		System.out.println("Comparing to item " + M);
		
		if (N.compareToIgnoreCase(NAMES[M]) ==  0){
			System.out.println("... " + N + " Found!");
		}else if(N.compareToIgnoreCase(NAMES[M]) < 0){
			fBinarySearch(F, (M-1));
		}else if(N.compareToIgnoreCase(NAMES[M]) > 0) {
			fBinarySearch(M+1, L);
		}
		scan.close();
    }

    
    // ---------------------------------------------------
    public static void fReverseArray(){
        String[] TEMP = {}; // create an empty array
        
        for (int C = 0; C < NAMES.length ; C++){
            TEMP[(NAMES.length-1)-C] = NAMES[C];
        }
        for (int C = 0; C < NAMES.length; C++) {
            NAMES[C] = TEMP[C];
        }
        
    }

    
    
    
    // ---------------------------------------------------
    public static void fReverseArray2(){
        String TEMP="";
        
        for (int C = 0; C < (NAMES.length/2); C++){
            TEMP=NAMES[C];
            NAMES[C]=NAMES[(NAMES.length-1)-C];
            NAMES[(NAMES.length-1)-C]=TEMP; 
  
        }
    }    
    
    
    // ---------------------------------------------------
    public static void fBubbleSortArray(){
        String TEMP="";
        int SWAP=0;
        int CHECK=0;
        for(int X=(NAMES.length-2); X >= 0; X--){
            for (int I=0; I<=X ;I++){
            	
            	if (NAMES[I].compareToIgnoreCase(NAMES[I+1]) != 0){
                    TEMP=NAMES[I+1];
                    NAMES[I+1]=NAMES[I];
                    NAMES[I]=TEMP;
                    SWAP++;
                }   
                CHECK++;
            }  
        }
        System.out.println("Comp: " + CHECK);         // Only for info purposes
        System.out.println("Swap: " + SWAP);          // Only for info purposes
    }
    
    
    // ---------------------------------------------------
    public static void fSelectionSortArray(){
        String TEMP="";
        int COMP=0;                                // Only for info purposes
        int SWAP=0;                                // Only for info purposes
        
        for(int S=0; S<=(NAMES.length-2);S++){
            for(int C = S+1; C<=(NAMES.length-1);C++){
                if(NAMES[S].compareTo(NAMES[C]) !=0){
                    TEMP = NAMES[S];
                    NAMES[S] = NAMES[C];
                    NAMES[C] = TEMP;
                    SWAP=SWAP+1;              // Only for info purposes
                }
                COMP=COMP+1;                  // Only for info purposes
            }
        }
        
        System.out.println("Comp: " + COMP);         // Only for info purposes
        System.out.println("Swap: " + SWAP);          // Only for info purposes
    }


     // ---------------------------------------------------
    public static void fSelectionSortArray2(){
        
        String TEMP="";
        int COMP=0;                                // Only for info purposes
        int SWAP=0;                                // Only for info purposes
        int SMALLEST = 0;
        
        for(int S=0; S<=(NAMES.length-2); S++){
            SMALLEST = S;
            for(int C=S+1; C<=(NAMES.length-1);C++){
                if(NAMES[SMALLEST].compareToIgnoreCase(NAMES[C]) > 0){
                     SMALLEST = C;                     
                }
                COMP=COMP+1;                  // Only for info purposes
            }
            
            if (NAMES[SMALLEST].compareToIgnoreCase(NAMES[S]) < 0){
                TEMP = NAMES[S];
                NAMES[S] = NAMES[SMALLEST];
                NAMES[SMALLEST] = TEMP;
                SWAP=SWAP+1;              // Only for info purposes
            }
        }
        
        System.out.println("Comp: " + COMP);         // Only for info purposes
        System.out.println("Swap: " + SWAP);          // Only for info purposes

    }
    
    
    // ---------------------------------------------------
    public static void fIdentifyDuplicates(){
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Type a name");
        String N = scan.nextLine(); 
        
        for (String K : NAMES){ 
			if(K == N) {
					System.out.println("there are duplicates");
					System.out.println(N);
					break;
			} else {
				System.out.println("there are no duplicates");
					break;
				}
		}
        scan.close();
    
    }
    

    // ---------------------------------------------------
    public static void fArrayPush(){
        
    	Scanner scan = new Scanner(System.in);
    	System.out.println("What name would you like to add?");
    	String Str = scan.nextLine();
    
    	
    	
    	if (Rear >= NAMES.length -1){
    		System.out.println("Queue Overflow");
    	} else {
    		Rear = Rear + 1;
			NAMES[Rear]=Str;
				if (Front == -1){
					Front = 0;
				}
    	}
    	
    	fDisplayArray();

    	 scan.close();
    	 	/*
    	 	 * The push() method adds 
    	 	 * new items to the end of an array,
    	 	 * and returns the new array.
    	 	 */
    
    }  

    
    // ---------------------------------------------------
    public static void fArrayPop(){
    	
    	if (Front == -1){
    		System.out.println("Queue underflow");
    	} else {
    		System.out.println("Deleted Element is "+NAMES[Front]);
    		if (Front == Rear){
    			Front = -1; 
    			Rear = -1;
    		}else{
    			Front++;
    		}
    	}
    	
    	fDisplayArray();
    	System.out.println(NAMES.length);
    	
    	/*
    	 * the Array.pop method
    	 * removes the last element in the array
    	 */

    }   
    
    
    // ---------------------------------------------------
    public static void fModifyArray(){
    	ArrayList<String> NList = new ArrayList<String>(Arrays.asList(NAMES));
    	Scanner scan = new Scanner(System.in); // create instance of object
    	
	    	System.out.println(NList);
	    	System.out.println("What name do you want to change?");
	    	String Nfrom = scan.nextLine();
	    	int IND = NList.indexOf(Nfrom);
	    	System.out.println("What name do you want to change to?");
	    	String NTo = scan.nextLine();

	    	NList.set(IND, NTo);
	    	
	    	System.out.println(NAMES);
    	
    	scan.close();
    }    
    // TODO FIX
    
    // ---------------------------------------------------
    public static void fMoveFirst(){
       	ArrayList<String> NList = new ArrayList<String>(Arrays.asList(NAMES));
    	Scanner scan = new Scanner(System.in); // create instance of object
	    	System.out.println(NList);
	    	System.out.println("What name do you want to change?");
	    	String In = scan.nextLine();
	    	int IND = NList.indexOf(In);
	    	String TEMP = NAMES[0];
	    	NAMES[0] = NAMES[IND];
	    	NAMES[IND] = TEMP;
	    	System.out.println(NList);
	    	
	    	scan.close();
    }    
    

    // ---------------------------------------------------
    public static void fMoveNext(){
    
    }    

    
    // ---------------------------------------------------
    public static void fMovePrevious(){
    
    }    

    
    // ---------------------------------------------------
    public static void fMoveLast(){
    
    }    
}
