package com.assignment.myphotoapp.resource;

import com.assignment.myphotoapp.model.Comment;
import com.assignment.myphotoapp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComment(){
        return commentService.getAllComment();
    }

    @GetMapping("/findComment")
    public List<Comment> getById(@RequestParam(name="commentId") String commentId){
        return commentService.getById(commentId);
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name="commentId") String commentId){
        commentService.deleteComment(commentId);
    }
}
