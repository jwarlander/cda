/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/. */

package pt.webdetails.cda.dataaccess;

import org.pentaho.reporting.engine.classic.extensions.datasources.mondrian.AbstractNamedMDXDataFactory;

/**
 *
 * @author joao
 */
public interface ICubeFileProviderSetter {
    
    public void setCubeFileProvider(AbstractNamedMDXDataFactory factory, String catalog);
    
}
