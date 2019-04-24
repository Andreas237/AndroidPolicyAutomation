// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import java.io.Serializable;

public final class NullProvider
	implements Serializable
{

	public NullProvider(JavaType javatype, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		_nullValue = obj;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #25  <Field Object _nullValue>
		_isPrimitive = javatype.isPrimitive();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method boolean JavaType.isPrimitive()>
	//    8   14:putfield        #33  <Field boolean _isPrimitive>
		_rawType = javatype.getRawClass();
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #37  <Method Class JavaType.getRawClass()>
	//   12   22:putfield        #39  <Field Class _rawType>
	//   13   25:return          
	}

	public Object nullValue(DeserializationContext deserializationcontext)
		throws JsonProcessingException
	{
		if(_isPrimitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean _isPrimitive>
	//*   2    4:ifeq            38
	//*   3    7:aload_1         
	//*   4    8:getstatic       #50  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//*   5   11:invokevirtual   #56  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   6   14:ifeq            38
			throw deserializationcontext.mappingException("Can not map JSON null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", new Object[] {
				_rawType.getName()
			});
	//    7   17:aload_1         
	//    8   18:ldc1            #58  <String "Can not map JSON null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)">
	//    9   20:iconst_1        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:aload_0         
	//   14   27:getfield        #39  <Field Class _rawType>
	//   15   30:invokevirtual   #64  <Method String Class.getName()>
	//   16   33:aastore         
	//   17   34:invokevirtual   #68  <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   18   37:athrow          
		else
			return _nullValue;
	//   19   38:aload_0         
	//   20   39:getfield        #25  <Field Object _nullValue>
	//   21   42:areturn         
	}

	private static final long serialVersionUID = 1L;
	private final boolean _isPrimitive;
	private final Object _nullValue;
	private final Class _rawType;
}
