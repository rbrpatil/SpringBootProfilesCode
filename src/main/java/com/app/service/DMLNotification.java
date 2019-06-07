package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dml")
public class DMLNotification implements INotificationService {

	@Override
	public void notification() {
		System.out.println("In DML Profile");

	}

}
