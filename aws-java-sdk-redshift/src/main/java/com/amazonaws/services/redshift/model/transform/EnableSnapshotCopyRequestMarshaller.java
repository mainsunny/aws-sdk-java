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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * EnableSnapshotCopyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableSnapshotCopyRequestMarshaller implements Marshaller<Request<EnableSnapshotCopyRequest>, EnableSnapshotCopyRequest> {

    public Request<EnableSnapshotCopyRequest> marshall(EnableSnapshotCopyRequest enableSnapshotCopyRequest) {

        if (enableSnapshotCopyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<EnableSnapshotCopyRequest> request = new DefaultRequest<EnableSnapshotCopyRequest>(enableSnapshotCopyRequest, "AmazonRedshift");
        request.addParameter("Action", "EnableSnapshotCopy");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (enableSnapshotCopyRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(enableSnapshotCopyRequest.getClusterIdentifier()));
        }

        if (enableSnapshotCopyRequest.getDestinationRegion() != null) {
            request.addParameter("DestinationRegion", StringUtils.fromString(enableSnapshotCopyRequest.getDestinationRegion()));
        }

        if (enableSnapshotCopyRequest.getRetentionPeriod() != null) {
            request.addParameter("RetentionPeriod", StringUtils.fromInteger(enableSnapshotCopyRequest.getRetentionPeriod()));
        }

        if (enableSnapshotCopyRequest.getSnapshotCopyGrantName() != null) {
            request.addParameter("SnapshotCopyGrantName", StringUtils.fromString(enableSnapshotCopyRequest.getSnapshotCopyGrantName()));
        }

        return request;
    }

}
