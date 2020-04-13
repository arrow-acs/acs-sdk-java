/*******************************************************************************
 * Copyright (c) 2018 Arrow Electronics, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License 2.0
 * which accompanies this distribution, and is available at
 * http://apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Arrow Electronics, Inc.
 *******************************************************************************/
package com.arrow.acs.client.model;

import java.util.ArrayList;
import java.util.List;

public class EventModel extends AuditableDocumentModelAbstract<EventModel> {
	private static final long serialVersionUID = 9104060834218772289L;

	@Override
	protected EventModel self() {
		return this;
	}

	private String applicationId;
	private String type;
	private String name;
	private String status;
	private String error;
	private String expired;
	private String objectId;
	private List<EventParametersModel> parameters = new ArrayList<>();

	public EventModel withApplicationId(String applicationId) {
		setApplicationId(applicationId);
		return this;
	}

	public EventModel withType(String type) {
		setType(type);
		return this;
	}

	public EventModel withName(String name) {
		setName(name);
		return this;
	}

	public EventModel withStatus(String status) {
		setStatus(status);
		return this;
	}

	public EventModel withParameters(List<EventParametersModel> parameters) {
		setParameters(parameters);
		return this;
	}

	public EventModel withError(String error) {
		setError(error);
		return this;
	}

	public EventModel withExpired(String expired) {
		setExpired(expired);
		return this;
	}

	public EventModel withObjectId(String objectId) {
		setObjectId(objectId);
		return this;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public List<EventParametersModel> getParameters() {
		return parameters;
	}

	public void setParameters(List<EventParametersModel> parameters) {
		this.parameters = parameters;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
}