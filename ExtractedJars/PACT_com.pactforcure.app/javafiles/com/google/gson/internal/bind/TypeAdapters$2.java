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
		int i;
		JsonToken jsontoken;
		BitSet bitset;
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #34  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #37  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		bitset = new BitSet();
	//    8   16:new             #39  <Class BitSet>
	//    9   19:dup             
	//   10   20:invokespecial   #40  <Method void BitSet()>
	//   11   23:astore          6
		jsonreader.beginArray();
	//   12   25:aload_1         
	//   13   26:invokevirtual   #43  <Method void JsonReader.beginArray()>
		i = 0;
	//   14   29:iconst_0        
	//   15   30:istore_2        
		jsontoken = jsonreader.peek();
	//   16   31:aload_1         
	//   17   32:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
	//   18   35:astore          5
_L2:
		boolean flag;
		if(jsontoken == JsonToken.END_ARRAY)
			break MISSING_BLOCK_LABEL_214;
	//   19   37:aload           5
	//   20   39:getstatic       #46  <Field JsonToken JsonToken.END_ARRAY>
	//   21   42:if_acmpeq       214
		switch(..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
	//*  22   45:getstatic       #52  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
	//*  23   48:aload           5
	//*  24   50:invokevirtual   #56  <Method int JsonToken.ordinal()>
	//*  25   53:iaload          
		{
	//*  26   54:tableswitch     1 3: default 80
	//	               1 108
	//	               2 148
	//	               3 157
		default:
			throw new JsonSyntaxException((new StringBuilder()).append("Invalid bitset value type: ").append(((Object) (jsontoken))).toString());
	//   27   80:new             #58  <Class JsonSyntaxException>
	//   28   83:dup             
	//   29   84:new             #60  <Class StringBuilder>
	//   30   87:dup             
	//   31   88:invokespecial   #61  <Method void StringBuilder()>
	//   32   91:ldc1            #63  <String "Invalid bitset value type: ">
	//   33   93:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   96:aload           5
	//   35   98:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   36  101:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   37  104:invokespecial   #77  <Method void JsonSyntaxException(String)>
	//   38  107:athrow          

		case 2: // '\002'
			break; /* Loop/switch isn't completed */

		case 3: // '\003'
			break MISSING_BLOCK_LABEL_157;

		case 1: // '\001'
			if(jsonreader.nextInt() != 0)
	//*  39  108:aload_1         
	//*  40  109:invokevirtual   #80  <Method int JsonReader.nextInt()>
	//*  41  112:ifeq            142
				flag = true;
	//   42  115:iconst_1        
	//   43  116:istore          4
			else
	//*  44  118:iload           4
	//*  45  120:ifeq            129
	//*  46  123:aload           6
	//*  47  125:iload_2         
	//*  48  126:invokevirtual   #84  <Method void BitSet.set(int)>
	//*  49  129:iload_2         
	//*  50  130:iconst_1        
	//*  51  131:iadd            
	//*  52  132:istore_2        
	//*  53  133:aload_1         
	//*  54  134:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
	//*  55  137:astore          5
	//*  56  139:goto            37
				flag = false;
	//   57  142:iconst_0        
	//   58  143:istore          4
			break;
		}
_L3:
		if(flag)
			bitset.set(i);
		i++;
		jsontoken = jsonreader.peek();
		if(true) goto _L2; else goto _L1
	//*  59  145:goto            118
_L1:
		flag = jsonreader.nextBoolean();
	//   60  148:aload_1         
	//   61  149:invokevirtual   #88  <Method boolean JsonReader.nextBoolean()>
	//   62  152:istore          4
		  goto _L3
	//*  63  154:goto            118
		String s = jsonreader.nextString();
	//   64  157:aload_1         
	//   65  158:invokevirtual   #91  <Method String JsonReader.nextString()>
	//   66  161:astore          5
		int j;
		try
		{
			j = Integer.parseInt(s);
	//   67  163:aload           5
	//   68  165:invokestatic    #97  <Method int Integer.parseInt(String)>
	//   69  168:istore_3        
		}
	//*  70  169:iload_3         
	//*  71  170:ifeq            179
	//*  72  173:iconst_1        
	//*  73  174:istore          4
	//*  74  176:goto            118
	//*  75  179:iconst_0        
	//*  76  180:istore          4
	//*  77  182:goto            176
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
	//*  78  185:astore_1        
		{
			throw new JsonSyntaxException((new StringBuilder()).append("Error: Expecting: bitset number value (1, 0), Found: ").append(s).toString());
	//   79  186:new             #58  <Class JsonSyntaxException>
	//   80  189:dup             
	//   81  190:new             #60  <Class StringBuilder>
	//   82  193:dup             
	//   83  194:invokespecial   #61  <Method void StringBuilder()>
	//   84  197:ldc1            #99  <String "Error: Expecting: bitset number value (1, 0), Found: ">
	//   85  199:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   86  202:aload           5
	//   87  204:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   88  207:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   89  210:invokespecial   #77  <Method void JsonSyntaxException(String)>
	//   90  213:athrow          
		}
		if(j != 0)
			flag = true;
		else
			flag = false;
		  goto _L3
		jsonreader.endArray();
	//   91  214:aload_1         
	//   92  215:invokevirtual   #102 <Method void JsonReader.endArray()>
		return bitset;
	//   93  218:aload           6
	//   94  220:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (BitSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #39  <Class BitSet>
	//    4    6:invokevirtual   #107 <Method void write(JsonWriter, BitSet)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, BitSet bitset)
		throws IOException
	{
		if(bitset == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		jsonwriter.beginArray();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #115 <Method JsonWriter JsonWriter.beginArray()>
	//    8   14:pop             
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		while(i < bitset.length()) 
	//*  11   17:iload_3         
	//*  12   18:aload_2         
	//*  13   19:invokevirtual   #118 <Method int BitSet.length()>
	//*  14   22:icmpge          57
		{
			int j;
			if(bitset.get(i))
	//*  15   25:aload_2         
	//*  16   26:iload_3         
	//*  17   27:invokevirtual   #122 <Method boolean BitSet.get(int)>
	//*  18   30:ifeq            51
				j = 1;
	//   19   33:iconst_1        
	//   20   34:istore          4
			else
	//*  21   36:aload_1         
	//*  22   37:iload           4
	//*  23   39:i2l             
	//*  24   40:invokevirtual   #126 <Method JsonWriter JsonWriter.value(long)>
	//*  25   43:pop             
	//*  26   44:iload_3         
	//*  27   45:iconst_1        
	//*  28   46:iadd            
	//*  29   47:istore_3        
	//*  30   48:goto            17
				j = 0;
	//   31   51:iconst_0        
	//   32   52:istore          4
			jsonwriter.value(j);
			i++;
		}
	//*  33   54:goto            36
		jsonwriter.endArray();
	//   34   57:aload_1         
	//   35   58:invokevirtual   #128 <Method JsonWriter JsonWriter.endArray()>
	//   36   61:pop             
	//   37   62:return          
	}

	TypeAdapters$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
