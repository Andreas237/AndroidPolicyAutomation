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

static final class PrimitiveArrayDeserializers$DoubleDeser extends PrimitiveArrayDeserializers
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method double[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public double[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #41  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (double[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #44  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #15  <Class double[]>
	//    8   16:areturn         
		com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder doublebuilder = deserializationcontext.getArrayBuilders().getDoubleBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #50  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #56  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder ArrayBuilders.getDoubleBuilder()>
	//   12   24:astore          9
		double ad[] = (double[])doublebuilder.resetAndStart();
	//   13   26:aload           9
	//   14   28:invokevirtual   #62  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.resetAndStart()>
	//   15   31:checkcast       #15  <Class double[]>
	//   16   34:astore          7
		int i = 0;
	//   17   36:iconst_0        
	//   18   37:istore          5
label0:
		do
		{
label1:
			{
				double d;
				int j;
				double ad1[];
				try
				{
					if(jsonparser.nextToken() == JsonToken.END_ARRAY)
						break label0;
	//   19   39:aload_1         
	//   20   40:invokevirtual   #66  <Method JsonToken JsonParser.nextToken()>
	//   21   43:getstatic       #72  <Field JsonToken JsonToken.END_ARRAY>
	//   22   46:if_acmpeq       120
					d = _parseDoublePrimitive(jsonparser, deserializationcontext);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #76  <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
	//   27   55:dstore_3        
					if(i < ad.length)
						break label1;
	//   28   56:iload           5
	//   29   58:aload           7
	//   30   60:arraylength     
	//   31   61:icmplt          133
					ad1 = (double[])doublebuilder.appendCompletedChunk(((Object) (ad)), i);
	//   32   64:aload           9
	//   33   66:aload           7
	//   34   68:iload           5
	//   35   70:invokevirtual   #80  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.appendCompletedChunk(Object, int)>
	//   36   73:checkcast       #15  <Class double[]>
	//   37   76:astore          8
				}
	//*  38   78:iconst_0        
	//*  39   79:istore          5
	//*  40   81:aload           8
	//*  41   83:astore          7
	//*  42   85:iload           5
	//*  43   87:iconst_1        
	//*  44   88:iadd            
	//*  45   89:istore          6
	//*  46   91:aload           7
	//*  47   93:iload           5
	//*  48   95:dload_3         
	//*  49   96:dastore         
	//*  50   97:iload           6
	//*  51   99:istore          5
	//*  52  101:goto            39
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
	//*  53  104:astore_1        
				{
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (ad)), doublebuilder.bufferedSize() + i);
	//   54  105:aload_1         
	//   55  106:aload           7
	//   56  108:aload           9
	//   57  110:invokevirtual   #84  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.bufferedSize()>
	//   58  113:iload           5
	//   59  115:iadd            
	//   60  116:invokestatic    #90  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   61  119:athrow          
				}
				i = 0;
				ad = ad1;
			}
			j = i + 1;
			ad[i] = d;
			i = j;
		} while(true);
		return (double[])doublebuilder.completeAndClearBuffer(((Object) (ad)), i);
	//   62  120:aload           9
	//   63  122:aload           7
	//   64  124:iload           5
	//   65  126:invokevirtual   #93  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.completeAndClearBuffer(Object, int)>
	//   66  129:checkcast       #15  <Class double[]>
	//   67  132:areturn         
	//*  68  133:goto            85
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #96  <Method double[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected double[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return (new double[] {
			_parseDoublePrimitive(jsonparser, deserializationcontext)
		});
	//    0    0:iconst_1        
	//    1    1:newarray        double[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:aload_2         
	//    7    8:invokevirtual   #76  <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
	//    8   11:dastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$DoubleDeser(this, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$DoubleDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #100 <Method void PrimitiveArrayDeserializers$DoubleDeser(PrimitiveArrayDeserializers$DoubleDeser, Boolean)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;

	public PrimitiveArrayDeserializers$DoubleDeser()
	{
		super([D);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <Class double[]>
	//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
	//    3    6:return          
	}

	protected PrimitiveArrayDeserializers$DoubleDeser(PrimitiveArrayDeserializers$DoubleDeser primitivearraydeserializers$doubledeser, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$doubledeser)), boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
	//    4    6:return          
	}
}
