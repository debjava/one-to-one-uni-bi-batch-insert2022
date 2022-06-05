package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.mapping.One2ManyBatchInsert;

@Component
public class AppAutoStart {
	
//	@Autowired
//	private One2OneUniMapping mapping;
	
	@Autowired
	private One2ManyBatchInsert mapping;
	

	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		// Save One To One Unidirectional
		mapping.save();
	}
}
