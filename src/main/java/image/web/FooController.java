package image.web;

import image.core.Foo;
import image.core.FooService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public record FooController(FooService fooService) {
    @GetMapping(path = "/foos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Foo> getFoos() {
        return fooService.getAllFoos();
    }
}
