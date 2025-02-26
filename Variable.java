//3 types of variables : local, instance and static
// local : declared inside the method of the class
//instance : declared outside method but inside class , instance-specific and is not shared among instances.
//static : shared among all instances of the class.
class  College {

    //static
    static String Cname;
        
    }
     
    public class Variable {
        
        //instance var
        public int age = 19;
        public String name ;
    
        public Variable(String Name)
        {
            this.name = Name;
        }
    
        public static void main(String[] args) {
            //local var
            float gpa = 8.3f;
            System.out.println("GPA : " + gpa);
            
            Variable s1 =new Variable("Leo");
            Variable s2 =new Variable("Lakshmi");
    
            System.out.println("Name : " + s1.name + " || Age : " + s1.age);
            System.out.println("Name : " + s2.name + " || Age :" + s2.age);
    
            College s3 = new College();
            College s4 = new College();
            s3.Cname = "JPR";
        s4.Cname = "KSR";
        College.Cname = "SRM";
        System.out.println("S3 : "+s3.Cname + "  , S4: "+s4.Cname);
    }
}
