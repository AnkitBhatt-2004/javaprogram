public class thisdemo {
    private int empid;
    public void setdata(int emp_id){
        empid=emp_id;
    }
    public int showdata(){
        System.out.println(empid);
    }
}
class emcapsule extends thisdemo{

    public static void main(String aargs) {
        thisdemo t=new thisdemo();
        
    }   
    
}
