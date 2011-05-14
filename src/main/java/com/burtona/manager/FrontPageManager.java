package com.burtona.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.burtona.bl.Content;
import com.burtona.bl.FrontPageContent;

public class FrontPageManager {
	   private static final transient Logger logger = Logger.getLogger(AccountManager.class);
	   private static FrontPageManager instance;
	   
	   public static synchronized FrontPageManager getInstance()
	   {
		   if(instance == null)
			  instance = new FrontPageManager();
		   return instance;
	   }
	   
	   public FrontPageContent getContent()
	   {
		   logger.debug("getContent : Start");
		   FrontPageContent content = new FrontPageContent();
		   List<Content> members = new ArrayList<Content>();
		   List<Content> videos = new ArrayList<Content>();
		   List<Content> albums = new ArrayList<Content>();
		   
		   members.add(new Content("#","images/burtona-members-images/Divine-Wisdome.jpg"));
		   members.add(new Content("#","images/burtona-members-images/My-neices-about-ta-perform-in-an-African-musical.jpg"));
		   members.add(new Content("#","images/burtona-members-images/ahwd.jpg"));
		   members.add(new Content("#","images/burtona-members-images/Divine-Wisdome.jpg"));
		   members.add(new Content("#","images/burtona-members-images/My-neices-about-ta-perform-in-an-African-musical.jpg"));
		   members.add(new Content("#","images/burtona-members-images/ahwd.jpg"));
		   
		   videos.add(new Content("#","images/burtona-tutorials-images/tutorial.jpg"));
		   videos.add(new Content("#","images/burtona-movies-images/movies_002.jpg"));
		   videos.add(new Content("#","images/burtona-videos-images/eminem_music_videos.jpg"));
		   videos.add(new Content("#","images/burtona-tutorials-images/tutorial.jpg"));
		   videos.add(new Content("#","images/burtona-movies-images/movies_002.jpg"));
		   videos.add(new Content("#","images/burtona-videos-images/eminem_music_videos.jpg"));
		   
		   albums.add(new Content("#","images/burtona-album-images/1.jpg"));
		   albums.add(new Content("#","images/burtona-singles-images/1.jpg"));
		   albums.add(new Content("#","images/burtona-art-images/1.jpg"));
		   albums.add(new Content("#","images/burtona-album-images/1.jpg"));
		   albums.add(new Content("#","images/burtona-singles-images/1.jpg"));
		   albums.add(new Content("#","images/burtona-art-images/1.jpg"));
		   
		   content.setTopAlbums(albums);
		   content.setTopMembers(members);
		   content.setTopVideos(videos);
		   
		   logger.debug("getContent : End");
		   return content;
	   }
}
