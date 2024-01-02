
public class Test {

	public static void main(String[] args) {
		
		Guitar num1, num2, num3;
		
		num1 = new Guitar();
		num2 = new MyGuitar();
		num3 = new OtherGuitar();
		
		num1.produceSound();
		num2.produceSound();
		num3.produceSound();

	}

}
