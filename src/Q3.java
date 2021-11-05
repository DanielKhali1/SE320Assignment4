import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Q3 {
	
	public static void main(String[] args) {
		System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(12345.678));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(12345.678));
		try {
			Number num = NumberFormat.getInstance().parse("1,2345.678");
			System.out.println(num.doubleValue());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
