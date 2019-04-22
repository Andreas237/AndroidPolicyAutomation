// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;


// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			BeanSerializerBase

static class BeanSerializerBase$1
{

	static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
	//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape[] com.fasterxml.jackson.annotation.JsonFormat$Shape.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
	//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.NUMBER>
	//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.NUMBER_INT>
	//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
