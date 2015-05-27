package com.dowa.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dowa.springmvc.model.History;
import com.dowa.springmvc.dao.HistoryDao;
/**
 * Created by nexuz on 27/05/15.
 */
@Service("historyService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class HistoryServiceImpl implements HistoryService{

    @Autowired
    private HistoryDao historyDao;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addStory(History history) {
        historyDao.addStory(history);
    }

    @Override
    public List<History> getStories() {
        return historyDao.getStories();
    }

    @Override
    public History getStory(int id_story) {
        return historyDao.getStory(id_story);
    }

    @Override
    public void deleteStory(int id_story) {
        historyDao.deleteStory(id_story);
    }
}
