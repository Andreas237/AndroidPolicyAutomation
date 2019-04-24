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

static final class PrimitiveArrayDeserializers$FloatDeser extends PrimitiveArrayDeserializers
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method float[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public float[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #41  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (float[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #44  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #15  <Class float[]>
	//    8   16:areturn         
		com.fasterxml.jackson.databind.util.ArrayBuilders.FloatBuilder floatbuilder = deserializationcontext.getArrayBuilders().getFloatBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #50  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #56  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder ArrayBuilders.getFloatBuilder()>
	//   12   24:astore          8
		float af[] = (float[])floatbuilder.resetAndStart();
	//   13   26:aload           8
	//   14   28:invokevirtual   #62  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.resetAndStart()>
	//   15   31:checkcast       #15  <Class float[]>
	//   16   34:astore          6
		int i = 0;
	//   17   36:iconst_0        
	//   18   37:istore          4
label0:
		do
		{
label1:
			{
				float f;
				int j;
				float af1[];
				try
				{
					if(jsonparser.nextToken() == JsonToken.END_ARRAY)
						break label0;
	//   19   39:aload_1         
	//   20   40:invokevirtual   #66  <Method JsonToken JsonParser.nextToken()>
	//   21   43:getstatic       #72  <Field JsonToken JsonToken.END_ARRAY>
	//   22   46:if_acmpeq       120
					f = _parseFloatPrimitive(jsonparser, deserializationcontext);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #76  <Method float _parseFloatPrimitive(JsonParser, DeserializationContext)>
	//   27   55:fstore_3        
					if(i < af.length)
						break label1;
	//   28   56:iload           4
	//   29   58:aload           6
	//   30   60:arraylength     
	//   31   61:icmplt          133
					af1 = (float[])floatbuilder.appendCompletedChunk(((Object) (af)), i);
	//   32   64:aload           8
	//   33   66:aload           6
	//   34   68:iload           4
	//   35   70:invokevirtual   #80  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.appendCompletedChunk(Object, int)>
	//   36   73:checkcast       #15  <Class float[]>
	//   37   76:astore          7
				}
	//*  38   78:iconst_0        
	//*  39   79:istore          4
	//*  40   81:aload           7
	//*  41   83:astore          6
	//*  42   85:iload           4
	//*  43   87:iconst_1        
	//*  44   88:iadd            
	//*  45   89:istore          5
	//*  46   91:aload           6
	//*  47   93:iload           4
	//*  48   95:fload_3         
	//*  49   96:fastore         
	//*  50   97:iload           5
	//*  51   99:istore          4
	//*  52  101:goto            39
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
	//*  53  104:astore_1        
				{
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (af)), floatbuilder.bufferedSize() + i);
	//   54  105:aload_1         
	//   55  106:aload           6
	//   56  108:aload           8
	//   57  110:invokevirtual   #84  <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.bufferedSize()>
	//   58  113:iload           4
	//   59  115:iadd            
	//   60  116:invokestatic    #90  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   61  119:athrow          
				}
				i = 0;
				af = af1;
			}
			j = i + 1;
			af[i] = f;
			i = j;
		} while(true);
		return (float[])floatbuilder.completeAndClearBuffer(((Object) (af)), i);
	//   62  120:aload           8
	//   63  122:aload           6
	//   64  124:iload           4
	//   65  126:invokevirtual   #93  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder.completeAndClearBuffer(Object, int)>
	//   66  129:checkcast       #15  <Class float[]>
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
	//    3    3:invokevirtual   #96  <Method float[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected float[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return (new float[] {
			_parseFloatPrimitive(jsonparser, deserializationcontext)
		});
	//    0    0:iconst_1        
	//    1    1:newarray        float[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:aload_2         
	//    7    8:invokevirtual   #76  <Method float _parseFloatPrimitive(JsonParser, DeserializationContext)>
	//    8   11:fastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$FloatDeser(this, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$FloatDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #100 <Method void PrimitiveArrayDeserializers$FloatDeser(PrimitiveArrayDeserializers$FloatDeser, Boolean)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;

	public PrimitiveArrayDeserializers$FloatDeser()
	{
		super([F);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <Class float[]>
	//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
	//    3    6:return          
	}

	protected PrimitiveArrayDeserializers$FloatDeser(PrimitiveArrayDeserializers$FloatDeser primitivearraydeserializers$floatdeser, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$floatdeser)), boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, Boolean)>
	//    4    6:return          
	}
}
