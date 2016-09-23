package xtech;

import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
public class ApplicationController {

    @Autowired
    private FlakyService flakyService;

    @RequestMapping("/data")
    public Object getData() throws URISyntaxException {
        Response response = flakyService.getData();

        return ImmutableMap.of("flaky", response.getData(), "instance", response.getInstance());
    }
}
