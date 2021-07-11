package image.core;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FooService {
    public List<Foo> getAllFoos() {
        return List.of(new Foo("ninja", 1),
                       new Foo("taco", 5));
    }
}
