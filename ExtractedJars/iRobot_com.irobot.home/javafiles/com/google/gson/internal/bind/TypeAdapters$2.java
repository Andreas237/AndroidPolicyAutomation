// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.util.BitSet;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$2 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #17  <Method BitSet read(JsonReader)>
	//    3    5:areturn         
	}

	public BitSet read(JsonReader jsonreader)
	{
		int i;
		Object obj;
		BitSet bitset;
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #31  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #34  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		bitset = new BitSet();
	//    8   16:new             #36  <Class BitSet>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void BitSet()>
	//   11   23:astore          6
		jsonreader.beginArray();
	//   12   25:aload_1         
	//   13   26:invokevirtual   #40  <Method void JsonReader.beginArray()>
		obj = ((Object) (jsonreader.peek()));
	//   14   29:aload_1         
	//   15   30:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
	//   16   33:astore          5
		i = 0;
	//   17   35:iconst_0        
	//   18   36:istore_2        
_L9:
		if(obj == JsonToken.END_ARRAY) goto _L2; else goto _L1
	//   19   37:aload           5
	//   20   39:getstatic       #43  <Field JsonToken JsonToken.END_ARRAY>
	//   21   42:if_acmpeq       217
_L1:
		int j;
		boolean flag;
		j = ..SwitchMap.com.google.gson.stream.JsonToken[((JsonToken) (obj)).ordinal()];
	//   22   45:getstatic       #49  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
	//   23   48:aload           5
	//   24   50:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//   25   53:iaload          
	//   26   54:istore_3        
		flag = true;
	//   27   55:iconst_1        
	//   28   56:istore          4
		j;
	//   29   58:iload_3         
		JVM INSTR tableswitch 1 3: default 84
	//	               1 186
	//	               2 177
	//	               3 118;
	//   30   59:tableswitch     1 3: default 84
	//	               1 186
	//	               2 177
	//	               3 118
		   goto _L3 _L4 _L5 _L6
_L3:
		jsonreader = ((JsonReader) (new StringBuilder()));
	//   31   84:new             #55  <Class StringBuilder>
	//   32   87:dup             
	//   33   88:invokespecial   #56  <Method void StringBuilder()>
	//   34   91:astore_1        
		((StringBuilder) (jsonreader)).append("Invalid bitset value type: ");
	//   35   92:aload_1         
	//   36   93:ldc1            #58  <String "Invalid bitset value type: ">
	//   37   95:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   38   98:pop             
		((StringBuilder) (jsonreader)).append(obj);
	//   39   99:aload_1         
	//   40  100:aload           5
	//   41  102:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   42  105:pop             
		throw new JsonSyntaxException(((StringBuilder) (jsonreader)).toString());
	//   43  106:new             #67  <Class JsonSyntaxException>
	//   44  109:dup             
	//   45  110:aload_1         
	//   46  111:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   47  114:invokespecial   #74  <Method void JsonSyntaxException(String)>
	//   48  117:athrow          
_L6:
		obj = ((Object) (jsonreader.nextString()));
	//   49  118:aload_1         
	//   50  119:invokevirtual   #77  <Method String JsonReader.nextString()>
	//   51  122:astore          5
		int k;
		try
		{
			k = Integer.parseInt(((String) (obj)));
	//   52  124:aload           5
	//   53  126:invokestatic    #83  <Method int Integer.parseInt(String)>
	//   54  129:istore_3        
		}
	//*  55  130:iload_3         
	//*  56  131:ifeq            137
	//*  57  134:goto            193
	//*  58  137:iconst_0        
	//*  59  138:istore          4
	//*  60  140:goto            193
	//*  61  143:new             #55  <Class StringBuilder>
	//*  62  146:dup             
	//*  63  147:invokespecial   #56  <Method void StringBuilder()>
	//*  64  150:astore_1        
	//*  65  151:aload_1         
	//*  66  152:ldc1            #85  <String "Error: Expecting: bitset number value (1, 0), Found: ">
	//*  67  154:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  68  157:pop             
	//*  69  158:aload_1         
	//*  70  159:aload           5
	//*  71  161:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  72  164:pop             
	//*  73  165:new             #67  <Class JsonSyntaxException>
	//*  74  168:dup             
	//*  75  169:aload_1         
	//*  76  170:invokevirtual   #71  <Method String StringBuilder.toString()>
	//*  77  173:invokespecial   #74  <Method void JsonSyntaxException(String)>
	//*  78  176:athrow          
	//*  79  177:aload_1         
	//*  80  178:invokevirtual   #89  <Method boolean JsonReader.nextBoolean()>
	//*  81  181:istore          4
	//*  82  183:goto            193
	//*  83  186:aload_1         
	//*  84  187:invokevirtual   #92  <Method int JsonReader.nextInt()>
	//*  85  190:ifeq            137
	//*  86  193:iload           4
	//*  87  195:ifeq            204
	//*  88  198:aload           6
	//*  89  200:iload_2         
	//*  90  201:invokevirtual   #96  <Method void BitSet.set(int)>
	//*  91  204:iload_2         
	//*  92  205:iconst_1        
	//*  93  206:iadd            
	//*  94  207:istore_2        
	//*  95  208:aload_1         
	//*  96  209:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
	//*  97  212:astore          5
	//*  98  214:goto            37
	//*  99  217:aload_1         
	//* 100  218:invokevirtual   #99  <Method void JsonReader.endArray()>
	//* 101  221:aload           6
	//* 102  223:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonReader jsonreader)
		{
			jsonreader = ((JsonReader) (new StringBuilder()));
			((StringBuilder) (jsonreader)).append("Error: Expecting: bitset number value (1, 0), Found: ");
			((StringBuilder) (jsonreader)).append(((String) (obj)));
			throw new JsonSyntaxException(((StringBuilder) (jsonreader)).toString());
		}
		if(k == 0) goto _L8; else goto _L7
_L8:
		flag = false;
		break; /* Loop/switch isn't completed */
_L5:
		flag = jsonreader.nextBoolean();
		break; /* Loop/switch isn't completed */
_L4:
		if(jsonreader.nextInt() == 0) goto _L8; else goto _L7
_L7:
		if(flag)
			bitset.set(i);
		i++;
		obj = ((Object) (jsonreader.peek()));
		  goto _L9
_L2:
		jsonreader.endArray();
		return bitset;
	//* 103  224:astore_1        
	//* 104  225:goto            143
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (BitSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #36  <Class BitSet>
	//    4    6:invokevirtual   #104 <Method void write(JsonWriter, BitSet)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, BitSet bitset)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #106 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #108 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #111 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	TypeAdapters$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
