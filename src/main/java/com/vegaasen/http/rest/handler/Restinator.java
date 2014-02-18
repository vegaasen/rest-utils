package com.vegaasen.http.rest.handler;

import com.vegaasen.http.rest.handler.abs.AbstractRestinator;
import com.vegaasen.http.rest.model.Scheme;
import com.vegaasen.http.rest.model.auth.Authentication;
import com.vegaasen.http.rest.model.http.Header;
import com.vegaasen.http.rest.model.http.Param;

/**
 * This is the main object where all magic will happen.
 *
 * @author <a href="vegaasen@gmail.com">vegardaasen</a>
 */
public final class Restinator extends AbstractRestinator {

    private final Scheme scheme = new Scheme();

    public Restinator(final String url) {
        scheme.setTo(url);
    }

    public Restinator() {
    }

    public Restinator authentication(final Authentication authentication) {
        scheme.setAuthentication(authentication);
        return this;
    }

    public Restinator params(final Param... params) {
        if (params != null && params.length > 0) {
            for (final Param param : params) {
                scheme.addParam(param);
            }
        }
        return this;
    }

    public Restinator headers(final Header... headers) {
        if (headers != null && headers.length > 0) {
            for (final Header header : headers) {
                scheme.addHeader(header);
            }
        }
        return this;
    }

    public String asPlainUrl() {
        return scheme.compileAsString();
    }

}
