package gradingsystem;

class GradeCalculator extends Student {
    GradeCalculator(double[] grades) {
        super(grades);
    }

    @Override
    double calculateAverage() {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }
}
