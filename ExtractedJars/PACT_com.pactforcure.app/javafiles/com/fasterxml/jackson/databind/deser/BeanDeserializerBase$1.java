// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;


// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			BeanDeserializerBase

static class BeanDeserializerBase$1
{

	static final int $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[com.fasterxml.jackson.core.JsonParser.NumberType.values().length];
	//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.core.JsonParser$NumberType[] com.fasterxml.jackson.core.JsonParser$NumberType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.INT.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//    5   12:getstatic       #24  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
	//*  15   32:astore_0        
	//*  16   33:return          
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   34:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  18   35:goto            20
	}
}
