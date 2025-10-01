package com.alkimi.okta;

import com.alkimi.okta.FoxPrototype;
import com.alkimi.okta.config.AsyncSyncConfiguration;
import com.alkimi.okta.config.EmbeddedSQL;
import com.alkimi.okta.config.JacksonConfiguration;
import com.alkimi.okta.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { FoxPrototype.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedSQL
public @interface IntegrationTest {
}
