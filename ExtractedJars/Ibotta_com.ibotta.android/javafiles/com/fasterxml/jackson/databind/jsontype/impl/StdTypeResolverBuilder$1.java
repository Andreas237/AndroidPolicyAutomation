// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;


// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			StdTypeResolverBuilder

static class StdTypeResolverBuilder$1
{

	static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[];
	static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id = new int[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.values().length];
	//    0    0:invokestatic    #19  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$Id[] com.fasterxml.jackson.annotation.JsonTypeInfo$Id.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
	//    5   12:getstatic       #25  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.CLASS>
	//    6   15:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
	//*  10   23:getstatic       #32  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.MINIMAL_CLASS>
	//*  11   26:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
	//*  15   34:getstatic       #35  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NAME>
	//*  16   37:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
	//*  20   45:getstatic       #38  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NONE>
	//*  21   48:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id>
	//*  25   56:getstatic       #41  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.CUSTOM>
	//*  26   59:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$Id.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:invokestatic    #46  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As[] com.fasterxml.jackson.annotation.JsonTypeInfo$As.values()>
	//*  30   67:arraylength     
	//*  31   68:newarray        int[]
	//*  32   70:putstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  33   73:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  34   76:getstatic       #52  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_ARRAY>
	//*  35   79:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  36   82:iconst_1        
	//*  37   83:iastore         
	//*  38   84:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  39   87:getstatic       #56  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
	//*  40   90:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  41   93:iconst_2        
	//*  42   94:iastore         
	//*  43   95:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  44   98:getstatic       #59  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_OBJECT>
	//*  45  101:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  46  104:iconst_3        
	//*  47  105:iastore         
	//*  48  106:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  49  109:getstatic       #62  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//*  50  112:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  51  115:iconst_4        
	//*  52  116:iastore         
	//*  53  117:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As>
	//*  54  120:getstatic       #65  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXISTING_PROPERTY>
	//*  55  123:invokevirtual   #53  <Method int com.fasterxml.jackson.annotation.JsonTypeInfo$As.ordinal()>
	//*  56  126:iconst_5        
	//*  57  127:iastore         
	//*  58  128:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   59  129:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 2;
		}
	//*  60  130:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   61  133:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME.ordinal()] = 3;
		}
	//*  62  134:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   63  137:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE.ordinal()] = 4;
		}
	//*  64  138:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   65  141:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CUSTOM.ordinal()] = 5;
		}
	//*  66  142:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   67  145:astore_0        
		$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = new int[com.fasterxml.jackson.annotation.JsonTypeInfo.As.values().length];
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
		}
	//*  68  146:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   69  149:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
		}
	//*  70  150:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   71  153:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
		}
	//*  72  154:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   73  157:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
		}
	//*  74  158:goto            106
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   75  161:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
		}
	//*  76  162:goto            117
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   77  165:astore_0        
	//*  78  166:return          
	}
}
