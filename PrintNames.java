public class PrintNames {

	public static void main(String[] args) {
		PrintNames val = new PrintNames();
		val.selva(7);

	}

	// ==========================================================================
	void selva(int num) {
		PrintNames val = new PrintNames();
		int n = num, a = n - 2, b = n, b1 = n, c = 2 * n - 1, c1 = 2 * n - 5;
		for (int i = 1; i <= 2 * n - 1; i++) {
			int temp = i;
			val.s(i, n, a);
			val.e(i, n, a);
			val.l(i, n, a);
			val.v(i, n, a, b1, c1);
			val.a(i, n, a, b, c);

			System.out.println("");
			if (b > 0) {
				b--;
			}
			if (c > 0) {
				c -= 2;
			}
			if (i > a + 2) {
				b1--;
				c1 -= 2;
			}
		}
//		if(n<16) {
//			System.out.println("\n\n");
//			val.selva(n+1);
//		}

	}

	// ==========================================================================
	void s(int i, int n, int a) {
		System.out.print(" ");
		if ((i == 1 || i== 2 || i == 2 * n - 2 || i == 2 * n - 1) || (i == a + 1) || (i == a + 2)) {
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}

		} else {
			if (i > a + 2) {

				for (int k = 0; k < n * 2 - 4; k++) {
					System.out.print(" ");
				}
				System.out.print("# # ");
			}

			if (i < a + 2) {
				System.out.print("# #");
				for (int j = 0; j < 2 * n - 3; j++) {
					System.out.print(" ");
				}

			}
		}

	}

	// ================================
	void e(int i, int n, int a) {
		System.out.print("  ");
		if ((i == 1 || i== 2 || i == 2 * n - 1) || (i == a + 2) || i == 2 * n - 2 || (i == a + 1)) {
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}

		} else {
			if (i > a + 2) {
				System.out.print("# #");
				for (int j = 0; j < 2 * n - 3; j++) {
					System.out.print(" ");
				}
			}

			if (i < a + 2) {
				System.out.print("# #");
				for (int j = 0; j < 2 * n - 3; j++) {
					System.out.print(" ");
				}

			}
		}

	}

	// ================================
	void l(int i, int n, int a) {
		System.out.print("  ");
		if (i == 2 * n - 1 || i == 2 * n - 2) {
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}

		} else {

			System.out.print("# #");
			for (int j = 0; j < 2 * n - 3; j++) {
				System.out.print(" ");
			}

		}

	}

	// ================================
	void a(int i, int n, int a, int b, int c) {
		System.out.print("  ");
		for (int j = 1; j < b; j++) {
			System.out.print(" ");
		}
		if (i == 1) {
			System.out.print("# ");
		}else if(i == 2){
			System.out.print("# # ");
		}else if(i == 3){
			System.out.print("# # # ");
		}else if(i == a + 3){
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}
		}else if (i < a + 2) {

				System.out.print("# #");

			for (int j = 2 * n - 7; j >= c; j--) {
				System.out.print(" ");
			}
			if(i>3){
				System.out.print("# # ");
			}else {
				System.out.print("# ");
			}


		} else if (i > a + 2) {
			System.out.print("# #");
			for (int j = 2 * n - 7; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("# # ");
		} else {
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}
		}
		for (int j = 1; j < b; j++) {
			System.out.print(" ");
		}

	}

	// ================================
	void v(int i, int n, int a, int b1, int c1) {
		System.out.print(" ");


		if (i <= a + 2) {
			System.out.print("# #");
			for (int j = 2 * n - 7; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("# # ");
		} else if (i > a + 2) {
			if (i > a + 2) {
				for (int j = n; j >= b1; j--) {
					System.out.print(" ");
				}
			}

			if (i == 2 * n - 1) {
				System.out.print("# ");
			}else if (i == 2 * n - 2) {
				System.out.print("# # ");
			}else if (i == 2 * n - 3) {
				System.out.print("# # # ");
			} else {
				System.out.print("# #");
				for (int j = c1; j > 4; j--) {
					System.out.print(" ");
				}

				System.out.print("# # ");
			}

			for (int j = n; j > b1; j--) {
				System.out.print(" ");
			}
			System.out.print(" ");
		}

	}
	// ================================
}
