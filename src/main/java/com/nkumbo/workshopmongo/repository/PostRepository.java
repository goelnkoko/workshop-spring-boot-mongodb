package com.nkumbo.workshopmongo.repository;

import com.nkumbo.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
