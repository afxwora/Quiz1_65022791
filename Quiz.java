public class Quiz {
    
    public static void main(String[] args) {
        Student student1 = new Student(65022791,"Spidy",2020,3.5);

      
        student1.showDetails();

        student1.UpdateName("Woramet");
        student1.UpdateID(6527456);

         student1.showDetails();
        
        
        
    }
}
  class Student{
     private int ID;
     private String Name;
     private int AdmissionYear;
     private double GPA;

     public  Student(int ID,String Name, int AdmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AdmissionYear = AdmissionYear;
        this.GPA = GPA;
     }
    

    public void showDetails() {
        System.out.println("ID : " + this.ID);
        System.out.println("Name :" + this.Name);
        System.out.println("AdmissionYear : " + this.AdmissionYear);
        System.out.println("GPA :" + this.GPA);
        
        }

    public void UpdateName(String newName) {
        this.Name = newName;
    }
     public void UpdateID(int newID) {
        this.ID = newID;
    }


    
    
 }


