package com.rushi.javaassignment;
import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    int severity;
    long arrivalTime;

    String name;

    public Patient(String name, int severity, long arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class EmergencyPatientTracker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PriorityQueue<Patient> patientQueue = new PriorityQueue<>(5, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.severity != p2.severity) {
                    return Integer.compare(p1.severity, p2.severity); // lower severity = higher priority
                } else {
                    return Long.compare(p1.arrivalTime, p2.arrivalTime); // earlier = higher priority
                }
            }
        });

        // Add patients
        addPatient(patientQueue, new Patient("Alice", 3, System.currentTimeMillis()));
        Thread.sleep(100); // simulate time gap
        addPatient(patientQueue, new Patient("Bob", 2, System.currentTimeMillis()));
        Thread.sleep(100);
        addPatient(patientQueue, new Patient("Charlie", 2, System.currentTimeMillis()));
        Thread.sleep(100);
        addPatient(patientQueue, new Patient("Diana", 1, System.currentTimeMillis()));
        Thread.sleep(100);
        addPatient(patientQueue, new Patient("Ethan", 4, System.currentTimeMillis()));

        // Try to add when full
        addPatient(patientQueue, new Patient("Frank", 1, System.currentTimeMillis())); // Should be rejected

        System.out.println("\n--- Treating patients ---");
        while (!patientQueue.isEmpty()) {
            Patient p = patientQueue.poll();
            System.out.println("Treated: " + p);
        }
    }

    static void addPatient(PriorityQueue<Patient> queue, Patient patient) {
        if (queue.size() >= 5) {
            System.out.println("Queue full. Cannot add: " + patient);
        } else {
            queue.offer(patient);
            System.out.println("Added: " + patient);
        }
    }

    static class Patient {
        int severity;
        long arrivalTime;
        String name;

        public Patient(String name, int severity, long arrivalTime) {
            this.name = name;
            this.severity = severity;
            this.arrivalTime = arrivalTime;
        }

        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }

}
