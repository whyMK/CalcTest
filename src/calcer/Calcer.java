package calcer;

public class Calcer {
	private int a;
	private int b;

	public Calcer(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {// вычисляет сумму двух чисел
		return 0;
	}

	public int subtract() {// отнимает от первого числа второе
		return 0;
	}

	public int mult() {// перемножает два числа
		return 0;
	}

	public int divide() {// считает a/b
		// результат округляется до целого
		return 0;
	}

	public int power() {// возводит a в степень b
		return 0;
	}

	public int min() {// возвращает минимальное из двух чисел
		return 0;
	}

	public int max() {// возвращает максимальное из двух чисел
		return 0;
	}

	public int middle() {// считает среднее двух чисел
		// результат округляется до целого
		return 0;
	}

	public int distance() {// вычисляет эвклидово расстояние-sqrt(x^2+y^2)
		// результат округляется до целого (int) Math.sqrt(a*a+b*b);
		return (int) Math.sqrt(a*a+b*b);
	}
        public int func2a2b() {
            return (int) 2*a+2*b;
        }

	public static void main(String[] args) {
            System.out.println(new Calcer(1,2).func2a2b());
	}
}