package com.mycompany.Practcal8;

class Doctor {
    String fullName;
    String specialization;
    int id;
    int shiftsPerMonth;
    boolean certification;

    public Doctor(String fullName, String specialization, int id, int shiftsPerMonth, boolean certification) {
        this.fullName = fullName;
        this.specialization = specialization;
        this.id = id;
        this.shiftsPerMonth = shiftsPerMonth;
        this.certification = certification;
    }

    @Override
    public String toString() {
        return fullName + ", " + specialization + ", " + id + ", " + shiftsPerMonth + ", " + certification;
    }
}
