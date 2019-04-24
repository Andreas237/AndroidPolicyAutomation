// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

// Referenced classes of package o:
//			nk, mo, lo, mt, 
//			la, nv, mh, oc, 
//			oa, lb, mp, nz

public class nh extends nk
{

	public nh(mo mo1, la la1, oa oa1)
	{
		super(la1, oa1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #19  <Method void nk(la, oa)>
		a = new RectF();
	//    4    6:aload_0         
	//    5    7:new             #21  <Class RectF>
	//    6   10:dup             
	//    7   11:invokespecial   #24  <Method void RectF()>
	//    8   14:putfield        #26  <Field RectF a>
		o = new RectF();
	//    9   17:aload_0         
	//   10   18:new             #21  <Class RectF>
	//   11   21:dup             
	//   12   22:invokespecial   #24  <Method void RectF()>
	//   13   25:putfield        #28  <Field RectF o>
		e = mo1;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #30  <Field mo e>
		k = new Paint(1);
	//   17   33:aload_0         
	//   18   34:new             #32  <Class Paint>
	//   19   37:dup             
	//   20   38:iconst_1        
	//   21   39:invokespecial   #35  <Method void Paint(int)>
	//   22   42:putfield        #38  <Field Paint k>
		k.setStyle(android.graphics.Paint.Style.FILL);
	//   23   45:aload_0         
	//   24   46:getfield        #38  <Field Paint k>
	//   25   49:getstatic       #44  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   26   52:invokevirtual   #48  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		k.setColor(Color.rgb(0, 0, 0));
	//   27   55:aload_0         
	//   28   56:getfield        #38  <Field Paint k>
	//   29   59:iconst_0        
	//   30   60:iconst_0        
	//   31   61:iconst_0        
	//   32   62:invokestatic    #54  <Method int Color.rgb(int, int, int)>
	//   33   65:invokevirtual   #57  <Method void Paint.setColor(int)>
		k.setAlpha(120);
	//   34   68:aload_0         
	//   35   69:getfield        #38  <Field Paint k>
	//   36   72:bipush          120
	//   37   74:invokevirtual   #60  <Method void Paint.setAlpha(int)>
		d = new Paint(1);
	//   38   77:aload_0         
	//   39   78:new             #32  <Class Paint>
	//   40   81:dup             
	//   41   82:iconst_1        
	//   42   83:invokespecial   #35  <Method void Paint(int)>
	//   43   86:putfield        #62  <Field Paint d>
		d.setStyle(android.graphics.Paint.Style.FILL);
	//   44   89:aload_0         
	//   45   90:getfield        #62  <Field Paint d>
	//   46   93:getstatic       #44  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   47   96:invokevirtual   #48  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		b = new Paint(1);
	//   48   99:aload_0         
	//   49  100:new             #32  <Class Paint>
	//   50  103:dup             
	//   51  104:iconst_1        
	//   52  105:invokespecial   #35  <Method void Paint(int)>
	//   53  108:putfield        #64  <Field Paint b>
		b.setStyle(android.graphics.Paint.Style.STROKE);
	//   54  111:aload_0         
	//   55  112:getfield        #64  <Field Paint b>
	//   56  115:getstatic       #67  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   57  118:invokevirtual   #48  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   58  121:return          
	}

	public void a(Canvas canvas)
	{
		lo lo1 = e.getBarData();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field mo e>
	//    2    4:invokeinterface #75  <Method lo mo.getBarData()>
	//    3    9:astore_3        
		for(int i = 0; i < lo1.e(); i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #80  <Method int lo.e()>
	//*   9   17:icmpge          55
		{
			mt mt1 = (mt)lo1.a(i);
	//   10   20:aload_3         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #83  <Method mz lo.a(int)>
	//   13   25:checkcast       #85  <Class mt>
	//   14   28:astore          4
			if(mt1.j())
	//*  15   30:aload           4
	//*  16   32:invokeinterface #89  <Method boolean mt.j()>
	//*  17   37:ifeq            48
				d(canvas, mt1, i);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:aload           4
	//   21   44:iload_2         
	//   22   45:invokevirtual   #92  <Method void d(Canvas, mt, int)>
		}

	//   23   48:iload_2         
	//   24   49:iconst_1        
	//   25   50:iadd            
	//   26   51:istore_2        
	//*  27   52:goto            12
	//   28   55:return          
	}

	protected void b(float f, float f1, float f2, float f3, nv nv1)
	{
		a.set(f - f3, f1, f + f3, f2);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RectF a>
	//    2    4:fload_1         
	//    3    5:fload           4
	//    4    7:fsub            
	//    5    8:fload_2         
	//    6    9:fload_1         
	//    7   10:fload           4
	//    8   12:fadd            
	//    9   13:fload_3         
	//   10   14:invokevirtual   #97  <Method void RectF.set(float, float, float, float)>
		nv1.d(a, i.d());
	//   11   17:aload           5
	//   12   19:aload_0         
	//   13   20:getfield        #26  <Field RectF a>
	//   14   23:aload_0         
	//   15   24:getfield        #101 <Field la i>
	//   16   27:invokevirtual   #106 <Method float la.d()>
	//   17   30:invokevirtual   #111 <Method void nv.d(RectF, float)>
	//   18   33:return          
	}

	protected void c(mh mh1, RectF rectf)
	{
		mh1.e(rectf.centerX(), rectf.top);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #115 <Method float RectF.centerX()>
	//    3    5:aload_2         
	//    4    6:getfield        #119 <Field float RectF.top>
	//    5    9:invokevirtual   #124 <Method void mh.e(float, float)>
	//    6   12:return          
	}

	public void d(Canvas canvas)
	{
	//    0    0:return          
	}

	protected void d(Canvas canvas, mt mt1, int i)
	{
		nv nv1 = e.b(mt1.D());
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field mo e>
	//    2    4:aload_2         
	//    3    5:invokeinterface #128 <Method lp$b mt.D()>
	//    4   10:invokeinterface #131 <Method nv mo.b(lp$b)>
	//    5   15:astore          11
		b.setColor(mt1.e());
	//    6   17:aload_0         
	//    7   18:getfield        #64  <Field Paint b>
	//    8   21:aload_2         
	//    9   22:invokeinterface #132 <Method int mt.e()>
	//   10   27:invokevirtual   #57  <Method void Paint.setColor(int)>
		b.setStrokeWidth(oc.b(mt1.c()));
	//   11   30:aload_0         
	//   12   31:getfield        #64  <Field Paint b>
	//   13   34:aload_2         
	//   14   35:invokeinterface #134 <Method float mt.c()>
	//   15   40:invokestatic    #139 <Method float oc.b(float)>
	//   16   43:invokevirtual   #143 <Method void Paint.setStrokeWidth(float)>
		boolean flag;
		if(mt1.c() > 0.0F)
	//*  17   46:aload_2         
	//*  18   47:invokeinterface #134 <Method float mt.c()>
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
	//   28   67:getfield        #101 <Field la i>
	//   29   70:invokevirtual   #145 <Method float la.b()>
	//   30   73:fstore          4
		float f1 = this.i.d();
	//   31   75:aload_0         
	//   32   76:getfield        #101 <Field la i>
	//   33   79:invokevirtual   #106 <Method float la.d()>
	//   34   82:fstore          5
		if(e.e())
	//*  35   84:aload_0         
	//*  36   85:getfield        #30  <Field mo e>
	//*  37   88:invokeinterface #147 <Method boolean mo.e()>
	//*  38   93:ifeq            299
		{
			d.setColor(mt1.b());
	//   39   96:aload_0         
	//   40   97:getfield        #62  <Field Paint d>
	//   41  100:aload_2         
	//   42  101:invokeinterface #149 <Method int mt.b()>
	//   43  106:invokevirtual   #57  <Method void Paint.setColor(int)>
			float f2 = e.getBarData().a() / 2.0F;
	//   44  109:aload_0         
	//   45  110:getfield        #30  <Field mo e>
	//   46  113:invokeinterface #75  <Method lo mo.getBarData()>
	//   47  118:invokevirtual   #151 <Method float lo.a()>
	//   48  121:fconst_2        
	//   49  122:fdiv            
	//   50  123:fstore          6
			int j = 0;
	//   51  125:iconst_0        
	//   52  126:istore          9
			for(int l = Math.min((int)Math.ceil((float)mt1.C() * f), mt1.C()); j < l; j++)
	//*  53  128:aload_2         
	//*  54  129:invokeinterface #154 <Method int mt.C()>
	//*  55  134:i2f             
	//*  56  135:fload           4
	//*  57  137:fmul            
	//*  58  138:f2d             
	//*  59  139:invokestatic    #160 <Method double Math.ceil(double)>
	//*  60  142:d2i             
	//*  61  143:aload_2         
	//*  62  144:invokeinterface #154 <Method int mt.C()>
	//*  63  149:invokestatic    #164 <Method int Math.min(int, int)>
	//*  64  152:istore          10
	//*  65  154:iload           9
	//*  66  156:iload           10
	//*  67  158:icmpge          299
			{
				float f3 = ((BarEntry)mt1.f(j)).getX();
	//   68  161:aload_2         
	//   69  162:iload           9
	//   70  164:invokeinterface #168 <Method com.github.mikephil.charting.data.Entry mt.f(int)>
	//   71  169:checkcast       #170 <Class BarEntry>
	//   72  172:invokevirtual   #173 <Method float BarEntry.getX()>
	//   73  175:fstore          7
				o.left = f3 - f2;
	//   74  177:aload_0         
	//   75  178:getfield        #28  <Field RectF o>
	//   76  181:fload           7
	//   77  183:fload           6
	//   78  185:fsub            
	//   79  186:putfield        #176 <Field float RectF.left>
				o.right = f3 + f2;
	//   80  189:aload_0         
	//   81  190:getfield        #28  <Field RectF o>
	//   82  193:fload           7
	//   83  195:fload           6
	//   84  197:fadd            
	//   85  198:putfield        #179 <Field float RectF.right>
				nv1.b(o);
	//   86  201:aload           11
	//   87  203:aload_0         
	//   88  204:getfield        #28  <Field RectF o>
	//   89  207:invokevirtual   #182 <Method void nv.b(RectF)>
				if(!this.l.i(o.right))
	//*  90  210:aload_0         
	//*  91  211:getfield        #186 <Field oa l>
	//*  92  214:aload_0         
	//*  93  215:getfield        #28  <Field RectF o>
	//*  94  218:getfield        #179 <Field float RectF.right>
	//*  95  221:invokevirtual   #191 <Method boolean oa.i(float)>
	//*  96  224:ifne            230
					continue;
	//   97  227:goto            290
				if(!this.l.k(o.left))
	//*  98  230:aload_0         
	//*  99  231:getfield        #186 <Field oa l>
	//* 100  234:aload_0         
	//* 101  235:getfield        #28  <Field RectF o>
	//* 102  238:getfield        #176 <Field float RectF.left>
	//* 103  241:invokevirtual   #193 <Method boolean oa.k(float)>
	//* 104  244:ifne            250
					break;
	//  105  247:goto            299
				o.top = this.l.e();
	//  106  250:aload_0         
	//  107  251:getfield        #28  <Field RectF o>
	//  108  254:aload_0         
	//  109  255:getfield        #186 <Field oa l>
	//  110  258:invokevirtual   #195 <Method float oa.e()>
	//  111  261:putfield        #119 <Field float RectF.top>
				o.bottom = this.l.i();
	//  112  264:aload_0         
	//  113  265:getfield        #28  <Field RectF o>
	//  114  268:aload_0         
	//  115  269:getfield        #186 <Field oa l>
	//  116  272:invokevirtual   #197 <Method float oa.i()>
	//  117  275:putfield        #200 <Field float RectF.bottom>
				canvas.drawRect(o, d);
	//  118  278:aload_1         
	//  119  279:aload_0         
	//  120  280:getfield        #28  <Field RectF o>
	//  121  283:aload_0         
	//  122  284:getfield        #62  <Field Paint d>
	//  123  287:invokevirtual   #206 <Method void Canvas.drawRect(RectF, Paint)>
			}

	//  124  290:iload           9
	//  125  292:iconst_1        
	//  126  293:iadd            
	//  127  294:istore          9
		}
	//* 128  296:goto            154
		lb lb1 = c[i];
	//  129  299:aload_0         
	//  130  300:getfield        #208 <Field lb[] c>
	//  131  303:iload_3         
	//  132  304:aaload          
	//  133  305:astore          12
		lb1.b(f, f1);
	//  134  307:aload           12
	//  135  309:fload           4
	//  136  311:fload           5
	//  137  313:invokevirtual   #212 <Method void lb.b(float, float)>
		lb1.e(i);
	//  138  316:aload           12
	//  139  318:iload_3         
	//  140  319:invokevirtual   #214 <Method void lb.e(int)>
		lb1.b(e.c(mt1.D()));
	//  141  322:aload           12
	//  142  324:aload_0         
	//  143  325:getfield        #30  <Field mo e>
	//  144  328:aload_2         
	//  145  329:invokeinterface #128 <Method lp$b mt.D()>
	//  146  334:invokeinterface #217 <Method boolean mo.c(lp$b)>
	//  147  339:invokevirtual   #220 <Method void lb.b(boolean)>
		lb1.d(e.getBarData().a());
	//  148  342:aload           12
	//  149  344:aload_0         
	//  150  345:getfield        #30  <Field mo e>
	//  151  348:invokeinterface #75  <Method lo mo.getBarData()>
	//  152  353:invokevirtual   #151 <Method float lo.a()>
	//  153  356:invokevirtual   #222 <Method void lb.d(float)>
		lb1.e(mt1);
	//  154  359:aload           12
	//  155  361:aload_2         
	//  156  362:invokevirtual   #225 <Method void lb.e(mt)>
		nv1.e(lb1.e);
	//  157  365:aload           11
	//  158  367:aload           12
	//  159  369:getfield        #228 <Field float[] lb.e>
	//  160  372:invokevirtual   #231 <Method void nv.e(float[])>
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
	//  174  402:getfield        #242 <Field Paint h>
	//  175  405:aload_2         
	//  176  406:invokeinterface #245 <Method int mt.m()>
	//  177  411:invokevirtual   #57  <Method void Paint.setColor(int)>
		for(int k = 0; k < lb1.a(); k += 4)
	//* 178  414:iconst_0        
	//* 179  415:istore          9
	//* 180  417:iload           9
	//* 181  419:aload           12
	//* 182  421:invokevirtual   #247 <Method int lb.a()>
	//* 183  424:icmpge          596
		{
			if(!this.l.i(lb1.e[k + 2]))
	//* 184  427:aload_0         
	//* 185  428:getfield        #186 <Field oa l>
	//* 186  431:aload           12
	//* 187  433:getfield        #228 <Field float[] lb.e>
	//* 188  436:iload           9
	//* 189  438:iconst_2        
	//* 190  439:iadd            
	//* 191  440:faload          
	//* 192  441:invokevirtual   #191 <Method boolean oa.i(float)>
	//* 193  444:ifne            450
				continue;
	//  194  447:goto            587
			if(!this.l.k(lb1.e[k]))
	//* 195  450:aload_0         
	//* 196  451:getfield        #186 <Field oa l>
	//* 197  454:aload           12
	//* 198  456:getfield        #228 <Field float[] lb.e>
	//* 199  459:iload           9
	//* 200  461:faload          
	//* 201  462:invokevirtual   #193 <Method boolean oa.k(float)>
	//* 202  465:ifne            469
				return;
	//  203  468:return          
			if(i == 0)
	//* 204  469:iload_3         
	//* 205  470:ifne            490
				h.setColor(mt1.e(k / 4));
	//  206  473:aload_0         
	//  207  474:getfield        #242 <Field Paint h>
	//  208  477:aload_2         
	//  209  478:iload           9
	//  210  480:iconst_4        
	//  211  481:idiv            
	//  212  482:invokeinterface #250 <Method int mt.e(int)>
	//  213  487:invokevirtual   #57  <Method void Paint.setColor(int)>
			canvas.drawRect(lb1.e[k], lb1.e[k + 1], lb1.e[k + 2], lb1.e[k + 3], h);
	//  214  490:aload_1         
	//  215  491:aload           12
	//  216  493:getfield        #228 <Field float[] lb.e>
	//  217  496:iload           9
	//  218  498:faload          
	//  219  499:aload           12
	//  220  501:getfield        #228 <Field float[] lb.e>
	//  221  504:iload           9
	//  222  506:iconst_1        
	//  223  507:iadd            
	//  224  508:faload          
	//  225  509:aload           12
	//  226  511:getfield        #228 <Field float[] lb.e>
	//  227  514:iload           9
	//  228  516:iconst_2        
	//  229  517:iadd            
	//  230  518:faload          
	//  231  519:aload           12
	//  232  521:getfield        #228 <Field float[] lb.e>
	//  233  524:iload           9
	//  234  526:iconst_3        
	//  235  527:iadd            
	//  236  528:faload          
	//  237  529:aload_0         
	//  238  530:getfield        #242 <Field Paint h>
	//  239  533:invokevirtual   #253 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			if(flag)
	//* 240  536:iload           8
	//* 241  538:ifeq            587
				canvas.drawRect(lb1.e[k], lb1.e[k + 1], lb1.e[k + 2], lb1.e[k + 3], b);
	//  242  541:aload_1         
	//  243  542:aload           12
	//  244  544:getfield        #228 <Field float[] lb.e>
	//  245  547:iload           9
	//  246  549:faload          
	//  247  550:aload           12
	//  248  552:getfield        #228 <Field float[] lb.e>
	//  249  555:iload           9
	//  250  557:iconst_1        
	//  251  558:iadd            
	//  252  559:faload          
	//  253  560:aload           12
	//  254  562:getfield        #228 <Field float[] lb.e>
	//  255  565:iload           9
	//  256  567:iconst_2        
	//  257  568:iadd            
	//  258  569:faload          
	//  259  570:aload           12
	//  260  572:getfield        #228 <Field float[] lb.e>
	//  261  575:iload           9
	//  262  577:iconst_3        
	//  263  578:iadd            
	//  264  579:faload          
	//  265  580:aload_0         
	//  266  581:getfield        #64  <Field Paint b>
	//  267  584:invokevirtual   #253 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}

	//  268  587:iload           9
	//  269  589:iconst_4        
	//  270  590:iadd            
	//  271  591:istore          9
	//* 272  593:goto            417
	//  273  596:return          
	}

	public void d(Canvas canvas, mh amh[])
	{
		lo lo1 = e.getBarData();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field mo e>
	//    2    4:invokeinterface #75  <Method lo mo.getBarData()>
	//    3    9:astore          8
		int j = amh.length;
	//    4   11:aload_2         
	//    5   12:arraylength     
	//    6   13:istore          7
		for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore          5
	//*   9   18:iload           5
	//*  10   20:iload           7
	//*  11   22:icmpge          295
		{
			mh mh1 = amh[i];
	//   12   25:aload_2         
	//   13   26:iload           5
	//   14   28:aaload          
	//   15   29:astore          9
			mt mt1 = (mt)lo1.a(mh1.g());
	//   16   31:aload           8
	//   17   33:aload           9
	//   18   35:invokevirtual   #257 <Method int mh.g()>
	//   19   38:invokevirtual   #83  <Method mz lo.a(int)>
	//   20   41:checkcast       #85  <Class mt>
	//   21   44:astore          12
			if(mt1 == null || !mt1.n())
	//*  22   46:aload           12
	//*  23   48:ifnull          286
	//*  24   51:aload           12
	//*  25   53:invokeinterface #260 <Method boolean mt.n()>
	//*  26   58:ifne            64
				continue;
	//   27   61:goto            286
			BarEntry barentry = (BarEntry)mt1.e(mh1.b(), mh1.d());
	//   28   64:aload           12
	//   29   66:aload           9
	//   30   68:invokevirtual   #261 <Method float mh.b()>
	//   31   71:aload           9
	//   32   73:invokevirtual   #262 <Method float mh.d()>
	//   33   76:invokeinterface #265 <Method com.github.mikephil.charting.data.Entry mt.e(float, float)>
	//   34   81:checkcast       #170 <Class BarEntry>
	//   35   84:astore          10
			if(!d(((com.github.mikephil.charting.data.Entry) (barentry)), ((mv) (mt1))))
	//*  36   86:aload_0         
	//*  37   87:aload           10
	//*  38   89:aload           12
	//*  39   91:invokevirtual   #268 <Method boolean d(com.github.mikephil.charting.data.Entry, mv)>
	//*  40   94:ifne            100
				continue;
	//   41   97:goto            286
			nv nv1 = e.b(mt1.D());
	//   42  100:aload_0         
	//   43  101:getfield        #30  <Field mo e>
	//   44  104:aload           12
	//   45  106:invokeinterface #128 <Method lp$b mt.D()>
	//   46  111:invokeinterface #131 <Method nv mo.b(lp$b)>
	//   47  116:astore          11
			k.setColor(mt1.f());
	//   48  118:aload_0         
	//   49  119:getfield        #38  <Field Paint k>
	//   50  122:aload           12
	//   51  124:invokeinterface #270 <Method int mt.f()>
	//   52  129:invokevirtual   #57  <Method void Paint.setColor(int)>
			k.setAlpha(mt1.h());
	//   53  132:aload_0         
	//   54  133:getfield        #38  <Field Paint k>
	//   55  136:aload           12
	//   56  138:invokeinterface #272 <Method int mt.h()>
	//   57  143:invokevirtual   #60  <Method void Paint.setAlpha(int)>
			boolean flag;
			if(mh1.i() >= 0 && barentry.isStacked())
	//*  58  146:aload           9
	//*  59  148:invokevirtual   #274 <Method int mh.i()>
	//*  60  151:iflt            168
	//*  61  154:aload           10
	//*  62  156:invokevirtual   #277 <Method boolean BarEntry.isStacked()>
	//*  63  159:ifeq            168
				flag = true;
	//   64  162:iconst_1        
	//   65  163:istore          6
			else
	//*  66  165:goto            171
				flag = false;
	//   67  168:iconst_0        
	//   68  169:istore          6
			float f;
			float f1;
			if(flag)
	//*  69  171:iload           6
	//*  70  173:ifeq            234
			{
				if(e.c())
	//*  71  176:aload_0         
	//*  72  177:getfield        #30  <Field mo e>
	//*  73  180:invokeinterface #279 <Method boolean mo.c()>
	//*  74  185:ifeq            205
				{
					f = barentry.getPositiveSum();
	//   75  188:aload           10
	//   76  190:invokevirtual   #282 <Method float BarEntry.getPositiveSum()>
	//   77  193:fstore_3        
					f1 = -barentry.getNegativeSum();
	//   78  194:aload           10
	//   79  196:invokevirtual   #285 <Method float BarEntry.getNegativeSum()>
	//   80  199:fneg            
	//   81  200:fstore          4
				} else
	//*  82  202:goto            243
				{
					mp mp1 = barentry.getRanges()[mh1.i()];
	//   83  205:aload           10
	//   84  207:invokevirtual   #289 <Method mp[] BarEntry.getRanges()>
	//   85  210:aload           9
	//   86  212:invokevirtual   #274 <Method int mh.i()>
	//   87  215:aaload          
	//   88  216:astore          12
					f = mp1.a;
	//   89  218:aload           12
	//   90  220:getfield        #293 <Field float mp.a>
	//   91  223:fstore_3        
					f1 = mp1.b;
	//   92  224:aload           12
	//   93  226:getfield        #295 <Field float mp.b>
	//   94  229:fstore          4
				}
			} else
	//*  95  231:goto            243
			{
				f = barentry.getY();
	//   96  234:aload           10
	//   97  236:invokevirtual   #298 <Method float BarEntry.getY()>
	//   98  239:fstore_3        
				f1 = 0.0F;
	//   99  240:fconst_0        
	//  100  241:fstore          4
			}
			b(barentry.getX(), f, f1, lo1.a() / 2.0F, nv1);
	//  101  243:aload_0         
	//  102  244:aload           10
	//  103  246:invokevirtual   #173 <Method float BarEntry.getX()>
	//  104  249:fload_3         
	//  105  250:fload           4
	//  106  252:aload           8
	//  107  254:invokevirtual   #151 <Method float lo.a()>
	//  108  257:fconst_2        
	//  109  258:fdiv            
	//  110  259:aload           11
	//  111  261:invokevirtual   #300 <Method void b(float, float, float, float, nv)>
			c(mh1, a);
	//  112  264:aload_0         
	//  113  265:aload           9
	//  114  267:aload_0         
	//  115  268:getfield        #26  <Field RectF a>
	//  116  271:invokevirtual   #302 <Method void c(mh, RectF)>
			canvas.drawRect(a, k);
	//  117  274:aload_1         
	//  118  275:aload_0         
	//  119  276:getfield        #26  <Field RectF a>
	//  120  279:aload_0         
	//  121  280:getfield        #38  <Field Paint k>
	//  122  283:invokevirtual   #206 <Method void Canvas.drawRect(RectF, Paint)>
		}

	//  123  286:iload           5
	//  124  288:iconst_1        
	//  125  289:iadd            
	//  126  290:istore          5
	//* 127  292:goto            18
	//  128  295:return          
	}

	public void e()
	{
		lo lo1 = e.getBarData();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field mo e>
	//    2    4:invokeinterface #75  <Method lo mo.getBarData()>
	//    3    9:astore          4
		c = new lb[lo1.e()];
	//    4   11:aload_0         
	//    5   12:aload           4
	//    6   14:invokevirtual   #80  <Method int lo.e()>
	//    7   17:anewarray       lb[]
	//    8   20:putfield        #208 <Field lb[] c>
		for(int i = 0; i < c.length; i++)
	//*   9   23:iconst_0        
	//*  10   24:istore_1        
	//*  11   25:iload_1         
	//*  12   26:aload_0         
	//*  13   27:getfield        #208 <Field lb[] c>
	//*  14   30:arraylength     
	//*  15   31:icmpge          117
		{
			mt mt1 = (mt)lo1.a(i);
	//   16   34:aload           4
	//   17   36:iload_1         
	//   18   37:invokevirtual   #83  <Method mz lo.a(int)>
	//   19   40:checkcast       #85  <Class mt>
	//   20   43:astore          5
			lb alb[] = c;
	//   21   45:aload_0         
	//   22   46:getfield        #208 <Field lb[] c>
	//   23   49:astore          6
			int k = mt1.C();
	//   24   51:aload           5
	//   25   53:invokeinterface #154 <Method int mt.C()>
	//   26   58:istore_3        
			int j;
			if(mt1.a())
	//*  27   59:aload           5
	//*  28   61:invokeinterface #304 <Method boolean mt.a()>
	//*  29   66:ifeq            80
				j = mt1.d();
	//   30   69:aload           5
	//   31   71:invokeinterface #306 <Method int mt.d()>
	//   32   76:istore_2        
			else
	//*  33   77:goto            82
				j = 1;
	//   34   80:iconst_1        
	//   35   81:istore_2        
			alb[i] = new lb(k * 4 * j, lo1.e(), mt1.a());
	//   36   82:aload           6
	//   37   84:iload_1         
	//   38   85:new             #210 <Class lb>
	//   39   88:dup             
	//   40   89:iload_3         
	//   41   90:iconst_4        
	//   42   91:imul            
	//   43   92:iload_2         
	//   44   93:imul            
	//   45   94:aload           4
	//   46   96:invokevirtual   #80  <Method int lo.e()>
	//   47   99:aload           5
	//   48  101:invokeinterface #304 <Method boolean mt.a()>
	//   49  106:invokespecial   #309 <Method void lb(int, int, boolean)>
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
	//*   2    2:getfield        #30  <Field mo e>
	//*   3    5:invokevirtual   #312 <Method boolean c(mr)>
	//*   4    8:ifeq            1363
		{
			List list = e.getBarData().h();
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field mo e>
	//    7   15:invokeinterface #75  <Method lo mo.getBarData()>
	//    8   20:invokevirtual   #314 <Method List lo.h()>
	//    9   23:astore          19
			float f23 = oc.b(4.5F);
	//   10   25:ldc2            #315 <Float 4.5F>
	//   11   28:invokestatic    #139 <Method float oc.b(float)>
	//   12   31:fstore          8
			boolean flag1 = e.b();
	//   13   33:aload_0         
	//   14   34:getfield        #30  <Field mo e>
	//   15   37:invokeinterface #317 <Method boolean mo.b()>
	//   16   42:istore          17
			for(int k = 0; k < e.getBarData().e(); k++)
	//*  17   44:iconst_0        
	//*  18   45:istore          12
	//*  19   47:iload           12
	//*  20   49:aload_0         
	//*  21   50:getfield        #30  <Field mo e>
	//*  22   53:invokeinterface #75  <Method lo mo.getBarData()>
	//*  23   58:invokevirtual   #80  <Method int lo.e()>
	//*  24   61:icmpge          1363
			{
				mt mt1 = (mt)list.get(k);
	//   25   64:aload           19
	//   26   66:iload           12
	//   27   68:invokeinterface #321 <Method Object List.get(int)>
	//   28   73:checkcast       #85  <Class mt>
	//   29   76:astore          20
				if(!c(((mz) (mt1))))
	//*  30   78:aload_0         
	//*  31   79:aload           20
	//*  32   81:invokevirtual   #324 <Method boolean c(mz)>
	//*  33   84:ifne            90
					continue;
	//   34   87:goto            1354
				e(((mz) (mt1)));
	//   35   90:aload_0         
	//   36   91:aload           20
	//   37   93:invokevirtual   #327 <Method void e(mz)>
				boolean flag2 = e.c(mt1.D());
	//   38   96:aload_0         
	//   39   97:getfield        #30  <Field mo e>
	//   40  100:aload           20
	//   41  102:invokeinterface #128 <Method lp$b mt.D()>
	//   42  107:invokeinterface #217 <Method boolean mo.c(lp$b)>
	//   43  112:istore          18
				float f13 = oc.e(n, "8");
	//   44  114:aload_0         
	//   45  115:getfield        #329 <Field Paint n>
	//   46  118:ldc2            #331 <String "8">
	//   47  121:invokestatic    #334 <Method int oc.e(Paint, String)>
	//   48  124:i2f             
	//   49  125:fstore          6
				float f2;
				if(flag1)
	//*  50  127:iload           17
	//*  51  129:ifeq            140
					f2 = -f23;
	//   52  132:fload           8
	//   53  134:fneg            
	//   54  135:fstore          4
				else
	//*  55  137:goto            147
					f2 = f13 + f23;
	//   56  140:fload           6
	//   57  142:fload           8
	//   58  144:fadd            
	//   59  145:fstore          4
				float f8;
				if(flag1)
	//*  60  147:iload           17
	//*  61  149:ifeq            162
					f8 = f13 + f23;
	//   62  152:fload           6
	//   63  154:fload           8
	//   64  156:fadd            
	//   65  157:fstore          5
				else
	//*  66  159:goto            167
					f8 = -f23;
	//   67  162:fload           8
	//   68  164:fneg            
	//   69  165:fstore          5
				float f1 = f2;
	//   70  167:fload           4
	//   71  169:fstore_3        
				float f = f8;
	//   72  170:fload           5
	//   73  172:fstore_2        
				if(flag2)
	//*  74  173:iload           18
	//*  75  175:ifeq            192
				{
					f1 = -f2 - f13;
	//   76  178:fload           4
	//   77  180:fneg            
	//   78  181:fload           6
	//   79  183:fsub            
	//   80  184:fstore_3        
					f = -f8 - f13;
	//   81  185:fload           5
	//   82  187:fneg            
	//   83  188:fload           6
	//   84  190:fsub            
	//   85  191:fstore_2        
				}
				lb lb1 = c[k];
	//   86  192:aload_0         
	//   87  193:getfield        #208 <Field lb[] c>
	//   88  196:iload           12
	//   89  198:aaload          
	//   90  199:astore          21
				float f24 = this.i.d();
	//   91  201:aload_0         
	//   92  202:getfield        #101 <Field la i>
	//   93  205:invokevirtual   #106 <Method float la.d()>
	//   94  208:fstore          9
				nz nz1 = nz.b(mt1.z());
	//   95  210:aload           20
	//   96  212:invokeinterface #338 <Method nz mt.z()>
	//   97  217:invokestatic    #343 <Method nz nz.b(nz)>
	//   98  220:astore          22
				nz1.e = oc.b(nz1.e);
	//   99  222:aload           22
	//  100  224:aload           22
	//  101  226:getfield        #345 <Field float nz.e>
	//  102  229:invokestatic    #139 <Method float oc.b(float)>
	//  103  232:putfield        #345 <Field float nz.e>
				nz1.c = oc.b(nz1.c);
	//  104  235:aload           22
	//  105  237:aload           22
	//  106  239:getfield        #347 <Field float nz.c>
	//  107  242:invokestatic    #139 <Method float oc.b(float)>
	//  108  245:putfield        #347 <Field float nz.c>
				if(!mt1.a())
	//* 109  248:aload           20
	//* 110  250:invokeinterface #304 <Method boolean mt.a()>
	//* 111  255:ifne            581
				{
					int i = 0;
	//  112  258:iconst_0        
	//  113  259:istore          11
					do
					{
						if((float)i >= (float)lb1.e.length * this.i.b())
							break;
	//  114  261:iload           11
	//  115  263:i2f             
	//  116  264:aload           21
	//  117  266:getfield        #228 <Field float[] lb.e>
	//  118  269:arraylength     
	//  119  270:i2f             
	//  120  271:aload_0         
	//  121  272:getfield        #101 <Field la i>
	//  122  275:invokevirtual   #145 <Method float la.b()>
	//  123  278:fmul            
	//  124  279:fcmpg           
	//  125  280:ifge            578
						float f9 = (lb1.e[i] + lb1.e[i + 2]) / 2.0F;
	//  126  283:aload           21
	//  127  285:getfield        #228 <Field float[] lb.e>
	//  128  288:iload           11
	//  129  290:faload          
	//  130  291:aload           21
	//  131  293:getfield        #228 <Field float[] lb.e>
	//  132  296:iload           11
	//  133  298:iconst_2        
	//  134  299:iadd            
	//  135  300:faload          
	//  136  301:fadd            
	//  137  302:fconst_2        
	//  138  303:fdiv            
	//  139  304:fstore          5
						if(!this.l.k(f9))
	//* 140  306:aload_0         
	//* 141  307:getfield        #186 <Field oa l>
	//* 142  310:fload           5
	//* 143  312:invokevirtual   #193 <Method boolean oa.k(float)>
	//* 144  315:ifne            321
							break;
	//  145  318:goto            578
						if(this.l.g(lb1.e[i + 1]) && this.l.i(f9))
	//* 146  321:aload_0         
	//* 147  322:getfield        #186 <Field oa l>
	//* 148  325:aload           21
	//* 149  327:getfield        #228 <Field float[] lb.e>
	//* 150  330:iload           11
	//* 151  332:iconst_1        
	//* 152  333:iadd            
	//* 153  334:faload          
	//* 154  335:invokevirtual   #349 <Method boolean oa.g(float)>
	//* 155  338:ifeq            569
	//* 156  341:aload_0         
	//* 157  342:getfield        #186 <Field oa l>
	//* 158  345:fload           5
	//* 159  347:invokevirtual   #191 <Method boolean oa.i(float)>
	//* 160  350:ifne            356
	//* 161  353:goto            569
						{
							Object obj = ((Object) ((BarEntry)mt1.f(i / 4)));
	//  162  356:aload           20
	//  163  358:iload           11
	//  164  360:iconst_4        
	//  165  361:idiv            
	//  166  362:invokeinterface #168 <Method com.github.mikephil.charting.data.Entry mt.f(int)>
	//  167  367:checkcast       #170 <Class BarEntry>
	//  168  370:astore          23
							float f14 = ((BarEntry) (obj)).getY();
	//  169  372:aload           23
	//  170  374:invokevirtual   #298 <Method float BarEntry.getY()>
	//  171  377:fstore          6
							if(mt1.v())
	//* 172  379:aload           20
	//* 173  381:invokeinterface #352 <Method boolean mt.v()>
	//* 174  386:ifeq            464
							{
								ml ml = mt1.l();
	//  175  389:aload           20
	//  176  391:invokeinterface #355 <Method ml mt.l()>
	//  177  396:astore          24
								float f3;
								if(f14 >= 0.0F)
	//* 178  398:fload           6
	//* 179  400:fconst_0        
	//* 180  401:fcmpl           
	//* 181  402:iflt            422
									f3 = lb1.e[i + 1] + f1;
	//  182  405:aload           21
	//  183  407:getfield        #228 <Field float[] lb.e>
	//  184  410:iload           11
	//  185  412:iconst_1        
	//  186  413:iadd            
	//  187  414:faload          
	//  188  415:fload_3         
	//  189  416:fadd            
	//  190  417:fstore          4
								else
	//* 191  419:goto            436
									f3 = lb1.e[i + 3] + f;
	//  192  422:aload           21
	//  193  424:getfield        #228 <Field float[] lb.e>
	//  194  427:iload           11
	//  195  429:iconst_3        
	//  196  430:iadd            
	//  197  431:faload          
	//  198  432:fload_2         
	//  199  433:fadd            
	//  200  434:fstore          4
								d(canvas, ml, f14, ((com.github.mikephil.charting.data.Entry) (obj)), k, f9, f3, mt1.b(i / 4));
	//  201  436:aload_0         
	//  202  437:aload_1         
	//  203  438:aload           24
	//  204  440:fload           6
	//  205  442:aload           23
	//  206  444:iload           12
	//  207  446:fload           5
	//  208  448:fload           4
	//  209  450:aload           20
	//  210  452:iload           11
	//  211  454:iconst_4        
	//  212  455:idiv            
	//  213  456:invokeinterface #357 <Method int mt.b(int)>
	//  214  461:invokevirtual   #360 <Method void d(Canvas, ml, float, com.github.mikephil.charting.data.Entry, int, float, float, int)>
							}
							if(((BarEntry) (obj)).getIcon() != null && mt1.x())
	//* 215  464:aload           23
	//* 216  466:invokevirtual   #364 <Method Drawable BarEntry.getIcon()>
	//* 217  469:ifnull          569
	//* 218  472:aload           20
	//* 219  474:invokeinterface #367 <Method boolean mt.x()>
	//* 220  479:ifeq            569
							{
								obj = ((Object) (((BarEntry) (obj)).getIcon()));
	//  221  482:aload           23
	//  222  484:invokevirtual   #364 <Method Drawable BarEntry.getIcon()>
	//  223  487:astore          23
								float f4;
								if(f14 >= 0.0F)
	//* 224  489:fload           6
	//* 225  491:fconst_0        
	//* 226  492:fcmpl           
	//* 227  493:iflt            513
									f4 = lb1.e[i + 1] + f1;
	//  228  496:aload           21
	//  229  498:getfield        #228 <Field float[] lb.e>
	//  230  501:iload           11
	//  231  503:iconst_1        
	//  232  504:iadd            
	//  233  505:faload          
	//  234  506:fload_3         
	//  235  507:fadd            
	//  236  508:fstore          4
								else
	//* 237  510:goto            527
									f4 = lb1.e[i + 3] + f;
	//  238  513:aload           21
	//  239  515:getfield        #228 <Field float[] lb.e>
	//  240  518:iload           11
	//  241  520:iconst_3        
	//  242  521:iadd            
	//  243  522:faload          
	//  244  523:fload_2         
	//  245  524:fadd            
	//  246  525:fstore          4
								f14 = nz1.e;
	//  247  527:aload           22
	//  248  529:getfield        #345 <Field float nz.e>
	//  249  532:fstore          6
								float f19 = nz1.c;
	//  250  534:aload           22
	//  251  536:getfield        #347 <Field float nz.c>
	//  252  539:fstore          7
								oc.d(canvas, ((Drawable) (obj)), (int)(f9 + f14), (int)(f4 + f19), ((Drawable) (obj)).getIntrinsicWidth(), ((Drawable) (obj)).getIntrinsicHeight());
	//  253  541:aload_1         
	//  254  542:aload           23
	//  255  544:fload           5
	//  256  546:fload           6
	//  257  548:fadd            
	//  258  549:f2i             
	//  259  550:fload           4
	//  260  552:fload           7
	//  261  554:fadd            
	//  262  555:f2i             
	//  263  556:aload           23
	//  264  558:invokevirtual   #372 <Method int Drawable.getIntrinsicWidth()>
	//  265  561:aload           23
	//  266  563:invokevirtual   #375 <Method int Drawable.getIntrinsicHeight()>
	//  267  566:invokestatic    #378 <Method void oc.d(Canvas, Drawable, int, int, int, int)>
							}
						}
						i += 4;
	//  268  569:iload           11
	//  269  571:iconst_4        
	//  270  572:iadd            
	//  271  573:istore          11
					} while(true);
	//  272  575:goto            261
				} else
	//* 273  578:goto            1349
				{
					nv nv1 = e.b(mt1.D());
	//  274  581:aload_0         
	//  275  582:getfield        #30  <Field mo e>
	//  276  585:aload           20
	//  277  587:invokeinterface #128 <Method lp$b mt.D()>
	//  278  592:invokeinterface #131 <Method nv mo.b(lp$b)>
	//  279  597:astore          23
					int j = 0;
	//  280  599:iconst_0        
	//  281  600:istore          11
					int l = 0;
	//  282  602:iconst_0        
	//  283  603:istore          13
					do
					{
						if((float)l >= (float)mt1.C() * this.i.b())
							break;
	//  284  605:iload           13
	//  285  607:i2f             
	//  286  608:aload           20
	//  287  610:invokeinterface #154 <Method int mt.C()>
	//  288  615:i2f             
	//  289  616:aload_0         
	//  290  617:getfield        #101 <Field la i>
	//  291  620:invokevirtual   #145 <Method float la.b()>
	//  292  623:fmul            
	//  293  624:fcmpg           
	//  294  625:ifge            1349
						BarEntry barentry = (BarEntry)mt1.f(l);
	//  295  628:aload           20
	//  296  630:iload           13
	//  297  632:invokeinterface #168 <Method com.github.mikephil.charting.data.Entry mt.f(int)>
	//  298  637:checkcast       #170 <Class BarEntry>
	//  299  640:astore          24
						float af[] = barentry.getYVals();
	//  300  642:aload           24
	//  301  644:invokevirtual   #382 <Method float[] BarEntry.getYVals()>
	//  302  647:astore          25
						float f25 = (lb1.e[j] + lb1.e[j + 2]) / 2.0F;
	//  303  649:aload           21
	//  304  651:getfield        #228 <Field float[] lb.e>
	//  305  654:iload           11
	//  306  656:faload          
	//  307  657:aload           21
	//  308  659:getfield        #228 <Field float[] lb.e>
	//  309  662:iload           11
	//  310  664:iconst_2        
	//  311  665:iadd            
	//  312  666:faload          
	//  313  667:fadd            
	//  314  668:fconst_2        
	//  315  669:fdiv            
	//  316  670:fstore          10
						int l1 = mt1.b(l);
	//  317  672:aload           20
	//  318  674:iload           13
	//  319  676:invokeinterface #357 <Method int mt.b(int)>
	//  320  681:istore          16
						if(af == null)
	//* 321  683:aload           25
	//* 322  685:ifnonnull       921
						{
							if(!this.l.k(f25))
	//* 323  688:aload_0         
	//* 324  689:getfield        #186 <Field oa l>
	//* 325  692:fload           10
	//* 326  694:invokevirtual   #193 <Method boolean oa.k(float)>
	//* 327  697:ifne            703
								break;
	//  328  700:goto            1349
							if(!this.l.g(lb1.e[j + 1]) || !this.l.i(f25))
	//* 329  703:aload_0         
	//* 330  704:getfield        #186 <Field oa l>
	//* 331  707:aload           21
	//* 332  709:getfield        #228 <Field float[] lb.e>
	//* 333  712:iload           11
	//* 334  714:iconst_1        
	//* 335  715:iadd            
	//* 336  716:faload          
	//* 337  717:invokevirtual   #349 <Method boolean oa.g(float)>
	//* 338  720:ifeq            605
	//* 339  723:aload_0         
	//* 340  724:getfield        #186 <Field oa l>
	//* 341  727:fload           10
	//* 342  729:invokevirtual   #191 <Method boolean oa.i(float)>
	//* 343  732:ifne            738
								continue;
	//  344  735:goto            605
							if(mt1.v())
	//* 345  738:aload           20
	//* 346  740:invokeinterface #352 <Method boolean mt.v()>
	//* 347  745:ifeq            817
							{
								ml ml1 = mt1.l();
	//  348  748:aload           20
	//  349  750:invokeinterface #355 <Method ml mt.l()>
	//  350  755:astore          26
								float f10 = barentry.getY();
	//  351  757:aload           24
	//  352  759:invokevirtual   #298 <Method float BarEntry.getY()>
	//  353  762:fstore          5
								float f15 = lb1.e[j + 1];
	//  354  764:aload           21
	//  355  766:getfield        #228 <Field float[] lb.e>
	//  356  769:iload           11
	//  357  771:iconst_1        
	//  358  772:iadd            
	//  359  773:faload          
	//  360  774:fstore          6
								float f5;
								if(barentry.getY() >= 0.0F)
	//* 361  776:aload           24
	//* 362  778:invokevirtual   #298 <Method float BarEntry.getY()>
	//* 363  781:fconst_0        
	//* 364  782:fcmpl           
	//* 365  783:iflt            792
									f5 = f1;
	//  366  786:fload_3         
	//  367  787:fstore          4
								else
	//* 368  789:goto            795
									f5 = f;
	//  369  792:fload_2         
	//  370  793:fstore          4
								d(canvas, ml1, f10, ((com.github.mikephil.charting.data.Entry) (barentry)), k, f25, f15 + f5, l1);
	//  371  795:aload_0         
	//  372  796:aload_1         
	//  373  797:aload           26
	//  374  799:fload           5
	//  375  801:aload           24
	//  376  803:iload           12
	//  377  805:fload           10
	//  378  807:fload           6
	//  379  809:fload           4
	//  380  811:fadd            
	//  381  812:iload           16
	//  382  814:invokevirtual   #360 <Method void d(Canvas, ml, float, com.github.mikephil.charting.data.Entry, int, float, float, int)>
							}
							if(barentry.getIcon() != null && mt1.x())
	//* 383  817:aload           24
	//* 384  819:invokevirtual   #364 <Method Drawable BarEntry.getIcon()>
	//* 385  822:ifnull          1316
	//* 386  825:aload           20
	//* 387  827:invokeinterface #367 <Method boolean mt.x()>
	//* 388  832:ifeq            1316
							{
								Drawable drawable = barentry.getIcon();
	//  389  835:aload           24
	//  390  837:invokevirtual   #364 <Method Drawable BarEntry.getIcon()>
	//  391  840:astore          26
								float f11 = lb1.e[j + 1];
	//  392  842:aload           21
	//  393  844:getfield        #228 <Field float[] lb.e>
	//  394  847:iload           11
	//  395  849:iconst_1        
	//  396  850:iadd            
	//  397  851:faload          
	//  398  852:fstore          5
								float f6;
								if(barentry.getY() >= 0.0F)
	//* 399  854:aload           24
	//* 400  856:invokevirtual   #298 <Method float BarEntry.getY()>
	//* 401  859:fconst_0        
	//* 402  860:fcmpl           
	//* 403  861:iflt            870
									f6 = f1;
	//  404  864:fload_3         
	//  405  865:fstore          4
								else
	//* 406  867:goto            873
									f6 = f;
	//  407  870:fload_2         
	//  408  871:fstore          4
								float f16 = nz1.e;
	//  409  873:aload           22
	//  410  875:getfield        #345 <Field float nz.e>
	//  411  878:fstore          6
								float f20 = nz1.c;
	//  412  880:aload           22
	//  413  882:getfield        #347 <Field float nz.c>
	//  414  885:fstore          7
								oc.d(canvas, drawable, (int)(f25 + f16), (int)(f11 + f6 + f20), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
	//  415  887:aload_1         
	//  416  888:aload           26
	//  417  890:fload           10
	//  418  892:fload           6
	//  419  894:fadd            
	//  420  895:f2i             
	//  421  896:fload           5
	//  422  898:fload           4
	//  423  900:fadd            
	//  424  901:fload           7
	//  425  903:fadd            
	//  426  904:f2i             
	//  427  905:aload           26
	//  428  907:invokevirtual   #372 <Method int Drawable.getIntrinsicWidth()>
	//  429  910:aload           26
	//  430  912:invokevirtual   #375 <Method int Drawable.getIntrinsicHeight()>
	//  431  915:invokestatic    #378 <Method void oc.d(Canvas, Drawable, int, int, int, int)>
							}
						} else
	//* 432  918:goto            1316
						{
							float af1[] = new float[af.length * 2];
	//  433  921:aload           25
	//  434  923:arraylength     
	//  435  924:iconst_2        
	//  436  925:imul            
	//  437  926:newarray        float[]
	//  438  928:astore          26
							float f12 = 0.0F;
	//  439  930:fconst_0        
	//  440  931:fstore          5
							float f7 = -barentry.getNegativeSum();
	//  441  933:aload           24
	//  442  935:invokevirtual   #285 <Method float BarEntry.getNegativeSum()>
	//  443  938:fneg            
	//  444  939:fstore          4
							int k1 = 0;
	//  445  941:iconst_0        
	//  446  942:istore          15
							int i1 = 0;
	//  447  944:iconst_0        
	//  448  945:istore          14
							while(k1 < af1.length) 
	//* 449  947:iload           15
	//* 450  949:aload           26
	//* 451  951:arraylength     
	//* 452  952:icmpge          1073
							{
								float f21 = af[i1];
	//  453  955:aload           25
	//  454  957:iload           14
	//  455  959:faload          
	//  456  960:fstore          7
								float f17;
								if(f21 == 0.0F && (f12 == 0.0F || f7 == 0.0F))
	//* 457  962:fload           7
	//* 458  964:fconst_0        
	//* 459  965:fcmpl           
	//* 460  966:ifne            994
	//* 461  969:fload           5
	//* 462  971:fconst_0        
	//* 463  972:fcmpl           
	//* 464  973:ifeq            983
	//* 465  976:fload           4
	//* 466  978:fconst_0        
	//* 467  979:fcmpl           
	//* 468  980:ifne            994
								{
									f17 = f7;
	//  469  983:fload           4
	//  470  985:fstore          6
									f7 = f21;
	//  471  987:fload           7
	//  472  989:fstore          4
								} else
	//* 473  991:goto            1042
								if(f21 >= 0.0F)
	//* 474  994:fload           7
	//* 475  996:fconst_0        
	//* 476  997:fcmpl           
	//* 477  998:iflt            1023
								{
									f12 += f21;
	//  478 1001:fload           5
	//  479 1003:fload           7
	//  480 1005:fadd            
	//  481 1006:fstore          5
									f21 = f12;
	//  482 1008:fload           5
	//  483 1010:fstore          7
									f17 = f7;
	//  484 1012:fload           4
	//  485 1014:fstore          6
									f7 = f21;
	//  486 1016:fload           7
	//  487 1018:fstore          4
								} else
	//* 488 1020:goto            1042
								{
									f17 = f7;
	//  489 1023:fload           4
	//  490 1025:fstore          6
									f21 = f7 - f21;
	//  491 1027:fload           4
	//  492 1029:fload           7
	//  493 1031:fsub            
	//  494 1032:fstore          7
									f7 = f17;
	//  495 1034:fload           6
	//  496 1036:fstore          4
									f17 = f21;
	//  497 1038:fload           7
	//  498 1040:fstore          6
								}
								af1[k1 + 1] = f7 * f24;
	//  499 1042:aload           26
	//  500 1044:iload           15
	//  501 1046:iconst_1        
	//  502 1047:iadd            
	//  503 1048:fload           4
	//  504 1050:fload           9
	//  505 1052:fmul            
	//  506 1053:fastore         
								k1 += 2;
	//  507 1054:iload           15
	//  508 1056:iconst_2        
	//  509 1057:iadd            
	//  510 1058:istore          15
								i1++;
	//  511 1060:iload           14
	//  512 1062:iconst_1        
	//  513 1063:iadd            
	//  514 1064:istore          14
								f7 = f17;
	//  515 1066:fload           6
	//  516 1068:fstore          4
							}
	//* 517 1070:goto            947
							nv1.e(af1);
	//  518 1073:aload           23
	//  519 1075:aload           26
	//  520 1077:invokevirtual   #231 <Method void nv.e(float[])>
							for(int j1 = 0; j1 < af1.length; j1 += 2)
	//* 521 1080:iconst_0        
	//* 522 1081:istore          14
	//* 523 1083:iload           14
	//* 524 1085:aload           26
	//* 525 1087:arraylength     
	//* 526 1088:icmpge          1316
							{
								float f18 = af[j1 / 2];
	//  527 1091:aload           25
	//  528 1093:iload           14
	//  529 1095:iconst_2        
	//  530 1096:idiv            
	//  531 1097:faload          
	//  532 1098:fstore          6
								boolean flag;
								if(f18 == 0.0F && f7 == 0.0F && f12 > 0.0F || f18 < 0.0F)
	//* 533 1100:fload           6
	//* 534 1102:fconst_0        
	//* 535 1103:fcmpl           
	//* 536 1104:ifne            1121
	//* 537 1107:fload           4
	//* 538 1109:fconst_0        
	//* 539 1110:fcmpl           
	//* 540 1111:ifne            1121
	//* 541 1114:fload           5
	//* 542 1116:fconst_0        
	//* 543 1117:fcmpl           
	//* 544 1118:ifgt            1128
	//* 545 1121:fload           6
	//* 546 1123:fconst_0        
	//* 547 1124:fcmpg           
	//* 548 1125:ifge            1134
									flag = true;
	//  549 1128:iconst_1        
	//  550 1129:istore          15
								else
	//* 551 1131:goto            1137
									flag = false;
	//  552 1134:iconst_0        
	//  553 1135:istore          15
								float f22 = af1[j1 + 1];
	//  554 1137:aload           26
	//  555 1139:iload           14
	//  556 1141:iconst_1        
	//  557 1142:iadd            
	//  558 1143:faload          
	//  559 1144:fstore          7
								if(flag)
	//* 560 1146:iload           15
	//* 561 1148:ifeq            1157
									f18 = f;
	//  562 1151:fload_2         
	//  563 1152:fstore          6
								else
	//* 564 1154:goto            1160
									f18 = f1;
	//  565 1157:fload_3         
	//  566 1158:fstore          6
								f18 = f22 + f18;
	//  567 1160:fload           7
	//  568 1162:fload           6
	//  569 1164:fadd            
	//  570 1165:fstore          6
								if(!this.l.k(f25))
	//* 571 1167:aload_0         
	//* 572 1168:getfield        #186 <Field oa l>
	//* 573 1171:fload           10
	//* 574 1173:invokevirtual   #193 <Method boolean oa.k(float)>
	//* 575 1176:ifne            1182
									break;
	//  576 1179:goto            1316
								if(!this.l.g(f18) || !this.l.i(f25))
	//* 577 1182:aload_0         
	//* 578 1183:getfield        #186 <Field oa l>
	//* 579 1186:fload           6
	//* 580 1188:invokevirtual   #349 <Method boolean oa.g(float)>
	//* 581 1191:ifeq            1307
	//* 582 1194:aload_0         
	//* 583 1195:getfield        #186 <Field oa l>
	//* 584 1198:fload           10
	//* 585 1200:invokevirtual   #191 <Method boolean oa.i(float)>
	//* 586 1203:ifne            1209
									continue;
	//  587 1206:goto            1307
								if(mt1.v())
	//* 588 1209:aload           20
	//* 589 1211:invokeinterface #352 <Method boolean mt.v()>
	//* 590 1216:ifeq            1248
									d(canvas, mt1.l(), af[j1 / 2], ((com.github.mikephil.charting.data.Entry) (barentry)), k, f25, f18, l1);
	//  591 1219:aload_0         
	//  592 1220:aload_1         
	//  593 1221:aload           20
	//  594 1223:invokeinterface #355 <Method ml mt.l()>
	//  595 1228:aload           25
	//  596 1230:iload           14
	//  597 1232:iconst_2        
	//  598 1233:idiv            
	//  599 1234:faload          
	//  600 1235:aload           24
	//  601 1237:iload           12
	//  602 1239:fload           10
	//  603 1241:fload           6
	//  604 1243:iload           16
	//  605 1245:invokevirtual   #360 <Method void d(Canvas, ml, float, com.github.mikephil.charting.data.Entry, int, float, float, int)>
								if(barentry.getIcon() != null && mt1.x())
	//* 606 1248:aload           24
	//* 607 1250:invokevirtual   #364 <Method Drawable BarEntry.getIcon()>
	//* 608 1253:ifnull          1307
	//* 609 1256:aload           20
	//* 610 1258:invokeinterface #367 <Method boolean mt.x()>
	//* 611 1263:ifeq            1307
								{
									Drawable drawable1 = barentry.getIcon();
	//  612 1266:aload           24
	//  613 1268:invokevirtual   #364 <Method Drawable BarEntry.getIcon()>
	//  614 1271:astore          27
									oc.d(canvas, drawable1, (int)(nz1.e + f25), (int)(nz1.c + f18), drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight());
	//  615 1273:aload_1         
	//  616 1274:aload           27
	//  617 1276:aload           22
	//  618 1278:getfield        #345 <Field float nz.e>
	//  619 1281:fload           10
	//  620 1283:fadd            
	//  621 1284:f2i             
	//  622 1285:aload           22
	//  623 1287:getfield        #347 <Field float nz.c>
	//  624 1290:fload           6
	//  625 1292:fadd            
	//  626 1293:f2i             
	//  627 1294:aload           27
	//  628 1296:invokevirtual   #372 <Method int Drawable.getIntrinsicWidth()>
	//  629 1299:aload           27
	//  630 1301:invokevirtual   #375 <Method int Drawable.getIntrinsicHeight()>
	//  631 1304:invokestatic    #378 <Method void oc.d(Canvas, Drawable, int, int, int, int)>
								}
							}

	//  632 1307:iload           14
	//  633 1309:iconst_2        
	//  634 1310:iadd            
	//  635 1311:istore          14
						}
	//* 636 1313:goto            1083
						if(af == null)
	//* 637 1316:aload           25
	//* 638 1318:ifnonnull       1330
							j += 4;
	//  639 1321:iload           11
	//  640 1323:iconst_4        
	//  641 1324:iadd            
	//  642 1325:istore          11
						else
	//* 643 1327:goto            1340
							j += af.length * 4;
	//  644 1330:iload           11
	//  645 1332:aload           25
	//  646 1334:arraylength     
	//  647 1335:iconst_4        
	//  648 1336:imul            
	//  649 1337:iadd            
	//  650 1338:istore          11
						l++;
	//  651 1340:iload           13
	//  652 1342:iconst_1        
	//  653 1343:iadd            
	//  654 1344:istore          13
					} while(true);
	//  655 1346:goto            605
				}
				nz.c(nz1);
	//  656 1349:aload           22
	//  657 1351:invokestatic    #385 <Method void nz.c(nz)>
			}

	//  658 1354:iload           12
	//  659 1356:iconst_1        
	//  660 1357:iadd            
	//  661 1358:istore          12
		}
	//* 662 1360:goto            47
	//  663 1363:return          
	}

	protected RectF a;
	protected Paint b;
	protected lb c[];
	protected Paint d;
	protected mo e;
	private RectF o;
}
