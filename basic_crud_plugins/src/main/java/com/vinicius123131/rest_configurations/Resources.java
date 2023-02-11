package com.vinicius123131.rest_configurations;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Resources {

    public static final String USERS = "/users";

    public static final String ID = "id";

    public static final String FIND_ID = "/{"+ID+"}";
}
