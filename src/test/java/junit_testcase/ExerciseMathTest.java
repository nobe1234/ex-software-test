package junit_testcase;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExerciseMathTest {

	private int answer;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testFactorial1() {
		answer = ExerciseMath.factorial(1);

		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1));

	}

	@Test
	public void testFactorial2() {
		answer = ExerciseMath.factorial(2);

		assertThat("TC2:期待値と実際の結果が異なります", answer, is(2));

	}

	@Test
	public void testFactorial3() {
		answer = ExerciseMath.factorial(3);

		assertThat("TC3:期待値と実際の結果が異なります", answer, is(6));

	}

	@Test
	public void testFactorial4() {
		answer = ExerciseMath.factorial(4);

		assertThat("TC3:期待値と実際の結果が異なります", answer, is(24));

	}

	@Test
	public void testFactorial5() {
		answer = ExerciseMath.factorial(5);

		assertThat("TC3:期待値と実際の結果が異なります", answer, is(120));

	}

	// TODO:
	@Test
	public void testFactorial6() {
		answer = ExerciseMath.factorial(12);

		assertThat("TC6:期待値と実際の結果が異なります", answer, is(479001600));

	}

	@Test
	public void testFactorial7() {
		try {
			answer = ExerciseMath.factorial(13);
			fail("Not yet implemented");
		} catch (IllegalArgumentException e) {
			assertThat("メッセージが一致しません", e.getMessage(), is("13以上の値は不正です。"));
		}
	}

	@Test
	public void testFactorial8() {
		try {
			answer = ExerciseMath.factorial(0);
			fail("Not yet implemented");
		} catch (IllegalArgumentException e) {
			assertThat("メッセージが一致しません", e.getMessage(), is("渡された値が正しくありません"));
		}
	}

	@Test
	public void testFactorial9() {
		try {
			answer = ExerciseMath.factorial(-1);
			fail("Not yet implemented");
		} catch (IllegalArgumentException e) {
			assertThat("メッセージが一致しません", e.getMessage(), is("渡された値が正しくありません"));
		}
	}

}
