// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;


// Referenced classes of package com.github.mikephil.charting.renderer:
//			ScatterChartRenderer

static class ScatterChartRenderer$1
{

	static final int $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[];

	static 
	{
		$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape = new int[com.github.mikephil.charting.charts.pe.values().length];
	//    0    0:invokestatic    #18  <Method com.github.mikephil.charting.charts.ScatterChart$ScatterShape[] com.github.mikephil.charting.charts.ScatterChart$ScatterShape.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
		try
		{
			$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.pe.SQUARE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
	//    5   12:getstatic       #24  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.SQUARE>
	//    6   15:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
	//*  10   23:getstatic       #31  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.CIRCLE>
	//*  11   26:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
	//*  15   34:getstatic       #34  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.TRIANGLE>
	//*  16   37:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
	//*  20   45:getstatic       #37  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.CROSS>
	//*  21   48:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape>
	//*  25   56:getstatic       #40  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.X>
	//*  26   59:invokevirtual   #28  <Method int com.github.mikephil.charting.charts.ScatterChart$ScatterShape.ordinal()>
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
			$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.pe.CIRCLE.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.pe.TRIANGLE.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.pe.CROSS.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.pe.X.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  39   80:goto            20
	}
}
