package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    /*
    @GetMapping("/")
    public String index() {
        //mustache에서 앞의 경로(src/main/resources/templates)와 확장자(mustache)를 자동으로 지정해준다.
        return "index";
    }
    */

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }


    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts",postsService.findAllDesc());
        return "index";
    }
}
