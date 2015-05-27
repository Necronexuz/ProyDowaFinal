package com.dowa.springmvc.controller;

import java.util.List;
import javax.validation.Valid;

import com.dowa.springmvc.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dowa.springmvc.model.History;
import com.dowa.springmvc.service.HistoryService;
import com.dowa.springmvc.service.TopicService;
import com.dowa.springmvc.service.UserService;


/**
 * Created by nexuz on 27/05/15.
 */
@Controller
public class HistoryController {
    @Autowired
    private HistoryService historyService;

    @Autowired
    private TopicService topicService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/listStory"}, method = RequestMethod.GET)
    public String listStories(ModelMap model){
        List<History> histories = historyService.getStories();
        model.addAttribute("histories", histories);
        return "allstories";
    }

    @RequestMapping(value = {"/newStory"}, method = RequestMethod.GET)
    public String newStory(ModelMap model){
        History history = new History();
        List<Topics> topics = topicService.getTopics();
        model.addAttribute("history",history);
        model.addAttribute("topics", topics);
        return "regstory";
    }

    @RequestMapping(value = {"/newStory"}, method = RequestMethod.POST)
    public String saveStory (@Valid History history, BindingResult result, ModelMap model){
       if(result.hasErrors()){
           return "regStory";
       }
       historyService.addStory(history);
        model.addAttribute("Success", "History "+ history.getStory() + " registred successfully");
        return "allstories";
    }

    @RequestMapping(value = {"/delete-{id_story}-story"}, method = RequestMethod.GET)
    public String deleteUser(@PathVariable int id_story){
        historyService.deleteStory(id_story);
        return "redirect:/list";
    }

    @RequestMapping(value = {"/edit-{id_story}-story"}, method = RequestMethod.GET)
    public String editStory (@PathVariable int id_story , ModelMap model){
        History history = historyService.getStory(id_story);
        List<Topics> topics = topicService.getTopics();
        model.addAttribute("history",history);
        model.addAttribute("topics", topics);
        return "regStory";
    }
}
