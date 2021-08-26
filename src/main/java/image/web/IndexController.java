package image.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@Controller
public class IndexController {
    @GetMapping(path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String getIndex() {
        return "index";
    }

    @PostMapping(path = "/", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.TEXT_HTML_VALUE)
    public String uploadImage(Model model,
                              @RequestParam("image") MultipartFile image) throws IOException {
        byte[] imageBytes = image.getBytes();

        String encodedImage = Base64.getEncoder().encodeToString(imageBytes);

        model.addAttribute("output", encodedImage);

        return "index";
    }
}
