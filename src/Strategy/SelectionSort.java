package Strategy;

public class SelectionSort implements Strategy
{

	@Override
	public int[] doOperation(int[] array) {
		 for(int i = 0; i < array.length-1; i++) {
	            int minimo = i; //Partiamo dall' i-esimo elemento
	            for(int j = i+1; j < array.length; j++) {

	            //Qui avviene la selezione, ogni volta
	            //che nell' iterazione troviamo un elemento piú piccolo di minimo
	            //facciamo puntare minimo all' elemento trovato
	                    if(array[minimo]>array[j]) {
	                        minimo = j;
	                    }
	            }

	            //Se minimo e diverso dall' elemento di partenza
	            //allora avviene lo scambio
	            if(minimo!=i) { 
	                int k = array[minimo];
	                array[minimo]= array[i];
	                array[i] = k;
	            }
	        }
		return array;
	}

}
