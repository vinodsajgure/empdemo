package com.demo.emp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.emp.dao.ContactUsDao;
import com.demo.emp.dto.ContactFormDto;
import com.demo.emp.entity.ContactUs;
import com.demo.emp.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactUsDao dao;

	@Override
	public void saveContactUs(ContactFormDto form) {
		ContactUs contactUs = new ContactUs();
		contactUs.setFirstName(form.getFirstName());
		contactUs.setLastName(form.getLastName());
		contactUs.setEmail(form.getEmail());
		contactUs.setSubject(form.getSubject());
		contactUs.setMessage(form.getMessage());
		dao.save(contactUs);
	}

}
