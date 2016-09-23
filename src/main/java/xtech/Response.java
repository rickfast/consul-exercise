package xtech;

import java.util.Map;

public class Response {

    private Map<?, ?> data;
    private String ip;

    public Response(Map<?, ?> data, String ip) {
        this.data = data;
        this.ip = ip;
    }

    public Map<?, ?> getData() {
        return data;
    }

    public String getInstance() {
        return ip;
    }
}
