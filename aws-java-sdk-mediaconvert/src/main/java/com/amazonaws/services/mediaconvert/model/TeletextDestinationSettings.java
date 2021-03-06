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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for Teletext caption output
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TeletextDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TeletextDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a
     * three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of
     * Teletext data, do not use this field.
     */
    private String pageNumber;

    /**
     * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a
     * three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of
     * Teletext data, do not use this field.
     * 
     * @param pageNumber
     *        Set pageNumber to the Teletext page number for the destination captions for this output. This value must
     *        be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the
     *        entire set of Teletext data, do not use this field.
     */

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a
     * three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of
     * Teletext data, do not use this field.
     * 
     * @return Set pageNumber to the Teletext page number for the destination captions for this output. This value must
     *         be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the
     *         entire set of Teletext data, do not use this field.
     */

    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a
     * three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of
     * Teletext data, do not use this field.
     * 
     * @param pageNumber
     *        Set pageNumber to the Teletext page number for the destination captions for this output. This value must
     *        be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the
     *        entire set of Teletext data, do not use this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeletextDestinationSettings withPageNumber(String pageNumber) {
        setPageNumber(pageNumber);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPageNumber() != null)
            sb.append("PageNumber: ").append(getPageNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TeletextDestinationSettings == false)
            return false;
        TeletextDestinationSettings other = (TeletextDestinationSettings) obj;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        return hashCode;
    }

    @Override
    public TeletextDestinationSettings clone() {
        try {
            return (TeletextDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.TeletextDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
