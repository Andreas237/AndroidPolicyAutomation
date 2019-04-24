// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.*;

// Referenced classes of package com.fasterxml.jackson.databind.jsonFormatVisitors:
//			JsonFormatVisitorWithSerializerProvider, JsonFormatVisitable

public interface JsonMapFormatVisitor
	extends JsonFormatVisitorWithSerializerProvider
{
	public static class Base
		implements JsonMapFormatVisitor
	{

		public SerializerProvider getProvider()
		{
			return _provider;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field SerializerProvider _provider>
		//    2    4:areturn         
		}

		public void keyFormat(JsonFormatVisitable jsonformatvisitable, JavaType javatype)
			throws JsonMappingException
		{
		//    0    0:return          
		}

		public void setProvider(SerializerProvider serializerprovider)
		{
			_provider = serializerprovider;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field SerializerProvider _provider>
		//    3    5:return          
		}

		public void valueFormat(JsonFormatVisitable jsonformatvisitable, JavaType javatype)
			throws JsonMappingException
		{
		//    0    0:return          
		}

		protected SerializerProvider _provider;

		public Base()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

		public Base(SerializerProvider serializerprovider)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			_provider = serializerprovider;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field SerializerProvider _provider>
		//    5    9:return          
		}
	}


	public abstract void keyFormat(JsonFormatVisitable jsonformatvisitable, JavaType javatype)
		throws JsonMappingException;

	public abstract void valueFormat(JsonFormatVisitable jsonformatvisitable, JavaType javatype)
		throws JsonMappingException;
}
