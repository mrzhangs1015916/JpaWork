package com.zs.work.learnjpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "partment")
public class Partment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private int partid;
    @Column
    private String partname;

    public Partment() {
    }

    public Partment(int partid, String partname) {
        this.partid = partid;
        this.partname = partname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartid() {
        return partid;
    }

    public void setPartid(int partid) {
        this.partid = partid;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }
}
