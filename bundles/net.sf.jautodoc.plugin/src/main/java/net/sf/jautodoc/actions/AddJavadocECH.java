/*******************************************************************
 * Copyright (c) 2006 - 2019, Martin Kesting, All rights reserved.
 *
 * This software is licenced under the Eclipse Public License v1.0,
 * see the LICENSE file or http://www.eclipse.org/legal/epl-v10.html
 * for details.
 *******************************************************************/
package net.sf.jautodoc.actions;

import org.eclipse.ui.IEditorPart;

/**
 * The AddJavadoc Editor Command Handler.
 */
public class AddJavadocECH extends AbstractECH {

	/* (non-Javadoc)
	 * @see net.sf.jautodoc.actions.AbstractECH#execute(org.eclipse.ui.IEditorPart)
	 */
	protected void execute(IEditorPart activeEditor) {
		AddJavadocEAD ead = new AddJavadocEAD();
		ead.setActiveEditor(null, activeEditor);
		ead.run(null);
	}
}
