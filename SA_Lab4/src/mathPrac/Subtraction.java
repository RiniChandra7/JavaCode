package mathPrac;

public class Subtraction extends Problem {
	public Subtraction(int a, int b) {
		super.setterOp1(a);
		super.setterOp2(b);
	}

	@Override
	public int getAnswer() {
		// TODO Auto-generated method stub
		return (op1 - op2);
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return "- : This operator is for subtraction";
	}
}
