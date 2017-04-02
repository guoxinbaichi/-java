package opration;

public class contrloperation {
	private  ifoperation ifoperation;
	public  ifoperation creatoperation(String operate){
			
			switch (operate) {
			case "+":
				ifoperation = new operation_add();
				break;

			default:
				break;
			}
		return ifoperation;
	}
}
