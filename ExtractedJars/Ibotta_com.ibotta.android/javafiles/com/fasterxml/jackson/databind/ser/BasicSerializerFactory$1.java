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
			$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//    5   12:getstatic       #25  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
	//    6   15:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  10   23:getstatic       #32  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_ABSENT>
	//*  11   26:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  15   34:getstatic       #35  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//*  16   37:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  20   45:getstatic       #38  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.CUSTOM>
	//*  21   48:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  25   56:getstatic       #41  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//*  26   59:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  30   67:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  31   70:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:invokestatic    #49  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape[] com.fasterxml.jackson.annotation.JsonFormat$Shape.values()>
	//*  35   79:arraylength     
	//*  36   80:newarray        int[]
	//*  37   82:putstatic       #51  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  38   85:getstatic       #51  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  39   88:getstatic       #55  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
	//*  40   91:invokevirtual   #56  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  41   94:iconst_1        
	//*  42   95:iastore         
	//*  43   96:getstatic       #51  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  44   99:getstatic       #59  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
	//*  45  102:invokevirtual   #56  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  46  105:iconst_2        
	//*  47  106:iastore         
	//*  48  107:getstatic       #51  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  49  110:getstatic       #62  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
	//*  50  113:invokevirtual   #56  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  51  116:iconst_3        
	//*  52  117:iastore         
	//*  53  118:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   54  119:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
		}
	//*  55  120:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   56  123:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
		}
	//*  57  124:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   58  127:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM.ordinal()] = 4;
		}
	//*  59  128:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   60  131:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL.ordinal()] = 5;
		}
	//*  61  132:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   62  135:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
		}
	//*  63  136:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   64  139:astore_0        
		$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
		}
	//*  65  140:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   66  143:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT.ordinal()] = 2;
		}
	//*  67  144:goto            96
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   68  147:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY.ordinal()] = 3;
		}
	//*  69  148:goto            107
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   70  151:astore_0        
	//*  71  152:return          
	}
}
