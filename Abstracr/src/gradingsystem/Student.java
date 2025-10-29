package gradingsystem;

abstract class Student {
    double[] grades;

    Student(double[] grades) {
        this.grades = grades;
    }

    abstract double calculateAverage();
}