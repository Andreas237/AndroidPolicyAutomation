// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

// Referenced classes of package o:
//			nh, la, nv, mh, 
//			mr, ma, oa, mt, 
//			mo, oc, lo, lb, 
//			lc, nz, ml

public class ng extends nh
{

	public ng(mo mo1, la la1, oa oa1)
	{
		super(mo1, la1, oa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #10  <Method void nh(mo, la, oa)>
		m = new RectF();
	//    5    7:aload_0         
	//    6    8:new             #12  <Class RectF>
	//    7   11:dup             
	//    8   12:invokespecial   #15  <Method void RectF()>
	//    9   15:putfield        #17  <Field RectF m>
		n.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field Paint n>
	//   12   22:getstatic       #27  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   13   25:invokevirtual   #33  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
	//   14   28:return          
	}

	protected void a(Canvas canvas, String s, float f, float f1, int i)
	{
		n.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Paint n>
	//    2    4:iload           5
	//    3    6:invokevirtual   #40  <Method void Paint.setColor(int)>
		canvas.drawText(s, f, f1, n);
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:fload_3         
	//    7   12:fload           4
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field Paint n>
	//   10   18:invokevirtual   #46  <Method void Canvas.drawText(String, float, float, Paint)>
	//   11   21:return          
	}

	protected void b(float f, float f1, float f2, float f3, nv nv1)
	{
		a.set(f1, f - f3, f2, f + f3);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field RectF a>
	//    2    4:fload_2         
	//    3    5:fload_1         
	//    4    6:fload           4
	//    5    8:fsub            
	//    6    9:fload_3         
	//    7   10:fload_1         
	//    8   11:fload           4
	//    9   13:fadd            
	//   10   14:invokevirtual   #54  <Method void RectF.set(float, float, float, float)>
		nv1.e(a, i.d());
	//   11   17:aload           5
	//   12   19:aload_0         
	//   13   20:getfield        #50  <Field RectF a>
	//   14   23:aload_0         
	//   15   24:getfield        #58  <Field la i>
	//   16   27:invokevirtual   #64  <Method float la.d()>
	//   17   30:invokevirtual   #70  <Method void nv.e(RectF, float)>
	//   18   33:return          
	}

	protected void c(mh mh1, RectF rectf)
	{
		mh1.e(rectf.centerY(), rectf.right);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #75  <Method float RectF.centerY()>
	//    3    5:aload_2         
	//    4    6:getfield        #79  <Field float RectF.right>
	//    5    9:invokevirtual   #84  <Method void mh.e(float, float)>
	//    6   12:return          
	}

	protected boolean c(mr mr1)
	{
		return (float)mr1.getData().o() < (float)mr1.getMaxVisibleCount() * l.t();
	//    0    0:aload_1         
	//    1    1:invokeinterface #91  <Method ma mr.getData()>
	//    2    6:invokevirtual   #97  <Method int ma.o()>
	//    3    9:i2f             
	//    4   10:aload_1         
	//    5   11:invokeinterface #100 <Method int mr.getMaxVisibleCount()>
	//    6   16:i2f             
	//    7   17:aload_0         
	//    8   18:getfield        #104 <Field oa l>
	//    9   21:invokevirtual   #109 <Method float oa.t()>
	//   10   24:fmul            
	//   11   25:fcmpg           
	//   12   26:ifge            31
	//   13   29:iconst_1        
	//   14   30:ireturn         
	//   15   31:iconst_0        
	//   16   32:ireturn         
	}

	protected void d(Canvas canvas, mt mt1, int i)
	{
		nv nv1 = e.b(mt1.D());
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field mo e>
	//    2    4:aload_2         
	//    3    5:invokeinterface #119 <Method lp$b mt.D()>
	//    4   10:invokeinterface #124 <Method nv mo.b(lp$b)>
	//    5   15:astore          11
		b.setColor(mt1.e());
	//    6   17:aload_0         
	//    7   18:getfield        #126 <Field Paint b>
	//    8   21:aload_2         
	//    9   22:invokeinterface #128 <Method int mt.e()>
	//   10   27:invokevirtual   #40  <Method void Paint.setColor(int)>
		b.setStrokeWidth(oc.b(mt1.c()));
	//   11   30:aload_0         
	//   12   31:getfield        #126 <Field Paint b>
	//   13   34:aload_2         
	//   14   35:invokeinterface #130 <Method float mt.c()>
	//   15   40:invokestatic    #135 <Method float oc.b(float)>
	//   16   43:invokevirtual   #139 <Method void Paint.setStrokeWidth(float)>
		boolean flag;
		if(mt1.c() > 0.0F)
	//*  17   46:aload_2         
	//*  18   47:invokeinterface #130 <Method float mt.c()>
	//*  19   52:fconst_0        
	//*  20   53:fcmpl           
	//*  21   54:ifle            63
			flag = true;
	//   22   57:iconst_1        
	//   23   58:istore          8
		else
	//*  24   60:goto            66
			flag = false;
	//   25   63:iconst_0        
	//   26   64:istore          8
		float f = this.i.b();
	//   27   66:aload_0         
	//   28   67:getfield        #58  <Field la i>
	//   29   70:invokevirtual   #141 <Method float la.b()>
	//   30   73:fstore          4
		float f1 = this.i.d();
	//   31   75:aload_0         
	//   32   76:getfield        #58  <Field la i>
	//   33   79:invokevirtual   #64  <Method float la.d()>
	//   34   82:fstore          5
		if(e.e())
	//*  35   84:aload_0         
	//*  36   85:getfield        #113 <Field mo e>
	//*  37   88:invokeinterface #144 <Method boolean mo.e()>
	//*  38   93:ifeq            299
		{
			d.setColor(mt1.b());
	//   39   96:aload_0         
	//   40   97:getfield        #146 <Field Paint d>
	//   41  100:aload_2         
	//   42  101:invokeinterface #148 <Method int mt.b()>
	//   43  106:invokevirtual   #40  <Method void Paint.setColor(int)>
			float f2 = e.getBarData().a() / 2.0F;
	//   44  109:aload_0         
	//   45  110:getfield        #113 <Field mo e>
	//   46  113:invokeinterface #152 <Method lo mo.getBarData()>
	//   47  118:invokevirtual   #156 <Method float lo.a()>
	//   48  121:fconst_2        
	//   49  122:fdiv            
	//   50  123:fstore          6
			int j = 0;
	//   51  125:iconst_0        
	//   52  126:istore          9
			for(int l = Math.min((int)Math.ceil((float)mt1.C() * f), mt1.C()); j < l; j++)
	//*  53  128:aload_2         
	//*  54  129:invokeinterface #159 <Method int mt.C()>
	//*  55  134:i2f             
	//*  56  135:fload           4
	//*  57  137:fmul            
	//*  58  138:f2d             
	//*  59  139:invokestatic    #165 <Method double Math.ceil(double)>
	//*  60  142:d2i             
	//*  61  143:aload_2         
	//*  62  144:invokeinterface #159 <Method int mt.C()>
	//*  63  149:invokestatic    #169 <Method int Math.min(int, int)>
	//*  64  152:istore          10
	//*  65  154:iload           9
	//*  66  156:iload           10
	//*  67  158:icmpge          299
			{
				float f3 = ((BarEntry)mt1.f(j)).getX();
	//   68  161:aload_2         
	//   69  162:iload           9
	//   70  164:invokeinterface #173 <Method com.github.mikephil.charting.data.Entry mt.f(int)>
	//   71  169:checkcast       #175 <Class BarEntry>
	//   72  172:invokevirtual   #178 <Method float BarEntry.getX()>
	//   73  175:fstore          7
				m.top = f3 - f2;
	//   74  177:aload_0         
	//   75  178:getfield        #17  <Field RectF m>
	//   76  181:fload           7
	//   77  183:fload           6
	//   78  185:fsub            
	//   79  186:putfield        #181 <Field float RectF.top>
				m.bottom = f3 + f2;
	//   80  189:aload_0         
	//   81  190:getfield        #17  <Field RectF m>
	//   82  193:fload           7
	//   83  195:fload           6
	//   84  197:fadd            
	//   85  198:putfield        #184 <Field float RectF.bottom>
				nv1.b(m);
	//   86  201:aload           11
	//   87  203:aload_0         
	//   88  204:getfield        #17  <Field RectF m>
	//   89  207:invokevirtual   #187 <Method void nv.b(RectF)>
				if(!this.l.f(m.bottom))
	//*  90  210:aload_0         
	//*  91  211:getfield        #104 <Field oa l>
	//*  92  214:aload_0         
	//*  93  215:getfield        #17  <Field RectF m>
	//*  94  218:getfield        #184 <Field float RectF.bottom>
	//*  95  221:invokevirtual   #190 <Method boolean oa.f(float)>
	//*  96  224:ifne            230
					continue;
	//   97  227:goto            290
				if(!this.l.h(m.top))
	//*  98  230:aload_0         
	//*  99  231:getfield        #104 <Field oa l>
	//* 100  234:aload_0         
	//* 101  235:getfield        #17  <Field RectF m>
	//* 102  238:getfield        #181 <Field float RectF.top>
	//* 103  241:invokevirtual   #193 <Method boolean oa.h(float)>
	//* 104  244:ifne            250
					break;
	//  105  247:goto            299
				m.left = this.l.f();
	//  106  250:aload_0         
	//  107  251:getfield        #17  <Field RectF m>
	//  108  254:aload_0         
	//  109  255:getfield        #104 <Field oa l>
	//  110  258:invokevirtual   #195 <Method float oa.f()>
	//  111  261:putfield        #198 <Field float RectF.left>
				m.right = this.l.h();
	//  112  264:aload_0         
	//  113  265:getfield        #17  <Field RectF m>
	//  114  268:aload_0         
	//  115  269:getfield        #104 <Field oa l>
	//  116  272:invokevirtual   #200 <Method float oa.h()>
	//  117  275:putfield        #79  <Field float RectF.right>
				canvas.drawRect(m, d);
	//  118  278:aload_1         
	//  119  279:aload_0         
	//  120  280:getfield        #17  <Field RectF m>
	//  121  283:aload_0         
	//  122  284:getfield        #146 <Field Paint d>
	//  123  287:invokevirtual   #204 <Method void Canvas.drawRect(RectF, Paint)>
			}

	//  124  290:iload           9
	//  125  292:iconst_1        
	//  126  293:iadd            
	//  127  294:istore          9
		}
	//* 128  296:goto            154
		lb lb1 = c[i];
	//  129  299:aload_0         
	//  130  300:getfield        #207 <Field lb[] c>
	//  131  303:iload_3         
	//  132  304:aaload          
	//  133  305:astore          12
		lb1.b(f, f1);
	//  134  307:aload           12
	//  135  309:fload           4
	//  136  311:fload           5
	//  137  313:invokevirtual   #211 <Method void lb.b(float, float)>
		lb1.e(i);
	//  138  316:aload           12
	//  139  318:iload_3         
	//  140  319:invokevirtual   #213 <Method void lb.e(int)>
		lb1.b(e.c(mt1.D()));
	//  141  322:aload           12
	//  142  324:aload_0         
	//  143  325:getfield        #113 <Field mo e>
	//  144  328:aload_2         
	//  145  329:invokeinterface #119 <Method lp$b mt.D()>
	//  146  334:invokeinterface #216 <Method boolean mo.c(lp$b)>
	//  147  339:invokevirtual   #219 <Method void lb.b(boolean)>
		lb1.d(e.getBarData().a());
	//  148  342:aload           12
	//  149  344:aload_0         
	//  150  345:getfield        #113 <Field mo e>
	//  151  348:invokeinterface #152 <Method lo mo.getBarData()>
	//  152  353:invokevirtual   #156 <Method float lo.a()>
	//  153  356:invokevirtual   #221 <Method void lb.d(float)>
		lb1.e(mt1);
	//  154  359:aload           12
	//  155  361:aload_2         
	//  156  362:invokevirtual   #224 <Method void lb.e(mt)>
		nv1.e(lb1.e);
	//  157  365:aload           11
	//  158  367:aload           12
	//  159  369:getfield        #227 <Field float[] lb.e>
	//  160  372:invokevirtual   #230 <Method void nv.e(float[])>
		if(mt1.k().size() == 1)
	//* 161  375:aload_2         
	//* 162  376:invokeinterface #234 <Method List mt.k()>
	//* 163  381:invokeinterface #239 <Method int List.size()>
	//* 164  386:iconst_1        
	//* 165  387:icmpne          395
			i = 1;
	//  166  390:iconst_1        
	//  167  391:istore_3        
		else
	//* 168  392:goto            397
			i = 0;
	//  169  395:iconst_0        
	//  170  396:istore_3        
		if(i != 0)
	//* 171  397:iload_3         
	//* 172  398:ifeq            414
			h.setColor(mt1.m());
	//  173  401:aload_0         
	//  174  402:getfield        #241 <Field Paint h>
	//  175  405:aload_2         
	//  176  406:invokeinterface #243 <Method int mt.m()>
	//  177  411:invokevirtual   #40  <Method void Paint.setColor(int)>
		for(int k = 0; k < lb1.a(); k += 4)
	//* 178  414:iconst_0        
	//* 179  415:istore          9
	//* 180  417:iload           9
	//* 181  419:aload           12
	//* 182  421:invokevirtual   #245 <Method int lb.a()>
	//* 183  424:icmpge          598
		{
			if(!this.l.f(lb1.e[k + 3]))
	//* 184  427:aload_0         
	//* 185  428:getfield        #104 <Field oa l>
	//* 186  431:aload           12
	//* 187  433:getfield        #227 <Field float[] lb.e>
	//* 188  436:iload           9
	//* 189  438:iconst_3        
	//* 190  439:iadd            
	//* 191  440:faload          
	//* 192  441:invokevirtual   #190 <Method boolean oa.f(float)>
	//* 193  444:ifne            448
				return;
	//  194  447:return          
			if(!this.l.h(lb1.e[k + 1]))
	//* 195  448:aload_0         
	//* 196  449:getfield        #104 <Field oa l>
	//* 197  452:aload           12
	//* 198  454:getfield        #227 <Field float[] lb.e>
	//* 199  457:iload           9
	//* 200  459:iconst_1        
	//* 201  460:iadd            
	//* 202  461:faload          
	//* 203  462:invokevirtual   #193 <Method boolean oa.h(float)>
	//* 204  465:ifne            471
				continue;
	//  205  468:goto            589
			if(i == 0)
	//* 206  471:iload_3         
	//* 207  472:ifne            492
				h.setColor(mt1.e(k / 4));
	//  208  475:aload_0         
	//  209  476:getfield        #241 <Field Paint h>
	//  210  479:aload_2         
	//  211  480:iload           9
	//  212  482:iconst_4        
	//  213  483:idiv            
	//  214  484:invokeinterface #248 <Method int mt.e(int)>
	//  215  489:invokevirtual   #40  <Method void Paint.setColor(int)>
			canvas.drawRect(lb1.e[k], lb1.e[k + 1], lb1.e[k + 2], lb1.e[k + 3], h);
	//  216  492:aload_1         
	//  217  493:aload           12
	//  218  495:getfield        #227 <Field float[] lb.e>
	//  219  498:iload           9
	//  220  500:faload          
	//  221  501:aload           12
	//  222  503:getfield        #227 <Field float[] lb.e>
	//  223  506:iload           9
	//  224  508:iconst_1        
	//  225  509:iadd            
	//  226  510:faload          
	//  227  511:aload           12
	//  228  513:getfield        #227 <Field float[] lb.e>
	//  229  516:iload           9
	//  230  518:iconst_2        
	//  231  519:iadd            
	//  232  520:faload          
	//  233  521:aload           12
	//  234  523:getfield        #227 <Field float[] lb.e>
	//  235  526:iload           9
	//  236  528:iconst_3        
	//  237  529:iadd            
	//  238  530:faload          
	//  239  531:aload_0         
	//  240  532:getfield        #241 <Field Paint h>
	//  241  535:invokevirtual   #251 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			if(flag)
	//* 242  538:iload           8
	//* 243  540:ifeq            589
				canvas.drawRect(lb1.e[k], lb1.e[k + 1], lb1.e[k + 2], lb1.e[k + 3], b);
	//  244  543:aload_1         
	//  245  544:aload           12
	//  246  546:getfield        #227 <Field float[] lb.e>
	//  247  549:iload           9
	//  248  551:faload          
	//  249  552:aload           12
	//  250  554:getfield        #227 <Field float[] lb.e>
	//  251  557:iload           9
	//  252  559:iconst_1        
	//  253  560:iadd            
	//  254  561:faload          
	//  255  562:aload           12
	//  256  564:getfield        #227 <Field float[] lb.e>
	//  257  567:iload           9
	//  258  569:iconst_2        
	//  259  570:iadd            
	//  260  571:faload          
	//  261  572:aload           12
	//  262  574:getfield        #227 <Field float[] lb.e>
	//  263  577:iload           9
	//  264  579:iconst_3        
	//  265  580:iadd            
	//  266  581:faload          
	//  267  582:aload_0         
	//  268  583:getfield        #126 <Field Paint b>
	//  269  586:invokevirtual   #251 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}

	//  270  589:iload           9
	//  271  591:iconst_4        
	//  272  592:iadd            
	//  273  593:istore          9
	//* 274  595:goto            417
	//  275  598:return          
	}

	public void e()
	{
		lo lo1 = e.getBarData();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field mo e>
	//    2    4:invokeinterface #152 <Method lo mo.getBarData()>
	//    3    9:astore          4
		c = ((lb []) (new lc[lo1.e()]));
	//    4   11:aload_0         
	//    5   12:aload           4
	//    6   14:invokevirtual   #252 <Method int lo.e()>
	//    7   17:anewarray       lc[]
	//    8   20:putfield        #207 <Field lb[] c>
		for(int i = 0; i < c.length; i++)
	//*   9   23:iconst_0        
	//*  10   24:istore_1        
	//*  11   25:iload_1         
	//*  12   26:aload_0         
	//*  13   27:getfield        #207 <Field lb[] c>
	//*  14   30:arraylength     
	//*  15   31:icmpge          117
		{
			mt mt1 = (mt)lo1.a(i);
	//   16   34:aload           4
	//   17   36:iload_1         
	//   18   37:invokevirtual   #257 <Method mz lo.a(int)>
	//   19   40:checkcast       #115 <Class mt>
	//   20   43:astore          5
			lb alb[] = c;
	//   21   45:aload_0         
	//   22   46:getfield        #207 <Field lb[] c>
	//   23   49:astore          6
			int k = mt1.C();
	//   24   51:aload           5
	//   25   53:invokeinterface #159 <Method int mt.C()>
	//   26   58:istore_3        
			int j;
			if(mt1.a())
	//*  27   59:aload           5
	//*  28   61:invokeinterface #259 <Method boolean mt.a()>
	//*  29   66:ifeq            80
				j = mt1.d();
	//   30   69:aload           5
	//   31   71:invokeinterface #261 <Method int mt.d()>
	//   32   76:istore_2        
			else
	//*  33   77:goto            82
				j = 1;
	//   34   80:iconst_1        
	//   35   81:istore_2        
			alb[i] = ((lb) (new lc(k * 4 * j, lo1.e(), mt1.a())));
	//   36   82:aload           6
	//   37   84:iload_1         
	//   38   85:new             #254 <Class lc>
	//   39   88:dup             
	//   40   89:iload_3         
	//   41   90:iconst_4        
	//   42   91:imul            
	//   43   92:iload_2         
	//   44   93:imul            
	//   45   94:aload           4
	//   46   96:invokevirtual   #252 <Method int lo.e()>
	//   47   99:aload           5
	//   48  101:invokeinterface #259 <Method boolean mt.a()>
	//   49  106:invokespecial   #264 <Method void lc(int, int, boolean)>
	//   50  109:aastore         
		}

	//   51  110:iload_1         
	//   52  111:iconst_1        
	//   53  112:iadd            
	//   54  113:istore_1        
	//*  55  114:goto            25
	//   56  117:return          
	}

	public void e(Canvas canvas)
	{
		if(c(((mr) (e))))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #113 <Field mo e>
	//*   3    5:invokevirtual   #267 <Method boolean c(mr)>
	//*   4    8:ifeq            1574
		{
			List list = e.getBarData().h();
	//    5   11:aload_0         
	//    6   12:getfield        #113 <Field mo e>
	//    7   15:invokeinterface #152 <Method lo mo.getBarData()>
	//    8   20:invokevirtual   #269 <Method List lo.h()>
	//    9   23:astore          21
			float f = oc.b(5F);
	//   10   25:ldc2            #270 <Float 5F>
	//   11   28:invokestatic    #135 <Method float oc.b(float)>
	//   12   31:fstore_2        
			boolean flag1 = e.b();
	//   13   32:aload_0         
	//   14   33:getfield        #113 <Field mo e>
	//   15   36:invokeinterface #272 <Method boolean mo.b()>
	//   16   41:istore          19
			for(int k = 0; k < e.getBarData().e(); k++)
	//*  17   43:iconst_0        
	//*  18   44:istore          14
	//*  19   46:iload           14
	//*  20   48:aload_0         
	//*  21   49:getfield        #113 <Field mo e>
	//*  22   52:invokeinterface #152 <Method lo mo.getBarData()>
	//*  23   57:invokevirtual   #252 <Method int lo.e()>
	//*  24   60:icmpge          1574
			{
				mt mt1 = (mt)list.get(k);
	//   25   63:aload           21
	//   26   65:iload           14
	//   27   67:invokeinterface #276 <Method Object List.get(int)>
	//   28   72:checkcast       #115 <Class mt>
	//   29   75:astore          22
				if(!c(((mz) (mt1))))
	//*  30   77:aload_0         
	//*  31   78:aload           22
	//*  32   80:invokevirtual   #279 <Method boolean c(mz)>
	//*  33   83:ifne            89
					continue;
	//   34   86:goto            1565
				boolean flag2 = e.c(mt1.D());
	//   35   89:aload_0         
	//   36   90:getfield        #113 <Field mo e>
	//   37   93:aload           22
	//   38   95:invokeinterface #119 <Method lp$b mt.D()>
	//   39  100:invokeinterface #216 <Method boolean mo.c(lp$b)>
	//   40  105:istore          20
				e(((mz) (mt1)));
	//   41  107:aload_0         
	//   42  108:aload           22
	//   43  110:invokevirtual   #282 <Method void e(mz)>
				float f29 = (float)oc.e(n, "10") / 2.0F;
	//   44  113:aload_0         
	//   45  114:getfield        #21  <Field Paint n>
	//   46  117:ldc2            #284 <String "10">
	//   47  120:invokestatic    #287 <Method int oc.e(Paint, String)>
	//   48  123:i2f             
	//   49  124:fconst_2        
	//   50  125:fdiv            
	//   51  126:fstore          9
				ml ml1 = mt1.l();
	//   52  128:aload           22
	//   53  130:invokeinterface #290 <Method ml mt.l()>
	//   54  135:astore          23
				lb lb1 = c[k];
	//   55  137:aload_0         
	//   56  138:getfield        #207 <Field lb[] c>
	//   57  141:iload           14
	//   58  143:aaload          
	//   59  144:astore          24
				float f30 = this.i.d();
	//   60  146:aload_0         
	//   61  147:getfield        #58  <Field la i>
	//   62  150:invokevirtual   #64  <Method float la.d()>
	//   63  153:fstore          10
				nz nz1 = nz.b(mt1.z());
	//   64  155:aload           22
	//   65  157:invokeinterface #294 <Method nz mt.z()>
	//   66  162:invokestatic    #299 <Method nz nz.b(nz)>
	//   67  165:astore          25
				nz1.e = oc.b(nz1.e);
	//   68  167:aload           25
	//   69  169:aload           25
	//   70  171:getfield        #301 <Field float nz.e>
	//   71  174:invokestatic    #135 <Method float oc.b(float)>
	//   72  177:putfield        #301 <Field float nz.e>
				nz1.c = oc.b(nz1.c);
	//   73  180:aload           25
	//   74  182:aload           25
	//   75  184:getfield        #303 <Field float nz.c>
	//   76  187:invokestatic    #135 <Method float oc.b(float)>
	//   77  190:putfield        #303 <Field float nz.c>
				if(!mt1.a())
	//*  78  193:aload           22
	//*  79  195:invokeinterface #259 <Method boolean mt.a()>
	//*  80  200:ifne            610
				{
					int i = 0;
	//   81  203:iconst_0        
	//   82  204:istore          13
					do
					{
						if((float)i >= (float)lb1.e.length * this.i.b())
							break;
	//   83  206:iload           13
	//   84  208:i2f             
	//   85  209:aload           24
	//   86  211:getfield        #227 <Field float[] lb.e>
	//   87  214:arraylength     
	//   88  215:i2f             
	//   89  216:aload_0         
	//   90  217:getfield        #58  <Field la i>
	//   91  220:invokevirtual   #141 <Method float la.b()>
	//   92  223:fmul            
	//   93  224:fcmpg           
	//   94  225:ifge            607
						float f23 = (lb1.e[i + 1] + lb1.e[i + 3]) / 2.0F;
	//   95  228:aload           24
	//   96  230:getfield        #227 <Field float[] lb.e>
	//   97  233:iload           13
	//   98  235:iconst_1        
	//   99  236:iadd            
	//  100  237:faload          
	//  101  238:aload           24
	//  102  240:getfield        #227 <Field float[] lb.e>
	//  103  243:iload           13
	//  104  245:iconst_3        
	//  105  246:iadd            
	//  106  247:faload          
	//  107  248:fadd            
	//  108  249:fconst_2        
	//  109  250:fdiv            
	//  110  251:fstore          7
						if(!this.l.f(lb1.e[i + 1]))
	//* 111  253:aload_0         
	//* 112  254:getfield        #104 <Field oa l>
	//* 113  257:aload           24
	//* 114  259:getfield        #227 <Field float[] lb.e>
	//* 115  262:iload           13
	//* 116  264:iconst_1        
	//* 117  265:iadd            
	//* 118  266:faload          
	//* 119  267:invokevirtual   #190 <Method boolean oa.f(float)>
	//* 120  270:ifne            276
							break;
	//  121  273:goto            607
						if(this.l.c(lb1.e[i]) && this.l.h(lb1.e[i + 1]))
	//* 122  276:aload_0         
	//* 123  277:getfield        #104 <Field oa l>
	//* 124  280:aload           24
	//* 125  282:getfield        #227 <Field float[] lb.e>
	//* 126  285:iload           13
	//* 127  287:faload          
	//* 128  288:invokevirtual   #305 <Method boolean oa.c(float)>
	//* 129  291:ifne            297
	//* 130  294:goto            598
	//* 131  297:aload_0         
	//* 132  298:getfield        #104 <Field oa l>
	//* 133  301:aload           24
	//* 134  303:getfield        #227 <Field float[] lb.e>
	//* 135  306:iload           13
	//* 136  308:iconst_1        
	//* 137  309:iadd            
	//* 138  310:faload          
	//* 139  311:invokevirtual   #193 <Method boolean oa.h(float)>
	//* 140  314:ifne            320
	//* 141  317:goto            598
						{
							Object obj = ((Object) ((BarEntry)mt1.f(i / 4)));
	//  142  320:aload           22
	//  143  322:iload           13
	//  144  324:iconst_4        
	//  145  325:idiv            
	//  146  326:invokeinterface #173 <Method com.github.mikephil.charting.data.Entry mt.f(int)>
	//  147  331:checkcast       #175 <Class BarEntry>
	//  148  334:astore          26
							float f27 = ((BarEntry) (obj)).getY();
	//  149  336:aload           26
	//  150  338:invokevirtual   #308 <Method float BarEntry.getY()>
	//  151  341:fstore          8
							String s = ml1.b(f27, ((com.github.mikephil.charting.data.Entry) (obj)), k, this.l);
	//  152  343:aload           23
	//  153  345:fload           8
	//  154  347:aload           26
	//  155  349:iload           14
	//  156  351:aload_0         
	//  157  352:getfield        #104 <Field oa l>
	//  158  355:invokeinterface #313 <Method String ml.b(float, com.github.mikephil.charting.data.Entry, int, oa)>
	//  159  360:astore          27
							f30 = oc.d(n, s);
	//  160  362:aload_0         
	//  161  363:getfield        #21  <Field Paint n>
	//  162  366:aload           27
	//  163  368:invokestatic    #315 <Method int oc.d(Paint, String)>
	//  164  371:i2f             
	//  165  372:fstore          10
							float f8;
							if(flag1)
	//* 166  374:iload           19
	//* 167  376:ifeq            385
								f8 = f;
	//  168  379:fload_2         
	//  169  380:fstore          5
							else
	//* 170  382:goto            392
								f8 = -(f30 + f);
	//  171  385:fload           10
	//  172  387:fload_2         
	//  173  388:fadd            
	//  174  389:fneg            
	//  175  390:fstore          5
							float f16;
							if(flag1)
	//* 176  392:iload           19
	//* 177  394:ifeq            407
								f16 = -(f30 + f);
	//  178  397:fload           10
	//  179  399:fload_2         
	//  180  400:fadd            
	//  181  401:fneg            
	//  182  402:fstore          6
							else
	//* 183  404:goto            410
								f16 = f;
	//  184  407:fload_2         
	//  185  408:fstore          6
							float f4 = f8;
	//  186  410:fload           5
	//  187  412:fstore          4
							float f1 = f16;
	//  188  414:fload           6
	//  189  416:fstore_3        
							if(flag2)
	//* 190  417:iload           20
	//* 191  419:ifeq            437
							{
								f4 = -f8 - f30;
	//  192  422:fload           5
	//  193  424:fneg            
	//  194  425:fload           10
	//  195  427:fsub            
	//  196  428:fstore          4
								f1 = -f16 - f30;
	//  197  430:fload           6
	//  198  432:fneg            
	//  199  433:fload           10
	//  200  435:fsub            
	//  201  436:fstore_3        
							}
							if(mt1.v())
	//* 202  437:aload           22
	//* 203  439:invokeinterface #318 <Method boolean mt.v()>
	//* 204  444:ifeq            504
							{
								float f17 = lb1.e[i + 2];
	//  205  447:aload           24
	//  206  449:getfield        #227 <Field float[] lb.e>
	//  207  452:iload           13
	//  208  454:iconst_2        
	//  209  455:iadd            
	//  210  456:faload          
	//  211  457:fstore          6
								float f9;
								if(f27 >= 0.0F)
	//* 212  459:fload           8
	//* 213  461:fconst_0        
	//* 214  462:fcmpl           
	//* 215  463:iflt            473
									f9 = f4;
	//  216  466:fload           4
	//  217  468:fstore          5
								else
	//* 218  470:goto            476
									f9 = f1;
	//  219  473:fload_3         
	//  220  474:fstore          5
								a(canvas, s, f17 + f9, f23 + f29, mt1.b(i / 2));
	//  221  476:aload_0         
	//  222  477:aload_1         
	//  223  478:aload           27
	//  224  480:fload           6
	//  225  482:fload           5
	//  226  484:fadd            
	//  227  485:fload           7
	//  228  487:fload           9
	//  229  489:fadd            
	//  230  490:aload           22
	//  231  492:iload           13
	//  232  494:iconst_2        
	//  233  495:idiv            
	//  234  496:invokeinterface #320 <Method int mt.b(int)>
	//  235  501:invokevirtual   #322 <Method void a(Canvas, String, float, float, int)>
							}
							if(((BarEntry) (obj)).getIcon() != null && mt1.x())
	//* 236  504:aload           26
	//* 237  506:invokevirtual   #326 <Method Drawable BarEntry.getIcon()>
	//* 238  509:ifnull          598
	//* 239  512:aload           22
	//* 240  514:invokeinterface #329 <Method boolean mt.x()>
	//* 241  519:ifeq            598
							{
								obj = ((Object) (((BarEntry) (obj)).getIcon()));
	//  242  522:aload           26
	//  243  524:invokevirtual   #326 <Method Drawable BarEntry.getIcon()>
	//  244  527:astore          26
								float f10 = lb1.e[i + 2];
	//  245  529:aload           24
	//  246  531:getfield        #227 <Field float[] lb.e>
	//  247  534:iload           13
	//  248  536:iconst_2        
	//  249  537:iadd            
	//  250  538:faload          
	//  251  539:fstore          5
								if(f27 >= 0.0F)
	//* 252  541:fload           8
	//* 253  543:fconst_0        
	//* 254  544:fcmpl           
	//* 255  545:iflt            554
									f1 = f4;
	//  256  548:fload           4
	//  257  550:fstore_3        
	//* 258  551:goto            554
								f4 = nz1.e;
	//  259  554:aload           25
	//  260  556:getfield        #301 <Field float nz.e>
	//  261  559:fstore          4
								float f18 = nz1.c;
	//  262  561:aload           25
	//  263  563:getfield        #303 <Field float nz.c>
	//  264  566:fstore          6
								oc.d(canvas, ((Drawable) (obj)), (int)(f10 + f1 + f4), (int)(f23 + f18), ((Drawable) (obj)).getIntrinsicWidth(), ((Drawable) (obj)).getIntrinsicHeight());
	//  265  568:aload_1         
	//  266  569:aload           26
	//  267  571:fload           5
	//  268  573:fload_3         
	//  269  574:fadd            
	//  270  575:fload           4
	//  271  577:fadd            
	//  272  578:f2i             
	//  273  579:fload           7
	//  274  581:fload           6
	//  275  583:fadd            
	//  276  584:f2i             
	//  277  585:aload           26
	//  278  587:invokevirtual   #334 <Method int Drawable.getIntrinsicWidth()>
	//  279  590:aload           26
	//  280  592:invokevirtual   #337 <Method int Drawable.getIntrinsicHeight()>
	//  281  595:invokestatic    #340 <Method void oc.d(Canvas, Drawable, int, int, int, int)>
							}
						}
						i += 4;
	//  282  598:iload           13
	//  283  600:iconst_4        
	//  284  601:iadd            
	//  285  602:istore          13
					} while(true);
	//  286  604:goto            206
				} else
	//* 287  607:goto            1560
				{
					nv nv1 = e.b(mt1.D());
	//  288  610:aload_0         
	//  289  611:getfield        #113 <Field mo e>
	//  290  614:aload           22
	//  291  616:invokeinterface #119 <Method lp$b mt.D()>
	//  292  621:invokeinterface #124 <Method nv mo.b(lp$b)>
	//  293  626:astore          26
					int j = 0;
	//  294  628:iconst_0        
	//  295  629:istore          13
					int l = 0;
	//  296  631:iconst_0        
	//  297  632:istore          15
					do
					{
						if((float)l >= (float)mt1.C() * this.i.b())
							break;
	//  298  634:iload           15
	//  299  636:i2f             
	//  300  637:aload           22
	//  301  639:invokeinterface #159 <Method int mt.C()>
	//  302  644:i2f             
	//  303  645:aload_0         
	//  304  646:getfield        #58  <Field la i>
	//  305  649:invokevirtual   #141 <Method float la.b()>
	//  306  652:fmul            
	//  307  653:fcmpg           
	//  308  654:ifge            1560
						BarEntry barentry = (BarEntry)mt1.f(l);
	//  309  657:aload           22
	//  310  659:iload           15
	//  311  661:invokeinterface #173 <Method com.github.mikephil.charting.data.Entry mt.f(int)>
	//  312  666:checkcast       #175 <Class BarEntry>
	//  313  669:astore          27
						int l1 = mt1.b(l);
	//  314  671:aload           22
	//  315  673:iload           15
	//  316  675:invokeinterface #320 <Method int mt.b(int)>
	//  317  680:istore          18
						float af[] = barentry.getYVals();
	//  318  682:aload           27
	//  319  684:invokevirtual   #344 <Method float[] BarEntry.getYVals()>
	//  320  687:astore          28
						if(af == null)
	//* 321  689:aload           28
	//* 322  691:ifnonnull       1039
						{
							if(!this.l.f(lb1.e[j + 1]))
	//* 323  694:aload_0         
	//* 324  695:getfield        #104 <Field oa l>
	//* 325  698:aload           24
	//* 326  700:getfield        #227 <Field float[] lb.e>
	//* 327  703:iload           13
	//* 328  705:iconst_1        
	//* 329  706:iadd            
	//* 330  707:faload          
	//* 331  708:invokevirtual   #190 <Method boolean oa.f(float)>
	//* 332  711:ifne            717
								break;
	//  333  714:goto            1560
							if(!this.l.c(lb1.e[j]) || !this.l.h(lb1.e[j + 1]))
	//* 334  717:aload_0         
	//* 335  718:getfield        #104 <Field oa l>
	//* 336  721:aload           24
	//* 337  723:getfield        #227 <Field float[] lb.e>
	//* 338  726:iload           13
	//* 339  728:faload          
	//* 340  729:invokevirtual   #305 <Method boolean oa.c(float)>
	//* 341  732:ifne            738
	//* 342  735:goto            634
	//* 343  738:aload_0         
	//* 344  739:getfield        #104 <Field oa l>
	//* 345  742:aload           24
	//* 346  744:getfield        #227 <Field float[] lb.e>
	//* 347  747:iload           13
	//* 348  749:iconst_1        
	//* 349  750:iadd            
	//* 350  751:faload          
	//* 351  752:invokevirtual   #193 <Method boolean oa.h(float)>
	//* 352  755:ifne            761
								continue;
	//  353  758:goto            634
							String s1 = ml1.b(barentry.getY(), ((com.github.mikephil.charting.data.Entry) (barentry)), k, this.l);
	//  354  761:aload           23
	//  355  763:aload           27
	//  356  765:invokevirtual   #308 <Method float BarEntry.getY()>
	//  357  768:aload           27
	//  358  770:iload           14
	//  359  772:aload_0         
	//  360  773:getfield        #104 <Field oa l>
	//  361  776:invokeinterface #313 <Method String ml.b(float, com.github.mikephil.charting.data.Entry, int, oa)>
	//  362  781:astore          29
							float f24 = oc.d(n, s1);
	//  363  783:aload_0         
	//  364  784:getfield        #21  <Field Paint n>
	//  365  787:aload           29
	//  366  789:invokestatic    #315 <Method int oc.d(Paint, String)>
	//  367  792:i2f             
	//  368  793:fstore          7
							float f11;
							if(flag1)
	//* 369  795:iload           19
	//* 370  797:ifeq            806
								f11 = f;
	//  371  800:fload_2         
	//  372  801:fstore          5
							else
	//* 373  803:goto            813
								f11 = -(f24 + f);
	//  374  806:fload           7
	//  375  808:fload_2         
	//  376  809:fadd            
	//  377  810:fneg            
	//  378  811:fstore          5
							float f19;
							if(flag1)
	//* 379  813:iload           19
	//* 380  815:ifeq            828
								f19 = -(f24 + f);
	//  381  818:fload           7
	//  382  820:fload_2         
	//  383  821:fadd            
	//  384  822:fneg            
	//  385  823:fstore          6
							else
	//* 386  825:goto            831
								f19 = f;
	//  387  828:fload_2         
	//  388  829:fstore          6
							float f5 = f11;
	//  389  831:fload           5
	//  390  833:fstore          4
							float f2 = f19;
	//  391  835:fload           6
	//  392  837:fstore_3        
							if(flag2)
	//* 393  838:iload           20
	//* 394  840:ifeq            858
							{
								f5 = -f11 - f24;
	//  395  843:fload           5
	//  396  845:fneg            
	//  397  846:fload           7
	//  398  848:fsub            
	//  399  849:fstore          4
								f2 = -f19 - f24;
	//  400  851:fload           6
	//  401  853:fneg            
	//  402  854:fload           7
	//  403  856:fsub            
	//  404  857:fstore_3        
							}
							if(mt1.v())
	//* 405  858:aload           22
	//* 406  860:invokeinterface #318 <Method boolean mt.v()>
	//* 407  865:ifeq            927
							{
								float f20 = lb1.e[j + 2];
	//  408  868:aload           24
	//  409  870:getfield        #227 <Field float[] lb.e>
	//  410  873:iload           13
	//  411  875:iconst_2        
	//  412  876:iadd            
	//  413  877:faload          
	//  414  878:fstore          6
								float f12;
								if(barentry.getY() >= 0.0F)
	//* 415  880:aload           27
	//* 416  882:invokevirtual   #308 <Method float BarEntry.getY()>
	//* 417  885:fconst_0        
	//* 418  886:fcmpl           
	//* 419  887:iflt            897
									f12 = f5;
	//  420  890:fload           4
	//  421  892:fstore          5
								else
	//* 422  894:goto            900
									f12 = f2;
	//  423  897:fload_3         
	//  424  898:fstore          5
								a(canvas, s1, f20 + f12, lb1.e[j + 1] + f29, l1);
	//  425  900:aload_0         
	//  426  901:aload_1         
	//  427  902:aload           29
	//  428  904:fload           6
	//  429  906:fload           5
	//  430  908:fadd            
	//  431  909:aload           24
	//  432  911:getfield        #227 <Field float[] lb.e>
	//  433  914:iload           13
	//  434  916:iconst_1        
	//  435  917:iadd            
	//  436  918:faload          
	//  437  919:fload           9
	//  438  921:fadd            
	//  439  922:iload           18
	//  440  924:invokevirtual   #322 <Method void a(Canvas, String, float, float, int)>
							}
							if(barentry.getIcon() != null && mt1.x())
	//* 441  927:aload           27
	//* 442  929:invokevirtual   #326 <Method Drawable BarEntry.getIcon()>
	//* 443  932:ifnull          1036
	//* 444  935:aload           22
	//* 445  937:invokeinterface #329 <Method boolean mt.x()>
	//* 446  942:ifeq            1036
							{
								Drawable drawable = barentry.getIcon();
	//  447  945:aload           27
	//  448  947:invokevirtual   #326 <Method Drawable BarEntry.getIcon()>
	//  449  950:astore          29
								float f13 = lb1.e[j + 2];
	//  450  952:aload           24
	//  451  954:getfield        #227 <Field float[] lb.e>
	//  452  957:iload           13
	//  453  959:iconst_2        
	//  454  960:iadd            
	//  455  961:faload          
	//  456  962:fstore          5
								if(barentry.getY() >= 0.0F)
	//* 457  964:aload           27
	//* 458  966:invokevirtual   #308 <Method float BarEntry.getY()>
	//* 459  969:fconst_0        
	//* 460  970:fcmpl           
	//* 461  971:iflt            980
									f2 = f5;
	//  462  974:fload           4
	//  463  976:fstore_3        
	//* 464  977:goto            980
								f5 = lb1.e[j + 1];
	//  465  980:aload           24
	//  466  982:getfield        #227 <Field float[] lb.e>
	//  467  985:iload           13
	//  468  987:iconst_1        
	//  469  988:iadd            
	//  470  989:faload          
	//  471  990:fstore          4
								float f21 = nz1.e;
	//  472  992:aload           25
	//  473  994:getfield        #301 <Field float nz.e>
	//  474  997:fstore          6
								float f25 = nz1.c;
	//  475  999:aload           25
	//  476 1001:getfield        #303 <Field float nz.c>
	//  477 1004:fstore          7
								oc.d(canvas, drawable, (int)(f13 + f2 + f21), (int)(f5 + f25), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
	//  478 1006:aload_1         
	//  479 1007:aload           29
	//  480 1009:fload           5
	//  481 1011:fload_3         
	//  482 1012:fadd            
	//  483 1013:fload           6
	//  484 1015:fadd            
	//  485 1016:f2i             
	//  486 1017:fload           4
	//  487 1019:fload           7
	//  488 1021:fadd            
	//  489 1022:f2i             
	//  490 1023:aload           29
	//  491 1025:invokevirtual   #334 <Method int Drawable.getIntrinsicWidth()>
	//  492 1028:aload           29
	//  493 1030:invokevirtual   #337 <Method int Drawable.getIntrinsicHeight()>
	//  494 1033:invokestatic    #340 <Method void oc.d(Canvas, Drawable, int, int, int, int)>
							}
						} else
	//* 495 1036:goto            1527
						{
							float af1[] = new float[af.length * 2];
	//  496 1039:aload           28
	//  497 1041:arraylength     
	//  498 1042:iconst_2        
	//  499 1043:imul            
	//  500 1044:newarray        float[]
	//  501 1046:astore          29
							float f28 = 0.0F;
	//  502 1048:fconst_0        
	//  503 1049:fstore          8
							float f3 = -barentry.getNegativeSum();
	//  504 1051:aload           27
	//  505 1053:invokevirtual   #347 <Method float BarEntry.getNegativeSum()>
	//  506 1056:fneg            
	//  507 1057:fstore_3        
							int k1 = 0;
	//  508 1058:iconst_0        
	//  509 1059:istore          17
							int i1 = 0;
	//  510 1061:iconst_0        
	//  511 1062:istore          16
							while(k1 < af1.length) 
	//* 512 1064:iload           17
	//* 513 1066:aload           29
	//* 514 1068:arraylength     
	//* 515 1069:icmpge          1178
							{
								float f14 = af[i1];
	//  516 1072:aload           28
	//  517 1074:iload           16
	//  518 1076:faload          
	//  519 1077:fstore          5
								float f6;
								if(f14 == 0.0F && (f28 == 0.0F || f3 == 0.0F))
	//* 520 1079:fload           5
	//* 521 1081:fconst_0        
	//* 522 1082:fcmpl           
	//* 523 1083:ifne            1108
	//* 524 1086:fload           8
	//* 525 1088:fconst_0        
	//* 526 1089:fcmpl           
	//* 527 1090:ifeq            1099
	//* 528 1093:fload_3         
	//* 529 1094:fconst_0        
	//* 530 1095:fcmpl           
	//* 531 1096:ifne            1108
								{
									f6 = f3;
	//  532 1099:fload_3         
	//  533 1100:fstore          4
									f3 = f14;
	//  534 1102:fload           5
	//  535 1104:fstore_3        
								} else
	//* 536 1105:goto            1151
								if(f14 >= 0.0F)
	//* 537 1108:fload           5
	//* 538 1110:fconst_0        
	//* 539 1111:fcmpl           
	//* 540 1112:iflt            1135
								{
									f28 += f14;
	//  541 1115:fload           8
	//  542 1117:fload           5
	//  543 1119:fadd            
	//  544 1120:fstore          8
									f14 = f28;
	//  545 1122:fload           8
	//  546 1124:fstore          5
									f6 = f3;
	//  547 1126:fload_3         
	//  548 1127:fstore          4
									f3 = f14;
	//  549 1129:fload           5
	//  550 1131:fstore_3        
								} else
	//* 551 1132:goto            1151
								{
									f6 = f3;
	//  552 1135:fload_3         
	//  553 1136:fstore          4
									f14 = f3 - f14;
	//  554 1138:fload_3         
	//  555 1139:fload           5
	//  556 1141:fsub            
	//  557 1142:fstore          5
									f3 = f6;
	//  558 1144:fload           4
	//  559 1146:fstore_3        
									f6 = f14;
	//  560 1147:fload           5
	//  561 1149:fstore          4
								}
								af1[k1] = f3 * f30;
	//  562 1151:aload           29
	//  563 1153:iload           17
	//  564 1155:fload_3         
	//  565 1156:fload           10
	//  566 1158:fmul            
	//  567 1159:fastore         
								k1 += 2;
	//  568 1160:iload           17
	//  569 1162:iconst_2        
	//  570 1163:iadd            
	//  571 1164:istore          17
								i1++;
	//  572 1166:iload           16
	//  573 1168:iconst_1        
	//  574 1169:iadd            
	//  575 1170:istore          16
								f3 = f6;
	//  576 1172:fload           4
	//  577 1174:fstore_3        
							}
	//* 578 1175:goto            1064
							nv1.e(af1);
	//  579 1178:aload           26
	//  580 1180:aload           29
	//  581 1182:invokevirtual   #230 <Method void nv.e(float[])>
							for(int j1 = 0; j1 < af1.length; j1 += 2)
	//* 582 1185:iconst_0        
	//* 583 1186:istore          16
	//* 584 1188:iload           16
	//* 585 1190:aload           29
	//* 586 1192:arraylength     
	//* 587 1193:icmpge          1527
							{
								float f31 = af[j1 / 2];
	//  588 1196:aload           28
	//  589 1198:iload           16
	//  590 1200:iconst_2        
	//  591 1201:idiv            
	//  592 1202:faload          
	//  593 1203:fstore          11
								String s2 = ml1.b(f31, ((com.github.mikephil.charting.data.Entry) (barentry)), k, this.l);
	//  594 1205:aload           23
	//  595 1207:fload           11
	//  596 1209:aload           27
	//  597 1211:iload           14
	//  598 1213:aload_0         
	//  599 1214:getfield        #104 <Field oa l>
	//  600 1217:invokeinterface #313 <Method String ml.b(float, com.github.mikephil.charting.data.Entry, int, oa)>
	//  601 1222:astore          30
								float f32 = oc.d(n, s2);
	//  602 1224:aload_0         
	//  603 1225:getfield        #21  <Field Paint n>
	//  604 1228:aload           30
	//  605 1230:invokestatic    #315 <Method int oc.d(Paint, String)>
	//  606 1233:i2f             
	//  607 1234:fstore          12
								float f7;
								if(flag1)
	//* 608 1236:iload           19
	//* 609 1238:ifeq            1247
									f7 = f;
	//  610 1241:fload_2         
	//  611 1242:fstore          4
								else
	//* 612 1244:goto            1254
									f7 = -(f32 + f);
	//  613 1247:fload           12
	//  614 1249:fload_2         
	//  615 1250:fadd            
	//  616 1251:fneg            
	//  617 1252:fstore          4
								float f22;
								if(flag1)
	//* 618 1254:iload           19
	//* 619 1256:ifeq            1269
									f22 = -(f32 + f);
	//  620 1259:fload           12
	//  621 1261:fload_2         
	//  622 1262:fadd            
	//  623 1263:fneg            
	//  624 1264:fstore          6
								else
	//* 625 1266:goto            1272
									f22 = f;
	//  626 1269:fload_2         
	//  627 1270:fstore          6
								float f26 = f7;
	//  628 1272:fload           4
	//  629 1274:fstore          7
								float f15 = f22;
	//  630 1276:fload           6
	//  631 1278:fstore          5
								if(flag2)
	//* 632 1280:iload           20
	//* 633 1282:ifeq            1301
								{
									f26 = -f7 - f32;
	//  634 1285:fload           4
	//  635 1287:fneg            
	//  636 1288:fload           12
	//  637 1290:fsub            
	//  638 1291:fstore          7
									f15 = -f22 - f32;
	//  639 1293:fload           6
	//  640 1295:fneg            
	//  641 1296:fload           12
	//  642 1298:fsub            
	//  643 1299:fstore          5
								}
								boolean flag;
								if(f31 == 0.0F && f3 == 0.0F && f28 > 0.0F || f31 < 0.0F)
	//* 644 1301:fload           11
	//* 645 1303:fconst_0        
	//* 646 1304:fcmpl           
	//* 647 1305:ifne            1321
	//* 648 1308:fload_3         
	//* 649 1309:fconst_0        
	//* 650 1310:fcmpl           
	//* 651 1311:ifne            1321
	//* 652 1314:fload           8
	//* 653 1316:fconst_0        
	//* 654 1317:fcmpl           
	//* 655 1318:ifgt            1328
	//* 656 1321:fload           11
	//* 657 1323:fconst_0        
	//* 658 1324:fcmpg           
	//* 659 1325:ifge            1334
									flag = true;
	//  660 1328:iconst_1        
	//  661 1329:istore          17
								else
	//* 662 1331:goto            1337
									flag = false;
	//  663 1334:iconst_0        
	//  664 1335:istore          17
								f7 = af1[j1];
	//  665 1337:aload           29
	//  666 1339:iload           16
	//  667 1341:faload          
	//  668 1342:fstore          4
								if(!flag)
	//* 669 1344:iload           17
	//* 670 1346:ifeq            1352
	//* 671 1349:goto            1356
									f15 = f26;
	//  672 1352:fload           7
	//  673 1354:fstore          5
								f7 += f15;
	//  674 1356:fload           4
	//  675 1358:fload           5
	//  676 1360:fadd            
	//  677 1361:fstore          4
								f15 = (lb1.e[j + 1] + lb1.e[j + 3]) / 2.0F;
	//  678 1363:aload           24
	//  679 1365:getfield        #227 <Field float[] lb.e>
	//  680 1368:iload           13
	//  681 1370:iconst_1        
	//  682 1371:iadd            
	//  683 1372:faload          
	//  684 1373:aload           24
	//  685 1375:getfield        #227 <Field float[] lb.e>
	//  686 1378:iload           13
	//  687 1380:iconst_3        
	//  688 1381:iadd            
	//  689 1382:faload          
	//  690 1383:fadd            
	//  691 1384:fconst_2        
	//  692 1385:fdiv            
	//  693 1386:fstore          5
								if(!this.l.f(f15))
	//* 694 1388:aload_0         
	//* 695 1389:getfield        #104 <Field oa l>
	//* 696 1392:fload           5
	//* 697 1394:invokevirtual   #190 <Method boolean oa.f(float)>
	//* 698 1397:ifne            1403
									break;
	//  699 1400:goto            1527
								if(!this.l.c(f7) || !this.l.h(f15))
	//* 700 1403:aload_0         
	//* 701 1404:getfield        #104 <Field oa l>
	//* 702 1407:fload           4
	//* 703 1409:invokevirtual   #305 <Method boolean oa.c(float)>
	//* 704 1412:ifne            1418
	//* 705 1415:goto            1518
	//* 706 1418:aload_0         
	//* 707 1419:getfield        #104 <Field oa l>
	//* 708 1422:fload           5
	//* 709 1424:invokevirtual   #193 <Method boolean oa.h(float)>
	//* 710 1427:ifne            1433
									continue;
	//  711 1430:goto            1518
								if(mt1.v())
	//* 712 1433:aload           22
	//* 713 1435:invokeinterface #318 <Method boolean mt.v()>
	//* 714 1440:ifeq            1459
									a(canvas, s2, f7, f15 + f29, l1);
	//  715 1443:aload_0         
	//  716 1444:aload_1         
	//  717 1445:aload           30
	//  718 1447:fload           4
	//  719 1449:fload           5
	//  720 1451:fload           9
	//  721 1453:fadd            
	//  722 1454:iload           18
	//  723 1456:invokevirtual   #322 <Method void a(Canvas, String, float, float, int)>
								if(barentry.getIcon() != null && mt1.x())
	//* 724 1459:aload           27
	//* 725 1461:invokevirtual   #326 <Method Drawable BarEntry.getIcon()>
	//* 726 1464:ifnull          1518
	//* 727 1467:aload           22
	//* 728 1469:invokeinterface #329 <Method boolean mt.x()>
	//* 729 1474:ifeq            1518
								{
									Drawable drawable1 = barentry.getIcon();
	//  730 1477:aload           27
	//  731 1479:invokevirtual   #326 <Method Drawable BarEntry.getIcon()>
	//  732 1482:astore          30
									oc.d(canvas, drawable1, (int)(nz1.e + f7), (int)(nz1.c + f15), drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight());
	//  733 1484:aload_1         
	//  734 1485:aload           30
	//  735 1487:aload           25
	//  736 1489:getfield        #301 <Field float nz.e>
	//  737 1492:fload           4
	//  738 1494:fadd            
	//  739 1495:f2i             
	//  740 1496:aload           25
	//  741 1498:getfield        #303 <Field float nz.c>
	//  742 1501:fload           5
	//  743 1503:fadd            
	//  744 1504:f2i             
	//  745 1505:aload           30
	//  746 1507:invokevirtual   #334 <Method int Drawable.getIntrinsicWidth()>
	//  747 1510:aload           30
	//  748 1512:invokevirtual   #337 <Method int Drawable.getIntrinsicHeight()>
	//  749 1515:invokestatic    #340 <Method void oc.d(Canvas, Drawable, int, int, int, int)>
								}
							}

	//  750 1518:iload           16
	//  751 1520:iconst_2        
	//  752 1521:iadd            
	//  753 1522:istore          16
						}
	//* 754 1524:goto            1188
						if(af == null)
	//* 755 1527:aload           28
	//* 756 1529:ifnonnull       1541
							j += 4;
	//  757 1532:iload           13
	//  758 1534:iconst_4        
	//  759 1535:iadd            
	//  760 1536:istore          13
						else
	//* 761 1538:goto            1551
							j += af.length * 4;
	//  762 1541:iload           13
	//  763 1543:aload           28
	//  764 1545:arraylength     
	//  765 1546:iconst_4        
	//  766 1547:imul            
	//  767 1548:iadd            
	//  768 1549:istore          13
						l++;
	//  769 1551:iload           15
	//  770 1553:iconst_1        
	//  771 1554:iadd            
	//  772 1555:istore          15
					} while(true);
	//  773 1557:goto            634
				}
				nz.c(nz1);
	//  774 1560:aload           25
	//  775 1562:invokestatic    #350 <Method void nz.c(nz)>
			}

	//  776 1565:iload           14
	//  777 1567:iconst_1        
	//  778 1568:iadd            
	//  779 1569:istore          14
		}
	//* 780 1571:goto            46
	//  781 1574:return          
	}

	private RectF m;
}
