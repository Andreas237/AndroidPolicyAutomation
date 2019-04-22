// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			TokenBuffer

static class TokenBuffer$1
{

	static final int $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[];
	static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[com.fasterxml.jackson.core.berType.values().length];
	//    0    0:invokestatic    #19  <Method com.fasterxml.jackson.core.JsonParser$NumberType[] com.fasterxml.jackson.core.JsonParser$NumberType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.berType.INT.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//    5   12:getstatic       #25  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//    6   15:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  10   23:getstatic       #32  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//*  11   26:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  15   34:getstatic       #35  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//*  16   37:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  20   45:getstatic       #38  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
	//*  21   48:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  25   56:getstatic       #41  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//*  26   59:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:invokestatic    #46  <Method JsonToken[] JsonToken.values()>
	//*  30   67:arraylength     
	//*  31   68:newarray        int[]
	//*  32   70:putstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  33   73:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  34   76:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
	//*  35   79:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  36   82:iconst_1        
	//*  37   83:iastore         
	//*  38   84:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  39   87:getstatic       #56  <Field JsonToken JsonToken.END_OBJECT>
	//*  40   90:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  41   93:iconst_2        
	//*  42   94:iastore         
	//*  43   95:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  44   98:getstatic       #59  <Field JsonToken JsonToken.START_ARRAY>
	//*  45  101:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  46  104:iconst_3        
	//*  47  105:iastore         
	//*  48  106:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  49  109:getstatic       #62  <Field JsonToken JsonToken.END_ARRAY>
	//*  50  112:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  51  115:iconst_4        
	//*  52  116:iastore         
	//*  53  117:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  54  120:getstatic       #65  <Field JsonToken JsonToken.FIELD_NAME>
	//*  55  123:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  56  126:iconst_5        
	//*  57  127:iastore         
	//*  58  128:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  59  131:getstatic       #68  <Field JsonToken JsonToken.VALUE_STRING>
	//*  60  134:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  61  137:bipush          6
	//*  62  139:iastore         
	//*  63  140:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  64  143:getstatic       #71  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*  65  146:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  66  149:bipush          7
	//*  67  151:iastore         
	//*  68  152:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  69  155:getstatic       #74  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  70  158:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  71  161:bipush          8
	//*  72  163:iastore         
	//*  73  164:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  74  167:getstatic       #77  <Field JsonToken JsonToken.VALUE_TRUE>
	//*  75  170:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  76  173:bipush          9
	//*  77  175:iastore         
	//*  78  176:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  79  179:getstatic       #80  <Field JsonToken JsonToken.VALUE_FALSE>
	//*  80  182:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  81  185:bipush          10
	//*  82  187:iastore         
	//*  83  188:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  84  191:getstatic       #83  <Field JsonToken JsonToken.VALUE_NULL>
	//*  85  194:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  86  197:bipush          11
	//*  87  199:iastore         
	//*  88  200:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  89  203:getstatic       #86  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*  90  206:invokevirtual   #53  <Method int JsonToken.ordinal()>
	//*  91  209:bipush          12
	//*  92  211:iastore         
	//*  93  212:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   94  213:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.berType.BIG_INTEGER.ordinal()] = 2;
		}
	//*  95  214:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   96  217:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.berType.BIG_DECIMAL.ordinal()] = 3;
		}
	//*  97  218:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   98  221:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.berType.FLOAT.ordinal()] = 4;
		}
	//*  99  222:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  100  225:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.berType.LONG.ordinal()] = 5;
		}
	//* 101  226:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  102  229:astore_0        
		$SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
		}
	//* 103  230:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  104  233:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
		}
	//* 105  234:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  106  237:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
		}
	//* 107  238:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  108  241:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
		}
	//* 109  242:goto            106
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  110  245:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
		}
	//* 111  246:goto            117
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  112  249:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
		}
	//* 113  250:goto            128
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  114  253:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
		}
	//* 115  254:goto            140
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  116  257:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
		}
	//* 117  258:goto            152
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  118  261:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
		}
	//* 119  262:goto            164
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  120  265:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
		}
	//* 121  266:goto            176
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  122  269:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
		}
	//* 123  270:goto            188
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  124  273:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
		}
	//* 125  274:goto            200
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  126  277:astore_0        
	//* 127  278:return          
	}
}
