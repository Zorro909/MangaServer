package de.zorro909.manga.server;

import io.micronaut.http.annotation.*;

@Controller("/mangaServer")
public class MangaServerController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}