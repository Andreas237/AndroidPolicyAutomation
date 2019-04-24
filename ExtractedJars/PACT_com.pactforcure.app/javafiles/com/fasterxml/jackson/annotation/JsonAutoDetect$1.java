// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonAutoDetect

static class JsonAutoDetect$1
{

	static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility = new int[sibility.values().length];
	//    0    0:invokestatic    #18  <Method JsonAutoDetect$Visibility[] JsonAutoDetect$Visibility.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.ANY.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//    5   12:getstatic       #24  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.ANY>
	//    6   15:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  10   23:getstatic       #31  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.NONE>
	//*  11   26:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  15   34:getstatic       #34  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.NON_PRIVATE>
	//*  16   37:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  20   45:getstatic       #37  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PROTECTED_AND_PUBLIC>
	//*  21   48:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  25   56:getstatic       #40  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//*  26   59:invokevirtual   #28  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:return          
	//*  30   65:astore_0        
	//*  31   66:return          
	//*  32   67:astore_0        
	//*  33   68:goto            53
	//*  34   71:astore_0        
	//*  35   72:goto            42
	//*  36   75:astore_0        
	//*  37   76:goto            31
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   79:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.NONE.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.NON_PRIVATE.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.PUBLIC_ONLY.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  39   80:goto            20
	}
}
