// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//			TypeIdResolver

public abstract class TypeDeserializer
{

	public TypeDeserializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static Object deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype)
		throws IOException
	{
		return deserializeIfNatural(jsonparser, deserializationcontext, javatype.getRawClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #21  <Method Class JavaType.getRawClass()>
	//    4    6:invokestatic    #24  <Method Object deserializeIfNatural(JsonParser, DeserializationContext, Class)>
	//    5    9:areturn         
	}

	public static Object deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext, Class class1)
		throws IOException
	{
		deserializationcontext = ((DeserializationContext) (jsonparser.getCurrentToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_1        
		if(deserializationcontext != null) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:ifnonnull       11
_L1:
		return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
_L2:
		static class _cls1
		{

			static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

			static 
			{
				$SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
			//    0    0:invokestatic    #18  <Method JsonToken[] JsonToken.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//    5   12:getstatic       #24  <Field JsonToken JsonToken.VALUE_STRING>
			//    6   15:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//*  10   23:getstatic       #31  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
			//*  11   26:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//*  15   34:getstatic       #34  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
			//*  16   37:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//*  20   45:getstatic       #37  <Field JsonToken JsonToken.VALUE_TRUE>
			//*  21   48:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
			//*  25   56:getstatic       #40  <Field JsonToken JsonToken.VALUE_FALSE>
			//*  26   59:invokevirtual   #28  <Method int JsonToken.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
			//*  30   65:astore_0        
			//*  31   66:return          
			//*  32   67:astore_0        
			//*  33   68:goto            53
			//*  34   71:astore_0        
			//*  35   72:goto            42
			//*  36   75:astore_0        
			//*  37   76:goto            31
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   79:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  39   80:goto            20
			}
		}

		_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[((JsonToken) (deserializationcontext)).ordinal()];
	//    7   11:getstatic       #35  <Field int[] TypeDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #41  <Method int JsonToken.ordinal()>
	//   10   18:iaload          
		JVM INSTR tableswitch 1 5: default 52
	//	               1 54
	//	               2 68
	//	               3 85
	//	               4 102
	//	               5 115;
	//   11   19:tableswitch     1 5: default 52
	//	               1 54
	//	               2 68
	//	               3 85
	//	               4 102
	//	               5 115
		   goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
		continue; /* Loop/switch isn't completed */
_L3:
		return ((Object) (null));
	//   12   52:aconst_null     
	//   13   53:areturn         
_L4:
		if(!class1.isAssignableFrom(java/lang/String)) goto _L1; else goto _L9
	//   14   54:aload_2         
	//   15   55:ldc1            #43  <Class String>
	//   16   57:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//   17   60:ifeq            9
_L9:
		return ((Object) (jsonparser.getText()));
	//   18   63:aload_0         
	//   19   64:invokevirtual   #53  <Method String JsonParser.getText()>
	//   20   67:areturn         
_L5:
		if(!class1.isAssignableFrom(java/lang/Integer)) goto _L1; else goto _L10
	//   21   68:aload_2         
	//   22   69:ldc1            #55  <Class Integer>
	//   23   71:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//   24   74:ifeq            9
_L10:
		return ((Object) (Integer.valueOf(jsonparser.getIntValue())));
	//   25   77:aload_0         
	//   26   78:invokevirtual   #58  <Method int JsonParser.getIntValue()>
	//   27   81:invokestatic    #62  <Method Integer Integer.valueOf(int)>
	//   28   84:areturn         
_L6:
		if(!class1.isAssignableFrom(java/lang/Double)) goto _L1; else goto _L11
	//   29   85:aload_2         
	//   30   86:ldc1            #64  <Class Double>
	//   31   88:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//   32   91:ifeq            9
_L11:
		return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
	//   33   94:aload_0         
	//   34   95:invokevirtual   #68  <Method double JsonParser.getDoubleValue()>
	//   35   98:invokestatic    #71  <Method Double Double.valueOf(double)>
	//   36  101:areturn         
_L7:
		if(!class1.isAssignableFrom(java/lang/Boolean)) goto _L1; else goto _L12
	//   37  102:aload_2         
	//   38  103:ldc1            #73  <Class Boolean>
	//   39  105:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//   40  108:ifeq            9
_L12:
		return ((Object) (Boolean.TRUE));
	//   41  111:getstatic       #77  <Field Boolean Boolean.TRUE>
	//   42  114:areturn         
		if(!class1.isAssignableFrom(java/lang/Boolean)) goto _L1; else goto _L13
	//   43  115:aload_2         
	//   44  116:ldc1            #73  <Class Boolean>
	//   45  118:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//   46  121:ifeq            9
_L13:
		return ((Object) (Boolean.FALSE));
	//   47  124:getstatic       #80  <Field Boolean Boolean.FALSE>
	//   48  127:areturn         
	}

	public abstract Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException;

	public abstract Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException;

	public abstract Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException;

	public abstract Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException;

	public abstract TypeDeserializer forProperty(BeanProperty beanproperty);

	public abstract Class getDefaultImpl();

	public abstract String getPropertyName();

	public abstract TypeIdResolver getTypeIdResolver();

	public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion();
}
