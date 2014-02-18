package com.vegaasen.http.rest.handler;

/**
 * @author <a href="vegaasen@gmail.com">vegardaasen</a>
 */
public abstract interface HttpMethod {

    String get();

    String post();

    String put();

    String options();

    String delete();

    String head();

}
