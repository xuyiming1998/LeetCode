package problems;

/**
 * 7. Reverse Integer
 * -Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Difficulty: Easy
 * Related Topics: Math
 * 
 * @author 吴星辉
 * @date 2019-6-26
 */
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem7 p7 = new Problem7();
		int x = 0;
		int reversal = p7.reverse(x);
		System.out.println(x);
		System.out.println(reversal);
	}
	
	
	/**
	 * @param x
	 * @return reversal
	 * @version official-solution-2.0
	 */
	public int reverse(int x) {
        int reversal = 0;
		while(x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversal > Integer.MAX_VALUE/10 || (reversal == Integer.MAX_VALUE / 10 && digit > 7))
            	return 0;
            if (reversal < Integer.MIN_VALUE/10 || (reversal == Integer.MIN_VALUE / 10 && digit < -8))
            	return 0;
            reversal = reversal * 10 + digit;
        }
        return reversal;
    }
	
	
	/**
	 * @param x
	 * @return reversal
	 * @version 1.0
	 */
//	public int reverse(int x) {
//		/*
//		 *  2^31 - 1 = 2147483647
//		 *  -2^31 = -2147483648
//		 */
//		// 整数反转结果
//		int reversal = 0;
//		// 当前移位幂次
//		int power = 0;
//		// 是否遍历到整数的最高位
//		boolean isBeginning = false;
//		
//		// 按数位遍历整数x
//		for(int i=9; i>=0; i--) {
//			// 当前位的数字
//			int digit = (int) (x / Math.pow(10, i)) % 10;
//			// 遍历到整数的最高位
//			if(! isBeginning && digit != 0)
//				isBeginning = true;
//			// 整数反转
//			if(isBeginning) {
//				if(power != 9) {
//					reversal += digit * Math.pow(10, power);
//					power++;
//				}
//				else {
//					// 即将加入到反转结果十亿数位的值
//					int last = (int) (digit * Math.pow(10, power));
//					// 32位有符号整数数值范围的越界判断
//					if((x > 0) && (Integer.MAX_VALUE - reversal < last))
//						return 0;
//					if((x < 0) && (Integer.MIN_VALUE - reversal > last))
//						return 0;
//					return reversal + last;
//				}
//			}
//		}
//        return reversal;
//    }

}
