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

static final class PrimitiveArrayDeserializers$LongDeser extends PrimitiveArrayDeserializers
{

	protected volatile Object _concat(Object obj, Object obj1)
	{
		return ((Object) (_concat((long[])obj, (long[])obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class long[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class long[]>
	//    5    9:invokevirtual   #35  <Method long[] _concat(long[], long[])>
	//    6   12:areturn         
	}

	protected long[] _concat(long al[], long al1[])
	{
		int i = al.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int j = al1.length;
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:istore          4
		al = Arrays.copyOf(al, i + j);
	//    6    7:aload_1         
	//    7    8:iload_3         
	//    8    9:iload           4
	//    9   11:iadd            
	//   10   12:invokestatic    #41  <Method long[] Arrays.copyOf(long[], int)>
	//   11   15:astore_1        
		System.arraycopy(((Object) (al1)), 0, ((Object) (al)), i, j);
	//   12   16:aload_2         
	//   13   17:iconst_0        
	//   14   18:aload_1         
	//   15   19:iload_3         
	//   16   20:iload           4
	//   17   22:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
		return al;
	//   18   25:aload_1         
	//   19   26:areturn         
	}

	protected volatile Object _constructEmpty()
	{
		return ((Object) (_constructEmpty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method long[] _constructEmpty()>
	//    2    4:areturn         
	}

	protected long[] _constructEmpty()
	{
		return new long[0];
	//    0    0:iconst_0        
	//    1    1:newarray        long[]
	//    2    3:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #61  <Method long[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public long[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		long al[];
		com.fasterxml.jackson.databind.util.ArrayBuilders.LongBuilder longbuilder;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #70  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (long[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #73  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #23  <Class long[]>
	//    8   16:areturn         
		longbuilder = deserializationcontext.getArrayBuilders().getLongBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #79  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #85  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder ArrayBuilders.getLongBuilder()>
	//   12   24:astore          9
		al = (long[])longbuilder.resetAndStart();
	//   13   26:aload           9
	//   14   28:invokevirtual   #90  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.resetAndStart()>
	//   15   31:checkcast       #23  <Class long[]>
	//   16   34:astore          7
		i = 0;
	//   17   36:iconst_0        
	//   18   37:istore_3        
_L2:
		long l;
		JsonToken jsontoken;
		jsontoken = jsonparser.nextToken();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #94  <Method JsonToken JsonParser.nextToken()>
	//   21   42:astore          8
		if(jsontoken == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   22   44:aload           8
	//   23   46:getstatic       #100 <Field JsonToken JsonToken.END_ARRAY>
	//   24   49:if_acmpeq       166
		if(jsontoken == JsonToken.VALUE_NUMBER_INT)
	//*  25   52:aload           8
	//*  26   54:getstatic       #103 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  27   57:if_acmpne       69
		{
			l = jsonparser.getLongValue();
	//   28   60:aload_1         
	//   29   61:invokevirtual   #107 <Method long JsonParser.getLongValue()>
	//   30   64:lstore          5
			break MISSING_BLOCK_LABEL_117;
	//   31   66:goto            117
		}
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  32   69:aload           8
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
			int j;
			long al1[];
			try
			{
				_verifyNullForPrimitive(deserializationcontext);
	//   44   98:aload_0         
	//   45   99:aload_2         
	//   46  100:invokevirtual   #124 <Method void _verifyNullForPrimitive(DeserializationContext)>
			}
	//*  47  103:lconst_0        
	//*  48  104:lstore          5
	//*  49  106:goto            117
	//*  50  109:aload_0         
	//*  51  110:aload_1         
	//*  52  111:aload_2         
	//*  53  112:invokevirtual   #128 <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
	//*  54  115:lstore          5
	//*  55  117:aload           7
	//*  56  119:astore          8
	//*  57  121:iload_3         
	//*  58  122:istore          4
	//*  59  124:iload_3         
	//*  60  125:aload           7
	//*  61  127:arraylength     
	//*  62  128:icmplt          147
	//*  63  131:aload           9
	//*  64  133:aload           7
	//*  65  135:iload_3         
	//*  66  136:invokevirtual   #132 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.appendCompletedChunk(Object, int)>
	//*  67  139:checkcast       #23  <Class long[]>
	//*  68  142:astore          8
	//*  69  144:iconst_0        
	//*  70  145:istore          4
	//*  71  147:aload           8
	//*  72  149:iload           4
	//*  73  151:lload           5
	//*  74  153:lastore         
	//*  75  154:iload           4
	//*  76  156:iconst_1        
	//*  77  157:iadd            
	//*  78  158:istore_3        
	//*  79  159:aload           8
	//*  80  161:astore          7
	//*  81  163:goto            38
	//*  82  166:aload           9
	//*  83  168:aload           7
	//*  84  170:iload_3         
	//*  85  171:invokevirtual   #135 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.completeAndClearBuffer(Object, int)>
	//*  86  174:checkcast       #23  <Class long[]>
	//*  87  177:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  88  178:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (al)), longbuilder.bufferedSize() + i);
	//   89  179:aload_1         
	//   90  180:aload           7
	//   91  182:aload           9
	//   92  184:invokevirtual   #139 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.bufferedSize()>
	//   93  187:iload_3         
	//   94  188:iadd            
	//   95  189:invokestatic    #145 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   96  192:athrow          
			}
			l = 0L;
			break MISSING_BLOCK_LABEL_117;
		}
		l = _parseLongPrimitive(jsonparser, deserializationcontext);
		al1 = al;
		j = i;
		if(i < al.length)
			break MISSING_BLOCK_LABEL_147;
		al1 = (long[])longbuilder.appendCompletedChunk(((Object) (al)), i);
		j = 0;
		al1[j] = l;
		i = j + 1;
		al = al1;
		if(true) goto _L2; else goto _L1
_L1:
		return (long[])longbuilder.completeAndClearBuffer(((Object) (al)), i);
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #148 <Method long[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected long[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return (new long[] {
			_parseLongPrimitive(jsonparser, deserializationcontext)
		});
	//    0    0:iconst_1        
	//    1    1:newarray        long[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:aload_2         
	//    7    8:invokevirtual   #128 <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
	//    8   11:lastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$LongDeser(this, nullvalueprovider, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$LongDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #152 <Method void PrimitiveArrayDeserializers$LongDeser(PrimitiveArrayDeserializers$LongDeser, NullValueProvider, Boolean)>
	//    6   10:areturn         
	}

	public static final PrimitiveArrayDeserializers$LongDeser instance = new PrimitiveArrayDeserializers$LongDeser();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$LongDeser>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void PrimitiveArrayDeserializers$LongDeser()>
	//    3    7:putstatic       #20  <Field PrimitiveArrayDeserializers$LongDeser instance>
	//*   4   10:return          
	}

	public PrimitiveArrayDeserializers$LongDeser()
	{
		super([J);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class long[]>
	//    2    3:invokespecial   #26  <Method void PrimitiveArrayDeserializers(Class)>
	//    3    6:return          
	}

	protected PrimitiveArrayDeserializers$LongDeser(PrimitiveArrayDeserializers$LongDeser primitivearraydeserializers$longdeser, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$longdeser)), nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #30  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
	//    5    7:return          
	}
}
