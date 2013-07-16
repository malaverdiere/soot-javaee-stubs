/**
 * (c) Copyright 2013, Tata Consultancy Services & Ecole Polytechnique de Montreal
 * All rights reserved
 */
package soot.javaee.stubs.jaxws;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


/**
 * Simple way to generate an instance of Future that will return a constant value right away
 * @param <V>
 */
public class FutureWrapper<V> implements Future<V>{

  private final V wrapped;

  public FutureWrapper(V wrapped) {
    this.wrapped = wrapped;
  }

  @Override
  public boolean cancel(boolean b) {
    return false;
  }

  @Override
  public boolean isCancelled() {
    return false;
  }

  @Override
  public boolean isDone() {
    return true;
  }

  @Override
  public V get() throws InterruptedException, ExecutionException {
    return wrapped;
  }

  @Override
  public V get(long l, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    return wrapped;
  }
}
