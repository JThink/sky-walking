package org.skywalking.apm.collector.core.worker;

/**
 * @author pengys5
 */
public interface LookUp {

    WorkerRefs lookup(Role role) throws WorkerNotFoundException;

    Provider findProvider(Role role) throws ProviderNotFoundException;
}
