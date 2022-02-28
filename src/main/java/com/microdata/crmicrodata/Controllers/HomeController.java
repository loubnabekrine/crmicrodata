package com.microdata.crmicrodata.Controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/test")
     public String test(){
        return "est"
;    }

    @GetMapping("/index")
    public ResponseEntity<String> usingResponseEntityBuilderAndHttpHeaders() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin",
                "*");

        return ResponseEntity.ok()
                .headers(responseHeaders)
                .body("Response with header using ResponseEntity");
    }

}
