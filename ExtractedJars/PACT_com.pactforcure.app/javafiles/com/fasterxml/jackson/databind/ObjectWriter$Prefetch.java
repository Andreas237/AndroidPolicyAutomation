// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectWriter, JavaType, SerializationFeature, JsonSerializer

public static final class ObjectWriter$Prefetch
	implements Serializable
{

	public ObjectWriter$Prefetch forRootType(ObjectWriter objectwriter, JavaType javatype)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		boolean flag = flag1;
	//    2    3:iload           4
	//    3    5:istore_3        
		if(javatype != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
			if(javatype.isJavaLangObject())
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #51  <Method boolean JavaType.isJavaLangObject()>
	//*   8   14:ifeq            40
				flag = flag1;
	//    9   17:iload           4
	//   10   19:istore_3        
			else
	//*  11   20:iload_3         
	//*  12   21:ifeq            59
	//*  13   24:aload_0         
	//*  14   25:getfield        #35  <Field JavaType rootType>
	//*  15   28:ifnull          38
	//*  16   31:aload_0         
	//*  17   32:getfield        #37  <Field JsonSerializer valueSerializer>
	//*  18   35:ifnonnull       45
	//*  19   38:aload_0         
	//*  20   39:areturn         
				flag = false;
	//   21   40:iconst_0        
	//   22   41:istore_3        
		if(!flag) goto _L2; else goto _L1
_L1:
		if(rootType != null && valueSerializer != null) goto _L4; else goto _L3
_L3:
		return this;
	//*  23   42:goto            20
_L4:
		return new ObjectWriter$Prefetch(((JavaType) (null)), ((JsonSerializer) (null)), typeSerializer);
	//   24   45:new             #2   <Class ObjectWriter$Prefetch>
	//   25   48:dup             
	//   26   49:aconst_null     
	//   27   50:aconst_null     
	//   28   51:aload_0         
	//   29   52:getfield        #39  <Field TypeSerializer typeSerializer>
	//   30   55:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
	//   31   58:areturn         
_L2:
		if(javatype.equals(((Object) (rootType)))) goto _L3; else goto _L5
	//   32   59:aload_2         
	//   33   60:aload_0         
	//   34   61:getfield        #35  <Field JavaType rootType>
	//   35   64:invokevirtual   #55  <Method boolean JavaType.equals(Object)>
	//   36   67:ifne            38
_L5:
		if(!objectwriter.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH))
			break MISSING_BLOCK_LABEL_131;
	//   37   70:aload_1         
	//   38   71:getstatic       #61  <Field SerializationFeature SerializationFeature.EAGER_SERIALIZER_FETCH>
	//   39   74:invokevirtual   #65  <Method boolean ObjectWriter.isEnabled(SerializationFeature)>
	//   40   77:ifeq            131
		objectwriter = ((ObjectWriter) (objectwriter._serializerProvider()));
	//   41   80:aload_1         
	//   42   81:invokevirtual   #69  <Method DefaultSerializerProvider ObjectWriter._serializerProvider()>
	//   43   84:astore_1        
		objectwriter = ((ObjectWriter) (((DefaultSerializerProvider) (objectwriter)).findTypedValueSerializer(javatype, true, ((BeanProperty) (null)))));
	//   44   85:aload_1         
	//   45   86:aload_2         
	//   46   87:iconst_1        
	//   47   88:aconst_null     
	//   48   89:invokevirtual   #75  <Method JsonSerializer DefaultSerializerProvider.findTypedValueSerializer(JavaType, boolean, BeanProperty)>
	//   49   92:astore_1        
		if(objectwriter instanceof TypeWrappedSerializer)
	//*  50   93:aload_1         
	//*  51   94:instanceof      #77  <Class TypeWrappedSerializer>
	//*  52   97:ifeq            117
			return new ObjectWriter$Prefetch(javatype, ((JsonSerializer) (null)), ((TypeWrappedSerializer)objectwriter).typeSerializer());
	//   53  100:new             #2   <Class ObjectWriter$Prefetch>
	//   54  103:dup             
	//   55  104:aload_2         
	//   56  105:aconst_null     
	//   57  106:aload_1         
	//   58  107:checkcast       #77  <Class TypeWrappedSerializer>
	//   59  110:invokevirtual   #80  <Method TypeSerializer TypeWrappedSerializer.typeSerializer()>
	//   60  113:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
	//   61  116:areturn         
		objectwriter = ((ObjectWriter) (new ObjectWriter$Prefetch(javatype, ((JsonSerializer) (objectwriter)), ((TypeSerializer) (null)))));
	//   62  117:new             #2   <Class ObjectWriter$Prefetch>
	//   63  120:dup             
	//   64  121:aload_2         
	//   65  122:aload_1         
	//   66  123:aconst_null     
	//   67  124:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
	//   68  127:astore_1        
		return ((ObjectWriter$Prefetch) (objectwriter));
	//   69  128:aload_1         
	//   70  129:areturn         
		objectwriter;
	//   71  130:astore_1        
		return new ObjectWriter$Prefetch(((JavaType) (null)), ((JsonSerializer) (null)), typeSerializer);
	//   72  131:new             #2   <Class ObjectWriter$Prefetch>
	//   73  134:dup             
	//   74  135:aconst_null     
	//   75  136:aconst_null     
	//   76  137:aload_0         
	//   77  138:getfield        #39  <Field TypeSerializer typeSerializer>
	//   78  141:invokespecial   #28  <Method void ObjectWriter$Prefetch(JavaType, JsonSerializer, TypeSerializer)>
	//   79  144:areturn         
	}

	public final TypeSerializer getTypeSerializer()
	{
		return typeSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field TypeSerializer typeSerializer>
	//    2    4:areturn         
	}

	public final JsonSerializer getValueSerializer()
	{
		return valueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field JsonSerializer valueSerializer>
	//    2    4:areturn         
	}

	public boolean hasSerializer()
	{
		return valueSerializer != null || typeSerializer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field JsonSerializer valueSerializer>
	//    2    4:ifnonnull       14
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field TypeSerializer typeSerializer>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void serialize(JsonGenerator jsongenerator, Object obj, DefaultSerializerProvider defaultserializerprovider)
		throws IOException
	{
		if(typeSerializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field TypeSerializer typeSerializer>
	//*   2    4:ifnull          26
		{
			defaultserializerprovider.serializePolymorphic(jsongenerator, obj, rootType, valueSerializer, typeSerializer);
	//    3    7:aload_3         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field JavaType rootType>
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field JsonSerializer valueSerializer>
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field TypeSerializer typeSerializer>
	//   12   22:invokevirtual   #93  <Method void DefaultSerializerProvider.serializePolymorphic(JsonGenerator, Object, JavaType, JsonSerializer, TypeSerializer)>
			return;
	//   13   25:return          
		}
		if(valueSerializer != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #37  <Field JsonSerializer valueSerializer>
	//*  16   30:ifnull          48
		{
			defaultserializerprovider.serializeValue(jsongenerator, obj, rootType, valueSerializer);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:aload_0         
	//   21   37:getfield        #35  <Field JavaType rootType>
	//   22   40:aload_0         
	//   23   41:getfield        #37  <Field JsonSerializer valueSerializer>
	//   24   44:invokevirtual   #97  <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object, JavaType, JsonSerializer)>
			return;
	//   25   47:return          
		} else
		{
			defaultserializerprovider.serializeValue(jsongenerator, obj);
	//   26   48:aload_3         
	//   27   49:aload_1         
	//   28   50:aload_2         
	//   29   51:invokevirtual   #100 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
			return;
	//   30   54:return          
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
