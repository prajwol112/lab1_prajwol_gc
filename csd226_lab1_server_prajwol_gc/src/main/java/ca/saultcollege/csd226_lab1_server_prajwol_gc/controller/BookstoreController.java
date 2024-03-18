package ca.saultcollege.csd226_lab1_server_prajwol_gc.controller;
import ca.saultcollege.csd226_lab1_server_prajwol_gc.data.Account;
import ca.saultcollege.csd226_lab1_server_prajwol_gc.data.Content;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookstoreController {

    @GetMapping("/publiccontent")
    public ResponseEntity<String> getPublicContent(){ // map a URL to a method
        return ResponseEntity.ok("getPublicContent() :");
    }
    @GetMapping("/publiccontent2")
    public Content getPublicContent2(){ // map a URL to a method
        return new Content("some content");
    }


}
