// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.*;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			FromStringDeserializer

public class StdKeyDeserializer extends KeyDeserializer
	implements Serializable
{
	static final class DelegatingKD extends KeyDeserializer
		implements Serializable
	{

		public final Object deserializeKey(String s, DeserializationContext deserializationcontext)
			throws IOException
		{
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return ((Object) (null));
		//    2    4:aconst_null     
		//    3    5:areturn         
			Object obj = ((Object) (new TokenBuffer(deserializationcontext.getParser(), deserializationcontext)));
		//    4    6:new             #39  <Class TokenBuffer>
		//    5    9:dup             
		//    6   10:aload_2         
		//    7   11:invokevirtual   #45  <Method JsonParser DeserializationContext.getParser()>
		//    8   14:aload_2         
		//    9   15:invokespecial   #48  <Method void TokenBuffer(JsonParser, DeserializationContext)>
		//   10   18:astore_3        
			((TokenBuffer) (obj)).writeString(s);
		//   11   19:aload_3         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #52  <Method void TokenBuffer.writeString(String)>
			try
			{
				obj = ((Object) (((TokenBuffer) (obj)).asParser()));
		//   14   24:aload_3         
		//   15   25:invokevirtual   #55  <Method JsonParser TokenBuffer.asParser()>
		//   16   28:astore_3        
				((JsonParser) (obj)).nextToken();
		//   17   29:aload_3         
		//   18   30:invokevirtual   #61  <Method com.fasterxml.jackson.core.JsonToken JsonParser.nextToken()>
		//   19   33:pop             
				obj = _delegate.deserialize(((JsonParser) (obj)), deserializationcontext);
		//   20   34:aload_0         
		//   21   35:getfield        #28  <Field JsonDeserializer _delegate>
		//   22   38:aload_3         
		//   23   39:aload_2         
		//   24   40:invokevirtual   #67  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
		//   25   43:astore_3        
			}
		//*  26   44:aload_3         
		//*  27   45:ifnull          50
		//*  28   48:aload_3         
		//*  29   49:areturn         
		//*  30   50:aload_2         
		//*  31   51:aload_0         
		//*  32   52:getfield        #26  <Field Class _keyClass>
		//*  33   55:aload_1         
		//*  34   56:ldc1            #69  <String "not a valid representation">
		//*  35   58:iconst_0        
		//*  36   59:anewarray       Object[]
		//*  37   62:invokevirtual   #75  <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
		//*  38   65:astore_3        
		//*  39   66:aload_3         
		//*  40   67:areturn         
			catch(Exception exception)
		//*  41   68:astore_3        
			{
				return deserializationcontext.handleWeirdKey(_keyClass, s, "not a valid representation: %s", new Object[] {
					exception.getMessage()
				});
		//   42   69:aload_2         
		//   43   70:aload_0         
		//   44   71:getfield        #26  <Field Class _keyClass>
		//   45   74:aload_1         
		//   46   75:ldc1            #77  <String "not a valid representation: %s">
		//   47   77:iconst_1        
		//   48   78:anewarray       Object[]
		//   49   81:dup             
		//   50   82:iconst_0        
		//   51   83:aload_3         
		//   52   84:invokevirtual   #81  <Method String Exception.getMessage()>
		//   53   87:aastore         
		//   54   88:invokevirtual   #75  <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
		//   55   91:areturn         
			}
			if(obj != null)
				return obj;
			obj = deserializationcontext.handleWeirdKey(_keyClass, s, "not a valid representation", new Object[0]);
			return obj;
		}

		private static final long serialVersionUID = 1L;
		protected final JsonDeserializer _delegate;
		protected final Class _keyClass;

		protected DelegatingKD(Class class1, JsonDeserializer jsondeserializer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void KeyDeserializer()>
			_keyClass = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field Class _keyClass>
			_delegate = jsondeserializer;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field JsonDeserializer _delegate>
		//    8   14:return          
		}
	}

	static final class EnumKD extends StdKeyDeserializer
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

		protected EnumKD(EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
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

	static final class StringCtorKeyDeserializer extends StdKeyDeserializer
	{

		public Object _parse(String s, DeserializationContext deserializationcontext)
			throws Exception
		{
			return _ctor.newInstance(new Object[] {
				s
			});
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Constructor _ctor>
		//    2    4:iconst_1        
		//    3    5:anewarray       Object[]
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:aload_1         
		//    7   11:aastore         
		//    8   12:invokevirtual   #38  <Method Object Constructor.newInstance(Object[])>
		//    9   15:areturn         
		}

		private static final long serialVersionUID = 1L;
		protected final Constructor _ctor;

		public StringCtorKeyDeserializer(Constructor constructor)
		{
			super(-1, constructor.getDeclaringClass());
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:aload_1         
		//    3    3:invokevirtual   #20  <Method Class Constructor.getDeclaringClass()>
		//    4    6:invokespecial   #23  <Method void StdKeyDeserializer(int, Class)>
			_ctor = constructor;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #25  <Field Constructor _ctor>
		//    8   14:return          
		}
	}

	static final class StringFactoryKeyDeserializer extends StdKeyDeserializer
	{

		public Object _parse(String s, DeserializationContext deserializationcontext)
			throws Exception
		{
			return _factoryMethod.invoke(((Object) (null)), new Object[] {
				s
			});
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Method _factoryMethod>
		//    2    4:aconst_null     
		//    3    5:iconst_1        
		//    4    6:anewarray       Object[]
		//    5    9:dup             
		//    6   10:iconst_0        
		//    7   11:aload_1         
		//    8   12:aastore         
		//    9   13:invokevirtual   #35  <Method Object Method.invoke(Object, Object[])>
		//   10   16:areturn         
		}

		private static final long serialVersionUID = 1L;
		final Method _factoryMethod;

		public StringFactoryKeyDeserializer(Method method)
		{
			super(-1, method.getDeclaringClass());
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:aload_1         
		//    3    3:invokevirtual   #19  <Method Class Method.getDeclaringClass()>
		//    4    6:invokespecial   #22  <Method void StdKeyDeserializer(int, Class)>
			_factoryMethod = method;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #24  <Field Method _factoryMethod>
		//    8   14:return          
		}
	}

	static final class StringKD extends StdKeyDeserializer
	{

		public static StringKD forType(Class class1)
		{
			if(class1 == java/lang/String)
		//*   0    0:aload_0         
		//*   1    1:ldc1            #17  <Class String>
		//*   2    3:if_acmpne       10
				return sString;
		//    3    6:getstatic       #23  <Field StdKeyDeserializer$StringKD sString>
		//    4    9:areturn         
			if(class1 == java/lang/Object)
		//*   5   10:aload_0         
		//*   6   11:ldc1            #25  <Class Object>
		//*   7   13:if_acmpne       20
				return sObject;
		//    8   16:getstatic       #27  <Field StdKeyDeserializer$StringKD sObject>
		//    9   19:areturn         
			else
				return new StringKD(class1);
		//   10   20:new             #2   <Class StdKeyDeserializer$StringKD>
		//   11   23:dup             
		//   12   24:aload_0         
		//   13   25:invokespecial   #21  <Method void StdKeyDeserializer$StringKD(Class)>
		//   14   28:areturn         
		}

		public Object deserializeKey(String s, DeserializationContext deserializationcontext)
			throws IOException, JsonProcessingException
		{
			return ((Object) (s));
		//    0    0:aload_1         
		//    1    1:areturn         
		}

		private static final StringKD sObject = new StringKD(java/lang/Object);
		private static final StringKD sString = new StringKD(java/lang/String);
		private static final long serialVersionUID = 1L;

		static 
		{
		//    0    0:new             #2   <Class StdKeyDeserializer$StringKD>
		//    1    3:dup             
		//    2    4:ldc1            #17  <Class String>
		//    3    6:invokespecial   #21  <Method void StdKeyDeserializer$StringKD(Class)>
		//    4    9:putstatic       #23  <Field StdKeyDeserializer$StringKD sString>
		//    5   12:new             #2   <Class StdKeyDeserializer$StringKD>
		//    6   15:dup             
		//    7   16:ldc1            #25  <Class Object>
		//    8   18:invokespecial   #21  <Method void StdKeyDeserializer$StringKD(Class)>
		//    9   21:putstatic       #27  <Field StdKeyDeserializer$StringKD sObject>
		//*  10   24:return          
		}

		private StringKD(Class class1)
		{
			super(-1, class1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:aload_1         
		//    3    3:invokespecial   #31  <Method void StdKeyDeserializer(int, Class)>
		//    4    6:return          
		}
	}


	protected StdKeyDeserializer(int i, Class class1)
	{
		this(i, class1, ((FromStringDeserializer) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #39  <Method void StdKeyDeserializer(int, Class, FromStringDeserializer)>
	//    5    7:return          
	}

	protected StdKeyDeserializer(int i, Class class1, FromStringDeserializer fromstringdeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void KeyDeserializer()>
		_kind = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #47  <Field int _kind>
		_keyClass = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #49  <Field Class _keyClass>
		_deser = fromstringdeserializer;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #51  <Field FromStringDeserializer _deser>
	//   11   19:return          
	}

	public static StdKeyDeserializer forType(Class class1)
	{
label0:
		{
label1:
			{
				if(class1 == java/lang/String || class1 == java/lang/Object || class1 == java/lang/CharSequence)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #56  <Class String>
	//*   2    3:if_acmpeq       249
	//*   3    6:aload_0         
	//*   4    7:ldc1            #58  <Class Object>
	//*   5    9:if_acmpeq       249
	//*   6   12:aload_0         
	//*   7   13:ldc1            #60  <Class CharSequence>
	//*   8   15:if_acmpne       21
					break label0;
	//    9   18:goto            249
				byte byte0;
				if(class1 == java/util/UUID)
	//*  10   21:aload_0         
	//*  11   22:ldc1            #62  <Class UUID>
	//*  12   24:if_acmpne       33
					byte0 = 12;
	//   13   27:bipush          12
	//   14   29:istore_1        
				else
	//*  15   30:goto            237
				if(class1 == java/lang/Integer)
	//*  16   33:aload_0         
	//*  17   34:ldc1            #64  <Class Integer>
	//*  18   36:if_acmpne       44
					byte0 = 5;
	//   19   39:iconst_5        
	//   20   40:istore_1        
				else
	//*  21   41:goto            237
				if(class1 == java/lang/Long)
	//*  22   44:aload_0         
	//*  23   45:ldc1            #66  <Class Long>
	//*  24   47:if_acmpne       56
					byte0 = 6;
	//   25   50:bipush          6
	//   26   52:istore_1        
				else
	//*  27   53:goto            237
				if(class1 == java/util/Date)
	//*  28   56:aload_0         
	//*  29   57:ldc1            #68  <Class Date>
	//*  30   59:if_acmpne       68
					byte0 = 10;
	//   31   62:bipush          10
	//   32   64:istore_1        
				else
	//*  33   65:goto            237
				if(class1 == java/util/Calendar)
	//*  34   68:aload_0         
	//*  35   69:ldc1            #70  <Class Calendar>
	//*  36   71:if_acmpne       80
					byte0 = 11;
	//   37   74:bipush          11
	//   38   76:istore_1        
				else
	//*  39   77:goto            237
				if(class1 == java/lang/Boolean)
	//*  40   80:aload_0         
	//*  41   81:ldc1            #72  <Class Boolean>
	//*  42   83:if_acmpne       91
					byte0 = 1;
	//   43   86:iconst_1        
	//   44   87:istore_1        
				else
	//*  45   88:goto            237
				if(class1 == java/lang/Byte)
	//*  46   91:aload_0         
	//*  47   92:ldc1            #74  <Class Byte>
	//*  48   94:if_acmpne       102
					byte0 = 2;
	//   49   97:iconst_2        
	//   50   98:istore_1        
				else
	//*  51   99:goto            237
				if(class1 == java/lang/Character)
	//*  52  102:aload_0         
	//*  53  103:ldc1            #76  <Class Character>
	//*  54  105:if_acmpne       113
					byte0 = 4;
	//   55  108:iconst_4        
	//   56  109:istore_1        
				else
	//*  57  110:goto            237
				if(class1 == java/lang/Short)
	//*  58  113:aload_0         
	//*  59  114:ldc1            #78  <Class Short>
	//*  60  116:if_acmpne       124
					byte0 = 3;
	//   61  119:iconst_3        
	//   62  120:istore_1        
				else
	//*  63  121:goto            237
				if(class1 == java/lang/Float)
	//*  64  124:aload_0         
	//*  65  125:ldc1            #80  <Class Float>
	//*  66  127:if_acmpne       136
					byte0 = 7;
	//   67  130:bipush          7
	//   68  132:istore_1        
				else
	//*  69  133:goto            237
				if(class1 == java/lang/Double)
	//*  70  136:aload_0         
	//*  71  137:ldc1            #82  <Class Double>
	//*  72  139:if_acmpne       148
					byte0 = 8;
	//   73  142:bipush          8
	//   74  144:istore_1        
				else
	//*  75  145:goto            237
				if(class1 == java/net/URI)
	//*  76  148:aload_0         
	//*  77  149:ldc1            #84  <Class URI>
	//*  78  151:if_acmpne       160
					byte0 = 13;
	//   79  154:bipush          13
	//   80  156:istore_1        
				else
	//*  81  157:goto            237
				if(class1 == java/net/URL)
	//*  82  160:aload_0         
	//*  83  161:ldc1            #86  <Class URL>
	//*  84  163:if_acmpne       172
					byte0 = 14;
	//   85  166:bipush          14
	//   86  168:istore_1        
				else
	//*  87  169:goto            237
				if(class1 == java/lang/Class)
	//*  88  172:aload_0         
	//*  89  173:ldc1            #88  <Class Class>
	//*  90  175:if_acmpne       184
				{
					byte0 = 15;
	//   91  178:bipush          15
	//   92  180:istore_1        
				} else
	//*  93  181:goto            237
				{
					if(class1 == java/util/Locale)
	//*  94  184:aload_0         
	//*  95  185:ldc1            #90  <Class Locale>
	//*  96  187:if_acmpne       206
						return new StdKeyDeserializer(9, class1, ((FromStringDeserializer) (FromStringDeserializer.findDeserializer(java/util/Locale))));
	//   97  190:new             #2   <Class StdKeyDeserializer>
	//   98  193:dup             
	//   99  194:bipush          9
	//  100  196:aload_0         
	//  101  197:ldc1            #90  <Class Locale>
	//  102  199:invokestatic    #96  <Method FromStringDeserializer$Std FromStringDeserializer.findDeserializer(Class)>
	//  103  202:invokespecial   #39  <Method void StdKeyDeserializer(int, Class, FromStringDeserializer)>
	//  104  205:areturn         
					if(class1 == java/util/Currency)
	//* 105  206:aload_0         
	//* 106  207:ldc1            #98  <Class Currency>
	//* 107  209:if_acmpne       228
						return new StdKeyDeserializer(16, class1, ((FromStringDeserializer) (FromStringDeserializer.findDeserializer(java/util/Currency))));
	//  108  212:new             #2   <Class StdKeyDeserializer>
	//  109  215:dup             
	//  110  216:bipush          16
	//  111  218:aload_0         
	//  112  219:ldc1            #98  <Class Currency>
	//  113  221:invokestatic    #96  <Method FromStringDeserializer$Std FromStringDeserializer.findDeserializer(Class)>
	//  114  224:invokespecial   #39  <Method void StdKeyDeserializer(int, Class, FromStringDeserializer)>
	//  115  227:areturn         
					if(class1 != [B)
						break label1;
	//  116  228:aload_0         
	//  117  229:ldc1            #100 <Class byte[]>
	//  118  231:if_acmpne       247
					byte0 = 17;
	//  119  234:bipush          17
	//  120  236:istore_1        
				}
				return new StdKeyDeserializer(((int) (byte0)), class1);
	//  121  237:new             #2   <Class StdKeyDeserializer>
	//  122  240:dup             
	//  123  241:iload_1         
	//  124  242:aload_0         
	//  125  243:invokespecial   #102 <Method void StdKeyDeserializer(int, Class)>
	//  126  246:areturn         
			}
			return null;
	//  127  247:aconst_null     
	//  128  248:areturn         
		}
		return ((StdKeyDeserializer) (StringKD.forType(class1)));
	//  129  249:aload_0         
	//  130  250:invokestatic    #105 <Method StdKeyDeserializer$StringKD StdKeyDeserializer$StringKD.forType(Class)>
	//  131  253:areturn         
	}

	protected Object _parse(String s, DeserializationContext deserializationcontext)
		throws Exception
	{
		Exception exception2;
		switch(_kind)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int _kind>
		{
	//*   2    4:tableswitch     1 17: default 88
	//	               1 466
	//	               2 422
	//	               3 377
	//	               4 344
	//	               5 335
	//	               6 326
	//	               7 316
	//	               8 307
	//	               9 282
	//	               10 276
	//	               11 266
	//	               12 246
	//	               13 226
	//	               14 202
	//	               15 176
	//	               16 151
	//	               17 124
		default:
			s = ((String) (new StringBuilder()));
	//    3   88:new             #116 <Class StringBuilder>
	//    4   91:dup             
	//    5   92:invokespecial   #117 <Method void StringBuilder()>
	//    6   95:astore_1        
			((StringBuilder) (s)).append("Internal error: unknown key type ");
	//    7   96:aload_1         
	//    8   97:ldc1            #119 <String "Internal error: unknown key type ">
	//    9   99:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   10  102:pop             
			((StringBuilder) (s)).append(((Object) (_keyClass)));
	//   11  103:aload_1         
	//   12  104:aload_0         
	//   13  105:getfield        #49  <Field Class _keyClass>
	//   14  108:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   15  111:pop             
			throw new IllegalStateException(((StringBuilder) (s)).toString());
	//   16  112:new             #128 <Class IllegalStateException>
	//   17  115:dup             
	//   18  116:aload_1         
	//   19  117:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   20  120:invokespecial   #135 <Method void IllegalStateException(String)>
	//   21  123:athrow          

		case 17: // '\021'
			byte abyte0[];
			try
			{
				abyte0 = deserializationcontext.getConfig().getBase64Variant().decode(s);
	//   22  124:aload_2         
	//   23  125:invokevirtual   #141 <Method DeserializationConfig DeserializationContext.getConfig()>
	//   24  128:invokevirtual   #147 <Method Base64Variant DeserializationConfig.getBase64Variant()>
	//   25  131:aload_1         
	//   26  132:invokevirtual   #153 <Method byte[] Base64Variant.decode(String)>
	//   27  135:astore          4
			}
	//*  28  137:aload           4
	//*  29  139:areturn         
			catch(IllegalArgumentException illegalargumentexception)
	//*  30  140:astore          4
			{
				return _weirdKey(deserializationcontext, s, ((Exception) (illegalargumentexception)));
	//   31  142:aload_0         
	//   32  143:aload_2         
	//   33  144:aload_1         
	//   34  145:aload           4
	//   35  147:invokevirtual   #157 <Method Object _weirdKey(DeserializationContext, String, Exception)>
	//   36  150:areturn         
			}
			return ((Object) (abyte0));

		case 16: // '\020'
			Object obj;
			try
			{
				obj = _deser._deserialize(s, deserializationcontext);
	//   37  151:aload_0         
	//   38  152:getfield        #51  <Field FromStringDeserializer _deser>
	//   39  155:aload_1         
	//   40  156:aload_2         
	//   41  157:invokevirtual   #160 <Method Object FromStringDeserializer._deserialize(String, DeserializationContext)>
	//   42  160:astore          4
			}
	//*  43  162:aload           4
	//*  44  164:areturn         
			catch(IllegalArgumentException illegalargumentexception1)
	//*  45  165:astore          4
			{
				return _weirdKey(deserializationcontext, s, ((Exception) (illegalargumentexception1)));
	//   46  167:aload_0         
	//   47  168:aload_2         
	//   48  169:aload_1         
	//   49  170:aload           4
	//   50  172:invokevirtual   #157 <Method Object _weirdKey(DeserializationContext, String, Exception)>
	//   51  175:areturn         
			}
			return obj;

		case 15: // '\017'
			Class class1;
			try
			{
				class1 = deserializationcontext.findClass(s);
	//   52  176:aload_2         
	//   53  177:aload_1         
	//   54  178:invokevirtual   #164 <Method Class DeserializationContext.findClass(String)>
	//   55  181:astore          4
			}
	//*  56  183:aload           4
	//*  57  185:areturn         
	//*  58  186:aload_2         
	//*  59  187:aload_0         
	//*  60  188:getfield        #49  <Field Class _keyClass>
	//*  61  191:aload_1         
	//*  62  192:ldc1            #166 <String "unable to parse key as Class">
	//*  63  194:iconst_0        
	//*  64  195:anewarray       Object[]
	//*  65  198:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//*  66  201:areturn         
	//*  67  202:new             #86  <Class URL>
	//*  68  205:dup             
	//*  69  206:aload_1         
	//*  70  207:invokespecial   #171 <Method void URL(String)>
	//*  71  210:astore          4
	//*  72  212:aload           4
	//*  73  214:areturn         
	//*  74  215:astore          4
	//*  75  217:aload_0         
	//*  76  218:aload_2         
	//*  77  219:aload_1         
	//*  78  220:aload           4
	//*  79  222:invokevirtual   #157 <Method Object _weirdKey(DeserializationContext, String, Exception)>
	//*  80  225:areturn         
	//*  81  226:aload_1         
	//*  82  227:invokestatic    #175 <Method URI URI.create(String)>
	//*  83  230:astore          4
	//*  84  232:aload           4
	//*  85  234:areturn         
	//*  86  235:astore          4
	//*  87  237:aload_0         
	//*  88  238:aload_2         
	//*  89  239:aload_1         
	//*  90  240:aload           4
	//*  91  242:invokevirtual   #157 <Method Object _weirdKey(DeserializationContext, String, Exception)>
	//*  92  245:areturn         
	//*  93  246:aload_1         
	//*  94  247:invokestatic    #179 <Method UUID UUID.fromString(String)>
	//*  95  250:astore          4
	//*  96  252:aload           4
	//*  97  254:areturn         
	//*  98  255:astore          4
	//*  99  257:aload_0         
	//* 100  258:aload_2         
	//* 101  259:aload_1         
	//* 102  260:aload           4
	//* 103  262:invokevirtual   #157 <Method Object _weirdKey(DeserializationContext, String, Exception)>
	//* 104  265:areturn         
	//* 105  266:aload_2         
	//* 106  267:aload_2         
	//* 107  268:aload_1         
	//* 108  269:invokevirtual   #183 <Method Date DeserializationContext.parseDate(String)>
	//* 109  272:invokevirtual   #187 <Method Calendar DeserializationContext.constructCalendar(Date)>
	//* 110  275:areturn         
	//* 111  276:aload_2         
	//* 112  277:aload_1         
	//* 113  278:invokevirtual   #183 <Method Date DeserializationContext.parseDate(String)>
	//* 114  281:areturn         
	//* 115  282:aload_0         
	//* 116  283:getfield        #51  <Field FromStringDeserializer _deser>
	//* 117  286:aload_1         
	//* 118  287:aload_2         
	//* 119  288:invokevirtual   #160 <Method Object FromStringDeserializer._deserialize(String, DeserializationContext)>
	//* 120  291:astore          4
	//* 121  293:aload           4
	//* 122  295:areturn         
	//* 123  296:astore          4
	//* 124  298:aload_0         
	//* 125  299:aload_2         
	//* 126  300:aload_1         
	//* 127  301:aload           4
	//* 128  303:invokevirtual   #157 <Method Object _weirdKey(DeserializationContext, String, Exception)>
	//* 129  306:areturn         
	//* 130  307:aload_0         
	//* 131  308:aload_1         
	//* 132  309:invokevirtual   #191 <Method double _parseDouble(String)>
	//* 133  312:invokestatic    #195 <Method Double Double.valueOf(double)>
	//* 134  315:areturn         
	//* 135  316:aload_0         
	//* 136  317:aload_1         
	//* 137  318:invokevirtual   #191 <Method double _parseDouble(String)>
	//* 138  321:d2f             
	//* 139  322:invokestatic    #198 <Method Float Float.valueOf(float)>
	//* 140  325:areturn         
	//* 141  326:aload_0         
	//* 142  327:aload_1         
	//* 143  328:invokevirtual   #202 <Method long _parseLong(String)>
	//* 144  331:invokestatic    #205 <Method Long Long.valueOf(long)>
	//* 145  334:areturn         
	//* 146  335:aload_0         
	//* 147  336:aload_1         
	//* 148  337:invokevirtual   #209 <Method int _parseInt(String)>
	//* 149  340:invokestatic    #212 <Method Integer Integer.valueOf(int)>
	//* 150  343:areturn         
	//* 151  344:aload_1         
	//* 152  345:invokevirtual   #216 <Method int String.length()>
	//* 153  348:iconst_1        
	//* 154  349:icmpne          361
	//* 155  352:aload_1         
	//* 156  353:iconst_0        
	//* 157  354:invokevirtual   #220 <Method char String.charAt(int)>
	//* 158  357:invokestatic    #223 <Method Character Character.valueOf(char)>
	//* 159  360:areturn         
	//* 160  361:aload_2         
	//* 161  362:aload_0         
	//* 162  363:getfield        #49  <Field Class _keyClass>
	//* 163  366:aload_1         
	//* 164  367:ldc1            #225 <String "can only convert 1-character Strings">
	//* 165  369:iconst_0        
	//* 166  370:anewarray       Object[]
	//* 167  373:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//* 168  376:areturn         
	//* 169  377:aload_0         
	//* 170  378:aload_1         
	//* 171  379:invokevirtual   #209 <Method int _parseInt(String)>
	//* 172  382:istore_3        
	//* 173  383:iload_3         
	//* 174  384:sipush          -32768
	//* 175  387:icmplt          406
	//* 176  390:iload_3         
	//* 177  391:sipush          32767
	//* 178  394:icmple          400
	//* 179  397:goto            406
	//* 180  400:iload_3         
	//* 181  401:int2short       
	//* 182  402:invokestatic    #228 <Method Short Short.valueOf(short)>
	//* 183  405:areturn         
	//* 184  406:aload_2         
	//* 185  407:aload_0         
	//* 186  408:getfield        #49  <Field Class _keyClass>
	//* 187  411:aload_1         
	//* 188  412:ldc1            #230 <String "overflow, value cannot be represented as 16-bit value">
	//* 189  414:iconst_0        
	//* 190  415:anewarray       Object[]
	//* 191  418:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//* 192  421:areturn         
	//* 193  422:aload_0         
	//* 194  423:aload_1         
	//* 195  424:invokevirtual   #209 <Method int _parseInt(String)>
	//* 196  427:istore_3        
	//* 197  428:iload_3         
	//* 198  429:bipush          -128
	//* 199  431:icmplt          450
	//* 200  434:iload_3         
	//* 201  435:sipush          255
	//* 202  438:icmple          444
	//* 203  441:goto            450
	//* 204  444:iload_3         
	//* 205  445:int2byte        
	//* 206  446:invokestatic    #233 <Method Byte Byte.valueOf(byte)>
	//* 207  449:areturn         
	//* 208  450:aload_2         
	//* 209  451:aload_0         
	//* 210  452:getfield        #49  <Field Class _keyClass>
	//* 211  455:aload_1         
	//* 212  456:ldc1            #235 <String "overflow, value cannot be represented as 8-bit value">
	//* 213  458:iconst_0        
	//* 214  459:anewarray       Object[]
	//* 215  462:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//* 216  465:areturn         
	//* 217  466:ldc1            #237 <String "true">
	//* 218  468:aload_1         
	//* 219  469:invokevirtual   #241 <Method boolean String.equals(Object)>
	//* 220  472:ifeq            479
	//* 221  475:getstatic       #245 <Field Boolean Boolean.TRUE>
	//* 222  478:areturn         
	//* 223  479:ldc1            #247 <String "false">
	//* 224  481:aload_1         
	//* 225  482:invokevirtual   #241 <Method boolean String.equals(Object)>
	//* 226  485:ifeq            492
	//* 227  488:getstatic       #250 <Field Boolean Boolean.FALSE>
	//* 228  491:areturn         
	//* 229  492:aload_2         
	//* 230  493:aload_0         
	//* 231  494:getfield        #49  <Field Class _keyClass>
	//* 232  497:aload_1         
	//* 233  498:ldc1            #252 <String "value not 'true' or 'false'">
	//* 234  500:iconst_0        
	//* 235  501:anewarray       Object[]
	//* 236  504:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//* 237  507:areturn         
			// Misplaced declaration of an exception variable
			catch(Exception exception2)
			{
				return deserializationcontext.handleWeirdKey(_keyClass, s, "unable to parse key as Class", new Object[0]);
			}
			return ((Object) (class1));

		case 14: // '\016'
			URL url;
			try
			{
				url = new URL(s);
			}
			catch(MalformedURLException malformedurlexception)
			{
				return _weirdKey(deserializationcontext, s, ((Exception) (malformedurlexception)));
			}
			return ((Object) (url));

		case 13: // '\r'
			URI uri;
			try
			{
				uri = URI.create(s);
			}
			catch(Exception exception)
			{
				return _weirdKey(deserializationcontext, s, exception);
			}
			return ((Object) (uri));

		case 12: // '\f'
			UUID uuid;
			try
			{
				uuid = UUID.fromString(s);
			}
			catch(Exception exception1)
			{
				return _weirdKey(deserializationcontext, s, exception1);
			}
			return ((Object) (uuid));

		case 11: // '\013'
			return ((Object) (deserializationcontext.constructCalendar(deserializationcontext.parseDate(s))));

		case 10: // '\n'
			return ((Object) (deserializationcontext.parseDate(s)));

		case 9: // '\t'
			Object obj1;
			try
			{
				obj1 = _deser._deserialize(s, deserializationcontext);
			}
			catch(IllegalArgumentException illegalargumentexception2)
			{
				return _weirdKey(deserializationcontext, s, ((Exception) (illegalargumentexception2)));
			}
			return obj1;

		case 8: // '\b'
			return ((Object) (Double.valueOf(_parseDouble(s))));

		case 7: // '\007'
			return ((Object) (Float.valueOf((float)_parseDouble(s))));

		case 6: // '\006'
			return ((Object) (Long.valueOf(_parseLong(s))));

		case 5: // '\005'
			return ((Object) (Integer.valueOf(_parseInt(s))));

		case 4: // '\004'
			if(s.length() == 1)
				return ((Object) (Character.valueOf(s.charAt(0))));
			else
				return deserializationcontext.handleWeirdKey(_keyClass, s, "can only convert 1-character Strings", new Object[0]);

		case 3: // '\003'
			int i = _parseInt(s);
			if(i >= -32768 && i <= 32767)
				return ((Object) (Short.valueOf((short)i)));
			else
				return deserializationcontext.handleWeirdKey(_keyClass, s, "overflow, value cannot be represented as 16-bit value", new Object[0]);

		case 2: // '\002'
			int j = _parseInt(s);
			if(j >= -128 && j <= 255)
				return ((Object) (Byte.valueOf((byte)j)));
			else
				return deserializationcontext.handleWeirdKey(_keyClass, s, "overflow, value cannot be represented as 8-bit value", new Object[0]);

		case 1: // '\001'
			break;
		}
		if("true".equals(((Object) (s))))
			return ((Object) (Boolean.TRUE));
		if("false".equals(((Object) (s))))
			return ((Object) (Boolean.FALSE));
		else
			return deserializationcontext.handleWeirdKey(_keyClass, s, "value not 'true' or 'false'", new Object[0]);
	//* 238  508:astore          4
	//* 239  510:goto            186
	}

	protected double _parseDouble(String s)
		throws IllegalArgumentException
	{
		return NumberInput.parseDouble(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #258 <Method double NumberInput.parseDouble(String)>
	//    2    4:dreturn         
	}

	protected int _parseInt(String s)
		throws IllegalArgumentException
	{
		return Integer.parseInt(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #261 <Method int Integer.parseInt(String)>
	//    2    4:ireturn         
	}

	protected long _parseLong(String s)
		throws IllegalArgumentException
	{
		return Long.parseLong(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #264 <Method long Long.parseLong(String)>
	//    2    4:lreturn         
	}

	protected Object _weirdKey(DeserializationContext deserializationcontext, String s, Exception exception)
		throws IOException
	{
		return deserializationcontext.handleWeirdKey(_keyClass, s, "problem: %s", new Object[] {
			exception.getMessage()
		});
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field Class _keyClass>
	//    3    5:aload_2         
	//    4    6:ldc2            #268 <String "problem: %s">
	//    5    9:iconst_1        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_3         
	//   10   16:invokevirtual   #271 <Method String Exception.getMessage()>
	//   11   19:aastore         
	//   12   20:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//   13   23:areturn         
	}

	public Object deserializeKey(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj;
		try
		{
			obj = _parse(s, deserializationcontext);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #274 <Method Object _parse(String, DeserializationContext)>
	//    8   12:astore_3        
		}
	//*   9   13:aload_3         
	//*  10   14:ifnull          19
	//*  11   17:aload_3         
	//*  12   18:areturn         
	//*  13   19:aload_0         
	//*  14   20:getfield        #49  <Field Class _keyClass>
	//*  15   23:invokevirtual   #278 <Method boolean Class.isEnum()>
	//*  16   26:ifeq            44
	//*  17   29:aload_2         
	//*  18   30:invokevirtual   #141 <Method DeserializationConfig DeserializationContext.getConfig()>
	//*  19   33:getstatic       #284 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  20   36:invokevirtual   #288 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//*  21   39:ifeq            44
	//*  22   42:aconst_null     
	//*  23   43:areturn         
	//*  24   44:aload_2         
	//*  25   45:aload_0         
	//*  26   46:getfield        #49  <Field Class _keyClass>
	//*  27   49:aload_1         
	//*  28   50:ldc2            #290 <String "not a valid representation">
	//*  29   53:iconst_0        
	//*  30   54:anewarray       Object[]
	//*  31   57:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//*  32   60:areturn         
		catch(Exception exception)
	//*  33   61:astore_3        
		{
			return deserializationcontext.handleWeirdKey(_keyClass, s, "not a valid representation, problem: (%s) %s", new Object[] {
				((Object) (exception)).getClass().getName(), exception.getMessage()
			});
	//   34   62:aload_2         
	//   35   63:aload_0         
	//   36   64:getfield        #49  <Field Class _keyClass>
	//   37   67:aload_1         
	//   38   68:ldc2            #292 <String "not a valid representation, problem: (%s) %s">
	//   39   71:iconst_2        
	//   40   72:anewarray       Object[]
	//   41   75:dup             
	//   42   76:iconst_0        
	//   43   77:aload_3         
	//   44   78:invokevirtual   #296 <Method Class Object.getClass()>
	//   45   81:invokevirtual   #299 <Method String Class.getName()>
	//   46   84:aastore         
	//   47   85:dup             
	//   48   86:iconst_1        
	//   49   87:aload_3         
	//   50   88:invokevirtual   #271 <Method String Exception.getMessage()>
	//   51   91:aastore         
	//   52   92:invokevirtual   #170 <Method Object DeserializationContext.handleWeirdKey(Class, String, String, Object[])>
	//   53   95:areturn         
		}
		if(obj != null)
			return obj;
		if(_keyClass.isEnum() && deserializationcontext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
			return ((Object) (null));
		else
			return deserializationcontext.handleWeirdKey(_keyClass, s, "not a valid representation", new Object[0]);
	}

	private static final long serialVersionUID = 1L;
	protected final FromStringDeserializer _deser;
	protected final Class _keyClass;
	protected final int _kind;
}
