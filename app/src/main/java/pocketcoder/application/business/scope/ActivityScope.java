package pocketcoder.application.business.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.scope
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
