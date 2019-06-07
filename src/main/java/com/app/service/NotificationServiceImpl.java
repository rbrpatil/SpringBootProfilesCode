package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class NotificationServiceImpl implements INotificationService {

	@Override
	public void notification() {
		System.out.println("Common for all");

	}

}
