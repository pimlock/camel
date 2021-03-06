/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.websocket;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedorigins":
        case "allowedOrigins": target.setAllowedOrigins(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "buffersize":
        case "bufferSize": target.setBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "crossoriginfilteron":
        case "crossOriginFilterOn": target.setCrossOriginFilterOn(property(camelContext, boolean.class, value)); return true;
        case "enablejmx":
        case "enableJmx": target.setEnableJmx(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filterpath":
        case "filterPath": target.setFilterPath(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxbinarymessagesize":
        case "maxBinaryMessageSize": target.setMaxBinaryMessageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxidletime":
        case "maxIdleTime": target.setMaxIdleTime(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxtextmessagesize":
        case "maxTextMessageSize": target.setMaxTextMessageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "minversion":
        case "minVersion": target.setMinVersion(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sendtimeout":
        case "sendTimeout": target.setSendTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sendtoall":
        case "sendToAll": target.setSendToAll(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "sessionsupport":
        case "sessionSupport": target.setSessionSupport(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "staticresources":
        case "staticResources": target.setStaticResources(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

