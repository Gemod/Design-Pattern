package Strategy;

public class QuickSort implements Strategy
{

	private int length;
	private int [] array;
	@Override
	public int[] doOperation(int[] array) {
		
		 if (array == null || array.length == 0) {
	            return null;
	        }
	        this.array=array;
	        length = array.length;
	        quickSort(0, length - 1);
			return array;
	
	}
	  private void quickSort(int lowerIndex, int higherIndex) {
	         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	           
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);

	                i++;
	                j--;
	            }
	        }
	       
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }
	 
	    private void exchangeNumbers(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	     
	

}
