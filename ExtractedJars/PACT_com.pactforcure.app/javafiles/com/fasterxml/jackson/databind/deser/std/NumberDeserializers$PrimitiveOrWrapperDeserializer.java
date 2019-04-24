// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, NumberDeserializers

protected static abstract class NumberDeserializers$PrimitiveOrWrapperDeserializer extends StdScalarDeserializer
{

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(_primitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean _primitive>
	//*   2    4:ifeq            38
	//*   3    7:aload_1         
	//*   4    8:getstatic       #45  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//*   5   11:invokevirtual   #51  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   6   14:ifeq            38
			throw deserializationcontext.mappingException("Can not map Empty String as null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", new Object[] {
				handledType().toString()
			});
	//    7   17:aload_1         
	//    8   18:ldc1            #53  <String "Can not map Empty String as null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)">
	//    9   20:iconst_1        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:aload_0         
	//   14   27:invokevirtual   #59  <Method Class handledType()>
	//   15   30:invokevirtual   #63  <Method String Class.toString()>
	//   16   33:aastore         
	//   17   34:invokevirtual   #67  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   18   37:athrow          
		else
			return _nullValue;
	//   19   38:aload_0         
	//   20   39:getfield        #24  <Field Object _nullValue>
	//   21   42:areturn         
	}

	public final Object getNullValue()
	{
		return _nullValue;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object _nullValue>
	//    2    4:areturn         
	}

	public final Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(_primitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean _primitive>
	//*   2    4:ifeq            38
	//*   3    7:aload_1         
	//*   4    8:getstatic       #45  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//*   5   11:invokevirtual   #51  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   6   14:ifeq            38
			throw deserializationcontext.mappingException("Can not map JSON null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", new Object[] {
				handledType().toString()
			});
	//    7   17:aload_1         
	//    8   18:ldc1            #76  <String "Can not map JSON null into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)">
	//    9   20:iconst_1        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:aload_0         
	//   14   27:invokevirtual   #59  <Method Class handledType()>
	//   15   30:invokevirtual   #63  <Method String Class.toString()>
	//   16   33:aastore         
	//   17   34:invokevirtual   #67  <Method JsonMappingException DeserializationContext.mappingException(String, Object[])>
	//   18   37:athrow          
		else
			return _nullValue;
	//   19   38:aload_0         
	//   20   39:getfield        #24  <Field Object _nullValue>
	//   21   42:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Object _nullValue;
	protected final boolean _primitive;

	protected NumberDeserializers$PrimitiveOrWrapperDeserializer(Class class1, Object obj)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void StdScalarDeserializer(Class)>
		_nullValue = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Object _nullValue>
		_primitive = class1.isPrimitive();
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #30  <Method boolean Class.isPrimitive()>
	//    9   15:putfield        #32  <Field boolean _primitive>
	//   10   18:return          
	}
}
