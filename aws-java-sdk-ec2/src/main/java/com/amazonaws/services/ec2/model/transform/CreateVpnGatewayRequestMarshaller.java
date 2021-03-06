/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateVpnGatewayRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpnGatewayRequestMarshaller implements Marshaller<Request<CreateVpnGatewayRequest>, CreateVpnGatewayRequest> {

    public Request<CreateVpnGatewayRequest> marshall(CreateVpnGatewayRequest createVpnGatewayRequest) {

        if (createVpnGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateVpnGatewayRequest> request = new DefaultRequest<CreateVpnGatewayRequest>(createVpnGatewayRequest, "AmazonEC2");
        request.addParameter("Action", "CreateVpnGateway");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createVpnGatewayRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(createVpnGatewayRequest.getAvailabilityZone()));
        }

        if (createVpnGatewayRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(createVpnGatewayRequest.getType()));
        }

        if (createVpnGatewayRequest.getAmazonSideAsn() != null) {
            request.addParameter("AmazonSideAsn", StringUtils.fromLong(createVpnGatewayRequest.getAmazonSideAsn()));
        }

        return request;
    }

}
