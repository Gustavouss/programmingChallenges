import java.lang.System.out;
class calcComposto{
	public static void main(String[] args) {
		double principal = 1;
		for (int i=1;i<52;i++){
				principal=principal*1.01;
		}
		System.out.prinln(principal);
	}
}
