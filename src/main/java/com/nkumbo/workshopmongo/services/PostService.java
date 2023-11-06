package com.nkumbo.workshopmongo.services;

import com.nkumbo.workshopmongo.domain.Post;
import com.nkumbo.workshopmongo.repository.PostRepository;
import com.nkumbo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
