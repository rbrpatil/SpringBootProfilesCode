package com.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("htc")
public class HTCNotification implements INotificationService {

	@Override
	public void notification() {
		System.out.println("in HTC Profile");

	}

}
