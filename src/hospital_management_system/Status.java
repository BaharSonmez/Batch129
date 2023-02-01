package hospital_management_system;


    public class Status extends Patient {
        private String currentStatus;

        private String urgency;

        public Status(String isim, String soyIsim, int hastaID, String currentStatus, String urgency) {
            super(isim, soyIsim, hastaID);
            this.currentStatus = currentStatus;
            this.urgency = urgency;

        }

        public String getCurrentStatus() {
            return currentStatus;
        }

        public void setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
        }

        public String getUrgency() {
            return urgency;
        }

        public void setUrgency(String urgency) {
            this.urgency = urgency;
        }
    }

