/**
 * 
 */
package system;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 * @author burak.torgay
 *
 */
public class GenericExceptionHandlerFactory extends ExceptionHandlerFactory{
	
	   private ExceptionHandlerFactory parent;
	   
	   // this injection handles jsf
	   public GenericExceptionHandlerFactory(ExceptionHandlerFactory parent) {
	    this.parent = parent;
	   }
	 
	    @Override
	    public ExceptionHandler getExceptionHandler() {
	 
	        ExceptionHandler handler = new GenericExceptionHandler(parent.getExceptionHandler());
	        return handler;
	    }

}
