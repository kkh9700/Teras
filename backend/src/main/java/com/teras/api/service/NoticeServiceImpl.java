package com.teras.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teras.api.request.NoticeRegisterPostReq;
import com.teras.db.Dto.NoticeDto;
import com.teras.db.entity.ClassEntity;
import com.teras.db.entity.Notice;
import com.teras.db.repository.AttachmentRepository;
import com.teras.db.repository.ClassEntityRepository;
import com.teras.db.repository.NoticeRepository;
import com.teras.db.repository.UserRepository;

@Service
public class NoticeServiceImpl implements NoticeService {
	@PersistenceContext
	private EntityManager em;

	@Autowired
	UserRepository userRepository;

	@Autowired
	NoticeRepository noticeRepository;

	@Autowired
	ClassEntityRepository classEntityRepository;

	@Autowired
	AttachmentRepository attachmentRepository;

	@Override
	public Notice createNotice(NoticeRegisterPostReq noticeRegisterInfo) {
		Notice notice = Notice.builder().title(noticeRegisterInfo.getTitle()).content(noticeRegisterInfo.getContent())
				.user(userRepository.findByUserId(noticeRegisterInfo.getUserId()).get())
				.classCode(classEntityRepository.findByClassCode(noticeRegisterInfo.getClassCode()).get())
				.attach(attachmentRepository.findByUuid(noticeRegisterInfo.getUuid()).orElse(null)).build();

		return noticeRepository.save(notice);
	}

	@Override
	public List<NoticeDto> getNoticeList(ClassEntity classEntity) {
		String classCode = classEntity.getClassCode();

		
		List<NoticeDto> list = new ArrayList<>();
		
		for(Notice notice : noticeRepository.findAllByClassCode(classEntity)) {
			System.out.println(notice.toString());
			list.add(new NoticeDto(notice));
		}
		
		
		return list;
	}

}
