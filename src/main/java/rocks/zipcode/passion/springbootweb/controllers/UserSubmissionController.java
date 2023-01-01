package rocks.zipcode.passion.springbootweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.passion.springbootweb.entities.UserSubmission;
import rocks.zipcode.passion.springbootweb.repos.UserSubmissionRepository;

@RestController
@RequestMapping("/searchservices")
public class UserSubmissionController {
    @Autowired
    UserSubmissionRepository repository;

    @CrossOrigin
    @GetMapping
    public Iterable<UserSubmission> getServices(){
        return repository.findAll();
    }

    @CrossOrigin
    @PostMapping
    public UserSubmission create(@RequestBody UserSubmission userSub){
        return repository.save(userSub);
    }


}
