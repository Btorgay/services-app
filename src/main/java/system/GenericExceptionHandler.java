/**
 *This class is for catching unexpected exceptions and directs it to a pretty error.xhtml 
 */
package system;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;

import javax.faces.FacesException;
import javax.faces.application.NavigationHandler;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

import org.apache.log4j.Logger;

/**
 * @author burak.torgay
 * 
 */
public class GenericExceptionHandler extends ExceptionHandlerWrapper {

	private static final Logger logger = Logger
			.getLogger(GenericExceptionHandler.class);
	    private ExceptionHandler wrapped;
	 
	    GenericExceptionHandler(ExceptionHandler exception) {
	        this.wrapped = exception;
	    }
	 
	    @Override
	    public ExceptionHandler getWrapped() {
	        return wrapped;
	    }
	 
	    @Override
	    public void handle() throws FacesException {
	 
	        final Iterator<ExceptionQueuedEvent> i = getUnhandledExceptionQueuedEvents().iterator();
	        while (i.hasNext()) {
	            ExceptionQueuedEvent event = i.next();
	            ExceptionQueuedEventContext context =
	                    (ExceptionQueuedEventContext) event.getSource();
	 
	            // get the exception from context
	            Throwable t = context.getException();
	 
	            final FacesContext fc = FacesContext.getCurrentInstance();
	            final Map<String, Object> requestMap = fc.getExternalContext().getRequestMap();
	            final NavigationHandler nav = fc.getApplication().getNavigationHandler();
	 
	            //here you do what ever you want with exception
	            try {
	 
	                //log error ?
	                logger.error("Critical Exception!", t);
	 
	                //redirect error page
	                requestMap.put("exceptionMessage", t.getMessage());
	                nav.handleNavigation(fc, null, "/welcome/error.xhtml?faces-redirect=true");

	                fc.renderResponse();
	 
	                // remove the comment below if you want to report the error in a jsf error message
	                //JsfUtil.addErrorMessage(t.getMessage());
	 
	            } finally {
	                //remove it from queue
	                i.remove();
	            }
	        }
	        //parent hanle
	        getWrapped().handle();
	    }
}
