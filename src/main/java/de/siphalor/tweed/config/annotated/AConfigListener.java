package de.siphalor.tweed.config.annotated;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AConfigListener {
	String value() default "";
}
