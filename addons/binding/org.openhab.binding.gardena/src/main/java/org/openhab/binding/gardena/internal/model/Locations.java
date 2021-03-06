/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.gardena.internal.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a List of Gardena locations.
 *
 * @author Gerhard Riegler - Initial contribution
 */
public class Locations {

    private List<Location> locations = new ArrayList<>();

    /**
     * Returns a list of Gardena locations.
     */
    public List<Location> getLocations() {
        return locations;
    }

}
