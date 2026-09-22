package OOPS;

public class Designed {

        private String name;
        private int rollNo;
        private double marks;


        Designed(String name , int rollNo , double marks){
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public double getMarks() {
            return marks;
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }

}
