package xtech;

import com.orbitz.consul.Consul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.net.ConnectException;
import java.net.URISyntaxException;

@Service
public class FlakyService {

    @Autowired
    public FlakyService(Consul consul) {

    }

    @Retryable(ConnectException.class)
    public Response getData() throws URISyntaxException {
        return null;
    }
}
