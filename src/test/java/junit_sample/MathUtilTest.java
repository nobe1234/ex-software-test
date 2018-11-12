package junit_sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilTest {

	private double answer;

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
	public void testPower1() {
		answer = MathUtil.power(0, -2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(Double.POSITIVE_INFINITY));
	}

	@Test
	public void testPower2() {
		answer = MathUtil.power(0, -1);
		assertThat("TC2:期待値と実際の結果が異なります", answer, is(Double.POSITIVE_INFINITY));
	}

	@Test
	public void testPower3() {
		answer = MathUtil.power(0, 0);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower4() {
		answer = MathUtil.power(0, 1);
		assertThat("TC4:期待値と実際の結果が異なります", answer, is(0.0));
	}

	@Test
	public void testPower5() {
		answer = MathUtil.power(0, 2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(0.0));
	}

	@Test
	public void testPower6() {
		answer = MathUtil.power(1, -2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower7() {
		answer = MathUtil.power(1, -1);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower8() {
		answer = MathUtil.power(1, 0);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower9() {
		answer = MathUtil.power(1, 1);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower10() {
		answer = MathUtil.power(1, 2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	// 11~15
	@Test
	public void testPower11() {
		answer = MathUtil.power(-1, -2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower12() {
		answer = MathUtil.power(-1, -1);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(-1.0));
	}

	@Test
	public void testPower13() {
		answer = MathUtil.power(-1, 0);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower14() {
		answer = MathUtil.power(-1, 1);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(-1.0));
	}

	@Test
	public void testPower15() {
		answer = MathUtil.power(-1, 2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower16() {
		answer = MathUtil.power(2, -2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(0.25));
	}

	@Test
	public void testPower17() {
		answer = MathUtil.power(2, -1);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(0.5));
	}

	@Test
	public void testPower18() {
		answer = MathUtil.power(2, 0);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(1.0));
	}

	@Test
	public void testPower19() {
		answer = MathUtil.power(2, 1);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(2.0));
	}

	@Test
	public void testPower20() {
		answer = MathUtil.power(2, 2);
		assertThat("TC1:期待値と実際の結果が異なります", answer, is(4.0));
	}

	// 失敗した時の処理などをかく
	@Test
	public void testPower21() {
		try {

			answer = MathUtil.power(100, 0);
			fail("Not yet implemented");
		} catch (IllegalArgumentException e) {

			assertThat("メッセージが一致しません", e.getMessage(), is("100以上の値は不正です。"));
		}
	}

	@Test
	public void testPower22() {
		try {

			answer = MathUtil.power(0, 100);
			fail("Not yet implemented");
		} catch (IllegalArgumentException e) {

			assertThat("メッセージが一致しません", e.getMessage(), is("100以上の値は不正です。"));
		}
	}

}
