package Seção10.HostelArrays;

public class HostelMembers {
    public String name;
    public String email;
    public int room;
    public HostelMembers(String name, String email, int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getRoom(){
        return room;
    }
    public String toString(){
        return getRoom() + ": " + getName() + ", " + getEmail();
    }

}
