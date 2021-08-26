package image.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@Controller
@RequestMapping("base64")
public class Base64Controller {
    private static final String VIEW = "base64";

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String getIndex() {
        return VIEW;
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.TEXT_HTML_VALUE)
    public String uploadImage(Model model,
                              @RequestParam("image") MultipartFile image) throws IOException {
        byte[] imageBytes = image.getBytes();

        String encodedImage = Base64.getEncoder().encodeToString(imageBytes);

        model.addAttribute("output", encodedImage);

        return VIEW;
    }
}
