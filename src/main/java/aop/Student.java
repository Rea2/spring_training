package aop;

public class Student {
    private String nameSurname;
    private int course;

    public Student(String nameSurname, int course, double averageScore) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.averageScore = averageScore;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    private double averageScore;

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", averageScore=" + averageScore +
                '}';
    }
}
