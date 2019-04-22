// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public final class StringArrayDeserializer extends StdDeserializer
	implements ContextualDeserializer
{

	public StringArrayDeserializer()
	{
		this(((JsonDeserializer) (null)), ((NullValueProvider) (null)), ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #40  <Method void StringArrayDeserializer(JsonDeserializer, NullValueProvider, Boolean)>
	//    5    7:return          
	}

	protected StringArrayDeserializer(JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super([Ljava/lang/String;);
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <Class String[]>
	//    2    3:invokespecial   #44  <Method void StdDeserializer(Class)>
		_elementDeserializer = jsondeserializer;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #46  <Field JsonDeserializer _elementDeserializer>
		_nullProvider = nullvalueprovider;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #48  <Field NullValueProvider _nullProvider>
		_unwrapSingle = boolean1;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #50  <Field Boolean _unwrapSingle>
		_skipNullValues = NullsConstantProvider.isSkipper(nullvalueprovider);
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:invokestatic    #56  <Method boolean NullsConstantProvider.isSkipper(NullValueProvider)>
	//   15   26:putfield        #58  <Field boolean _skipNullValues>
	//   16   29:return          
	}

	private final String[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		boolean flag;
		if(_unwrapSingle != Boolean.TRUE && (_unwrapSingle != null || !deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Boolean _unwrapSingle>
	//*   2    4:getstatic       #69  <Field Boolean Boolean.TRUE>
	//*   3    7:if_acmpeq       35
	//*   4   10:aload_0         
	//*   5   11:getfield        #50  <Field Boolean _unwrapSingle>
	//*   6   14:ifnonnull       30
	//*   7   17:aload_2         
	//*   8   18:getstatic       #75  <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*   9   21:invokevirtual   #81  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  10   24:ifeq            30
	//*  11   27:goto            35
			flag = false;
	//   12   30:iconst_0        
	//   13   31:istore_3        
		else
	//*  14   32:goto            37
			flag = true;
	//   15   35:iconst_1        
	//   16   36:istore_3        
		if(flag)
	//*  17   37:iload_3         
	//*  18   38:ifeq            84
		{
			if(jsonparser.hasToken(JsonToken.VALUE_NULL))
	//*  19   41:aload_1         
	//*  20   42:getstatic       #87  <Field JsonToken JsonToken.VALUE_NULL>
	//*  21   45:invokevirtual   #93  <Method boolean JsonParser.hasToken(JsonToken)>
	//*  22   48:ifeq            68
				jsonparser = ((JsonParser) ((String)_nullProvider.getNullValue(deserializationcontext)));
	//   23   51:aload_0         
	//   24   52:getfield        #48  <Field NullValueProvider _nullProvider>
	//   25   55:aload_2         
	//   26   56:invokeinterface #99  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   27   61:checkcast       #29  <Class String>
	//   28   64:astore_1        
			else
	//*  29   65:goto            75
				jsonparser = ((JsonParser) (_parseString(jsonparser, deserializationcontext)));
	//   30   68:aload_0         
	//   31   69:aload_1         
	//   32   70:aload_2         
	//   33   71:invokevirtual   #103 <Method String _parseString(JsonParser, DeserializationContext)>
	//   34   74:astore_1        
			return (new String[] {
				jsonparser
			});
	//   35   75:iconst_1        
	//   36   76:anewarray       String[]
	//   37   79:dup             
	//   38   80:iconst_0        
	//   39   81:aload_1         
	//   40   82:aastore         
	//   41   83:areturn         
		}
		if(jsonparser.hasToken(JsonToken.VALUE_STRING) && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
	//*  42   84:aload_1         
	//*  43   85:getstatic       #106 <Field JsonToken JsonToken.VALUE_STRING>
	//*  44   88:invokevirtual   #93  <Method boolean JsonParser.hasToken(JsonToken)>
	//*  45   91:ifeq            116
	//*  46   94:aload_2         
	//*  47   95:getstatic       #109 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*  48   98:invokevirtual   #81  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  49  101:ifeq            116
	//*  50  104:aload_1         
	//*  51  105:invokevirtual   #113 <Method String JsonParser.getText()>
	//*  52  108:invokevirtual   #117 <Method int String.length()>
	//*  53  111:ifne            116
			return null;
	//   54  114:aconst_null     
	//   55  115:areturn         
		else
			return (String[])deserializationcontext.handleUnexpectedToken(_valueClass, jsonparser);
	//   56  116:aload_2         
	//   57  117:aload_0         
	//   58  118:getfield        #121 <Field Class _valueClass>
	//   59  121:aload_1         
	//   60  122:invokevirtual   #125 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   61  125:checkcast       #41  <Class String[]>
	//   62  128:areturn         
	}

	protected final String[] _deserializeCustom(JsonParser jsonparser, DeserializationContext deserializationcontext, String as[])
		throws IOException
	{
		int i;
		String as1[];
		ObjectBuffer objectbuffer;
		JsonDeserializer jsondeserializer;
		objectbuffer = deserializationcontext.leaseObjectBuffer();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #134 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//    2    4:astore          8
		if(as == null)
	//*   3    6:aload_3         
	//*   4    7:ifnonnull       22
		{
			as = ((String []) (objectbuffer.resetAndStart()));
	//    5   10:aload           8
	//    6   12:invokevirtual   #140 <Method Object[] ObjectBuffer.resetAndStart()>
	//    7   15:astore_3        
			i = 0;
	//    8   16:iconst_0        
	//    9   17:istore          4
		} else
	//*  10   19:goto            35
		{
			i = as.length;
	//   11   22:aload_3         
	//   12   23:arraylength     
	//   13   24:istore          4
			as = ((String []) (objectbuffer.resetAndStart(((Object []) (as)), i)));
	//   14   26:aload           8
	//   15   28:aload_3         
	//   16   29:iload           4
	//   17   31:invokevirtual   #143 <Method Object[] ObjectBuffer.resetAndStart(Object[], int)>
	//   18   34:astore_3        
		}
		jsondeserializer = _elementDeserializer;
	//   19   35:aload_0         
	//   20   36:getfield        #46  <Field JsonDeserializer _elementDeserializer>
	//   21   39:astore          9
		as1 = as;
	//   22   41:aload_3         
	//   23   42:astore          6
_L2:
		JsonToken jsontoken;
		if(jsonparser.nextTextValue() != null)
			break MISSING_BLOCK_LABEL_138;
	//   24   44:aload_1         
	//   25   45:invokevirtual   #146 <Method String JsonParser.nextTextValue()>
	//   26   48:ifnonnull       138
		as = ((String []) (jsonparser.getCurrentToken()));
	//   27   51:aload_1         
	//   28   52:invokevirtual   #150 <Method JsonToken JsonParser.getCurrentToken()>
	//   29   55:astore_3        
		jsontoken = JsonToken.END_ARRAY;
	//   30   56:getstatic       #153 <Field JsonToken JsonToken.END_ARRAY>
	//   31   59:astore          7
		if(as == jsontoken)
	//*  32   61:aload_3         
	//*  33   62:aload           7
	//*  34   64:if_acmpne       90
		{
			jsonparser = ((JsonParser) ((String[])objectbuffer.completeAndClearBuffer(((Object []) (as1)), i, java/lang/String)));
	//   35   67:aload           8
	//   36   69:aload           6
	//   37   71:iload           4
	//   38   73:ldc1            #29  <Class String>
	//   39   75:invokevirtual   #157 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int, Class)>
	//   40   78:checkcast       #41  <Class String[]>
	//   41   81:astore_1        
			deserializationcontext.returnObjectBuffer(objectbuffer);
	//   42   82:aload_2         
	//   43   83:aload           8
	//   44   85:invokevirtual   #161 <Method void DeserializationContext.returnObjectBuffer(ObjectBuffer)>
			return ((String []) (jsonparser));
	//   45   88:aload_1         
	//   46   89:areturn         
		}
		if(as == JsonToken.VALUE_NULL)
	//*  47   90:aload_3         
	//*  48   91:getstatic       #87  <Field JsonToken JsonToken.VALUE_NULL>
	//*  49   94:if_acmpne       124
		{
			if(_skipNullValues)
	//*  50   97:aload_0         
	//*  51   98:getfield        #58  <Field boolean _skipNullValues>
	//*  52  101:ifeq            107
				continue; /* Loop/switch isn't completed */
	//   53  104:goto            44
			int j;
			String as2[];
			try
			{
				as = ((String []) ((String)_nullProvider.getNullValue(deserializationcontext)));
	//   54  107:aload_0         
	//   55  108:getfield        #48  <Field NullValueProvider _nullProvider>
	//   56  111:aload_2         
	//   57  112:invokeinterface #99  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   58  117:checkcast       #29  <Class String>
	//   59  120:astore_3        
			}
	//*  60  121:goto            149
	//*  61  124:aload           9
	//*  62  126:aload_1         
	//*  63  127:aload_2         
	//*  64  128:invokevirtual   #167 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  65  131:checkcast       #29  <Class String>
	//*  66  134:astore_3        
	//*  67  135:goto            149
	//*  68  138:aload           9
	//*  69  140:aload_1         
	//*  70  141:aload_2         
	//*  71  142:invokevirtual   #167 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  72  145:checkcast       #29  <Class String>
	//*  73  148:astore_3        
	//*  74  149:iload           4
	//*  75  151:istore          5
	//*  76  153:aload           6
	//*  77  155:astore          7
	//*  78  157:iload           4
	//*  79  159:aload           6
	//*  80  161:arraylength     
	//*  81  162:icmplt          177
	//*  82  165:aload           8
	//*  83  167:aload           6
	//*  84  169:invokevirtual   #171 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//*  85  172:astore          7
	//*  86  174:iconst_0        
	//*  87  175:istore          5
	//*  88  177:aload           7
	//*  89  179:iload           5
	//*  90  181:aload_3         
	//*  91  182:aastore         
	//*  92  183:iload           5
	//*  93  185:iconst_1        
	//*  94  186:iadd            
	//*  95  187:istore          4
	//*  96  189:aload           7
	//*  97  191:astore          6
	//*  98  193:goto            44
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  99  196:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), java/lang/String, i);
	//  100  197:aload_1         
	//  101  198:ldc1            #29  <Class String>
	//  102  200:iload           4
	//  103  202:invokestatic    #177 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  104  205:athrow          
			}
			break MISSING_BLOCK_LABEL_149;
		}
		as = ((String []) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
		break MISSING_BLOCK_LABEL_149;
		as = ((String []) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
		j = i;
		as2 = as1;
		if(i < as1.length)
			break MISSING_BLOCK_LABEL_177;
		as2 = ((String []) (objectbuffer.appendCompletedChunk(((Object []) (as1)))));
		j = 0;
		as2[j] = ((String) (as));
		i = j + 1;
		as1 = as2;
		if(true) goto _L2; else goto _L1
_L1:
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer = findConvertingContentDeserializer(deserializationcontext, beanproperty, _elementDeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #46  <Field JsonDeserializer _elementDeserializer>
	//    5    7:invokevirtual   #183 <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//    6   10:astore_3        
		Object obj = ((Object) (deserializationcontext.constructType(java/lang/String)));
	//    7   11:aload_1         
	//    8   12:ldc1            #29  <Class String>
	//    9   14:invokevirtual   #187 <Method com.fasterxml.jackson.databind.JavaType DeserializationContext.constructType(Class)>
	//   10   17:astore          4
		if(jsondeserializer == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       34
			jsondeserializer = deserializationcontext.findContextualValueDeserializer(((com.fasterxml.jackson.databind.JavaType) (obj)), beanproperty);
	//   13   23:aload_1         
	//   14   24:aload           4
	//   15   26:aload_2         
	//   16   27:invokevirtual   #191 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, BeanProperty)>
	//   17   30:astore_3        
		else
	//*  18   31:goto            43
			jsondeserializer = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, ((com.fasterxml.jackson.databind.JavaType) (obj)));
	//   19   34:aload_1         
	//   20   35:aload_3         
	//   21   36:aload_2         
	//   22   37:aload           4
	//   23   39:invokevirtual   #195 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, com.fasterxml.jackson.databind.JavaType)>
	//   24   42:astore_3        
		obj = ((Object) (findFormatFeature(deserializationcontext, beanproperty, [Ljava/lang/String;, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)));
	//   25   43:aload_0         
	//   26   44:aload_1         
	//   27   45:aload_2         
	//   28   46:ldc1            #41  <Class String[]>
	//   29   48:getstatic       #200 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//   30   51:invokevirtual   #204 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   31   54:astore          4
		beanproperty = ((BeanProperty) (findContentNullProvider(deserializationcontext, beanproperty, jsondeserializer)));
	//   32   56:aload_0         
	//   33   57:aload_1         
	//   34   58:aload_2         
	//   35   59:aload_3         
	//   36   60:invokevirtual   #208 <Method NullValueProvider findContentNullProvider(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   37   63:astore_2        
		deserializationcontext = ((DeserializationContext) (jsondeserializer));
	//   38   64:aload_3         
	//   39   65:astore_1        
		if(jsondeserializer != null)
	//*  40   66:aload_3         
	//*  41   67:ifnull          82
		{
			deserializationcontext = ((DeserializationContext) (jsondeserializer));
	//   42   70:aload_3         
	//   43   71:astore_1        
			if(isDefaultDeserializer(jsondeserializer))
	//*  44   72:aload_0         
	//*  45   73:aload_3         
	//*  46   74:invokevirtual   #212 <Method boolean isDefaultDeserializer(JsonDeserializer)>
	//*  47   77:ifeq            82
				deserializationcontext = null;
	//   48   80:aconst_null     
	//   49   81:astore_1        
		}
		if(_elementDeserializer == deserializationcontext && _unwrapSingle == obj && _nullProvider == beanproperty)
	//*  50   82:aload_0         
	//*  51   83:getfield        #46  <Field JsonDeserializer _elementDeserializer>
	//*  52   86:aload_1         
	//*  53   87:if_acmpne       109
	//*  54   90:aload_0         
	//*  55   91:getfield        #50  <Field Boolean _unwrapSingle>
	//*  56   94:aload           4
	//*  57   96:if_acmpne       109
	//*  58   99:aload_0         
	//*  59  100:getfield        #48  <Field NullValueProvider _nullProvider>
	//*  60  103:aload_2         
	//*  61  104:if_acmpne       109
			return ((JsonDeserializer) (this));
	//   62  107:aload_0         
	//   63  108:areturn         
		else
			return ((JsonDeserializer) (new StringArrayDeserializer(((JsonDeserializer) (deserializationcontext)), ((NullValueProvider) (beanproperty)), ((Boolean) (obj)))));
	//   64  109:new             #2   <Class StringArrayDeserializer>
	//   65  112:dup             
	//   66  113:aload_1         
	//   67  114:aload_2         
	//   68  115:aload           4
	//   69  117:invokespecial   #40  <Method void StringArrayDeserializer(JsonDeserializer, NullValueProvider, Boolean)>
	//   70  120:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #217 <Method String[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (String[])obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #41  <Class String[]>
	//    5    7:invokevirtual   #220 <Method String[] deserialize(JsonParser, DeserializationContext, String[])>
	//    6   10:areturn         
	}

	public String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		Object aobj[];
		ObjectBuffer objectbuffer;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #224 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            14
			return handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #226 <Method String[] handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		if(_elementDeserializer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #46  <Field JsonDeserializer _elementDeserializer>
	//*  10   18:ifnull          29
			return _deserializeCustom(jsonparser, deserializationcontext, ((String []) (null)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aconst_null     
	//   15   25:invokevirtual   #228 <Method String[] _deserializeCustom(JsonParser, DeserializationContext, String[])>
	//   16   28:areturn         
		objectbuffer = deserializationcontext.leaseObjectBuffer();
	//   17   29:aload_2         
	//   18   30:invokevirtual   #134 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   19   33:astore          8
		aobj = objectbuffer.resetAndStart();
	//   20   35:aload           8
	//   21   37:invokevirtual   #140 <Method Object[] ObjectBuffer.resetAndStart()>
	//   22   40:astore          6
		i = 0;
	//   23   42:iconst_0        
	//   24   43:istore_3        
_L1:
		int j;
		Object obj;
		Object obj1;
		Object aobj1[];
		try
		{
			obj1 = ((Object) (jsonparser.nextTextValue()));
	//   25   44:aload_1         
	//   26   45:invokevirtual   #146 <Method String JsonParser.nextTextValue()>
	//   27   48:astore          7
		}
	//*  28   50:aload           7
	//*  29   52:astore          5
	//*  30   54:aload           7
	//*  31   56:ifnonnull       143
	//*  32   59:aload_1         
	//*  33   60:invokevirtual   #150 <Method JsonToken JsonParser.getCurrentToken()>
	//*  34   63:astore          5
	//*  35   65:getstatic       #153 <Field JsonToken JsonToken.END_ARRAY>
	//*  36   68:astore          7
	//*  37   70:aload           5
	//*  38   72:aload           7
	//*  39   74:if_acmpne       99
	//*  40   77:aload           8
	//*  41   79:aload           6
	//*  42   81:iload_3         
	//*  43   82:ldc1            #29  <Class String>
	//*  44   84:invokevirtual   #157 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int, Class)>
	//*  45   87:checkcast       #41  <Class String[]>
	//*  46   90:astore_1        
	//*  47   91:aload_2         
	//*  48   92:aload           8
	//*  49   94:invokevirtual   #161 <Method void DeserializationContext.returnObjectBuffer(ObjectBuffer)>
	//*  50   97:aload_1         
	//*  51   98:areturn         
	//*  52   99:aload           5
	//*  53  101:getstatic       #87  <Field JsonToken JsonToken.VALUE_NULL>
	//*  54  104:if_acmpne       135
	//*  55  107:aload_0         
	//*  56  108:getfield        #58  <Field boolean _skipNullValues>
	//*  57  111:ifeq            117
	//*  58  114:goto            44
	//*  59  117:aload_0         
	//*  60  118:getfield        #48  <Field NullValueProvider _nullProvider>
	//*  61  121:aload_2         
	//*  62  122:invokeinterface #99  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//*  63  127:checkcast       #29  <Class String>
	//*  64  130:astore          5
	//*  65  132:goto            143
	//*  66  135:aload_0         
	//*  67  136:aload_1         
	//*  68  137:aload_2         
	//*  69  138:invokevirtual   #103 <Method String _parseString(JsonParser, DeserializationContext)>
	//*  70  141:astore          5
	//*  71  143:aload           6
	//*  72  145:astore          7
	//*  73  147:iload_3         
	//*  74  148:istore          4
	//*  75  150:iload_3         
	//*  76  151:aload           6
	//*  77  153:arraylength     
	//*  78  154:icmplt          169
	//*  79  157:aload           8
	//*  80  159:aload           6
	//*  81  161:invokevirtual   #171 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//*  82  164:astore          7
	//*  83  166:iconst_0        
	//*  84  167:istore          4
	//*  85  169:aload           7
	//*  86  171:iload           4
	//*  87  173:aload           5
	//*  88  175:aastore         
	//*  89  176:iload           4
	//*  90  178:iconst_1        
	//*  91  179:iadd            
	//*  92  180:istore_3        
	//*  93  181:aload           7
	//*  94  183:astore          6
	//*  95  185:goto            44
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  96  188:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aobj)), objectbuffer.bufferedSize() + i);
	//   97  189:aload_1         
	//   98  190:aload           6
	//   99  192:aload           8
	//  100  194:invokevirtual   #231 <Method int ObjectBuffer.bufferedSize()>
	//  101  197:iload_3         
	//  102  198:iadd            
	//  103  199:invokestatic    #177 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  104  202:athrow          
		}
		obj = obj1;
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_143;
		obj = ((Object) (jsonparser.getCurrentToken()));
		obj1 = ((Object) (JsonToken.END_ARRAY));
		if(obj == obj1)
		{
			jsonparser = ((JsonParser) ((String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String)));
			deserializationcontext.returnObjectBuffer(objectbuffer);
			return ((String []) (jsonparser));
		}
		if(obj != JsonToken.VALUE_NULL)
			break MISSING_BLOCK_LABEL_135;
		if(!_skipNullValues) goto _L2; else goto _L1
_L2:
		obj = ((Object) ((String)_nullProvider.getNullValue(deserializationcontext)));
		break MISSING_BLOCK_LABEL_143;
		obj = ((Object) (_parseString(jsonparser, deserializationcontext)));
		aobj1 = aobj;
		j = i;
		if(i < aobj.length)
			break MISSING_BLOCK_LABEL_169;
		aobj1 = objectbuffer.appendCompletedChunk(aobj);
		j = 0;
		aobj1[j] = obj;
		i = j + 1;
		aobj = aobj1;
		  goto _L1
	}

	public String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, String as[])
		throws IOException
	{
		int j;
		Object aobj[];
		ObjectBuffer objectbuffer;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #224 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            54
		{
			jsonparser = ((JsonParser) (handleNonArray(jsonparser, deserializationcontext)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #226 <Method String[] handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:astore_1        
			if(jsonparser == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
			{
				return as;
	//   10   18:aload_3         
	//   11   19:areturn         
			} else
			{
				int i = as.length;
	//   12   20:aload_3         
	//   13   21:arraylength     
	//   14   22:istore          4
				deserializationcontext = ((DeserializationContext) (new String[jsonparser.length + i]));
	//   15   24:aload_1         
	//   16   25:arraylength     
	//   17   26:iload           4
	//   18   28:iadd            
	//   19   29:anewarray       String[]
	//   20   32:astore_2        
				System.arraycopy(((Object) (as)), 0, ((Object) (deserializationcontext)), 0, i);
	//   21   33:aload_3         
	//   22   34:iconst_0        
	//   23   35:aload_2         
	//   24   36:iconst_0        
	//   25   37:iload           4
	//   26   39:invokestatic    #237 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (jsonparser)), 0, ((Object) (deserializationcontext)), i, jsonparser.length);
	//   27   42:aload_1         
	//   28   43:iconst_0        
	//   29   44:aload_2         
	//   30   45:iload           4
	//   31   47:aload_1         
	//   32   48:arraylength     
	//   33   49:invokestatic    #237 <Method void System.arraycopy(Object, int, Object, int, int)>
				return ((String []) (deserializationcontext));
	//   34   52:aload_2         
	//   35   53:areturn         
			}
		}
		if(_elementDeserializer != null)
	//*  36   54:aload_0         
	//*  37   55:getfield        #46  <Field JsonDeserializer _elementDeserializer>
	//*  38   58:ifnull          69
			return _deserializeCustom(jsonparser, deserializationcontext, as);
	//   39   61:aload_0         
	//   40   62:aload_1         
	//   41   63:aload_2         
	//   42   64:aload_3         
	//   43   65:invokevirtual   #228 <Method String[] _deserializeCustom(JsonParser, DeserializationContext, String[])>
	//   44   68:areturn         
		objectbuffer = deserializationcontext.leaseObjectBuffer();
	//   45   69:aload_2         
	//   46   70:invokevirtual   #134 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   47   73:astore          8
		j = as.length;
	//   48   75:aload_3         
	//   49   76:arraylength     
	//   50   77:istore          4
		aobj = objectbuffer.resetAndStart(((Object []) (as)), j);
	//   51   79:aload           8
	//   52   81:aload_3         
	//   53   82:iload           4
	//   54   84:invokevirtual   #143 <Method Object[] ObjectBuffer.resetAndStart(Object[], int)>
	//   55   87:astore          6
_L1:
		int k;
		Object obj;
		Object aobj1[];
		try
		{
			obj = ((Object) (jsonparser.nextTextValue()));
	//   56   89:aload_1         
	//   57   90:invokevirtual   #146 <Method String JsonParser.nextTextValue()>
	//   58   93:astore          7
		}
	//*  59   95:aload           7
	//*  60   97:astore_3        
	//*  61   98:aload           7
	//*  62  100:ifnonnull       184
	//*  63  103:aload_1         
	//*  64  104:invokevirtual   #150 <Method JsonToken JsonParser.getCurrentToken()>
	//*  65  107:astore_3        
	//*  66  108:getstatic       #153 <Field JsonToken JsonToken.END_ARRAY>
	//*  67  111:astore          7
	//*  68  113:aload_3         
	//*  69  114:aload           7
	//*  70  116:if_acmpne       142
	//*  71  119:aload           8
	//*  72  121:aload           6
	//*  73  123:iload           4
	//*  74  125:ldc1            #29  <Class String>
	//*  75  127:invokevirtual   #157 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int, Class)>
	//*  76  130:checkcast       #41  <Class String[]>
	//*  77  133:astore_1        
	//*  78  134:aload_2         
	//*  79  135:aload           8
	//*  80  137:invokevirtual   #161 <Method void DeserializationContext.returnObjectBuffer(ObjectBuffer)>
	//*  81  140:aload_1         
	//*  82  141:areturn         
	//*  83  142:aload_3         
	//*  84  143:getstatic       #87  <Field JsonToken JsonToken.VALUE_NULL>
	//*  85  146:if_acmpne       177
	//*  86  149:aload_0         
	//*  87  150:getfield        #58  <Field boolean _skipNullValues>
	//*  88  153:ifeq            160
	//*  89  156:getstatic       #31  <Field String[] NO_STRINGS>
	//*  90  159:areturn         
	//*  91  160:aload_0         
	//*  92  161:getfield        #48  <Field NullValueProvider _nullProvider>
	//*  93  164:aload_2         
	//*  94  165:invokeinterface #99  <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//*  95  170:checkcast       #29  <Class String>
	//*  96  173:astore_3        
	//*  97  174:goto            184
	//*  98  177:aload_0         
	//*  99  178:aload_1         
	//* 100  179:aload_2         
	//* 101  180:invokevirtual   #103 <Method String _parseString(JsonParser, DeserializationContext)>
	//* 102  183:astore_3        
	//* 103  184:iload           4
	//* 104  186:istore          5
	//* 105  188:aload           6
	//* 106  190:astore          7
	//* 107  192:iload           4
	//* 108  194:aload           6
	//* 109  196:arraylength     
	//* 110  197:icmplt          212
	//* 111  200:aload           8
	//* 112  202:aload           6
	//* 113  204:invokevirtual   #171 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//* 114  207:astore          7
	//* 115  209:iconst_0        
	//* 116  210:istore          5
	//* 117  212:aload           7
	//* 118  214:iload           5
	//* 119  216:aload_3         
	//* 120  217:aastore         
	//* 121  218:iload           5
	//* 122  220:iconst_1        
	//* 123  221:iadd            
	//* 124  222:istore          4
	//* 125  224:aload           7
	//* 126  226:astore          6
	//* 127  228:goto            89
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//* 128  231:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aobj)), objectbuffer.bufferedSize() + j);
	//  129  232:aload_1         
	//  130  233:aload           6
	//  131  235:aload           8
	//  132  237:invokevirtual   #231 <Method int ObjectBuffer.bufferedSize()>
	//  133  240:iload           4
	//  134  242:iadd            
	//  135  243:invokestatic    #177 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  136  246:athrow          
		}
		as = ((String []) (obj));
		if(obj != null)
			break MISSING_BLOCK_LABEL_184;
		as = ((String []) (jsonparser.getCurrentToken()));
		obj = ((Object) (JsonToken.END_ARRAY));
		if(as == obj)
		{
			jsonparser = ((JsonParser) ((String[])objectbuffer.completeAndClearBuffer(aobj, j, java/lang/String)));
			deserializationcontext.returnObjectBuffer(objectbuffer);
			return ((String []) (jsonparser));
		}
		if(as == JsonToken.VALUE_NULL)
		{
			if(_skipNullValues)
				return NO_STRINGS;
			as = ((String []) ((String)_nullProvider.getNullValue(deserializationcontext)));
			break MISSING_BLOCK_LABEL_184;
		}
		as = ((String []) (_parseString(jsonparser, deserializationcontext)));
		k = j;
		aobj1 = aobj;
		if(j < aobj.length)
			break MISSING_BLOCK_LABEL_212;
		aobj1 = objectbuffer.appendCompletedChunk(aobj);
		k = 0;
		aobj1[k] = ((Object) (as));
		j = k + 1;
		aobj = aobj1;
		  goto _L1
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #244 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public AccessPattern getEmptyAccessPattern()
	{
		return AccessPattern.CONSTANT;
	//    0    0:getstatic       #252 <Field AccessPattern AccessPattern.CONSTANT>
	//    1    3:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return ((Object) (NO_STRINGS));
	//    0    0:getstatic       #31  <Field String[] NO_STRINGS>
	//    1    3:areturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.TRUE;
	//    0    0:getstatic       #69  <Field Boolean Boolean.TRUE>
	//    1    3:areturn         
	}

	private static final String NO_STRINGS[] = new String[0];
	public static final StringArrayDeserializer instance = new StringArrayDeserializer();
	private static final long serialVersionUID = 2L;
	protected JsonDeserializer _elementDeserializer;
	protected final NullValueProvider _nullProvider;
	protected final boolean _skipNullValues;
	protected final Boolean _unwrapSingle;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       String[]
	//    2    4:putstatic       #31  <Field String[] NO_STRINGS>
	//    3    7:new             #2   <Class StringArrayDeserializer>
	//    4   10:dup             
	//    5   11:invokespecial   #34  <Method void StringArrayDeserializer()>
	//    6   14:putstatic       #36  <Field StringArrayDeserializer instance>
	//*   7   17:return          
	}
}
