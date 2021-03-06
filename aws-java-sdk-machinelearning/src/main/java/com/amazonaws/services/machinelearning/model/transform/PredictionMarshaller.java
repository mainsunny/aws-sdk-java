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
package com.amazonaws.services.machinelearning.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PredictionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PredictionMarshaller {

    private static final MarshallingInfo<String> PREDICTEDLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("predictedLabel").build();
    private static final MarshallingInfo<Float> PREDICTEDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("predictedValue").build();
    private static final MarshallingInfo<Map> PREDICTEDSCORES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("predictedScores").build();
    private static final MarshallingInfo<Map> DETAILS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("details").build();

    private static final PredictionMarshaller instance = new PredictionMarshaller();

    public static PredictionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Prediction prediction, ProtocolMarshaller protocolMarshaller) {

        if (prediction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(prediction.getPredictedLabel(), PREDICTEDLABEL_BINDING);
            protocolMarshaller.marshall(prediction.getPredictedValue(), PREDICTEDVALUE_BINDING);
            protocolMarshaller.marshall(prediction.getPredictedScores(), PREDICTEDSCORES_BINDING);
            protocolMarshaller.marshall(prediction.getDetails(), DETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
