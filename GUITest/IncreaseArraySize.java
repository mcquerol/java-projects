
/**
 * Write a description of class testTextIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class IncreaseArraySize
{
    // instance variables - replace the example below with your own
    
    static String MYARRAY[] = new String[4];
    static int COUNTER = 0;
        
    public static void main (String[] args){
        //addItem();
        //listArray();
        
    }
    
    public static String addItem(String NEWITEM){
        do{
            
            if (NEWITEM.compareTo("end")!=0){
                MYARRAY[COUNTER] = NEWITEM;
                COUNTER++;
                if (COUNTER == MYARRAY.length){ 
                    increaseArraySize();
                }
            }
        }while(NEWITEM.compareTo("end")!=0);
        return NEWITEM;
    }
    
    public static void listArray(){
        for (int I=0;I<MYARRAY.length-1;I++){
            System.out.println(I + " - " + MYARRAY[I]);
        } 
    }

    public static void increaseArraySize(){
            System.out.print("Here we increase the size to ");
            String TEMP[] = new String[MYARRAY.length*2];
            System.arraycopy(MYARRAY, 0, TEMP, 0, MYARRAY.length);
            MYARRAY = TEMP;
            System.out.println(TEMP.length);
    
    }
    
    
}
