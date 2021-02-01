/**
 * Pet
 */
public class Pet {

    private String name;
    private int age;
    private String LOCATION;
    private String type;


    public Pet() {
        name = "";
        age = 0;
        LOCATION = "";
        type = "";

    }

    public Pet(String name, int age, String LOCATION, String type) {
        this.name = name;
        this.age = age;
        this.LOCATION = LOCATION;

    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }
}
    class vacation {
        private String destination;
        private String accomodation;
        private int cost;

        public vacation() {

            destination = "";
            accomodation = "";
            cost = 4000;

        }

        public vacation(String destination, int cost) {
        }

        public String getDestination() {
            return destination;

        }

        public String getAccomodation() {
            return accomodation;
        }

        public int getCost() {
            return cost;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public void setAccomodation(String accomodation) {
            this.accomodation = accomodation;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return destination + "" + accomodation + "" + cost ;
        }


        public boolean isNewVacation() {
            return cost >= 4000;
        }


        }

    
