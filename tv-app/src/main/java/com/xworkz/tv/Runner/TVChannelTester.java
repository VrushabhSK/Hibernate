package com.xworkz.tv.Runner;

import com.xworkz.tv.DAO.TvChannelDAO;
import com.xworkz.tv.DAO.TvChannelDAOImpl;
import com.xworkz.tv.entity.TVChannel;

public class TVChannelTester {
	public static void main(String[] args) {
		
		TVChannel channel= new TVChannel();
		channel.setChannelId(1);
		channel.setChannelName("Chandana");
		channel.setLanguage("Kannada");
		channel.setPrice(0);
		channel.setFree(true);
		
		
		TvChannelDAO channelDAO = new TvChannelDAOImpl();
		//channelDAO.saveChannel(channel);
		//System.out.println("Saved Succussfully");
		channelDAO.getChannelById();
		
		
		
		
	}
	
	

}
