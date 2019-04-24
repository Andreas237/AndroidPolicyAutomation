// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Matrix;
import android.util.Log;
import android.view.*;
import android.view.animation.AnimationUtils;

// Referenced classes of package o:
//			nd, nz, oc, le, 
//			mz, lg, ne, oa, 
//			mh, lt

public class nb extends nd
{

	public nb(le le1, Matrix matrix, float f1)
	{
		super(((ld) (le1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void nd(ld)>
		h = new Matrix();
	//    3    5:aload_0         
	//    4    6:new             #32  <Class Matrix>
	//    5    9:dup             
	//    6   10:invokespecial   #35  <Method void Matrix()>
	//    7   13:putfield        #37  <Field Matrix h>
		g = new Matrix();
	//    8   16:aload_0         
	//    9   17:new             #32  <Class Matrix>
	//   10   20:dup             
	//   11   21:invokespecial   #35  <Method void Matrix()>
	//   12   24:putfield        #39  <Field Matrix g>
		i = nz.d(0.0F, 0.0F);
	//   13   27:aload_0         
	//   14   28:fconst_0        
	//   15   29:fconst_0        
	//   16   30:invokestatic    #45  <Method nz nz.d(float, float)>
	//   17   33:putfield        #47  <Field nz i>
		f = nz.d(0.0F, 0.0F);
	//   18   36:aload_0         
	//   19   37:fconst_0        
	//   20   38:fconst_0        
	//   21   39:invokestatic    #45  <Method nz nz.d(float, float)>
	//   22   42:putfield        #49  <Field nz f>
		k = 1.0F;
	//   23   45:aload_0         
	//   24   46:fconst_1        
	//   25   47:putfield        #51  <Field float k>
		p = 1.0F;
	//   26   50:aload_0         
	//   27   51:fconst_1        
	//   28   52:putfield        #53  <Field float p>
		l = 1.0F;
	//   29   55:aload_0         
	//   30   56:fconst_1        
	//   31   57:putfield        #55  <Field float l>
		n = 0L;
	//   32   60:aload_0         
	//   33   61:lconst_0        
	//   34   62:putfield        #57  <Field long n>
		t = nz.d(0.0F, 0.0F);
	//   35   65:aload_0         
	//   36   66:fconst_0        
	//   37   67:fconst_0        
	//   38   68:invokestatic    #45  <Method nz nz.d(float, float)>
	//   39   71:putfield        #59  <Field nz t>
		u = nz.d(0.0F, 0.0F);
	//   40   74:aload_0         
	//   41   75:fconst_0        
	//   42   76:fconst_0        
	//   43   77:invokestatic    #45  <Method nz nz.d(float, float)>
	//   44   80:putfield        #61  <Field nz u>
		h = matrix;
	//   45   83:aload_0         
	//   46   84:aload_2         
	//   47   85:putfield        #37  <Field Matrix h>
		q = oc.b(f1);
	//   48   88:aload_0         
	//   49   89:fload_3         
	//   50   90:invokestatic    #67  <Method float oc.b(float)>
	//   51   93:putfield        #69  <Field float q>
		s = oc.b(3.5F);
	//   52   96:aload_0         
	//   53   97:ldc1            #70  <Float 3.5F>
	//   54   99:invokestatic    #67  <Method float oc.b(float)>
	//   55  102:putfield        #72  <Field float s>
	//   56  105:return          
	}

	private void a(MotionEvent motionevent)
	{
		g.set(h);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Matrix g>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field Matrix h>
	//    4    8:invokevirtual   #81  <Method void Matrix.set(Matrix)>
		i.e = motionevent.getX();
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field nz i>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #87  <Method float MotionEvent.getX()>
	//    9   19:putfield        #90  <Field float nz.e>
		i.c = motionevent.getY();
	//   10   22:aload_0         
	//   11   23:getfield        #47  <Field nz i>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #93  <Method float MotionEvent.getY()>
	//   14   30:putfield        #96  <Field float nz.c>
		m = ((mz) (((le)b).d(motionevent.getX(), motionevent.getY())));
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #99  <Field ld b>
	//   18   38:checkcast       #101 <Class le>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #87  <Method float MotionEvent.getX()>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #93  <Method float MotionEvent.getY()>
	//   23   49:invokevirtual   #104 <Method mv le.d(float, float)>
	//   24   52:putfield        #106 <Field mz m>
	//   25   55:return          
	}

	private boolean a()
	{
		return m == null && ((le)b).v() || m != null && ((le)b).c(m.D());
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field mz m>
	//    2    4:ifnonnull       20
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field ld b>
	//    5   11:checkcast       #101 <Class le>
	//    6   14:invokevirtual   #110 <Method boolean le.v()>
	//    7   17:ifne            49
	//    8   20:aload_0         
	//    9   21:getfield        #106 <Field mz m>
	//   10   24:ifnull          51
	//   11   27:aload_0         
	//   12   28:getfield        #99  <Field ld b>
	//   13   31:checkcast       #101 <Class le>
	//   14   34:aload_0         
	//   15   35:getfield        #106 <Field mz m>
	//   16   38:invokeinterface #116 <Method lp$b mz.D()>
	//   17   43:invokevirtual   #119 <Method boolean le.c(lp$b)>
	//   18   46:ifeq            51
	//   19   49:iconst_1        
	//   20   50:ireturn         
	//   21   51:iconst_0        
	//   22   52:ireturn         
	}

	private void b(MotionEvent motionevent, float f1, float f2)
	{
		c = nd.d.c;
	//    0    0:aload_0         
	//    1    1:getstatic       #125 <Field nd$d nd$d.c>
	//    2    4:putfield        #126 <Field nd$d c>
		h.set(g);
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field Matrix h>
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field Matrix g>
	//    7   15:invokevirtual   #81  <Method void Matrix.set(Matrix)>
		ne ne1 = ((le)b).getOnChartGestureListener();
	//    8   18:aload_0         
	//    9   19:getfield        #99  <Field ld b>
	//   10   22:checkcast       #101 <Class le>
	//   11   25:invokevirtual   #130 <Method ne le.getOnChartGestureListener()>
	//   12   28:astore          6
		float f3 = f1;
	//   13   30:fload_2         
	//   14   31:fstore          4
		float f4 = f2;
	//   15   33:fload_3         
	//   16   34:fstore          5
		if(a())
	//*  17   36:aload_0         
	//*  18   37:invokespecial   #132 <Method boolean a()>
	//*  19   40:ifeq            70
			if(b instanceof lg)
	//*  20   43:aload_0         
	//*  21   44:getfield        #99  <Field ld b>
	//*  22   47:instanceof      #134 <Class lg>
	//*  23   50:ifeq            63
			{
				f3 = -f1;
	//   24   53:fload_2         
	//   25   54:fneg            
	//   26   55:fstore          4
				f4 = f2;
	//   27   57:fload_3         
	//   28   58:fstore          5
			} else
	//*  29   60:goto            70
			{
				f4 = -f2;
	//   30   63:fload_3         
	//   31   64:fneg            
	//   32   65:fstore          5
				f3 = f1;
	//   33   67:fload_2         
	//   34   68:fstore          4
			}
		h.postTranslate(f3, f4);
	//   35   70:aload_0         
	//   36   71:getfield        #37  <Field Matrix h>
	//   37   74:fload           4
	//   38   76:fload           5
	//   39   78:invokevirtual   #138 <Method boolean Matrix.postTranslate(float, float)>
	//   40   81:pop             
		if(ne1 != null)
	//*  41   82:aload           6
	//*  42   84:ifnull          99
			ne1.e(motionevent, f3, f4);
	//   43   87:aload           6
	//   44   89:aload_1         
	//   45   90:fload           4
	//   46   92:fload           5
	//   47   94:invokeinterface #142 <Method void ne.e(MotionEvent, float, float)>
	//   48   99:return          
	}

	private void c(MotionEvent motionevent)
	{
		if(motionevent.getPointerCount() >= 2)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #146 <Method int MotionEvent.getPointerCount()>
	//*   2    4:iconst_2        
	//*   3    5:icmplt          504
		{
			ne ne1 = ((le)b).getOnChartGestureListener();
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field ld b>
	//    6   12:checkcast       #101 <Class le>
	//    7   15:invokevirtual   #130 <Method ne le.getOnChartGestureListener()>
	//    8   18:astore          7
			float f1 = g(motionevent);
	//    9   20:aload_1         
	//   10   21:invokestatic    #149 <Method float g(MotionEvent)>
	//   11   24:fstore_2        
			if(f1 > s)
	//*  12   25:fload_2         
	//*  13   26:aload_0         
	//*  14   27:getfield        #72  <Field float s>
	//*  15   30:fcmpl           
	//*  16   31:ifle            504
			{
				nz nz1 = e(f.e, f.c);
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #49  <Field nz f>
	//   20   39:getfield        #90  <Field float nz.e>
	//   21   42:aload_0         
	//   22   43:getfield        #49  <Field nz f>
	//   23   46:getfield        #96  <Field float nz.c>
	//   24   49:invokevirtual   #151 <Method nz e(float, float)>
	//   25   52:astore          8
				oa oa1 = ((le)b).getViewPortHandler();
	//   26   54:aload_0         
	//   27   55:getfield        #99  <Field ld b>
	//   28   58:checkcast       #101 <Class le>
	//   29   61:invokevirtual   #155 <Method oa le.getViewPortHandler()>
	//   30   64:astore          9
				if(a == 4)
	//*  31   66:aload_0         
	//*  32   67:getfield        #158 <Field int a>
	//*  33   70:iconst_4        
	//*  34   71:icmpne          244
				{
					c = nd.d.b;
	//   35   74:aload_0         
	//   36   75:getstatic       #160 <Field nd$d nd$d.b>
	//   37   78:putfield        #126 <Field nd$d c>
					float f4 = f1 / l;
	//   38   81:fload_2         
	//   39   82:aload_0         
	//   40   83:getfield        #55  <Field float l>
	//   41   86:fdiv            
	//   42   87:fstore_3        
					boolean flag;
					if(f4 < 1.0F)
	//*  43   88:fload_3         
	//*  44   89:fconst_1        
	//*  45   90:fcmpg           
	//*  46   91:ifge            100
						flag = true;
	//   47   94:iconst_1        
	//   48   95:istore          4
					else
	//*  49   97:goto            103
						flag = false;
	//   50  100:iconst_0        
	//   51  101:istore          4
					boolean flag3;
					if(flag)
	//*  52  103:iload           4
	//*  53  105:ifeq            118
						flag3 = oa1.w();
	//   54  108:aload           9
	//   55  110:invokevirtual   #165 <Method boolean oa.w()>
	//   56  113:istore          5
					else
	//*  57  115:goto            125
						flag3 = oa1.y();
	//   58  118:aload           9
	//   59  120:invokevirtual   #168 <Method boolean oa.y()>
	//   60  123:istore          5
					boolean flag6;
					if(flag)
	//*  61  125:iload           4
	//*  62  127:ifeq            140
						flag6 = oa1.z();
	//   63  130:aload           9
	//   64  132:invokevirtual   #171 <Method boolean oa.z()>
	//   65  135:istore          6
					else
	//*  66  137:goto            147
						flag6 = oa1.x();
	//   67  140:aload           9
	//   68  142:invokevirtual   #174 <Method boolean oa.x()>
	//   69  145:istore          6
					if(((le)b).n())
	//*  70  147:aload_0         
	//*  71  148:getfield        #99  <Field ld b>
	//*  72  151:checkcast       #101 <Class le>
	//*  73  154:invokevirtual   #176 <Method boolean le.n()>
	//*  74  157:ifeq            165
						f1 = f4;
	//   75  160:fload_3         
	//   76  161:fstore_2        
					else
	//*  77  162:goto            167
						f1 = 1.0F;
	//   78  165:fconst_1        
	//   79  166:fstore_2        
					if(!((le)b).r())
	//*  80  167:aload_0         
	//*  81  168:getfield        #99  <Field ld b>
	//*  82  171:checkcast       #101 <Class le>
	//*  83  174:invokevirtual   #179 <Method boolean le.r()>
	//*  84  177:ifeq            183
	//*  85  180:goto            185
						f4 = 1.0F;
	//   86  183:fconst_1        
	//   87  184:fstore_3        
					if(flag6 || flag3)
	//*  88  185:iload           6
	//*  89  187:ifne            195
	//*  90  190:iload           5
	//*  91  192:ifeq            241
					{
						h.set(g);
	//   92  195:aload_0         
	//   93  196:getfield        #37  <Field Matrix h>
	//   94  199:aload_0         
	//   95  200:getfield        #39  <Field Matrix g>
	//   96  203:invokevirtual   #81  <Method void Matrix.set(Matrix)>
						h.postScale(f1, f4, nz1.e, nz1.c);
	//   97  206:aload_0         
	//   98  207:getfield        #37  <Field Matrix h>
	//   99  210:fload_2         
	//  100  211:fload_3         
	//  101  212:aload           8
	//  102  214:getfield        #90  <Field float nz.e>
	//  103  217:aload           8
	//  104  219:getfield        #96  <Field float nz.c>
	//  105  222:invokevirtual   #183 <Method boolean Matrix.postScale(float, float, float, float)>
	//  106  225:pop             
						if(ne1 != null)
	//* 107  226:aload           7
	//* 108  228:ifnull          241
							ne1.b(motionevent, f1, f4);
	//  109  231:aload           7
	//  110  233:aload_1         
	//  111  234:fload_2         
	//  112  235:fload_3         
	//  113  236:invokeinterface #185 <Method void ne.b(MotionEvent, float, float)>
					}
				} else
	//* 114  241:goto            499
				if(a == 2 && ((le)b).n())
	//* 115  244:aload_0         
	//* 116  245:getfield        #158 <Field int a>
	//* 117  248:iconst_2        
	//* 118  249:icmpne          373
	//* 119  252:aload_0         
	//* 120  253:getfield        #99  <Field ld b>
	//* 121  256:checkcast       #101 <Class le>
	//* 122  259:invokevirtual   #176 <Method boolean le.n()>
	//* 123  262:ifeq            373
				{
					c = nd.d.d;
	//  124  265:aload_0         
	//  125  266:getstatic       #187 <Field nd$d nd$d.d>
	//  126  269:putfield        #126 <Field nd$d c>
					float f2 = f(motionevent) / k;
	//  127  272:aload_1         
	//  128  273:invokestatic    #189 <Method float f(MotionEvent)>
	//  129  276:aload_0         
	//  130  277:getfield        #51  <Field float k>
	//  131  280:fdiv            
	//  132  281:fstore_2        
					boolean flag1;
					if(f2 < 1.0F)
	//* 133  282:fload_2         
	//* 134  283:fconst_1        
	//* 135  284:fcmpg           
	//* 136  285:ifge            294
						flag1 = true;
	//  137  288:iconst_1        
	//  138  289:istore          4
					else
	//* 139  291:goto            297
						flag1 = false;
	//  140  294:iconst_0        
	//  141  295:istore          4
					boolean flag4;
					if(flag1)
	//* 142  297:iload           4
	//* 143  299:ifeq            312
						flag4 = oa1.w();
	//  144  302:aload           9
	//  145  304:invokevirtual   #165 <Method boolean oa.w()>
	//  146  307:istore          5
					else
	//* 147  309:goto            319
						flag4 = oa1.y();
	//  148  312:aload           9
	//  149  314:invokevirtual   #168 <Method boolean oa.y()>
	//  150  317:istore          5
					if(flag4)
	//* 151  319:iload           5
	//* 152  321:ifeq            370
					{
						h.set(g);
	//  153  324:aload_0         
	//  154  325:getfield        #37  <Field Matrix h>
	//  155  328:aload_0         
	//  156  329:getfield        #39  <Field Matrix g>
	//  157  332:invokevirtual   #81  <Method void Matrix.set(Matrix)>
						h.postScale(f2, 1.0F, nz1.e, nz1.c);
	//  158  335:aload_0         
	//  159  336:getfield        #37  <Field Matrix h>
	//  160  339:fload_2         
	//  161  340:fconst_1        
	//  162  341:aload           8
	//  163  343:getfield        #90  <Field float nz.e>
	//  164  346:aload           8
	//  165  348:getfield        #96  <Field float nz.c>
	//  166  351:invokevirtual   #183 <Method boolean Matrix.postScale(float, float, float, float)>
	//  167  354:pop             
						if(ne1 != null)
	//* 168  355:aload           7
	//* 169  357:ifnull          370
							ne1.b(motionevent, f2, 1.0F);
	//  170  360:aload           7
	//  171  362:aload_1         
	//  172  363:fload_2         
	//  173  364:fconst_1        
	//  174  365:invokeinterface #185 <Method void ne.b(MotionEvent, float, float)>
					}
				} else
	//* 175  370:goto            499
				if(a == 3 && ((le)b).r())
	//* 176  373:aload_0         
	//* 177  374:getfield        #158 <Field int a>
	//* 178  377:iconst_3        
	//* 179  378:icmpne          499
	//* 180  381:aload_0         
	//* 181  382:getfield        #99  <Field ld b>
	//* 182  385:checkcast       #101 <Class le>
	//* 183  388:invokevirtual   #179 <Method boolean le.r()>
	//* 184  391:ifeq            499
				{
					c = nd.d.a;
	//  185  394:aload_0         
	//  186  395:getstatic       #191 <Field nd$d nd$d.a>
	//  187  398:putfield        #126 <Field nd$d c>
					float f3 = k(motionevent) / p;
	//  188  401:aload_1         
	//  189  402:invokestatic    #193 <Method float k(MotionEvent)>
	//  190  405:aload_0         
	//  191  406:getfield        #53  <Field float p>
	//  192  409:fdiv            
	//  193  410:fstore_2        
					boolean flag2;
					if(f3 < 1.0F)
	//* 194  411:fload_2         
	//* 195  412:fconst_1        
	//* 196  413:fcmpg           
	//* 197  414:ifge            423
						flag2 = true;
	//  198  417:iconst_1        
	//  199  418:istore          4
					else
	//* 200  420:goto            426
						flag2 = false;
	//  201  423:iconst_0        
	//  202  424:istore          4
					boolean flag5;
					if(flag2)
	//* 203  426:iload           4
	//* 204  428:ifeq            441
						flag5 = oa1.z();
	//  205  431:aload           9
	//  206  433:invokevirtual   #171 <Method boolean oa.z()>
	//  207  436:istore          5
					else
	//* 208  438:goto            448
						flag5 = oa1.x();
	//  209  441:aload           9
	//  210  443:invokevirtual   #174 <Method boolean oa.x()>
	//  211  446:istore          5
					if(flag5)
	//* 212  448:iload           5
	//* 213  450:ifeq            499
					{
						h.set(g);
	//  214  453:aload_0         
	//  215  454:getfield        #37  <Field Matrix h>
	//  216  457:aload_0         
	//  217  458:getfield        #39  <Field Matrix g>
	//  218  461:invokevirtual   #81  <Method void Matrix.set(Matrix)>
						h.postScale(1.0F, f3, nz1.e, nz1.c);
	//  219  464:aload_0         
	//  220  465:getfield        #37  <Field Matrix h>
	//  221  468:fconst_1        
	//  222  469:fload_2         
	//  223  470:aload           8
	//  224  472:getfield        #90  <Field float nz.e>
	//  225  475:aload           8
	//  226  477:getfield        #96  <Field float nz.c>
	//  227  480:invokevirtual   #183 <Method boolean Matrix.postScale(float, float, float, float)>
	//  228  483:pop             
						if(ne1 != null)
	//* 229  484:aload           7
	//* 230  486:ifnull          499
							ne1.b(motionevent, 1.0F, f3);
	//  231  489:aload           7
	//  232  491:aload_1         
	//  233  492:fconst_1        
	//  234  493:fload_2         
	//  235  494:invokeinterface #185 <Method void ne.b(MotionEvent, float, float)>
					}
				}
				nz.c(nz1);
	//  236  499:aload           8
	//  237  501:invokestatic    #196 <Method void nz.c(nz)>
			}
		}
	//  238  504:return          
	}

	private static void c(nz nz1, MotionEvent motionevent)
	{
		float f1 = motionevent.getX(0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #200 <Method float MotionEvent.getX(int)>
	//    3    5:fstore_2        
		float f2 = motionevent.getX(1);
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #200 <Method float MotionEvent.getX(int)>
	//    7   11:fstore_3        
		float f3 = motionevent.getY(0);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #202 <Method float MotionEvent.getY(int)>
	//   11   17:fstore          4
		float f4 = motionevent.getY(1);
	//   12   19:aload_1         
	//   13   20:iconst_1        
	//   14   21:invokevirtual   #202 <Method float MotionEvent.getY(int)>
	//   15   24:fstore          5
		nz1.e = (f1 + f2) / 2.0F;
	//   16   26:aload_0         
	//   17   27:fload_2         
	//   18   28:fload_3         
	//   19   29:fadd            
	//   20   30:fconst_2        
	//   21   31:fdiv            
	//   22   32:putfield        #90  <Field float nz.e>
		nz1.c = (f3 + f4) / 2.0F;
	//   23   35:aload_0         
	//   24   36:fload           4
	//   25   38:fload           5
	//   26   40:fadd            
	//   27   41:fconst_2        
	//   28   42:fdiv            
	//   29   43:putfield        #96  <Field float nz.c>
	//   30   46:return          
	}

	private void d(MotionEvent motionevent)
	{
		motionevent = ((MotionEvent) (((le)b).a(motionevent.getX(), motionevent.getY())));
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field ld b>
	//    2    4:checkcast       #101 <Class le>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #87  <Method float MotionEvent.getX()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #93  <Method float MotionEvent.getY()>
	//    7   15:invokevirtual   #205 <Method mh le.a(float, float)>
	//    8   18:astore_1        
		if(motionevent != null && !((mh) (motionevent)).b(d))
	//*   9   19:aload_1         
	//*  10   20:ifnull          51
	//*  11   23:aload_1         
	//*  12   24:aload_0         
	//*  13   25:getfield        #208 <Field mh d>
	//*  14   28:invokevirtual   #213 <Method boolean mh.b(mh)>
	//*  15   31:ifne            51
		{
			d = ((mh) (motionevent));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:putfield        #208 <Field mh d>
			((le)b).c(((mh) (motionevent)), true);
	//   19   39:aload_0         
	//   20   40:getfield        #99  <Field ld b>
	//   21   43:checkcast       #101 <Class le>
	//   22   46:aload_1         
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #216 <Method void le.c(mh, boolean)>
		}
	//   25   51:return          
	}

	private static float f(MotionEvent motionevent)
	{
		return Math.abs(motionevent.getX(0) - motionevent.getX(1));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #200 <Method float MotionEvent.getX(int)>
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #200 <Method float MotionEvent.getX(int)>
	//    6   10:fsub            
	//    7   11:invokestatic    #221 <Method float Math.abs(float)>
	//    8   14:freturn         
	}

	private static float g(MotionEvent motionevent)
	{
		float f1 = motionevent.getX(0) - motionevent.getX(1);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #200 <Method float MotionEvent.getX(int)>
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #200 <Method float MotionEvent.getX(int)>
	//    6   10:fsub            
	//    7   11:fstore_1        
		float f2 = motionevent.getY(0) - motionevent.getY(1);
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #202 <Method float MotionEvent.getY(int)>
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:invokevirtual   #202 <Method float MotionEvent.getY(int)>
	//   14   22:fsub            
	//   15   23:fstore_2        
		return (float)Math.sqrt(f1 * f1 + f2 * f2);
	//   16   24:fload_1         
	//   17   25:fload_1         
	//   18   26:fmul            
	//   19   27:fload_2         
	//   20   28:fload_2         
	//   21   29:fmul            
	//   22   30:fadd            
	//   23   31:f2d             
	//   24   32:invokestatic    #225 <Method double Math.sqrt(double)>
	//   25   35:d2f             
	//   26   36:freturn         
	}

	private static float k(MotionEvent motionevent)
	{
		return Math.abs(motionevent.getY(0) - motionevent.getY(1));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #202 <Method float MotionEvent.getY(int)>
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #202 <Method float MotionEvent.getY(int)>
	//    6   10:fsub            
	//    7   11:invokestatic    #221 <Method float Math.abs(float)>
	//    8   14:freturn         
	}

	public void b()
	{
		if(u.e == 0.0F && u.c == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field nz u>
	//*   2    4:getfield        #90  <Field float nz.e>
	//*   3    7:fconst_0        
	//*   4    8:fcmpl           
	//*   5    9:ifne            25
	//*   6   12:aload_0         
	//*   7   13:getfield        #61  <Field nz u>
	//*   8   16:getfield        #96  <Field float nz.c>
	//*   9   19:fconst_0        
	//*  10   20:fcmpl           
	//*  11   21:ifne            25
			return;
	//   12   24:return          
		long l1 = AnimationUtils.currentAnimationTimeMillis();
	//   13   25:invokestatic    #231 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   14   28:lstore          4
		Object obj = ((Object) (u));
	//   15   30:aload_0         
	//   16   31:getfield        #61  <Field nz u>
	//   17   34:astore          6
		obj.e = ((nz) (obj)).e * ((le)b).getDragDecelerationFrictionCoef();
	//   18   36:aload           6
	//   19   38:aload           6
	//   20   40:getfield        #90  <Field float nz.e>
	//   21   43:aload_0         
	//   22   44:getfield        #99  <Field ld b>
	//   23   47:checkcast       #101 <Class le>
	//   24   50:invokevirtual   #234 <Method float le.getDragDecelerationFrictionCoef()>
	//   25   53:fmul            
	//   26   54:putfield        #90  <Field float nz.e>
		obj = ((Object) (u));
	//   27   57:aload_0         
	//   28   58:getfield        #61  <Field nz u>
	//   29   61:astore          6
		obj.c = ((nz) (obj)).c * ((le)b).getDragDecelerationFrictionCoef();
	//   30   63:aload           6
	//   31   65:aload           6
	//   32   67:getfield        #96  <Field float nz.c>
	//   33   70:aload_0         
	//   34   71:getfield        #99  <Field ld b>
	//   35   74:checkcast       #101 <Class le>
	//   36   77:invokevirtual   #234 <Method float le.getDragDecelerationFrictionCoef()>
	//   37   80:fmul            
	//   38   81:putfield        #96  <Field float nz.c>
		float f1 = (float)(l1 - n) / 1000F;
	//   39   84:lload           4
	//   40   86:aload_0         
	//   41   87:getfield        #57  <Field long n>
	//   42   90:lsub            
	//   43   91:l2f             
	//   44   92:ldc1            #235 <Float 1000F>
	//   45   94:fdiv            
	//   46   95:fstore_1        
		float f2 = u.e;
	//   47   96:aload_0         
	//   48   97:getfield        #61  <Field nz u>
	//   49  100:getfield        #90  <Field float nz.e>
	//   50  103:fstore_2        
		float f3 = u.c;
	//   51  104:aload_0         
	//   52  105:getfield        #61  <Field nz u>
	//   53  108:getfield        #96  <Field float nz.c>
	//   54  111:fstore_3        
		obj = ((Object) (t));
	//   55  112:aload_0         
	//   56  113:getfield        #59  <Field nz t>
	//   57  116:astore          6
		obj.e = ((nz) (obj)).e + f2 * f1;
	//   58  118:aload           6
	//   59  120:aload           6
	//   60  122:getfield        #90  <Field float nz.e>
	//   61  125:fload_2         
	//   62  126:fload_1         
	//   63  127:fmul            
	//   64  128:fadd            
	//   65  129:putfield        #90  <Field float nz.e>
		obj = ((Object) (t));
	//   66  132:aload_0         
	//   67  133:getfield        #59  <Field nz t>
	//   68  136:astore          6
		obj.c = ((nz) (obj)).c + f3 * f1;
	//   69  138:aload           6
	//   70  140:aload           6
	//   71  142:getfield        #96  <Field float nz.c>
	//   72  145:fload_3         
	//   73  146:fload_1         
	//   74  147:fmul            
	//   75  148:fadd            
	//   76  149:putfield        #96  <Field float nz.c>
		obj = ((Object) (MotionEvent.obtain(l1, l1, 2, t.e, t.c, 0)));
	//   77  152:lload           4
	//   78  154:lload           4
	//   79  156:iconst_2        
	//   80  157:aload_0         
	//   81  158:getfield        #59  <Field nz t>
	//   82  161:getfield        #90  <Field float nz.e>
	//   83  164:aload_0         
	//   84  165:getfield        #59  <Field nz t>
	//   85  168:getfield        #96  <Field float nz.c>
	//   86  171:iconst_0        
	//   87  172:invokestatic    #239 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   88  175:astore          6
		if(((le)b).m())
	//*  89  177:aload_0         
	//*  90  178:getfield        #99  <Field ld b>
	//*  91  181:checkcast       #101 <Class le>
	//*  92  184:invokevirtual   #241 <Method boolean le.m()>
	//*  93  187:ifeq            209
			f1 = t.e - i.e;
	//   94  190:aload_0         
	//   95  191:getfield        #59  <Field nz t>
	//   96  194:getfield        #90  <Field float nz.e>
	//   97  197:aload_0         
	//   98  198:getfield        #47  <Field nz i>
	//   99  201:getfield        #90  <Field float nz.e>
	//  100  204:fsub            
	//  101  205:fstore_1        
		else
	//* 102  206:goto            211
			f1 = 0.0F;
	//  103  209:fconst_0        
	//  104  210:fstore_1        
		if(((le)b).o())
	//* 105  211:aload_0         
	//* 106  212:getfield        #99  <Field ld b>
	//* 107  215:checkcast       #101 <Class le>
	//* 108  218:invokevirtual   #243 <Method boolean le.o()>
	//* 109  221:ifeq            243
			f2 = t.c - i.c;
	//  110  224:aload_0         
	//  111  225:getfield        #59  <Field nz t>
	//  112  228:getfield        #96  <Field float nz.c>
	//  113  231:aload_0         
	//  114  232:getfield        #47  <Field nz i>
	//  115  235:getfield        #96  <Field float nz.c>
	//  116  238:fsub            
	//  117  239:fstore_2        
		else
	//* 118  240:goto            245
			f2 = 0.0F;
	//  119  243:fconst_0        
	//  120  244:fstore_2        
		b(((MotionEvent) (obj)), f1, f2);
	//  121  245:aload_0         
	//  122  246:aload           6
	//  123  248:fload_1         
	//  124  249:fload_2         
	//  125  250:invokespecial   #244 <Method void b(MotionEvent, float, float)>
		((MotionEvent) (obj)).recycle();
	//  126  253:aload           6
	//  127  255:invokevirtual   #247 <Method void MotionEvent.recycle()>
		h = ((le)b).getViewPortHandler().d(h, ((View) (b)), false);
	//  128  258:aload_0         
	//  129  259:aload_0         
	//  130  260:getfield        #99  <Field ld b>
	//  131  263:checkcast       #101 <Class le>
	//  132  266:invokevirtual   #155 <Method oa le.getViewPortHandler()>
	//  133  269:aload_0         
	//  134  270:getfield        #37  <Field Matrix h>
	//  135  273:aload_0         
	//  136  274:getfield        #99  <Field ld b>
	//  137  277:iconst_0        
	//  138  278:invokevirtual   #250 <Method Matrix oa.d(Matrix, View, boolean)>
	//  139  281:putfield        #37  <Field Matrix h>
		n = l1;
	//  140  284:aload_0         
	//  141  285:lload           4
	//  142  287:putfield        #57  <Field long n>
		if((double)Math.abs(u.e) >= 0.01D || (double)Math.abs(u.c) >= 0.01D)
	//* 143  290:aload_0         
	//* 144  291:getfield        #61  <Field nz u>
	//* 145  294:getfield        #90  <Field float nz.e>
	//* 146  297:invokestatic    #221 <Method float Math.abs(float)>
	//* 147  300:f2d             
	//* 148  301:ldc2w           #251 <Double 0.01D>
	//* 149  304:dcmpl           
	//* 150  305:ifge            326
	//* 151  308:aload_0         
	//* 152  309:getfield        #61  <Field nz u>
	//* 153  312:getfield        #96  <Field float nz.c>
	//* 154  315:invokestatic    #221 <Method float Math.abs(float)>
	//* 155  318:f2d             
	//* 156  319:ldc2w           #251 <Double 0.01D>
	//* 157  322:dcmpl           
	//* 158  323:iflt            334
		{
			oc.e(((View) (b)));
	//  159  326:aload_0         
	//  160  327:getfield        #99  <Field ld b>
	//  161  330:invokestatic    #255 <Method void oc.e(View)>
			return;
	//  162  333:return          
		} else
		{
			((le)b).f();
	//  163  334:aload_0         
	//  164  335:getfield        #99  <Field ld b>
	//  165  338:checkcast       #101 <Class le>
	//  166  341:invokevirtual   #257 <Method void le.f()>
			((le)b).postInvalidate();
	//  167  344:aload_0         
	//  168  345:getfield        #99  <Field ld b>
	//  169  348:checkcast       #101 <Class le>
	//  170  351:invokevirtual   #260 <Method void le.postInvalidate()>
			d();
	//  171  354:aload_0         
	//  172  355:invokevirtual   #262 <Method void d()>
			return;
	//  173  358:return          
		}
	}

	public void d()
	{
		u.e = 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field nz u>
	//    2    4:fconst_0        
	//    3    5:putfield        #90  <Field float nz.e>
		u.c = 0.0F;
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field nz u>
	//    6   12:fconst_0        
	//    7   13:putfield        #96  <Field float nz.c>
	//    8   16:return          
	}

	public nz e(float f1, float f2)
	{
		oa oa1 = ((le)b).getViewPortHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field ld b>
	//    2    4:checkcast       #101 <Class le>
	//    3    7:invokevirtual   #155 <Method oa le.getViewPortHandler()>
	//    4   10:astore          4
		float f3 = oa1.a();
	//    5   12:aload           4
	//    6   14:invokevirtual   #264 <Method float oa.a()>
	//    7   17:fstore_3        
		if(a())
	//*   8   18:aload_0         
	//*   9   19:invokespecial   #132 <Method boolean a()>
	//*  10   22:ifeq            37
			f2 = -(f2 - oa1.c());
	//   11   25:fload_2         
	//   12   26:aload           4
	//   13   28:invokevirtual   #266 <Method float oa.c()>
	//   14   31:fsub            
	//   15   32:fneg            
	//   16   33:fstore_2        
		else
	//*  17   34:goto            58
			f2 = -((float)((le)b).getMeasuredHeight() - f2 - oa1.d());
	//   18   37:aload_0         
	//   19   38:getfield        #99  <Field ld b>
	//   20   41:checkcast       #101 <Class le>
	//   21   44:invokevirtual   #269 <Method int le.getMeasuredHeight()>
	//   22   47:i2f             
	//   23   48:fload_2         
	//   24   49:fsub            
	//   25   50:aload           4
	//   26   52:invokevirtual   #271 <Method float oa.d()>
	//   27   55:fsub            
	//   28   56:fneg            
	//   29   57:fstore_2        
		return nz.d(f1 - f3, f2);
	//   30   58:fload_1         
	//   31   59:fload_3         
	//   32   60:fsub            
	//   33   61:fload_2         
	//   34   62:invokestatic    #45  <Method nz nz.d(float, float)>
	//   35   65:areturn         
	}

	public boolean onDoubleTap(MotionEvent motionevent)
	{
		c = nd.d.k;
	//    0    0:aload_0         
	//    1    1:getstatic       #275 <Field nd$d nd$d.k>
	//    2    4:putfield        #126 <Field nd$d c>
		ne ne1 = ((le)b).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field ld b>
	//    5   11:checkcast       #101 <Class le>
	//    6   14:invokevirtual   #130 <Method ne le.getOnChartGestureListener()>
	//    7   17:astore          4
		if(ne1 != null)
	//*   8   19:aload           4
	//*   9   21:ifnull          32
			ne1.e(motionevent);
	//   10   24:aload           4
	//   11   26:aload_1         
	//   12   27:invokeinterface #277 <Method void ne.e(MotionEvent)>
		if(((le)b).q() && ((lt)((le)b).getData()).o() > 0)
	//*  13   32:aload_0         
	//*  14   33:getfield        #99  <Field ld b>
	//*  15   36:checkcast       #101 <Class le>
	//*  16   39:invokevirtual   #279 <Method boolean le.q()>
	//*  17   42:ifeq            211
	//*  18   45:aload_0         
	//*  19   46:getfield        #99  <Field ld b>
	//*  20   49:checkcast       #101 <Class le>
	//*  21   52:invokevirtual   #283 <Method ma le.getData()>
	//*  22   55:checkcast       #285 <Class lt>
	//*  23   58:invokevirtual   #287 <Method int lt.o()>
	//*  24   61:ifle            211
		{
			nz nz1 = e(motionevent.getX(), motionevent.getY());
	//   25   64:aload_0         
	//   26   65:aload_1         
	//   27   66:invokevirtual   #87  <Method float MotionEvent.getX()>
	//   28   69:aload_1         
	//   29   70:invokevirtual   #93  <Method float MotionEvent.getY()>
	//   30   73:invokevirtual   #151 <Method nz e(float, float)>
	//   31   76:astore          4
			le le1 = (le)b;
	//   32   78:aload_0         
	//   33   79:getfield        #99  <Field ld b>
	//   34   82:checkcast       #101 <Class le>
	//   35   85:astore          5
			float f1;
			if(((le)b).n())
	//*  36   87:aload_0         
	//*  37   88:getfield        #99  <Field ld b>
	//*  38   91:checkcast       #101 <Class le>
	//*  39   94:invokevirtual   #176 <Method boolean le.n()>
	//*  40   97:ifeq            107
				f1 = 1.4F;
	//   41  100:ldc2            #288 <Float 1.4F>
	//   42  103:fstore_2        
			else
	//*  43  104:goto            109
				f1 = 1.0F;
	//   44  107:fconst_1        
	//   45  108:fstore_2        
			float f2;
			if(((le)b).r())
	//*  46  109:aload_0         
	//*  47  110:getfield        #99  <Field ld b>
	//*  48  113:checkcast       #101 <Class le>
	//*  49  116:invokevirtual   #179 <Method boolean le.r()>
	//*  50  119:ifeq            129
				f2 = 1.4F;
	//   51  122:ldc2            #288 <Float 1.4F>
	//   52  125:fstore_3        
			else
	//*  53  126:goto            131
				f2 = 1.0F;
	//   54  129:fconst_1        
	//   55  130:fstore_3        
			le1.b(f1, f2, nz1.e, nz1.c);
	//   56  131:aload           5
	//   57  133:fload_2         
	//   58  134:fload_3         
	//   59  135:aload           4
	//   60  137:getfield        #90  <Field float nz.e>
	//   61  140:aload           4
	//   62  142:getfield        #96  <Field float nz.c>
	//   63  145:invokevirtual   #291 <Method void le.b(float, float, float, float)>
			if(((le)b).C())
	//*  64  148:aload_0         
	//*  65  149:getfield        #99  <Field ld b>
	//*  66  152:checkcast       #101 <Class le>
	//*  67  155:invokevirtual   #294 <Method boolean le.C()>
	//*  68  158:ifeq            206
				Log.i("BarlineChartTouch", (new StringBuilder()).append("Double-Tap, Zooming In, x: ").append(nz1.e).append(", y: ").append(nz1.c).toString());
	//   69  161:ldc2            #296 <String "BarlineChartTouch">
	//   70  164:new             #298 <Class StringBuilder>
	//   71  167:dup             
	//   72  168:invokespecial   #299 <Method void StringBuilder()>
	//   73  171:ldc2            #301 <String "Double-Tap, Zooming In, x: ">
	//   74  174:invokevirtual   #305 <Method StringBuilder StringBuilder.append(String)>
	//   75  177:aload           4
	//   76  179:getfield        #90  <Field float nz.e>
	//   77  182:invokevirtual   #308 <Method StringBuilder StringBuilder.append(float)>
	//   78  185:ldc2            #310 <String ", y: ">
	//   79  188:invokevirtual   #305 <Method StringBuilder StringBuilder.append(String)>
	//   80  191:aload           4
	//   81  193:getfield        #96  <Field float nz.c>
	//   82  196:invokevirtual   #308 <Method StringBuilder StringBuilder.append(float)>
	//   83  199:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   84  202:invokestatic    #319 <Method int Log.i(String, String)>
	//   85  205:pop             
			nz.c(nz1);
	//   86  206:aload           4
	//   87  208:invokestatic    #196 <Method void nz.c(nz)>
		}
		return super.onDoubleTap(motionevent);
	//   88  211:aload_0         
	//   89  212:aload_1         
	//   90  213:invokespecial   #321 <Method boolean nd.onDoubleTap(MotionEvent)>
	//   91  216:ireturn         
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
	{
		c = nd.d.g;
	//    0    0:aload_0         
	//    1    1:getstatic       #325 <Field nd$d nd$d.g>
	//    2    4:putfield        #126 <Field nd$d c>
		ne ne1 = ((le)b).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field ld b>
	//    5   11:checkcast       #101 <Class le>
	//    6   14:invokevirtual   #130 <Method ne le.getOnChartGestureListener()>
	//    7   17:astore          5
		if(ne1 != null)
	//*   8   19:aload           5
	//*   9   21:ifnull          36
			ne1.d(motionevent, motionevent1, f1, f2);
	//   10   24:aload           5
	//   11   26:aload_1         
	//   12   27:aload_2         
	//   13   28:fload_3         
	//   14   29:fload           4
	//   15   31:invokeinterface #328 <Method void ne.d(MotionEvent, MotionEvent, float, float)>
		return super.onFling(motionevent, motionevent1, f1, f2);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:fload_3         
	//   20   40:fload           4
	//   21   42:invokespecial   #330 <Method boolean nd.onFling(MotionEvent, MotionEvent, float, float)>
	//   22   45:ireturn         
	}

	public void onLongPress(MotionEvent motionevent)
	{
		c = nd.d.f;
	//    0    0:aload_0         
	//    1    1:getstatic       #333 <Field nd$d nd$d.f>
	//    2    4:putfield        #126 <Field nd$d c>
		ne ne1 = ((le)b).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field ld b>
	//    5   11:checkcast       #101 <Class le>
	//    6   14:invokevirtual   #130 <Method ne le.getOnChartGestureListener()>
	//    7   17:astore_2        
		if(ne1 != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          29
			ne1.b(motionevent);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokeinterface #335 <Method void ne.b(MotionEvent)>
	//   13   29:return          
	}

	public boolean onSingleTapUp(MotionEvent motionevent)
	{
		c = nd.d.h;
	//    0    0:aload_0         
	//    1    1:getstatic       #338 <Field nd$d nd$d.h>
	//    2    4:putfield        #126 <Field nd$d c>
		ne ne1 = ((le)b).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field ld b>
	//    5   11:checkcast       #101 <Class le>
	//    6   14:invokevirtual   #130 <Method ne le.getOnChartGestureListener()>
	//    7   17:astore_2        
		if(ne1 != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          29
			ne1.d(motionevent);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokeinterface #340 <Method void ne.d(MotionEvent)>
		if(!((le)b).w())
	//*  13   29:aload_0         
	//*  14   30:getfield        #99  <Field ld b>
	//*  15   33:checkcast       #101 <Class le>
	//*  16   36:invokevirtual   #341 <Method boolean le.w()>
	//*  17   39:ifne            44
		{
			return false;
	//   18   42:iconst_0        
	//   19   43:ireturn         
		} else
		{
			c(((le)b).a(motionevent.getX(), motionevent.getY()), motionevent);
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #99  <Field ld b>
	//   23   49:checkcast       #101 <Class le>
	//   24   52:aload_1         
	//   25   53:invokevirtual   #87  <Method float MotionEvent.getX()>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #93  <Method float MotionEvent.getY()>
	//   28   60:invokevirtual   #205 <Method mh le.a(float, float)>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #344 <Method void c(mh, MotionEvent)>
			return super.onSingleTapUp(motionevent);
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:invokespecial   #346 <Method boolean nd.onSingleTapUp(MotionEvent)>
	//   34   72:ireturn         
		}
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(o == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #353 <Field VelocityTracker o>
	//*   2    4:ifnonnull       14
			o = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #358 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #353 <Field VelocityTracker o>
		o.addMovement(motionevent);
	//    6   14:aload_0         
	//    7   15:getfield        #353 <Field VelocityTracker o>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #361 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(motionevent.getActionMasked() == 3 && o != null)
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #364 <Method int MotionEvent.getActionMasked()>
	//*  12   26:iconst_3        
	//*  13   27:icmpne          49
	//*  14   30:aload_0         
	//*  15   31:getfield        #353 <Field VelocityTracker o>
	//*  16   34:ifnull          49
		{
			o.recycle();
	//   17   37:aload_0         
	//   18   38:getfield        #353 <Field VelocityTracker o>
	//   19   41:invokevirtual   #365 <Method void VelocityTracker.recycle()>
			o = null;
	//   20   44:aload_0         
	//   21   45:aconst_null     
	//   22   46:putfield        #353 <Field VelocityTracker o>
		}
		if(a == 0)
	//*  23   49:aload_0         
	//*  24   50:getfield        #158 <Field int a>
	//*  25   53:ifne            65
			e.onTouchEvent(motionevent);
	//   26   56:aload_0         
	//   27   57:getfield        #368 <Field GestureDetector e>
	//   28   60:aload_2         
	//   29   61:invokevirtual   #373 <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//   30   64:pop             
		if(!((le)b).l() && !((le)b).n() && !((le)b).r())
	//*  31   65:aload_0         
	//*  32   66:getfield        #99  <Field ld b>
	//*  33   69:checkcast       #101 <Class le>
	//*  34   72:invokevirtual   #375 <Method boolean le.l()>
	//*  35   75:ifne            106
	//*  36   78:aload_0         
	//*  37   79:getfield        #99  <Field ld b>
	//*  38   82:checkcast       #101 <Class le>
	//*  39   85:invokevirtual   #176 <Method boolean le.n()>
	//*  40   88:ifne            106
	//*  41   91:aload_0         
	//*  42   92:getfield        #99  <Field ld b>
	//*  43   95:checkcast       #101 <Class le>
	//*  44   98:invokevirtual   #179 <Method boolean le.r()>
	//*  45  101:ifne            106
			return true;
	//   46  104:iconst_1        
	//   47  105:ireturn         
		switch(motionevent.getAction() & 0xff)
	//*  48  106:aload_2         
	//*  49  107:invokevirtual   #378 <Method int MotionEvent.getAction()>
	//*  50  110:sipush          255
	//*  51  113:iand            
		{
		case 4: // '\004'
		default:
			break;

	//*  52  114:tableswitch     0 6: default 156
	//	               0 159
	//	               1 733
	//	               2 347
	//	               3 984
	//	               4 994
	//	               5 176
	//	               6 968
	//*  53  156:goto            994
		case 0: // '\0'
			e(motionevent);
	//   54  159:aload_0         
	//   55  160:aload_2         
	//   56  161:invokevirtual   #379 <Method void e(MotionEvent)>
			d();
	//   57  164:aload_0         
	//   58  165:invokevirtual   #262 <Method void d()>
			a(motionevent);
	//   59  168:aload_0         
	//   60  169:aload_2         
	//   61  170:invokespecial   #381 <Method void a(MotionEvent)>
			break;
	//   62  173:goto            994

		case 5: // '\005'
			if(motionevent.getPointerCount() < 2)
				break;
	//   63  176:aload_2         
	//   64  177:invokevirtual   #146 <Method int MotionEvent.getPointerCount()>
	//   65  180:iconst_2        
	//   66  181:icmplt          994
			((le)b).A();
	//   67  184:aload_0         
	//   68  185:getfield        #99  <Field ld b>
	//   69  188:checkcast       #101 <Class le>
	//   70  191:invokevirtual   #384 <Method void le.A()>
			a(motionevent);
	//   71  194:aload_0         
	//   72  195:aload_2         
	//   73  196:invokespecial   #381 <Method void a(MotionEvent)>
			k = f(motionevent);
	//   74  199:aload_0         
	//   75  200:aload_2         
	//   76  201:invokestatic    #189 <Method float f(MotionEvent)>
	//   77  204:putfield        #51  <Field float k>
			p = k(motionevent);
	//   78  207:aload_0         
	//   79  208:aload_2         
	//   80  209:invokestatic    #193 <Method float k(MotionEvent)>
	//   81  212:putfield        #53  <Field float p>
			l = g(motionevent);
	//   82  215:aload_0         
	//   83  216:aload_2         
	//   84  217:invokestatic    #149 <Method float g(MotionEvent)>
	//   85  220:putfield        #55  <Field float l>
			if(l > 10F)
	//*  86  223:aload_0         
	//*  87  224:getfield        #55  <Field float l>
	//*  88  227:ldc2            #385 <Float 10F>
	//*  89  230:fcmpl           
	//*  90  231:ifle            336
				if(((le)b).s())
	//*  91  234:aload_0         
	//*  92  235:getfield        #99  <Field ld b>
	//*  93  238:checkcast       #101 <Class le>
	//*  94  241:invokevirtual   #387 <Method boolean le.s()>
	//*  95  244:ifeq            255
					a = 4;
	//   96  247:aload_0         
	//   97  248:iconst_4        
	//   98  249:putfield        #158 <Field int a>
				else
	//*  99  252:goto            336
				if(((le)b).n() != ((le)b).r())
	//* 100  255:aload_0         
	//* 101  256:getfield        #99  <Field ld b>
	//* 102  259:checkcast       #101 <Class le>
	//* 103  262:invokevirtual   #176 <Method boolean le.n()>
	//* 104  265:aload_0         
	//* 105  266:getfield        #99  <Field ld b>
	//* 106  269:checkcast       #101 <Class le>
	//* 107  272:invokevirtual   #179 <Method boolean le.r()>
	//* 108  275:icmpeq          309
				{
					int j;
					if(((le)b).n())
	//* 109  278:aload_0         
	//* 110  279:getfield        #99  <Field ld b>
	//* 111  282:checkcast       #101 <Class le>
	//* 112  285:invokevirtual   #176 <Method boolean le.n()>
	//* 113  288:ifeq            297
						j = 2;
	//  114  291:iconst_2        
	//  115  292:istore          5
					else
	//* 116  294:goto            300
						j = 3;
	//  117  297:iconst_3        
	//  118  298:istore          5
					a = j;
	//  119  300:aload_0         
	//  120  301:iload           5
	//  121  303:putfield        #158 <Field int a>
				} else
	//* 122  306:goto            336
				{
					int i1;
					if(k > p)
	//* 123  309:aload_0         
	//* 124  310:getfield        #51  <Field float k>
	//* 125  313:aload_0         
	//* 126  314:getfield        #53  <Field float p>
	//* 127  317:fcmpl           
	//* 128  318:ifle            327
						i1 = 2;
	//  129  321:iconst_2        
	//  130  322:istore          5
					else
	//* 131  324:goto            330
						i1 = 3;
	//  132  327:iconst_3        
	//  133  328:istore          5
					a = i1;
	//  134  330:aload_0         
	//  135  331:iload           5
	//  136  333:putfield        #158 <Field int a>
				}
			c(f, motionevent);
	//  137  336:aload_0         
	//  138  337:getfield        #49  <Field nz f>
	//  139  340:aload_2         
	//  140  341:invokestatic    #389 <Method void c(nz, MotionEvent)>
			break;
	//  141  344:goto            994

		case 2: // '\002'
			if(a == 1)
	//* 142  347:aload_0         
	//* 143  348:getfield        #158 <Field int a>
	//* 144  351:iconst_1        
	//* 145  352:icmpne          440
			{
				((le)b).A();
	//  146  355:aload_0         
	//  147  356:getfield        #99  <Field ld b>
	//  148  359:checkcast       #101 <Class le>
	//  149  362:invokevirtual   #384 <Method void le.A()>
				float f1;
				if(((le)b).m())
	//* 150  365:aload_0         
	//* 151  366:getfield        #99  <Field ld b>
	//* 152  369:checkcast       #101 <Class le>
	//* 153  372:invokevirtual   #241 <Method boolean le.m()>
	//* 154  375:ifeq            394
					f1 = motionevent.getX() - i.e;
	//  155  378:aload_2         
	//  156  379:invokevirtual   #87  <Method float MotionEvent.getX()>
	//  157  382:aload_0         
	//  158  383:getfield        #47  <Field nz i>
	//  159  386:getfield        #90  <Field float nz.e>
	//  160  389:fsub            
	//  161  390:fstore_3        
				else
	//* 162  391:goto            396
					f1 = 0.0F;
	//  163  394:fconst_0        
	//  164  395:fstore_3        
				float f4;
				if(((le)b).o())
	//* 165  396:aload_0         
	//* 166  397:getfield        #99  <Field ld b>
	//* 167  400:checkcast       #101 <Class le>
	//* 168  403:invokevirtual   #243 <Method boolean le.o()>
	//* 169  406:ifeq            426
					f4 = motionevent.getY() - i.c;
	//  170  409:aload_2         
	//  171  410:invokevirtual   #93  <Method float MotionEvent.getY()>
	//  172  413:aload_0         
	//  173  414:getfield        #47  <Field nz i>
	//  174  417:getfield        #96  <Field float nz.c>
	//  175  420:fsub            
	//  176  421:fstore          4
				else
	//* 177  423:goto            429
					f4 = 0.0F;
	//  178  426:fconst_0        
	//  179  427:fstore          4
				b(motionevent, f1, f4);
	//  180  429:aload_0         
	//  181  430:aload_2         
	//  182  431:fload_3         
	//  183  432:fload           4
	//  184  434:invokespecial   #244 <Method void b(MotionEvent, float, float)>
				break;
	//  185  437:goto            994
			}
			if(a == 2 || a == 3 || a == 4)
	//* 186  440:aload_0         
	//* 187  441:getfield        #158 <Field int a>
	//* 188  444:iconst_2        
	//* 189  445:icmpeq          464
	//* 190  448:aload_0         
	//* 191  449:getfield        #158 <Field int a>
	//* 192  452:iconst_3        
	//* 193  453:icmpeq          464
	//* 194  456:aload_0         
	//* 195  457:getfield        #158 <Field int a>
	//* 196  460:iconst_4        
	//* 197  461:icmpne          508
			{
				((le)b).A();
	//  198  464:aload_0         
	//  199  465:getfield        #99  <Field ld b>
	//  200  468:checkcast       #101 <Class le>
	//  201  471:invokevirtual   #384 <Method void le.A()>
				if(((le)b).n() || ((le)b).r())
	//* 202  474:aload_0         
	//* 203  475:getfield        #99  <Field ld b>
	//* 204  478:checkcast       #101 <Class le>
	//* 205  481:invokevirtual   #176 <Method boolean le.n()>
	//* 206  484:ifne            500
	//* 207  487:aload_0         
	//* 208  488:getfield        #99  <Field ld b>
	//* 209  491:checkcast       #101 <Class le>
	//* 210  494:invokevirtual   #179 <Method boolean le.r()>
	//* 211  497:ifeq            994
					c(motionevent);
	//  212  500:aload_0         
	//  213  501:aload_2         
	//  214  502:invokespecial   #391 <Method void c(MotionEvent)>
				break;
	//  215  505:goto            994
			}
			if(a != 0 || Math.abs(d(motionevent.getX(), i.e, motionevent.getY(), i.c)) <= q || !((le)b).l())
				break;
	//  216  508:aload_0         
	//  217  509:getfield        #158 <Field int a>
	//  218  512:ifne            994
	//  219  515:aload_2         
	//  220  516:invokevirtual   #87  <Method float MotionEvent.getX()>
	//  221  519:aload_0         
	//  222  520:getfield        #47  <Field nz i>
	//  223  523:getfield        #90  <Field float nz.e>
	//  224  526:aload_2         
	//  225  527:invokevirtual   #93  <Method float MotionEvent.getY()>
	//  226  530:aload_0         
	//  227  531:getfield        #47  <Field nz i>
	//  228  534:getfield        #96  <Field float nz.c>
	//  229  537:invokestatic    #394 <Method float d(float, float, float, float)>
	//  230  540:invokestatic    #221 <Method float Math.abs(float)>
	//  231  543:aload_0         
	//  232  544:getfield        #69  <Field float q>
	//  233  547:fcmpl           
	//  234  548:ifle            994
	//  235  551:aload_0         
	//  236  552:getfield        #99  <Field ld b>
	//  237  555:checkcast       #101 <Class le>
	//  238  558:invokevirtual   #375 <Method boolean le.l()>
	//  239  561:ifeq            994
			boolean flag;
			if(!((le)b).t() || !((le)b).y())
	//* 240  564:aload_0         
	//* 241  565:getfield        #99  <Field ld b>
	//* 242  568:checkcast       #101 <Class le>
	//* 243  571:invokevirtual   #396 <Method boolean le.t()>
	//* 244  574:ifeq            590
	//* 245  577:aload_0         
	//* 246  578:getfield        #99  <Field ld b>
	//* 247  581:checkcast       #101 <Class le>
	//* 248  584:invokevirtual   #397 <Method boolean le.y()>
	//* 249  587:ifne            596
				flag = true;
	//  250  590:iconst_1        
	//  251  591:istore          5
			else
	//* 252  593:goto            599
				flag = false;
	//  253  596:iconst_0        
	//  254  597:istore          5
			if(flag)
	//* 255  599:iload           5
	//* 256  601:ifeq            692
			{
				float f2 = Math.abs(motionevent.getX() - i.e);
	//  257  604:aload_2         
	//  258  605:invokevirtual   #87  <Method float MotionEvent.getX()>
	//  259  608:aload_0         
	//  260  609:getfield        #47  <Field nz i>
	//  261  612:getfield        #90  <Field float nz.e>
	//  262  615:fsub            
	//  263  616:invokestatic    #221 <Method float Math.abs(float)>
	//  264  619:fstore_3        
				float f5 = Math.abs(motionevent.getY() - i.c);
	//  265  620:aload_2         
	//  266  621:invokevirtual   #93  <Method float MotionEvent.getY()>
	//  267  624:aload_0         
	//  268  625:getfield        #47  <Field nz i>
	//  269  628:getfield        #96  <Field float nz.c>
	//  270  631:fsub            
	//  271  632:invokestatic    #221 <Method float Math.abs(float)>
	//  272  635:fstore          4
				if((((le)b).m() || f5 >= f2) && (((le)b).o() || f5 <= f2))
	//* 273  637:aload_0         
	//* 274  638:getfield        #99  <Field ld b>
	//* 275  641:checkcast       #101 <Class le>
	//* 276  644:invokevirtual   #241 <Method boolean le.m()>
	//* 277  647:ifne            657
	//* 278  650:fload           4
	//* 279  652:fload_3         
	//* 280  653:fcmpl           
	//* 281  654:iflt            689
	//* 282  657:aload_0         
	//* 283  658:getfield        #99  <Field ld b>
	//* 284  661:checkcast       #101 <Class le>
	//* 285  664:invokevirtual   #243 <Method boolean le.o()>
	//* 286  667:ifne            677
	//* 287  670:fload           4
	//* 288  672:fload_3         
	//* 289  673:fcmpg           
	//* 290  674:ifgt            689
				{
					c = nd.d.c;
	//  291  677:aload_0         
	//  292  678:getstatic       #125 <Field nd$d nd$d.c>
	//  293  681:putfield        #126 <Field nd$d c>
					a = 1;
	//  294  684:aload_0         
	//  295  685:iconst_1        
	//  296  686:putfield        #158 <Field int a>
				}
				break;
	//  297  689:goto            730
			}
			if(!((le)b).p())
				break;
	//  298  692:aload_0         
	//  299  693:getfield        #99  <Field ld b>
	//  300  696:checkcast       #101 <Class le>
	//  301  699:invokevirtual   #399 <Method boolean le.p()>
	//  302  702:ifeq            730
			c = nd.d.c;
	//  303  705:aload_0         
	//  304  706:getstatic       #125 <Field nd$d nd$d.c>
	//  305  709:putfield        #126 <Field nd$d c>
			if(((le)b).p())
	//* 306  712:aload_0         
	//* 307  713:getfield        #99  <Field ld b>
	//* 308  716:checkcast       #101 <Class le>
	//* 309  719:invokevirtual   #399 <Method boolean le.p()>
	//* 310  722:ifeq            730
				d(motionevent);
	//  311  725:aload_0         
	//  312  726:aload_2         
	//  313  727:invokespecial   #400 <Method void d(MotionEvent)>
			break;
	//  314  730:goto            994

		case 1: // '\001'
			view = ((View) (o));
	//  315  733:aload_0         
	//  316  734:getfield        #353 <Field VelocityTracker o>
	//  317  737:astore_1        
			int j1 = motionevent.getPointerId(0);
	//  318  738:aload_2         
	//  319  739:iconst_0        
	//  320  740:invokevirtual   #404 <Method int MotionEvent.getPointerId(int)>
	//  321  743:istore          5
			((VelocityTracker) (view)).computeCurrentVelocity(1000, oc.d());
	//  322  745:aload_1         
	//  323  746:sipush          1000
	//  324  749:invokestatic    #406 <Method int oc.d()>
	//  325  752:i2f             
	//  326  753:invokevirtual   #410 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			float f3 = ((VelocityTracker) (view)).getYVelocity(j1);
	//  327  756:aload_1         
	//  328  757:iload           5
	//  329  759:invokevirtual   #413 <Method float VelocityTracker.getYVelocity(int)>
	//  330  762:fstore_3        
			float f6 = ((VelocityTracker) (view)).getXVelocity(j1);
	//  331  763:aload_1         
	//  332  764:iload           5
	//  333  766:invokevirtual   #416 <Method float VelocityTracker.getXVelocity(int)>
	//  334  769:fstore          4
			if((Math.abs(f6) > (float)oc.b() || Math.abs(f3) > (float)oc.b()) && a == 1 && ((le)b).x())
	//* 335  771:fload           4
	//* 336  773:invokestatic    #221 <Method float Math.abs(float)>
	//* 337  776:invokestatic    #418 <Method int oc.b()>
	//* 338  779:i2f             
	//* 339  780:fcmpl           
	//* 340  781:ifgt            796
	//* 341  784:fload_3         
	//* 342  785:invokestatic    #221 <Method float Math.abs(float)>
	//* 343  788:invokestatic    #418 <Method int oc.b()>
	//* 344  791:i2f             
	//* 345  792:fcmpl           
	//* 346  793:ifle            874
	//* 347  796:aload_0         
	//* 348  797:getfield        #158 <Field int a>
	//* 349  800:iconst_1        
	//* 350  801:icmpne          874
	//* 351  804:aload_0         
	//* 352  805:getfield        #99  <Field ld b>
	//* 353  808:checkcast       #101 <Class le>
	//* 354  811:invokevirtual   #419 <Method boolean le.x()>
	//* 355  814:ifeq            874
			{
				d();
	//  356  817:aload_0         
	//  357  818:invokevirtual   #262 <Method void d()>
				n = AnimationUtils.currentAnimationTimeMillis();
	//  358  821:aload_0         
	//  359  822:invokestatic    #231 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//  360  825:putfield        #57  <Field long n>
				t.e = motionevent.getX();
	//  361  828:aload_0         
	//  362  829:getfield        #59  <Field nz t>
	//  363  832:aload_2         
	//  364  833:invokevirtual   #87  <Method float MotionEvent.getX()>
	//  365  836:putfield        #90  <Field float nz.e>
				t.c = motionevent.getY();
	//  366  839:aload_0         
	//  367  840:getfield        #59  <Field nz t>
	//  368  843:aload_2         
	//  369  844:invokevirtual   #93  <Method float MotionEvent.getY()>
	//  370  847:putfield        #96  <Field float nz.c>
				u.e = f6;
	//  371  850:aload_0         
	//  372  851:getfield        #61  <Field nz u>
	//  373  854:fload           4
	//  374  856:putfield        #90  <Field float nz.e>
				u.c = f3;
	//  375  859:aload_0         
	//  376  860:getfield        #61  <Field nz u>
	//  377  863:fload_3         
	//  378  864:putfield        #96  <Field float nz.c>
				oc.e(((View) (b)));
	//  379  867:aload_0         
	//  380  868:getfield        #99  <Field ld b>
	//  381  871:invokestatic    #255 <Method void oc.e(View)>
			}
			if(a == 2 || a == 3 || a == 4 || a == 5)
	//* 382  874:aload_0         
	//* 383  875:getfield        #158 <Field int a>
	//* 384  878:iconst_2        
	//* 385  879:icmpeq          906
	//* 386  882:aload_0         
	//* 387  883:getfield        #158 <Field int a>
	//* 388  886:iconst_3        
	//* 389  887:icmpeq          906
	//* 390  890:aload_0         
	//* 391  891:getfield        #158 <Field int a>
	//* 392  894:iconst_4        
	//* 393  895:icmpeq          906
	//* 394  898:aload_0         
	//* 395  899:getfield        #158 <Field int a>
	//* 396  902:iconst_5        
	//* 397  903:icmpne          926
			{
				((le)b).f();
	//  398  906:aload_0         
	//  399  907:getfield        #99  <Field ld b>
	//  400  910:checkcast       #101 <Class le>
	//  401  913:invokevirtual   #257 <Method void le.f()>
				((le)b).postInvalidate();
	//  402  916:aload_0         
	//  403  917:getfield        #99  <Field ld b>
	//  404  920:checkcast       #101 <Class le>
	//  405  923:invokevirtual   #260 <Method void le.postInvalidate()>
			}
			a = 0;
	//  406  926:aload_0         
	//  407  927:iconst_0        
	//  408  928:putfield        #158 <Field int a>
			((le)b).B();
	//  409  931:aload_0         
	//  410  932:getfield        #99  <Field ld b>
	//  411  935:checkcast       #101 <Class le>
	//  412  938:invokevirtual   #422 <Method void le.B()>
			if(o != null)
	//* 413  941:aload_0         
	//* 414  942:getfield        #353 <Field VelocityTracker o>
	//* 415  945:ifnull          960
			{
				o.recycle();
	//  416  948:aload_0         
	//  417  949:getfield        #353 <Field VelocityTracker o>
	//  418  952:invokevirtual   #365 <Method void VelocityTracker.recycle()>
				o = null;
	//  419  955:aload_0         
	//  420  956:aconst_null     
	//  421  957:putfield        #353 <Field VelocityTracker o>
			}
			b(motionevent);
	//  422  960:aload_0         
	//  423  961:aload_2         
	//  424  962:invokevirtual   #423 <Method void b(MotionEvent)>
			break;

	//* 425  965:goto            994
		case 6: // '\006'
			oc.d(motionevent, o);
	//  426  968:aload_2         
	//  427  969:aload_0         
	//  428  970:getfield        #353 <Field VelocityTracker o>
	//  429  973:invokestatic    #426 <Method void oc.d(MotionEvent, VelocityTracker)>
			a = 5;
	//  430  976:aload_0         
	//  431  977:iconst_5        
	//  432  978:putfield        #158 <Field int a>
			break;

	//* 433  981:goto            994
		case 3: // '\003'
			a = 0;
	//  434  984:aload_0         
	//  435  985:iconst_0        
	//  436  986:putfield        #158 <Field int a>
			b(motionevent);
	//  437  989:aload_0         
	//  438  990:aload_2         
	//  439  991:invokevirtual   #423 <Method void b(MotionEvent)>
			break;
		}
		h = ((le)b).getViewPortHandler().d(h, ((View) (b)), true);
	//  440  994:aload_0         
	//  441  995:aload_0         
	//  442  996:getfield        #99  <Field ld b>
	//  443  999:checkcast       #101 <Class le>
	//  444 1002:invokevirtual   #155 <Method oa le.getViewPortHandler()>
	//  445 1005:aload_0         
	//  446 1006:getfield        #37  <Field Matrix h>
	//  447 1009:aload_0         
	//  448 1010:getfield        #99  <Field ld b>
	//  449 1013:iconst_1        
	//  450 1014:invokevirtual   #250 <Method Matrix oa.d(Matrix, View, boolean)>
	//  451 1017:putfield        #37  <Field Matrix h>
		return true;
	//  452 1020:iconst_1        
	//  453 1021:ireturn         
	}

	private nz f;
	private Matrix g;
	private Matrix h;
	private nz i;
	private float k;
	private float l;
	private mz m;
	private long n;
	private VelocityTracker o;
	private float p;
	private float q;
	private float s;
	private nz t;
	private nz u;
}
