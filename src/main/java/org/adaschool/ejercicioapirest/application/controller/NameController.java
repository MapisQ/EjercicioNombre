package org.adaschool.ejercicioapirest.application.controller;

import org.adaschool.ejercicioapirest.application.service.NameService;
import org.adaschool.ejercicioapirest.domain.entity.NameEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/name")
public record NameController( NameService service){

    @GetMapping("showName")
    public ResponseEntity<String> showName(NameEntity nameE) {
        String name = service.getName(nameE);
        return ResponseEntity.ok(name);
    }
}
