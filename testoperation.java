package opration;

public class testoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation_add oa = new operation_add();
		oa._NumberA=10;
		oa._NumberB=100;
		oa.Getresult();
		System.out.println(oa.Getresult());
		/*oa.Getresult(5,4);*/
		//ifoperation ifoperation  = new ifoperation();
		contrloperation contrloperation = new contrloperation() ;
		ifoperation ifoperation  = contrloperation.creatoperation("+");
		ifoperation.set_NumberA(10);
		ifoperation.set_NumberB(20);
		
		System.out.println(ifoperation.Getresult());
	}

}
