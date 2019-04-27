package com.bookstore.Bookstore.utility;

import org.junit.Before;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;

import static org.junit.Assert.*;

public class SecurityUtilityTest {

    private String SALTCHARS;

    private SecurityUtility securityUtility = new SecurityUtility();

    @Before
    public void setUp() throws Exception {
        SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVXWYZ1234567890";
    }

    @Test
    public void when_randomPassword_thenLenghtMustBe18() {

        String s = SecurityUtility.randomPassword();

        assertEquals(18, s.length());
    }
    @Test
    public void when_randomPassword_thenPasswordMustBeRandom() {

        String s = SecurityUtility.randomPassword();

        String veryRandomPassword = "xasSDASDAS12!!!1DSA231313123231232DASDA";
        assertNotEquals(veryRandomPassword, s);
    }

    @Test
    public void when_passwordEncoder_thenPasswordLenghtMustBe73Or72() {

        String s = String.valueOf(SecurityUtility.passwordEncoder());

        assertEquals(73, s.length());
        assertEquals(72, s.length());
    }

    @Test
    public void when_passwordEncoder_thenPasswordMustBeVeryHardToDecode() {

        String s = String.valueOf(SecurityUtility.passwordEncoder());

        BCryptPasswordEncoder expected = new BCryptPasswordEncoder(12, new SecureRandom(SALTCHARS.getBytes()));
        assertNotEquals(expected, s);
    }


}