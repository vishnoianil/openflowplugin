/**
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.openflowplugin.openflow.md.core.session;

import java.util.EventListener;

import org.opendaylight.openflowplugin.openflow.md.core.SwitchConnectionDistinguisher;

/**
 * listens on session changes
 */
public interface SessionListener extends EventListener {

    /**
     * fired upon session added
     * @param sessionKey
     * @param context
     */
    void onSessionAdded(SwitchConnectionDistinguisher sessionKey, SessionContext context);

    /**
     * fired upon session removed
     * @param context
     */
    void onSessionRemoved(SessionContext context);

}
