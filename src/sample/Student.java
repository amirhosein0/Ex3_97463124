package sample;

public class Student {
    private String fname,lname,sid;

    public Student(String fname, String lname, String sid) {
        this.fname = fname;
        this.lname = lname;
        this.sid = sid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
