/**
 * Copyright (C) 2013 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.jenkins.cascade;

/**
 * Show icon for a parent version update build.
 * 
 * @author Andrei Pozolotin
 */
public class DoParentBadge extends AbstractBadge {

	public DoParentBadge() {
		super("Parent", "parent.png");
	}

}
