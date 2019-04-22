// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdKeyDeserializer

static final class StdKeyDeserializer$EnumKD extends StdKeyDeserializer
{

	private EnumResolver _getToStringResolver(DeserializationContext deserializationcontext)
	{
		EnumResolver enumresolver;
		enumresolver = _byToStringResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field EnumResolver _byToStringResolver>
	//    2    4:astore_2        
		if(enumresolver != null)
			break MISSING_BLOCK_LABEL_35;
	//    3    5:aload_2         
	//    4    6:ifnonnull       35
		this;
	//    5    9:aload_0         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		deserializationcontext = ((DeserializationContext) (EnumResolver.constructUnsafeUsingToString(_byNameResolver.getEnumClass(), deserializationcontext.getAnnotationIntrospector())));
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field EnumResolver _byNameResolver>
	//    9   15:invokevirtual   #26  <Method Class EnumResolver.getEnumClass()>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #50  <Method com.fasterxml.jackson.databind.AnnotationIntrospector DeserializationContext.getAnnotationIntrospector()>
	//   12   22:invokestatic    #54  <Method EnumResolver EnumResolver.constructUnsafeUsingToString(Class, com.fasterxml.jackson.databind.AnnotationIntrospector)>
	//   13   25:astore_1        
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return ((EnumResolver) (deserializationcontext));
	//   16   28:aload_1         
	//   17   29:areturn         
		deserializationcontext;
	//   18   30:astore_1        
		this;
	//   19   31:aload_0         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw deserializationcontext;
	//   21   33:aload_1         
	//   22   34:athrow          
		return enumresolver;
	//   23   35:aload_2         
	//   24   36:areturn         
	}

	public Object _parse(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		Object obj;
		obj = ((Object) (_factory));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedMethod _factory>
	//    2    4:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_22;
	//    3    5:aload_3         
	//    4    6:ifnull          22
		obj = ((AnnotatedMethod) (obj)).call1(((Object) (s)));
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #66  <Method Object AnnotatedMethod.call1(Object)>
	//    8   14:astore_3        
		return obj;
	//    9   15:aload_3         
	//   10   16:areturn         
		Exception exception;
		exception;
	//   11   17:astore_3        
		ClassUtil.unwrapAndThrowAsIAE(((Throwable) (exception)));
	//   12   18:aload_3         
	//   13   19:invokestatic    #72  <Method void ClassUtil.unwrapAndThrowAsIAE(Throwable)>
		EnumResolver enumresolver;
		if(deserializationcontext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING))
	//*  14   22:aload_2         
	//*  15   23:getstatic       #78  <Field DeserializationFeature DeserializationFeature.READ_ENUMS_USING_TO_STRING>
	//*  16   26:invokevirtual   #82  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  17   29:ifeq            41
			enumresolver = _getToStringResolver(deserializationcontext);
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokespecial   #84  <Method EnumResolver _getToStringResolver(DeserializationContext)>
	//   21   37:astore_3        
		else
	//*  22   38:goto            46
			enumresolver = _byNameResolver;
	//   23   41:aload_0         
	//   24   42:getfield        #31  <Field EnumResolver _byNameResolver>
	//   25   45:astore_3        
		Enum enum = enumresolver.findEnum(s);
	//   26   46:aload_3         
	//   27   47:aload_1         
	//   28   48:invokevirtual   #88  <Method Enum EnumResolver.findEnum(String)>
	//   29   51:astore          4
		if(enum == null)
	//*  30   53:aload           4
	//*  31   55:ifnonnull       113
		{
			if(_enumDefaultValue != null && deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE))
	//*  32   58:aload_0         
	//*  33   59:getfield        #39  <Field Enum _enumDefaultValue>
	//*  34   62:ifnull          80
	//*  35   65:aload_2         
	//*  36   66:getstatic       #91  <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE>
	//*  37   69:invokevirtual   #82  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  38   72:ifeq            80
				return ((Object) (_enumDefaultValue));
	//   39   75:aload_0         
	//   40   76:getfield        #39  <Field Enum _enumDefaultValue>
	//   41   79:areturn         
			if(!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
	//*  42   80:aload_2         
	//*  43   81:getstatic       #94  <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  44   84:invokevirtual   #82  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  45   87:ifne            113
				return deserializationcontext.handleWeirdKey(_keyClass, s, "not one of values excepted for Enum class: %s", new Object[] {
					enumresolver.getEnumIds()
				});
	//   46   90:aload_2         
	//   47   91:aload_0         
	//   48   92:getfield        #98  <Field Class _keyClass>
	//   49   95:aload_1         
	//   50   96:ldc1            #100 <String "not one of values excepted for Enum class: %s">
	//   51   98:iconst_1        
	//   52   99:anewarray       Object[]
	//   53  102:dup             
	//   54  103:iconst_0        
	//   55  104:aload_3         
	//   56  105:invokevirtual   #106 <Method java.util.Collection EnumResolver.getEnumIds()>
	//   57  108:aastore         
	//   58  109:invokevirtual   #110 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//   59  112:areturn         
		}
		return ((Object) (enum));
	//   60  113:aload           4
	//   61  115:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final EnumResolver _byNameResolver;
	protected EnumResolver _byToStringResolver;
	protected final Enum _enumDefaultValue;
	protected final AnnotatedMethod _factory;

	protected StdKeyDeserializer$EnumKD(EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
	{
		super(-1, enumresolver.getEnumClass());
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_1         
	//    3    3:invokevirtual   #26  <Method Class EnumResolver.getEnumClass()>
	//    4    6:invokespecial   #29  <Method void StdKeyDeserializer(int, Class)>
		_byNameResolver = enumresolver;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #31  <Field EnumResolver _byNameResolver>
		_factory = annotatedmethod;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #33  <Field AnnotatedMethod _factory>
		_enumDefaultValue = enumresolver.getDefaultValue();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #37  <Method Enum EnumResolver.getDefaultValue()>
	//   14   24:putfield        #39  <Field Enum _enumDefaultValue>
	//   15   27:return          
	}
}
