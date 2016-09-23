package xtech;

import com.orbitz.consul.Consul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class FlakyService {

    @Autowired
    public FlakyService(Consul consul) {

    }

    public Response getData() throws URISyntaxException {
        return null;
    }
}
