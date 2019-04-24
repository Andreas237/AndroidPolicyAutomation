// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			ContainerDeserializerBase

public class ObjectArrayDeserializer extends ContainerDeserializerBase
	implements ContextualDeserializer
{

	protected ObjectArrayDeserializer(ObjectArrayDeserializer objectarraydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, Boolean boolean1)
	{
		super(((JavaType) (objectarraydeserializer._arrayType)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #30  <Field ArrayType _arrayType>
	//    3    5:invokespecial   #33  <Method void ContainerDeserializerBase(JavaType)>
		_arrayType = objectarraydeserializer._arrayType;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #30  <Field ArrayType _arrayType>
	//    7   13:putfield        #30  <Field ArrayType _arrayType>
		_elementClass = objectarraydeserializer._elementClass;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #35  <Field Class _elementClass>
	//   11   21:putfield        #35  <Field Class _elementClass>
		_untyped = objectarraydeserializer._untyped;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getfield        #37  <Field boolean _untyped>
	//   15   29:putfield        #37  <Field boolean _untyped>
		_elementDeserializer = jsondeserializer;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #39  <Field JsonDeserializer _elementDeserializer>
		_elementTypeDeserializer = typedeserializer;
	//   19   37:aload_0         
	//   20   38:aload_3         
	//   21   39:putfield        #41  <Field TypeDeserializer _elementTypeDeserializer>
		_unwrapSingle = boolean1;
	//   22   42:aload_0         
	//   23   43:aload           4
	//   24   45:putfield        #43  <Field Boolean _unwrapSingle>
	//   25   48:return          
	}

	public ObjectArrayDeserializer(ArrayType arraytype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
		super(((JavaType) (arraytype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void ContainerDeserializerBase(JavaType)>
		_arrayType = arraytype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #30  <Field ArrayType _arrayType>
		_elementClass = arraytype.getContentType().getRawClass();
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #53  <Method JavaType ArrayType.getContentType()>
	//    9   15:invokevirtual   #59  <Method Class JavaType.getRawClass()>
	//   10   18:putfield        #35  <Field Class _elementClass>
		boolean flag;
		if(_elementClass == java/lang/Object)
	//*  11   21:aload_0         
	//*  12   22:getfield        #35  <Field Class _elementClass>
	//*  13   25:ldc1            #61  <Class Object>
	//*  14   27:if_acmpne       55
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore          4
		else
	//*  17   33:aload_0         
	//*  18   34:iload           4
	//*  19   36:putfield        #37  <Field boolean _untyped>
	//*  20   39:aload_0         
	//*  21   40:aload_2         
	//*  22   41:putfield        #39  <Field JsonDeserializer _elementDeserializer>
	//*  23   44:aload_0         
	//*  24   45:aload_3         
	//*  25   46:putfield        #41  <Field TypeDeserializer _elementTypeDeserializer>
	//*  26   49:aload_0         
	//*  27   50:aconst_null     
	//*  28   51:putfield        #43  <Field Boolean _unwrapSingle>
	//*  29   54:return          
			flag = false;
	//   30   55:iconst_0        
	//   31   56:istore          4
		_untyped = flag;
		_elementDeserializer = jsondeserializer;
		_elementTypeDeserializer = typedeserializer;
		_unwrapSingle = null;
	//*  32   58:goto            33
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_elementDeserializer));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//    2    4:astore_3        
		Boolean boolean1 = findFormatFeature(deserializationcontext, beanproperty, _arrayType.getRawClass(), com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_0         
	//    7    9:getfield        #30  <Field ArrayType _arrayType>
	//    8   12:invokevirtual   #67  <Method Class ArrayType.getRawClass()>
	//    9   15:getstatic       #73  <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//   10   18:invokevirtual   #77  <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   11   21:astore          5
		obj = ((Object) (findConvertingContentDeserializer(deserializationcontext, beanproperty, ((JsonDeserializer) (obj)))));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #81  <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   17   30:astore_3        
		Object obj1 = ((Object) (_arrayType.getContentType()));
	//   18   31:aload_0         
	//   19   32:getfield        #30  <Field ArrayType _arrayType>
	//   20   35:invokevirtual   #53  <Method JavaType ArrayType.getContentType()>
	//   21   38:astore          4
		if(obj == null)
	//*  22   40:aload_3         
	//*  23   41:ifnonnull       82
			deserializationcontext = ((DeserializationContext) (deserializationcontext.findContextualValueDeserializer(((JavaType) (obj1)), beanproperty)));
	//   24   44:aload_1         
	//   25   45:aload           4
	//   26   47:aload_2         
	//   27   48:invokevirtual   #87  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   28   51:astore_1        
		else
	//*  29   52:aload_0         
	//*  30   53:getfield        #41  <Field TypeDeserializer _elementTypeDeserializer>
	//*  31   56:astore          4
	//*  32   58:aload           4
	//*  33   60:astore_3        
	//*  34   61:aload           4
	//*  35   63:ifnull          73
	//*  36   66:aload           4
	//*  37   68:aload_2         
	//*  38   69:invokevirtual   #93  <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//*  39   72:astore_3        
	//*  40   73:aload_0         
	//*  41   74:aload_3         
	//*  42   75:aload_1         
	//*  43   76:aload           5
	//*  44   78:invokevirtual   #97  <Method ObjectArrayDeserializer withResolved(TypeDeserializer, JsonDeserializer, Boolean)>
	//*  45   81:areturn         
			deserializationcontext = ((DeserializationContext) (deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj)), beanproperty, ((JavaType) (obj1)))));
	//   46   82:aload_1         
	//   47   83:aload_3         
	//   48   84:aload_2         
	//   49   85:aload           4
	//   50   87:invokevirtual   #101 <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   51   90:astore_1        
		obj1 = ((Object) (_elementTypeDeserializer));
		obj = obj1;
		if(obj1 != null)
			obj = ((Object) (((TypeDeserializer) (obj1)).forProperty(beanproperty)));
		return ((JsonDeserializer) (withResolved(((TypeDeserializer) (obj)), ((JsonDeserializer) (deserializationcontext)), boolean1)));
	//*  52   91:goto            52
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #112 <Method Object[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Object[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		Object aobj[];
		ObjectBuffer objectbuffer;
		TypeDeserializer typedeserializer;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #120 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            14
			return handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #123 <Method Object[] handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		objectbuffer = deserializationcontext.leaseObjectBuffer();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #127 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   10   18:astore          8
		aobj = objectbuffer.resetAndStart();
	//   11   20:aload           8
	//   12   22:invokevirtual   #133 <Method Object[] ObjectBuffer.resetAndStart()>
	//   13   25:astore          6
		i = 0;
	//   14   27:iconst_0        
	//   15   28:istore_3        
		typedeserializer = _elementTypeDeserializer;
	//   16   29:aload_0         
	//   17   30:getfield        #41  <Field TypeDeserializer _elementTypeDeserializer>
	//   18   33:astore          9
_L7:
		Object obj;
		obj = ((Object) (jsonparser.nextToken()));
	//   19   35:aload_1         
	//   20   36:invokevirtual   #137 <Method JsonToken JsonParser.nextToken()>
	//   21   39:astore          5
		if(obj == JsonToken.END_ARRAY)
			break MISSING_BLOCK_LABEL_156;
	//   22   41:aload           5
	//   23   43:getstatic       #143 <Field JsonToken JsonToken.END_ARRAY>
	//   24   46:if_acmpeq       156
		if(obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//   25   49:aload           5
	//   26   51:getstatic       #146 <Field JsonToken JsonToken.VALUE_NULL>
	//   27   54:if_acmpne       121
_L1:
		obj = _elementDeserializer.getNullValue(deserializationcontext);
	//   28   57:aload_0         
	//   29   58:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//   30   61:aload_2         
	//   31   62:invokevirtual   #152 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   32   65:astore          5
_L5:
		if(i < aobj.length) goto _L4; else goto _L3
	//   33   67:iload_3         
	//   34   68:aload           6
	//   35   70:arraylength     
	//   36   71:icmplt          196
_L3:
		Object aobj1[] = objectbuffer.appendCompletedChunk(aobj);
	//   37   74:aload           8
	//   38   76:aload           6
	//   39   78:invokevirtual   #156 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//   40   81:astore          7
		i = 0;
	//   41   83:iconst_0        
	//   42   84:istore_3        
		aobj = aobj1;
	//   43   85:aload           7
	//   44   87:astore          6
_L4:
		int j = i + 1;
	//   45   89:iload_3         
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:istore          4
		aobj[i] = obj;
	//   49   94:aload           6
	//   50   96:iload_3         
	//   51   97:aload           5
	//   52   99:aastore         
		i = j;
	//   53  100:iload           4
	//   54  102:istore_3        
		continue; /* Loop/switch isn't completed */
	//   55  103:goto            35
	//*  56  106:astore_1        
	//*  57  107:aload_1         
	//*  58  108:aload           6
	//*  59  110:aload           8
	//*  60  112:invokevirtual   #160 <Method int ObjectBuffer.bufferedSize()>
	//*  61  115:iload_3         
	//*  62  116:iadd            
	//*  63  117:invokestatic    #164 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//*  64  120:athrow          
_L2:
label0:
		{
			if(typedeserializer != null)
				break label0;
	//   65  121:aload           9
	//   66  123:ifnonnull       140
			try
			{
				obj = _elementDeserializer.deserialize(jsonparser, deserializationcontext);
	//   67  126:aload_0         
	//   68  127:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//   69  130:aload_1         
	//   70  131:aload_2         
	//   71  132:invokevirtual   #166 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   72  135:astore          5
			}
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aobj)), objectbuffer.bufferedSize() + i);
			}
		}
		  goto _L5
	//*  73  137:goto            67
		obj = _elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
	//   74  140:aload_0         
	//   75  141:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//   76  144:aload_1         
	//   77  145:aload_2         
	//   78  146:aload           9
	//   79  148:invokevirtual   #170 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   80  151:astore          5
		  goto _L5
	//*  81  153:goto            67
		if(_untyped)
	//*  82  156:aload_0         
	//*  83  157:getfield        #37  <Field boolean _untyped>
	//*  84  160:ifeq            180
			jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj, i)));
	//   85  163:aload           8
	//   86  165:aload           6
	//   87  167:iload_3         
	//   88  168:invokevirtual   #174 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int)>
	//   89  171:astore_1        
		else
	//*  90  172:aload_2         
	//*  91  173:aload           8
	//*  92  175:invokevirtual   #178 <Method void DeserializationContext.returnObjectBuffer(ObjectBuffer)>
	//*  93  178:aload_1         
	//*  94  179:areturn         
			jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj, i, _elementClass)));
	//   95  180:aload           8
	//   96  182:aload           6
	//   97  184:iload_3         
	//   98  185:aload_0         
	//   99  186:getfield        #35  <Field Class _elementClass>
	//  100  189:invokevirtual   #181 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int, Class)>
	//  101  192:astore_1        
		deserializationcontext.returnObjectBuffer(objectbuffer);
		return ((Object []) (jsonparser));
		if(true) goto _L7; else goto _L6
	//  102  193:goto            172
