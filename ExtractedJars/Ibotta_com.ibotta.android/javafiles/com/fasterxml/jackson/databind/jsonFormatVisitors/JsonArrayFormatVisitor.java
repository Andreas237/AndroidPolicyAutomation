// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

// Referenced classes of package com.fasterxml.jackson.databind.jsonFormatVisitors:
//			JsonFormatVisitorWithSerializerProvider, JsonFormatTypes, JsonFormatVisitable

public interface JsonArrayFormatVisitor
	extends JsonFormatVisitorWithSerializerProvider
{

	public abstract void itemsFormat(JsonFormatTypes jsonformattypes)
		throws JsonMappingException;

	public abstract void itemsFormat(JsonFormatVisitable jsonformatvisitable, JavaType javatype)
		throws JsonMappingException;
}
