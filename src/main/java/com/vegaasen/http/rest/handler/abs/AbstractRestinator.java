package com.vegaasen.http.rest.handler.abs;

import com.vegaasen.http.rest.handler.HttpMethod;

/**
 * @author <a href="vegaasen@gmail.com">vegardaasen</a>
 */
public abstract class AbstractRestinator implements HttpMethod {

    @Override
    public String get() {
        return null;
    }

    @Override
    public String post() {
        return null;
    }

    @Override
    public String put() {
        return null;
    }

    @Override
    public String options() {
        return null;
    }

    @Override
    public String delete() {
        return null;
    }

    @Override
    public String head() {
        return null;
    }
}
