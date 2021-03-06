/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.paho;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PahoComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.paho.PahoConfiguration getOrCreateConfiguration(PahoComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.paho.PahoConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PahoComponent target = (PahoComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "automaticreconnect":
        case "automaticReconnect": getOrCreateConfiguration(target).setAutomaticReconnect(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "brokerurl":
        case "brokerUrl": getOrCreateConfiguration(target).setBrokerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "cleansession":
        case "cleanSession": getOrCreateConfiguration(target).setCleanSession(property(camelContext, boolean.class, value)); return true;
        case "client": target.setClient(property(camelContext, org.eclipse.paho.client.mqttv3.MqttClient.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.paho.PahoConfiguration.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": getOrCreateConfiguration(target).setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "customwebsocketheaders":
        case "customWebSocketHeaders": getOrCreateConfiguration(target).setCustomWebSocketHeaders(property(camelContext, java.util.Properties.class, value)); return true;
        case "executorservicetimeout":
        case "executorServiceTimeout": getOrCreateConfiguration(target).setExecutorServiceTimeout(property(camelContext, int.class, value)); return true;
        case "filepersistencedirectory":
        case "filePersistenceDirectory": getOrCreateConfiguration(target).setFilePersistenceDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "httpshostnameverificationenabled":
        case "httpsHostnameVerificationEnabled": getOrCreateConfiguration(target).setHttpsHostnameVerificationEnabled(property(camelContext, boolean.class, value)); return true;
        case "keepaliveinterval":
        case "keepAliveInterval": getOrCreateConfiguration(target).setKeepAliveInterval(property(camelContext, int.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxinflight":
        case "maxInflight": getOrCreateConfiguration(target).setMaxInflight(property(camelContext, int.class, value)); return true;
        case "maxreconnectdelay":
        case "maxReconnectDelay": getOrCreateConfiguration(target).setMaxReconnectDelay(property(camelContext, int.class, value)); return true;
        case "mqttversion":
        case "mqttVersion": getOrCreateConfiguration(target).setMqttVersion(property(camelContext, int.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "persistence": getOrCreateConfiguration(target).setPersistence(property(camelContext, org.apache.camel.component.paho.PahoPersistence.class, value)); return true;
        case "qos": getOrCreateConfiguration(target).setQos(property(camelContext, int.class, value)); return true;
        case "retained": getOrCreateConfiguration(target).setRetained(property(camelContext, boolean.class, value)); return true;
        case "serveruris":
        case "serverURIs": getOrCreateConfiguration(target).setServerURIs(property(camelContext, java.lang.String.class, value)); return true;
        case "socketfactory":
        case "socketFactory": getOrCreateConfiguration(target).setSocketFactory(property(camelContext, javax.net.SocketFactory.class, value)); return true;
        case "sslclientprops":
        case "sslClientProps": getOrCreateConfiguration(target).setSslClientProps(property(camelContext, java.util.Properties.class, value)); return true;
        case "sslhostnameverifier":
        case "sslHostnameVerifier": getOrCreateConfiguration(target).setSslHostnameVerifier(property(camelContext, javax.net.ssl.HostnameVerifier.class, value)); return true;
        case "username":
        case "userName": getOrCreateConfiguration(target).setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "willpayload":
        case "willPayload": getOrCreateConfiguration(target).setWillPayload(property(camelContext, java.lang.String.class, value)); return true;
        case "willqos":
        case "willQos": getOrCreateConfiguration(target).setWillQos(property(camelContext, int.class, value)); return true;
        case "willretained":
        case "willRetained": getOrCreateConfiguration(target).setWillRetained(property(camelContext, boolean.class, value)); return true;
        case "willtopic":
        case "willTopic": getOrCreateConfiguration(target).setWillTopic(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

