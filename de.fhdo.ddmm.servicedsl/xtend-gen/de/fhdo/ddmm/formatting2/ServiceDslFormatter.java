/**
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.formatting2;

import com.google.inject.Inject;
import de.fhdo.ddmm.service.Microservice;
import de.fhdo.ddmm.service.ServiceModel;
import de.fhdo.ddmm.services.ServiceDslGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ServiceDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ServiceDslGrammarAccess _serviceDslGrammarAccess;
  
  protected void _format(final ServiceModel serviceModel, @Extension final IFormattableDocument document) {
    EList<Microservice> _microservices = serviceModel.getMicroservices();
    for (final Microservice microservice : _microservices) {
      document.<Microservice>format(microservice);
    }
  }
  
  public void format(final Object serviceModel, final IFormattableDocument document) {
    if (serviceModel instanceof XtextResource) {
      _format((XtextResource)serviceModel, document);
      return;
    } else if (serviceModel instanceof ServiceModel) {
      _format((ServiceModel)serviceModel, document);
      return;
    } else if (serviceModel instanceof EObject) {
      _format((EObject)serviceModel, document);
      return;
    } else if (serviceModel == null) {
      _format((Void)null, document);
      return;
    } else if (serviceModel != null) {
      _format(serviceModel, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(serviceModel, document).toString());
    }
  }
}
