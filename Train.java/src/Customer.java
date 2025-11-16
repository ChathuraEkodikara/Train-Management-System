public class Customer {
    //---------Attribute declarations--------------
    private String DepartureStation;
    private String ArrivalStation;
    private int Passenger;
    private String IdName;
    private String DepartureDate;
    private String ReturnDate;
    private String Services;

    //---------Methods declarations--------------
    public Customer(String DepartureStation, String ArrivalStation, int Passenger,String IdName, String DepartureDate, String ReturnDate){
        this.DepartureStation=DepartureStation;
        this.ArrivalStation=ArrivalStation;
        this.Passenger=Passenger;
        this.IdName=IdName;
        this.DepartureDate=DepartureDate;
        this.ReturnDate=ReturnDate;
    }
    public void setDepartureStation(String DepartureStation){
        this.DepartureStation=DepartureStation;
    }
    public void setArrivalStation(String ArrivalStation){
        this.ArrivalStation=ArrivalStation;
    }
    public void setPassenger(int Passenger){
        this.Passenger=Passenger;
    }
    public void setIdName(String IdName){
        this.IdName=IdName;
    }
    public void DepartureDate(String DepartureDate){
        this.DepartureDate=DepartureDate;
    }
    public void ReturnDate(String ReturnDate){
        this.ReturnDate=ReturnDate;
    }
    public void printCustomerDetails(){
        System.out.println("["+DepartureStation+","+ArrivalStation+","+Passenger+","+IdName+","+DepartureDate+","+ReturnDate+"]");
    }
    public String getDepartureStation(){
        return this.DepartureStation; //return id;
    }
    public String getArrivalStation(){
        return this.ArrivalStation;
    }
    public int getPassenger(){
        return this.Passenger;
    }
    public String getIdName(){
        return this.IdName;
    }
    public String getDepartureDate(){
        return this.DepartureDate;
    }
    public String getReturnDate(){
        return this.ReturnDate;
    }
    public String getCustomerDetails(){
        return "["+DepartureStation+","+ArrivalStation+","+Passenger+","+DepartureDate+","+ReturnDate+"]";
    }
}
