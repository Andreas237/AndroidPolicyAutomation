// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.PropertyAccessor;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			VisibilityChecker

static class VisibilityChecker$1
{

	static final int $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = new int[PropertyAccessor.values().length];
	//    0    0:invokestatic    #18  <Method PropertyAccessor[] PropertyAccessor.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.GETTER.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//    5   12:getstatic       #24  <Field PropertyAccessor PropertyAccessor.GETTER>
	//    6   15:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  10   23:getstatic       #31  <Field PropertyAccessor PropertyAccessor.SETTER>
	//*  11   26:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  15   34:getstatic       #34  <Field PropertyAccessor PropertyAccessor.CREATOR>
	//*  16   37:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  20   45:getstatic       #37  <Field PropertyAccessor PropertyAccessor.FIELD>
	//*  21   48:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  25   56:getstatic       #40  <Field PropertyAccessor PropertyAccessor.IS_GETTER>
	//*  26   59:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  30   67:getstatic       #43  <Field PropertyAccessor PropertyAccessor.ALL>
	//*  31   70:invokevirtual   #28  <Method int PropertyAccessor.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:return          
	//*  35   77:astore_0        
	//*  36   78:return          
	//*  37   79:astore_0        
	//*  38   80:goto            64
	//*  39   83:astore_0        
	//*  40   84:goto            53
	//*  41   87:astore_0        
	//*  42   88:goto            42
	//*  43   91:astore_0        
	//*  44   92:goto            31
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   95:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.SETTER.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.CREATOR.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.FIELD.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.IS_GETTER.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.ALL.ordinal()] = 6;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  46   96:goto            20
	}
}
