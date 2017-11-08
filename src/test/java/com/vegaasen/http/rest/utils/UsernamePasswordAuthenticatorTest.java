package com.vegaasen.http.rest.utils;

import com.vegaasen.http.rest.model.abs.StringId;
import com.vegaasen.http.rest.model.auth.User;
import org.junit.Test;

import java.net.PasswordAuthentication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author <a href="vegaasen@gmail.com">vegardaasen</a>
 */
public class UsernamePasswordAuthenticatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void getPasswordAuthentication_nilledUser_fail() {
        final UsernamePasswordAuthenticator authenticator = new UsernamePasswordAuthenticator(null);
        assertNotNull(authenticator);
        authenticator.getPasswordAuthentication();
    }

    @Test
    public void getPasswordAuthentication_normalProcedure() {
        final User user = mock(User.class);
        final StringId stringId = mock(StringId.class);
        final String result = "rr";
        when(user.getUserId()).thenReturn(stringId);
        when(user.getPassword()).thenReturn(stringId);
        when(stringId.getId()).thenReturn(result);
        final UsernamePasswordAuthenticator authenticator = new UsernamePasswordAuthenticator(user);
        assertNotNull(authenticator);
        final PasswordAuthentication passwordAuthentication = authenticator.getPasswordAuthentication();
        assertNotNull(passwordAuthentication);
        assertEquals(result, passwordAuthentication.getUserName());
        assertEquals(result.toCharArray(), passwordAuthentication.getPassword());
    }

}
