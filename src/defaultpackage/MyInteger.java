package defaultpackage;

public class MyInteger {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInteger number = new MyInteger(10);
		
		MyInteger num = new MyInteger(6);
		
		char[] array = {0,1,2,3,4,5};
		
		String letter = "How many number is this string equal to?";
		
		System.out.println("Is number Even: " + number.isEven());
		
		System.out.println("In number Odd: " + number.isOdd());
		
		System.out.println("This is the GetValue: " + num.GetValue());
		
		System.out.println("This is the sum of the array: " + number.parseInt(array));
		
		System.out.println("Prime is: " + number.isPrime());
		
		System.out.println("Static boolean isEven: " + number.isEven(11));
		
		System.out.println("Static isEven is: " + number.IsEven(num));
		
		System.out.println(number.parseInt(letter));
		
	}
	
	private static int value;
	
	public MyInteger(int value){
		
		this.value = value;
	}
	
	public int GetValue(){
		
		return this.value;
		
	}
	
	public boolean isEven(){
		
		if (value % 2 == 0)
			
			return true;
		
		else 
			
			return false;
	
		
	}
	
	public boolean isOdd(){
		
		return value % 2 != 0;
	}

	public boolean isPrime(){
		 if (value <= 1)
			 
		       return false;
		   
		   for (int x = 2; x < Math.sqrt(value); x++) 
		     
			   if (value % x == 0) 
		       
				   return false;
		       
		   
		   return true;
	}
	
	
	
	public static boolean isEven(int value){
		
		if (value % 2 == 0)
			
			return true;
		
		else
			
			return false;
		
		
	}
	
	public static boolean isOdd(int value){
		
		if (value % 2 != 0)
		
			return true;
		
		else
			
			return false;
		
	}
	
	public static boolean isPrime(int value){
		
		if (value <= 1) 
		       
			return false;
		   
		   for (int x = 2; x < Math.sqrt(value); x++){ 
		       
			   if (value % x == 0) 
				   
				   return false;
		       
		   }
		   return true;
	}
	
	private static boolean IsEven(MyInteger MyInt){
		
		if (MyInteger.value % 2 == 0)
			
			return true;
		
		else
			
			return false;
		
	}
	
	private static boolean IsOdd(MyInteger MyInt){
		
		if (MyInteger.value % 2 != 1)
			
			return true;
		else
			
			return false;
		
	}
	
	private static boolean IsPrime(MyInteger MyInt){
		
		return MyInteger.isPrime(MyInt.GetValue());
		
	}
	
	public boolean equals(int number){
		
		if (number == value)
			return true;
		
		else
			return false;
		
	}
	
	private boolean Equals(MyInteger number){
		
		if (number.value == value){
			return true;
		}else{
			return false;
		}
	}
	
	public static int parseInt(char[] num){
		int sum = 0;
		
		 for (int number = 0 ; number < num.length; number++){
			 sum += num[number];
			 
			
		 }
		 
		 return sum;
	}
	
	
	public static int parseInt(String y){
		
		return y.length();
	}


}