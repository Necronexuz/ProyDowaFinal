package com.dowa.springmvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.dowa.springmvc.model.Topics;
/**
 * Created by nexuz on 27/05/15.
 */
@Repository("topicsDao")
public class TopicsDaoImpl extends AbstractDao implements TopicsDao {
    @Override
    public void addTopic(Topics topic) {
        getSession().saveOrUpdate(topic);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Topics> getTopics() {
        return (List<Topics>)getSession().createCriteria(Topics.class).list();
    }

    @Override
    public Topics getTopic(int id_topic) {
        return (Topics) getSession().get(Topics.class, id_topic);
    }

    @Override
    public void deleteTopic(int id_topic) {
        Query query = getSession().createSQLQuery("DELETE FROM topics WHERE id_topic = :id_topic");
        query.setInteger("id_topic", id_topic);
        query.executeUpdate();
    }
}
