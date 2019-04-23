// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.daasuu.ei;


// Referenced classes of package com.daasuu.ei:
//			EasingProvider, Ease

static class EasingProvider$1
{

	static final int $SwitchMap$com$daasuu$ei$Ease[];

	static 
	{
		$SwitchMap$com$daasuu$ei$Ease = new int[Ease.values().length];
	//    0    0:invokestatic    #18  <Method Ease[] Ease.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.LINEAR.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//    5   12:getstatic       #24  <Field Ease Ease.LINEAR>
	//    6   15:invokevirtual   #28  <Method int Ease.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  10   23:getstatic       #31  <Field Ease Ease.QUAD_IN>
	//*  11   26:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  15   34:getstatic       #34  <Field Ease Ease.QUAD_OUT>
	//*  16   37:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  20   45:getstatic       #37  <Field Ease Ease.QUAD_IN_OUT>
	//*  21   48:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  25   56:getstatic       #40  <Field Ease Ease.CUBIC_IN>
	//*  26   59:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  30   67:getstatic       #43  <Field Ease Ease.CUBIC_OUT>
	//*  31   70:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  35   79:getstatic       #46  <Field Ease Ease.CUBIC_IN_OUT>
	//*  36   82:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  40   91:getstatic       #49  <Field Ease Ease.QUART_IN>
	//*  41   94:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  45  103:getstatic       #52  <Field Ease Ease.QUART_OUT>
	//*  46  106:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  50  115:getstatic       #55  <Field Ease Ease.QUART_IN_OUT>
	//*  51  118:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  55  127:getstatic       #58  <Field Ease Ease.QUINT_IN>
	//*  56  130:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  57  133:bipush          11
	//*  58  135:iastore         
	//*  59  136:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  60  139:getstatic       #61  <Field Ease Ease.QUINT_OUT>
	//*  61  142:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  62  145:bipush          12
	//*  63  147:iastore         
	//*  64  148:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  65  151:getstatic       #64  <Field Ease Ease.QUINT_IN_OUT>
	//*  66  154:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  67  157:bipush          13
	//*  68  159:iastore         
	//*  69  160:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  70  163:getstatic       #67  <Field Ease Ease.SINE_IN>
	//*  71  166:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  72  169:bipush          14
	//*  73  171:iastore         
	//*  74  172:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  75  175:getstatic       #70  <Field Ease Ease.SINE_OUT>
	//*  76  178:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  77  181:bipush          15
	//*  78  183:iastore         
	//*  79  184:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  80  187:getstatic       #73  <Field Ease Ease.SINE_IN_OUT>
	//*  81  190:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  82  193:bipush          16
	//*  83  195:iastore         
	//*  84  196:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  85  199:getstatic       #76  <Field Ease Ease.BACK_IN>
	//*  86  202:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  87  205:bipush          17
	//*  88  207:iastore         
	//*  89  208:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  90  211:getstatic       #79  <Field Ease Ease.BACK_OUT>
	//*  91  214:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  92  217:bipush          18
	//*  93  219:iastore         
	//*  94  220:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//*  95  223:getstatic       #82  <Field Ease Ease.BACK_IN_OUT>
	//*  96  226:invokevirtual   #28  <Method int Ease.ordinal()>
	//*  97  229:bipush          19
	//*  98  231:iastore         
	//*  99  232:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 100  235:getstatic       #85  <Field Ease Ease.CIRC_IN>
	//* 101  238:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 102  241:bipush          20
	//* 103  243:iastore         
	//* 104  244:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 105  247:getstatic       #88  <Field Ease Ease.CIRC_OUT>
	//* 106  250:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 107  253:bipush          21
	//* 108  255:iastore         
	//* 109  256:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 110  259:getstatic       #91  <Field Ease Ease.CIRC_IN_OUT>
	//* 111  262:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 112  265:bipush          22
	//* 113  267:iastore         
	//* 114  268:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 115  271:getstatic       #94  <Field Ease Ease.BOUNCE_IN>
	//* 116  274:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 117  277:bipush          23
	//* 118  279:iastore         
	//* 119  280:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 120  283:getstatic       #97  <Field Ease Ease.BOUNCE_OUT>
	//* 121  286:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 122  289:bipush          24
	//* 123  291:iastore         
	//* 124  292:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 125  295:getstatic       #100 <Field Ease Ease.BOUNCE_IN_OUT>
	//* 126  298:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 127  301:bipush          25
	//* 128  303:iastore         
	//* 129  304:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 130  307:getstatic       #103 <Field Ease Ease.ELASTIC_IN>
	//* 131  310:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 132  313:bipush          26
	//* 133  315:iastore         
	//* 134  316:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 135  319:getstatic       #106 <Field Ease Ease.ELASTIC_OUT>
	//* 136  322:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 137  325:bipush          27
	//* 138  327:iastore         
	//* 139  328:getstatic       #20  <Field int[] $SwitchMap$com$daasuu$ei$Ease>
	//* 140  331:getstatic       #109 <Field Ease Ease.ELASTIC_IN_OUT>
	//* 141  334:invokevirtual   #28  <Method int Ease.ordinal()>
	//* 142  337:bipush          28
	//* 143  339:iastore         
	//* 144  340:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//  145  341:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUAD_IN.ordinal()] = 2;
		}
	//* 146  342:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//  147  345:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUAD_OUT.ordinal()] = 3;
		}
	//* 148  346:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//  149  349:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUAD_IN_OUT.ordinal()] = 4;
		}
	//* 150  350:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  151  353:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.CUBIC_IN.ordinal()] = 5;
		}
	//* 152  354:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  153  357:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.CUBIC_OUT.ordinal()] = 6;
		}
	//* 154  358:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  155  361:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.CUBIC_IN_OUT.ordinal()] = 7;
		}
	//* 156  362:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  157  365:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUART_IN.ordinal()] = 8;
		}
	//* 158  366:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  159  369:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUART_OUT.ordinal()] = 9;
		}
	//* 160  370:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  161  373:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUART_IN_OUT.ordinal()] = 10;
		}
	//* 162  374:goto            112
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  163  377:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUINT_IN.ordinal()] = 11;
		}
	//* 164  378:goto            124
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  165  381:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUINT_OUT.ordinal()] = 12;
		}
	//* 166  382:goto            136
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  167  385:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.QUINT_IN_OUT.ordinal()] = 13;
		}
	//* 168  386:goto            148
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  169  389:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.SINE_IN.ordinal()] = 14;
		}
	//* 170  390:goto            160
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  171  393:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.SINE_OUT.ordinal()] = 15;
		}
	//* 172  394:goto            172
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  173  397:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.SINE_IN_OUT.ordinal()] = 16;
		}
	//* 174  398:goto            184
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  175  401:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.BACK_IN.ordinal()] = 17;
		}
	//* 176  402:goto            196
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  177  405:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.BACK_OUT.ordinal()] = 18;
		}
	//* 178  406:goto            208
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  179  409:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.BACK_IN_OUT.ordinal()] = 19;
		}
	//* 180  410:goto            220
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  181  413:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.CIRC_IN.ordinal()] = 20;
		}
	//* 182  414:goto            232
		catch(NoSuchFieldError nosuchfielderror19) { }
	//  183  417:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.CIRC_OUT.ordinal()] = 21;
		}
	//* 184  418:goto            244
		catch(NoSuchFieldError nosuchfielderror20) { }
	//  185  421:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.CIRC_IN_OUT.ordinal()] = 22;
		}
	//* 186  422:goto            256
		catch(NoSuchFieldError nosuchfielderror21) { }
	//  187  425:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.BOUNCE_IN.ordinal()] = 23;
		}
	//* 188  426:goto            268
		catch(NoSuchFieldError nosuchfielderror22) { }
	//  189  429:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.BOUNCE_OUT.ordinal()] = 24;
		}
	//* 190  430:goto            280
		catch(NoSuchFieldError nosuchfielderror23) { }
	//  191  433:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.BOUNCE_IN_OUT.ordinal()] = 25;
		}
	//* 192  434:goto            292
		catch(NoSuchFieldError nosuchfielderror24) { }
	//  193  437:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.ELASTIC_IN.ordinal()] = 26;
		}
	//* 194  438:goto            304
		catch(NoSuchFieldError nosuchfielderror25) { }
	//  195  441:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.ELASTIC_OUT.ordinal()] = 27;
		}
	//* 196  442:goto            316
		catch(NoSuchFieldError nosuchfielderror26) { }
	//  197  445:astore_0        
		try
		{
			$SwitchMap$com$daasuu$ei$Ease[Ease.ELASTIC_IN_OUT.ordinal()] = 28;
		}
	//* 198  446:goto            328
		catch(NoSuchFieldError nosuchfielderror27) { }
	//  199  449:astore_0        
	//* 200  450:return          
	}
}
