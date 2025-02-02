package simulacao.si.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getStatus")
public class StatusController {
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Void> getStatus() {return ResponseEntity.ok(null); }
}
