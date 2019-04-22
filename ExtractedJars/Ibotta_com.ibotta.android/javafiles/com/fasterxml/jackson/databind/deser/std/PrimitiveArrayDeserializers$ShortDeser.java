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

static final class PrimitiveArrayDeserializers$ShortDeser extends PrimitiveArrayDeserializers
{

	protected volatile Object _concat(Object obj, Object obj1)
	{
		return ((Object) (_concat((short[])obj, (short[])obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class short[]>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class short[]>
	//    5    9:invokevirtual   #28  <Method short[] _concat(short[], short[])>
	//    6   12:areturn         
	}

	protected short[] _concat(short aword0[], short aword1[])
	{
		int i = aword0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int j = aword1.length;
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:istore          4
		aword0 = Arrays.copyOf(aword0, i + j);
	//    6    7:aload_1         
	//    7    8:iload_3         
	//    8    9:iload           4
	//    9   11:iadd            
	//   10   12:invokestatic    #34  <Method short[] Arrays.copyOf(short[], int)>
	//   11   15:astore_1        
		System.arraycopy(((Object) (aword1)), 0, ((Object) (aword0)), i, j);
	//   12   16:aload_2         
	//   13   17:iconst_0        
	//   14   18:aload_1         
	//   15   19:iload_3         
	//   16   20:iload           4
	//   17   22:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aword0;
	//   18   25:aload_1         
	//   19   26:areturn         
	}

	protected volatile Object _constructEmpty()
	{
		return ((Object) (_constructEmpty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method short[] _constructEmpty()>
	//    2    4:areturn         
	}

	protected short[] _constructEmpty()
	{
		return new short[0];
	//    0    0:iconst_0        
	//    1    1:newarray        short[]
	//    2    3:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #54  <Method short[] deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public short[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		int i;
		short aword0[];
		com.fasterxml.jackson.databind.util.ArrayBuilders.ShortBuilder shortbuilder;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #63  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            17
			return (short[])handleNonArray(jsonparser, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #66  <Method Object handleNonArray(JsonParser, DeserializationContext)>
	//    7   13:checkcast       #15  <Class short[]>
	//    8   16:areturn         
		shortbuilder = deserializationcontext.getArrayBuilders().getShortBuilder();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #72  <Method ArrayBuilders DeserializationContext.getArrayBuilders()>
	//   11   21:invokevirtual   #78  <Method com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder ArrayBuilders.getShortBuilder()>
	//   12   24:astore          8
		aword0 = (short[])shortbuilder.resetAndStart();
	//   13   26:aload           8
	//   14   28:invokevirtual   #83  <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.resetAndStart()>
	//   15   31:checkcast       #15  <Class short[]>
	//   16   34:astore          6
		i = 0;
	//   17   36:iconst_0        
	//   18   37:istore          4
_L2:
		JsonToken jsontoken;
		jsontoken = jsonparser.nextToken();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #87  <Method JsonToken JsonParser.nextToken()>
	//   21   43:astore          7
		if(jsontoken == JsonToken.END_ARRAY)
			break; /* Loop/switch isn't completed */
	//   22   45:aload           7
	//   23   47:getstatic       #93  <Field JsonToken JsonToken.END_ARRAY>
	//   24   50:if_acmpeq       151
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  25   53:aload           7
	//*  26   55:getstatic       #96  <Field JsonToken JsonToken.VALUE_NULL>
	//*  27   58:if_acmpne       92
		{
			if(_nuller != null)
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
			short word0;
			int j;
			short aword1[];
			try
			{
				_verifyNullForPrimitive(deserializationcontext);
	//   37   82:aload_0         
	//   38   83:aload_2         
	//   39   84:invokevirtual   #110 <Method void _verifyNullForPrimitive(DeserializationContext)>
			}
	//*  40   87:iconst_0        
	//*  41   88:istore_3        
	//*  42   89:goto            99
	//*  43   92:aload_0         
	//*  44   93:aload_1         
	//*  45   94:aload_2         
	//*  46   95:invokevirtual   #114 <Method short _parseShortPrimitive(JsonParser, DeserializationContext)>
	//*  47   98:istore_3        
	//*  48   99:aload           6
	//*  49  101:astore          7
	//*  50  103:iload           4
	//*  51  105:istore          5
	//*  52  107:iload           4
	//*  53  109:aload           6
	//*  54  111:arraylength     
	//*  55  112:icmplt          132
	//*  56  115:aload           8
	//*  57  117:aload           6
	//*  58  119:iload           4
	//*  59  121:invokevirtual   #118 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.appendCompletedChunk(Object, int)>
	//*  60  124:checkcast       #15  <Class short[]>
	//*  61  127:astore          7
	//*  62  129:iconst_0        
	//*  63  130:istore          5
	//*  64  132:aload           7
	//*  65  134:iload           5
	//*  66  136:iload_3         
	//*  67  137:sastore         
	//*  68  138:iload           5
	//*  69  140:iconst_1        
	//*  70  141:iadd            
	//*  71  142:istore          4
	//*  72  144:aload           7
	//*  73  146:astore          6
	//*  74  148:goto            39
	//*  75  151:aload           8
	//*  76  153:aload           6
	//*  77  155:iload           4
	//*  78  157:invokevirtual   #121 <Method Object com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.completeAndClearBuffer(Object, int)>
	//*  79  160:checkcast       #15  <Class short[]>
	//*  80  163:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
	//*  81  164:astore_1        
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (aword0)), shortbuilder.bufferedSize() + i);
	//   82  165:aload_1         
	//   83  166:aload           6
	//   84  168:aload           8
	//   85  170:invokevirtual   #125 <Method int com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder.bufferedSize()>
	//   86  173:iload           4
	//   87  175:iadd            
	//   88  176:invokestatic    #131 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   89  179:athrow          
			}
			word0 = 0;
			break MISSING_BLOCK_LABEL_99;
		}
		word0 = _parseShortPrimitive(jsonparser, deserializationcontext);
		aword1 = aword0;
		j = i;
		if(i < aword0.length)
			break MISSING_BLOCK_LABEL_132;
		aword1 = (short[])shortbuilder.appendCompletedChunk(((Object) (aword0)), i);
		j = 0;
		aword1[j] = word0;
		i = j + 1;
		aword0 = aword1;
		if(true) goto _L2; else goto _L1
_L1:
		return (short[])shortbuilder.completeAndClearBuffer(((Object) (aword0)), i);
	}

	protected volatile Object handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (handleSingleElementUnwrapped(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #134 <Method short[] handleSingleElementUnwrapped(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected short[] handleSingleElementUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return (new short[] {
			_parseShortPrimitive(jsonparser, deserializationcontext)
		});
	//    0    0:iconst_1        
	//    1    1:newarray        short[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:aload_0         
	//    5    6:aload_1         
	//    6    7:aload_2         
	//    7    8:invokevirtual   #114 <Method short _parseShortPrimitive(JsonParser, DeserializationContext)>
	//    8   11:sastore         
	//    9   12:areturn         
	}

	protected PrimitiveArrayDeserializers withResolved(NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return ((PrimitiveArrayDeserializers) (new PrimitiveArrayDeserializers$ShortDeser(this, nullvalueprovider, boolean1)));
	//    0    0:new             #2   <Class PrimitiveArrayDeserializers$ShortDeser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #138 <Method void PrimitiveArrayDeserializers$ShortDeser(PrimitiveArrayDeserializers$ShortDeser, NullValueProvider, Boolean)>
	//    6   10:areturn         
	}

	private static final long serialVersionUID = 1L;

	public PrimitiveArrayDeserializers$ShortDeser()
	{
		super([S);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <Class short[]>
	//    2    3:invokespecial   #18  <Method void PrimitiveArrayDeserializers(Class)>
	//    3    6:return          
	}

	protected PrimitiveArrayDeserializers$ShortDeser(PrimitiveArrayDeserializers$ShortDeser primitivearraydeserializers$shortdeser, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(((PrimitiveArrayDeserializers) (primitivearraydeserializers$shortdeser)), nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #23  <Method void PrimitiveArrayDeserializers(PrimitiveArrayDeserializers, NullValueProvider, Boolean)>
	//    5    7:return          
	}
}
