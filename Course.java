public class Course {
    String courseName;
    double mark;
    int numberOfAssignments;
    String[] assignmentNames;
    double[] assignmentMarks;
    double[] assignmentWeights;

    public Course( String name , int numberOfAssignments){
        this.courseName = name;
        this.assignmentNames = new String[numberOfAssignments];
        this.assignmentMarks = new double[numberOfAssignments];
        this.assignmentWeights = new double[numberOfAssignments];
    }
    public Course() {
    }
    public void SetCourseName(String name){
        courseName = name;
    }
    public void  AddAssigmentName(String name ){
        
    }
    public void SetAssignment(int index, String name, double weight, double mark) {
        this.assignmentNames[index] = name;
        this.assignmentMarks[index] = mark;
        this.assignmentWeights[index] = weight;
    }
    public double CalculateWeightAverage() {
        double totalMarkandWeight = 0.0;
        for(int i = 0 ; i < numberOfAssignments ; i ++ ){
            totalMarkandWeight += assignmentMarks[i] * assignmentWeights[i];
        }
        double totalWeights = 0.0;
        for(int i = 0 ; i < numberOfAssignments ; i ++ ){
            totalWeights += assignmentWeights[i];
        }
        return totalMarkandWeight/totalWeights;
    }
    public void SetNumberOfAssignments(int lengthAssignment) {
        numberOfAssignments = lengthAssignment;
        this.assignmentNames = new String[lengthAssignment];
        this.assignmentMarks = new double[lengthAssignment];
        this.assignmentWeights = new double[lengthAssignment];
    }

}
