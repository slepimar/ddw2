
package ddw2;

import java.io.Console;
import java.util.Scanner;
import twitter4j.TwitterException;

public class Ddw2 {

    public static void main(String[] args) throws TwitterException {
        
        client client = new client();
        
        Scanner reader = new Scanner(System.in);
        
        Console console = System.console();
        System.out.println("Enter the account name to be scanned:");
        String user=reader.nextLine();
        

        
        System.out.println("Enter the number of tweets to be scanned:");

        int tweetsNumber=reader.nextInt();
        client.run(user,tweetsNumber);    
    }
}
