// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.databind.*;
import java.lang.reflect.Type;

public interface SchemaAware
{

	public abstract JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException;

	public abstract JsonNode getSchema(SerializerProvider serializerprovider, Type type, boolean flag)
		throws JsonMappingException;
}
