package Strategy;

public class Client 
{
	public static void stampa(int [] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
public static void main(String[] args) 
{
	int[] array = {24,2,45,20,56,75,2,56,99,53,12};
	System.out.println("original array");
	stampa(array);
	Context context = new Context(new QuickSort());		
	System.out.println("Quick sort");
	stampa(context.executeStrategy(array));
	      
	System.out.println("Bubble sort");
	context = new Context(new BubbleSort());		
	stampa(context.executeStrategy(array));
	
	System.out.println("Selection sort");
	context = new Context(new SelectionSort());		
	stampa(context.executeStrategy(array));
   }

}
