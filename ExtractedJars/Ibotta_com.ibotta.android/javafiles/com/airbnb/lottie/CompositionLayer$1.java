// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			CompositionLayer

static class CompositionLayer$1
{

	static final int $SwitchMap$com$airbnb$lottie$Layer$MatteType[];

	static 
	{
		$SwitchMap$com$airbnb$lottie$Layer$MatteType = new int[Layer.MatteType.values().length];
	//    0    0:invokestatic    #18  <Method Layer$MatteType[] Layer$MatteType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$MatteType>
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$MatteType[Layer.MatteType.Add.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$MatteType>
	//    5   12:getstatic       #24  <Field Layer$MatteType Layer$MatteType.Add>
	//    6   15:invokevirtual   #28  <Method int Layer$MatteType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$MatteType>
	//*  10   23:getstatic       #31  <Field Layer$MatteType Layer$MatteType.Invert>
	//*  11   26:invokevirtual   #28  <Method int Layer$MatteType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$MatteType[Layer.MatteType.Invert.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
