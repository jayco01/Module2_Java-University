package Lesson_5;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> patientQueue = new ArrayPriorityQueue<>( Patient.class,10);

        patientQueue.put(new Patient(PatientPrio.LOW, "John", "HeadAche"));
        patientQueue.put(new Patient(PatientPrio.LOW, "Maya", "Dizziness"));
        patientQueue.put(new Patient(PatientPrio.MEDIUM, "Michael", "Dislocated Shoulder"));
        patientQueue.put(new Patient(PatientPrio.LOW, "Deebo", "Foot Fungus"));
        patientQueue.put(new Patient(PatientPrio.HIGH, "Anna", "Broken leg"));
        patientQueue.put(new Patient(PatientPrio.MEDIUM, "Melo", "Nose Bleed"));


        System.out.println(patientQueue.toString());
        System.out.println("The number of patients in the Queue is: " + patientQueue.size());
        System.out.println("The hospital capacity is: " + patientQueue.getCapacity());
        System.out.println();

        System.out.println(patientQueue.pop());
        System.out.println(patientQueue.pop());
        System.out.println(patientQueue.pop());

        patientQueue.put(new Patient(PatientPrio.HIGH, "Jericho", "Gun shoot Wound"));

        System.out.println(patientQueue.pop());
        System.out.println(patientQueue.pop());
        System.out.println();

        System.out.println("The number of patients in the Queue is: " + patientQueue.size());
        System.out.println("The hospital capacity is: " + patientQueue.getCapacity());

    }
}
