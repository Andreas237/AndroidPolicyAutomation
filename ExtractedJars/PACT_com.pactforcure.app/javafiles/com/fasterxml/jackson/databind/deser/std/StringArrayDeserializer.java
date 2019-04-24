// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public final class StringArrayDeserializer extends StdDeserializer
	implements ContextualDeserializer
{

	public StringArrayDeserializer()
	{
		this(((JsonDeserializer) (null)), ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #30  <Method void StringArrayDeserializer(JsonDeserializer, Boolean)>
	//    4    6:return          
	}

	protected StringArrayDeserializer(JsonDeserializer jsondeserializer, Boolean boolean1)
	{
		super([Ljava/lang/String;);
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <Class String[]>
	//    2    3:invokespecial   #35  <Method void StdDeserializer(Class)>
		_elementDeserializer = jsondeserializer;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #37  <Field JsonDeserializer _elementDeserializer>
		_unwrapSingle = boolean1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #39  <Field Boolean _unwrapSingle>
	//    9   16:return          
	}

	private final String[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		String as[];
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		as = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		boolean flag;
		if(_unwrapSingle == Boolean.TRUE || _unwrapSingle == null && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
	//*   4    6:aload_0         
	//*   5    7:getfield        #39  <Field Boolean _unwrapSingle>
	//*   6   10:getstatic       #50  <Field Boolean Boolean.TRUE>
	//*   7   13:if_acmpeq       33
	//*   8   16:aload_0         
	//*   9   17:getfield        #39  <Field Boolean _unwrapSingle>
	//*  10   20:ifnonnull       65
	//*  11   23:aload_2         
	//*  12   24:getstatic       #56  <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*  13   27:invokevirtual   #62  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  14   30:ifeq            65
			flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_3        
		else
	//*  17   35:iload_3         
	//*  18   36:ifeq            80
	//*  19   39:aload_1         
	//*  20   40:getstatic       #68  <Field JsonToken JsonToken.VALUE_NULL>
	//*  21   43:invokevirtual   #74  <Method boolean JsonParser.hasToken(JsonToken)>
	//*  22   46:ifeq            70
	//*  23   49:aload           4
	//*  24   51:astore_1        
	//*  25   52:iconst_1        
	//*  26   53:anewarray       String[]
	//*  27   56:dup             
	//*  28   57:iconst_0        
	//*  29   58:aload_1         
	//*  30   59:aastore         
	//*  31   60:astore          4
	//*  32   62:aload           4
	//*  33   64:areturn         
			flag = false;
	//   34   65:iconst_0        
	//   35   66:istore_3        
		if(!flag) goto _L2; else goto _L1
_L1:
		if(jsonparser.hasToken(JsonToken.VALUE_NULL))
			jsonparser = ((JsonParser) (as));
		else
	//*  36   67:goto            35
			jsonparser = ((JsonParser) (_parseString(jsonparser, deserializationcontext)));
	//   37   70:aload_0         
	//   38   71:aload_1         
	//   39   72:aload_2         
	//   40   73:invokevirtual   #80  <Method String _parseString(JsonParser, DeserializationContext)>
	//   41   76:astore_1        
		as = (new String[] {
			jsonparser
		});
_L4:
		return as;
	//*  42   77:goto            52
_L2:
		if(!jsonparser.hasToken(JsonToken.VALUE_STRING) || !deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT))
			break; /* Loop/switch isn't completed */
	//   43   80:aload_1         
	//   44   81:getstatic       #83  <Field JsonToken JsonToken.VALUE_STRING>
	//   45   84:invokevirtual   #74  <Method boolean JsonParser.hasToken(JsonToken)>
	//   46   87:ifeq            114
	//   47   90:aload_2         
	//   48   91:getstatic       #86  <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//   49   94:invokevirtual   #62  <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   50   97:ifeq            114
		as = ((String []) (obj));
	//   51  100:aload           5
	//   52  102:astore          4
		if(jsonparser.getText().length() == 0) goto _L4; else goto _L3
	//   53  104:aload_1         
	//   54  105:invokevirtual   #90  <Method String JsonParser.getText()>
	//   55  108:invokevirtual   #94  <Method int String.length()>
	//   56  111:ifeq            62
_L3:
		throw deserializationcontext.mappingException(_valueClass);
	//   57  114:aload_2         
	//   58  115:aload_0         
	//   59  116:getfield        #98  <Field Class _valueClass>
	//   60  119:invokevirtual   #102 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//   61  122:athrow          
	}

	protected final String[] _deserializeCustom(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		Object aobj[];
		ObjectBuffer objectbuffer;
		JsonDeserializer jsondeserializer;
		objectbuffer = deserializationcontext.leaseObjectBuffer();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #110 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//    2    4:astore          7
		aobj = objectbuffer.resetAndStart();
	//    3    6:aload           7
	//    4    8:invokevirtual   #116 <Method Object[] ObjectBuffer.resetAndStart()>
	//    5   11:astore          6
		jsondeserializer = _elementDeserializer;
	//    6   13:aload_0         
	//    7   14:getfield        #37  <Field JsonDeserializer _elementDeserializer>
	//    8   17:astore          8
		i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_3        
_L5:
		Object obj;
		JsonToken jsontoken;
		if(jsonparser.nextTextValue() != null)
			break MISSING_BLOCK_LABEL_146;
	//   11   21:aload_1         
	//   12   22:invokevirtual   #119 <Method String JsonParser.nextTextValue()>
	//   13   25:ifnonnull       146
		obj = ((Object) (jsonparser.getCurrentToken()));
	//   14   28:aload_1         
	//   15   29:invokevirtual   #123 <Method JsonToken JsonParser.getCurrentToken()>
	//   16   32:astore          5
		jsontoken = JsonToken.END_ARRAY;
	//   17   34:getstatic       #126 <Field JsonToken JsonToken.END_ARRAY>
	//   18   37:astore          9
		if(obj == jsontoken)
	//*  19   39:aload           5
	//*  20   41:aload           9
	//*  21   43:if_acmpne       68
		{
			jsonparser = ((JsonParser) ((String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String)));
	//   22   46:aload           7
	//   23   48:aload           6
	//   24   50:iload_3         
	//   25   51:ldc1            #76  <Class String>
	//   26   53:invokevirtual   #130 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int, Class)>
	//   27   56:checkcast       #32  <Class String[]>
	//   28   59:astore_1        
			deserializationcontext.returnObjectBuffer(objectbuffer);
	//   29   60:aload_2         
	//   30   61:aload           7
	//   31   63:invokevirtual   #134 <Method void DeserializationContext.returnObjectBuffer(ObjectBuffer)>
			return ((String []) (jsonparser));
	//   32   66:aload_1         
	//   33   67:areturn         
		}
		if(obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//   34   68:aload           5
	//   35   70:getstatic       #68  <Field JsonToken JsonToken.VALUE_NULL>
	//   36   73:if_acmpne       131
_L1:
		obj = ((Object) ((String)jsondeserializer.getNullValue(deserializationcontext)));
	//   37   76:aload           8
	//   38   78:aload_2         
	//   39   79:invokevirtual   #140 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   40   82:checkcast       #76  <Class String>
	//   41   85:astore          5
_L6:
		if(i < aobj.length) goto _L4; else goto _L3
	//   42   87:iload_3         
	//   43   88:aload           6
	//   44   90:arraylength     
	//   45   91:icmplt          161
_L3:
		aobj = objectbuffer.appendCompletedChunk(aobj);
	//   46   94:aload           7
	//   47   96:aload           6
	//   48   98:invokevirtual   #144 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//   49  101:astore          6
		i = 0;
	//   50  103:iconst_0        
	//   51  104:istore_3        
_L4:
		int j = i + 1;
	//   52  105:iload_3         
	//   53  106:iconst_1        
	//   54  107:iadd            
	//   55  108:istore          4
		aobj[i] = obj;
	//   56  110:aload           6
	//   57  112:iload_3         
	//   58  113:aload           5
	//   59  115:aastore         
		i = j;
	//   60  116:iload           4
	//   61  118:istore_3        
		  goto _L5
	//*  62  119:goto            21
	//*  63  122:astore_1        
	//*  64  123:aload_1         
	//*  65  124:ldc1            #76  <Class String>
	//*  66  126:iload_3         
	//*  67  127:invokestatic    #150 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//*  68  130:athrow          
_L2:
		try
		{
			obj = ((Object) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   69  131:aload           8
	//   70  133:aload_1         
	//   71  134:aload_2         
	//   72  135:invokevirtual   #154 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   73  138:checkcast       #76  <Class String>
	//   74  141:astore          5
		}
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), java/lang/String, i);
		}
		  goto _L6
	//*  75  143:goto            87
		obj = ((Object) ((String)jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   76  146:aload           8
	//   77  148:aload_1         
	//   78  149:aload_2         
	//   79  150:invokevirtual   #154 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   80  153:checkcast       #76  <Class String>
	//   81  156:astore          5
		  goto _L6
	//*  82  158:goto            87
	//*  83  161:goto            105
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer = findConvertingContentDeserializer(deserializationcontext, beanproperty, _elementDeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #37  <Field JsonDeserializer _elementDeserializer>
	//    5    7:invokevirtual   #160 <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//    6   10:astore_3        
		com.fasterxml.jackson.databind.JavaType javatype = deserializationcontext.constructType(java/lang/String);
	//    7   11:aload_1         
	//    8   12:ldc1            #76  <Class String>
	//    9   14:invokevirtual   #164 <Method com.fasterxml.jackson.databind.JavaType DeserializationContext.constructType(Class)>
	//   10   17:astore          4
		if(jsondeserializer == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       79
			jsondeserializer = deserializationcontext.findContextualValueDeserializer(javatype, beanproperty);
	//   13   23:aload_1         
	//   14   24:aload           4
	//   15   26:aload_2         
	//   16   27:invokevirtual   #168 <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, BeanProperty)>
	//   17   30:astore_3        
		else
	//*  18   31:aload_0         
	//*  19   32:aload_1         
	//*  20   33:aload_2         
	//*  21   34:ldc1            #32  <Class String[]>
	//*  22   36:getstatic       #173 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*  23   39:invokevirtual   #177 <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//*  24   42:astore_2        
	//*  25   43:aload_3         
	//*  26   44:astore_1        
	//*  27   45:aload_3         
	//*  28   46:ifnull          61
	//*  29   49:aload_3         
	//*  30   50:astore_1        
	//*  31   51:aload_0         
	//*  32   52:aload_3         
	//*  33   53:invokevirtual   #181 <Method boolean isDefaultDeserializer(JsonDeserializer)>
	//*  34   56:ifeq            61
	//*  35   59:aconst_null     
	//*  36   60:astore_1        
	//*  37   61:aload_0         
	//*  38   62:getfield        #37  <Field JsonDeserializer _elementDeserializer>
	//*  39   65:aload_1         
	//*  40   66:if_acmpne       91
	//*  41   69:aload_0         
	//*  42   70:getfield        #39  <Field Boolean _unwrapSingle>
	//*  43   73:aload_2         
	//*  44   74:if_acmpne       91
	//*  45   77:aload_0         
	//*  46   78:areturn         
			jsondeserializer = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, javatype);
	//   47   79:aload_1         
	//   48   80:aload_3         
	//   49   81:aload_2         
	//   50   82:aload           4
	//   51   84:invokevirtual   #185 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, com.fasterxml.jackson.databind.JavaType)>
	//   52   87:astore_3        
		beanproperty = ((BeanProperty) (findFormatFeature(deserializationcontext, beanproperty, [Ljava/lang/String;, com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)));
		deserializationcontext = ((DeserializationContext) (jsondeserializer));
		if(jsondeserializer != null)
		{
			deserializationcontext = ((DeserializationContext) (jsondeserializer));
			if(isDefaultDeserializer(jsondeserializer))
				deserializationcontext = null;
		}
		if(_elementDeserializer == deserializationcontext && _unwrapSingle == beanproperty)
			return ((JsonDeserializer) (this));
		else
	//*  53   88:goto            31
			return ((JsonDeserializer) (new StringArrayDeserializer(((JsonDeserializer) (deserializationcontext)), ((Boolean) (beanproperty)))));
	//   54   91:new             #2   <Class StringArrayDeserializer>
	//   55   94:dup             
	//   56   95:aload_1         
	//   57   96:aload_2         
	//   58   97:invokespecial   #30  <Method void StringArrayDeserializer(JsonDeserializer, Boolean)>
	//   59  100:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #190 <Method String[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		Object aobj[];
		ObjectBuffer objectbuffer;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #194 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            14
			return handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #196 <Method String[] handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		if(_elementDeserializer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #37  <Field JsonDeserializer _elementDeserializer>
	//*  10   18:ifnull          28
			return _deserializeCustom(jsonparser, deserializationcontext);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #198 <Method String[] _deserializeCustom(JsonParser, DeserializationContext)>
	//   15   27:areturn         
		objectbuffer = deserializationcontext.leaseObjectBuffer();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #110 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   18   32:astore          8
		aobj = objectbuffer.resetAndStart();
	//   19   34:aload           8
	//   20   36:invokevirtual   #116 <Method Object[] ObjectBuffer.resetAndStart()>
	//   21   39:astore          5
		i = 0;
	//   22   41:iconst_0        
	//   23   42:istore_3        
_L1:
		int j;
		Object obj;
		String s;
		Object aobj1[];
		JsonToken jsontoken;
		try
		{
			s = jsonparser.nextTextValue();
	//   24   43:aload_1         
	//   25   44:invokevirtual   #119 <Method String JsonParser.nextTextValue()>
	//   26   47:astore          7
		}
	//*  27   49:aload           7
	//*  28   51:astore          6
	//*  29   53:aload           7
	//*  30   55:ifnonnull       118
	//*  31   58:aload_1         
	//*  32   59:invokevirtual   #123 <Method JsonToken JsonParser.getCurrentToken()>
	//*  33   62:astore          9
	//*  34   64:getstatic       #126 <Field JsonToken JsonToken.END_ARRAY>
	//*  35   67:astore          6
	//*  36   69:aload           9
	//*  37   71:aload           6
	//*  38   73:if_acmpne       98
	//*  39   76:aload           8
	//*  40   78:aload           5
	//*  41   80:iload_3         
	//*  42   81:ldc1            #76  <Class String>
	//*  43   83:invokevirtual   #130 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int, Class)>
	//*  44   86:checkcast       #32  <Class String[]>
	//*  45   89:astore_1        
	//*  46   90:aload_2         
	//*  47   91:aload           8
	//*  48   93:invokevirtual   #134 <Method void DeserializationContext.returnObjectBuffer(ObjectBuffer)>
	//*  49   96:aload_1         
	//*  50   97:areturn         
	//*  51   98:aload           7
	//*  52  100:astore          6
	//*  53  102:aload           9
	//*  54  104:getstatic       #68  <Field JsonToken JsonToken.VALUE_NULL>
	//*  55  107:if_acmpeq       118
	//*  56  110:aload_0         
	//*  57  111:aload_1         
	//*  58  112:aload_2         
	//*  59  113:invokevirtual   #80  <Method String _parseString(JsonParser, DeserializationContext)>
	//*  60  116:astore          6
	//*  61  118:iload_3         
	//*  62  119:aload           5
	//*  63  121:arraylength     
	//*  64  122:icmplt          172
	//*  65  125:aload           8
	//*  66  127:aload           5
	//*  67  129:invokevirtual   #144 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//*  68  132:astore          7
	//*  69  134:iconst_0        
	//*  70  135:istore_3        
	//*  71  136:aload           7
	//*  72  138:astore          5
	//*  73  140:iload_3         
	//*  74  141:iconst_1        
	//*  75  142:iadd            
	//*  76  143:istore          4
	//*  77  145:aload           5
	//*  78  147:iload_3         
	//*  79  148:aload           6
	//*  80  150:aastore         
	//*  81  151:iload           4
	//*  82  153:istore_3        
	//*  83  154:goto            43
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  84  157:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aobj)), objectbuffer.bufferedSize() + i);
	//   85  158:aload_1         
	//   86  159:aload           5
	//   87  161:aload           8
	//   88  163:invokevirtual   #201 <Method int ObjectBuffer.bufferedSize()>
	//   89  166:iload_3         
	//   90  167:iadd            
	//   91  168:invokestatic    #150 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   92  171:athrow          
		}
		obj = ((Object) (s));
		if(s != null)
			break MISSING_BLOCK_LABEL_118;
		jsontoken = jsonparser.getCurrentToken();
		obj = ((Object) (JsonToken.END_ARRAY));
		if(jsontoken == obj)
		{
			jsonparser = ((JsonParser) ((String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String)));
			deserializationcontext.returnObjectBuffer(objectbuffer);
			return ((String []) (jsonparser));
		}
		obj = ((Object) (s));
		if(jsontoken != JsonToken.VALUE_NULL)
			obj = ((Object) (_parseString(jsonparser, deserializationcontext)));
		if(i < aobj.length)
			break MISSING_BLOCK_LABEL_140;
		aobj1 = objectbuffer.appendCompletedChunk(aobj);
		i = 0;
		aobj = aobj1;
		j = i + 1;
		aobj[i] = obj;
		i = j;
		  goto _L1
	//*  93  172:goto            140
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #208 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public static final StringArrayDeserializer instance = new StringArrayDeserializer();
	private static final long serialVersionUID = 2L;
	protected JsonDeserializer _elementDeserializer;
	protected final Boolean _unwrapSingle;

	static 
	{
	//    0    0:new             #2   <Class StringArrayDeserializer>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringArrayDeserializer()>
	//    3    7:putstatic       #26  <Field StringArrayDeserializer instance>
	//*   4   10:return          
	}
}
