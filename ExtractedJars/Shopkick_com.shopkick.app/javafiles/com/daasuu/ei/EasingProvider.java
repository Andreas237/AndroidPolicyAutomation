// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.daasuu.ei;


// Referenced classes of package com.daasuu.ei:
//			Ease

class EasingProvider
{

	EasingProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static float get(Ease ease, float f)
	{
		static class _cls1
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

		switch(_cls1..SwitchMap.com.daasuu.ei.Ease[ease.ordinal()])
	//*   0    0:getstatic       #18  <Field int[] EasingProvider$1.$SwitchMap$com$daasuu$ei$Ease>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #24  <Method int Ease.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 28: default 136
	//	               1 476
	//	               2 468
	//	               3 460
	//	               4 452
	//	               5 444
	//	               6 436
	//	               7 428
	//	               8 420
	//	               9 412
	//	               10 404
	//	               11 396
	//	               12 388
	//	               13 380
	//	               14 363
	//	               15 348
	//	               16 331
	//	               17 314
	//	               18 291
	//	               19 284
	//	               20 270
	//	               21 255
	//	               22 207
	//	               23 202
	//	               24 197
	//	               25 165
	//	               26 156
	//	               27 147
	//	               28 138
		default:
			return f;
	//    5  136:fload_1         
	//    6  137:freturn         

		case 28: // '\034'
			return getElasticInOut(f, 1.0D, 0.45000000000000001D);
	//    7  138:fload_1         
	//    8  139:dconst_1        
	//    9  140:ldc2w           #25  <Double 0.45000000000000001D>
	//   10  143:invokestatic    #30  <Method float getElasticInOut(float, double, double)>
	//   11  146:freturn         

		case 27: // '\033'
			return getElasticOut(f, 1.0D, 0.29999999999999999D);
	//   12  147:fload_1         
	//   13  148:dconst_1        
	//   14  149:ldc2w           #31  <Double 0.29999999999999999D>
	//   15  152:invokestatic    #35  <Method float getElasticOut(float, double, double)>
	//   16  155:freturn         

		case 26: // '\032'
			return getElasticIn(f, 1.0D, 0.29999999999999999D);
	//   17  156:fload_1         
	//   18  157:dconst_1        
	//   19  158:ldc2w           #31  <Double 0.29999999999999999D>
	//   20  161:invokestatic    #38  <Method float getElasticIn(float, double, double)>
	//   21  164:freturn         

		case 25: // '\031'
			if(f < 0.5F)
	//*  22  165:fload_1         
	//*  23  166:ldc1            #39  <Float 0.5F>
	//*  24  168:fcmpg           
	//*  25  169:ifge            182
				return getBounceIn(f * 2.0F) * 0.5F;
	//   26  172:fload_1         
	//   27  173:fconst_2        
	//   28  174:fmul            
	//   29  175:invokestatic    #43  <Method float getBounceIn(float)>
	//   30  178:ldc1            #39  <Float 0.5F>
	//   31  180:fmul            
	//   32  181:freturn         
			else
				return getBounceOut(f * 2.0F - 1.0F) * 0.5F + 0.5F;
	//   33  182:fload_1         
	//   34  183:fconst_2        
	//   35  184:fmul            
	//   36  185:fconst_1        
	//   37  186:fsub            
	//   38  187:invokestatic    #46  <Method float getBounceOut(float)>
	//   39  190:ldc1            #39  <Float 0.5F>
	//   40  192:fmul            
	//   41  193:ldc1            #39  <Float 0.5F>
	//   42  195:fadd            
	//   43  196:freturn         

		case 24: // '\030'
			return getBounceOut(f);
	//   44  197:fload_1         
	//   45  198:invokestatic    #46  <Method float getBounceOut(float)>
	//   46  201:freturn         

		case 23: // '\027'
			return getBounceIn(f);
	//   47  202:fload_1         
	//   48  203:invokestatic    #43  <Method float getBounceIn(float)>
	//   49  206:freturn         

		case 22: // '\026'
			f *= 2.0F;
	//   50  207:fload_1         
	//   51  208:fconst_2        
	//   52  209:fmul            
	//   53  210:fstore_1        
			if(f < 1.0F)
	//*  54  211:fload_1         
	//*  55  212:fconst_1        
	//*  56  213:fcmpg           
	//*  57  214:ifge            234
			{
				return (float)((Math.sqrt(1.0F - f * f) - 1.0D) * -0.5D);
	//   58  217:fconst_1        
	//   59  218:fload_1         
	//   60  219:fload_1         
	//   61  220:fmul            
	//   62  221:fsub            
	//   63  222:f2d             
	//   64  223:invokestatic    #52  <Method double Math.sqrt(double)>
	//   65  226:dconst_1        
	//   66  227:dsub            
	//   67  228:ldc2w           #53  <Double -0.5D>
	//   68  231:dmul            
	//   69  232:d2f             
	//   70  233:freturn         
			} else
			{
				f -= 2.0F;
	//   71  234:fload_1         
	//   72  235:fconst_2        
	//   73  236:fsub            
	//   74  237:fstore_1        
				return (float)((Math.sqrt(1.0F - f * f) + 1.0D) * 0.5D);
	//   75  238:fconst_1        
	//   76  239:fload_1         
	//   77  240:fload_1         
	//   78  241:fmul            
	//   79  242:fsub            
	//   80  243:f2d             
	//   81  244:invokestatic    #52  <Method double Math.sqrt(double)>
	//   82  247:dconst_1        
	//   83  248:dadd            
	//   84  249:ldc2w           #55  <Double 0.5D>
	//   85  252:dmul            
	//   86  253:d2f             
	//   87  254:freturn         
			}

		case 21: // '\025'
			f--;
	//   88  255:fload_1         
	//   89  256:fconst_1        
	//   90  257:fsub            
	//   91  258:fstore_1        
			return (float)Math.sqrt(1.0F - f * f);
	//   92  259:fconst_1        
	//   93  260:fload_1         
	//   94  261:fload_1         
	//   95  262:fmul            
	//   96  263:fsub            
	//   97  264:f2d             
	//   98  265:invokestatic    #52  <Method double Math.sqrt(double)>
	//   99  268:d2f             
	//  100  269:freturn         

		case 20: // '\024'
			return (float)(-(Math.sqrt(1.0F - f * f) - 1.0D));
	//  101  270:fconst_1        
	//  102  271:fload_1         
	//  103  272:fload_1         
	//  104  273:fmul            
	//  105  274:fsub            
	//  106  275:f2d             
	//  107  276:invokestatic    #52  <Method double Math.sqrt(double)>
	//  108  279:dconst_1        
	//  109  280:dsub            
	//  110  281:dneg            
	//  111  282:d2f             
	//  112  283:freturn         

		case 19: // '\023'
			return getBackInOut(f, 1.7F);
	//  113  284:fload_1         
	//  114  285:ldc1            #57  <Float 1.7F>
	//  115  287:invokestatic    #61  <Method float getBackInOut(float, float)>
	//  116  290:freturn         

		case 18: // '\022'
			f--;
	//  117  291:fload_1         
	//  118  292:fconst_1        
	//  119  293:fsub            
	//  120  294:fstore_1        
			return (float)((double)(f * f) * ((double)f * 2.7000000000000002D + 1.7D) + 1.0D);
	//  121  295:fload_1         
	//  122  296:fload_1         
	//  123  297:fmul            
	//  124  298:f2d             
	//  125  299:fload_1         
	//  126  300:f2d             
	//  127  301:ldc2w           #62  <Double 2.7000000000000002D>
	//  128  304:dmul            
	//  129  305:ldc2w           #64  <Double 1.7D>
	//  130  308:dadd            
	//  131  309:dmul            
	//  132  310:dconst_1        
	//  133  311:dadd            
	//  134  312:d2f             
	//  135  313:freturn         

		case 17: // '\021'
			return (float)((double)(f * f) * ((double)f * 2.7000000000000002D - 1.7D));
	//  136  314:fload_1         
	//  137  315:fload_1         
	//  138  316:fmul            
	//  139  317:f2d             
	//  140  318:fload_1         
	//  141  319:f2d             
	//  142  320:ldc2w           #62  <Double 2.7000000000000002D>
	//  143  323:dmul            
	//  144  324:ldc2w           #64  <Double 1.7D>
	//  145  327:dsub            
	//  146  328:dmul            
	//  147  329:d2f             
	//  148  330:freturn         

		case 16: // '\020'
			return (float)((Math.cos((double)f * 3.1415926535897931D) - 1.0D) * -0.5D);
	//  149  331:fload_1         
	//  150  332:f2d             
	//  151  333:ldc2w           #66  <Double 3.1415926535897931D>
	//  152  336:dmul            
	//  153  337:invokestatic    #70  <Method double Math.cos(double)>
	//  154  340:dconst_1        
	//  155  341:dsub            
	//  156  342:ldc2w           #53  <Double -0.5D>
	//  157  345:dmul            
	//  158  346:d2f             
	//  159  347:freturn         

		case 15: // '\017'
			return (float)Math.sin(((double)f * 3.1415926535897931D) / 2D);
	//  160  348:fload_1         
	//  161  349:f2d             
	//  162  350:ldc2w           #66  <Double 3.1415926535897931D>
	//  163  353:dmul            
	//  164  354:ldc2w           #71  <Double 2D>
	//  165  357:ddiv            
	//  166  358:invokestatic    #75  <Method double Math.sin(double)>
	//  167  361:d2f             
	//  168  362:freturn         

		case 14: // '\016'
			return (float)(1.0D - Math.cos(((double)f * 3.1415926535897931D) / 2D));
	//  169  363:dconst_1        
	//  170  364:fload_1         
	//  171  365:f2d             
	//  172  366:ldc2w           #66  <Double 3.1415926535897931D>
	//  173  369:dmul            
	//  174  370:ldc2w           #71  <Double 2D>
	//  175  373:ddiv            
	//  176  374:invokestatic    #70  <Method double Math.cos(double)>
	//  177  377:dsub            
	//  178  378:d2f             
	//  179  379:freturn         

		case 13: // '\r'
			return getPowInOut(f, 5D);
	//  180  380:fload_1         
	//  181  381:ldc2w           #76  <Double 5D>
	//  182  384:invokestatic    #81  <Method float getPowInOut(float, double)>
	//  183  387:freturn         

		case 12: // '\f'
			return getPowOut(f, 5D);
	//  184  388:fload_1         
	//  185  389:ldc2w           #76  <Double 5D>
	//  186  392:invokestatic    #84  <Method float getPowOut(float, double)>
	//  187  395:freturn         

		case 11: // '\013'
			return getPowIn(f, 5D);
	//  188  396:fload_1         
	//  189  397:ldc2w           #76  <Double 5D>
	//  190  400:invokestatic    #87  <Method float getPowIn(float, double)>
	//  191  403:freturn         

		case 10: // '\n'
			return getPowInOut(f, 4D);
	//  192  404:fload_1         
	//  193  405:ldc2w           #88  <Double 4D>
	//  194  408:invokestatic    #81  <Method float getPowInOut(float, double)>
	//  195  411:freturn         

		case 9: // '\t'
			return getPowOut(f, 4D);
	//  196  412:fload_1         
	//  197  413:ldc2w           #88  <Double 4D>
	//  198  416:invokestatic    #84  <Method float getPowOut(float, double)>
	//  199  419:freturn         

		case 8: // '\b'
			return getPowIn(f, 4D);
	//  200  420:fload_1         
	//  201  421:ldc2w           #88  <Double 4D>
	//  202  424:invokestatic    #87  <Method float getPowIn(float, double)>
	//  203  427:freturn         

		case 7: // '\007'
			return getPowInOut(f, 3D);
	//  204  428:fload_1         
	//  205  429:ldc2w           #90  <Double 3D>
	//  206  432:invokestatic    #81  <Method float getPowInOut(float, double)>
	//  207  435:freturn         

		case 6: // '\006'
			return getPowOut(f, 3D);
	//  208  436:fload_1         
	//  209  437:ldc2w           #90  <Double 3D>
	//  210  440:invokestatic    #84  <Method float getPowOut(float, double)>
	//  211  443:freturn         

		case 5: // '\005'
			return getPowIn(f, 3D);
	//  212  444:fload_1         
	//  213  445:ldc2w           #90  <Double 3D>
	//  214  448:invokestatic    #87  <Method float getPowIn(float, double)>
	//  215  451:freturn         

		case 4: // '\004'
			return getPowInOut(f, 2D);
	//  216  452:fload_1         
	//  217  453:ldc2w           #71  <Double 2D>
	//  218  456:invokestatic    #81  <Method float getPowInOut(float, double)>
	//  219  459:freturn         

		case 3: // '\003'
			return getPowOut(f, 2D);
	//  220  460:fload_1         
	//  221  461:ldc2w           #71  <Double 2D>
	//  222  464:invokestatic    #84  <Method float getPowOut(float, double)>
	//  223  467:freturn         

		case 2: // '\002'
			return getPowIn(f, 2D);
	//  224  468:fload_1         
	//  225  469:ldc2w           #71  <Double 2D>
	//  226  472:invokestatic    #87  <Method float getPowIn(float, double)>
	//  227  475:freturn         

		case 1: // '\001'
			return f;
	//  228  476:fload_1         
	//  229  477:freturn         
		}
	}

	private static float getBackInOut(float f, float f1)
	{
		f1 = (float)((double)f1 * 1.5249999999999999D);
	//    0    0:fload_1         
	//    1    1:f2d             
	//    2    2:ldc2w           #93  <Double 1.5249999999999999D>
	//    3    5:dmul            
	//    4    6:d2f             
	//    5    7:fstore_1        
		f *= 2.0F;
	//    6    8:fload_0         
	//    7    9:fconst_2        
	//    8   10:fmul            
	//    9   11:fstore_0        
		if(f < 1.0F)
	//*  10   12:fload_0         
	//*  11   13:fconst_1        
	//*  12   14:fcmpg           
	//*  13   15:ifge            36
		{
			return (float)((double)(f * f * ((1.0F + f1) * f - f1)) * 0.5D);
	//   14   18:fload_0         
	//   15   19:fload_0         
	//   16   20:fmul            
	//   17   21:fconst_1        
	//   18   22:fload_1         
	//   19   23:fadd            
	//   20   24:fload_0         
	//   21   25:fmul            
	//   22   26:fload_1         
	//   23   27:fsub            
	//   24   28:fmul            
	//   25   29:f2d             
	//   26   30:ldc2w           #55  <Double 0.5D>
	//   27   33:dmul            
	//   28   34:d2f             
	//   29   35:freturn         
		} else
		{
			f -= 2.0F;
	//   30   36:fload_0         
	//   31   37:fconst_2        
	//   32   38:fsub            
	//   33   39:fstore_0        
			return (float)((double)(f * f * ((1.0F + f1) * f + f1) + 2.0F) * 0.5D);
	//   34   40:fload_0         
	//   35   41:fload_0         
	//   36   42:fmul            
	//   37   43:fconst_1        
	//   38   44:fload_1         
	//   39   45:fadd            
	//   40   46:fload_0         
	//   41   47:fmul            
	//   42   48:fload_1         
	//   43   49:fadd            
	//   44   50:fmul            
	//   45   51:fconst_2        
	//   46   52:fadd            
	//   47   53:f2d             
	//   48   54:ldc2w           #55  <Double 0.5D>
	//   49   57:dmul            
	//   50   58:d2f             
	//   51   59:freturn         
		}
	}

	private static float getBounceIn(float f)
	{
		return 1.0F - getBounceOut(1.0F - f);
	//    0    0:fconst_1        
	//    1    1:fconst_1        
	//    2    2:fload_0         
	//    3    3:fsub            
	//    4    4:invokestatic    #46  <Method float getBounceOut(float)>
	//    5    7:fsub            
	//    6    8:freturn         
	}

	private static float getBounceOut(float f)
	{
		double d = f;
	//    0    0:fload_0         
	//    1    1:f2d             
	//    2    2:dstore_1        
		if(d < 0.36363636363636365D)
	//*   3    3:dload_1         
	//*   4    4:ldc2w           #95  <Double 0.36363636363636365D>
	//*   5    7:dcmpg           
	//*   6    8:ifge            20
			return (float)(7.5625D * d * d);
	//    7   11:ldc2w           #97  <Double 7.5625D>
	//    8   14:dload_1         
	//    9   15:dmul            
	//   10   16:dload_1         
	//   11   17:dmul            
	//   12   18:d2f             
	//   13   19:freturn         
		if(d < 0.72727272727272729D)
	//*  14   20:dload_1         
	//*  15   21:ldc2w           #99  <Double 0.72727272727272729D>
	//*  16   24:dcmpg           
	//*  17   25:ifge            49
		{
			d = (float)(d - 0.54545454545454541D);
	//   18   28:dload_1         
	//   19   29:ldc2w           #101 <Double 0.54545454545454541D>
	//   20   32:dsub            
	//   21   33:d2f             
	//   22   34:f2d             
	//   23   35:dstore_1        
			return (float)(7.5625D * d * d + 0.75D);
	//   24   36:ldc2w           #97  <Double 7.5625D>
	//   25   39:dload_1         
	//   26   40:dmul            
	//   27   41:dload_1         
	//   28   42:dmul            
	//   29   43:ldc2w           #103 <Double 0.75D>
	//   30   46:dadd            
	//   31   47:d2f             
	//   32   48:freturn         
		}
		if(d < 0.90909090909090906D)
	//*  33   49:dload_1         
	//*  34   50:ldc2w           #105 <Double 0.90909090909090906D>
	//*  35   53:dcmpg           
	//*  36   54:ifge            78
		{
			d = (float)(d - 0.81818181818181823D);
	//   37   57:dload_1         
	//   38   58:ldc2w           #107 <Double 0.81818181818181823D>
	//   39   61:dsub            
	//   40   62:d2f             
	//   41   63:f2d             
	//   42   64:dstore_1        
			return (float)(7.5625D * d * d + 0.9375D);
	//   43   65:ldc2w           #97  <Double 7.5625D>
	//   44   68:dload_1         
	//   45   69:dmul            
	//   46   70:dload_1         
	//   47   71:dmul            
	//   48   72:ldc2w           #109 <Double 0.9375D>
	//   49   75:dadd            
	//   50   76:d2f             
	//   51   77:freturn         
		} else
		{
			d = (float)(d - 0.95454545454545459D);
	//   52   78:dload_1         
	//   53   79:ldc2w           #111 <Double 0.95454545454545459D>
	//   54   82:dsub            
	//   55   83:d2f             
	//   56   84:f2d             
	//   57   85:dstore_1        
			return (float)(7.5625D * d * d + 0.984375D);
	//   58   86:ldc2w           #97  <Double 7.5625D>
	//   59   89:dload_1         
	//   60   90:dmul            
	//   61   91:dload_1         
	//   62   92:dmul            
	//   63   93:ldc2w           #113 <Double 0.984375D>
	//   64   96:dadd            
	//   65   97:d2f             
	//   66   98:freturn         
		}
	}

	private static float getElasticIn(float f, double d, double d1)
	{
		if(f != 0.0F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            67
		{
			if(f == 1.0F)
	//*   4    6:fload_0         
	//*   5    7:fconst_1        
	//*   6    8:fcmpl           
	//*   7    9:ifne            14
			{
				return f;
	//    8   12:fload_0         
	//    9   13:freturn         
			} else
			{
				double d2 = d1 / 6.2831853071795862D;
	//   10   14:dload_3         
	//   11   15:ldc2w           #115 <Double 6.2831853071795862D>
	//   12   18:ddiv            
	//   13   19:dstore          5
				double d3 = Math.asin(1.0D / d);
	//   14   21:dconst_1        
	//   15   22:dload_1         
	//   16   23:ddiv            
	//   17   24:invokestatic    #119 <Method double Math.asin(double)>
	//   18   27:dstore          7
				f--;
	//   19   29:fload_0         
	//   20   30:fconst_1        
	//   21   31:fsub            
	//   22   32:fstore_0        
				return (float)(-(d * Math.pow(2D, 10F * f) * Math.sin((((double)f - d2 * d3) * 6.2831853071795862D) / d1)));
	//   23   33:dload_1         
	//   24   34:ldc2w           #71  <Double 2D>
	//   25   37:ldc1            #120 <Float 10F>
	//   26   39:fload_0         
	//   27   40:fmul            
	//   28   41:f2d             
	//   29   42:invokestatic    #124 <Method double Math.pow(double, double)>
	//   30   45:dmul            
	//   31   46:fload_0         
	//   32   47:f2d             
	//   33   48:dload           5
	//   34   50:dload           7
	//   35   52:dmul            
	//   36   53:dsub            
	//   37   54:ldc2w           #115 <Double 6.2831853071795862D>
	//   38   57:dmul            
	//   39   58:dload_3         
	//   40   59:ddiv            
	//   41   60:invokestatic    #75  <Method double Math.sin(double)>
	//   42   63:dmul            
	//   43   64:dneg            
	//   44   65:d2f             
	//   45   66:freturn         
			}
		} else
		{
			return f;
	//   46   67:fload_0         
	//   47   68:freturn         
		}
	}

	private static float getElasticInOut(float f, double d, double d1)
	{
		double d2 = (d1 / 6.2831853071795862D) * Math.asin(1.0D / d);
	//    0    0:dload_3         
	//    1    1:ldc2w           #115 <Double 6.2831853071795862D>
	//    2    4:ddiv            
	//    3    5:dconst_1        
	//    4    6:dload_1         
	//    5    7:ddiv            
	//    6    8:invokestatic    #119 <Method double Math.asin(double)>
	//    7   11:dmul            
	//    8   12:dstore          5
		f *= 2.0F;
	//    9   14:fload_0         
	//   10   15:fconst_2        
	//   11   16:fmul            
	//   12   17:fstore_0        
		if(f < 1.0F)
	//*  13   18:fload_0         
	//*  14   19:fconst_1        
	//*  15   20:fcmpg           
	//*  16   21:ifge            62
		{
			f--;
	//   17   24:fload_0         
	//   18   25:fconst_1        
	//   19   26:fsub            
	//   20   27:fstore_0        
			return (float)(d * Math.pow(2D, 10F * f) * Math.sin((((double)f - d2) * 6.2831853071795862D) / d1) * -0.5D);
	//   21   28:dload_1         
	//   22   29:ldc2w           #71  <Double 2D>
	//   23   32:ldc1            #120 <Float 10F>
	//   24   34:fload_0         
	//   25   35:fmul            
	//   26   36:f2d             
	//   27   37:invokestatic    #124 <Method double Math.pow(double, double)>
	//   28   40:dmul            
	//   29   41:fload_0         
	//   30   42:f2d             
	//   31   43:dload           5
	//   32   45:dsub            
	//   33   46:ldc2w           #115 <Double 6.2831853071795862D>
	//   34   49:dmul            
	//   35   50:dload_3         
	//   36   51:ddiv            
	//   37   52:invokestatic    #75  <Method double Math.sin(double)>
	//   38   55:dmul            
	//   39   56:ldc2w           #53  <Double -0.5D>
	//   40   59:dmul            
	//   41   60:d2f             
	//   42   61:freturn         
		} else
		{
			f--;
	//   43   62:fload_0         
	//   44   63:fconst_1        
	//   45   64:fsub            
	//   46   65:fstore_0        
			return (float)(d * Math.pow(2D, -10F * f) * Math.sin((((double)f - d2) * 6.2831853071795862D) / d1) * 0.5D + 1.0D);
	//   47   66:dload_1         
	//   48   67:ldc2w           #71  <Double 2D>
	//   49   70:ldc1            #125 <Float -10F>
	//   50   72:fload_0         
	//   51   73:fmul            
	//   52   74:f2d             
	//   53   75:invokestatic    #124 <Method double Math.pow(double, double)>
	//   54   78:dmul            
	//   55   79:fload_0         
	//   56   80:f2d             
	//   57   81:dload           5
	//   58   83:dsub            
	//   59   84:ldc2w           #115 <Double 6.2831853071795862D>
	//   60   87:dmul            
	//   61   88:dload_3         
	//   62   89:ddiv            
	//   63   90:invokestatic    #75  <Method double Math.sin(double)>
	//   64   93:dmul            
	//   65   94:ldc2w           #55  <Double 0.5D>
	//   66   97:dmul            
	//   67   98:dconst_1        
	//   68   99:dadd            
	//   69  100:d2f             
	//   70  101:freturn         
		}
	}

	private static float getElasticOut(float f, double d, double d1)
	{
		if(f != 0.0F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            64
		{
			if(f == 1.0F)
	//*   4    6:fload_0         
	//*   5    7:fconst_1        
	//*   6    8:fcmpl           
	//*   7    9:ifne            14
			{
				return f;
	//    8   12:fload_0         
	//    9   13:freturn         
			} else
			{
				double d2 = d1 / 6.2831853071795862D;
	//   10   14:dload_3         
	//   11   15:ldc2w           #115 <Double 6.2831853071795862D>
	//   12   18:ddiv            
	//   13   19:dstore          5
				double d3 = Math.asin(1.0D / d);
	//   14   21:dconst_1        
	//   15   22:dload_1         
	//   16   23:ddiv            
	//   17   24:invokestatic    #119 <Method double Math.asin(double)>
	//   18   27:dstore          7
				return (float)(d * Math.pow(2D, -10F * f) * Math.sin((((double)f - d2 * d3) * 6.2831853071795862D) / d1) + 1.0D);
	//   19   29:dload_1         
	//   20   30:ldc2w           #71  <Double 2D>
	//   21   33:ldc1            #125 <Float -10F>
	//   22   35:fload_0         
	//   23   36:fmul            
	//   24   37:f2d             
	//   25   38:invokestatic    #124 <Method double Math.pow(double, double)>
	//   26   41:dmul            
	//   27   42:fload_0         
	//   28   43:f2d             
	//   29   44:dload           5
	//   30   46:dload           7
	//   31   48:dmul            
	//   32   49:dsub            
	//   33   50:ldc2w           #115 <Double 6.2831853071795862D>
	//   34   53:dmul            
	//   35   54:dload_3         
	//   36   55:ddiv            
	//   37   56:invokestatic    #75  <Method double Math.sin(double)>
	//   38   59:dmul            
	//   39   60:dconst_1        
	//   40   61:dadd            
	//   41   62:d2f             
	//   42   63:freturn         
			}
		} else
		{
			return f;
	//   43   64:fload_0         
	//   44   65:freturn         
		}
	}

	private static float getPowIn(float f, double d)
	{
		return (float)Math.pow(f, d);
	//    0    0:fload_0         
	//    1    1:f2d             
	//    2    2:dload_1         
	//    3    3:invokestatic    #124 <Method double Math.pow(double, double)>
	//    4    6:d2f             
	//    5    7:freturn         
	}

	private static float getPowInOut(float f, double d)
	{
		f *= 2.0F;
	//    0    0:fload_0         
	//    1    1:fconst_2        
	//    2    2:fmul            
	//    3    3:fstore_0        
		if(f < 1.0F)
	//*   4    4:fload_0         
	//*   5    5:fconst_1        
	//*   6    6:fcmpg           
	//*   7    7:ifge            22
			return (float)(Math.pow(f, d) * 0.5D);
	//    8   10:fload_0         
	//    9   11:f2d             
	//   10   12:dload_1         
	//   11   13:invokestatic    #124 <Method double Math.pow(double, double)>
	//   12   16:ldc2w           #55  <Double 0.5D>
	//   13   19:dmul            
	//   14   20:d2f             
	//   15   21:freturn         
		else
			return (float)(1.0D - Math.abs(Math.pow(2.0F - f, d)) * 0.5D);
	//   16   22:dconst_1        
	//   17   23:fconst_2        
	//   18   24:fload_0         
	//   19   25:fsub            
	//   20   26:f2d             
	//   21   27:dload_1         
	//   22   28:invokestatic    #124 <Method double Math.pow(double, double)>
	//   23   31:invokestatic    #128 <Method double Math.abs(double)>
	//   24   34:ldc2w           #55  <Double 0.5D>
	//   25   37:dmul            
	//   26   38:dsub            
	//   27   39:d2f             
	//   28   40:freturn         
	}

	private static float getPowOut(float f, double d)
	{
		return (float)(1.0D - Math.pow(1.0F - f, d));
	//    0    0:dconst_1        
	//    1    1:fconst_1        
	//    2    2:fload_0         
	//    3    3:fsub            
	//    4    4:f2d             
	//    5    5:dload_1         
	//    6    6:invokestatic    #124 <Method double Math.pow(double, double)>
	//    7    9:dsub            
	//    8   10:d2f             
	//    9   11:freturn         
	}
}
