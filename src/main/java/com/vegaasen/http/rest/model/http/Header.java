package com.vegaasen.http.rest.model.http;

import com.vegaasen.http.rest.model.abs.KeyValueVariant;

/**
 * @author <a href="vegaasen@gmail.com">vegardaasen</a>
 */
public final class Header extends KeyValueVariant {

    public Header(final String key, final String... value) {
        super(key, value);
    }

}
