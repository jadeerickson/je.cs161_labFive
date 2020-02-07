class Person{

    
    private String firstName;
    private String lastName;
    private int age;

   public Person(String fN, String lN, int a){
       setfirstName(fN);
       setlastName(lN);
       setAge(a);
    }

    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
    this.firstName = firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age = a;
    }
    public String getName(){
        return getfirstName() + " " + getlastName();
    }
    public String getInfo(){
        return getName() + " " + getAge();
    }
}