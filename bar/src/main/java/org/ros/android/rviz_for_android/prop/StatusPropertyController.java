/*
 * Copyright (c) 2012, Willow Garage, Inc.
 * All rights reserved.
 *
 * Willow Garage licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.ros.android.rviz_for_android.prop;

import org.ros.android.rviz_for_android.prop.ReadOnlyProperty.StatusColor;

/**
 * A wrapper for the {@link ReadOnlyProperty} which provides convenience methods
 * @author azimmerman
 */
public class StatusPropertyController {
	private final ReadOnlyProperty prop;
	
	private String okMessage = "OK";
	
	public StatusPropertyController(ReadOnlyProperty prop) {
		this.prop = prop;
	}
	
	public void setOkMessage(String okMessage) {
		this.okMessage = okMessage;
	}
	
	public void setStatus(String status, StatusColor color) {
		prop.setValue(status);
		prop.setTextColor(color);
	}
	
	public void setOk() {
		setStatus(okMessage, StatusColor.OK);
	}
}
