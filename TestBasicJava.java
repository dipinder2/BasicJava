import java.util.ArrayList;


public class TestBasicJava{

	public void printTo255(){
		for(int i=1;i<=255;i++){
			System.out.println(i);
		}
	}

	public int sigma255(){
		int sum = 0;
		for(int i=1;i<=255;i++){
			sum+=i;
		}
		return sum;
	}

	public void printArray(int []arr){
		int sum = 0;
		for(int element : arr){
			System.out.println(element);
		}
	}

	public int findMax(int []arr){
		int max = arr[0];
		for(int element : arr){
			if(element>max){
				max = element;
			}
		}
		return max;
	}

	public ArrayList OddArray(){
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i=1;i<=255;i++){
			if(i%2==1){
				y.add(i);
			}
		}
		return y;
	}

	public double Average(int[] arr){
		double sum = 0;
		for(int element : arr){
			sum+=element;
		}
		return sum/arr.length;
	}

	public ArrayList gtThanAvg(int[] arr,int y){
		ArrayList<Integer> gt = new ArrayList<Integer>();
		for(int element : arr){
			if(element>y){
				gt.add(element);
			}
		}
		return gt;
	}	

	public int[] sqValues(int[] arr){

		for(int i=0;i<arr.length;i++){
				arr[i] *= arr[i];
		}

		return arr;
	}

	public int[] elNegNums(int[] arr){

		for(int i=0;i<arr.length;i++){
				if(arr[i]<0){
					arr[i] = 0;
				}
		}

		return arr;
	}

	public ArrayList mma(int[] arr){
		int min = arr[0];
		int max = arr[0];
		double avg = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
			avg += arr[i];
		}
		avg /= arr.length;
		ArrayList<Object>threes = new ArrayList<Object>();
		threes.add(min);
		threes.add(max);
		threes.add(avg);
		return threes;
	}

	public int[] shift1(int[] arr){

		for(int i=0;i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		return arr;
	}
}