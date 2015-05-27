package com.dowa.springmvc.dao;

import java.util.List;

import com.dowa.springmvc.model.History;

import com.dowa.springmvc.model.History;
/**
 * Created by nexuz on 27/05/15.
 */
public interface HistoryDao {
    public void addStory(History history);

    public List<History> getStories();

    public History getStory(int id_story);

    public void deleteStory(int id_story);
}
