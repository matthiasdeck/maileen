package com.github.matthiasdeck.maileen;

import io.micronaut.http.annotation.*;

@Controller("/maileen")
public class MaileenController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}