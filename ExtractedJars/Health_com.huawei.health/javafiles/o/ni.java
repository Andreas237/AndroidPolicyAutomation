// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Paint;

// Referenced classes of package o:
//			nl, lh, oc, oa, 
//			nv, nw

public abstract class ni extends nl
{

	public ni(oa oa1, nv nv1, lh lh1)
	{
		super(oa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void nl(oa)>
		e = nv1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field nv e>
		c = lh1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field lh c>
		if(l != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #26  <Field oa l>
	//*  11   19:ifnull          141
		{
			a = new Paint(1);
	//   12   22:aload_0         
	//   13   23:new             #28  <Class Paint>
	//   14   26:dup             
	//   15   27:iconst_1        
	//   16   28:invokespecial   #31  <Method void Paint(int)>
	//   17   31:putfield        #33  <Field Paint a>
			d = new Paint();
	//   18   34:aload_0         
	//   19   35:new             #28  <Class Paint>
	//   20   38:dup             
	//   21   39:invokespecial   #36  <Method void Paint()>
	//   22   42:putfield        #38  <Field Paint d>
			d.setColor(0xff888888);
	//   23   45:aload_0         
	//   24   46:getfield        #38  <Field Paint d>
	//   25   49:ldc1            #39  <Int 0xff888888>
	//   26   51:invokevirtual   #42  <Method void Paint.setColor(int)>
			d.setStrokeWidth(1.0F);
	//   27   54:aload_0         
	//   28   55:getfield        #38  <Field Paint d>
	//   29   58:fconst_1        
	//   30   59:invokevirtual   #46  <Method void Paint.setStrokeWidth(float)>
			d.setStyle(android.graphics.Paint.Style.STROKE);
	//   31   62:aload_0         
	//   32   63:getfield        #38  <Field Paint d>
	//   33   66:getstatic       #52  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   34   69:invokevirtual   #56  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			d.setAlpha(90);
	//   35   72:aload_0         
	//   36   73:getfield        #38  <Field Paint d>
	//   37   76:bipush          90
	//   38   78:invokevirtual   #59  <Method void Paint.setAlpha(int)>
			b = new Paint();
	//   39   81:aload_0         
	//   40   82:new             #28  <Class Paint>
	//   41   85:dup             
	//   42   86:invokespecial   #36  <Method void Paint()>
	//   43   89:putfield        #61  <Field Paint b>
			b.setColor(0xff000000);
	//   44   92:aload_0         
	//   45   93:getfield        #61  <Field Paint b>
	//   46   96:ldc1            #62  <Int 0xff000000>
	//   47   98:invokevirtual   #42  <Method void Paint.setColor(int)>
			b.setStrokeWidth(1.0F);
	//   48  101:aload_0         
	//   49  102:getfield        #61  <Field Paint b>
	//   50  105:fconst_1        
	//   51  106:invokevirtual   #46  <Method void Paint.setStrokeWidth(float)>
			b.setStyle(android.graphics.Paint.Style.STROKE);
	//   52  109:aload_0         
	//   53  110:getfield        #61  <Field Paint b>
	//   54  113:getstatic       #52  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   55  116:invokevirtual   #56  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			h = new Paint(1);
	//   56  119:aload_0         
	//   57  120:new             #28  <Class Paint>
	//   58  123:dup             
	//   59  124:iconst_1        
	//   60  125:invokespecial   #31  <Method void Paint(int)>
	//   61  128:putfield        #64  <Field Paint h>
			h.setStyle(android.graphics.Paint.Style.STROKE);
	//   62  131:aload_0         
	//   63  132:getfield        #64  <Field Paint h>
	//   64  135:getstatic       #52  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   65  138:invokevirtual   #56  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		}
	//   66  141:return          
	}

	protected void d(float f, float f1)
	{
		int j = c.f();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field lh c>
	//    2    4:invokevirtual   #72  <Method int lh.f()>
	//    3    7:istore          12
		double d4 = Math.abs(f1 - f);
	//    4    9:fload_2         
	//    5   10:fload_1         
	//    6   11:fsub            
	//    7   12:invokestatic    #78  <Method float Math.abs(float)>
	//    8   15:f2d             
	//    9   16:dstore          7
		if(j == 0 || d4 <= 0.0D || Double.isInfinite(d4))
	//*  10   18:iload           12
	//*  11   20:ifeq            38
	//*  12   23:dload           7
	//*  13   25:dconst_0        
	//*  14   26:dcmpg           
	//*  15   27:ifle            38
	//*  16   30:dload           7
	//*  17   32:invokestatic    #84  <Method boolean Double.isInfinite(double)>
	//*  18   35:ifeq            67
		{
			c.a = new float[0];
	//   19   38:aload_0         
	//   20   39:getfield        #22  <Field lh c>
	//   21   42:iconst_0        
	//   22   43:newarray        float[]
	//   23   45:putfield        #87  <Field float[] lh.a>
			c.c = new float[0];
	//   24   48:aload_0         
	//   25   49:getfield        #22  <Field lh c>
	//   26   52:iconst_0        
	//   27   53:newarray        float[]
	//   28   55:putfield        #89  <Field float[] lh.c>
			c.d = 0;
	//   29   58:aload_0         
	//   30   59:getfield        #22  <Field lh c>
	//   31   62:iconst_0        
	//   32   63:putfield        #92  <Field int lh.d>
			return;
	//   33   66:return          
		}
		double d3 = oc.e(d4 / (double)j);
	//   34   67:dload           7
	//   35   69:iload           12
	//   36   71:i2d             
	//   37   72:ddiv            
	//   38   73:invokestatic    #97  <Method float oc.e(double)>
	//   39   76:f2d             
	//   40   77:dstore          5
		double d1 = d3;
	//   41   79:dload           5
	//   42   81:dstore_3        
		if(c.m())
	//*  43   82:aload_0         
	//*  44   83:getfield        #22  <Field lh c>
	//*  45   86:invokevirtual   #101 <Method boolean lh.m()>
	//*  46   89:ifeq            121
			if(d3 < (double)c.p())
	//*  47   92:dload           5
	//*  48   94:aload_0         
	//*  49   95:getfield        #22  <Field lh c>
	//*  50   98:invokevirtual   #105 <Method float lh.p()>
	//*  51  101:f2d             
	//*  52  102:dcmpg           
	//*  53  103:ifge            118
				d1 = c.p();
	//   54  106:aload_0         
	//   55  107:getfield        #22  <Field lh c>
	//   56  110:invokevirtual   #105 <Method float lh.p()>
	//   57  113:f2d             
	//   58  114:dstore_3        
			else
	//*  59  115:goto            121
				d1 = d3;
	//   60  118:dload           5
	//   61  120:dstore_3        
		double d5 = oc.e(Math.pow(10D, (int)Math.log10(d1)));
	//   62  121:ldc2w           #106 <Double 10D>
	//   63  124:dload_3         
	//   64  125:invokestatic    #111 <Method double Math.log10(double)>
	//   65  128:d2i             
	//   66  129:i2d             
	//   67  130:invokestatic    #115 <Method double Math.pow(double, double)>
	//   68  133:invokestatic    #97  <Method float oc.e(double)>
	//   69  136:f2d             
	//   70  137:dstore          9
		d3 = d1;
	//   71  139:dload_3         
	//   72  140:dstore          5
		if((int)(d1 / d5) > 5)
	//*  73  142:dload_3         
	//*  74  143:dload           9
	//*  75  145:ddiv            
	//*  76  146:d2i             
	//*  77  147:iconst_5        
	//*  78  148:icmple          162
			d3 = Math.floor(10D * d5);
	//   79  151:ldc2w           #106 <Double 10D>
	//   80  154:dload           9
	//   81  156:dmul            
	//   82  157:invokestatic    #118 <Method double Math.floor(double)>
	//   83  160:dstore          5
		int i;
		if(c.b())
	//*  84  162:aload_0         
	//*  85  163:getfield        #22  <Field lh c>
	//*  86  166:invokevirtual   #120 <Method boolean lh.b()>
	//*  87  169:ifeq            178
			i = 1;
	//   88  172:iconst_1        
	//   89  173:istore          11
		else
	//*  90  175:goto            181
			i = 0;
	//   91  178:iconst_0        
	//   92  179:istore          11
		if(c.h())
	//*  93  181:aload_0         
	//*  94  182:getfield        #22  <Field lh c>
	//*  95  185:invokevirtual   #122 <Method boolean lh.h()>
	//*  96  188:ifeq            280
		{
			d4 = (float)d4 / (float)(j - 1);
	//   97  191:dload           7
	//   98  193:d2f             
	//   99  194:iload           12
	//  100  196:iconst_1        
	//  101  197:isub            
	//  102  198:i2f             
	//  103  199:fdiv            
	//  104  200:f2d             
	//  105  201:dstore          7
			c.d = j;
	//  106  203:aload_0         
	//  107  204:getfield        #22  <Field lh c>
	//  108  207:iload           12
	//  109  209:putfield        #92  <Field int lh.d>
			if(c.a.length < j)
	//* 110  212:aload_0         
	//* 111  213:getfield        #22  <Field lh c>
	//* 112  216:getfield        #87  <Field float[] lh.a>
	//* 113  219:arraylength     
	//* 114  220:iload           12
	//* 115  222:icmpge          236
				c.a = new float[j];
	//  116  225:aload_0         
	//  117  226:getfield        #22  <Field lh c>
	//  118  229:iload           12
	//  119  231:newarray        float[]
	//  120  233:putfield        #87  <Field float[] lh.a>
			for(i = 0; i < j; i++)
	//* 121  236:iconst_0        
	//* 122  237:istore          11
	//* 123  239:iload           11
	//* 124  241:iload           12
	//* 125  243:icmpge          273
			{
				c.a[i] = f;
	//  126  246:aload_0         
	//  127  247:getfield        #22  <Field lh c>
	//  128  250:getfield        #87  <Field float[] lh.a>
	//  129  253:iload           11
	//  130  255:fload_1         
	//  131  256:fastore         
				f = (float)((double)f + d4);
	//  132  257:fload_1         
	//  133  258:f2d             
	//  134  259:dload           7
	//  135  261:dadd            
	//  136  262:d2f             
	//  137  263:fstore_1        
			}

	//  138  264:iload           11
	//  139  266:iconst_1        
	//  140  267:iadd            
	//  141  268:istore          11
	//* 142  270:goto            239
			i = j;
	//  143  273:iload           12
	//  144  275:istore          11
		} else
	//* 145  277:goto            487
		{
			if(d3 == 0.0D)
	//* 146  280:dload           5
	//* 147  282:dconst_0        
	//* 148  283:dcmpl           
	//* 149  284:ifne            293
				d4 = 0.0D;
	//  150  287:dconst_0        
	//  151  288:dstore          7
			else
	//* 152  290:goto            306
				d4 = Math.ceil((double)f / d3) * d3;
	//  153  293:fload_1         
	//  154  294:f2d             
	//  155  295:dload           5
	//  156  297:ddiv            
	//  157  298:invokestatic    #125 <Method double Math.ceil(double)>
	//  158  301:dload           5
	//  159  303:dmul            
	//  160  304:dstore          7
			double d2 = d4;
	//  161  306:dload           7
	//  162  308:dstore_3        
			if(c.b())
	//* 163  309:aload_0         
	//* 164  310:getfield        #22  <Field lh c>
	//* 165  313:invokevirtual   #120 <Method boolean lh.b()>
	//* 166  316:ifeq            325
				d2 = d4 - d3;
	//  167  319:dload           7
	//  168  321:dload           5
	//  169  323:dsub            
	//  170  324:dstore_3        
			if(d3 == 0.0D)
	//* 171  325:dload           5
	//* 172  327:dconst_0        
	//* 173  328:dcmpl           
	//* 174  329:ifne            338
				d4 = 0.0D;
	//  175  332:dconst_0        
	//  176  333:dstore          7
			else
	//* 177  335:goto            354
				d4 = oc.b(Math.floor((double)f1 / d3) * d3);
	//  178  338:fload_2         
	//  179  339:f2d             
	//  180  340:dload           5
	//  181  342:ddiv            
	//  182  343:invokestatic    #118 <Method double Math.floor(double)>
	//  183  346:dload           5
	//  184  348:dmul            
	//  185  349:invokestatic    #127 <Method double oc.b(double)>
	//  186  352:dstore          7
			int k = i;
	//  187  354:iload           11
	//  188  356:istore          12
			if(d3 != 0.0D)
	//* 189  358:dload           5
	//* 190  360:dconst_0        
	//* 191  361:dcmpl           
	//* 192  362:ifeq            396
			{
				double d6 = d2;
	//  193  365:dload_3         
	//  194  366:dstore          9
				do
				{
					k = i;
	//  195  368:iload           11
	//  196  370:istore          12
					if(d6 > d4)
						break;
	//  197  372:dload           9
	//  198  374:dload           7
	//  199  376:dcmpg           
	//  200  377:ifgt            396
					i++;
	//  201  380:iload           11
	//  202  382:iconst_1        
	//  203  383:iadd            
	//  204  384:istore          11
					d6 += d3;
	//  205  386:dload           9
	//  206  388:dload           5
	//  207  390:dadd            
	//  208  391:dstore          9
				} while(true);
	//  209  393:goto            368
			}
			c.d = k;
	//  210  396:aload_0         
	//  211  397:getfield        #22  <Field lh c>
	//  212  400:iload           12
	//  213  402:putfield        #92  <Field int lh.d>
			if(c.a.length < k)
	//* 214  405:aload_0         
	//* 215  406:getfield        #22  <Field lh c>
	//* 216  409:getfield        #87  <Field float[] lh.a>
	//* 217  412:arraylength     
	//* 218  413:iload           12
	//* 219  415:icmpge          429
				c.a = new float[k];
	//  220  418:aload_0         
	//  221  419:getfield        #22  <Field lh c>
	//  222  422:iload           12
	//  223  424:newarray        float[]
	//  224  426:putfield        #87  <Field float[] lh.a>
			int i1 = 0;
	//  225  429:iconst_0        
	//  226  430:istore          13
			do
			{
				d4 = d3;
	//  227  432:dload           5
	//  228  434:dstore          7
				i = k;
	//  229  436:iload           12
	//  230  438:istore          11
				if(i1 >= k)
					break;
	//  231  440:iload           13
	//  232  442:iload           12
	//  233  444:icmpge          487
				d4 = d2;
	//  234  447:dload_3         
	//  235  448:dstore          7
				if(d2 == 0.0D)
	//* 236  450:dload_3         
	//* 237  451:dconst_0        
	//* 238  452:dcmpl           
	//* 239  453:ifne            459
					d4 = 0.0D;
	//  240  456:dconst_0        
	//  241  457:dstore          7
				c.a[i1] = (float)d4;
	//  242  459:aload_0         
	//  243  460:getfield        #22  <Field lh c>
	//  244  463:getfield        #87  <Field float[] lh.a>
	//  245  466:iload           13
	//  246  468:dload           7
	//  247  470:d2f             
	//  248  471:fastore         
				d2 = d4 + d3;
	//  249  472:dload           7
	//  250  474:dload           5
	//  251  476:dadd            
	//  252  477:dstore_3        
				i1++;
	//  253  478:iload           13
	//  254  480:iconst_1        
	//  255  481:iadd            
	//  256  482:istore          13
			} while(true);
	//  257  484:goto            432
		}
		if(d4 < 1.0D)
	//* 258  487:dload           7
	//* 259  489:dconst_1        
	//* 260  490:dcmpg           
	//* 261  491:ifge            514
			c.e = (int)Math.ceil(-Math.log10(d4));
	//  262  494:aload_0         
	//  263  495:getfield        #22  <Field lh c>
	//  264  498:dload           7
	//  265  500:invokestatic    #111 <Method double Math.log10(double)>
	//  266  503:dneg            
	//  267  504:invokestatic    #125 <Method double Math.ceil(double)>
	//  268  507:d2i             
	//  269  508:putfield        #129 <Field int lh.e>
		else
	//* 270  511:goto            522
			c.e = 0;
	//  271  514:aload_0         
	//  272  515:getfield        #22  <Field lh c>
	//  273  518:iconst_0        
	//  274  519:putfield        #129 <Field int lh.e>
		if(c.b())
	//* 275  522:aload_0         
	//* 276  523:getfield        #22  <Field lh c>
	//* 277  526:invokevirtual   #120 <Method boolean lh.b()>
	//* 278  529:ifeq            603
		{
			if(c.c.length < i)
	//* 279  532:aload_0         
	//* 280  533:getfield        #22  <Field lh c>
	//* 281  536:getfield        #89  <Field float[] lh.c>
	//* 282  539:arraylength     
	//* 283  540:iload           11
	//* 284  542:icmpge          556
				c.c = new float[i];
	//  285  545:aload_0         
	//  286  546:getfield        #22  <Field lh c>
	//  287  549:iload           11
	//  288  551:newarray        float[]
	//  289  553:putfield        #89  <Field float[] lh.c>
			f = (float)d4 / 2.0F;
	//  290  556:dload           7
	//  291  558:d2f             
	//  292  559:fconst_2        
	//  293  560:fdiv            
	//  294  561:fstore_1        
			for(int l = 0; l < i; l++)
	//* 295  562:iconst_0        
	//* 296  563:istore          12
	//* 297  565:iload           12
	//* 298  567:iload           11
	//* 299  569:icmpge          603
				c.c[l] = c.a[l] + f;
	//  300  572:aload_0         
	//  301  573:getfield        #22  <Field lh c>
	//  302  576:getfield        #89  <Field float[] lh.c>
	//  303  579:iload           12
	//  304  581:aload_0         
	//  305  582:getfield        #22  <Field lh c>
	//  306  585:getfield        #87  <Field float[] lh.a>
	//  307  588:iload           12
	//  308  590:faload          
	//  309  591:fload_1         
	//  310  592:fadd            
	//  311  593:fastore         

	//  312  594:iload           12
	//  313  596:iconst_1        
	//  314  597:iadd            
	//  315  598:istore          12
		}
	//* 316  600:goto            565
	//  317  603:return          
	}

	public void d(float f, float f1, boolean flag)
	{
		float f3 = f;
	//    0    0:fload_1         
	//    1    1:fstore          5
		float f2 = f1;
	//    2    3:fload_2         
	//    3    4:fstore          4
		if(l != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #26  <Field oa l>
	//*   6   10:ifnull          145
		{
			f3 = f;
	//    7   13:fload_1         
	//    8   14:fstore          5
			f2 = f1;
	//    9   16:fload_2         
	//   10   17:fstore          4
			if(l.g() > 10F)
	//*  11   19:aload_0         
	//*  12   20:getfield        #26  <Field oa l>
	//*  13   23:invokevirtual   #135 <Method float oa.g()>
	//*  14   26:ldc1            #136 <Float 10F>
	//*  15   28:fcmpl           
	//*  16   29:ifle            145
			{
				f3 = f;
	//   17   32:fload_1         
	//   18   33:fstore          5
				f2 = f1;
	//   19   35:fload_2         
	//   20   36:fstore          4
				if(!l.s())
	//*  21   38:aload_0         
	//*  22   39:getfield        #26  <Field oa l>
	//*  23   42:invokevirtual   #139 <Method boolean oa.s()>
	//*  24   45:ifne            145
				{
					nw nw1 = e.b(l.f(), l.e());
	//   25   48:aload_0         
	//   26   49:getfield        #20  <Field nv e>
	//   27   52:aload_0         
	//   28   53:getfield        #26  <Field oa l>
	//   29   56:invokevirtual   #141 <Method float oa.f()>
	//   30   59:aload_0         
	//   31   60:getfield        #26  <Field oa l>
	//   32   63:invokevirtual   #143 <Method float oa.e()>
	//   33   66:invokevirtual   #148 <Method nw nv.b(float, float)>
	//   34   69:astore          6
					nw nw2 = e.b(l.f(), l.i());
	//   35   71:aload_0         
	//   36   72:getfield        #20  <Field nv e>
	//   37   75:aload_0         
	//   38   76:getfield        #26  <Field oa l>
	//   39   79:invokevirtual   #141 <Method float oa.f()>
	//   40   82:aload_0         
	//   41   83:getfield        #26  <Field oa l>
	//   42   86:invokevirtual   #151 <Method float oa.i()>
	//   43   89:invokevirtual   #148 <Method nw nv.b(float, float)>
	//   44   92:astore          7
					if(!flag)
	//*  45   94:iload_3         
	//*  46   95:ifne            115
					{
						f = (float)nw2.c;
	//   47   98:aload           7
	//   48  100:getfield        #156 <Field double nw.c>
	//   49  103:d2f             
	//   50  104:fstore_1        
						f1 = (float)nw1.c;
	//   51  105:aload           6
	//   52  107:getfield        #156 <Field double nw.c>
	//   53  110:d2f             
	//   54  111:fstore_2        
					} else
	//*  55  112:goto            129
					{
						f = (float)nw1.c;
	//   56  115:aload           6
	//   57  117:getfield        #156 <Field double nw.c>
	//   58  120:d2f             
	//   59  121:fstore_1        
						f1 = (float)nw2.c;
	//   60  122:aload           7
	//   61  124:getfield        #156 <Field double nw.c>
	//   62  127:d2f             
	//   63  128:fstore_2        
					}
					nw.e(nw1);
	//   64  129:aload           6
	//   65  131:invokestatic    #159 <Method void nw.e(nw)>
					nw.e(nw2);
	//   66  134:aload           7
	//   67  136:invokestatic    #159 <Method void nw.e(nw)>
					f2 = f1;
	//   68  139:fload_2         
	//   69  140:fstore          4
					f3 = f;
	//   70  142:fload_1         
	//   71  143:fstore          5
				}
			}
		}
		d(f3, f2);
	//   72  145:aload_0         
	//   73  146:fload           5
	//   74  148:fload           4
	//   75  150:invokevirtual   #161 <Method void d(float, float)>
	//   76  153:return          
	}

	public Paint e()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Paint a>
	//    2    4:areturn         
	}

	protected Paint a;
	protected Paint b;
	protected lh c;
	protected Paint d;
	protected nv e;
	protected Paint h;
}
