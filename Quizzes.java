import java.util.stream.*;

public class Quizzes {
    public int[] getScores(int[] scoresArray, String dayOfWeek){
       // Complete Part A
       int [] result = new int[scoresArray.length / 5];
       int increment = 0;
        // result = [0, 0, 0, 0, 0, 0]
        for (int i = 0; i < result.length; i++){
            switch(dayOfWeek){
                case "Monday":
                    result[i] = scoresArray[increment];
                    increment = increment + 5;
                    break;
                case "Tuesday":
                    result[i] = scoresArray[increment + 1];
                    increment = increment + 5;
                    break;
                case "Wednesday":
                    result[i] = scoresArray[increment + 2];
                    increment = increment + 5;
                    break;
                case "Thursday":
                    result[i] = scoresArray[increment + 3];
                    increment = increment + 5;
                    break;
                case "Friday":
                    result[i] = scoresArray[increment + 4];
                    increment = increment + 5;
                    break;
                default:
                    System.out.println("no match");
            } 
        }
        return result;
    }


    public String bestDay(int[] scoresArray){
       // Complete Part B
       
        double length = getScores(scoresArray, "Monday").length; // 6
        double avgMonday = IntStream.of(getScores(scoresArray, "Monday")).sum() / length;
        double avgTuesday = IntStream.of(getScores(scoresArray, "Tuesday")).sum() / length;
        double avgWednesday = IntStream.of(getScores(scoresArray, "Wednesday")).sum() / length;       
        double avgThursday = IntStream.of(getScores(scoresArray, "Thursday")).sum() / length;
        double avgFriday = IntStream.of(getScores(scoresArray, "Friday")).sum() / length;

        double [] avgScores = {avgMonday, avgTuesday, avgWednesday, avgThursday, avgFriday};
        double maxScore = avgScores[0];

        for (int i = 1; i < avgScores.length; i++){
            if (avgScores[i] > maxScore){
                maxScore = avgScores[i];
            }
        }
        if (maxScore == avgMonday){
            return "Monday";
        }
        else if (maxScore == avgTuesday){
            return "Tuesday";
        }
        else if (maxScore == avgWednesday){
            return "Wednesday";
        }
        else if (maxScore == avgThursday){
            return "Thursday";
        }
        else {
            return "Friday";
        }
       
         
    }

}
 