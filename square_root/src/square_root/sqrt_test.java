package square_root;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sqrt_test {

	@Test
	void test() {
		assert Sqrt.sqrt(9) == 3;
		assert Sqrt.sqrt(15) == 3;
		assert Sqrt.sqrt(16) == 4;
	}

}
