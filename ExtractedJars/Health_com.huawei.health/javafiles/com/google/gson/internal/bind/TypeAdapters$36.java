// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static class TypeAdapters$36
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
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   12   27:getstatic       #31  <Field JsonToken JsonToken.BOOLEAN>
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
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
	//   25   54:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   26   57:getstatic       #37  <Field JsonToken JsonToken.NULL>
	//   27   60:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
		}
	//*  30   65:goto            69
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   68:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
	//   32   69:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   33   72:getstatic       #40  <Field JsonToken JsonToken.BEGIN_ARRAY>
	//   34   75:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   35   78:iconst_5        
	//   36   79:iastore         
		}
	//*  37   80:goto            84
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   83:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
	//   39   84:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   40   87:getstatic       #43  <Field JsonToken JsonToken.BEGIN_OBJECT>
	//   41   90:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   42   93:bipush          6
	//   43   95:iastore         
		}
	//*  44   96:goto            100
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   99:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
	//   46  100:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   47  103:getstatic       #46  <Field JsonToken JsonToken.END_DOCUMENT>
	//   48  106:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   49  109:bipush          7
	//   50  111:iastore         
		}
	//*  51  112:goto            116
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   52  115:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
	//   53  116:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   54  119:getstatic       #49  <Field JsonToken JsonToken.NAME>
	//   55  122:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   56  125:bipush          8
	//   57  127:iastore         
		}
	//*  58  128:goto            132
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   59  131:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
	//   60  132:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   61  135:getstatic       #52  <Field JsonToken JsonToken.END_OBJECT>
	//   62  138:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   63  141:bipush          9
	//   64  143:iastore         
		}
	//*  65  144:goto            148
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   66  147:astore_0        
		try
		{
			$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
	//   67  148:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
	//   68  151:getstatic       #55  <Field JsonToken JsonToken.END_ARRAY>
	//   69  154:invokevirtual   #28  <Method int JsonToken.ordinal()>
	//   70  157:bipush          10
	//   71  159:iastore         
	//   72  160:return          
		}
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   73  161:astore_0        
	//*  74  162:return          
	}
}
