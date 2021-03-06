/*******************************************************************************
 * Copyright 2016 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.intuit.wasabi.auditlog.impl;

import com.intuit.wasabi.eventlog.EventLogListener;
import com.intuit.wasabi.eventlog.events.EventLogEvent;

/**
 * The default NOOP audit log implementation.
 */
public class NoopAuditLogListenerImpl implements EventLogListener {

    /**
     * Will be called by the EventLogImpl with events which the listener registered for.
     * Since this will not be registered for any events, this will never be called.
     *
     * @param event the event which occurred.
     */
    @Override
    public void postEvent(EventLogEvent event) {
        // does nothing
    }

}
