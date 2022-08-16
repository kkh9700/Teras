package com.teras.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.teras.api.request.OpenviduRegisterPostReq;
import com.teras.db.dto.OpenviduDto;
import com.teras.db.entity.ClassEntity;
import com.teras.db.entity.Openvidu;
import com.teras.db.entity.User;
import com.teras.db.repository.ClassEntityRepository;
import com.teras.db.repository.OpenviduRepository;
import com.teras.db.repository.UserRepository;

@Service
public class OpenviduServiceImpl implements OpenviduService {

	@Autowired
	OpenviduRepository openviduRepository;

	@Autowired
	ClassEntityRepository classEntityRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public JsonObject createRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void leaveRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fetchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fetchAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public Openvidu createSession(OpenviduRegisterPostReq registerInfo, String userId) {
		ClassEntity classEntity = classEntityRepository.findByClassCode(registerInfo.getClassCode()).get();
		User user = userRepository.findByUserId(userId).get();

		Openvidu openvidu = Openvidu.builder().sessionId(registerInfo.getSessionId()).goal(registerInfo.getGoal())
				.subjectCode(user.getSubjectCode()).hostId(registerInfo.getHostId()).period(registerInfo.getPeriod())
				.classCode(classEntity).build();

		return openviduRepository.save(openvidu);
	}

	//openviduServicelmpl
	@Override
    public Openvidu endInfo(Authentication authentication,String sessionId) {
		Openvidu openvidu = openviduRepository.findById(sessionId).orElse(null);
		System.out.println(openviduRepository.save(openvidu));
		if (openvidu != null) {
			openviduRepository.delete(openvidu);
		}
		
		return openviduRepository.save(openvidu);
    }

	@Override
    public void deletePost(String sessionId) {
		openviduRepository.deleteById(sessionId);
	}
	
	@Override
	public OpenviduDto searchOpenvidu(String sessionId) {
		OpenviduDto openviduDto = new OpenviduDto(openviduRepository.findById(sessionId).get());

		return openviduDto;
	}

}
