package cz.chodura

/**
class PinnacleFeed {
    
    private static String SPORTS_URL = "https://api.pinnaclesports.com/v1/sports"
    
    public static void main(String[] args) {
        
        PinnacleFeed feed = new PinnacleFeed()
        
        byte[] bytes = "JC398805:3t6PU\$35uK".getBytes("UTF-8");
        String encoded = Base64.getEncoder().encodeToString(bytes);
        
        URL sportsApi = new URL(SPORTS_URL);
        URLConnection apiConnection = sportsApi.openConnection();
        apiConnection.addRequestProperty("Authorization", "Basic " +   encoded );
        BufferedReader reader = new BufferedReader( new InputStreamReader(apiConnection.getInputStream()));
        
        
        def sports = feed.getSports(reader)
    }
    
    /**
     * Prace s XML a dynamickymi vlastnostmi.
     *
     * @return
     */
/**
    private getSports(Reader reader){
        
        
        def sportsXml = new XmlSlurper().parse(reader)
        for (sport in sportsXml.sports) {
            
            println "${sport.@id} ma jmeno ${sport}"
        }
        
        return 0
    }
}
*/

import java.util.*;

public class PinnacleFeed {
    
   // private static Base64.Encoder encoder = Base64.getEncoder()
    
       public static void main(String[] args) throws IOException {
           PinnacleFeed feed = new PinnacleFeed()
           feed.getSPorts()
       }
       
       private getSPorts(){
           
           byte[] bytes = "JC398805:3t6PU\$35uK".getBytes("UTF-8");
           String encoded = encoder.encodeToString(bytes);
           URL api = new URL("https://api.pinnaclesports.com/v1/feed?sportid=3%22%22=%22%22%3ehttps://api.pinnaclesports.com/v1/feed?sportid=3");
           URLConnection apiConnection = api.openConnection();
           apiConnection.addRequestProperty("Authorization",
                   "Basic " +   encoded );
           BufferedReader reader = new BufferedReader(
                   new InputStreamReader(
                           apiConnection.getInputStream()));
           String inputLine;
    
           while ((inputLine = reader.readLine()) != null)
               System.out.println(inputLine);
           reader.close();
       }
   }