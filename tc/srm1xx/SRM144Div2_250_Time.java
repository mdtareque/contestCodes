package tc.srm1xx;

/**
 * @author mtk
 *
 */
public class SRM144Div2_250_Time {

	public static void main(String[] args) {
		System.out.println(new Time().whatTime(5436));
		assert new Time().whatTime(5436).equals("1:30:36") : "Not correct";
	}
}

class Time  {
	  public String whatTime(int secs) {
			int hours = secs/60/60;
			int mins = (secs - hours*60*60)/60;
			int sec = secs - hours*60*60 - mins*60;
			return (hours>0?hours:0)+":"+(mins>0?mins:0)+":"+(sec>0?sec:0);
	  }
	}