package sample4;

public class CalcImpl implements Calc {

	private int su1;
	private int su2;

	// setter���� injection
	public void setSu1(int su1) {
		this.su1 = su1;
	}

	// ������ ���� injection
	public CalcImpl(int su2) {
		this.su2 = su2;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("����:" + (su1 + su2));
		System.out.println("����:" + (su1 - su2));
		System.out.println("����:" + (su1 * su2));
		System.out.println("������:" + (su1 / su2));
		System.out.println("������:" + (su1 % su2));
	}

}
