package com.dowa.springmvc.dao;

import com.dowa.springmvc.model.Topics;

import java.util.List;

/**
 * Created by nexuz on 27/05/15.
 */
public interface TopicsDao {
    public void addTopic(Topics topic);

    public List<Topics> getTopics();

    public Topics getTopic(int id_topic);

    public void deleteTopic(int id_topic);
}
