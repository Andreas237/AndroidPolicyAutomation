// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.*;
import android.support.v4.util.ArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

static class VectorDrawableCompat$b
{

	static Paint a(VectorDrawableCompat$b vectordrawablecompat$b)
	{
		return vectordrawablecompat$b.n;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Paint n>
	//    2    4:areturn         
	}

	static Paint a(VectorDrawableCompat$b vectordrawablecompat$b, Paint paint)
	{
		vectordrawablecompat$b.p = paint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field Paint p>
		return paint;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void b(VectorDrawableCompat$d vectordrawablecompat$d, VectorDrawableCompat$e vectordrawablecompat$e, Canvas canvas, int j, int i1, ColorFilter colorfilter)
	{
		float f2 = (float)j / e;
	//    0    0:iload           4
	//    1    2:i2f             
	//    2    3:aload_0         
	//    3    4:getfield        #51  <Field float e>
	//    4    7:fdiv            
	//    5    8:fstore          8
		float f3 = (float)i1 / c;
	//    6   10:iload           5
	//    7   12:i2f             
	//    8   13:aload_0         
	//    9   14:getfield        #53  <Field float c>
	//   10   17:fdiv            
	//   11   18:fstore          9
		float f1 = Math.min(f2, f3);
	//   12   20:fload           8
	//   13   22:fload           9
	//   14   24:invokestatic    #100 <Method float Math.min(float, float)>
	//   15   27:fstore          7
		vectordrawablecompat$d = ((VectorDrawableCompat$d) (VectorDrawableCompat$d.c(vectordrawablecompat$d)));
	//   16   29:aload_1         
	//   17   30:invokestatic    #103 <Method Matrix VectorDrawableCompat$d.c(VectorDrawableCompat$d)>
	//   18   33:astore_1        
		l.set(((Matrix) (vectordrawablecompat$d)));
	//   19   34:aload_0         
	//   20   35:getfield        #45  <Field Matrix l>
	//   21   38:aload_1         
	//   22   39:invokevirtual   #107 <Method void Matrix.set(Matrix)>
		l.postScale(f2, f3);
	//   23   42:aload_0         
	//   24   43:getfield        #45  <Field Matrix l>
	//   25   46:fload           8
	//   26   48:fload           9
	//   27   50:invokevirtual   #111 <Method boolean Matrix.postScale(float, float)>
	//   28   53:pop             
		f2 = d(((Matrix) (vectordrawablecompat$d)));
	//   29   54:aload_0         
	//   30   55:aload_1         
	//   31   56:invokespecial   #114 <Method float d(Matrix)>
	//   32   59:fstore          8
		if(f2 == 0.0F)
	//*  33   61:fload           8
	//*  34   63:fconst_0        
	//*  35   64:fcmpl           
	//*  36   65:ifne            69
			return;
	//   37   68:return          
		vectordrawablecompat$e.a(k);
	//   38   69:aload_2         
	//   39   70:aload_0         
	//   40   71:getfield        #72  <Field Path k>
	//   41   74:invokevirtual   #118 <Method void VectorDrawableCompat$e.a(Path)>
		Path path = k;
	//   42   77:aload_0         
	//   43   78:getfield        #72  <Field Path k>
	//   44   81:astore          14
		f.reset();
	//   45   83:aload_0         
	//   46   84:getfield        #74  <Field Path f>
	//   47   87:invokevirtual   #121 <Method void Path.reset()>
		if(vectordrawablecompat$e.d())
	//*  48   90:aload_2         
	//*  49   91:invokevirtual   #124 <Method boolean VectorDrawableCompat$e.d()>
	//*  50   94:ifeq            120
		{
			f.addPath(path, l);
	//   51   97:aload_0         
	//   52   98:getfield        #74  <Field Path f>
	//   53  101:aload           14
	//   54  103:aload_0         
	//   55  104:getfield        #45  <Field Matrix l>
	//   56  107:invokevirtual   #128 <Method void Path.addPath(Path, Matrix)>
			canvas.clipPath(f);
	//   57  110:aload_3         
	//   58  111:aload_0         
	//   59  112:getfield        #74  <Field Path f>
	//   60  115:invokevirtual   #134 <Method boolean Canvas.clipPath(Path)>
	//   61  118:pop             
			return;
	//   62  119:return          
		}
		vectordrawablecompat$d = ((VectorDrawableCompat$d) ((VectorDrawableCompat$c)vectordrawablecompat$e));
	//   63  120:aload_2         
	//   64  121:checkcast       #136 <Class VectorDrawableCompat$c>
	//   65  124:astore_1        
		if(((VectorDrawableCompat$c) (vectordrawablecompat$d)).g != 0.0F || ((VectorDrawableCompat$c) (vectordrawablecompat$d)).h != 1.0F)
	//*  66  125:aload_1         
	//*  67  126:getfield        #138 <Field float VectorDrawableCompat$c.g>
	//*  68  129:fconst_0        
	//*  69  130:fcmpl           
	//*  70  131:ifne            143
	//*  71  134:aload_1         
	//*  72  135:getfield        #140 <Field float VectorDrawableCompat$c.h>
	//*  73  138:fconst_1        
	//*  74  139:fcmpl           
	//*  75  140:ifeq            297
		{
			float f7 = ((VectorDrawableCompat$c) (vectordrawablecompat$d)).g;
	//   76  143:aload_1         
	//   77  144:getfield        #138 <Field float VectorDrawableCompat$c.g>
	//   78  147:fstore          12
			float f8 = ((VectorDrawableCompat$c) (vectordrawablecompat$d)).f;
	//   79  149:aload_1         
	//   80  150:getfield        #142 <Field float VectorDrawableCompat$c.f>
	//   81  153:fstore          13
			float f5 = ((VectorDrawableCompat$c) (vectordrawablecompat$d)).h;
	//   82  155:aload_1         
	//   83  156:getfield        #140 <Field float VectorDrawableCompat$c.h>
	//   84  159:fstore          10
			float f6 = ((VectorDrawableCompat$c) (vectordrawablecompat$d)).f;
	//   85  161:aload_1         
	//   86  162:getfield        #142 <Field float VectorDrawableCompat$c.f>
	//   87  165:fstore          11
			if(o == null)
	//*  88  167:aload_0         
	//*  89  168:getfield        #144 <Field PathMeasure o>
	//*  90  171:ifnonnull       185
				o = new PathMeasure();
	//   91  174:aload_0         
	//   92  175:new             #146 <Class PathMeasure>
	//   93  178:dup             
	//   94  179:invokespecial   #147 <Method void PathMeasure()>
	//   95  182:putfield        #144 <Field PathMeasure o>
			o.setPath(k, false);
	//   96  185:aload_0         
	//   97  186:getfield        #144 <Field PathMeasure o>
	//   98  189:aload_0         
	//   99  190:getfield        #72  <Field Path k>
	//  100  193:iconst_0        
	//  101  194:invokevirtual   #151 <Method void PathMeasure.setPath(Path, boolean)>
			float f4 = o.getLength();
	//  102  197:aload_0         
	//  103  198:getfield        #144 <Field PathMeasure o>
	//  104  201:invokevirtual   #155 <Method float PathMeasure.getLength()>
	//  105  204:fstore          9
			f7 = ((f7 + f8) % 1.0F) * f4;
	//  106  206:fload           12
	//  107  208:fload           13
	//  108  210:fadd            
	//  109  211:fconst_1        
	//  110  212:frem            
	//  111  213:fload           9
	//  112  215:fmul            
	//  113  216:fstore          12
			f5 = ((f5 + f6) % 1.0F) * f4;
	//  114  218:fload           10
	//  115  220:fload           11
	//  116  222:fadd            
	//  117  223:fconst_1        
	//  118  224:frem            
	//  119  225:fload           9
	//  120  227:fmul            
	//  121  228:fstore          10
			path.reset();
	//  122  230:aload           14
	//  123  232:invokevirtual   #121 <Method void Path.reset()>
			if(f7 > f5)
	//* 124  235:fload           12
	//* 125  237:fload           10
	//* 126  239:fcmpl           
	//* 127  240:ifle            275
			{
				o.getSegment(f7, f4, path, true);
	//  128  243:aload_0         
	//  129  244:getfield        #144 <Field PathMeasure o>
	//  130  247:fload           12
	//  131  249:fload           9
	//  132  251:aload           14
	//  133  253:iconst_1        
	//  134  254:invokevirtual   #159 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  135  257:pop             
				o.getSegment(0.0F, f5, path, true);
	//  136  258:aload_0         
	//  137  259:getfield        #144 <Field PathMeasure o>
	//  138  262:fconst_0        
	//  139  263:fload           10
	//  140  265:aload           14
	//  141  267:iconst_1        
	//  142  268:invokevirtual   #159 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  143  271:pop             
			} else
	//* 144  272:goto            290
			{
				o.getSegment(f7, f5, path, true);
	//  145  275:aload_0         
	//  146  276:getfield        #144 <Field PathMeasure o>
	//  147  279:fload           12
	//  148  281:fload           10
	//  149  283:aload           14
	//  150  285:iconst_1        
	//  151  286:invokevirtual   #159 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  152  289:pop             
			}
			path.rLineTo(0.0F, 0.0F);
	//  153  290:aload           14
	//  154  292:fconst_0        
	//  155  293:fconst_0        
	//  156  294:invokevirtual   #163 <Method void Path.rLineTo(float, float)>
		}
		f.addPath(path, l);
	//  157  297:aload_0         
	//  158  298:getfield        #74  <Field Path f>
	//  159  301:aload           14
	//  160  303:aload_0         
	//  161  304:getfield        #45  <Field Matrix l>
	//  162  307:invokevirtual   #128 <Method void Path.addPath(Path, Matrix)>
		if(((VectorDrawableCompat$c) (vectordrawablecompat$d)).a != 0)
	//* 163  310:aload_1         
	//* 164  311:getfield        #165 <Field int VectorDrawableCompat$c.a>
	//* 165  314:ifeq            389
		{
			if(p == null)
	//* 166  317:aload_0         
	//* 167  318:getfield        #93  <Field Paint p>
	//* 168  321:ifnonnull       353
			{
				p = new Paint();
	//  169  324:aload_0         
	//  170  325:new             #167 <Class Paint>
	//  171  328:dup             
	//  172  329:invokespecial   #168 <Method void Paint()>
	//  173  332:putfield        #93  <Field Paint p>
				p.setStyle(android.graphics.Paint.Style.FILL);
	//  174  335:aload_0         
	//  175  336:getfield        #93  <Field Paint p>
	//  176  339:getstatic       #174 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  177  342:invokevirtual   #178 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				p.setAntiAlias(true);
	//  178  345:aload_0         
	//  179  346:getfield        #93  <Field Paint p>
	//  180  349:iconst_1        
	//  181  350:invokevirtual   #182 <Method void Paint.setAntiAlias(boolean)>
			}
			vectordrawablecompat$e = ((VectorDrawableCompat$e) (p));
	//  182  353:aload_0         
	//  183  354:getfield        #93  <Field Paint p>
	//  184  357:astore_2        
			((Paint) (vectordrawablecompat$e)).setColor(VectorDrawableCompat.applyAlpha(((VectorDrawableCompat$c) (vectordrawablecompat$d)).a, ((VectorDrawableCompat$c) (vectordrawablecompat$d)).i));
	//  185  358:aload_2         
	//  186  359:aload_1         
	//  187  360:getfield        #165 <Field int VectorDrawableCompat$c.a>
	//  188  363:aload_1         
	//  189  364:getfield        #184 <Field float VectorDrawableCompat$c.i>
	//  190  367:invokestatic    #188 <Method int VectorDrawableCompat.applyAlpha(int, float)>
	//  191  370:invokevirtual   #192 <Method void Paint.setColor(int)>
			((Paint) (vectordrawablecompat$e)).setColorFilter(colorfilter);
	//  192  373:aload_2         
	//  193  374:aload           6
	//  194  376:invokevirtual   #196 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//  195  379:pop             
			canvas.drawPath(f, ((Paint) (vectordrawablecompat$e)));
	//  196  380:aload_3         
	//  197  381:aload_0         
	//  198  382:getfield        #74  <Field Path f>
	//  199  385:aload_2         
	//  200  386:invokevirtual   #200 <Method void Canvas.drawPath(Path, Paint)>
		}
		if(((VectorDrawableCompat$c) (vectordrawablecompat$d)).e != 0)
	//* 201  389:aload_1         
	//* 202  390:getfield        #202 <Field int VectorDrawableCompat$c.e>
	//* 203  393:ifeq            520
		{
			if(n == null)
	//* 204  396:aload_0         
	//* 205  397:getfield        #90  <Field Paint n>
	//* 206  400:ifnonnull       432
			{
				n = new Paint();
	//  207  403:aload_0         
	//  208  404:new             #167 <Class Paint>
	//  209  407:dup             
	//  210  408:invokespecial   #168 <Method void Paint()>
	//  211  411:putfield        #90  <Field Paint n>
				n.setStyle(android.graphics.Paint.Style.STROKE);
	//  212  414:aload_0         
	//  213  415:getfield        #90  <Field Paint n>
	//  214  418:getstatic       #205 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  215  421:invokevirtual   #178 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				n.setAntiAlias(true);
	//  216  424:aload_0         
	//  217  425:getfield        #90  <Field Paint n>
	//  218  428:iconst_1        
	//  219  429:invokevirtual   #182 <Method void Paint.setAntiAlias(boolean)>
			}
			vectordrawablecompat$e = ((VectorDrawableCompat$e) (n));
	//  220  432:aload_0         
	//  221  433:getfield        #90  <Field Paint n>
	//  222  436:astore_2        
			if(((VectorDrawableCompat$c) (vectordrawablecompat$d)).n != null)
	//* 223  437:aload_1         
	//* 224  438:getfield        #208 <Field android.graphics.Paint$Join VectorDrawableCompat$c.n>
	//* 225  441:ifnull          452
				((Paint) (vectordrawablecompat$e)).setStrokeJoin(((VectorDrawableCompat$c) (vectordrawablecompat$d)).n);
	//  226  444:aload_2         
	//  227  445:aload_1         
	//  228  446:getfield        #208 <Field android.graphics.Paint$Join VectorDrawableCompat$c.n>
	//  229  449:invokevirtual   #212 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
			if(((VectorDrawableCompat$c) (vectordrawablecompat$d)).k != null)
	//* 230  452:aload_1         
	//* 231  453:getfield        #215 <Field android.graphics.Paint$Cap VectorDrawableCompat$c.k>
	//* 232  456:ifnull          467
				((Paint) (vectordrawablecompat$e)).setStrokeCap(((VectorDrawableCompat$c) (vectordrawablecompat$d)).k);
	//  233  459:aload_2         
	//  234  460:aload_1         
	//  235  461:getfield        #215 <Field android.graphics.Paint$Cap VectorDrawableCompat$c.k>
	//  236  464:invokevirtual   #219 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
			((Paint) (vectordrawablecompat$e)).setStrokeMiter(((VectorDrawableCompat$c) (vectordrawablecompat$d)).o);
	//  237  467:aload_2         
	//  238  468:aload_1         
	//  239  469:getfield        #221 <Field float VectorDrawableCompat$c.o>
	//  240  472:invokevirtual   #225 <Method void Paint.setStrokeMiter(float)>
			((Paint) (vectordrawablecompat$e)).setColor(VectorDrawableCompat.applyAlpha(((VectorDrawableCompat$c) (vectordrawablecompat$d)).e, ((VectorDrawableCompat$c) (vectordrawablecompat$d)).b));
	//  241  475:aload_2         
	//  242  476:aload_1         
	//  243  477:getfield        #202 <Field int VectorDrawableCompat$c.e>
	//  244  480:aload_1         
	//  245  481:getfield        #226 <Field float VectorDrawableCompat$c.b>
	//  246  484:invokestatic    #188 <Method int VectorDrawableCompat.applyAlpha(int, float)>
	//  247  487:invokevirtual   #192 <Method void Paint.setColor(int)>
			((Paint) (vectordrawablecompat$e)).setColorFilter(colorfilter);
	//  248  490:aload_2         
	//  249  491:aload           6
	//  250  493:invokevirtual   #196 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//  251  496:pop             
			((Paint) (vectordrawablecompat$e)).setStrokeWidth(((VectorDrawableCompat$c) (vectordrawablecompat$d)).d * (f1 * f2));
	//  252  497:aload_2         
	//  253  498:aload_1         
	//  254  499:getfield        #228 <Field float VectorDrawableCompat$c.d>
	//  255  502:fload           7
	//  256  504:fload           8
	//  257  506:fmul            
	//  258  507:fmul            
	//  259  508:invokevirtual   #231 <Method void Paint.setStrokeWidth(float)>
			canvas.drawPath(f, ((Paint) (vectordrawablecompat$e)));
	//  260  511:aload_3         
	//  261  512:aload_0         
	//  262  513:getfield        #74  <Field Path f>
	//  263  516:aload_2         
	//  264  517:invokevirtual   #200 <Method void Canvas.drawPath(Path, Paint)>
		}
	//  265  520:return          
	}

	static Paint c(VectorDrawableCompat$b vectordrawablecompat$b)
	{
		return vectordrawablecompat$b.p;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Paint p>
	//    2    4:areturn         
	}

	private float d(Matrix matrix)
	{
		float af[] = new float[4];
	//    0    0:iconst_4        
	//    1    1:newarray        float[]
	//    2    3:astore          5
		float[] _tmp = af;
	//    3    5:aload           5
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:fconst_0        
	//    7   10:fastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:fconst_1        
	//   11   14:fastore         
	//   12   15:dup             
	//   13   16:iconst_2        
	//   14   17:fconst_1        
	//   15   18:fastore         
	//   16   19:dup             
	//   17   20:iconst_3        
	//   18   21:fconst_0        
	//   19   22:fastore         
	//   20   23:pop             
		af[0] = 0.0F;
		af[1] = 1.0F;
		af[2] = 1.0F;
		af[3] = 0.0F;
		matrix.mapVectors(af);
	//   21   24:aload_1         
	//   22   25:aload           5
	//   23   27:invokevirtual   #235 <Method void Matrix.mapVectors(float[])>
		float f1 = (float)Math.hypot(af[0], af[1]);
	//   24   30:aload           5
	//   25   32:iconst_0        
	//   26   33:faload          
	//   27   34:f2d             
	//   28   35:aload           5
	//   29   37:iconst_1        
	//   30   38:faload          
	//   31   39:f2d             
	//   32   40:invokestatic    #239 <Method double Math.hypot(double, double)>
	//   33   43:d2f             
	//   34   44:fstore_2        
		float f3 = (float)Math.hypot(af[2], af[3]);
	//   35   45:aload           5
	//   36   47:iconst_2        
	//   37   48:faload          
	//   38   49:f2d             
	//   39   50:aload           5
	//   40   52:iconst_3        
	//   41   53:faload          
	//   42   54:f2d             
	//   43   55:invokestatic    #239 <Method double Math.hypot(double, double)>
	//   44   58:d2f             
	//   45   59:fstore          4
		float f2 = e(af[0], af[1], af[2], af[3]);
	//   46   61:aload           5
	//   47   63:iconst_0        
	//   48   64:faload          
	//   49   65:aload           5
	//   50   67:iconst_1        
	//   51   68:faload          
	//   52   69:aload           5
	//   53   71:iconst_2        
	//   54   72:faload          
	//   55   73:aload           5
	//   56   75:iconst_3        
	//   57   76:faload          
	//   58   77:invokestatic    #242 <Method float e(float, float, float, float)>
	//   59   80:fstore_3        
		f3 = Math.max(f1, f3);
	//   60   81:fload_2         
	//   61   82:fload           4
	//   62   84:invokestatic    #245 <Method float Math.max(float, float)>
	//   63   87:fstore          4
		f1 = 0.0F;
	//   64   89:fconst_0        
	//   65   90:fstore_2        
		if(f3 > 0.0F)
	//*  66   91:fload           4
	//*  67   93:fconst_0        
	//*  68   94:fcmpl           
	//*  69   95:ifle            106
			f1 = Math.abs(f2) / f3;
	//   70   98:fload_3         
	//   71   99:invokestatic    #249 <Method float Math.abs(float)>
	//   72  102:fload           4
	//   73  104:fdiv            
	//   74  105:fstore_2        
		return f1;
	//   75  106:fload_2         
	//   76  107:freturn         
	}

	static Paint d(VectorDrawableCompat$b vectordrawablecompat$b, Paint paint)
	{
		vectordrawablecompat$b.n = paint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field Paint n>
		return paint;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void d(VectorDrawableCompat$d vectordrawablecompat$d, Matrix matrix, Canvas canvas, int j, int i1, ColorFilter colorfilter)
	{
		VectorDrawableCompat$d.c(vectordrawablecompat$d).set(matrix);
	//    0    0:aload_1         
	//    1    1:invokestatic    #103 <Method Matrix VectorDrawableCompat$d.c(VectorDrawableCompat$d)>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #107 <Method void Matrix.set(Matrix)>
		VectorDrawableCompat$d.c(vectordrawablecompat$d).preConcat(VectorDrawableCompat$d.b(vectordrawablecompat$d));
	//    4    8:aload_1         
	//    5    9:invokestatic    #103 <Method Matrix VectorDrawableCompat$d.c(VectorDrawableCompat$d)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #252 <Method Matrix VectorDrawableCompat$d.b(VectorDrawableCompat$d)>
	//    8   16:invokevirtual   #256 <Method boolean Matrix.preConcat(Matrix)>
	//    9   19:pop             
		canvas.save();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #260 <Method int Canvas.save()>
	//   12   24:pop             
		for(int j1 = 0; j1 < vectordrawablecompat$d.a.size(); j1++)
	//*  13   25:iconst_0        
	//*  14   26:istore          7
	//*  15   28:iload           7
	//*  16   30:aload_1         
	//*  17   31:getfield        #263 <Field ArrayList VectorDrawableCompat$d.a>
	//*  18   34:invokevirtual   #268 <Method int ArrayList.size()>
	//*  19   37:icmpge          111
		{
			matrix = ((Matrix) (vectordrawablecompat$d.a.get(j1)));
	//   20   40:aload_1         
	//   21   41:getfield        #263 <Field ArrayList VectorDrawableCompat$d.a>
	//   22   44:iload           7
	//   23   46:invokevirtual   #272 <Method Object ArrayList.get(int)>
	//   24   49:astore_2        
			if(matrix instanceof VectorDrawableCompat$d)
	//*  25   50:aload_2         
	//*  26   51:instanceof      #64  <Class VectorDrawableCompat$d>
	//*  27   54:ifeq            79
			{
				d((VectorDrawableCompat$d)matrix, VectorDrawableCompat$d.c(vectordrawablecompat$d), canvas, j, i1, colorfilter);
	//   28   57:aload_0         
	//   29   58:aload_2         
	//   30   59:checkcast       #64  <Class VectorDrawableCompat$d>
	//   31   62:aload_1         
	//   32   63:invokestatic    #103 <Method Matrix VectorDrawableCompat$d.c(VectorDrawableCompat$d)>
	//   33   66:aload_3         
	//   34   67:iload           4
	//   35   69:iload           5
	//   36   71:aload           6
	//   37   73:invokespecial   #274 <Method void d(VectorDrawableCompat$d, Matrix, Canvas, int, int, ColorFilter)>
				continue;
	//   38   76:goto            102
			}
			if(matrix instanceof VectorDrawableCompat$e)
	//*  39   79:aload_2         
	//*  40   80:instanceof      #116 <Class VectorDrawableCompat$e>
	//*  41   83:ifeq            102
				b(vectordrawablecompat$d, (VectorDrawableCompat$e)matrix, canvas, j, i1, colorfilter);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:aload_2         
	//   45   89:checkcast       #116 <Class VectorDrawableCompat$e>
	//   46   92:aload_3         
	//   47   93:iload           4
	//   48   95:iload           5
	//   49   97:aload           6
	//   50   99:invokespecial   #276 <Method void b(VectorDrawableCompat$d, VectorDrawableCompat$e, Canvas, int, int, ColorFilter)>
		}

	//   51  102:iload           7
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:istore          7
	//*  55  108:goto            28
		canvas.restore();
	//   56  111:aload_3         
	//   57  112:invokevirtual   #279 <Method void Canvas.restore()>
	//   58  115:return          
	}

	private static float e(float f1, float f2, float f3, float f4)
	{
		return f1 * f4 - f2 * f3;
	//    0    0:fload_0         
	//    1    1:fload_3         
	//    2    2:fmul            
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:fmul            
	//    6    6:fsub            
	//    7    7:freturn         
	}

	public void b(Canvas canvas, int j, int i1, ColorFilter colorfilter)
	{
		d(d, m, canvas, j, i1, colorfilter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field VectorDrawableCompat$d d>
	//    3    5:getstatic       #41  <Field Matrix m>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #274 <Method void d(VectorDrawableCompat$d, Matrix, Canvas, int, int, ColorFilter)>
	//    9   16:return          
	}

	public float getAlpha()
	{
		return (float)getRootAlpha() / 255F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #284 <Method int getRootAlpha()>
	//    2    4:i2f             
	//    3    5:ldc2            #285 <Float 255F>
	//    4    8:fdiv            
	//    5    9:freturn         
	}

	public int getRootAlpha()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int i>
	//    2    4:ireturn         
	}

	public void setAlpha(float f1)
	{
		setRootAlpha((int)(255F * f1));
	//    0    0:aload_0         
	//    1    1:ldc2            #285 <Float 255F>
	//    2    4:fload_1         
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:invokevirtual   #289 <Method void setRootAlpha(int)>
	//    6   10:return          
	}

	public void setRootAlpha(int j)
	{
		i = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int i>
	//    3    5:return          
	}

	private static final Matrix m = new Matrix();
	float a;
	float b;
	float c;
	final VectorDrawableCompat$d d;
	float e;
	private final Path f;
	String g;
	final ArrayMap h;
	int i;
	private final Path k;
	private final Matrix l;
	private Paint n;
	private PathMeasure o;
	private Paint p;
	private int u;

	static 
	{
	//    0    0:new             #36  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void Matrix()>
	//    3    7:putstatic       #41  <Field Matrix m>
	//*   4   10:return          
	}

	public VectorDrawableCompat$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		l = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #36  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Matrix()>
	//    6   12:putfield        #45  <Field Matrix l>
		a = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #47  <Field float a>
		b = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #49  <Field float b>
		e = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #51  <Field float e>
		c = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #53  <Field float c>
		i = 255;
	//   19   35:aload_0         
	//   20   36:sipush          255
	//   21   39:putfield        #55  <Field int i>
		g = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #57  <Field String g>
		h = new ArrayMap();
	//   25   47:aload_0         
	//   26   48:new             #59  <Class ArrayMap>
	//   27   51:dup             
	//   28   52:invokespecial   #60  <Method void ArrayMap()>
	//   29   55:putfield        #62  <Field ArrayMap h>
		d = new VectorDrawableCompat$d();
	//   30   58:aload_0         
	//   31   59:new             #64  <Class VectorDrawableCompat$d>
	//   32   62:dup             
	//   33   63:invokespecial   #65  <Method void VectorDrawableCompat$d()>
	//   34   66:putfield        #67  <Field VectorDrawableCompat$d d>
		k = new Path();
	//   35   69:aload_0         
	//   36   70:new             #69  <Class Path>
	//   37   73:dup             
	//   38   74:invokespecial   #70  <Method void Path()>
	//   39   77:putfield        #72  <Field Path k>
		f = new Path();
	//   40   80:aload_0         
	//   41   81:new             #69  <Class Path>
	//   42   84:dup             
	//   43   85:invokespecial   #70  <Method void Path()>
	//   44   88:putfield        #74  <Field Path f>
	//   45   91:return          
	}

	public VectorDrawableCompat$b(VectorDrawableCompat$b vectordrawablecompat$b)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		l = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #36  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Matrix()>
	//    6   12:putfield        #45  <Field Matrix l>
		a = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #47  <Field float a>
		b = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #49  <Field float b>
		e = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #51  <Field float e>
		c = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #53  <Field float c>
		i = 255;
	//   19   35:aload_0         
	//   20   36:sipush          255
	//   21   39:putfield        #55  <Field int i>
		g = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #57  <Field String g>
		h = new ArrayMap();
	//   25   47:aload_0         
	//   26   48:new             #59  <Class ArrayMap>
	//   27   51:dup             
	//   28   52:invokespecial   #60  <Method void ArrayMap()>
	//   29   55:putfield        #62  <Field ArrayMap h>
		d = new VectorDrawableCompat$d(vectordrawablecompat$b.d, h);
	//   30   58:aload_0         
	//   31   59:new             #64  <Class VectorDrawableCompat$d>
	//   32   62:dup             
	//   33   63:aload_1         
	//   34   64:getfield        #67  <Field VectorDrawableCompat$d d>
	//   35   67:aload_0         
	//   36   68:getfield        #62  <Field ArrayMap h>
	//   37   71:invokespecial   #78  <Method void VectorDrawableCompat$d(VectorDrawableCompat$d, ArrayMap)>
	//   38   74:putfield        #67  <Field VectorDrawableCompat$d d>
		k = new Path(vectordrawablecompat$b.k);
	//   39   77:aload_0         
	//   40   78:new             #69  <Class Path>
	//   41   81:dup             
	//   42   82:aload_1         
	//   43   83:getfield        #72  <Field Path k>
	//   44   86:invokespecial   #81  <Method void Path(Path)>
	//   45   89:putfield        #72  <Field Path k>
		f = new Path(vectordrawablecompat$b.f);
	//   46   92:aload_0         
	//   47   93:new             #69  <Class Path>
	//   48   96:dup             
	//   49   97:aload_1         
	//   50   98:getfield        #74  <Field Path f>
	//   51  101:invokespecial   #81  <Method void Path(Path)>
	//   52  104:putfield        #74  <Field Path f>
		a = vectordrawablecompat$b.a;
	//   53  107:aload_0         
	//   54  108:aload_1         
	//   55  109:getfield        #47  <Field float a>
	//   56  112:putfield        #47  <Field float a>
		b = vectordrawablecompat$b.b;
	//   57  115:aload_0         
	//   58  116:aload_1         
	//   59  117:getfield        #49  <Field float b>
	//   60  120:putfield        #49  <Field float b>
		e = vectordrawablecompat$b.e;
	//   61  123:aload_0         
	//   62  124:aload_1         
	//   63  125:getfield        #51  <Field float e>
	//   64  128:putfield        #51  <Field float e>
		c = vectordrawablecompat$b.c;
	//   65  131:aload_0         
	//   66  132:aload_1         
	//   67  133:getfield        #53  <Field float c>
	//   68  136:putfield        #53  <Field float c>
		u = vectordrawablecompat$b.u;
	//   69  139:aload_0         
	//   70  140:aload_1         
	//   71  141:getfield        #83  <Field int u>
	//   72  144:putfield        #83  <Field int u>
		i = vectordrawablecompat$b.i;
	//   73  147:aload_0         
	//   74  148:aload_1         
	//   75  149:getfield        #55  <Field int i>
	//   76  152:putfield        #55  <Field int i>
		g = vectordrawablecompat$b.g;
	//   77  155:aload_0         
	//   78  156:aload_1         
	//   79  157:getfield        #57  <Field String g>
	//   80  160:putfield        #57  <Field String g>
		if(vectordrawablecompat$b.g != null)
	//*  81  163:aload_1         
	//*  82  164:getfield        #57  <Field String g>
	//*  83  167:ifnull          183
			h.put(((Object) (vectordrawablecompat$b.g)), ((Object) (this)));
	//   84  170:aload_0         
	//   85  171:getfield        #62  <Field ArrayMap h>
	//   86  174:aload_1         
	//   87  175:getfield        #57  <Field String g>
	//   88  178:aload_0         
	//   89  179:invokevirtual   #87  <Method Object ArrayMap.put(Object, Object)>
	//   90  182:pop             
	//   91  183:return          
	}
}
