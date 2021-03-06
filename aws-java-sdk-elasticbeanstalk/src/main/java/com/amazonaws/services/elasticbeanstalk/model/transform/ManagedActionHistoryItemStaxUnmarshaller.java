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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ManagedActionHistoryItem StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedActionHistoryItemStaxUnmarshaller implements Unmarshaller<ManagedActionHistoryItem, StaxUnmarshallerContext> {

    public ManagedActionHistoryItem unmarshall(StaxUnmarshallerContext context) throws Exception {
        ManagedActionHistoryItem managedActionHistoryItem = new ManagedActionHistoryItem();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return managedActionHistoryItem;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ActionId", targetDepth)) {
                    managedActionHistoryItem.setActionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ActionType", targetDepth)) {
                    managedActionHistoryItem.setActionType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ActionDescription", targetDepth)) {
                    managedActionHistoryItem.setActionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureType", targetDepth)) {
                    managedActionHistoryItem.setFailureType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    managedActionHistoryItem.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureDescription", targetDepth)) {
                    managedActionHistoryItem.setFailureDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExecutedTime", targetDepth)) {
                    managedActionHistoryItem.setExecutedTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FinishedTime", targetDepth)) {
                    managedActionHistoryItem.setFinishedTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return managedActionHistoryItem;
                }
            }
        }
    }

    private static ManagedActionHistoryItemStaxUnmarshaller instance;

    public static ManagedActionHistoryItemStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ManagedActionHistoryItemStaxUnmarshaller();
        return instance;
    }
}
