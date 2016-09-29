package Session4;

public class reverseofstring {
	public void reversestring(String arg1){
	/*Converting String to array
		through method or function*/
		char[] arr1 = arg1.toCharArray();
		
		for(int x=arr1.length;x>0;x--){
			
			System.out.print(arr1[x-1]);
			}
		//System.out.println(arr1.length);
	
			
	}
	
	public static void main(String[] args){
		String s1 = "Suhas";
		StringBuffer s2 = new StringBuffer("Chetan");
		reverseofstring r = new reverseofstring();
		//for string buffer to print reverse we have a defined function
		System.out.println("the reverse of the string is " +s2.reverse());
	r.reversestring(s1);
	}

}
