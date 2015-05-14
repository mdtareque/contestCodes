package tc.srm6xx;

/**
 * @author mtk
 *
 */
public class SRM653Div2_250_CountryGroup {
	public static void main(String[] args) {
		int ans=0;
		int[] arr1 = {1,1,1,1,1};	
		int[] arr2 = {4,4,4,4,1,1,2,2,3,3,3}; 
		int[] arr3 = { 2, 1, 2, 2, 1, 2 };
		CountryGroup c = new CountryGroup();
		assert c.solve(arr1) == 5 : "test case 1 Not correct";
		assert (ans = c.solve(arr2)) == 5 : "test case 2 Not correct "+ ans;
		assert c.solve(arr3) == -1 : "test case 3 Not correct";

	}
}

// DONE
class CountryGroup {
	public int solve(int[] a) {
		int distinctCountries = 0;
		for(int i=0; i<a.length;) {
			int runTo = a[i];
			for(int j=0; j<runTo; j++) {
				if(i+j >= a.length) return -1;
				if(a[i+j] != runTo) return -1;
			}
			i+=runTo;
			distinctCountries++;
		}
		return distinctCountries;
	}
}

//Wrong: this solution was computing totalNumberOfPeople of each country and verifying the count
//incorrect as this doesn't take into account that they should sit together
class CountryGroup3 {
	int solve(int[] a) {
		int[] map = new int[102];
		int numberOfPeople = 0;
		for (int i = 0; i < a.length; i++) {
			map[a[i]]++;
			numberOfPeople += a[i];
		}
		int distinctCountries=0;
		for (int i = 1; i < map.length; i++) {
			numberOfPeople = numberOfPeople - map[i]*i;
			if(i == 1 && map[i] != 0) distinctCountries += map[i];
			else if(map[i] != 0) distinctCountries += map[i]/i;
		}
		if(numberOfPeople == 0) { 
			return distinctCountries;
		} else {
			return -1; 
		}
		
	}
}


// Wrong: this solution was creating hashset of numberOfPeople of each country and verifying the count
// incorrect approach
class CountryGroup2 {
	int solve(int[] a) {
		int[] map = new int[100];
		for (int i = 0; i < a.length; i++) {
			map[a[i]]++;
		}
		boolean allGood = true;
		int distinctCountries = 0;
		for (int i = 0; i < map.length; i++) {
			if (map[i] == i) {
				allGood = true;
				distinctCountries++;
			} else {
				allGood = false;
				break;
			}
		}
		if (allGood)
			return distinctCountries;
		else
			return -1;

	}

}