// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdKeyDeserializer

static final class StdKeyDeserializer$EnumKD extends StdKeyDeserializer
{

	public Object _parse(String s, DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(_factory == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AnnotatedMethod _factory>
	//    2    4:ifnull          23
_L1:
		Object obj = _factory.call1(((Object) (s)));
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field AnnotatedMethod _factory>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #42  <Method Object AnnotatedMethod.call1(Object)>
	//    7   15:astore_3        
_L4:
		return obj;
	//    8   16:aload_3         
	//    9   17:areturn         
		obj;
	//   10   18:astore_3        
		ClassUtil.unwrapAndThrowAsIAE(((Throwable) (obj)));
	//   11   19:aload_3         
	//   12   20:invokestatic    #48  <Method void ClassUtil.unwrapAndThrowAsIAE(Throwable)>
_L2:
		Enum enum = _resolver.findEnum(s);
	//   13   23:aload_0         
	//   14   24:getfield        #27  <Field EnumResolver _resolver>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #52  <Method Enum EnumResolver.findEnum(String)>
	//   17   31:astore          4
		obj = ((Object) (enum));
	//   18   33:aload           4
	//   19   35:astore_3        
		if(enum == null)
	//*  20   36:aload           4
	//*  21   38:ifnonnull       16
		{
			obj = ((Object) (enum));
	//   22   41:aload           4
	//   23   43:astore_3        
			if(!deserializationcontext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
	//*  24   44:aload_2         
	//*  25   45:invokevirtual   #58  <Method DeserializationConfig DeserializationContext.getConfig()>
	//*  26   48:getstatic       #64  <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  27   51:invokevirtual   #70  <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//*  28   54:ifne            16
				throw deserializationcontext.weirdKeyException(_keyClass, s, "not one of values for Enum class");
	//   29   57:aload_2         
	//   30   58:aload_0         
	//   31   59:getfield        #74  <Field Class _keyClass>
	//   32   62:aload_1         
	//   33   63:ldc1            #76  <String "not one of values for Enum class">
	//   34   65:invokevirtual   #80  <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//   35   68:athrow          
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotatedMethod _factory;
	protected final EnumResolver _resolver;

	protected StdKeyDeserializer$EnumKD(EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
	{
		super(-1, enumresolver.getEnumClass());
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_1         
	//    3    3:invokevirtual   #22  <Method Class EnumResolver.getEnumClass()>
	//    4    6:invokespecial   #25  <Method void StdKeyDeserializer(int, Class)>
		_resolver = enumresolver;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #27  <Field EnumResolver _resolver>
		_factory = annotatedmethod;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #29  <Field AnnotatedMethod _factory>
	//   11   19:return          
	}
}
