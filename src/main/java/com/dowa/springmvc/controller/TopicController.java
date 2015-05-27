package com.dowa.springmvc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dowa.springmvc.model.Topics;
import com.dowa.springmvc.service.TopicService;

import javax.validation.Valid;

/**
 * Created by nexuz on 27/05/15.
 */
@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = {"/list-topics"}, method = RequestMethod.GET)
    public String listTopics(ModelMap model){
        List<Topics> topics = topicService.getTopics();
        model.addAttribute("topics",topics);
        return "alltopics";
    }

    @RequestMapping(value = {"/new-topic"}, method = RequestMethod.GET)
    public String newTopic(ModelMap model){
        Topics topics = new Topics();
        model.addAttribute("topics",topics);
        return "regtopic";
    }

    @RequestMapping(value = {"/new-topic"}, method = RequestMethod.POST)
    public String saveTopic(@Valid Topics topic, BindingResult result, ModelMap model){
        if(result.hasErrors()){
            return "regtopic";
        }

        topicService.addTopic(topic);
        model.addAttribute("Success","Topic "+topic.getTopic() + " registres Successfuly" );
        return "success";
    }

    @RequestMapping(value = {"delete-{id_topic}-topic"}, method = RequestMethod.GET)
    public String deleteTopic(@PathVariable int id_topic){
        topicService.deleteTopic(id_topic);
        return "redirect:/alltopics" ;
    }


}
