// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype;


// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//			TypeSerializer

static class TypeSerializer$1
{

	static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = new int[com.fasterxml.jackson.annotation.JsonTypeInfo.As.values().length];
	//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As[] com.fasterxml.jackson.annotation.JsonTypeInfo$As.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXISTING_PROPERTY>
	//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
	//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_ARRAY>
	//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  25   56:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_OBJECT>
	//*  26   59:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   30   65:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
		}
	//*  31   66:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   32   69:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
		}
	//*  33   70:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   34   73:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
		}
	//*  35   74:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   36   77:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
		}
	//*  37   78:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   81:astore_0        
	//*  39   82:return          
	}
}
