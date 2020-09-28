package org.acme.rest.client;

import com.fasterxml.jackson.annotation.*;
public class TestRequest {

    @JsonProperty("test_prop")
    public String testProp;
}
