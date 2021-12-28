package com.assignment.myphotoapp.service;

import com.assignment.myphotoapp.model.Comment;
import com.assignment.myphotoapp.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String commentId) {
        commentRepository.deleteById(commentId);
    }

    public List<Comment> getById(String commentId) {
        return commentRepository.findAllById(commentId);
    }
}
