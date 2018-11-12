package junit_testcase;

public class ExerciseMath {

	//？？ int n = Integer.parseInt(args[0]);

	//staticにする
	public static int factorial(int args) {
		int answer = 1;

		if (args <= 0) {
			throw new IllegalArgumentException("渡された値が正しくありません");
		}
		
		if (13 <= args) {
			throw new IllegalArgumentException("13以上の値は不正です。");
		}

		for (int i = args; i > 0; i--) {
			answer *= i;
		}

		return answer;
	}

}
