// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			PrimitiveArrayDeserializers

static final class PrimitiveArrayDeserializers$BooleanDeser extends PrimitiveArrayDeserializers
{

	protected volatile Object _concat(Object obj, Object obj1)
	{
		return ((Object) (_concat((boolean[])obj, (boolean[])obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class boolean[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class boolean[]>
	//    5    9:invokevirtual   #28  <Method boolean[] _concat(boolean[], boolean[])>
	//    6   12:areturn         
	}

	protected boolean[] _concat(boolean aflag[], boolean aflag1[])
	{
		int i = aflag.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int j = aflag1.length;
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:istore          4
		aflag = Arrays.copyOf(aflag, i + j);
	//    6    7:aload_1         
	//    7    8:iload_3         
	//    8    9:iload           4
	//    9   11:iadd            
	//   10   12:invokestatic    #34  <Method boolean[] Arrays.copyOf(boolean[], int)>
	//   11   15:astore_1        
		System.arraycopy(((Object) (aflag1)), 0, ((Object) (aflag)), i, j);
	//   12   16:aload_2         
	//   13   17:iconst_0        
	//   14   18:aload_1         
	//   15   19:iload_3         
	//   16   20:iload           4
	//   17   22:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aflag;
	//   18   25:aload_1         
	//   19   26:areturn         
	}

	protected volatile Object _constructEmpty()
	{
		return ((Object) (_constructEmpty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method boolean[] _constructEmpty()>
	//    2    4:areturn         
	}

	protected boolean[] _constructEmpty()
	{
		return new boolean[0];
	//    0    0:iconst_0        
	//    1    1:newarray        boolean[]
	//    2    3:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #54  <Method boolean[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		boolean aflag[];
		com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder booleanbuilder;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #63  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (boolean[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #66  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #15  <Class boolean[]>
	//    8   16:areturn         
		booleanbuilder = deserializationcontext.getArrayBuilders().getBooleanBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #72  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #78  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder ArrayBuilders.getBooleanBuilder()>
	//   12   24:astore          8
		aflag = (boolean[])booleanbuilder.resetAndStart();
	//   13   26:aload           8
	//   14   28:invokevirtual   #83  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.resetAndStart()>
	//   15   31:checkcast       #15  <Class boolean[]>
	//   16   34:astore          6
		i = 0;
	//   17   36:iconst_0        
	//   18   37:istore_3        
_L2:
		JsonToken jsontoken;
		jsontoken = jsonparser.nextToken();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #87  <Method JsonToken JsonParser.nextToken()>
	//   21   42:astore          7
		if(jsontoken == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   22   44:aload           7
	//   23   46:getstatic       #93  <Field JsonToken JsonToken.END_ARRAY>
	//   24   49:if_acmpeq       177
		boolean flag;
		if(jsontoken == JsonToken.VALUE_TRUE)
	//*  25   52:aload           7
	//*  26   54:getstatic       #96  <Field JsonToken JsonToken.VALUE_TRUE>
	//*  27   57:if_acmpne       66
		{
			flag = true;
	//   28   60:iconst_1        
	//   29   61:istore          5
			break MISSING_BLOCK_LABEL_128;
	//   30   63:goto            128
		}
		if(jsontoken == JsonToken.VALUE_FALSE)
	//*  31   66:aload           7
	//*  32   68:getstatic       #99  <Field JsonToken JsonToken.VALUE_FALSE>
	//*  33   71:if_acmpne       80
		{
			flag = false;
	//   34   74:iconst_0        
	//   35   75:istore          5
			break MISSING_BLOCK_LABEL_128;
	//   36   77:goto            128
		}
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  37   80:aload           7
	//*  38   82:getstatic       #102 <Field JsonToken JsonToken.VALUE_NULL>
	//*  39   85:if_acmpne       120
		{
			if(_nuller != null)
	//*  40   88:aload_0         
	//*  41   89:getfield        #106 <Field NullValueProvider _nuller>
	//*  42   92:ifnull          109
			{
				_nuller.getNullValue(deserializationcontext);
	//   43   95:aload_0         
	//   44   96:getfield        #106 <Field NullValueProvider _nuller>
	//   45   99:aload_2         
	//   46  100:invokeinterface #112 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   47  105:pop             
				continue; /* Loop/switch isn't completed */
	//   48  106:goto            38
			}
			int j;
			boolean aflag1[];
			try
			{
				_verifyNullForPrimitive(deserializationcontext);
	//   49  109:aload_0         
	//   50  110:aload_2         
	//   51  111:invokevirtual   #116 <Method void _verifyNullForPrimitive(DeserializationContext)>
			}
	//*  52  114:iconst_0        
	//*  53  115:istore          5
	//*  54  117:goto            128
	//*  55  120:aload_0         
	//*  56  121:aload_1         
	//*  57  122:aload_2         
	//*  58  123:invokevirtual   #120 <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
	//*  59  126:istore          5
	//*  60  128:aload           6
	//*  61  130:astore          7
	//*  62  132:iload_3         
	//*  63  133:istore          4
	//*  64  135:iload_3         
	//*  65  136:aload           6
	//*  66  138:arraylength     
	//*  67  139:icmplt          158
	//*  68  142:aload           8
	//*  69  144:aload           6
	//*  70  146:iload_3         
	//*  71  147:invokevirtual   #124 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.appendCompletedChunk(Object, int)>
	//*  72  150:checkcast       #15  <Class boolean[]>
	//*  73  153:astore          7
	//*  74  155:iconst_0        
	//*  75  156:istore          4
	//*  76  158:aload           7
	//*  77  160:iload           4
	//*  78  162:iload           5
	//*  79  164:bastore         
	//*  80  165:iload           4
	//*  81  167:iconst_1        
	//*  82  168:iadd            
	//*  83  169:istore_3        
	//*  84  170:aload           7
	//*  85  172:astore          6
	//*  86  174:goto            38
	//*  87  177:aload           8
	//*  88  179:aload           6
	//*  89  181:iload_3         
	//*  90  182:invokevirtual   #127 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.completeAndClearBuffer(Object, int)>
	//*  91  185:checkcast       #15  <Class boolean[]>
	//*  92  188:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  93  189:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aflag)), booleanbuilder.bufferedSize() + i);
	//   94  190:aload_1         
	//   95  191:aload           6
	//   96  193:aload           8
	//   97  195:invokevirtual   #131 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.bufferedSize()>
	//   98  198:iload_3         
	//   99  199:iadd            
	//  100  200:invokestatic    #137 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//  101  203:athrow          
			}
			flag = false;
			break MISSING_BLOCK_LABEL_128;
		}
		flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
		aflag1 = aflag;
		j = i;
		if(i < aflag.length)
			break MISSING_BLOCK_LABEL_158;
		aflag1 = (boolean[])booleanbuilder.appendCompletedChunk(((Object) (aflag)), i);
		j = 0;
		aflag1[j] = flag;
		i = j + 1;
		aflag = aflag1;
		if(true) goto _L2; else goto _L1
_L1:
		return (boolean[])booleanbuilder.completeAndClearBuffer(((Object) (aflag)), i);
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #140 <Method boolean[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected boolean[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return (new boolean[] {
			_parseBooleanPrimitive(jsonparser, deserializationcontext)
		});
	//    0    0:iconst_1        
	//    1    1:newarray        boolean[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:aload_2         
	//    7    8:invokevirtual   #120 <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
	//    8   11:bastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$BooleanDeser(this, nullvalueprovider, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$BooleanDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #144 <Method void PrimitiveArrayDeserializers$BooleanDeser(PrimitiveArrayDeserializers$BooleanDeser, NullValueProvider, Boolean)>
	//    6   10:areturn         
	}

	private static final long serialVersionUID = 1L;

	public PrimitiveArrayDeserializers$BooleanDeser()
	{
		super([Z);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <Class boolean[]>
	//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
	//    3    6:return          
	}

	protected PrimitiveArrayDeserializers$BooleanDeser(PrimitiveArrayDeserializers$BooleanDeser primitivearraydeserializers$booleandeser, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$booleandeser)), nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
	//    5    7:return          
	}
}
