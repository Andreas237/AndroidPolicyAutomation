// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.BitSet;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$2 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method BitSet read(JsonReader)>
	//    3    5:areturn         
	}

	public BitSet read(JsonReader jsonreader)
		throws IOException
	{
		BitSet bitset = new BitSet();
	//    0    0:new             #24  <Class BitSet>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void BitSet()>
	//    3    7:astore          6
		jsonreader.beginArray();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #30  <Method void JsonReader.beginArray()>
		int i = 0;
	//    6   13:iconst_0        
	//    7   14:istore_2        
		for(Object obj = ((Object) (jsonreader.peek())); obj != JsonToken.END_ARRAY; obj = ((Object) (jsonreader.peek())))
	//*   8   15:aload_1         
	//*   9   16:invokevirtual   #34  <Method JsonToken JsonReader.peek()>
	//*  10   19:astore          5
	//*  11   21:aload           5
	//*  12   23:getstatic       #40  <Field JsonToken JsonToken.END_ARRAY>
	//*  13   26:if_acmpeq       204
		{
			boolean flag;
			switch(..SwitchMap.com.google.gson.stream.JsonToken[((JsonToken) (obj)).ordinal()])
	//*  14   29:getstatic       #46  <Field int[] TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken>
	//*  15   32:aload           5
	//*  16   34:invokevirtual   #50  <Method int JsonToken.ordinal()>
	//*  17   37:iaload          
			{
	//*  18   38:tableswitch     1 3: default 64
	//	               1 67
	//	               2 86
	//	               3 95
	//*  19   64:goto            152
			case 1: // '\001'
				if(jsonreader.nextInt() != 0)
	//*  20   67:aload_1         
	//*  21   68:invokevirtual   #53  <Method int JsonReader.nextInt()>
	//*  22   71:ifeq            80
					flag = true;
	//   23   74:iconst_1        
	//   24   75:istore          4
				else
	//*  25   77:goto            83
					flag = false;
	//   26   80:iconst_0        
	//   27   81:istore          4
				break;

	//*  28   83:goto            180
			case 2: // '\002'
				flag = jsonreader.nextBoolean();
	//   29   86:aload_1         
	//   30   87:invokevirtual   #57  <Method boolean JsonReader.nextBoolean()>
	//   31   90:istore          4
				break;

	//*  32   92:goto            180
			case 3: // '\003'
				obj = ((Object) (jsonreader.nextString()));
	//   33   95:aload_1         
	//   34   96:invokevirtual   #61  <Method String JsonReader.nextString()>
	//   35   99:astore          5
				int j;
				try
				{
					j = Integer.parseInt(((String) (obj)));
	//   36  101:aload           5
	//   37  103:invokestatic    #67  <Method int Integer.parseInt(String)>
	//   38  106:istore_3        
				}
	//*  39  107:iload_3         
	//*  40  108:ifeq            117
	//*  41  111:iconst_1        
	//*  42  112:istore          4
	//*  43  114:goto            120
	//*  44  117:iconst_0        
	//*  45  118:istore          4
	//*  46  120:goto            180
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
	//*  47  123:astore_1        
				{
					throw new JsonSyntaxException((new StringBuilder()).append("Error: Expecting: bitset number value (1, 0), Found: ").append(((String) (obj))).toString());
	//   48  124:new             #69  <Class JsonSyntaxException>
	//   49  127:dup             
	//   50  128:new             #71  <Class StringBuilder>
	//   51  131:dup             
	//   52  132:invokespecial   #72  <Method void StringBuilder()>
	//   53  135:ldc1            #74  <String "Error: Expecting: bitset number value (1, 0), Found: ">
	//   54  137:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   55  140:aload           5
	//   56  142:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   57  145:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   58  148:invokespecial   #84  <Method void JsonSyntaxException(String)>
	//   59  151:athrow          
				}
				if(j != 0)
					flag = true;
				else
					flag = false;
				break;

			default:
				throw new JsonSyntaxException((new StringBuilder()).append("Invalid bitset value type: ").append(obj).toString());
	//   60  152:new             #69  <Class JsonSyntaxException>
	//   61  155:dup             
	//   62  156:new             #71  <Class StringBuilder>
	//   63  159:dup             
	//   64  160:invokespecial   #72  <Method void StringBuilder()>
	//   65  163:ldc1            #86  <String "Invalid bitset value type: ">
	//   66  165:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   67  168:aload           5
	//   68  170:invokevirtual   #89  <Method StringBuilder StringBuilder.append(Object)>
	//   69  173:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   70  176:invokespecial   #84  <Method void JsonSyntaxException(String)>
	//   71  179:athrow          
			}
			if(flag)
	//*  72  180:iload           4
	//*  73  182:ifeq            191
				bitset.set(i);
	//   74  185:aload           6
	//   75  187:iload_2         
	//   76  188:invokevirtual   #93  <Method void BitSet.set(int)>
			i++;
	//   77  191:iload_2         
	//   78  192:iconst_1        
	//   79  193:iadd            
	//   80  194:istore_2        
		}

	//   81  195:aload_1         
	//   82  196:invokevirtual   #34  <Method JsonToken JsonReader.peek()>
	//   83  199:astore          5
	//*  84  201:goto            21
		jsonreader.endArray();
	//   85  204:aload_1         
	//   86  205:invokevirtual   #96  <Method void JsonReader.endArray()>
		return bitset;
	//   87  208:aload           6
	//   88  210:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (BitSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #24  <Class BitSet>
	//    4    6:invokevirtual   #101 <Method void write(JsonWriter, BitSet)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, BitSet bitset)
		throws IOException
	{
		jsonwriter.beginArray();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method JsonWriter JsonWriter.beginArray()>
	//    2    4:pop             
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		for(int k = bitset.length(); i < k; i++)
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #109 <Method int BitSet.length()>
	//*   7   11:istore          5
	//*   8   13:iload_3         
	//*   9   14:iload           5
	//*  10   16:icmpge          51
		{
			int j;
			if(bitset.get(i))
	//*  11   19:aload_2         
	//*  12   20:iload_3         
	//*  13   21:invokevirtual   #113 <Method boolean BitSet.get(int)>
	//*  14   24:ifeq            33
				j = 1;
	//   15   27:iconst_1        
	//   16   28:istore          4
			else
	//*  17   30:goto            36
				j = 0;
	//   18   33:iconst_0        
	//   19   34:istore          4
			jsonwriter.value(j);
	//   20   36:aload_1         
	//   21   37:iload           4
	//   22   39:i2l             
	//   23   40:invokevirtual   #117 <Method JsonWriter JsonWriter.value(long)>
	//   24   43:pop             
		}

	//   25   44:iload_3         
	//   26   45:iconst_1        
	//   27   46:iadd            
	//   28   47:istore_3        
	//*  29   48:goto            13
		jsonwriter.endArray();
	//   30   51:aload_1         
	//   31   52:invokevirtual   #119 <Method JsonWriter JsonWriter.endArray()>
	//   32   55:pop             
	//   33   56:return          
	}

	TypeAdapters$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
