// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

// Referenced classes of package com.google.gson.internal.bind:
//			ObjectTypeAdapter

static class ObjectTypeAdapter$2
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
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//    5   12:getstatic       #24  <Field JsonToken JsonToken.BEGIN_ARRAY>
	//    6   15:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  10   23:getstatic       #31  <Field JsonToken JsonToken.BEGIN_OBJECT>
	//*  11   26:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  15   34:getstatic       #34  <Field JsonToken JsonToken.STRING>
	//*  16   37:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  20   45:getstatic       #37  <Field JsonToken JsonToken.NUMBER>
	//*  21   48:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  25   56:getstatic       #40  <Field JsonToken JsonToken.BOOLEAN>
	//*  26   59:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//*  30   67:getstatic       #43  <Field JsonToken JsonToken.NULL>
	//*  31   70:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   35   77:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
		}
	//*  36   78:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   37   81:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
		}
	//*  38   82:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   39   85:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
		}
	//*  40   86:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   41   89:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
		}
	//*  42   90:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   43   93:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
		}
	//*  44   94:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   97:astore_0        
	//*  46   98:return          
	}
}
