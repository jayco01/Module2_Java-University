package Lesson_5;

public class Patient implements HasPriority{
    public PatientPrio priority;
    public String name;
    public String illness;

    public Patient(PatientPrio priority, String name, String illness) {
        this.priority = priority;
        this.name = name;
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                ", illness='" + illness + '\'' +
                '}';
    }

    @Override
    public int getPriority() {
        return priority.ordinal();
    }
}
