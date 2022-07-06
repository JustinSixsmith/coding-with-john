import java.net.URI;
import java.net.http.HttpRequest;

public class RestApiTutorial {
    public static void main(String[] args) {

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", )

    }
}
