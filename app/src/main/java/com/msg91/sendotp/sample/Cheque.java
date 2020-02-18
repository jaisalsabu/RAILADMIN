package com.msg91.sendotp.sample;

public class Cheque {

    private String id;
    private String trackid;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String nos;
    private String trainno;
    private String trainname;
    private String source;
    private String destination;
    private String deptdate;
    private String cost;





    public Cheque(String id,String trackid,String name,String phone,String email,String address,String nos,String trainno,String trainname,String source,String destination,String deptdate,String cost) {

        this.id = id;
        this.trackid = trackid;
        this.name= name;
        this.phone = phone;
        this.email = email;
        this.address= address;
        this.nos = nos;
        this.trainno = trainno;
        this.trainname= trainname;
        this.source = source;
        this.destination = destination;
        this.deptdate= deptdate;
        this.cost= cost;


    }

    public Cheque() {
    }

    public String getid()
    {
        return id;
    }
    public String gettrackid() {
        return trackid;
    }
    public String getname() {
        return name;
    }
    public String getphone() {
        return phone;
    }
    public String getemail() {
        return email;
    }
    public String getaddress() {
        return address;
    }
    public String getnos() {
        return nos;
    }
    public String gettrainno() {
        return trackid;
    }
    public String gettrainname() {
        return trainname;
    }
    public String getsource() {
        return source;
    }
    public String getdestination() {
        return destination;
    }
    public String getdeptdate() {
        return deptdate;
    }
    public String getcost() {
        return cost;
    }
    }
