// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.filter;


// Referenced classes of package com.github.mikephil.charting.data.filter:
//			Approximator

static class Approximator$1
{

	static final int $SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType[];

	static 
	{
		$SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType = new int[proximatorType.values().length];
	//    0    0:invokestatic    #18  <Method Approximator$ApproximatorType[] Approximator$ApproximatorType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType>
		try
		{
			$SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType[proximatorType.DOUGLAS_PEUCKER.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType>
	//    5   12:getstatic       #24  <Field Approximator$ApproximatorType Approximator$ApproximatorType.DOUGLAS_PEUCKER>
	//    6   15:invokevirtual   #28  <Method int Approximator$ApproximatorType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType>
	//*  10   23:getstatic       #31  <Field Approximator$ApproximatorType Approximator$ApproximatorType.NONE>
	//*  11   26:invokevirtual   #28  <Method int Approximator$ApproximatorType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
	//*  15   32:astore_0        
	//*  16   33:return          
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   34:astore_0        
		try
		{
			$SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType[proximatorType.NONE.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  18   35:goto            20
	}
}
