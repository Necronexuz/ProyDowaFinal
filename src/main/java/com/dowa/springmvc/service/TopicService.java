package com.dowa.springmvc.service;

import java.util.List;

import com.dowa.springmvc.model.Topics;
/**
 * Created by nexuz on 27/05/15.
 */
public interface TopicService {

    public void addTopic(Topics topic);

    public List<Topics> getTopics();

    public Topics getTopic(int id_topic);

    public void deleteTopic(int id_topic);
}
