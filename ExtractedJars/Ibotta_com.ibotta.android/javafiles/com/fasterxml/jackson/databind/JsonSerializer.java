// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonMappingException, SerializerProvider, JavaType

public abstract class JsonSerializer
	implements JsonFormatVisitable
{
	public static abstract class None extends JsonSerializer
	{

		public None()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #10  <Method void JsonSerializer()>
		//    2    4:return          
		}
	}


	public JsonSerializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #25  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	public JsonSerializer getDelegatee()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class handledType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return obj == null;
	//    0    0:aload_2         
	//    1    1:ifnonnull       6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	public boolean isEmpty(Object obj)
	{
		return isEmpty(((SerializerProvider) (null)), obj);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #40  <Method boolean isEmpty(SerializerProvider, Object)>
	//    4    6:ireturn         
	}

	public boolean isUnwrappingSerializer()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Iterator properties()
	{
		return ClassUtil.emptyIterator();
	//    0    0:invokestatic    #51  <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public JsonSerializer replaceDelegatee(JsonSerializer jsonserializer)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #56  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer = ((TypeSerializer) (handledType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Class handledType()>
	//    2    4:astore          4
		jsongenerator = ((JsonGenerator) (typeserializer));
	//    3    6:aload           4
	//    4    8:astore_2        
		if(typeserializer == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       19
			jsongenerator = ((JsonGenerator) (obj.getClass()));
	//    7   14:aload_1         
	//    8   15:invokevirtual   #69  <Method Class Object.getClass()>
	//    9   18:astore_2        
		serializerprovider.reportBadDefinition(((Class) (jsongenerator)), String.format("Type id handling not implemented for type %s (by serializer of type %s)", new Object[] {
			((Class) (jsongenerator)).getName(), ((Object)this).getClass().getName()
		}));
	//   10   19:aload_3         
	//   11   20:aload_2         
	//   12   21:ldc1            #71  <String "Type id handling not implemented for type %s (by serializer of type %s)">
	//   13   23:iconst_2        
	//   14   24:anewarray       Object[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #77  <Method String Class.getName()>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_1        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #69  <Method Class Object.getClass()>
	//   24   40:invokevirtual   #77  <Method String Class.getName()>
	//   25   43:aastore         
	//   26   44:invokestatic    #83  <Method String String.format(String, Object[])>
	//   27   47:invokevirtual   #89  <Method Object SerializerProvider.reportBadDefinition(Class, String)>
	//   28   50:pop             
	//   29   51:return          
	}

	public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean usesObjectId()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JsonSerializer withFilterId(Object obj)
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}
}
