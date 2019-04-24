// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			Easing

static class Easing$1
{

	static final int $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[];

	static 
	{
		$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption = new int[singOption.values().length];
	//    0    0:invokestatic    #18  <Method Easing$EasingOption[] Easing$EasingOption.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.Linear.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//    5   12:getstatic       #24  <Field Easing$EasingOption Easing$EasingOption.Linear>
	//    6   15:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  10   23:getstatic       #31  <Field Easing$EasingOption Easing$EasingOption.EaseInQuad>
	//*  11   26:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  15   34:getstatic       #34  <Field Easing$EasingOption Easing$EasingOption.EaseOutQuad>
	//*  16   37:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  20   45:getstatic       #37  <Field Easing$EasingOption Easing$EasingOption.EaseInOutQuad>
	//*  21   48:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  25   56:getstatic       #40  <Field Easing$EasingOption Easing$EasingOption.EaseInCubic>
	//*  26   59:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  30   67:getstatic       #43  <Field Easing$EasingOption Easing$EasingOption.EaseOutCubic>
	//*  31   70:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  35   79:getstatic       #46  <Field Easing$EasingOption Easing$EasingOption.EaseInOutCubic>
	//*  36   82:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  40   91:getstatic       #49  <Field Easing$EasingOption Easing$EasingOption.EaseInQuart>
	//*  41   94:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  45  103:getstatic       #52  <Field Easing$EasingOption Easing$EasingOption.EaseOutQuart>
	//*  46  106:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  50  115:getstatic       #55  <Field Easing$EasingOption Easing$EasingOption.EaseInOutQuart>
	//*  51  118:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  55  127:getstatic       #58  <Field Easing$EasingOption Easing$EasingOption.EaseInSine>
	//*  56  130:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  57  133:bipush          11
	//*  58  135:iastore         
	//*  59  136:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  60  139:getstatic       #61  <Field Easing$EasingOption Easing$EasingOption.EaseOutSine>
	//*  61  142:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  62  145:bipush          12
	//*  63  147:iastore         
	//*  64  148:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  65  151:getstatic       #64  <Field Easing$EasingOption Easing$EasingOption.EaseInOutSine>
	//*  66  154:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  67  157:bipush          13
	//*  68  159:iastore         
	//*  69  160:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  70  163:getstatic       #67  <Field Easing$EasingOption Easing$EasingOption.EaseInExpo>
	//*  71  166:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  72  169:bipush          14
	//*  73  171:iastore         
	//*  74  172:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  75  175:getstatic       #70  <Field Easing$EasingOption Easing$EasingOption.EaseOutExpo>
	//*  76  178:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  77  181:bipush          15
	//*  78  183:iastore         
	//*  79  184:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  80  187:getstatic       #73  <Field Easing$EasingOption Easing$EasingOption.EaseInOutExpo>
	//*  81  190:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  82  193:bipush          16
	//*  83  195:iastore         
	//*  84  196:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  85  199:getstatic       #76  <Field Easing$EasingOption Easing$EasingOption.EaseInCirc>
	//*  86  202:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  87  205:bipush          17
	//*  88  207:iastore         
	//*  89  208:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  90  211:getstatic       #79  <Field Easing$EasingOption Easing$EasingOption.EaseOutCirc>
	//*  91  214:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  92  217:bipush          18
	//*  93  219:iastore         
	//*  94  220:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//*  95  223:getstatic       #82  <Field Easing$EasingOption Easing$EasingOption.EaseInOutCirc>
	//*  96  226:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//*  97  229:bipush          19
	//*  98  231:iastore         
	//*  99  232:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 100  235:getstatic       #85  <Field Easing$EasingOption Easing$EasingOption.EaseInElastic>
	//* 101  238:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 102  241:bipush          20
	//* 103  243:iastore         
	//* 104  244:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 105  247:getstatic       #88  <Field Easing$EasingOption Easing$EasingOption.EaseOutElastic>
	//* 106  250:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 107  253:bipush          21
	//* 108  255:iastore         
	//* 109  256:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 110  259:getstatic       #91  <Field Easing$EasingOption Easing$EasingOption.EaseInOutElastic>
	//* 111  262:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 112  265:bipush          22
	//* 113  267:iastore         
	//* 114  268:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 115  271:getstatic       #94  <Field Easing$EasingOption Easing$EasingOption.EaseInBack>
	//* 116  274:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 117  277:bipush          23
	//* 118  279:iastore         
	//* 119  280:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 120  283:getstatic       #97  <Field Easing$EasingOption Easing$EasingOption.EaseOutBack>
	//* 121  286:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 122  289:bipush          24
	//* 123  291:iastore         
	//* 124  292:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 125  295:getstatic       #100 <Field Easing$EasingOption Easing$EasingOption.EaseInOutBack>
	//* 126  298:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 127  301:bipush          25
	//* 128  303:iastore         
	//* 129  304:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 130  307:getstatic       #103 <Field Easing$EasingOption Easing$EasingOption.EaseInBounce>
	//* 131  310:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 132  313:bipush          26
	//* 133  315:iastore         
	//* 134  316:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 135  319:getstatic       #106 <Field Easing$EasingOption Easing$EasingOption.EaseOutBounce>
	//* 136  322:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 137  325:bipush          27
	//* 138  327:iastore         
	//* 139  328:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption>
	//* 140  331:getstatic       #109 <Field Easing$EasingOption Easing$EasingOption.EaseInOutBounce>
	//* 141  334:invokevirtual   #28  <Method int Easing$EasingOption.ordinal()>
	//* 142  337:bipush          28
	//* 143  339:iastore         
	//* 144  340:return          
	//* 145  341:astore_0        
	//* 146  342:return          
	//* 147  343:astore_0        
	//* 148  344:goto            328
	//* 149  347:astore_0        
	//* 150  348:goto            316
	//* 151  351:astore_0        
	//* 152  352:goto            304
	//* 153  355:astore_0        
	//* 154  356:goto            292
	//* 155  359:astore_0        
	//* 156  360:goto            280
	//* 157  363:astore_0        
	//* 158  364:goto            268
	//* 159  367:astore_0        
	//* 160  368:goto            256
	//* 161  371:astore_0        
	//* 162  372:goto            244
	//* 163  375:astore_0        
	//* 164  376:goto            232
	//* 165  379:astore_0        
	//* 166  380:goto            220
	//* 167  383:astore_0        
	//* 168  384:goto            208
	//* 169  387:astore_0        
	//* 170  388:goto            196
	//* 171  391:astore_0        
	//* 172  392:goto            184
	//* 173  395:astore_0        
	//* 174  396:goto            172
	//* 175  399:astore_0        
	//* 176  400:goto            160
	//* 177  403:astore_0        
	//* 178  404:goto            148
	//* 179  407:astore_0        
	//* 180  408:goto            136
	//* 181  411:astore_0        
	//* 182  412:goto            124
	//* 183  415:astore_0        
	//* 184  416:goto            112
	//* 185  419:astore_0        
	//* 186  420:goto            100
	//* 187  423:astore_0        
	//* 188  424:goto            88
	//* 189  427:astore_0        
	//* 190  428:goto            76
	//* 191  431:astore_0        
	//* 192  432:goto            64
	//* 193  435:astore_0        
	//* 194  436:goto            53
	//* 195  439:astore_0        
	//* 196  440:goto            42
	//* 197  443:astore_0        
	//* 198  444:goto            31
		catch(NoSuchFieldError nosuchfielderror27) { }
	//  199  447:astore_0        
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInQuad.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror26) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutQuad.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror25) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutQuad.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror24) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInCubic.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror23) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutCubic.ordinal()] = 6;
		}
		catch(NoSuchFieldError nosuchfielderror22) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutCubic.ordinal()] = 7;
		}
		catch(NoSuchFieldError nosuchfielderror21) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInQuart.ordinal()] = 8;
		}
		catch(NoSuchFieldError nosuchfielderror20) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutQuart.ordinal()] = 9;
		}
		catch(NoSuchFieldError nosuchfielderror19) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutQuart.ordinal()] = 10;
		}
		catch(NoSuchFieldError nosuchfielderror18) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInSine.ordinal()] = 11;
		}
		catch(NoSuchFieldError nosuchfielderror17) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutSine.ordinal()] = 12;
		}
		catch(NoSuchFieldError nosuchfielderror16) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutSine.ordinal()] = 13;
		}
		catch(NoSuchFieldError nosuchfielderror15) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInExpo.ordinal()] = 14;
		}
		catch(NoSuchFieldError nosuchfielderror14) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutExpo.ordinal()] = 15;
		}
		catch(NoSuchFieldError nosuchfielderror13) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutExpo.ordinal()] = 16;
		}
		catch(NoSuchFieldError nosuchfielderror12) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInCirc.ordinal()] = 17;
		}
		catch(NoSuchFieldError nosuchfielderror11) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutCirc.ordinal()] = 18;
		}
		catch(NoSuchFieldError nosuchfielderror10) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutCirc.ordinal()] = 19;
		}
		catch(NoSuchFieldError nosuchfielderror9) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInElastic.ordinal()] = 20;
		}
		catch(NoSuchFieldError nosuchfielderror8) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutElastic.ordinal()] = 21;
		}
		catch(NoSuchFieldError nosuchfielderror7) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutElastic.ordinal()] = 22;
		}
		catch(NoSuchFieldError nosuchfielderror6) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInBack.ordinal()] = 23;
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutBack.ordinal()] = 24;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutBack.ordinal()] = 25;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInBounce.ordinal()] = 26;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseOutBounce.ordinal()] = 27;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption[singOption.EaseInOutBounce.ordinal()] = 28;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//* 200  448:goto            20
	}
}
