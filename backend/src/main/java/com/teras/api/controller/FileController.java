package com.teras.api.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.teras.api.request.FileDownloadPostReq;
import com.teras.api.response.FileUploadPostRes;
import com.teras.api.service.FileService;

@RestController
@RequestMapping("/file")
public class FileController {
	@Autowired
	FileService fileService;

	@PostMapping("/upload")
	public ResponseEntity<? extends FileUploadPostRes> upload(@RequestParam MultipartFile file)
			throws IllegalStateException, IOException {
		String uuid = fileService.uploadFile(file);

		return ResponseEntity.status(200).body(FileUploadPostRes.of(200, "Success", uuid));
	}

	@PostMapping("/download")
	public ResponseEntity<Object> postDownload(@RequestBody FileDownloadPostReq downloadInfo) {

		return fileService.downloadFile(downloadInfo.getUuid());
	}
	
	@GetMapping("/download")
	public ResponseEntity<Object> getdownload(@RequestParam String uuid) {

		return fileService.downloadFile(uuid);
	}
}
