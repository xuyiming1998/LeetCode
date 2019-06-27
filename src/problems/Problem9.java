package problems;

/**
 * 9. Palindrome Number
 * -Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * 
 * Difficulty: Easy
 * Related Topics: Math
 * 
 * @author 吴星辉
 * @date 2019-6-27
 */
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem9 p9 = new Problem9();
		System.out.println(p9.isPalindrome(12321));
	}
	
	
	/**
	 * @param x
	 * @return isPalindrome
	 * @version 2.0*
	 */
	public boolean isPalindrome(int x) {
		// If x < 0, x is not a palindrome.
		if(x < 0)
			return false;
		// If the last digit of the integer x is 0, x is not a palindrome.
		if((x % 10 == 0) && (x != 0))
			return false;
		
		// Revert half of the number.
		int reversal = 0;
		while(x > reversal) {
			reversal = reversal * 10 + x % 10;
			x /= 10;
		}
		// Compare the first and the last half of the integer x to judge if x is a palindrome.
		return (x == reversal) || (x == reversal / 10);
	}
	
	
//	/**
//	 * @param x
//	 * @return isPalindrome
//	 * @version 1.0
//	 */
//	public boolean isPalindrome(int x) {
//		// if x < 0, x is not a palindrome.
//		if(x < 0)
//			return false;
//		
//		// The number of digits that the integer x contains.
//		int digits = 1;
//		while(true) {
//			if((int) (x / Math.pow(10, digits)) != 0)
//				digits++;
//			else
//				break;
//		}
//		
//		// Judge if x is a palindrome.
//		for(int i=1; i<=digits/2; i++) {
//			int leftDigit = (int) (x / Math.pow(10, digits - i)) % 10;
//			int rightDigit = (int) ((x % Math.pow(10, i)) / Math.pow(10, i - 1));
//			if(leftDigit != rightDigit)
//				return false;
//		}
//		return true;
//    }

}
