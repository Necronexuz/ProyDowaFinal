package com.dowa.springmvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.dowa.springmvc.model.History;
/**
 * Created by nexuz on 27/05/15.
 */
@Repository("historyDao")
public class HistoryDaoImpl extends AbstractDao implements HistoryDao{
    @Override
    public void addStory(History history) {
        getSession().saveOrUpdate(history);
    }

    @Override
    public List<History> getStories() {
        return (List<History>) getSession().createCriteria(History.class).list();
    }

    @Override
    public History getStory(int id_story) {
        return (History) getSession().get(History.class, id_story);
    }

    @Override
    public void deleteStory(int id_story) {
        Query query = getSession().createSQLQuery("DELETE FROM histories WHERE id_story = :id_story");
        query.setInteger("id_story", id_story);
        query.executeUpdate();
    }
}
