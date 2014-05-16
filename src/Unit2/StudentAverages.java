package Unit2;

/**
 * Created by Alex on 16/05/2014.
 * activity 2.1
 */
public class StudentAverages {

    public static void studentAverages(String studentList[]	, int marksList[][]) {
        for (int i = 0; i < studentList.length; i++) {
            int total = 0;
            for (int j = 0; j < marksList[i].length; j++) {
                total += marksList[i][j];
            }
            double average = total / marksList[i].length;
            System.out.println(studentList[i] + " has an average mark of: " + average);
            if (average > 84) {
                System.out.println(studentList[i] + " is to be congratulated!");
            }
        }

    }

    public static void main(String[] args) {
        String[] students = {"Smith", "Jones", "Turing", "Bloggs", "Meyer", "Hampden"};
        int[][] allMarks = {{56, 24, 68, 72}, {24, 23, 18, 6}, {99, 98, 89, 90}, {15, 66, 27, 44}, {76, 99, 87, 21}, {14, 12, 55, 95}};
        studentAverages(students, allMarks);
    }

}