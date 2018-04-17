
public class fibonacci {
public static void main(String[] args) {
	int firstNumber = 0;
	int secondNumber = 1;
int sum = 1;
	for(int i = 0; i <13; i++) {
		
		System.out.print(firstNumber+ ", ");
		sum = secondNumber+firstNumber;
		firstNumber = secondNumber;
		secondNumber = sum;
		
	}
	
	
}
}
