package eu.seal.idp.model.pojo;


public class EndpointType {

    private String type; //String identifying the kind of endpoint (depends on each protocol), e.g. "SSOService"
    private String method; //String identifying the method to access the endpoint (depends on each protocol, i.e. HTTP-POST).
    private String url; // Access url of the endpoint, e.g. "https://esmo.uji.es/gw/saml/idp/SSOService.php"

    public EndpointType() {
    }

    public EndpointType(String type, String method, String url) {
        this.type = type;
        this.method = method;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
           

    
}
