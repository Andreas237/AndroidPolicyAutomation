// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

// Referenced classes of package com.fasterxml.jackson.databind.jsonFormatVisitors:
//			JsonFormatVisitorWithSerializerProvider, JsonFormatVisitable

public interface JsonMapFormatVisitor
	extends JsonFormatVisitorWithSerializerProvider
{

	public abstract void keyFormat(JsonFormatVisitable jsonformatvisitable, JavaType javatype)
		throws JsonMappingException;

	public abstract void valueFormat(JsonFormatVisitable jsonformatvisitable, JavaType javatype)
		throws JsonMappingException;
}
