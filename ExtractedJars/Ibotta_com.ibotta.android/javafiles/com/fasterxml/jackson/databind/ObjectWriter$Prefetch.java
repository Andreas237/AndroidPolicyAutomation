// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectWriter, JavaType, JsonSerializer

public static final class ObjectWriter$Prefetch
	implements Serializable
{

	public void serialize(JsonGenerator jsongenerator, Object obj, DefaultSerializerProvider defaultserializerprovider)
		throws IOException
	{
		Object obj1 = ((Object) (typeSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field TypeSerializer typeSerializer>
	//    2    4:astore          4
		if(obj1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          28
		{
			defaultserializerprovider.serializePolymorphic(jsongenerator, obj, rootType, valueSerializer, ((TypeSerializer) (obj1)));
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #35  <Field JavaType rootType>
	//   10   18:aload_0         
	//   11   19:getfield        #37  <Field JsonSerializer valueSerializer>
	//   12   22:aload           4
	//   13   24:invokevirtual   #51  <Method void DefaultSerializerProvider.serializePolymorphic(JsonGenerator, Object, JavaType, JsonSerializer, TypeSerializer)>
			return;
	//   14   27:return          
		}
		obj1 = ((Object) (valueSerializer));
	//   15   28:aload_0         
	//   16   29:getfield        #37  <Field JsonSerializer valueSerializer>
	//   17   32:astore          4
		if(obj1 != null)
	//*  18   34:aload           4
	//*  19   36:ifnull          52
		{
			defaultserializerprovider.serializeValue(jsongenerator, obj, rootType, ((JsonSerializer) (obj1)));
	//   20   39:aload_3         
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:aload_0         
	//   24   43:getfield        #35  <Field JavaType rootType>
	//   25   46:aload           4
	//   26   48:invokevirtual   #55  <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType, JsonSerializer)>
			return;
	//   27   51:return          
		}
		obj1 = ((Object) (rootType));
	//   28   52:aload_0         
	//   29   53:getfield        #35  <Field JavaType rootType>
	//   30   56:astore          4
		if(obj1 != null)
	//*  31   58:aload           4
	//*  32   60:ifnull          72
		{
			defaultserializerprovider.serializeValue(jsongenerator, obj, ((JavaType) (obj1)));
	//   33   63:aload_3         
	//   34   64:aload_1         
	//   35   65:aload_2         
	//   36   66:aload           4
	//   37   68:invokevirtual   #58  <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType)>
			return;
	//   38   71:return          
		} else
		{
			defaultserializerprovider.serializeValue(jsongenerator, obj);
	//   39   72:aload_3         
	//   40   73:aload_1         
	//   41   74:aload_2         
	//   42   75:invokevirtual   #61  <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
			return;
	//   43   78:return          
		}
	}

	public static final ObjectWriter$Prefetch empty = new ObjectWriter$Prefetch(((JavaType) (null)), ((JsonSerializer) (null)), ((TypeSerializer) (null)));
	private static final long serialVersionUID = 1L;
	private final JavaType rootType;
	private final TypeSerializer typeSerializer;
	private final JsonSerializer valueSerializer;

	static 
	{
	//    0    0:new             #2   <Class ObjectWriter$Prefetch>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
	//    6   10:putstatic       #30  <Field ObjectWriter$Prefetch empty>
	//*   7   13:return          
	}

	private ObjectWriter$Prefetch(JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		rootType = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field JavaType rootType>
		valueSerializer = jsonserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field JsonSerializer valueSerializer>
		typeSerializer = typeserializer;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field TypeSerializer typeSerializer>
	//   11   19:return          
	}
}
