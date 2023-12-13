package com.example.demoweb;

import com.example.demoweb.com.example.demoweb.controller.LikesController;
import com.example.demoweb.com.example.demoweb.controller.PostsCreateController;
import com.example.demoweb.com.example.demoweb.repository.PostRepository;
import com.example.demoweb.com.example.demoweb.service.PostService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("/test-application.properties")
class IntegrationTests {
    @Autowired
    private LikesController likesController;
    @Autowired
    private PostService postService;
    @Autowired
    private PostsCreateController postCreateController;
    @Autowired
    private PostRepository d;

    @Test
    public void tryToLike() throws Exception{
        if (!postService.listAllPosts().iterator().hasNext()){
            postService.create("text");
        }
        var post = postService.listAllPosts().iterator().next();
        var test = postService.listAllPosts().iterator();
        while (test.hasNext()){
            var g = test.next();
            System.out.println(g.getText());
        }
        int actual = post.getLikes();
        likesController.like(post.getId());
        post = postService.listAllPosts().iterator().next();
        System.out.println("Was: " + actual + " Now: " + post.getLikes());
        assertEquals(actual + 1, (int)post.getLikes());
    }

    @Test
    public void tryToDelete() throws Exception{
        postCreateController.doCreate("text");
        boolean bool = false;
        var posts = postService.listAllPosts().iterator();
        while (posts.hasNext()){
            var post = posts.next();
            if (post.getText().equals("text")){
                d.delete(post);
                bool = true;
            }
        }
        assertTrue(bool);
    }
}