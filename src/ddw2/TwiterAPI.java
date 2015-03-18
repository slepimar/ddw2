/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddw2;

import java.util.ArrayList;
import java.util.List;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Marek
 */
public class TwiterAPI {
    
    public ResponseList<Status> getUserTweets(String user, int tweetnumber) throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey("tAtSvLUW9aTIW3XbeDGVfzEP8");
        cb.setOAuthConsumerSecret("t943W4qCqZhKxVa7fCShSk9JbORas95Kn89gpLjI2x4ve9l5mB");
        cb.setOAuthAccessToken("2687073260-9Gy7A7yh8fHOcG1uNSBmwrlLPaCuceBtVgXl7rI");
        cb.setOAuthAccessTokenSecret("j1L6akNsENBoyYvohDFphVqUZKiV0UnlymIZd81myJKmE");

        Twitter twitter = new TwitterFactory(cb.build()).getInstance();

        int pageno = 1;
        List statuses = new ArrayList();

        /*while (true) {

          try {

            int size = statuses.size(); 
            Paging page = new Paging(pageno++, 100);
            statuses.addAll(twitter.getUserTimeline(user, page));
            if (statuses.size() == size)
              break;
          }
          catch(TwitterException e) {

            e.printStackTrace();
          }
        }

        System.out.println("Total: "+statuses.size());*/
        ResponseList<Status> result = null;
        try{
            result = twitter.getUserTimeline(user,new Paging(1,tweetnumber));
            
            /*for(Status b:result){
                System.out.println(b.getText());
            }*/
            
        }
        catch (Exception e){}
        
        return result;
    }
}
