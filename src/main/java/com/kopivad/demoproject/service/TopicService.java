package com.kopivad.demoproject.service;

import com.kopivad.demoproject.model.Test;
import com.kopivad.demoproject.model.Topic;

import java.util.List;


public interface TopicService {
    List<Topic> getAllTopics();

    List<Test> getAllTestsByTopicId(Long id);

    void addNewTopic(Topic topic);

    Topic findTopicById(Long id);
}
