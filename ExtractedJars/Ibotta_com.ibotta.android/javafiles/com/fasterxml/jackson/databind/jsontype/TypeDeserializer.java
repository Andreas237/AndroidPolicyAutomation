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
		if(deserializationcontext == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
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
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[((JsonToken) (deserializationcontext)).ordinal()])
	//*   7   11:getstatic       #35  <Field int[] TypeDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #41  <Method int JsonToken.ordinal()>
	//*  10   18:iaload          
		{
	//*  11   19:tableswitch     1 5: default 52
	//	               1 114
	//	               2 97
	//	               3 80
	//	               4 67
	//	               5 54
		default:
			return ((Object) (null));
	//   12   52:aconst_null     
	//   13   53:areturn         

		case 5: // '\005'
			if(class1.isAssignableFrom(java/lang/Boolean))
	//*  14   54:aload_2         
	//*  15   55:ldc1            #43  <Class Boolean>
	//*  16   57:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//*  17   60:ifeq            128
				return ((Object) (Boolean.FALSE));
	//   18   63:getstatic       #53  <Field Boolean Boolean.FALSE>
	//   19   66:areturn         
			break;

		case 4: // '\004'
			if(class1.isAssignableFrom(java/lang/Boolean))
	//*  20   67:aload_2         
	//*  21   68:ldc1            #43  <Class Boolean>
	//*  22   70:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//*  23   73:ifeq            128
				return ((Object) (Boolean.TRUE));
	//   24   76:getstatic       #56  <Field Boolean Boolean.TRUE>
	//   25   79:areturn         
			break;

		case 3: // '\003'
			if(class1.isAssignableFrom(java/lang/Double))
	//*  26   80:aload_2         
	//*  27   81:ldc1            #58  <Class Double>
	//*  28   83:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//*  29   86:ifeq            128
				return ((Object) (Double.valueOf(jsonparser.getDoubleValue())));
	//   30   89:aload_0         
	//   31   90:invokevirtual   #62  <Method double JsonParser.getDoubleValue()>
	//   32   93:invokestatic    #66  <Method Double Double.valueOf(double)>
	//   33   96:areturn         
			break;

		case 2: // '\002'
			if(class1.isAssignableFrom(java/lang/Integer))
	//*  34   97:aload_2         
	//*  35   98:ldc1            #68  <Class Integer>
	//*  36  100:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//*  37  103:ifeq            128
				return ((Object) (Integer.valueOf(jsonparser.getIntValue())));
	//   38  106:aload_0         
	//   39  107:invokevirtual   #71  <Method int JsonParser.getIntValue()>
	//   40  110:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   41  113:areturn         
			break;

		case 1: // '\001'
			if(class1.isAssignableFrom(java/lang/String))
	//*  42  114:aload_2         
	//*  43  115:ldc1            #76  <Class String>
	//*  44  117:invokevirtual   #49  <Method boolean Class.isAssignableFrom(Class)>
	//*  45  120:ifeq            128
				return ((Object) (jsonparser.getText()));
	//   46  123:aload_0         
	//   47  124:invokevirtual   #80  <Method String JsonParser.getText()>
	//   48  127:areturn         
			break;
		}
		return ((Object) (null));
	//   49  128:aconst_null     
	//   50  129:areturn         
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