_L6:
	//* 103  196:goto            89
	}

	protected Byte[] deserializeFromBase64(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser = ((JsonParser) (jsonparser.getBinaryValue(deserializationcontext.getBase64Variant())));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #187 <Method com.fasterxml.jackson.core.Base64Variant DeserializationContext.getBase64Variant()>
	//    3    5:invokevirtual   #191 <Method byte[] JsonParser.getBinaryValue(com.fasterxml.jackson.core.Base64Variant)>
	//    4    8:astore_1        
		deserializationcontext = ((DeserializationContext) (new Byte[jsonparser.length]));
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:anewarray       Byte[]
	//    8   14:astore_2        
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		for(int j = jsonparser.length; i < j; i++)
	//*  11   17:aload_1         
	//*  12   18:arraylength     
	//*  13   19:istore          4
	//*  14   21:iload_3         
	//*  15   22:iload           4
	//*  16   24:icmpge          43
			deserializationcontext[i] = ((/*<invalid signature>*/java.lang.Object) (Byte.valueOf(jsonparser[i])));
	//   17   27:aload_2         
	//   18   28:iload_3         
	//   19   29:aload_1         
	//   20   30:iload_3         
	//   21   31:baload          
	//   22   32:invokestatic    #197 <Method Byte Byte.valueOf(byte)>
	//   23   35:aastore         

	//   24   36:iload_3         
	//   25   37:iconst_1        
	//   26   38:iadd            
	//   27   39:istore_3        
	//*  28   40:goto            21
		return ((Byte []) (deserializationcontext));
	//   29   43:aload_2         
	//   30   44:areturn         
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #200 <Method Object[] deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	public Object[] deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return (Object[])(Object[])typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #203 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:checkcast       #205 <Class Object[]>
	//    5    9:checkcast       #205 <Class Object[]>
	//    6   12:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _elementDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _arrayType.getContentType();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayType _arrayType>
	//    2    4:invokevirtual   #53  <Method JavaType ArrayType.getContentType()>
	//    3    7:areturn         
	}

	protected Object[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_STRING) && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:invokevirtual   #215 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            32
	//*   4   10:aload_2         
	//*   5   11:getstatic       #221 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*   6   14:invokevirtual   #225 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   7   17:ifeq            32
	//*   8   20:aload_1         
	//*   9   21:invokevirtual   #229 <Method String JsonParser.getText()>
	//*  10   24:invokevirtual   #234 <Method int String.length()>
	//*  11   27:ifne            32
			return null;
	//   12   30:aconst_null     
	//   13   31:areturn         
		boolean flag;
		if(_unwrapSingle == Boolean.TRUE || _unwrapSingle == null && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
	//*  14   32:aload_0         
	//*  15   33:getfield        #43  <Field Boolean _unwrapSingle>
	//*  16   36:getstatic       #239 <Field Boolean Boolean.TRUE>
	//*  17   39:if_acmpeq       59
	//*  18   42:aload_0         
	//*  19   43:getfield        #43  <Field Boolean _unwrapSingle>
	//*  20   46:ifnonnull       91
	//*  21   49:aload_2         
	//*  22   50:getstatic       #241 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*  23   53:invokevirtual   #225 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  24   56:ifeq            91
			flag = true;
	//   25   59:iconst_1        
	//   26   60:istore_3        
		else
	//*  27   61:iload_3         
	//*  28   62:ifne            108
	//*  29   65:aload_1         
	//*  30   66:invokevirtual   #244 <Method JsonToken JsonParser.getCurrentToken()>
	//*  31   69:getstatic       #211 <Field JsonToken JsonToken.VALUE_STRING>
	//*  32   72:if_acmpne       96
	//*  33   75:aload_0         
	//*  34   76:getfield        #35  <Field Class _elementClass>
	//*  35   79:ldc1            #193 <Class Byte>
	//*  36   81:if_acmpne       96
	//*  37   84:aload_0         
	//*  38   85:aload_1         
	//*  39   86:aload_2         
	//*  40   87:invokevirtual   #246 <Method Byte[] deserializeFromBase64(JsonParser, DeserializationContext)>
	//*  41   90:areturn         
			flag = false;
	//   42   91:iconst_0        
	//   43   92:istore_3        
		if(!flag)
			if(jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && _elementClass == java/lang/Byte)
				return ((Object []) (deserializeFromBase64(jsonparser, deserializationcontext)));
			else
	//*  44   93:goto            61
				throw deserializationcontext.mappingException(_arrayType.getRawClass());
	//   45   96:aload_2         
	//   46   97:aload_0         
	//   47   98:getfield        #30  <Field ArrayType _arrayType>
	//   48  101:invokevirtual   #67  <Method Class ArrayType.getRawClass()>
	//   49  104:invokevirtual   #250 <Method JsonMappingException DeserializationContext.mappingException(Class)>
	//   50  107:athrow          
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*  51  108:aload_1         
	//*  52  109:invokevirtual   #244 <Method JsonToken JsonParser.getCurrentToken()>
	//*  53  112:getstatic       #146 <Field JsonToken JsonToken.VALUE_NULL>
	//*  54  115:if_acmpne       145
			jsonparser = ((JsonParser) (_elementDeserializer.getNullValue(deserializationcontext)));
	//   55  118:aload_0         
	//   56  119:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//   57  122:aload_2         
	//   58  123:invokevirtual   #152 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   59  126:astore_1        
		else
	//*  60  127:aload_0         
	//*  61  128:getfield        #37  <Field boolean _untyped>
	//*  62  131:ifeq            182
	//*  63  134:iconst_1        
	//*  64  135:anewarray       Object[]
	//*  65  138:astore_2        
	//*  66  139:aload_2         
	//*  67  140:iconst_0        
	//*  68  141:aload_1         
	//*  69  142:aastore         
	//*  70  143:aload_2         
	//*  71  144:areturn         
		if(_elementTypeDeserializer == null)
	//*  72  145:aload_0         
	//*  73  146:getfield        #41  <Field TypeDeserializer _elementTypeDeserializer>
	//*  74  149:ifnonnull       165
			jsonparser = ((JsonParser) (_elementDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   75  152:aload_0         
	//   76  153:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//   77  156:aload_1         
	//   78  157:aload_2         
	//   79  158:invokevirtual   #166 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   80  161:astore_1        
		else
	//*  81  162:goto            127
			jsonparser = ((JsonParser) (_elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, _elementTypeDeserializer)));
	//   82  165:aload_0         
	//   83  166:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//   84  169:aload_1         
	//   85  170:aload_2         
	//   86  171:aload_0         
	//   87  172:getfield        #41  <Field TypeDeserializer _elementTypeDeserializer>
	//   88  175:invokevirtual   #170 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   89  178:astore_1        
		if(_untyped)
			deserializationcontext = ((DeserializationContext) (new Object[1]));
		else
	//*  90  179:goto            127
			deserializationcontext = ((DeserializationContext) ((Object[])(Object[])Array.newInstance(_elementClass, 1)));
	//   91  182:aload_0         
	//   92  183:getfield        #35  <Field Class _elementClass>
	//   93  186:iconst_1        
	//   94  187:invokestatic    #256 <Method Object Array.newInstance(Class, int)>
	//   95  190:checkcast       #205 <Class Object[]>
	//   96  193:checkcast       #205 <Class Object[]>
	//   97  196:astore_2        
		deserializationcontext[0] = ((/*<invalid signature>*/java.lang.Object) (jsonparser));
		return ((Object []) (deserializationcontext));
	//*  98  197:goto            139
	}

	public boolean isCachable()
	{
		return _elementDeserializer == null && _elementTypeDeserializer == null;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field TypeDeserializer _elementTypeDeserializer>
	//    5   11:ifnonnull       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public ObjectArrayDeserializer withDeserializer(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
		return withResolved(typedeserializer, jsondeserializer, _unwrapSingle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #43  <Field Boolean _unwrapSingle>
	//    5    7:invokevirtual   #97  <Method ObjectArrayDeserializer withResolved(TypeDeserializer, JsonDeserializer, Boolean)>
	//    6   10:areturn         
	}

	public ObjectArrayDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer, Boolean boolean1)
	{
		if(boolean1 == _unwrapSingle && jsondeserializer == _elementDeserializer && typedeserializer == _elementTypeDeserializer)
	//*   0    0:aload_3         
	//*   1    1:aload_0         
	//*   2    2:getfield        #43  <Field Boolean _unwrapSingle>
	//*   3    5:if_acmpne       26
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #39  <Field JsonDeserializer _elementDeserializer>
	//*   7   13:if_acmpne       26
	//*   8   16:aload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #41  <Field TypeDeserializer _elementTypeDeserializer>
	//*  11   21:if_acmpne       26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new ObjectArrayDeserializer(this, jsondeserializer, typedeserializer, boolean1);
	//   14   26:new             #2   <Class ObjectArrayDeserializer>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:aload_3         
	//   20   34:invokespecial   #262 <Method void ObjectArrayDeserializer(ObjectArrayDeserializer, JsonDeserializer, TypeDeserializer, Boolean)>
	//   21   37:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final ArrayType _arrayType;
	protected final Class _elementClass;
	protected JsonDeserializer _elementDeserializer;
	protected final TypeDeserializer _elementTypeDeserializer;
	protected final boolean _untyped;
	protected final Boolean _unwrapSingle;
}
