package hospital_management_system;

public class Hospital extends DataBank {


    public Doctor getDoctor() { //get methodu ile cagirdik.
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    Doctor doctor = new Doctor();//doktor objesi olusturduk

        Patient patient = new Patient();// Patient objesi olusturduk

        public void setDoctor(Doctor docter) { // Burada Method olusturduk
            this.doctor = doctor; // Ayni Class icindeki constructur lari secmek icin, variable lari ve methodlari cagir
        }

        public void setPatient(Patient patient ) { //Patient methodu olusturduk
            this.patient = patient; // patient methodunu cagirdik
        }
    }

