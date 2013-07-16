/**
 * (c) Copyright 2013, Tata Consultancy Services & Ecole Polytechnique de Montreal
 * All rights reserved
 */
package soot.javaee.stubs.jaxws;


import javax.xml.ws.Response;
import java.util.Collections;
import java.util.Map;


/**
 * Simple way to generate an instance of Response that will return a constant value right away
 * @param <T> the type of the Response
 */
public class ResponseWrapper<T> extends FutureWrapper<T> implements Response<T>{

  public ResponseWrapper(T wrapped) {
    super(wrapped);
  }

  @Override
  public Map<String, Object> getContext() {
    return Collections.EMPTY_MAP;
  }
}
