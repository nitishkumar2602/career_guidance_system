package com.dao;



import com.model.Feedback;
import java.util.List;

public interface FeedbackDAO {
    void addFeedback(Feedback feedback);
    Feedback getFeedbackById(int id);
    List<Feedback> getAllFeedback();
    void updateFeedback(Feedback feedback);
    void deleteFeedback(int id);
}
