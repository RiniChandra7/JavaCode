package mathPrac;

public abstract class Problem {
	int op1;
	int op2;
	
	public Problem() {
		op1 = 0;
		op2 = 0;
	}

	public abstract int getAnswer();
	
	public abstract String getOperator();
	
	public int getterOp1() {
		return op1;
	}
	
	public int getterOp2() {
		return op2;
	}
	
	public void setterOp1(int a) {
		op1 = a;
	}
	
	public void setterOp2(int b) {
		op2 = b;
	}
}
