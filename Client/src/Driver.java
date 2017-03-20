import java.net.UnknownHostException;

/**
 * Created by Lumine on 3/20/2017.
 */
public class Driver {

    public static void main(String[] args){
        int port = 43594;
        String host = "0.0.0.0";

        try {
            Client client = new Client(host, port);
            client.load();
        } catch(UnknownHostException ex){
            ex.printStackTrace();
        }
    }
}
