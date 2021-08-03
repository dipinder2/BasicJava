import java.util.Arrays;

public class BasicJava{
	public static void main(String[] args){
		TestBasicJava tbj = new TestBasicJava();
		tbj.printTo255();
		System.out.print("The sigma of 255:");
		System.out.println(tbj.sigma255());
		System.out.println("Iterating thru array");
		int[] arr = {
			1,3,5,7,-219,13,-1
		};
		tbj.printArray(arr);
		System.out.print("The max is ");
		System.out.println(tbj.findMax(arr));
		System.out.println(tbj.OddArray());
		System.out.print("The average of arr is ");
		System.out.println(tbj.Average(arr));
		System.out.print("Greater than Y ");
		System.out.println(tbj.gtThanAvg(arr,4));
		System.out.print("Square Values ");
		System.out.println(Arrays.toString(tbj.sqValues(arr)));
		System.out.print("Eliminate negative numbers ");
		
		int[] arr1 = {
			1,3,5,7,-219,13,-1
		};
		System.out.println(Arrays.toString(tbj.elNegNums(arr1)));
		System.out.print("Return 3s array ");
		System.out.println(tbj.mma(arr));
		System.out.print("Shifting the Values in the Array ");
		System.out.println(Arrays.toString(tbj.shift1(arr)));
		
	}
}