package net.unnnn.events;

import net.unnnn.framework.events.Event;
import net.unnnn.framework.events.EventBus;

import java.util.ArrayList;
import java.util.UUID;

/**
 * 
 * @author ZengZhi
 *
 */
public class EventBusImpl implements EventBus {

	private UUID id;

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public void publish(Event event) {

	}

	@Override
	public void publish(ArrayList arrayList) {

	}

	@Override
	public void clear() {

	}

	@Override
	public boolean getDistributedTransactionSupported() {
		return false;
	}

	@Override
	public boolean getIsCompleted() {
		return false;
	}

	@Override
	public void commit() {

	}

	@Override
	public void rollback() {

	}
}