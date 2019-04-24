// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static class TypeAdapters$32
{

	static final int $SwitchMap$com$google$gson$stream$JsonToken[];

	static 
	{
		$SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];
	//    0    0:invokestatic    #18  <Method JsonToken[] JsonToken.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//    5   12:getstatic       #24  <Field JsonToken JsonToken.NUMBER>
	//    6   15:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  10   23:getstatic       #31  <Field JsonToken JsonToken.BOOLEAN>
	//*  11   26:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  15   34:getstatic       #34  <Field JsonToken JsonToken.STRING>
	//*  16   37:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  20   45:getstatic       #37  <Field JsonToken JsonToken.NULL>
	//*  21   48:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  25   56:getstatic       #40  <Field JsonToken JsonToken.BEGIN_ARRAY>
	//*  26   59:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  30   67:getstatic       #43  <Field JsonToken JsonToken.BEGIN_OBJECT>
	//*  31   70:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  35   79:getstatic       #46  <Field JsonToken JsonToken.END_DOCUMENT>
	//*  36   82:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  40   91:getstatic       #49  <Field JsonToken JsonToken.NAME>
	//*  41   94:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  45  103:getstatic       #52  <Field JsonToken JsonToken.END_OBJECT>
	//*  46  106:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  50  115:getstatic       #55  <Field JsonToken JsonToken.END_ARRAY>
	//*  51  118:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   55  125:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
		}
	//*  56  126:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   57  129:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
		}
	//*  58  130:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   59  133:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
		}
	//*  60  134:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   61  137:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
		}
	//*  62  138:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   63  141:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
		}
	//*  64  142:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   65  145:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
		}
	//*  66  146:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   67  149:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
		}
	//*  68  150:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   69  153:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
		}
	//*  70  154:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   71  157:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
		}
	//*  72  158:goto            112
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   73  161:astore_0        
	//*  74  162:return          
	}
}
