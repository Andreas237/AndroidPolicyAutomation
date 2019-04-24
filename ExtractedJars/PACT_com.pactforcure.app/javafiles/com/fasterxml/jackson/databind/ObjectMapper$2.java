// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectMapper

static class ObjectMapper$2
{

	static final int $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping = new int[faultTyping.values().length];
	//    0    0:invokestatic    #18  <Method ObjectMapper$DefaultTyping[] ObjectMapper$DefaultTyping.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
		try
		{
			$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[faultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
	//    5   12:getstatic       #24  <Field ObjectMapper$DefaultTyping ObjectMapper$DefaultTyping.NON_CONCRETE_AND_ARRAYS>
	//    6   15:invokevirtual   #28  <Method int ObjectMapper$DefaultTyping.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
	//*  10   23:getstatic       #31  <Field ObjectMapper$DefaultTyping ObjectMapper$DefaultTyping.OBJECT_AND_NON_CONCRETE>
	//*  11   26:invokevirtual   #28  <Method int ObjectMapper$DefaultTyping.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
	//*  15   34:getstatic       #34  <Field ObjectMapper$DefaultTyping ObjectMapper$DefaultTyping.NON_FINAL>
	//*  16   37:invokevirtual   #28  <Method int ObjectMapper$DefaultTyping.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
	//*  20   43:astore_0        
	//*  21   44:return          
	//*  22   45:astore_0        
	//*  23   46:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   49:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[faultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[faultTyping.NON_FINAL.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  25   50:goto            20
	}
}
