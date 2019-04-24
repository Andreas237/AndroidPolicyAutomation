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

static final class PrimitiveArrayDeserializers$BooleanDeser extends PrimitiveArrayDeserializers
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method boolean[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #41  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (boolean[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #44  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #15  <Class boolean[]>
	//    8   16:areturn         
		com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder booleanbuilder = deserializationcontext.getArrayBuilders().getBooleanBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #50  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #56  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder ArrayBuilders.getBooleanBuilder()>
	//   12   24:astore          8
		boolean aflag[] = (boolean[])booleanbuilder.resetAndStart();
	//   13   26:aload           8
	//   14   28:invokevirtual   #62  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.resetAndStart()>
	//   15   31:checkcast       #15  <Class boolean[]>
	//   16   34:astore          6
		int i = 0;
	//   17   36:iconst_0        
	//   18   37:istore_3        
label0:
		do
		{
label1:
			{
				int j;
				boolean flag;
				boolean aflag1[];
				try
				{
					if(jsonparser.nextToken() == JsonToken.END_ARRAY)
						break label0;
	//   19   38:aload_1         
	//   20   39:invokevirtual   #66  <Method JsonToken JsonParser.nextToken()>
	//   21   42:getstatic       #72  <Field JsonToken JsonToken.END_ARRAY>
	//   22   45:if_acmpeq       114
					flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokevirtual   #76  <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
	//   27   54:istore          5
					if(i < aflag.length)
						break label1;
	//   28   56:iload_3         
	//   29   57:aload           6
	//   30   59:arraylength     
	//   31   60:icmplt          126
					aflag1 = (boolean[])booleanbuilder.appendCompletedChunk(((Object) (aflag)), i);
	//   32   63:aload           8
	//   33   65:aload           6
	//   34   67:iload_3         
	//   35   68:invokevirtual   #80  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.appendCompletedChunk(Object, int)>
	//   36   71:checkcast       #15  <Class boolean[]>
	//   37   74:astore          7
				}
	//*  38   76:iconst_0        
	//*  39   77:istore_3        
	//*  40   78:aload           7
	//*  41   80:astore          6
	//*  42   82:iload_3         
	//*  43   83:iconst_1        
	//*  44   84:iadd            
	//*  45   85:istore          4
	//*  46   87:aload           6
	//*  47   89:iload_3         
	//*  48   90:iload           5
	//*  49   92:bastore         
	//*  50   93:iload           4
	//*  51   95:istore_3        
	//*  52   96:goto            38
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
	//*  53   99:astore_1        
				{
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aflag)), booleanbuilder.bufferedSize() + i);
	//   54  100:aload_1         
	//   55  101:aload           6
	//   56  103:aload           8
	//   57  105:invokevirtual   #84  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.bufferedSize()>
	//   58  108:iload_3         
	//   59  109:iadd            
	//   60  110:invokestatic    #90  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   61  113:athrow          
				}
				i = 0;
				aflag = aflag1;
			}
			j = i + 1;
			aflag[i] = flag;
			i = j;
		} while(true);
		return (boolean[])booleanbuilder.completeAndClearBuffer(((Object) (aflag)), i);
	//   62  114:aload           8
	//   63  116:aload           6
	//   64  118:iload_3         
	//   65  119:invokevirtual   #93  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder.completeAndClearBuffer(Object, int)>
	//   66  122:checkcast       #15  <Class boolean[]>
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
	//    3    3:invokevirtual   #96  <Method boolean[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
	//    7    8:invokevirtual   #76  <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
	//    8   11:bastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$BooleanDeser(this, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$BooleanDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #100 <Method void PrimitiveArrayDeserializers$BooleanDeser(PrimitiveArrayDeserializers$BooleanDeser, Boolean)>
	//    5    9:areturn         
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

	protected PrimitiveArrayDeserializers$BooleanDeser(PrimitiveArrayDeserializers$BooleanDeser primitivearraydeserializers$booleandeser, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$booleandeser)), boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
	//    4    6:return          
	}
}
