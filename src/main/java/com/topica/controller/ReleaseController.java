package com.topica.controller;

import com.topica.model.ReleaseEntity;
import com.topica.service.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

//@RestController
//public class ReleaseController {
//    @Autowired
//    private ReleaseService releaseService;
//
//    //CRUD
//
//    @PostMapping("/release")
//    public ReleaseEntity createRelease(@Valid @RequestBody Release releaseCriteria) {
//        return releaseService.save(new ReleaseEntity(releaseCriteria));
//    }
//
//    @GetMapping("/release")
//    public Page<ReleaseEntity> getAllReleases(Pageable pageable) {
//        return releaseService.(pageable);
//    }
//
//    @PutMapping("/release/{id}")
//    public ReleaseEntity updateRelease(@PathVariable("id") String id,
//                                       @Valid @RequestBody ReleaseCriteria releaseCriteria) {
//        return releaseEntityService.findById(id).map(release -> {
//            release.setName(releaseCriteria.getName());
//            release.setDescription(releaseCriteria.getDescription());
//            release.setCreatedby(releaseCriteria.getCreatedby());
//            return releaseEntityService.save(release);
//        }).orElseThrow(() -> new ResourceNotFoundException(String.format(Messages.MSG_RELEASE_NOT_FOUND_FORMAT, id)));
//    }
//
//    @DeleteMapping("/release/{id}")
//    public ResponseEntity deleteRelease(@PathVariable("id") String id) {
//        return releaseEntityService.findById(id).map(release -> {
//            releaseEntityService.delete(release);
//            return ResponseEntity.ok().build();
//        }).orElseThrow(() -> new ResourceNotFoundException(String.format(Messages.MSG_RELEASE_NOT_FOUND_FORMAT, id)));
//    }
//}
