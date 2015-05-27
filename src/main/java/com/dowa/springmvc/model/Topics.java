package com.dowa.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by nexuz on 27/05/15.
 */
@Entity
@Table(name = "topics")
public class Topics {
    @Id
    @Column(name = "id_topic")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_topic;

    @Column(name = "topic")
    private String topic;

    public int getId_topic() {
        return id_topic;
    }

    public void setId_topic(int id_topic) {
        this.id_topic = id_topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
