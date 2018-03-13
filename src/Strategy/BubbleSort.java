package Strategy;

public class BubbleSort implements Strategy
{

	@Override
	public int[] doOperation(int[] array) {
		 for(int i = 0; i < array.length; i++) {
	            boolean flag = false;
	            for(int j = 0; j < array.length-1; j++) {

	               
	                if(array[j]>array[j+1]) {
	                    int k = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = k;
	                    flag=true;
	                }
	                

	            }

	            if(!flag) 
	            	break; 
	        }
		return array;
	}

}
