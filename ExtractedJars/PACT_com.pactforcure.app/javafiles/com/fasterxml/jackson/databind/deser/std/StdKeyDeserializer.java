// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
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
			throws IOException, JsonProcessingException
		{
			Object obj;
			if(s == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       8
			{
				obj = null;
		//    2    4:aconst_null     
		//    3    5:astore_3        
			} else
		//*   4    6:aload_3         
		//*   5    7:areturn         
			{
				Object obj1;
				try
				{
					obj1 = _delegate.deserialize(deserializationcontext.getParser(), deserializationcontext);
		//    6    8:aload_0         
		//    7    9:getfield        #28  <Field JsonDeserializer _delegate>
		//    8   12:aload_2         
		//    9   13:invokevirtual   #45  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
		//   10   16:aload_2         
		//   11   17:invokevirtual   #51  <Method Object JsonDeserializer.deserialize(com.fasterxml.jackson.core.JsonParser, DeserializationContext)>
		//   12   20:astore          4
				}
		//*  13   22:aload           4
		//*  14   24:astore_3        
		//*  15   25:aload           4
		//*  16   27:ifnonnull       6
		//*  17   30:aload_2         
		//*  18   31:aload_0         
		//*  19   32:getfield        #26  <Field Class _keyClass>
		//*  20   35:aload_1         
		//*  21   36:ldc1            #53  <String "not a valid representation">
		//*  22   38:invokevirtual   #57  <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
		//*  23   41:athrow          
				catch(Exception exception)
		//*  24   42:astore_3        
				{
					throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder()).append("not a valid representation: ").append(exception.getMessage()).toString());
		//   25   43:aload_2         
		//   26   44:aload_0         
		//   27   45:getfield        #26  <Field Class _keyClass>
		//   28   48:aload_1         
		//   29   49:new             #59  <Class StringBuilder>
		//   30   52:dup             
		//   31   53:invokespecial   #60  <Method void StringBuilder()>
		//   32   56:ldc1            #62  <String "not a valid representation: ">
		//   33   58:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   34   61:aload_3         
		//   35   62:invokevirtual   #70  <Method String Exception.getMessage()>
		//   36   65:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   37   68:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   38   71:invokevirtual   #57  <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
		//   39   74:athrow          
				}
				obj = obj1;
				if(obj1 == null)
					throw deserializationcontext.weirdKeyException(_keyClass, s, "not a valid representation");
			}
			return obj;
		}

		public Class getKeyClass()
		{
			return _keyClass;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Class _keyClass>
		//    2    4:areturn         
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

		protected EnumKD(EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
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
	//    4    4:invokespecial   #71  <Method void StdKeyDeserializer(int, Class, FromStringDeserializer)>
	//    5    7:return          
	}

	protected StdKeyDeserializer(int i, Class class1, FromStringDeserializer fromstringdeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void KeyDeserializer()>
		_kind = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #79  <Field int _kind>
		_keyClass = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #81  <Field Class _keyClass>
		_deser = fromstringdeserializer;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #83  <Field FromStringDeserializer _deser>
	//   11   19:return          
	}

	public static StdKeyDeserializer forType(Class class1)
	{
		if(class1 == java/lang/String || class1 == java/lang/Object)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #88  <Class String>
	//*   2    3:if_acmpeq       12
	//*   3    6:aload_0         
	//*   4    7:ldc1            #90  <Class Object>
	//*   5    9:if_acmpne       17
			return ((StdKeyDeserializer) (StringKD.forType(class1)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #93  <Method StdKeyDeserializer$StringKD StdKeyDeserializer$StringKD.forType(Class)>
	//    8   16:areturn         
		if(class1 != java/util/UUID) goto _L2; else goto _L1
	//    9   17:aload_0         
	//   10   18:ldc1            #95  <Class UUID>
	//   11   20:if_acmpne       36
_L1:
		byte byte0 = 12;
	//   12   23:bipush          12
	//   13   25:istore_1        
_L4:
		return new StdKeyDeserializer(((int) (byte0)), class1);
	//   14   26:new             #2   <Class StdKeyDeserializer>
	//   15   29:dup             
	//   16   30:iload_1         
	//   17   31:aload_0         
	//   18   32:invokespecial   #97  <Method void StdKeyDeserializer(int, Class)>
	//   19   35:areturn         
_L2:
		if(class1 == java/lang/Integer)
	//*  20   36:aload_0         
	//*  21   37:ldc1            #99  <Class Integer>
	//*  22   39:if_acmpne       47
		{
			byte0 = 5;
	//   23   42:iconst_5        
	//   24   43:istore_1        
			continue; /* Loop/switch isn't completed */
	//   25   44:goto            26
		}
		if(class1 == java/lang/Long)
	//*  26   47:aload_0         
	//*  27   48:ldc1            #101 <Class Long>
	//*  28   50:if_acmpne       59
		{
			byte0 = 6;
	//   29   53:bipush          6
	//   30   55:istore_1        
			continue; /* Loop/switch isn't completed */
	//   31   56:goto            26
		}
		if(class1 == java/util/Date)
	//*  32   59:aload_0         
	//*  33   60:ldc1            #103 <Class Date>
	//*  34   62:if_acmpne       71
		{
			byte0 = 10;
	//   35   65:bipush          10
	//   36   67:istore_1        
			continue; /* Loop/switch isn't completed */
	//   37   68:goto            26
		}
		if(class1 == java/util/Calendar)
	//*  38   71:aload_0         
	//*  39   72:ldc1            #105 <Class Calendar>
	//*  40   74:if_acmpne       83
		{
			byte0 = 11;
	//   41   77:bipush          11
	//   42   79:istore_1        
			continue; /* Loop/switch isn't completed */
	//   43   80:goto            26
		}
		if(class1 == java/lang/Boolean)
	//*  44   83:aload_0         
	//*  45   84:ldc1            #107 <Class Boolean>
	//*  46   86:if_acmpne       94
		{
			byte0 = 1;
	//   47   89:iconst_1        
	//   48   90:istore_1        
			continue; /* Loop/switch isn't completed */
	//   49   91:goto            26
		}
		if(class1 == java/lang/Byte)
	//*  50   94:aload_0         
	//*  51   95:ldc1            #109 <Class Byte>
	//*  52   97:if_acmpne       105
		{
			byte0 = 2;
	//   53  100:iconst_2        
	//   54  101:istore_1        
			continue; /* Loop/switch isn't completed */
	//   55  102:goto            26
		}
		if(class1 == java/lang/Character)
	//*  56  105:aload_0         
	//*  57  106:ldc1            #111 <Class Character>
	//*  58  108:if_acmpne       116
		{
			byte0 = 4;
	//   59  111:iconst_4        
	//   60  112:istore_1        
			continue; /* Loop/switch isn't completed */
	//   61  113:goto            26
		}
		if(class1 == java/lang/Short)
	//*  62  116:aload_0         
	//*  63  117:ldc1            #113 <Class Short>
	//*  64  119:if_acmpne       127
		{
			byte0 = 3;
	//   65  122:iconst_3        
	//   66  123:istore_1        
			continue; /* Loop/switch isn't completed */
	//   67  124:goto            26
		}
		if(class1 == java/lang/Float)
	//*  68  127:aload_0         
	//*  69  128:ldc1            #115 <Class Float>
	//*  70  130:if_acmpne       139
		{
			byte0 = 7;
	//   71  133:bipush          7
	//   72  135:istore_1        
			continue; /* Loop/switch isn't completed */
	//   73  136:goto            26
		}
		if(class1 == java/lang/Double)
	//*  74  139:aload_0         
	//*  75  140:ldc1            #117 <Class Double>
	//*  76  142:if_acmpne       151
		{
			byte0 = 8;
	//   77  145:bipush          8
	//   78  147:istore_1        
			continue; /* Loop/switch isn't completed */
	//   79  148:goto            26
		}
		if(class1 == java/net/URI)
	//*  80  151:aload_0         
	//*  81  152:ldc1            #119 <Class URI>
	//*  82  154:if_acmpne       163
		{
			byte0 = 13;
	//   83  157:bipush          13
	//   84  159:istore_1        
			continue; /* Loop/switch isn't completed */
	//   85  160:goto            26
		}
		if(class1 == java/net/URL)
	//*  86  163:aload_0         
	//*  87  164:ldc1            #121 <Class URL>
	//*  88  166:if_acmpne       175
		{
			byte0 = 14;
	//   89  169:bipush          14
	//   90  171:istore_1        
			continue; /* Loop/switch isn't completed */
	//   91  172:goto            26
		}
		if(class1 != java/lang/Class)
			break; /* Loop/switch isn't completed */
	//   92  175:aload_0         
	//   93  176:ldc1            #123 <Class Class>
	//   94  178:if_acmpne       187
		byte0 = 15;
	//   95  181:bipush          15
	//   96  183:istore_1        
		if(true) goto _L4; else goto _L3
	//   97  184:goto            26
_L3:
		if(class1 == java/util/Locale)
	//*  98  187:aload_0         
	//*  99  188:ldc1            #125 <Class Locale>
	//* 100  190:if_acmpne       209
			return new StdKeyDeserializer(9, class1, ((FromStringDeserializer) (FromStringDeserializer.findDeserializer(java/util/Locale))));
	//  101  193:new             #2   <Class StdKeyDeserializer>
	//  102  196:dup             
	//  103  197:bipush          9
	//  104  199:aload_0         
	//  105  200:ldc1            #125 <Class Locale>
	//  106  202:invokestatic    #131 <Method FromStringDeserializer$Std FromStringDeserializer.findDeserializer(Class)>
	//  107  205:invokespecial   #71  <Method void StdKeyDeserializer(int, Class, FromStringDeserializer)>
	//  108  208:areturn         
		if(class1 == java/util/Currency)
	//* 109  209:aload_0         
	//* 110  210:ldc1            #133 <Class Currency>
	//* 111  212:if_acmpne       231
			return new StdKeyDeserializer(16, class1, ((FromStringDeserializer) (FromStringDeserializer.findDeserializer(java/util/Currency))));
	//  112  215:new             #2   <Class StdKeyDeserializer>
	//  113  218:dup             
	//  114  219:bipush          16
	//  115  221:aload_0         
	//  116  222:ldc1            #133 <Class Currency>
	//  117  224:invokestatic    #131 <Method FromStringDeserializer$Std FromStringDeserializer.findDeserializer(Class)>
	//  118  227:invokespecial   #71  <Method void StdKeyDeserializer(int, Class, FromStringDeserializer)>
	//  119  230:areturn         
		else
			return null;
	//  120  231:aconst_null     
	//  121  232:areturn         
	}

	protected Object _parse(String s, DeserializationContext deserializationcontext)
		throws Exception
	{
		_kind;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int _kind>
		JVM INSTR tableswitch 1 16: default 84
	//	               1 86
	//	               2 124
	//	               3 161
	//	               4 199
	//	               5 228
	//	               6 237
	//	               7 246
	//	               8 256
	//	               9 265
	//	               10 321
	//	               11 327
	//	               12 343
	//	               13 348
	//	               14 353
	//	               15 362
	//	               16 293;
	//    2    4:tableswitch     1 16: default 84
	//	               1 86
	//	               2 124
	//	               3 161
	//	               4 199
	//	               5 228
	//	               6 237
	//	               7 246
	//	               8 256
	//	               9 265
	//	               10 321
	//	               11 327
	//	               12 343
	//	               13 348
	//	               14 353
	//	               15 362
	//	               16 293
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
		return ((Object) (null));
	//    3   84:aconst_null     
	//    4   85:areturn         
_L2:
		if("true".equals(((Object) (s))))
	//*   5   86:ldc1            #142 <String "true">
	//*   6   88:aload_1         
	//*   7   89:invokevirtual   #146 <Method boolean String.equals(Object)>
	//*   8   92:ifeq            99
			return ((Object) (Boolean.TRUE));
	//    9   95:getstatic       #150 <Field Boolean Boolean.TRUE>
	//   10   98:areturn         
		if("false".equals(((Object) (s))))
	//*  11   99:ldc1            #152 <String "false">
	//*  12  101:aload_1         
	//*  13  102:invokevirtual   #146 <Method boolean String.equals(Object)>
	//*  14  105:ifeq            112
			return ((Object) (Boolean.FALSE));
	//   15  108:getstatic       #155 <Field Boolean Boolean.FALSE>
	//   16  111:areturn         
		else
			throw deserializationcontext.weirdKeyException(_keyClass, s, "value not 'true' or 'false'");
	//   17  112:aload_2         
	//   18  113:aload_0         
	//   19  114:getfield        #81  <Field Class _keyClass>
	//   20  117:aload_1         
	//   21  118:ldc1            #157 <String "value not 'true' or 'false'">
	//   22  120:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//   23  123:athrow          
_L3:
		int i = _parseInt(s);
	//   24  124:aload_0         
	//   25  125:aload_1         
	//   26  126:invokevirtual   #167 <Method int _parseInt(String)>
	//   27  129:istore_3        
		if(i < -128 || i > 255)
	//*  28  130:iload_3         
	//*  29  131:bipush          -128
	//*  30  133:icmplt          143
	//*  31  136:iload_3         
	//*  32  137:sipush          255
	//*  33  140:icmple          155
			throw deserializationcontext.weirdKeyException(_keyClass, s, "overflow, value can not be represented as 8-bit value");
	//   34  143:aload_2         
	//   35  144:aload_0         
	//   36  145:getfield        #81  <Field Class _keyClass>
	//   37  148:aload_1         
	//   38  149:ldc1            #169 <String "overflow, value can not be represented as 8-bit value">
	//   39  151:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//   40  154:athrow          
		else
			return ((Object) (Byte.valueOf((byte)i)));
	//   41  155:iload_3         
	//   42  156:int2byte        
	//   43  157:invokestatic    #173 <Method Byte Byte.valueOf(byte)>
	//   44  160:areturn         
_L4:
		int j = _parseInt(s);
	//   45  161:aload_0         
	//   46  162:aload_1         
	//   47  163:invokevirtual   #167 <Method int _parseInt(String)>
	//   48  166:istore_3        
		if(j < -32768 || j > 32767)
	//*  49  167:iload_3         
	//*  50  168:sipush          -32768
	//*  51  171:icmplt          181
	//*  52  174:iload_3         
	//*  53  175:sipush          32767
	//*  54  178:icmple          193
			throw deserializationcontext.weirdKeyException(_keyClass, s, "overflow, value can not be represented as 16-bit value");
	//   55  181:aload_2         
	//   56  182:aload_0         
	//   57  183:getfield        #81  <Field Class _keyClass>
	//   58  186:aload_1         
	//   59  187:ldc1            #175 <String "overflow, value can not be represented as 16-bit value">
	//   60  189:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//   61  192:athrow          
		else
			return ((Object) (Short.valueOf((short)j)));
	//   62  193:iload_3         
	//   63  194:int2short       
	//   64  195:invokestatic    #178 <Method Short Short.valueOf(short)>
	//   65  198:areturn         
_L5:
		if(s.length() == 1)
	//*  66  199:aload_1         
	//*  67  200:invokevirtual   #182 <Method int String.length()>
	//*  68  203:iconst_1        
	//*  69  204:icmpne          216
			return ((Object) (Character.valueOf(s.charAt(0))));
	//   70  207:aload_1         
	//   71  208:iconst_0        
	//   72  209:invokevirtual   #186 <Method char String.charAt(int)>
	//   73  212:invokestatic    #189 <Method Character Character.valueOf(char)>
	//   74  215:areturn         
		else
			throw deserializationcontext.weirdKeyException(_keyClass, s, "can only convert 1-character Strings");
	//   75  216:aload_2         
	//   76  217:aload_0         
	//   77  218:getfield        #81  <Field Class _keyClass>
	//   78  221:aload_1         
	//   79  222:ldc1            #191 <String "can only convert 1-character Strings">
	//   80  224:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//   81  227:athrow          
_L6:
		return ((Object) (Integer.valueOf(_parseInt(s))));
	//   82  228:aload_0         
	//   83  229:aload_1         
	//   84  230:invokevirtual   #167 <Method int _parseInt(String)>
	//   85  233:invokestatic    #194 <Method Integer Integer.valueOf(int)>
	//   86  236:areturn         
_L7:
		return ((Object) (Long.valueOf(_parseLong(s))));
	//   87  237:aload_0         
	//   88  238:aload_1         
	//   89  239:invokevirtual   #198 <Method long _parseLong(String)>
	//   90  242:invokestatic    #201 <Method Long Long.valueOf(long)>
	//   91  245:areturn         
_L8:
		return ((Object) (Float.valueOf((float)_parseDouble(s))));
	//   92  246:aload_0         
	//   93  247:aload_1         
	//   94  248:invokevirtual   #205 <Method double _parseDouble(String)>
	//   95  251:d2f             
	//   96  252:invokestatic    #208 <Method Float Float.valueOf(float)>
	//   97  255:areturn         
_L9:
		return ((Object) (Double.valueOf(_parseDouble(s))));
	//   98  256:aload_0         
	//   99  257:aload_1         
	//  100  258:invokevirtual   #205 <Method double _parseDouble(String)>
	//  101  261:invokestatic    #211 <Method Double Double.valueOf(double)>
	//  102  264:areturn         
_L10:
		Object obj;
		try
		{
			obj = _deser._deserialize(s, deserializationcontext);
	//  103  265:aload_0         
	//  104  266:getfield        #83  <Field FromStringDeserializer _deser>
	//  105  269:aload_1         
	//  106  270:aload_2         
	//  107  271:invokevirtual   #214 <Method Object FromStringDeserializer._deserialize(String, DeserializationContext)>
	//  108  274:astore          4
		}
	//* 109  276:aload           4
	//* 110  278:areturn         
		catch(IOException ioexception)
	//* 111  279:astore          4
		{
			throw deserializationcontext.weirdKeyException(_keyClass, s, "unable to parse key as locale");
	//  112  281:aload_2         
	//  113  282:aload_0         
	//  114  283:getfield        #81  <Field Class _keyClass>
	//  115  286:aload_1         
	//  116  287:ldc1            #216 <String "unable to parse key as locale">
	//  117  289:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//  118  292:athrow          
		}
		return obj;
_L17:
		Object obj1;
		try
		{
			obj1 = _deser._deserialize(s, deserializationcontext);
	//  119  293:aload_0         
	//  120  294:getfield        #83  <Field FromStringDeserializer _deser>
	//  121  297:aload_1         
	//  122  298:aload_2         
	//  123  299:invokevirtual   #214 <Method Object FromStringDeserializer._deserialize(String, DeserializationContext)>
	//  124  302:astore          4
		}
	//* 125  304:aload           4
	//* 126  306:areturn         
		catch(IOException ioexception1)
	//* 127  307:astore          4
		{
			throw deserializationcontext.weirdKeyException(_keyClass, s, "unable to parse key as currency");
	//  128  309:aload_2         
	//  129  310:aload_0         
	//  130  311:getfield        #81  <Field Class _keyClass>
	//  131  314:aload_1         
	//  132  315:ldc1            #218 <String "unable to parse key as currency">
	//  133  317:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//  134  320:athrow          
		}
		return obj1;
_L11:
		return ((Object) (deserializationcontext.parseDate(s)));
	//  135  321:aload_2         
	//  136  322:aload_1         
	//  137  323:invokevirtual   #222 <Method Date DeserializationContext.parseDate(String)>
	//  138  326:areturn         
_L12:
		s = ((String) (deserializationcontext.parseDate(s)));
	//  139  327:aload_2         
	//  140  328:aload_1         
	//  141  329:invokevirtual   #222 <Method Date DeserializationContext.parseDate(String)>
	//  142  332:astore_1        
		if(s != null)
	//* 143  333:aload_1         
	//* 144  334:ifnull          84
			return ((Object) (deserializationcontext.constructCalendar(((Date) (s)))));
	//  145  337:aload_2         
	//  146  338:aload_1         
	//  147  339:invokevirtual   #226 <Method Calendar DeserializationContext.constructCalendar(Date)>
	//  148  342:areturn         
		  goto _L1
_L13:
		return ((Object) (UUID.fromString(s)));
	//  149  343:aload_1         
	//  150  344:invokestatic    #230 <Method UUID UUID.fromString(String)>
	//  151  347:areturn         
_L14:
		return ((Object) (URI.create(s)));
	//  152  348:aload_1         
	//  153  349:invokestatic    #234 <Method URI URI.create(String)>
	//  154  352:areturn         
_L15:
		return ((Object) (new URL(s)));
	//  155  353:new             #121 <Class URL>
	//  156  356:dup             
	//  157  357:aload_1         
	//  158  358:invokespecial   #237 <Method void URL(String)>
	//  159  361:areturn         
_L16:
		Class class1;
		try
		{
			class1 = deserializationcontext.findClass(s);
	//  160  362:aload_2         
	//  161  363:aload_1         
	//  162  364:invokevirtual   #241 <Method Class DeserializationContext.findClass(String)>
	//  163  367:astore          4
		}
	//* 164  369:aload           4
	//* 165  371:areturn         
		catch(Exception exception)
	//* 166  372:astore          4
		{
			throw deserializationcontext.weirdKeyException(_keyClass, s, "unable to parse key as Class");
	//  167  374:aload_2         
	//  168  375:aload_0         
	//  169  376:getfield        #81  <Field Class _keyClass>
	//  170  379:aload_1         
	//  171  380:ldc1            #243 <String "unable to parse key as Class">
	//  172  382:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//  173  385:athrow          
		}
		return ((Object) (class1));
	}

	protected double _parseDouble(String s)
		throws IllegalArgumentException
	{
		return NumberInput.parseDouble(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #251 <Method double NumberInput.parseDouble(String)>
	//    2    4:dreturn         
	}

	protected int _parseInt(String s)
		throws IllegalArgumentException
	{
		return Integer.parseInt(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #254 <Method int Integer.parseInt(String)>
	//    2    4:ireturn         
	}

	protected long _parseLong(String s)
		throws IllegalArgumentException
	{
		return Long.parseLong(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #257 <Method long Long.parseLong(String)>
	//    2    4:lreturn         
	}

	public Object deserializeKey(String s, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		Object obj;
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
		{
			obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		} else
	//*   4    6:aload_3         
	//*   5    7:areturn         
		{
			Object obj1;
			try
			{
				obj1 = _parse(s, deserializationcontext);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokevirtual   #262 <Method Object _parse(String, DeserializationContext)>
	//   10   14:astore          4
			}
	//*  11   16:aload           4
	//*  12   18:astore_3        
	//*  13   19:aload           4
	//*  14   21:ifnonnull       6
	//*  15   24:aload_0         
	//*  16   25:getfield        #81  <Field Class _keyClass>
	//*  17   28:invokevirtual   #266 <Method boolean Class.isEnum()>
	//*  18   31:ifeq            83
	//*  19   34:aload_2         
	//*  20   35:invokevirtual   #270 <Method DeserializationConfig DeserializationContext.getConfig()>
	//*  21   38:getstatic       #276 <Field DeserializationFeature DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL>
	//*  22   41:invokevirtual   #282 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//*  23   44:ifeq            83
	//*  24   47:aconst_null     
	//*  25   48:areturn         
			catch(Exception exception)
	//*  26   49:astore_3        
			{
				throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder()).append("not a valid representation: ").append(exception.getMessage()).toString());
	//   27   50:aload_2         
	//   28   51:aload_0         
	//   29   52:getfield        #81  <Field Class _keyClass>
	//   30   55:aload_1         
	//   31   56:new             #284 <Class StringBuilder>
	//   32   59:dup             
	//   33   60:invokespecial   #285 <Method void StringBuilder()>
	//   34   63:ldc2            #287 <String "not a valid representation: ">
	//   35   66:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//   36   69:aload_3         
	//   37   70:invokevirtual   #295 <Method String Exception.getMessage()>
	//   38   73:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//   39   76:invokevirtual   #298 <Method String StringBuilder.toString()>
	//   40   79:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//   41   82:athrow          
			}
			obj = obj1;
			if(obj1 == null)
				if(_keyClass.isEnum() && deserializationcontext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
					return ((Object) (null));
				else
					throw deserializationcontext.weirdKeyException(_keyClass, s, "not a valid representation");
	//   42   83:aload_2         
	//   43   84:aload_0         
	//   44   85:getfield        #81  <Field Class _keyClass>
	//   45   88:aload_1         
	//   46   89:ldc2            #300 <String "not a valid representation">
	//   47   92:invokevirtual   #163 <Method JsonMappingException DeserializationContext.weirdKeyException(Class, String, String)>
	//   48   95:athrow          
		}
		return obj;
	}

	public Class getKeyClass()
	{
		return _keyClass;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Class _keyClass>
	//    2    4:areturn         
	}

	public static final int TYPE_BOOLEAN = 1;
	public static final int TYPE_BYTE = 2;
	public static final int TYPE_CALENDAR = 11;
	public static final int TYPE_CHAR = 4;
	public static final int TYPE_CLASS = 15;
	public static final int TYPE_CURRENCY = 16;
	public static final int TYPE_DATE = 10;
	public static final int TYPE_DOUBLE = 8;
	public static final int TYPE_FLOAT = 7;
	public static final int TYPE_INT = 5;
	public static final int TYPE_LOCALE = 9;
	public static final int TYPE_LONG = 6;
	public static final int TYPE_SHORT = 3;
	public static final int TYPE_URI = 13;
	public static final int TYPE_URL = 14;
	public static final int TYPE_UUID = 12;
	private static final long serialVersionUID = 1L;
	protected final FromStringDeserializer _deser;
	protected final Class _keyClass;
	protected final int _kind;
}
