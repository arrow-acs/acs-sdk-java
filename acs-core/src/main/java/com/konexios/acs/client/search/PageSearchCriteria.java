/*******************************************************************************
 * Copyright 2021 Konexios, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.konexios.acs.client.search;

import com.konexios.acs.client.search.SearchCriteria;

public class PageSearchCriteria extends SearchCriteria {
	private static final String PAGE = "_page";
	private static final String SIZE = "_size";

	public PageSearchCriteria withPage(long page) {
		simpleCriteria.put(PAGE, Long.toString(page));
		return this;
	}

	public PageSearchCriteria withSize(long size) {
		simpleCriteria.put(SIZE, Long.toString(size));
		return this;
	}
}
