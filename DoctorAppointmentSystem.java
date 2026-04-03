   import java.util.ArrayList; 
    import java.util.List; 
    import java.util.Scanner; 
    // Main Class 
    public class DoctorAppointmentSystem { 
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    BookingSystem system = new BookingSystem(); 
    // Adding some doctors with availability 
    system.addDoctor(new Doctor(1, "Ramesh", "Cardiologist", "Monday to Friday 10 AM - 5 PM")); 
    system.addDoctor(new Doctor(2, "Kiran", "Dermatologist", "Monday, Wednesday, Friday 1 PM - 6 PM")); 
    system.addDoctor(new Doctor(3, "Sahasra", "Gynecologist", "saturday 2 PM - 6 PM")); 
    // Adding some patients 
    system.addPatient(new Patient(1, "Manish", 30)); 
    system.addPatient(new Patient(2, "Srilochana", 25)); 
    system.addPatient(new Patient(3, "Divya", 20)); 
    while (true) { 
    System.out.println("\n--- Doctor Appointment Booking System ---"); 
    System.out.println("1. List Doctors"); 
    System.out.println("2. Book Appointment"); 
    System.out.println("3. View Appointments"); 
    System.out.println("4. Exit"); 
    System.out.print("Choose an option: "); 
    int choice = scanner.nextInt(); 
    scanner.nextLine(); // Consume newline 
    switch (choice) { 
    case 1: 
    system.listDoctors(); 
    break; 
    case 2: 
    System.out.print("Enter Doctor ID: "); 
    int doctorId = scanner.nextInt(); 
    System.out.print("Enter Patient ID: "); 
    int patientId = scanner.nextInt(); 
    scanner.nextLine(); // Consume newline 
    System.out.print("Enter Date (YYYY-MM-DD): "); 
    String date = scanner.nextLine(); 
    System.out.print("Enter Time (e.g., 10:00 AM): "); 
    String time = scanner.nextLine(); 
    String result = system.bookAppointment(doctorId, patientId, date, time); 
    System.out.println(result); 
    break; 
    case 3: 
    system.viewAppointments(); 
    break; 
    case 4: 
    System.out.println("Thank you for using the system!"); 
    scanner.close(); 
    System.exit(0); 
    default: 
    System.out.println("Invalid option. Please try again."); 
    } 
    } 
    } 
    } 
    // Doctor class with availability 
    class Doctor { 
    private int doctorId; 
    private String name; 
    private String specialization; 
    private String availability;  // NEW FIELD 
    public Doctor(int doctorId, String name, String specialization, String availability) { 
    this.doctorId = doctorId; 
    this.name = name; 
    this.specialization = specialization; 
    this.availability = availability; 
    } 
    public int getDoctorId() { 
    return doctorId; 
    } 
    public String getName() { 
    return name; 
    } 
    public String getSpecialization() { 
    return specialization; 
    } 
    public String getAvailability() { 
    return availability; 
    } 
    @Override 
    public String toString() { 
    return "Dr. " + name + " (" + specialization + ") - Available: " + availability; 
    } 
    } 
    // Patient class 
    class Patient { 
    private int patientId; 
    private String name; 
    private int age; 
    public Patient(int patientId, String name, int age) { 
    this.patientId = patientId; 
    this.name = name; 
    this.age = age; 
    } 
    public int getPatientId() { 
    return patientId; 
    } 
    public String getName() { 
    return name; 
    } 
    public int getAge() { 
    return age; 
    } 
    @Override 
    public String toString() { 
    return name + ", " + age + " years old"; 
    } 
    } 
    // Appointment class 
    class Appointment { 
    private int appointmentId; 
    private Doctor doctor; 
    private Patient patient; 
    private String date; 
    private String time; 
    public Appointment(int appointmentId, Doctor doctor, Patient patient, String date, String time) { 
    this.appointmentId = appointmentId; 
    this.doctor = doctor; 
    this.patient = patient; 
    this.date = date; 
    this.time = time; 
    } 
    @Override 
    public String toString() { 
    return "Appointment ID: " + appointmentId + "\nDoctor: " + doctor + "\nPatient: " + patient + 
    "\nDate: " + date + " at " + time; 
    } 
    } 
    // BookingSystem class 
    class BookingSystem { 
    private List<Doctor> doctors = new ArrayList<>(); 
    private List<Patient> patients = new ArrayList<>(); 
    private List<Appointment> appointments = new ArrayList<>(); 
    public void addDoctor(Doctor doctor) { 
    doctors.add(doctor); 
    } 
    public void addPatient(Patient patient) { 
    patients.add(patient); 
    } 
    public void listDoctors() { 
    System.out.println("\nAvailable Doctors:"); 
    for (Doctor doctor : doctors) { 
    System.out.println("ID: " + doctor.getDoctorId() + " - " + doctor); 
    } 
    } 
    public String bookAppointment(int doctorId, int patientId, String date, String time) { 
    Doctor doctor = null; 
    for (Doctor d : doctors) { 
    if (d.getDoctorId() == doctorId) { 
    doctor = d; 
    break; 
    } 
    } 
    Patient patient = null; 
    for (Patient p : patients) { 
    if (p.getPatientId() == patientId) { 
    patient = p; 
    break; 
    } 
    } 
    if (doctor == null) { 
    return "Doctor not found!"; 
    } 
    if (patient == null) { 
    return "Patient not found!"; 
    } 
    int appointmentId = appointments.size() + 1; 
    Appointment appointment = new Appointment(appointmentId, doctor, patient, date, time); 
     
    appointments.add(appointment); 
    return "Appointment booked successfully!\n" +appointment; 
    }
    public void viewAppointments() { 
    if (appointments.isEmpty()) { 
    System.out.println("No appointments booked yet."); 
    return; 
    } 
    for (Appointment appointment : appointments) { 
    System.out.println(appointment); 
    System.out.println("----------------------------------"); 
    } 
    } 
    } 



