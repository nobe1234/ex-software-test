package junit_sample;

public class MathUtil {

	/**
	 * @param num1 ベースとなる数
	 * @param num2　指数
	 * @return　num1のnum2乗
	 */
	public static double power(int num1,int num2) {
	
		if(num1 >= 100 || num2 >= 100) {
			throw new IllegalArgumentException("100以上の値は不正です。");
		}
		return Math.pow(num1, num2);
		
	
	}
}
