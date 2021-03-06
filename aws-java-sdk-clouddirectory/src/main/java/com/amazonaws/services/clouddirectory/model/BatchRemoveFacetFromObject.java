/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A batch operation to remove a facet from an object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchRemoveFacetFromObject"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchRemoveFacetFromObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The facet to remove from the object.
     * </p>
     */
    private SchemaFacet schemaFacet;
    /**
     * <p>
     * A reference to the object whose facet will be removed.
     * </p>
     */
    private ObjectReference objectReference;

    /**
     * <p>
     * The facet to remove from the object.
     * </p>
     * 
     * @param schemaFacet
     *        The facet to remove from the object.
     */

    public void setSchemaFacet(SchemaFacet schemaFacet) {
        this.schemaFacet = schemaFacet;
    }

    /**
     * <p>
     * The facet to remove from the object.
     * </p>
     * 
     * @return The facet to remove from the object.
     */

    public SchemaFacet getSchemaFacet() {
        return this.schemaFacet;
    }

    /**
     * <p>
     * The facet to remove from the object.
     * </p>
     * 
     * @param schemaFacet
     *        The facet to remove from the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchRemoveFacetFromObject withSchemaFacet(SchemaFacet schemaFacet) {
        setSchemaFacet(schemaFacet);
        return this;
    }

    /**
     * <p>
     * A reference to the object whose facet will be removed.
     * </p>
     * 
     * @param objectReference
     *        A reference to the object whose facet will be removed.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * A reference to the object whose facet will be removed.
     * </p>
     * 
     * @return A reference to the object whose facet will be removed.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * A reference to the object whose facet will be removed.
     * </p>
     * 
     * @param objectReference
     *        A reference to the object whose facet will be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchRemoveFacetFromObject withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
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
        if (getSchemaFacet() != null)
            sb.append("SchemaFacet: ").append(getSchemaFacet()).append(",");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchRemoveFacetFromObject == false)
            return false;
        BatchRemoveFacetFromObject other = (BatchRemoveFacetFromObject) obj;
        if (other.getSchemaFacet() == null ^ this.getSchemaFacet() == null)
            return false;
        if (other.getSchemaFacet() != null && other.getSchemaFacet().equals(this.getSchemaFacet()) == false)
            return false;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaFacet() == null) ? 0 : getSchemaFacet().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        return hashCode;
    }

    @Override
    public BatchRemoveFacetFromObject clone() {
        try {
            return (BatchRemoveFacetFromObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchRemoveFacetFromObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
