// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonschema;

import java.lang.annotation.Annotation;

public interface JsonSerializableSchema
	extends Annotation
{

	public abstract String id();

	public abstract String schemaItemDefinition();

	public abstract String schemaObjectPropertiesDefinition();

	public abstract String schemaType();
}
