package com.nkumbo.workshopmongo.services;

import com.nkumbo.workshopmongo.domain.User;
import com.nkumbo.workshopmongo.dto.UserDTO;
import com.nkumbo.workshopmongo.repository.UserRepository;
import com.nkumbo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id){

        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Not found!"));
    }

    public User insert(User obj){
        return repository.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
