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
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   12   27:getstatic       #31  <Field JsonToken JsonToken.BEGIN_OBJECT>
	//   13   30:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
	//   18   39:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   19   42:getstatic       #34  <Field JsonToken JsonToken.STRING>
	//   20   45:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
		}
	//*  23   50:goto            54
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   53:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
	//   25   54:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   26   57:getstatic       #37  <Field JsonToken JsonToken.NUMBER>
	//   27   60:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
		}
	//*  30   65:goto            69
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   68:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
	//   32   69:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   33   72:getstatic       #40  <Field JsonToken JsonToken.BOOLEAN>
	//   34   75:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   35   78:iconst_5        
	//   36   79:iastore         
		}
	//*  37   80:goto            84
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   83:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
	//   39   84:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   40   87:getstatic       #43  <Field JsonToken JsonToken.NULL>
	//   41   90:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   42   93:bipush          6
	//   43   95:iastore         
	//   44   96:return          
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   97:astore_0        
	//*  46   98:return          
	}
}
