package com.mycompany.Practcal8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Practcal8 {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Sergeev Sergei Swrgeevich", "therapist", 345, 15, true));
        doctors.add(new Doctor("Ivanov Ivan Ivanovich", "surgeon", 5, 20, true));
        doctors.add(new Doctor("Fedorov Fedor Fedorovich", "ophthalmologist", 65, 10, false));

        while (true) {
            System.out.println("Select an action:");
            System.out.println("1 - Add a new doctor");
            System.out.println("2 - Change certification status");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the full name of the new doctor:");
                    scanner.nextLine();
                    String fullName = scanner.nextLine();
                    System.out.println("Enter specialization:");
                    String specialization = scanner.nextLine();
                    System.out.println("Enter ID number:");
                    int id = scanner.nextInt();
                    System.out.println("Enter number of shifts per month:");
                    int shiftsPerMonth = scanner.nextInt();
                    System.out.println("Enter certification status (true/false):");
                    boolean certification = scanner.nextBoolean();

                    Doctor newDoctor = new Doctor(fullName, specialization, id, shiftsPerMonth, certification);

                    boolean doctorExists = false;
                    for (Doctor doc : doctors) {
                        if (doc.id == newDoctor.id) {
                            doctorExists = true;
                            break;
                        }
                    }

                    if (doctorExists) {
                        System.out.println("Doctor with this ID already exists!");
                    } else {
                        doctors.add(newDoctor);
                    }
                }

                case 2 -> {
                    System.out.println("Enter the ID of the doctor to change certification status:");
                    int idToChange = scanner.nextInt();

                    for (Doctor doctor : doctors) {
                        if (doctor.id == idToChange) {
                            doctor.certification = !doctor.certification;
                            break;
                        }
                    }
                }
            }
            
            doctors.sort(Comparator.comparing(doctor -> doctor.fullName));

            System.out.println("Current contents of the doctors list:");
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }
}
