package firstapi3.FirstApi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/strings")
public class StringController {

    @GetMapping
    public String getString(@RequestParam(required = true) String firstString, @RequestParam(required = false) String secondString) {
        if (secondString.equals(null))
            return firstString;
        else
        return firstString + " " + secondString;
    }
}
