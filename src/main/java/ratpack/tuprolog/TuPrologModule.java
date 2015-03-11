package ratpack.tuprolog;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import ratpack.handling.HandlerDecorator;

/**
 * Guice module for tuProlog.
 */
public class TuPrologModule extends AbstractModule {

  /**
   * Adds a service impl to the application, and registers a decorator so that all requests are logged.
   * Registered implementations of {@link ratpack.handling.HandlerDecorator} are able to decorate the application handler.
   *
   * @author bpdp
   */
  protected void configure() {
    bind(PrologService.class).to(PrologServiceImpl.class);
  }
}
