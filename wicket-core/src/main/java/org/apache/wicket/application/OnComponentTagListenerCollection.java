/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.application;

import org.apache.wicket.Component;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.util.listener.ListenerCollection;

/**
 * Collection of on-component-tag listeners
 *
 * @author Igor Vaynberg (ivaynberg)
 */
public class OnComponentTagListenerCollection extends ListenerCollection<IOnComponentTagListener>
	implements IOnComponentTagListener {

	private static final long serialVersionUID = 1L;

	@Override
	public void onComponentTag(final Component component, final ComponentTag tag) {
		notify(new INotifier<IOnComponentTagListener>() {
			@Override
			public void notify(IOnComponentTagListener listener) {
				listener.onComponentTag(component, tag);
			}
		});
	}
}