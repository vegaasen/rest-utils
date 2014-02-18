package com.vegaasen.http.rest.model.abs;

import com.vegaasen.http.rest.model.auth.Authentication;
import com.vegaasen.http.rest.model.http.Header;
import com.vegaasen.http.rest.model.http.Param;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="vegaasen@gmail.com">vegardaasen</a>
 */
public abstract class AbstractScheme {

    protected URL to;
    protected Authentication authentication;
    protected List<Header> headers = new ArrayList<>();
    protected List<Param> params = new ArrayList<>();

    public abstract String compileAsString();

    public URL getTo() {
        return to;
    }

    public void setTo(String to) {
        try {
            this.to = new URL(to);
        } catch (final MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public List<Header> getHeaders() {
        return headers;
    }

    public List<Param> getParams() {
        return params;
    }

    public void addHeader(final Header header) {
        if (header == null) {
            return;
        }
        headers.add(header);
    }

    public void addParam(final Param param) {
        if (param == null) {
            return;
        }
        params.add(param);
    }

}
