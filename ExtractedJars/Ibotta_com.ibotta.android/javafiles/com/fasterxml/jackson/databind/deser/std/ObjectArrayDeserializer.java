// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			ContainerDeserializerBase

public class ObjectArrayDeserializer extends ContainerDeserializerBase
	implements ContextualDeserializer
{

	public ObjectArrayDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
	{
		super(javatype, ((NullValueProvider) (null)), ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #36  <Method void ContainerDeserializerBase(JavaType, NullValueProvider, Boolean)>
		_elementClass = javatype.getContentType().getRawClass();
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #42  <Method JavaType JavaType.getContentType()>
	//    8   12:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//    9   15:putfield        #48  <Field Class _elementClass>
		boolean flag;
		if(_elementClass == java/lang/Object)
	//*  10   18:aload_0         
	//*  11   19:getfield        #48  <Field Class _elementClass>
	//*  12   22:ldc1            #28  <Class Object>
	//*  13   24:if_acmpne       33
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore          4
		else
	//*  16   30:goto            36
			flag = false;
	//   17   33:iconst_0        
	//   18   34:istore          4
		_untyped = flag;
	//   19   36:aload_0         
	//   20   37:iload           4
	//   21   39:putfield        #50  <Field boolean _untyped>
		_elementDeserializer = jsondeserializer;
	//   22   42:aload_0         
	//   23   43:aload_2         
	//   24   44:putfield        #52  <Field JsonDeserializer _elementDeserializer>
		_elementTypeDeserializer = typedeserializer;
	//   25   47:aload_0         
	//   26   48:aload_3         
	//   27   49:putfield        #54  <Field TypeDeserializer _elementTypeDeserializer>
	//   28   52:return          
	}

	protected ObjectArrayDeserializer(ObjectArrayDeserializer objectarraydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(((ContainerDeserializerBase) (objectarraydeserializer)), nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           4
	//    3    4:aload           5
	//    4    6:invokespecial   #60  <Method void ContainerDeserializerBase(ContainerDeserializerBase, NullValueProvider, Boolean)>
		_elementClass = objectarraydeserializer._elementClass;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #48  <Field Class _elementClass>
	//    8   14:putfield        #48  <Field Class _elementClass>
		_untyped = objectarraydeserializer._untyped;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #50  <Field boolean _untyped>
	//   12   22:putfield        #50  <Field boolean _untyped>
		_elementDeserializer = jsondeserializer;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #52  <Field JsonDeserializer _elementDeserializer>
		_elementTypeDeserializer = typedeserializer;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:putfield        #54  <Field TypeDeserializer _elementTypeDeserializer>
	//   19   35:return          
	}

	public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer = _elementDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//    2    4:astore_3        
		Boolean boolean1 = findFormatFeature(deserializationcontext, beanproperty, _containerType.getRawClass(), com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_0         
	//    7    9:getfield        #69  <Field JavaType _containerType>
	//    8   12:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//    9   15:getstatic       #75  <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//   10   18:invokevirtual   #79  <Method Boolean findFormatFeature(DeserializationContext, BeanProperty, Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   11   21:astore          6
		jsondeserializer = findConvertingContentDeserializer(deserializationcontext, beanproperty, jsondeserializer);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #83  <Method JsonDeserializer findConvertingContentDeserializer(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   17   30:astore_3        
		Object obj = ((Object) (_containerType.getContentType()));
	//   18   31:aload_0         
	//   19   32:getfield        #69  <Field JavaType _containerType>
	//   20   35:invokevirtual   #42  <Method JavaType JavaType.getContentType()>
	//   21   38:astore          4
		if(jsondeserializer == null)
	//*  22   40:aload_3         
	//*  23   41:ifnonnull       55
			jsondeserializer = deserializationcontext.findContextualValueDeserializer(((JavaType) (obj)), beanproperty);
	//   24   44:aload_1         
	//   25   45:aload           4
	//   26   47:aload_2         
	//   27   48:invokevirtual   #89  <Method JsonDeserializer DeserializationContext.findContextualValueDeserializer(JavaType, BeanProperty)>
	//   28   51:astore_3        
		else
	//*  29   52:goto            64
			jsondeserializer = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, ((JavaType) (obj)));
	//   30   55:aload_1         
	//   31   56:aload_3         
	//   32   57:aload_2         
	//   33   58:aload           4
	//   34   60:invokevirtual   #93  <Method JsonDeserializer DeserializationContext.handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   35   63:astore_3        
		TypeDeserializer typedeserializer = _elementTypeDeserializer;
	//   36   64:aload_0         
	//   37   65:getfield        #54  <Field TypeDeserializer _elementTypeDeserializer>
	//   38   68:astore          5
		obj = ((Object) (typedeserializer));
	//   39   70:aload           5
	//   40   72:astore          4
		if(typedeserializer != null)
	//*  41   74:aload           5
	//*  42   76:ifnull          87
			obj = ((Object) (typedeserializer.forProperty(beanproperty)));
	//   43   79:aload           5
	//   44   81:aload_2         
	//   45   82:invokevirtual   #99  <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//   46   85:astore          4
		return ((JsonDeserializer) (withResolved(((TypeDeserializer) (obj)), jsondeserializer, findContentNullProvider(deserializationcontext, beanproperty, jsondeserializer), boolean1)));
	//   47   87:aload_0         
	//   48   88:aload           4
	//   49   90:aload_3         
	//   50   91:aload_0         
	//   51   92:aload_1         
	//   52   93:aload_2         
	//   53   94:aload_3         
	//   54   95:invokevirtual   #103 <Method NullValueProvider findContentNullProvider(DeserializationContext, BeanProperty, JsonDeserializer)>
	//   55   98:aload           6
	//   56  100:invokevirtual   #107 <Method ObjectArrayDeserializer withResolved(TypeDeserializer, JsonDeserializer, NullValueProvider, Boolean)>
	//   57  103:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #118 <Method Object[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (Object[])obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #120 <Class Object[]>
	//    5    7:invokevirtual   #123 <Method Object[] deserialize(JsonParser, DeserializationContext, Object[])>
	//    6   10:areturn         
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
	//*   1    1:invokevirtual   #131 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            14
			return handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #134 <Method Object[] handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:areturn         
		objectbuffer = deserializationcontext.leaseObjectBuffer();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #138 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   10   18:astore          8
		aobj = objectbuffer.resetAndStart();
	//   11   20:aload           8
	//   12   22:invokevirtual   #144 <Method Object[] ObjectBuffer.resetAndStart()>
	//   13   25:astore          6
		typedeserializer = _elementTypeDeserializer;
	//   14   27:aload_0         
	//   15   28:getfield        #54  <Field TypeDeserializer _elementTypeDeserializer>
	//   16   31:astore          9
		i = 0;
	//   17   33:iconst_0        
	//   18   34:istore_3        
_L2:
		JsonToken jsontoken;
		jsontoken = jsonparser.nextToken();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #148 <Method JsonToken JsonParser.nextToken()>
	//   21   39:astore          5
		if(jsontoken == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   22   41:aload           5
	//   23   43:getstatic       #154 <Field JsonToken JsonToken.END_ARRAY>
	//   24   46:if_acmpeq       159
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  25   49:aload           5
	//*  26   51:getstatic       #157 <Field JsonToken JsonToken.VALUE_NULL>
	//*  27   54:if_acmpne       82
		{
			if(_skipNullValues)
	//*  28   57:aload_0         
	//*  29   58:getfield        #160 <Field boolean _skipNullValues>
	//*  30   61:ifeq            67
				continue; /* Loop/switch isn't completed */
	//   31   64:goto            35
			int j;
			Object obj;
			Object aobj1[];
			try
			{
				obj = _nullProvider.getNullValue(deserializationcontext);
	//   32   67:aload_0         
	//   33   68:getfield        #164 <Field NullValueProvider _nullProvider>
	//   34   71:aload_2         
	//   35   72:invokeinterface #170 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   36   77:astore          5
			}
	//*  37   79:goto            114
	//*  38   82:aload           9
	//*  39   84:ifnonnull       101
	//*  40   87:aload_0         
	//*  41   88:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//*  42   91:aload_1         
	//*  43   92:aload_2         
	//*  44   93:invokevirtual   #174 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  45   96:astore          5
	//*  46   98:goto            114
	//*  47  101:aload_0         
	//*  48  102:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//*  49  105:aload_1         
	//*  50  106:aload_2         
	//*  51  107:aload           9
	//*  52  109:invokevirtual   #178 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  53  112:astore          5
	//*  54  114:aload           6
	//*  55  116:astore          7
	//*  56  118:iload_3         
	//*  57  119:istore          4
	//*  58  121:iload_3         
	//*  59  122:aload           6
	//*  60  124:arraylength     
	//*  61  125:icmplt          140
	//*  62  128:aload           8
	//*  63  130:aload           6
	//*  64  132:invokevirtual   #182 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//*  65  135:astore          7
	//*  66  137:iconst_0        
	//*  67  138:istore          4
	//*  68  140:aload           7
	//*  69  142:iload           4
	//*  70  144:aload           5
	//*  71  146:aastore         
	//*  72  147:iload           4
	//*  73  149:iconst_1        
	//*  74  150:iadd            
	//*  75  151:istore_3        
	//*  76  152:aload           7
	//*  77  154:astore          6
	//*  78  156:goto            35
	//*  79  159:aload_0         
	//*  80  160:getfield        #50  <Field boolean _untyped>
	//*  81  163:ifeq            178
	//*  82  166:aload           8
	//*  83  168:aload           6
	//*  84  170:iload_3         
	//*  85  171:invokevirtual   #186 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int)>
	//*  86  174:astore_1        
	//*  87  175:goto            191
	//*  88  178:aload           8
	//*  89  180:aload           6
	//*  90  182:iload_3         
	//*  91  183:aload_0         
	//*  92  184:getfield        #48  <Field Class _elementClass>
	//*  93  187:invokevirtual   #189 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int, Class)>
	//*  94  190:astore_1        
	//*  95  191:aload_2         
	//*  96  192:aload           8
	//*  97  194:invokevirtual   #193 <Method void DeserializationContext.returnObjectBuffer(ObjectBuffer)>
	//*  98  197:aload_1         
	//*  99  198:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//* 100  199:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aobj)), objectbuffer.bufferedSize() + i);
	//  101  200:aload_1         
	//  102  201:aload           6
	//  103  203:aload           8
	//  104  205:invokevirtual   #197 <Method int ObjectBuffer.bufferedSize()>
	//  105  208:iload_3         
	//  106  209:iadd            
	//  107  210:invokestatic    #201 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  108  213:athrow          
			}
			break MISSING_BLOCK_LABEL_114;
		}
		if(typedeserializer != null)
			break MISSING_BLOCK_LABEL_101;
		obj = _elementDeserializer.deserialize(jsonparser, deserializationcontext);
		break MISSING_BLOCK_LABEL_114;
		obj = _elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
		aobj1 = aobj;
		j = i;
		if(i < aobj.length)
			break MISSING_BLOCK_LABEL_140;
		aobj1 = objectbuffer.appendCompletedChunk(aobj);
		j = 0;
		aobj1[j] = obj;
		i = j + 1;
		aobj = aobj1;
		if(true) goto _L2; else goto _L1
_L1:
		if(_untyped)
			jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj, i)));
		else
			jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj, i, _elementClass)));
		deserializationcontext.returnObjectBuffer(objectbuffer);
		return ((Object []) (jsonparser));
	}

	public Object[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object aobj[])
		throws IOException
	{
		int j;
		Object aobj1[];
		ObjectBuffer objectbuffer;
		TypeDeserializer typedeserializer;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #131 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            54
		{
			jsonparser = ((JsonParser) (handleNonArray(jsonparser, deserializationcontext)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #134 <Method Object[] handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:astore_1        
			if(jsonparser == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
			{
				return aobj;
	//   10   18:aload_3         
	//   11   19:areturn         
			} else
			{
				int i = aobj.length;
	//   12   20:aload_3         
	//   13   21:arraylength     
	//   14   22:istore          4
				deserializationcontext = ((DeserializationContext) (new Object[jsonparser.length + i]));
	//   15   24:aload_1         
	//   16   25:arraylength     
	//   17   26:iload           4
	//   18   28:iadd            
	//   19   29:anewarray       Object[]
	//   20   32:astore_2        
				System.arraycopy(((Object) (aobj)), 0, ((Object) (deserializationcontext)), 0, i);
	//   21   33:aload_3         
	//   22   34:iconst_0        
	//   23   35:aload_2         
	//   24   36:iconst_0        
	//   25   37:iload           4
	//   26   39:invokestatic    #207 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (jsonparser)), 0, ((Object) (deserializationcontext)), i, jsonparser.length);
	//   27   42:aload_1         
	//   28   43:iconst_0        
	//   29   44:aload_2         
	//   30   45:iload           4
	//   31   47:aload_1         
	//   32   48:arraylength     
	//   33   49:invokestatic    #207 <Method void System.arraycopy(Object, int, Object, int, int)>
				return ((Object []) (deserializationcontext));
	//   34   52:aload_2         
	//   35   53:areturn         
			}
		}
		objectbuffer = deserializationcontext.leaseObjectBuffer();
	//   36   54:aload_2         
	//   37   55:invokevirtual   #138 <Method ObjectBuffer DeserializationContext.leaseObjectBuffer()>
	//   38   58:astore          8
		j = aobj.length;
	//   39   60:aload_3         
	//   40   61:arraylength     
	//   41   62:istore          4
		aobj1 = objectbuffer.resetAndStart(aobj, j);
	//   42   64:aload           8
	//   43   66:aload_3         
	//   44   67:iload           4
	//   45   69:invokevirtual   #209 <Method Object[] ObjectBuffer.resetAndStart(Object[], int)>
	//   46   72:astore          6
		typedeserializer = _elementTypeDeserializer;
	//   47   74:aload_0         
	//   48   75:getfield        #54  <Field TypeDeserializer _elementTypeDeserializer>
	//   49   78:astore          9
_L2:
		aobj = ((Object []) (jsonparser.nextToken()));
	//   50   80:aload_1         
	//   51   81:invokevirtual   #148 <Method JsonToken JsonParser.nextToken()>
	//   52   84:astore_3        
		if(aobj == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   53   85:aload_3         
	//   54   86:getstatic       #154 <Field JsonToken JsonToken.END_ARRAY>
	//   55   89:if_acmpeq       200
		if(aobj == JsonToken.VALUE_NULL)
	//*  56   92:aload_3         
	//*  57   93:getstatic       #157 <Field JsonToken JsonToken.VALUE_NULL>
	//*  58   96:if_acmpne       123
		{
			if(_skipNullValues)
	//*  59   99:aload_0         
	//*  60  100:getfield        #160 <Field boolean _skipNullValues>
	//*  61  103:ifeq            109
				continue; /* Loop/switch isn't completed */
	//   62  106:goto            80
			int k;
			Object aobj2[];
			try
			{
				aobj = ((Object []) (_nullProvider.getNullValue(deserializationcontext)));
	//   63  109:aload_0         
	//   64  110:getfield        #164 <Field NullValueProvider _nullProvider>
	//   65  113:aload_2         
	//   66  114:invokeinterface #170 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   67  119:astore_3        
			}
	//*  68  120:goto            153
	//*  69  123:aload           9
	//*  70  125:ifnonnull       141
	//*  71  128:aload_0         
	//*  72  129:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//*  73  132:aload_1         
	//*  74  133:aload_2         
	//*  75  134:invokevirtual   #174 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  76  137:astore_3        
	//*  77  138:goto            153
	//*  78  141:aload_0         
	//*  79  142:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//*  80  145:aload_1         
	//*  81  146:aload_2         
	//*  82  147:aload           9
	//*  83  149:invokevirtual   #178 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//*  84  152:astore_3        
	//*  85  153:iload           4
	//*  86  155:istore          5
	//*  87  157:aload           6
	//*  88  159:astore          7
	//*  89  161:iload           4
	//*  90  163:aload           6
	//*  91  165:arraylength     
	//*  92  166:icmplt          181
	//*  93  169:aload           8
	//*  94  171:aload           6
	//*  95  173:invokevirtual   #182 <Method Object[] ObjectBuffer.appendCompletedChunk(Object[])>
	//*  96  176:astore          7
	//*  97  178:iconst_0        
	//*  98  179:istore          5
	//*  99  181:aload           7
	//* 100  183:iload           5
	//* 101  185:aload_3         
	//* 102  186:aastore         
	//* 103  187:iload           5
	//* 104  189:iconst_1        
	//* 105  190:iadd            
	//* 106  191:istore          4
	//* 107  193:aload           7
	//* 108  195:astore          6
	//* 109  197:goto            80
	//* 110  200:aload_0         
	//* 111  201:getfield        #50  <Field boolean _untyped>
	//* 112  204:ifeq            220
	//* 113  207:aload           8
	//* 114  209:aload           6
	//* 115  211:iload           4
	//* 116  213:invokevirtual   #186 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int)>
	//* 117  216:astore_1        
	//* 118  217:goto            234
	//* 119  220:aload           8
	//* 120  222:aload           6
	//* 121  224:iload           4
	//* 122  226:aload_0         
	//* 123  227:getfield        #48  <Field Class _elementClass>
	//* 124  230:invokevirtual   #189 <Method Object[] ObjectBuffer.completeAndClearBuffer(Object[], int, Class)>
	//* 125  233:astore_1        
	//* 126  234:aload_2         
	//* 127  235:aload           8
	//* 128  237:invokevirtual   #193 <Method void DeserializationContext.returnObjectBuffer(ObjectBuffer)>
	//* 129  240:aload_1         
	//* 130  241:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//* 131  242:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aobj1)), objectbuffer.bufferedSize() + j);
	//  132  243:aload_1         
	//  133  244:aload           6
	//  134  246:aload           8
	//  135  248:invokevirtual   #197 <Method int ObjectBuffer.bufferedSize()>
	//  136  251:iload           4
	//  137  253:iadd            
	//  138  254:invokestatic    #201 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  139  257:athrow          
			}
			break MISSING_BLOCK_LABEL_153;
		}
		if(typedeserializer != null)
			break MISSING_BLOCK_LABEL_141;
		aobj = ((Object []) (_elementDeserializer.deserialize(jsonparser, deserializationcontext)));
		break MISSING_BLOCK_LABEL_153;
		aobj = ((Object []) (_elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
		k = j;
		aobj2 = aobj1;
		if(j < aobj1.length)
			break MISSING_BLOCK_LABEL_181;
		aobj2 = objectbuffer.appendCompletedChunk(aobj1);
		k = 0;
		aobj2[k] = ((Object) (aobj));
		j = k + 1;
		aobj1 = aobj2;
		if(true) goto _L2; else goto _L1
_L1:
		if(_untyped)
			jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj1, j)));
		else
			jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj1, j, _elementClass)));
		deserializationcontext.returnObjectBuffer(objectbuffer);
		return ((Object []) (jsonparser));
	}

	protected Byte[] deserializeFromBase64(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		jsonparser = ((JsonParser) (jsonparser.getBinaryValue(deserializationcontext.getBase64Variant())));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #215 <Method com.fasterxml.jackson.core.Base64Variant DeserializationContext.getBase64Variant()>
	//    3    5:invokevirtual   #219 <Method byte[] JsonParser.getBinaryValue(com.fasterxml.jackson.core.Base64Variant)>
	//    4    8:astore_1        
		deserializationcontext = ((DeserializationContext) (new Byte[jsonparser.length]));
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:anewarray       Byte[]
	//    8   14:astore_2        
		int j = jsonparser.length;
	//    9   15:aload_1         
	//   10   16:arraylength     
	//   11   17:istore          4
		for(int i = 0; i < j; i++)
	//*  12   19:iconst_0        
	//*  13   20:istore_3        
	//*  14   21:iload_3         
	//*  15   22:iload           4
	//*  16   24:icmpge          43
			deserializationcontext[i] = ((/*<invalid signature>*/java.lang.Object) (Byte.valueOf(jsonparser[i])));
	//   17   27:aload_2         
	//   18   28:iload_3         
	//   19   29:aload_1         
	//   20   30:iload_3         
	//   21   31:baload          
	//   22   32:invokestatic    #225 <Method Byte Byte.valueOf(byte)>
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
	//    4    4:invokevirtual   #228 <Method Object[] deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	public Object[] deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return (Object[])typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #231 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:checkcast       #120 <Class Object[]>
	//    5    9:areturn         
	}

	public JsonDeserializer getContentDeserializer()
	{
		return _elementDeserializer;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//    2    4:areturn         
	}

	public AccessPattern getEmptyAccessPattern()
	{
		return AccessPattern.CONSTANT;
	//    0    0:getstatic       #242 <Field AccessPattern AccessPattern.CONSTANT>
	//    1    3:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return ((Object) (NO_OBJECTS));
	//    0    0:getstatic       #30  <Field Object[] NO_OBJECTS>
	//    1    3:areturn         
	}

	protected Object[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_STRING) && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #246 <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:invokevirtual   #250 <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            32
	//*   4   10:aload_2         
	//*   5   11:getstatic       #256 <Field DeserializationFeature DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT>
	//*   6   14:invokevirtual   #260 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*   7   17:ifeq            32
	//*   8   20:aload_1         
	//*   9   21:invokevirtual   #264 <Method String JsonParser.getText()>
	//*  10   24:invokevirtual   #269 <Method int String.length()>
	//*  11   27:ifne            32
			return null;
	//   12   30:aconst_null     
	//   13   31:areturn         
		boolean flag;
		if(_unwrapSingle != Boolean.TRUE && (_unwrapSingle != null || !deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))
	//*  14   32:aload_0         
	//*  15   33:getfield        #273 <Field Boolean _unwrapSingle>
	//*  16   36:getstatic       #278 <Field Boolean Boolean.TRUE>
	//*  17   39:if_acmpeq       67
	//*  18   42:aload_0         
	//*  19   43:getfield        #273 <Field Boolean _unwrapSingle>
	//*  20   46:ifnonnull       62
	//*  21   49:aload_2         
	//*  22   50:getstatic       #280 <Field DeserializationFeature DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY>
	//*  23   53:invokevirtual   #260 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//*  24   56:ifeq            62
	//*  25   59:goto            67
			flag = false;
	//   26   62:iconst_0        
	//   27   63:istore_3        
		else
	//*  28   64:goto            69
			flag = true;
	//   29   67:iconst_1        
	//   30   68:istore_3        
		if(!flag)
	//*  31   69:iload_3         
	//*  32   70:ifne            115
			if(jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && _elementClass == java/lang/Byte)
	//*  33   73:aload_1         
	//*  34   74:invokevirtual   #283 <Method JsonToken JsonParser.getCurrentToken()>
	//*  35   77:getstatic       #246 <Field JsonToken JsonToken.VALUE_STRING>
	//*  36   80:if_acmpne       99
	//*  37   83:aload_0         
	//*  38   84:getfield        #48  <Field Class _elementClass>
	//*  39   87:ldc1            #221 <Class Byte>
	//*  40   89:if_acmpne       99
				return ((Object []) (deserializeFromBase64(jsonparser, deserializationcontext)));
	//   41   92:aload_0         
	//   42   93:aload_1         
	//   43   94:aload_2         
	//   44   95:invokevirtual   #285 <Method Byte[] deserializeFromBase64(JsonParser, DeserializationContext)>
	//   45   98:areturn         
			else
				return (Object[])deserializationcontext.handleUnexpectedToken(_containerType.getRawClass(), jsonparser);
	//   46   99:aload_2         
	//   47  100:aload_0         
	//   48  101:getfield        #69  <Field JavaType _containerType>
	//   49  104:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   50  107:aload_1         
	//   51  108:invokevirtual   #289 <Method Object DeserializationContext.handleUnexpectedToken(Class, JsonParser)>
	//   52  111:checkcast       #120 <Class Object[]>
	//   53  114:areturn         
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
	//*  54  115:aload_1         
	//*  55  116:invokevirtual   #283 <Method JsonToken JsonParser.getCurrentToken()>
	//*  56  119:getstatic       #157 <Field JsonToken JsonToken.VALUE_NULL>
	//*  57  122:if_acmpne       150
		{
			if(_skipNullValues)
	//*  58  125:aload_0         
	//*  59  126:getfield        #160 <Field boolean _skipNullValues>
	//*  60  129:ifeq            136
				return NO_OBJECTS;
	//   61  132:getstatic       #30  <Field Object[] NO_OBJECTS>
	//   62  135:areturn         
			jsonparser = ((JsonParser) (_nullProvider.getNullValue(deserializationcontext)));
	//   63  136:aload_0         
	//   64  137:getfield        #164 <Field NullValueProvider _nullProvider>
	//   65  140:aload_2         
	//   66  141:invokeinterface #170 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   67  146:astore_1        
		} else
	//*  68  147:goto            186
		{
			TypeDeserializer typedeserializer = _elementTypeDeserializer;
	//   69  150:aload_0         
	//   70  151:getfield        #54  <Field TypeDeserializer _elementTypeDeserializer>
	//   71  154:astore          4
			if(typedeserializer == null)
	//*  72  156:aload           4
	//*  73  158:ifnonnull       174
				jsonparser = ((JsonParser) (_elementDeserializer.deserialize(jsonparser, deserializationcontext)));
	//   74  161:aload_0         
	//   75  162:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//   76  165:aload_1         
	//   77  166:aload_2         
	//   78  167:invokevirtual   #174 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   79  170:astore_1        
			else
	//*  80  171:goto            186
				jsonparser = ((JsonParser) (_elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//   81  174:aload_0         
	//   82  175:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//   83  178:aload_1         
	//   84  179:aload_2         
	//   85  180:aload           4
	//   86  182:invokevirtual   #178 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   87  185:astore_1        
		}
		if(_untyped)
	//*  88  186:aload_0         
	//*  89  187:getfield        #50  <Field boolean _untyped>
	//*  90  190:ifeq            201
			deserializationcontext = ((DeserializationContext) (new Object[1]));
	//   91  193:iconst_1        
	//   92  194:anewarray       Object[]
	//   93  197:astore_2        
		else
	//*  94  198:goto            213
			deserializationcontext = ((DeserializationContext) ((Object[])Array.newInstance(_elementClass, 1)));
	//   95  201:aload_0         
	//   96  202:getfield        #48  <Field Class _elementClass>
	//   97  205:iconst_1        
	//   98  206:invokestatic    #295 <Method Object Array.newInstance(Class, int)>
	//   99  209:checkcast       #120 <Class Object[]>
	//  100  212:astore_2        
		deserializationcontext[0] = ((/*<invalid signature>*/java.lang.Object) (jsonparser));
	//  101  213:aload_2         
	//  102  214:iconst_0        
	//  103  215:aload_1         
	//  104  216:aastore         
		return ((Object []) (deserializationcontext));
	//  105  217:aload_2         
	//  106  218:areturn         
	}

	public boolean isCachable()
	{
		return _elementDeserializer == null && _elementTypeDeserializer == null;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field TypeDeserializer _elementTypeDeserializer>
	//    5   11:ifnonnull       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public ObjectArrayDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		if(boolean1 == _unwrapSingle && nullvalueprovider == _nullProvider && jsondeserializer == _elementDeserializer && typedeserializer == _elementTypeDeserializer)
	//*   0    0:aload           4
	//*   1    2:aload_0         
	//*   2    3:getfield        #273 <Field Boolean _unwrapSingle>
	//*   3    6:if_acmpne       35
	//*   4    9:aload_3         
	//*   5   10:aload_0         
	//*   6   11:getfield        #164 <Field NullValueProvider _nullProvider>
	//*   7   14:if_acmpne       35
	//*   8   17:aload_2         
	//*   9   18:aload_0         
	//*  10   19:getfield        #52  <Field JsonDeserializer _elementDeserializer>
	//*  11   22:if_acmpne       35
	//*  12   25:aload_1         
	//*  13   26:aload_0         
	//*  14   27:getfield        #54  <Field TypeDeserializer _elementTypeDeserializer>
	//*  15   30:if_acmpne       35
			return this;
	//   16   33:aload_0         
	//   17   34:areturn         
		else
			return new ObjectArrayDeserializer(this, jsondeserializer, typedeserializer, nullvalueprovider, boolean1);
	//   18   35:new             #2   <Class ObjectArrayDeserializer>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:aload_1         
	//   23   42:aload_3         
	//   24   43:aload           4
	//   25   45:invokespecial   #298 <Method void ObjectArrayDeserializer(ObjectArrayDeserializer, JsonDeserializer, TypeDeserializer, NullValueProvider, Boolean)>
	//   26   48:areturn         
	}

	protected static final Object NO_OBJECTS[] = new Object[0];
	private static final long serialVersionUID = 1L;
	protected final Class _elementClass;
	protected JsonDeserializer _elementDeserializer;
	protected final TypeDeserializer _elementTypeDeserializer;
	protected final boolean _untyped;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Object[]
	//    2    4:putstatic       #30  <Field Object[] NO_OBJECTS>
	//*   3    7:return          
	}
}
