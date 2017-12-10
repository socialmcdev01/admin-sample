package com.socialmc.adminsample.service.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "news")
@Getter @Setter
public class News implements Serializable {

    public News() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;
    private String title;
    @Column(name="url", columnDefinition="CLOB NOT NULL")
    @Lob 
    private String url;

}
