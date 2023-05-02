class Emp{
    int e_Id;
    String e_Name;
    int e_Salary;
    static String e_Company="Tcs";
    public static void main(String[] args){
        Emp e1 =new Emp();
        Emp e2 =new Emp();
        Emp e3 =new Emp();

        e1.e_Id=101;
         e2.e_Id=102;
         e3.e_Id=103;

        e1.e_Name="Daniel";
        e2.e_Name="Ajay";
        e3.e_Name="Nayak";

        e1.e_Salary=90000;
        e2.e_Salary=85000;
        e3.e_Salary=80000;

        System.out.println(e1.e_Id);
        System.out.println(e2.e_Id);
        System.out.println(e3.e_Id);

        System.out.println(e1.e_Name);
        System.out.println(e2.e_Name);
        System.out.println(e3.e_Name);


        System.out.println(e1.e_Salary);
        System.out.println(e2.e_Salary);
        System.out.println(e3.e_Salary);

        System.out.println(e3.e_Company);
        System.out.println(e3.e_Company);
        System.out.println(e3.e_Company);



    }
}