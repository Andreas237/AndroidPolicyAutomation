// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;


// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BasicSerializerFactory

static class BasicSerializerFactory$1
{

	static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];
	static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[com.fasterxml.jackson.annotation.JsonInclude.Include.values().length];
	//    0    0:invokestatic    #19  <Method com.fasterxml.jackson.annotation.JsonInclude$Include[] com.fasterxml.jackson.annotation.JsonInclude$Include.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//    5   12:getstatic       #25  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//    6   15:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  10   23:getstatic       #32  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
	//*  11   26:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:invokestatic    #37  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape[] com.fasterxml.jackson.annotation.JsonFormat$Shape.values()>
	//*  15   34:arraylength     
	//*  16   35:newarray        int[]
	//*  17   37:putstatic       #39  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  18   40:getstatic       #39  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  19   43:getstatic       #43  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
	//*  20   46:invokevirtual   #44  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  21   49:iconst_1        
	//*  22   50:iastore         
	//*  23   51:getstatic       #39  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  24   54:getstatic       #47  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
	//*  25   57:invokevirtual   #44  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  26   60:iconst_2        
	//*  27   61:iastore         
	//*  28   62:getstatic       #39  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  29   65:getstatic       #50  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
	//*  30   68:invokevirtual   #44  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  31   71:iconst_3        
	//*  32   72:iastore         
	//*  33   73:return          
	//*  34   74:astore_0        
	//*  35   75:return          
	//*  36   76:astore_0        
	//*  37   77:goto            62
	//*  38   80:astore_0        
	//*  39   81:goto            51
	//*  40   84:astore_0        
	//*  41   85:goto            31
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   88:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  43   89:goto            20
	}
}
