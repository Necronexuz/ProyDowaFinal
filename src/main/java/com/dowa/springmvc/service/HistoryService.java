package com.dowa.springmvc.service;

import com.dowa.springmvc.model.History;

import java.util.List;

/**
 * Created by nexuz on 27/05/15.
 */
public interface HistoryService {
    public void addStory(History history);

    public List<History> getStories();

    public History getStory(int id_story);

    public void deleteStory(int id_story);
}
