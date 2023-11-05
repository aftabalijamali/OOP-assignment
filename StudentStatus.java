public class StudentStatus {
    public static void main(String[] args) {
        String studentData = "Shakeel:85, Basit:91, Manzoor:76, Aftab:96, Raza:88, Kamran:79, Sajjad:90, Farhan:66, Furkan:91, Wasif:71";

        // Split the student data into individual records
        String[] studentRecords = studentData.split(", ");
        
        // Arrays to store names and scores
        String[] studentNames = new String[studentRecords.length];
        int[] studentScores = new int[studentRecords.length];
        
        // Populate arrays and calculate statistics
        int totalStudents = studentRecords.length;
        int totalScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        String highestScorer = "";
        String lowestScorer = "";

        for (int i = 0; i < studentRecords.length; i++) {
            String[] record = studentRecords[i].split(":");
            studentNames[i] = record[0];
            studentScores[i] = Integer.parseInt(record[1]);

            totalScore += studentScores[i];

            if (studentScores[i] > highestScore) {
                highestScore = studentScores[i];
                highestScorer = studentNames[i];
            }

            if (studentScores[i] < lowestScore) {
                lowestScore = studentScores[i];
                lowestScorer = studentNames[i];
            }
        }

        // Calculate average score
        double averageScore = (double) totalScore / totalStudents;

        // Display statistics
System.out.println("*****-*****-*****-*****");
System.out.println("*****-Status of All Students-*****");
System.out.println("*****-*****-*****-*****");
        System.out.println("Total number of students: " + totalStudents);
System.out.println("*****-*****-*****-*****");
        System.out.println("Average score of all students: " + averageScore);
System.out.println("*****-*****-*****-*****");
        System.out.println("Highest score: " + highestScore + " by " + highestScorer);
System.out.println("*****-*****-*****-*****");
        System.out.println("Lowest score: " + lowestScore + " by " + lowestScorer);
System.out.println("*****-*****-*****-*****");
    }
}