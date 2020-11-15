//-----------------------------------------------------------------------
//defines assignment scores, calculates averages, and generates printout
//-----------------------------------------------------------------------
public class GradeAvg {
	public static void main(String[] args) {
		//defines 7 variables and generates scores
		double quizScore1, quizScore2, quizScore3, testScore1, testScore2, quizScoreAvg, testScoreAvg;
		quizScore1=99; quizScore2=86; quizScore3=82; testScore1=82; testScore2=90;
			
		//calculates mean quiz score and mean test score
		quizScoreAvg= (quizScore1+quizScore2+quizScore3)/3; 
		testScoreAvg=(testScore1+testScore2)/2;
		
		//prints values and averages
		System.out.println("quizScore1: "+ quizScore1); 
		System.out.println("quizScore2: "+ quizScore2); 
		System.out.println("quizScore3: "+ quizScore3); 
		System.out.println("---------------------");
		System.out.println("quizScoreAvg: " + quizScoreAvg +"%");
		System.out.println("_____________________________________ \n");
		//System.out.println(" ");
		System.out.println("testScore1: " + testScore1);
		System.out.println("testScore2: " + testScore2);
		System.out.println("---------------------");
		System.out.println("testScoreAvg: " + testScoreAvg+"%");
	}

}
