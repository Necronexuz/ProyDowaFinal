package com.dowa.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dowa.springmvc.model.Topics;
import com.dowa.springmvc.dao.TopicsDao;
/**
 * Created by nexuz on 27/05/15.
 */
@Service("TopicsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicsDao topicsDao;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public void addTopic(Topics topic) {
        topicsDao.addTopic(topic);
    }

    @Override
    public List<Topics> getTopics() {
        return topicsDao.getTopics();
    }

    @Override
    public Topics getTopic(int id_topic) {
        return topicsDao.getTopic(id_topic);
    }

    @Override
    public void deleteTopic(int id_topic) {
        topicsDao.deleteTopic(id_topic);
    }
}
