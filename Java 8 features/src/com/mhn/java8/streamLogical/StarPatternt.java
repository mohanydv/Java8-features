package com.mhn.java8.streamLogical;


public class StarPatternt {
	public static void main(String[] args) {
		StarPatternt.triangle(10);
		System.out.println("2 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println();
		StarPatternt.revtriangle(10, 10);
		System.out.println("3 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println();
		StarPatternt.BothInSingle(10, 8);
		System.out.println("4 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println();
		StarPatternt.tri(5);
		System.out.println("5 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println();
		StarPatternt.revtri(5);

		System.out.println("6 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println();
		StarPatternt.triangleDinond(10);
		System.out.println("7 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println();
		StarPatternt.createTriangle(9, 9);
		System.out.println(" 8 ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println();
		StarPatternt.completeDimond(10, 10);
	}

	private static void completeDimond(int x, int y) {

		for (int i = 0; i < x; i++) {

			for (int j = 0; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < x; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = i; j < 2*x-i-1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	private static void createTriangle(int x, int y) {
		for (int i = 0; i < x; i++) {
			System.out.println();
			for (int j = 0; j < y; j++) {

				if (((i == 0 || i == x - 1) && (j == y / 2)) || ((j == (y / 2) + i) || (j == (y / 2) - i))) {
					System.out.print("*");

				}

				else if ((i > x / 2 && i % (x / 2) != 0) && (j == i % (x / 2) || j == y - 1 - (i % (x / 2)))) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}

			}
		}
	}

	private static void triangleDinond(int x) {
		for (int i = 0; i < x; i++) {

			for (int j = 0; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void revtri(int x) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i + 1; j++) {

				System.out.print(" ");
			}

			for (int k = x; k > i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void tri(int x) {
		for (int i = 0; i < x; i++) {

			for (int j = x; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

	private static void BothInSingle(int x, int y) {
		int row = x / 2;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = row; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

	private static void revtriangle(int x, int y) {

		for (int i = x; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}
	}

	private static void triangle(int x) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
