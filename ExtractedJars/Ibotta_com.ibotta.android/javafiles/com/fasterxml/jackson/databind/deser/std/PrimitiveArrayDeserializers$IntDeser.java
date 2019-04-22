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

static final class PrimitiveArrayDeserializers$IntDeser extends PrimitiveArrayDeserializers
{

	protected volatile Object _concat(Object obj, Object obj1)
	{
		return ((Object) (_concat((int[])obj, (int[])obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class int[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class int[]>
	//    5    9:invokevirtual   #35  <Method int[] _concat(int[], int[])>
	//    6   12:areturn         
	}

	protected int[] _concat(int ai[], int ai1[])
	{
		int i = ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int j = ai1.length;
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:istore          4
		ai = Arrays.copyOf(ai, i + j);
	//    6    7:aload_1         
	//    7    8:iload_3         
	//    8    9:iload           4
	//    9   11:iadd            
	//   10   12:invokestatic    #41  <Method int[] Arrays.copyOf(int[], int)>
	//   11   15:astore_1        
		System.arraycopy(((Object) (ai1)), 0, ((Object) (ai)), i, j);
	//   12   16:aload_2         
	//   13   17:iconst_0        
	//   14   18:aload_1         
	//   15   19:iload_3         
	//   16   20:iload           4
	//   17   22:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
		return ai;
	//   18   25:aload_1         
	//   19   26:areturn         
	}

	protected volatile Object _constructEmpty()
	{
		return ((Object) (_constructEmpty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method int[] _constructEmpty()>
	//    2    4:areturn         
	}

	protected int[] _constructEmpty()
	{
		return new int[0];
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #61  <Method int[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public int[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		int ai[];
		com.fasterxml.jackson.databind.util.ArrayBuilders.IntBuilder intbuilder;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #70  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (int[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #73  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #23  <Class int[]>
	//    8   16:areturn         
		intbuilder = deserializationcontext.getArrayBuilders().getIntBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #79  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #85  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder ArrayBuilders.getIntBuilder()>
	//   12   24:astore          8
		ai = (int[])intbuilder.resetAndStart();
	//   13   26:aload           8
	//   14   28:invokevirtual   #90  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.resetAndStart()>
	//   15   31:checkcast       #23  <Class int[]>
	//   16   34:astore          6
		i = 0;
	//   17   36:iconst_0        
	//   18   37:istore_3        
_L2:
		int j;
		JsonToken jsontoken;
		jsontoken = jsonparser.nextToken();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #94  <Method JsonToken JsonParser.nextToken()>
	//   21   42:astore          7
		if(jsontoken == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   22   44:aload           7
	//   23   46:getstatic       #100 <Field JsonToken JsonToken.END_ARRAY>
	//   24   49:if_acmpeq       166
		if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  25   52:aload           7
	//*  26   54:getstatic       #103 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  27   57:if_acmpne       69
		{
			j = jsonparser.getIntValue();
	//   28   60:aload_1         
	//   29   61:invokevirtual   #107 <Method int JsonParser.getIntValue()>
	//   30   64:istore          4
			break MISSING_BLOCK_LABEL_117;
	//   31   66:goto            117
		}
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  32   69:aload           7
	//*  33   71:getstatic       #110 <Field JsonToken JsonToken.VALUE_NULL>
	//*  34   74:if_acmpne       109
		{
			if(_nuller != null)
	//*  35   77:aload_0         
	//*  36   78:getfield        #114 <Field NullValueProvider _nuller>
	//*  37   81:ifnull          98
			{
				_nuller.getNullValue(deserializationcontext);
	//   38   84:aload_0         
	//   39   85:getfield        #114 <Field NullValueProvider _nuller>
	//   40   88:aload_2         
	//   41   89:invokeinterface #120 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   42   94:pop             
				continue; /* Loop/switch isn't completed */
	//   43   95:goto            38
			}
			int k;
			int ai1[];
			try
			{
				_verifyNullForPrimitive(deserializationcontext);
	//   44   98:aload_0         
	//   45   99:aload_2         
	//   46  100:invokevirtual   #124 <Method void _verifyNullForPrimitive(DeserializationContext)>
			}
	//*  47  103:iconst_0        
	//*  48  104:istore          4
	//*  49  106:goto            117
	//*  50  109:aload_0         
	//*  51  110:aload_1         
	//*  52  111:aload_2         
	//*  53  112:invokevirtual   #128 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
	//*  54  115:istore          4
	//*  55  117:aload           6
	//*  56  119:astore          7
	//*  57  121:iload_3         
	//*  58  122:istore          5
	//*  59  124:iload_3         
	//*  60  125:aload           6
	//*  61  127:arraylength     
	//*  62  128:icmplt          147
	//*  63  131:aload           8
	//*  64  133:aload           6
	//*  65  135:iload_3         
	//*  66  136:invokevirtual   #132 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.appendCompletedChunk(Object, int)>
	//*  67  139:checkcast       #23  <Class int[]>
	//*  68  142:astore          7
	//*  69  144:iconst_0        
	//*  70  145:istore          5
	//*  71  147:aload           7
	//*  72  149:iload           5
	//*  73  151:iload           4
	//*  74  153:iastore         
	//*  75  154:iload           5
	//*  76  156:iconst_1        
	//*  77  157:iadd            
	//*  78  158:istore_3        
	//*  79  159:aload           7
	//*  80  161:astore          6
	//*  81  163:goto            38
	//*  82  166:aload           8
	//*  83  168:aload           6
	//*  84  170:iload_3         
	//*  85  171:invokevirtual   #135 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.completeAndClearBuffer(Object, int)>
	//*  86  174:checkcast       #23  <Class int[]>
	//*  87  177:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  88  178:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (ai)), intbuilder.bufferedSize() + i);
	//   89  179:aload_1         
	//   90  180:aload           6
	//   91  182:aload           8
	//   92  184:invokevirtual   #138 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder.bufferedSize()>
	//   93  187:iload_3         
	//   94  188:iadd            
	//   95  189:invokestatic    #144 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   96  192:athrow          
			}
			j = 0;
			break MISSING_BLOCK_LABEL_117;
		}
		j = _parseIntPrimitive(jsonparser, deserializationcontext);
		ai1 = ai;
		k = i;
		if(i < ai.length)
			break MISSING_BLOCK_LABEL_147;
		ai1 = (int[])intbuilder.appendCompletedChunk(((Object) (ai)), i);
		k = 0;
		ai1[k] = j;
		i = k + 1;
		ai = ai1;
		if(true) goto _L2; else goto _L1
_L1:
		return (int[])intbuilder.completeAndClearBuffer(((Object) (ai)), i);
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #147 <Method int[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected int[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return (new int[] {
			_parseIntPrimitive(jsonparser, deserializationcontext)
		});
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:aload_2         
	//    7    8:invokevirtual   #128 <Method int _parseIntPrimitive(JsonParser, DeserializationContext)>
	//    8   11:iastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$IntDeser(this, nullvalueprovider, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$IntDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #151 <Method void PrimitiveArrayDeserializers$IntDeser(PrimitiveArrayDeserializers$IntDeser, NullValueProvider, Boolean)>
	//    6   10:areturn         
	}

	public static final PrimitiveArrayDeserializers$IntDeser instance = new PrimitiveArrayDeserializers$IntDeser();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$IntDeser>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void PrimitiveArrayDeserializers$IntDeser()>
	//    3    7:putstatic       #20  <Field PrimitiveArrayDeserializers$IntDeser instance>
	//*   4   10:return          
	}

	public PrimitiveArrayDeserializers$IntDeser()
	{
		super([I);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class int[]>
	//    2    3:invokespecial   #26  <Method void PrimitiveArrayDeserializers(Class)>
	//    3    6:return          
	}

	protected PrimitiveArrayDeserializers$IntDeser(PrimitiveArrayDeserializers$IntDeser primitivearraydeserializers$intdeser, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$intdeser)), nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #30  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
	//    5    7:return          
	}
}
