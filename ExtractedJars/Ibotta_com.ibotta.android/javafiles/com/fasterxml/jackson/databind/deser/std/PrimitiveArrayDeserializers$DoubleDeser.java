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

static final class PrimitiveArrayDeserializers$DoubleDeser extends PrimitiveArrayDeserializers
{

	protected volatile Object _concat(Object obj, Object obj1)
	{
		return ((Object) (_concat((double[])obj, (double[])obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class double[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class double[]>
	//    5    9:invokevirtual   #28  <Method double[] _concat(double[], double[])>
	//    6   12:areturn         
	}

	protected double[] _concat(double ad[], double ad1[])
	{
		int i = ad.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int j = ad1.length;
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:istore          4
		ad = Arrays.copyOf(ad, i + j);
	//    6    7:aload_1         
	//    7    8:iload_3         
	//    8    9:iload           4
	//    9   11:iadd            
	//   10   12:invokestatic    #34  <Method double[] Arrays.copyOf(double[], int)>
	//   11   15:astore_1        
		System.arraycopy(((Object) (ad1)), 0, ((Object) (ad)), i, j);
	//   12   16:aload_2         
	//   13   17:iconst_0        
	//   14   18:aload_1         
	//   15   19:iload_3         
	//   16   20:iload           4
	//   17   22:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
		return ad;
	//   18   25:aload_1         
	//   19   26:areturn         
	}

	protected volatile Object _constructEmpty()
	{
		return ((Object) (_constructEmpty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method double[] _constructEmpty()>
	//    2    4:areturn         
	}

	protected double[] _constructEmpty()
	{
		return new double[0];
	//    0    0:iconst_0        
	//    1    1:newarray        double[]
	//    2    3:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #54  <Method double[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public double[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		double ad[];
		com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder doublebuilder;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #63  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (double[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #66  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #15  <Class double[]>
	//    8   16:areturn         
		doublebuilder = deserializationcontext.getArrayBuilders().getDoubleBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #72  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #78  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder ArrayBuilders.getDoubleBuilder()>
	//   12   24:astore          9
		ad = (double[])doublebuilder.resetAndStart();
	//   13   26:aload           9
	//   14   28:invokevirtual   #83  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.resetAndStart()>
	//   15   31:checkcast       #15  <Class double[]>
	//   16   34:astore          7
		i = 0;
	//   17   36:iconst_0        
	//   18   37:istore          5
_L2:
		JsonToken jsontoken = jsonparser.nextToken();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #87  <Method JsonToken JsonParser.nextToken()>
	//   21   43:astore          8
		if(jsontoken == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   22   45:aload           8
	//   23   47:getstatic       #93  <Field JsonToken JsonToken.END_ARRAY>
	//   24   50:if_acmpeq       141
		if(jsontoken == JsonToken.VALUE_NULL && _nuller != null)
	//*  25   53:aload           8
	//*  26   55:getstatic       #96  <Field JsonToken JsonToken.VALUE_NULL>
	//*  27   58:if_acmpne       82
	//*  28   61:aload_0         
	//*  29   62:getfield        #100 <Field NullValueProvider _nuller>
	//*  30   65:ifnull          82
		{
			_nuller.getNullValue(deserializationcontext);
	//   31   68:aload_0         
	//   32   69:getfield        #100 <Field NullValueProvider _nuller>
	//   33   72:aload_2         
	//   34   73:invokeinterface #106 <Method Object NullValueProvider.getNullValue(DeserializationContext)>
	//   35   78:pop             
			continue; /* Loop/switch isn't completed */
	//   36   79:goto            39
		}
		double d;
		int j;
		double ad1[];
		try
		{
			d = _parseDoublePrimitive(jsonparser, deserializationcontext);
	//   37   82:aload_0         
	//   38   83:aload_1         
	//   39   84:aload_2         
	//   40   85:invokevirtual   #110 <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
	//   41   88:dstore_3        
		}
	//*  42   89:aload           7
	//*  43   91:astore          8
	//*  44   93:iload           5
	//*  45   95:istore          6
	//*  46   97:iload           5
	//*  47   99:aload           7
	//*  48  101:arraylength     
	//*  49  102:icmplt          122
	//*  50  105:aload           9
	//*  51  107:aload           7
	//*  52  109:iload           5
	//*  53  111:invokevirtual   #114 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.appendCompletedChunk(Object, int)>
	//*  54  114:checkcast       #15  <Class double[]>
	//*  55  117:astore          8
	//*  56  119:iconst_0        
	//*  57  120:istore          6
	//*  58  122:aload           8
	//*  59  124:iload           6
	//*  60  126:dload_3         
	//*  61  127:dastore         
	//*  62  128:iload           6
	//*  63  130:iconst_1        
	//*  64  131:iadd            
	//*  65  132:istore          5
	//*  66  134:aload           8
	//*  67  136:astore          7
	//*  68  138:goto            39
	//*  69  141:aload           9
	//*  70  143:aload           7
	//*  71  145:iload           5
	//*  72  147:invokevirtual   #117 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.completeAndClearBuffer(Object, int)>
	//*  73  150:checkcast       #15  <Class double[]>
	//*  74  153:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  75  154:astore_1        
		{
			throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (ad)), doublebuilder.bufferedSize() + i);
	//   76  155:aload_1         
	//   77  156:aload           7
	//   78  158:aload           9
	//   79  160:invokevirtual   #121 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder.bufferedSize()>
	//   80  163:iload           5
	//   81  165:iadd            
	//   82  166:invokestatic    #127 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   83  169:athrow          
		}
		ad1 = ad;
		j = i;
		if(i < ad.length)
			break MISSING_BLOCK_LABEL_122;
		ad1 = (double[])doublebuilder.appendCompletedChunk(((Object) (ad)), i);
		j = 0;
		ad1[j] = d;
		i = j + 1;
		ad = ad1;
		if(true) goto _L2; else goto _L1
_L1:
		return (double[])doublebuilder.completeAndClearBuffer(((Object) (ad)), i);
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #130 <Method double[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
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
	//    7    8:invokevirtual   #110 <Method double _parseDoublePrimitive(JsonParser, DeserializationContext)>
	//    8   11:dastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$DoubleDeser(this, nullvalueprovider, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$DoubleDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #134 <Method void PrimitiveArrayDeserializers$DoubleDeser(PrimitiveArrayDeserializers$DoubleDeser, NullValueProvider, Boolean)>
	//    6   10:areturn         
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

	protected PrimitiveArrayDeserializers$DoubleDeser(PrimitiveArrayDeserializers$DoubleDeser primitivearraydeserializers$doubledeser, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$doubledeser)), nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
	//    5    7:return          
	}
}
