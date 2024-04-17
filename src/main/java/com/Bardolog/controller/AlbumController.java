package com.Bardolog.controller;

import java.time.LocalDateTime;
import java.util.Set;

import com.Bardolog.entity.AlbumEntity;
import com.Bardolog.model.ResponseModel;
import com.Bardolog.service.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1/album")
public class AlbumController {
	
	@Autowired
	private IAlbumService service;
	
	@GetMapping
	public ResponseEntity<ResponseModel> getAll(){
		Set<AlbumEntity> result = this.service.getAll();
		ResponseModel response = new ResponseModel(LocalDateTime.now(), result, "Success");
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<ResponseModel> save(@RequestBody AlbumEntity album) {
		AlbumEntity result = this.service.save(album);
		ResponseModel response = new ResponseModel(LocalDateTime.now(), result, "Success");
		return ResponseEntity.ok().body(response);
	}
	
}
