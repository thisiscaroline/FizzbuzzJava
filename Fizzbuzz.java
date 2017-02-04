public class Fizzbuzz {

	public static void main(String[] args){
		
		// Default range
		int start = 1, stop = 50;
		
		// Custom input
		if (args.length == 2){
			int arg1 = Integer.parseInt(args[0]);
			int arg2 = Integer.parseInt(args[1]);
			
			if (arg1 < arg2){
				start = arg1;
				stop = arg2;
			} else {
				stop = arg1;
				start = arg2;
			}
		}
		
		System.out.println("\nFizzbuzz range: "+start+" to "+stop+".\n");
		
		// Mod i to sort out Fizz, Buzz, Fizzbuzz
		for (int i = start; i <= stop; i++){
			
			System.out.print(i);
			
			if ( (i % 3 == 0) || (i % 5 == 0) ){
				
				if (i % 5 != 0){
					System.out.print(" Fizz!");
				} else if (i % 3 != 0){
					System.out.print(" Buzz!");
				} else {
					System.out.print(" Fizzbuzz!");
				}
				
			}
			
			System.out.println();
			
		}
	
	}

}
