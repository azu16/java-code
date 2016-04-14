
public class Star {
           void rep(){
        	   for(int i = 1; i <= 3; i++)
        	   {
        	    // System.out.println("*"); 
        		   for(int j = 0; i > j ; j++)
        		   {
        			System.out.print(" * ");   
        		   }
        		   System.out.println();
        	   }
           }
	
	public static void main(String[] args) {
		
       Star st = new Star();
       st.rep();
	}

}
