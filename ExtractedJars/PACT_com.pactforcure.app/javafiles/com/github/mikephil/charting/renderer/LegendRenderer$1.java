// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;


// Referenced classes of package com.github.mikephil.charting.renderer:
//			LegendRenderer

static class LegendRenderer$1
{

	static final int $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[];
	static final int $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[];

	static 
	{
		$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm = new int[com.github.mikephil.charting.components..values().length];
	//    0    0:invokestatic    #19  <Method com.github.mikephil.charting.components.Legend$LegendForm[] com.github.mikephil.charting.components.Legend$LegendForm.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[com.github.mikephil.charting.components..CIRCLE.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
	//    5   12:getstatic       #25  <Field com.github.mikephil.charting.components.Legend$LegendForm com.github.mikephil.charting.components.Legend$LegendForm.CIRCLE>
	//    6   15:invokevirtual   #29  <Method int com.github.mikephil.charting.components.Legend$LegendForm.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
	//*  10   23:getstatic       #32  <Field com.github.mikephil.charting.components.Legend$LegendForm com.github.mikephil.charting.components.Legend$LegendForm.SQUARE>
	//*  11   26:invokevirtual   #29  <Method int com.github.mikephil.charting.components.Legend$LegendForm.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
	//*  15   34:getstatic       #35  <Field com.github.mikephil.charting.components.Legend$LegendForm com.github.mikephil.charting.components.Legend$LegendForm.LINE>
	//*  16   37:invokevirtual   #29  <Method int com.github.mikephil.charting.components.Legend$LegendForm.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #40  <Method com.github.mikephil.charting.components.Legend$LegendPosition[] com.github.mikephil.charting.components.Legend$LegendPosition.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  23   51:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  24   54:getstatic       #46  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_LEFT>
	//*  25   57:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  29   65:getstatic       #50  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_RIGHT>
	//*  30   68:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  34   76:getstatic       #53  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_CENTER>
	//*  35   79:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  36   82:iconst_3        
	//*  37   83:iastore         
	//*  38   84:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  39   87:getstatic       #56  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_LEFT>
	//*  40   90:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  41   93:iconst_4        
	//*  42   94:iastore         
	//*  43   95:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  44   98:getstatic       #59  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_RIGHT>
	//*  45  101:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  46  104:iconst_5        
	//*  47  105:iastore         
	//*  48  106:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  49  109:getstatic       #62  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_CENTER>
	//*  50  112:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  51  115:bipush          6
	//*  52  117:iastore         
	//*  53  118:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  54  121:getstatic       #65  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.PIECHART_CENTER>
	//*  55  124:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  56  127:bipush          7
	//*  57  129:iastore         
	//*  58  130:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  59  133:getstatic       #68  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART>
	//*  60  136:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  61  139:bipush          8
	//*  62  141:iastore         
	//*  63  142:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  64  145:getstatic       #71  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_CENTER>
	//*  65  148:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  66  151:bipush          9
	//*  67  153:iastore         
	//*  68  154:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  69  157:getstatic       #74  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_INSIDE>
	//*  70  160:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  71  163:bipush          10
	//*  72  165:iastore         
	//*  73  166:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  74  169:getstatic       #77  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART>
	//*  75  172:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  76  175:bipush          11
	//*  77  177:iastore         
	//*  78  178:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  79  181:getstatic       #80  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART_CENTER>
	//*  80  184:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  81  187:bipush          12
	//*  82  189:iastore         
	//*  83  190:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//*  84  193:getstatic       #83  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART_INSIDE>
	//*  85  196:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//*  86  199:bipush          13
	//*  87  201:iastore         
	//*  88  202:return          
	//*  89  203:astore_0        
	//*  90  204:return          
	//*  91  205:astore_0        
	//*  92  206:goto            190
	//*  93  209:astore_0        
	//*  94  210:goto            178
	//*  95  213:astore_0        
	//*  96  214:goto            166
	//*  97  217:astore_0        
	//*  98  218:goto            154
	//*  99  221:astore_0        
	//* 100  222:goto            142
	//* 101  225:astore_0        
	//* 102  226:goto            130
	//* 103  229:astore_0        
	//* 104  230:goto            118
	//* 105  233:astore_0        
	//* 106  234:goto            106
	//* 107  237:astore_0        
	//* 108  238:goto            95
	//* 109  241:astore_0        
	//* 110  242:goto            84
	//* 111  245:astore_0        
	//* 112  246:goto            73
	//* 113  249:astore_0        
	//* 114  250:goto            62
	//* 115  253:astore_0        
	//* 116  254:goto            42
	//* 117  257:astore_0        
	//* 118  258:goto            31
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  119  261:astore_0        
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[com.github.mikephil.charting.components..SQUARE.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror14) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[com.github.mikephil.charting.components..LINE.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror13) { }
		$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition = new int[com.github.mikephil.charting.components.tion.values().length];
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.BELOW_CHART_LEFT.ordinal()] = 1;
		}
		catch(NoSuchFieldError nosuchfielderror12) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.BELOW_CHART_RIGHT.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror11) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.BELOW_CHART_CENTER.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror10) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.ABOVE_CHART_LEFT.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror9) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.ABOVE_CHART_RIGHT.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror8) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.ABOVE_CHART_CENTER.ordinal()] = 6;
		}
		catch(NoSuchFieldError nosuchfielderror7) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.PIECHART_CENTER.ordinal()] = 7;
		}
		catch(NoSuchFieldError nosuchfielderror6) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.RIGHT_OF_CHART.ordinal()] = 8;
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.RIGHT_OF_CHART_CENTER.ordinal()] = 9;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.RIGHT_OF_CHART_INSIDE.ordinal()] = 10;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.LEFT_OF_CHART.ordinal()] = 11;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.LEFT_OF_CHART_CENTER.ordinal()] = 12;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.tion.LEFT_OF_CHART_INSIDE.ordinal()] = 13;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//* 120  262:goto            20
	}
}
