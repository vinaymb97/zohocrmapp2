package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {

	public void saveOneContact(Contact contact);

	public List<Contact> getAllContact();

	public Contact getOneContact(long id);
}
