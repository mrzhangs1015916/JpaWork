package com.zs.work.learnjpa.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;

@Entity
@Table(name = "userinfo")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private int partid;
    @Transient
    private String partname;
    public User(){

    }
    public User(String name, int age, int partid, String partName) {
        this.name = name;
        this.age = age;
        this.partid = partid;
        this.partname = partName;
    }
    public User(User u ,Partment partname){
        this.id=u.id;
        this.age=u.age;
        this.name=u.name;
        this.partid=u.partid;
        this.partname=partname.getPartname();
    }

    public String getPartName() {
        return partname;
    }

    public void setPartName(String partName) {
        this.partname = partName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPartid() {
        return partid;
    }

    public void setPartid(int partid) {
        this.partid = partid;
    }
}
