/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DebeziumSqlserverComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration getOrCreateConfiguration(DebeziumSqlserverComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumSqlserverComponent target = (DebeziumSqlserverComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": getOrCreateConfiguration(target).setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnblacklist":
        case "columnBlacklist": getOrCreateConfiguration(target).setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.debezium.configuration.SqlServerConnectorEmbeddedDebeziumConfiguration.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": getOrCreateConfiguration(target).setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistory":
        case "databaseHistory": getOrCreateConfiguration(target).setDatabaseHistory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": getOrCreateConfiguration(target).setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": getOrCreateConfiguration(target).setDatabaseHistoryKafkaBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": getOrCreateConfiguration(target).setDatabaseHistoryKafkaRecoveryAttempts(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": getOrCreateConfiguration(target).setDatabaseHistoryKafkaRecoveryPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": getOrCreateConfiguration(target).setDatabaseHistoryKafkaTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": getOrCreateConfiguration(target).setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": getOrCreateConfiguration(target).setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": getOrCreateConfiguration(target).setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseservername":
        case "databaseServerName": getOrCreateConfiguration(target).setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseservertimezone":
        case "databaseServerTimezone": getOrCreateConfiguration(target).setDatabaseServerTimezone(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseuser":
        case "databaseUser": getOrCreateConfiguration(target).setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": getOrCreateConfiguration(target).setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": getOrCreateConfiguration(target).setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": getOrCreateConfiguration(target).setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": getOrCreateConfiguration(target).setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": getOrCreateConfiguration(target).setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": getOrCreateConfiguration(target).setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": getOrCreateConfiguration(target).setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": getOrCreateConfiguration(target).setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": getOrCreateConfiguration(target).setOffsetCommitTimeoutMs(property(camelContext, long.class, value)); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": getOrCreateConfiguration(target).setOffsetFlushIntervalMs(property(camelContext, long.class, value)); return true;
        case "offsetstorage":
        case "offsetStorage": getOrCreateConfiguration(target).setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": getOrCreateConfiguration(target).setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": getOrCreateConfiguration(target).setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": getOrCreateConfiguration(target).setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": getOrCreateConfiguration(target).setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": getOrCreateConfiguration(target).setPollIntervalMs(property(camelContext, long.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": getOrCreateConfiguration(target).setSnapshotDelayMs(property(camelContext, long.class, value)); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": getOrCreateConfiguration(target).setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": getOrCreateConfiguration(target).setSnapshotLockTimeoutMs(property(camelContext, long.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": getOrCreateConfiguration(target).setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": getOrCreateConfiguration(target).setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": getOrCreateConfiguration(target).setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "tableblacklist":
        case "tableBlacklist": getOrCreateConfiguration(target).setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": getOrCreateConfiguration(target).setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tablewhitelist":
        case "tableWhitelist": getOrCreateConfiguration(target).setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": getOrCreateConfiguration(target).setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": getOrCreateConfiguration(target).setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

