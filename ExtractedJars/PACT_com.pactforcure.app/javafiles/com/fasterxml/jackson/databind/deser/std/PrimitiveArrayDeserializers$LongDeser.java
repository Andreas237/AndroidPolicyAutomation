// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			PrimitiveArrayDeserializers

static final class PrimitiveArrayDeserializers$LongDeser extends PrimitiveArrayDeserializers
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #39  <Method long[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public long[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #48  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (long[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #51  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #23  <Class long[]>
	//    8   16:areturn         
		com.fasterxml.jackson.databind.util.ArrayBuilders.LongBuilder longbuilder = deserializationcontext.getArrayBuilders().getLongBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #57  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #63  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder ArrayBuilders.getLongBuilder()>
	//   12   24:astore          9
		long al[] = (long[])longbuilder.resetAndStart();
	//   13   26:aload           9
	//   14   28:invokevirtual   #69  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.resetAndStart()>
	//   15   31:checkcast       #23  <Class long[]>
	//   16   34:astore          7
		int i = 0;
	//   17   36:iconst_0        
	//   18   37:istore_3        
label0:
		do
		{
label1:
			{
				int j;
				long l;
				long al1[];
				try
				{
					if(jsonparser.nextToken() == JsonToken.END_ARRAY)
						break label0;
	//   19   38:aload_1         
	//   20   39:invokevirtual   #73  <Method JsonToken JsonParser.nextToken()>
	//   21   42:getstatic       #79  <Field JsonToken JsonToken.END_ARRAY>
	//   22   45:if_acmpeq       114
					l = _parseLongPrimitive(jsonparser, deserializationcontext);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokevirtual   #83  <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
	//   27   54:lstore          5
					if(i < al.length)
						break label1;
	//   28   56:iload_3         
	//   29   57:aload           7
	//   30   59:arraylength     
	//   31   60:icmplt          126
					al1 = (long[])longbuilder.appendCompletedChunk(((Object) (al)), i);
	//   32   63:aload           9
	//   33   65:aload           7
	//   34   67:iload_3         
	//   35   68:invokevirtual   #87  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.appendCompletedChunk(Object, int)>
	//   36   71:checkcast       #23  <Class long[]>
	//   37   74:astore          8
				}
	//*  38   76:iconst_0        
	//*  39   77:istore_3        
	//*  40   78:aload           8
	//*  41   80:astore          7
	//*  42   82:iload_3         
	//*  43   83:iconst_1        
	//*  44   84:iadd            
	//*  45   85:istore          4
	//*  46   87:aload           7
	//*  47   89:iload_3         
	//*  48   90:lload           5
	//*  49   92:lastore         
	//*  50   93:iload           4
	//*  51   95:istore_3        
	//*  52   96:goto            38
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
	//*  53   99:astore_1        
				{
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (al)), longbuilder.bufferedSize() + i);
	//   54  100:aload_1         
	//   55  101:aload           7
	//   56  103:aload           9
	//   57  105:invokevirtual   #91  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.bufferedSize()>
	//   58  108:iload_3         
	//   59  109:iadd            
	//   60  110:invokestatic    #97  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   61  113:athrow          
				}
				i = 0;
				al = al1;
			}
			j = i + 1;
			al[i] = l;
			i = j;
		} while(true);
		return (long[])longbuilder.completeAndClearBuffer(((Object) (al)), i);
	//   62  114:aload           9
	//   63  116:aload           7
	//   64  118:iload_3         
	//   65  119:invokevirtual   #100 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder.completeAndClearBuffer(Object, int)>
	//   66  122:checkcast       #23  <Class long[]>
	//   67  125:areturn         
	//*  68  126:goto            82
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #103 <Method long[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
	//    7    8:invokevirtual   #83  <Method long _parseLongPrimitive(JsonParser, DeserializationContext)>
	//    8   11:lastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$LongDeser(this, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$LongDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #107 <Method void PrimitiveArrayDeserializers$LongDeser(PrimitiveArrayDeserializers$LongDeser, Boolean)>
	//    5    9:areturn         
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

	protected PrimitiveArrayDeserializers$LongDeser(PrimitiveArrayDeserializers$LongDeser primitivearraydeserializers$longdeser, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$longdeser)), boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #30  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
	//    4    6:return          
	}
}
