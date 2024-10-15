package ie.atu.lab4;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    List<Person>personList = new ArrayList<>();
    @GetMapping("/listPerson")
    public List<Person> getPerson(){
        return personList;
    }

    @PostMapping("/createPerson")
    public List<Person> createPerson(@RequestBody @Valid Person person){
        personList.add(person);
        return personList;
    }
}
