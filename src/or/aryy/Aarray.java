package or.aryy;

public class Aarray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,};
		int count=0;
	for(int n=0;n<=a.length;n++) {
	count=count+n;
	}
	System.out.println("the total sum is : " +count);
	if(count>0) {
	float num=0f;
	num=count/a.length;
System.out.println("the total average is " +num);
}
else
	System.out.println("no correct value");
	}

}