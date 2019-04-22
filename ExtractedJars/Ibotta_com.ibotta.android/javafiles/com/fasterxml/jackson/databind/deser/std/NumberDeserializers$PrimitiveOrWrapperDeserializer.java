// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.AccessPattern;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer, NumberDeserializers

protected static abstract class NumberDeserializers$PrimitiveOrWrapperDeserializer extends StdScalarDeserializer
{

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return _emptyValue;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object _emptyValue>
	//    2    4:areturn         
	}

	public AccessPattern getNullAccessPattern()
	{
		if(_primitive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean _primitive>
	//*   2    4:ifeq            11
			return AccessPattern.DYNAMIC;
	//    3    7:getstatic       #51  <Field AccessPattern AccessPattern.DYNAMIC>
	//    4   10:areturn         
		if(_nullValue == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #25  <Field Object _nullValue>
	//*   7   15:ifnonnull       22
			return AccessPattern.ALWAYS_NULL;
	//    8   18:getstatic       #54  <Field AccessPattern AccessPattern.ALWAYS_NULL>
	//    9   21:areturn         
		else
			return AccessPattern.CONSTANT;
	//   10   22:getstatic       #57  <Field AccessPattern AccessPattern.CONSTANT>
	//   11   25:areturn         
	}

	public final Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(_primitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean _primitive>
	//*   2    4:ifeq            39
	//*   3    7:aload_1         
	//*   4    8:getstatic       #64  <Field DeserializationFeature DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES>
	//*   5   11:invokevirtual   #70  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   6   14:ifeq            39
			deserializationcontext.reportInputMismatch(((com.fasterxml.jackson.databind.JsonDeserializer) (this)), "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", new Object[] {
				handledType().toString()
			});
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:ldc1            #72  <String "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)">
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_0         
	//   15   28:invokevirtual   #78  <Method Class handledType()>
	//   16   31:invokevirtual   #82  <Method String Class.toString()>
	//   17   34:aastore         
	//   18   35:invokevirtual   #86  <Method Object DeserializationContext.reportInputMismatch(com.fasterxml.jackson.databind.JsonDeserializer, String, Object[])>
	//   19   38:pop             
		return _nullValue;
	//   20   39:aload_0         
	//   21   40:getfield        #25  <Field Object _nullValue>
	//   22   43:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Object _emptyValue;
	protected final Object _nullValue;
	protected final boolean _primitive;

	protected NumberDeserializers$PrimitiveOrWrapperDeserializer(Class class1, Object obj, Object obj1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void StdScalarDeserializer(Class)>
		_nullValue = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Object _nullValue>
		_emptyValue = obj1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Object _emptyValue>
		_primitive = class1.isPrimitive();
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #33  <Method boolean Class.isPrimitive()>
	//   12   20:putfield        #35  <Field boolean _primitive>
	//   13   23:return          
	}
}
