// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//			bb, ew, bz, de, 
//			eo, ej, ex, ek, 
//			eg, eh, ee, em, 
//			en

public final class df
	implements bb
{

	public df(de de1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = de1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field de a>
	//    5    9:return          
	}

	public final void a(bz bz1)
	{
		if(bz1 instanceof ew)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #19  <Class ew>
	//*   2    4:ifeq            42
			if(bz1.q())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #25  <Method boolean bz.q()>
	//*   5   11:ifeq            28
			{
				a.a((ew)bz1);
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field de a>
	//    8   18:aload_1         
	//    9   19:checkcast       #19  <Class ew>
	//   10   22:invokeinterface #30  <Method void de.a(ew)>
				return;
	//   11   27:return          
			} else
			{
				a.b((ew)bz1);
	//   12   28:aload_0         
	//   13   29:getfield        #15  <Field de a>
	//   14   32:aload_1         
	//   15   33:checkcast       #19  <Class ew>
	//   16   36:invokeinterface #33  <Method void de.b(ew)>
				return;
	//   17   41:return          
			}
		if(bz1 instanceof eo)
	//*  18   42:aload_1         
	//*  19   43:instanceof      #35  <Class eo>
	//*  20   46:ifeq            84
			if(bz1.q())
	//*  21   49:aload_1         
	//*  22   50:invokevirtual   #25  <Method boolean bz.q()>
	//*  23   53:ifeq            70
			{
				a.a((eo)bz1);
	//   24   56:aload_0         
	//   25   57:getfield        #15  <Field de a>
	//   26   60:aload_1         
	//   27   61:checkcast       #35  <Class eo>
	//   28   64:invokeinterface #38  <Method void de.a(eo)>
				return;
	//   29   69:return          
			} else
			{
				a.b((eo)bz1);
	//   30   70:aload_0         
	//   31   71:getfield        #15  <Field de a>
	//   32   74:aload_1         
	//   33   75:checkcast       #35  <Class eo>
	//   34   78:invokeinterface #40  <Method void de.b(eo)>
				return;
	//   35   83:return          
			}
		if(bz1 instanceof ej)
	//*  36   84:aload_1         
	//*  37   85:instanceof      #42  <Class ej>
	//*  38   88:ifeq            126
			if(bz1.q())
	//*  39   91:aload_1         
	//*  40   92:invokevirtual   #25  <Method boolean bz.q()>
	//*  41   95:ifeq            112
			{
				a.a((ej)bz1);
	//   42   98:aload_0         
	//   43   99:getfield        #15  <Field de a>
	//   44  102:aload_1         
	//   45  103:checkcast       #42  <Class ej>
	//   46  106:invokeinterface #45  <Method void de.a(ej)>
				return;
	//   47  111:return          
			} else
			{
				a.b((ej)bz1);
	//   48  112:aload_0         
	//   49  113:getfield        #15  <Field de a>
	//   50  116:aload_1         
	//   51  117:checkcast       #42  <Class ej>
	//   52  120:invokeinterface #47  <Method void de.b(ej)>
				return;
	//   53  125:return          
			}
		if(bz1 instanceof ex)
	//*  54  126:aload_1         
	//*  55  127:instanceof      #49  <Class ex>
	//*  56  130:ifeq            168
			if(bz1.q())
	//*  57  133:aload_1         
	//*  58  134:invokevirtual   #25  <Method boolean bz.q()>
	//*  59  137:ifeq            154
			{
				a.a((ex)bz1);
	//   60  140:aload_0         
	//   61  141:getfield        #15  <Field de a>
	//   62  144:aload_1         
	//   63  145:checkcast       #49  <Class ex>
	//   64  148:invokeinterface #52  <Method void de.a(ex)>
				return;
	//   65  153:return          
			} else
			{
				a.b((ex)bz1);
	//   66  154:aload_0         
	//   67  155:getfield        #15  <Field de a>
	//   68  158:aload_1         
	//   69  159:checkcast       #49  <Class ex>
	//   70  162:invokeinterface #54  <Method void de.b(ex)>
				return;
	//   71  167:return          
			}
		if(bz1 instanceof ek)
	//*  72  168:aload_1         
	//*  73  169:instanceof      #56  <Class ek>
	//*  74  172:ifeq            206
			if(bz1.q())
	//*  75  175:aload_1         
	//*  76  176:invokevirtual   #25  <Method boolean bz.q()>
	//*  77  179:ifeq            192
			{
				a.a();
	//   78  182:aload_0         
	//   79  183:getfield        #15  <Field de a>
	//   80  186:invokeinterface #58  <Method void de.a()>
				return;
	//   81  191:return          
			} else
			{
				a.a((ek)bz1);
	//   82  192:aload_0         
	//   83  193:getfield        #15  <Field de a>
	//   84  196:aload_1         
	//   85  197:checkcast       #56  <Class ek>
	//   86  200:invokeinterface #61  <Method void de.a(ek)>
				return;
	//   87  205:return          
			}
		if(bz1 instanceof eg)
	//*  88  206:aload_1         
	//*  89  207:instanceof      #63  <Class eg>
	//*  90  210:ifeq            248
			if(bz1.q())
	//*  91  213:aload_1         
	//*  92  214:invokevirtual   #25  <Method boolean bz.q()>
	//*  93  217:ifeq            234
			{
				a.a((eg)bz1);
	//   94  220:aload_0         
	//   95  221:getfield        #15  <Field de a>
	//   96  224:aload_1         
	//   97  225:checkcast       #63  <Class eg>
	//   98  228:invokeinterface #66  <Method void de.a(eg)>
				return;
	//   99  233:return          
			} else
			{
				a.b((eg)bz1);
	//  100  234:aload_0         
	//  101  235:getfield        #15  <Field de a>
	//  102  238:aload_1         
	//  103  239:checkcast       #63  <Class eg>
	//  104  242:invokeinterface #68  <Method void de.b(eg)>
				return;
	//  105  247:return          
			}
		if(bz1 instanceof eh)
	//* 106  248:aload_1         
	//* 107  249:instanceof      #70  <Class eh>
	//* 108  252:ifeq            290
			if(bz1.q())
	//* 109  255:aload_1         
	//* 110  256:invokevirtual   #25  <Method boolean bz.q()>
	//* 111  259:ifeq            276
			{
				a.a((eh)bz1);
	//  112  262:aload_0         
	//  113  263:getfield        #15  <Field de a>
	//  114  266:aload_1         
	//  115  267:checkcast       #70  <Class eh>
	//  116  270:invokeinterface #73  <Method void de.a(eh)>
				return;
	//  117  275:return          
			} else
			{
				a.b((eh)bz1);
	//  118  276:aload_0         
	//  119  277:getfield        #15  <Field de a>
	//  120  280:aload_1         
	//  121  281:checkcast       #70  <Class eh>
	//  122  284:invokeinterface #75  <Method void de.b(eh)>
				return;
	//  123  289:return          
			}
		if(bz1 instanceof ee)
	//* 124  290:aload_1         
	//* 125  291:instanceof      #77  <Class ee>
	//* 126  294:ifeq            332
			if(bz1.q())
	//* 127  297:aload_1         
	//* 128  298:invokevirtual   #25  <Method boolean bz.q()>
	//* 129  301:ifeq            318
			{
				a.a((ee)bz1);
	//  130  304:aload_0         
	//  131  305:getfield        #15  <Field de a>
	//  132  308:aload_1         
	//  133  309:checkcast       #77  <Class ee>
	//  134  312:invokeinterface #80  <Method void de.a(ee)>
				return;
	//  135  317:return          
			} else
			{
				a.b((ee)bz1);
	//  136  318:aload_0         
	//  137  319:getfield        #15  <Field de a>
	//  138  322:aload_1         
	//  139  323:checkcast       #77  <Class ee>
	//  140  326:invokeinterface #82  <Method void de.b(ee)>
				return;
	//  141  331:return          
			}
		if(bz1 instanceof em)
	//* 142  332:aload_1         
	//* 143  333:instanceof      #84  <Class em>
	//* 144  336:ifeq            374
			if(bz1.q())
	//* 145  339:aload_1         
	//* 146  340:invokevirtual   #25  <Method boolean bz.q()>
	//* 147  343:ifeq            360
			{
				a.a((em)bz1);
	//  148  346:aload_0         
	//  149  347:getfield        #15  <Field de a>
	//  150  350:aload_1         
	//  151  351:checkcast       #84  <Class em>
	//  152  354:invokeinterface #87  <Method void de.a(em)>
				return;
	//  153  359:return          
			} else
			{
				a.b((em)bz1);
	//  154  360:aload_0         
	//  155  361:getfield        #15  <Field de a>
	//  156  364:aload_1         
	//  157  365:checkcast       #84  <Class em>
	//  158  368:invokeinterface #89  <Method void de.b(em)>
				return;
	//  159  373:return          
			}
		if(bz1 instanceof en)
	//* 160  374:aload_1         
	//* 161  375:instanceof      #91  <Class en>
	//* 162  378:ifeq            416
		{
			if(bz1.q())
	//* 163  381:aload_1         
	//* 164  382:invokevirtual   #25  <Method boolean bz.q()>
	//* 165  385:ifeq            402
			{
				a.a((en)bz1);
	//  166  388:aload_0         
	//  167  389:getfield        #15  <Field de a>
	//  168  392:aload_1         
	//  169  393:checkcast       #91  <Class en>
	//  170  396:invokeinterface #94  <Method void de.a(en)>
				return;
	//  171  401:return          
			} else
			{
				a.b((en)bz1);
	//  172  402:aload_0         
	//  173  403:getfield        #15  <Field de a>
	//  174  406:aload_1         
	//  175  407:checkcast       #91  <Class en>
	//  176  410:invokeinterface #96  <Method void de.b(en)>
				return;
	//  177  415:return          
			}
		} else
		{
			throw new RuntimeException("not handled");
	//  178  416:new             #98  <Class RuntimeException>
	//  179  419:dup             
	//  180  420:ldc1            #100 <String "not handled">
	//  181  422:invokespecial   #103 <Method void RuntimeException(String)>
	//  182  425:athrow          
		}
	}

	private de a;
}
