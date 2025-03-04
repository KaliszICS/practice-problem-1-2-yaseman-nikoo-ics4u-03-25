public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean validIndex(int[] array, int num){
		boolean answer= true;
		try{
			array[num] = 0;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			answer=false;
		}
		return answer;
	}
	public static int divide(int num1, int num2){
		int result=1;
		try{
			result= num1/num2;
		}
		catch (Exception e){
			result =0;
		}
		return result;
	}
	public static int safeConvertStringtoInt(String word){
		int a=1;
		try{
			a= Integer.parseInt(word);
		}
		catch( Exception e){
			a=0;
		}
		return a;
	}

}
