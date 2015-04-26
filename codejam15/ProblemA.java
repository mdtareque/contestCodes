package codejam15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * Run As:
D:\GitHub\ws\codejam15\bin>dir
 Volume in drive D is soft
 Volume Serial Number is E44C-3F19

 Directory of D:\GitHub\ws\codejam15\bin

04/11/2015  11:56 PM    <DIR>          .
04/11/2015  11:56 PM    <DIR>          ..
04/11/2015  11:56 PM    <DIR>          codejam15
               0 File(s)              0 bytes
               3 Dir(s)   2,230,636,544 bytes free

D:\GitHub\ws\codejam15\bin>java codejam15.ProblemA < ..\pa.in.small.txt > ..\pa.out.small

 */

/**
 *  @author mtk - Mohammed Tareque Khan
 *  
 *  Algo description:
 *  if number of people for next shynesslevel is not zero then:
 *     if totalStandingPeopleYet >= next shynessLevel
 *     then: 
 *         All good, carry on, no friend to add
 *     else
 *         add next-shynesslevel - totalStandingPeopleYet number of friend
 *         so that they trigger the next shyness level people to stand up
 *         as the goal is to achieve a complete standing ovation
 *  
 * */
public class ProblemA {
	int smax;
	int friendsAdded;
	int totalStandingYet;
	String numOfPeopleAtShynessLevels;
	
	public ProblemA() {
		numOfPeopleAtShynessLevels="";
		smax=0;
		totalStandingYet=0;
		friendsAdded=0;
		
	}
	public static void main(String[] args) throws IOException {
//		System.out.println("here");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int caseNo = 1, T = Integer.parseInt(br.readLine());
//		System.out.println("T is " + T);
		
		while(caseNo <= T ){
			ProblemA probA = new ProblemA();
			s = br.readLine();
//			System.out.println(s);
			probA.smax = Integer.parseInt(s.split(" ")[0]);
			probA.numOfPeopleAtShynessLevels = s.split(" ")[1];
			
			probA.totalStandingYet=Integer.parseInt(probA.numOfPeopleAtShynessLevels.charAt(0) + "");
			for(int i=1; i <= probA.smax; i++) {
				int numberOfPeopleAtNextShynessLevel = probA.getNumberOfPeopleAtShynessLevel(i);
				if(numberOfPeopleAtNextShynessLevel != 0) {
//					System.out.println("Number of people at next level is " + numberOfPeopleAtNextShynessLevel);
					if(probA.totalStandingYet >= i) {
						probA.totalStandingYet += numberOfPeopleAtNextShynessLevel ;
					} else {
						int friendsToAdd = i - probA.totalStandingYet;
						probA.friendsAdded  += friendsToAdd;
						probA.totalStandingYet += numberOfPeopleAtNextShynessLevel  + friendsToAdd;
					}
				}
			}
			System.out.println("Case #" + caseNo++ +": " + probA.friendsAdded);
		}
	}
	int getNumberOfPeopleAtShynessLevel(int i) {
		return Integer.parseInt(this.numOfPeopleAtShynessLevels.charAt(i) + "");
	}
}
