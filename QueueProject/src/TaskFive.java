public class TaskFive {

    double first;
    double second;
    double third;

    public TaskFive(double first, double second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public double getFirst() {return first;}

    public double getSecond() {return second;}

    public double getThird() {return third;}

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
