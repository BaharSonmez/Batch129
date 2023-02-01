package hospital_management_system;



    public class Patient extends DataBank {


        private String name;
        private String surName;
        private int patientID;


        public Patient() {

        }

        public Patient(String name, String surName, int patientID) {
            this.name = name;
            this.surName = surName;
            this.patientID = patientID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public int getPatientID() {
            return patientID;
        }

        public void setPatientID(int patientID) {
            this.patientID = patientID;
        }


        @Override
        public String toString() {
            return "Patient{" +
                    "name='" + name + '\'' +
                    ", surName='" + surName + '\'' +
                    ", patientID=" + patientID +
                    '}';


        }
    }