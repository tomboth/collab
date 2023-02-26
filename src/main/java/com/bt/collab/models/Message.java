package com.bt.collab.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
    @Column(length = 30)
    private String user;
    public String comment;
    public Long timeStamp;

}
