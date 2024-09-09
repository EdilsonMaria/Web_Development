package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Subject;
import br.com.alunoonline.api.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subject")

public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void create(@RequestBody Subject subject) {
        subjectService.create(subject);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<Subject> findAll() {return subjectService.findAll();}

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public Optional<Subject> findById(@PathVariable Long id) {
        return subjectService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void update(@RequestBody Subject subject, @PathVariable Long id) {
        subjectService.update(id, subject);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void deleteById(@PathVariable Long id) {
        subjectService.deleteById(id);
    }

    @GetMapping("/professor/{id}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<Subject> findByProfessor(@PathVariable Long id) {
        return subjectService.findByProfessorId(id);
    }


}
