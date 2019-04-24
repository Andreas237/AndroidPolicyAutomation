// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.b.a;

import android.graphics.*;
import android.support.v4.f.a;
import java.util.ArrayList;

// Referenced classes of package android.support.b.a:
//			i

private static class i$e
{

	private static float a(float f1, float f2, float f3, float f4)
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

	private float a(Matrix matrix)
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
	//   23   27:invokevirtual   #93  <Method void Matrix.mapVectors(float[])>
		float f1 = (float)Math.hypot(af[0], af[1]);
	//   24   30:aload           5
	//   25   32:iconst_0        
	//   26   33:faload          
	//   27   34:f2d             
	//   28   35:aload           5
	//   29   37:iconst_1        
	//   30   38:faload          
	//   31   39:f2d             
	//   32   40:invokestatic    #99  <Method double Math.hypot(double, double)>
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
	//   43   55:invokestatic    #99  <Method double Math.hypot(double, double)>
	//   44   58:d2f             
	//   45   59:fstore          4
		float f2 = a(af[0], af[1], af[2], af[3]);
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
	//   58   77:invokestatic    #101 <Method float a(float, float, float, float)>
	//   59   80:fstore_3        
		f3 = Math.max(f1, f3);
	//   60   81:fload_2         
	//   61   82:fload           4
	//   62   84:invokestatic    #105 <Method float Math.max(float, float)>
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
	//   71   99:invokestatic    #109 <Method float Math.abs(float)>
	//   72  102:fload           4
	//   73  104:fdiv            
	//   74  105:fstore_2        
		return f1;
	//   75  106:fload_2         
	//   76  107:freturn         
	}

	static Paint a(i$e i$e1)
	{
		return i$e1.n;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Paint n>
	//    2    4:areturn         
	}

	static Paint a(i$e i$e1, Paint paint)
	{
		i$e1.n = paint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field Paint n>
		return paint;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(i$c i$c1, Matrix matrix, Canvas canvas, int i1, int j1, ColorFilter colorfilter)
	{
		android.support.b.a.i$c.a(i$c1).set(matrix);
	//    0    0:aload_1         
	//    1    1:invokestatic    #117 <Method Matrix android.support.b.a.i$c.a(i$c)>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #121 <Method void Matrix.set(Matrix)>
		android.support.b.a.i$c.a(i$c1).preConcat(i$c.b(i$c1));
	//    4    8:aload_1         
	//    5    9:invokestatic    #117 <Method Matrix android.support.b.a.i$c.a(i$c)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #123 <Method Matrix i$c.b(i$c)>
	//    8   16:invokevirtual   #127 <Method boolean Matrix.preConcat(Matrix)>
	//    9   19:pop             
		canvas.save();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #133 <Method int Canvas.save()>
	//   12   24:pop             
		for(int k1 = 0; k1 < i$c1.a.size(); k1++)
	//*  13   25:iconst_0        
	//*  14   26:istore          7
	//*  15   28:iload           7
	//*  16   30:aload_1         
	//*  17   31:getfield        #136 <Field ArrayList android.support.b.a.i$c.a>
	//*  18   34:invokevirtual   #141 <Method int ArrayList.size()>
	//*  19   37:icmpge          111
		{
			matrix = ((Matrix) (i$c1.a.get(k1)));
	//   20   40:aload_1         
	//   21   41:getfield        #136 <Field ArrayList android.support.b.a.i$c.a>
	//   22   44:iload           7
	//   23   46:invokevirtual   #145 <Method Object ArrayList.get(int)>
	//   24   49:astore_2        
			if(matrix instanceof i$c)
	//*  25   50:aload_2         
	//*  26   51:instanceof      #64  <Class i$c>
	//*  27   54:ifeq            79
			{
				a((i$c)matrix, android.support.b.a.i$c.a(i$c1), canvas, i1, j1, colorfilter);
	//   28   57:aload_0         
	//   29   58:aload_2         
	//   30   59:checkcast       #64  <Class i$c>
	//   31   62:aload_1         
	//   32   63:invokestatic    #117 <Method Matrix android.support.b.a.i$c.a(i$c)>
	//   33   66:aload_3         
	//   34   67:iload           4
	//   35   69:iload           5
	//   36   71:aload           6
	//   37   73:invokespecial   #147 <Method void a(i$c, Matrix, Canvas, int, int, ColorFilter)>
				continue;
	//   38   76:goto            102
			}
			if(matrix instanceof i$d)
	//*  39   79:aload_2         
	//*  40   80:instanceof      #149 <Class i$d>
	//*  41   83:ifeq            102
				a(i$c1, (i$d)matrix, canvas, i1, j1, colorfilter);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:aload_2         
	//   45   89:checkcast       #149 <Class i$d>
	//   46   92:aload_3         
	//   47   93:iload           4
	//   48   95:iload           5
	//   49   97:aload           6
	//   50   99:invokespecial   #152 <Method void a(i$c, i$d, Canvas, int, int, ColorFilter)>
		}

	//   51  102:iload           7
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:istore          7
	//*  55  108:goto            28
		canvas.restore();
	//   56  111:aload_3         
	//   57  112:invokevirtual   #155 <Method void Canvas.restore()>
	//   58  115:return          
	}

	private void a(i$c i$c1, i$d i$d1, Canvas canvas, int i1, int j1, ColorFilter colorfilter)
	{
		float f2 = (float)i1 / d;
	//    0    0:iload           4
	//    1    2:i2f             
	//    2    3:aload_0         
	//    3    4:getfield        #51  <Field float d>
	//    4    7:fdiv            
	//    5    8:fstore          8
		float f3 = (float)j1 / e;
	//    6   10:iload           5
	//    7   12:i2f             
	//    8   13:aload_0         
	//    9   14:getfield        #53  <Field float e>
	//   10   17:fdiv            
	//   11   18:fstore          9
		float f1 = Math.min(f2, f3);
	//   12   20:fload           8
	//   13   22:fload           9
	//   14   24:invokestatic    #158 <Method float Math.min(float, float)>
	//   15   27:fstore          7
		i$c1 = ((i$c) (android.support.b.a.i$c.a(i$c1)));
	//   16   29:aload_1         
	//   17   30:invokestatic    #117 <Method Matrix android.support.b.a.i$c.a(i$c)>
	//   18   33:astore_1        
		l.set(((Matrix) (i$c1)));
	//   19   34:aload_0         
	//   20   35:getfield        #45  <Field Matrix l>
	//   21   38:aload_1         
	//   22   39:invokevirtual   #121 <Method void Matrix.set(Matrix)>
		l.postScale(f2, f3);
	//   23   42:aload_0         
	//   24   43:getfield        #45  <Field Matrix l>
	//   25   46:fload           8
	//   26   48:fload           9
	//   27   50:invokevirtual   #162 <Method boolean Matrix.postScale(float, float)>
	//   28   53:pop             
		f2 = a(((Matrix) (i$c1)));
	//   29   54:aload_0         
	//   30   55:aload_1         
	//   31   56:invokespecial   #164 <Method float a(Matrix)>
	//   32   59:fstore          8
		if(f2 == 0.0F)
	//*  33   61:fload           8
	//*  34   63:fconst_0        
	//*  35   64:fcmpl           
	//*  36   65:ifne            69
			return;
	//   37   68:return          
		i$d1.a(i);
	//   38   69:aload_2         
	//   39   70:aload_0         
	//   40   71:getfield        #72  <Field Path i>
	//   41   74:invokevirtual   #166 <Method void android.support.b.a.i$d.a(Path)>
		i$c1 = ((i$c) (i));
	//   42   77:aload_0         
	//   43   78:getfield        #72  <Field Path i>
	//   44   81:astore_1        
		j.reset();
	//   45   82:aload_0         
	//   46   83:getfield        #74  <Field Path j>
	//   47   86:invokevirtual   #169 <Method void Path.reset()>
		if(i$d1.a())
	//*  48   89:aload_2         
	//*  49   90:invokevirtual   #172 <Method boolean android.support.b.a.i$d.a()>
	//*  50   93:ifeq            118
		{
			j.addPath(((Path) (i$c1)), l);
	//   51   96:aload_0         
	//   52   97:getfield        #74  <Field Path j>
	//   53  100:aload_1         
	//   54  101:aload_0         
	//   55  102:getfield        #45  <Field Matrix l>
	//   56  105:invokevirtual   #176 <Method void Path.addPath(Path, Matrix)>
			canvas.clipPath(j);
	//   57  108:aload_3         
	//   58  109:aload_0         
	//   59  110:getfield        #74  <Field Path j>
	//   60  113:invokevirtual   #180 <Method boolean Canvas.clipPath(Path)>
	//   61  116:pop             
			return;
	//   62  117:return          
		}
		i$d1 = ((i$d) ((i$b)i$d1));
	//   63  118:aload_2         
	//   64  119:checkcast       #182 <Class i$b>
	//   65  122:astore_2        
		if(((i$b) (i$d1)).g != 0.0F || ((i$b) (i$d1)).h != 1.0F)
	//*  66  123:aload_2         
	//*  67  124:getfield        #184 <Field float i$b.g>
	//*  68  127:fconst_0        
	//*  69  128:fcmpl           
	//*  70  129:ifne            141
	//*  71  132:aload_2         
	//*  72  133:getfield        #186 <Field float i$b.h>
	//*  73  136:fconst_1        
	//*  74  137:fcmpl           
	//*  75  138:ifeq            290
		{
			float f7 = ((i$b) (i$d1)).g;
	//   76  141:aload_2         
	//   77  142:getfield        #184 <Field float i$b.g>
	//   78  145:fstore          12
			float f8 = ((i$b) (i$d1)).i;
	//   79  147:aload_2         
	//   80  148:getfield        #188 <Field float i$b.i>
	//   81  151:fstore          13
			float f5 = ((i$b) (i$d1)).h;
	//   82  153:aload_2         
	//   83  154:getfield        #186 <Field float i$b.h>
	//   84  157:fstore          10
			float f6 = ((i$b) (i$d1)).i;
	//   85  159:aload_2         
	//   86  160:getfield        #188 <Field float i$b.i>
	//   87  163:fstore          11
			if(o == null)
	//*  88  165:aload_0         
	//*  89  166:getfield        #190 <Field PathMeasure o>
	//*  90  169:ifnonnull       183
				o = new PathMeasure();
	//   91  172:aload_0         
	//   92  173:new             #192 <Class PathMeasure>
	//   93  176:dup             
	//   94  177:invokespecial   #193 <Method void PathMeasure()>
	//   95  180:putfield        #190 <Field PathMeasure o>
			o.setPath(i, false);
	//   96  183:aload_0         
	//   97  184:getfield        #190 <Field PathMeasure o>
	//   98  187:aload_0         
	//   99  188:getfield        #72  <Field Path i>
	//  100  191:iconst_0        
	//  101  192:invokevirtual   #197 <Method void PathMeasure.setPath(Path, boolean)>
			float f4 = o.getLength();
	//  102  195:aload_0         
	//  103  196:getfield        #190 <Field PathMeasure o>
	//  104  199:invokevirtual   #201 <Method float PathMeasure.getLength()>
	//  105  202:fstore          9
			f7 = ((f7 + f8) % 1.0F) * f4;
	//  106  204:fload           12
	//  107  206:fload           13
	//  108  208:fadd            
	//  109  209:fconst_1        
	//  110  210:frem            
	//  111  211:fload           9
	//  112  213:fmul            
	//  113  214:fstore          12
			f5 = ((f5 + f6) % 1.0F) * f4;
	//  114  216:fload           10
	//  115  218:fload           11
	//  116  220:fadd            
	//  117  221:fconst_1        
	//  118  222:frem            
	//  119  223:fload           9
	//  120  225:fmul            
	//  121  226:fstore          10
			((Path) (i$c1)).reset();
	//  122  228:aload_1         
	//  123  229:invokevirtual   #169 <Method void Path.reset()>
			if(f7 > f5)
	//* 124  232:fload           12
	//* 125  234:fload           10
	//* 126  236:fcmpl           
	//* 127  237:ifle            270
			{
				o.getSegment(f7, f4, ((Path) (i$c1)), true);
	//  128  240:aload_0         
	//  129  241:getfield        #190 <Field PathMeasure o>
	//  130  244:fload           12
	//  131  246:fload           9
	//  132  248:aload_1         
	//  133  249:iconst_1        
	//  134  250:invokevirtual   #205 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  135  253:pop             
				o.getSegment(0.0F, f5, ((Path) (i$c1)), true);
	//  136  254:aload_0         
	//  137  255:getfield        #190 <Field PathMeasure o>
	//  138  258:fconst_0        
	//  139  259:fload           10
	//  140  261:aload_1         
	//  141  262:iconst_1        
	//  142  263:invokevirtual   #205 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  143  266:pop             
			} else
	//* 144  267:goto            284
			{
				o.getSegment(f7, f5, ((Path) (i$c1)), true);
	//  145  270:aload_0         
	//  146  271:getfield        #190 <Field PathMeasure o>
	//  147  274:fload           12
	//  148  276:fload           10
	//  149  278:aload_1         
	//  150  279:iconst_1        
	//  151  280:invokevirtual   #205 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  152  283:pop             
			}
			((Path) (i$c1)).rLineTo(0.0F, 0.0F);
	//  153  284:aload_1         
	//  154  285:fconst_0        
	//  155  286:fconst_0        
	//  156  287:invokevirtual   #209 <Method void Path.rLineTo(float, float)>
		}
		j.addPath(((Path) (i$c1)), l);
	//  157  290:aload_0         
	//  158  291:getfield        #74  <Field Path j>
	//  159  294:aload_1         
	//  160  295:aload_0         
	//  161  296:getfield        #45  <Field Matrix l>
	//  162  299:invokevirtual   #176 <Method void Path.addPath(Path, Matrix)>
		if(((i$b) (i$d1)).c != 0)
	//* 163  302:aload_2         
	//* 164  303:getfield        #211 <Field int i$b.c>
	//* 165  306:ifeq            415
		{
			if(n == null)
	//* 166  309:aload_0         
	//* 167  310:getfield        #112 <Field Paint n>
	//* 168  313:ifnonnull       345
			{
				n = new Paint();
	//  169  316:aload_0         
	//  170  317:new             #213 <Class Paint>
	//  171  320:dup             
	//  172  321:invokespecial   #214 <Method void Paint()>
	//  173  324:putfield        #112 <Field Paint n>
				n.setStyle(android.graphics.t.Style.FILL);
	//  174  327:aload_0         
	//  175  328:getfield        #112 <Field Paint n>
	//  176  331:getstatic       #220 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  177  334:invokevirtual   #224 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				n.setAntiAlias(true);
	//  178  337:aload_0         
	//  179  338:getfield        #112 <Field Paint n>
	//  180  341:iconst_1        
	//  181  342:invokevirtual   #228 <Method void Paint.setAntiAlias(boolean)>
			}
			Paint paint = n;
	//  182  345:aload_0         
	//  183  346:getfield        #112 <Field Paint n>
	//  184  349:astore          14
			paint.setColor(android.support.b.a.i.a(((i$b) (i$d1)).c, ((i$b) (i$d1)).f));
	//  185  351:aload           14
	//  186  353:aload_2         
	//  187  354:getfield        #211 <Field int i$b.c>
	//  188  357:aload_2         
	//  189  358:getfield        #230 <Field float i$b.f>
	//  190  361:invokestatic    #233 <Method int android.support.b.a.i.a(int, float)>
	//  191  364:invokevirtual   #237 <Method void Paint.setColor(int)>
			paint.setColorFilter(colorfilter);
	//  192  367:aload           14
	//  193  369:aload           6
	//  194  371:invokevirtual   #241 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//  195  374:pop             
			Path path = j;
	//  196  375:aload_0         
	//  197  376:getfield        #74  <Field Path j>
	//  198  379:astore          15
			if(((i$b) (i$d1)).e == 0)
	//* 199  381:aload_2         
	//* 200  382:getfield        #243 <Field int i$b.e>
	//* 201  385:ifne            395
				i$c1 = ((i$c) (android.graphics..FillType.WINDING));
	//  202  388:getstatic       #249 <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
	//  203  391:astore_1        
			else
	//* 204  392:goto            399
				i$c1 = ((i$c) (android.graphics..FillType.EVEN_ODD));
	//  205  395:getstatic       #252 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//  206  398:astore_1        
			path.setFillType(((android.graphics..FillType) (i$c1)));
	//  207  399:aload           15
	//  208  401:aload_1         
	//  209  402:invokevirtual   #256 <Method void Path.setFillType(android.graphics.Path$FillType)>
			canvas.drawPath(j, paint);
	//  210  405:aload_3         
	//  211  406:aload_0         
	//  212  407:getfield        #74  <Field Path j>
	//  213  410:aload           14
	//  214  412:invokevirtual   #260 <Method void Canvas.drawPath(Path, Paint)>
		}
		if(((i$b) (i$d1)).a != 0)
	//* 215  415:aload_2         
	//* 216  416:getfield        #262 <Field int android.support.b.a.i$b.a>
	//* 217  419:ifeq            546
		{
			if(m == null)
	//* 218  422:aload_0         
	//* 219  423:getfield        #264 <Field Paint m>
	//* 220  426:ifnonnull       458
			{
				m = new Paint();
	//  221  429:aload_0         
	//  222  430:new             #213 <Class Paint>
	//  223  433:dup             
	//  224  434:invokespecial   #214 <Method void Paint()>
	//  225  437:putfield        #264 <Field Paint m>
				m.setStyle(android.graphics.t.Style.STROKE);
	//  226  440:aload_0         
	//  227  441:getfield        #264 <Field Paint m>
	//  228  444:getstatic       #267 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  229  447:invokevirtual   #224 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				m.setAntiAlias(true);
	//  230  450:aload_0         
	//  231  451:getfield        #264 <Field Paint m>
	//  232  454:iconst_1        
	//  233  455:invokevirtual   #228 <Method void Paint.setAntiAlias(boolean)>
			}
			i$c1 = ((i$c) (m));
	//  234  458:aload_0         
	//  235  459:getfield        #264 <Field Paint m>
	//  236  462:astore_1        
			if(((i$b) (i$d1)).k != null)
	//* 237  463:aload_2         
	//* 238  464:getfield        #270 <Field android.graphics.Paint$Join i$b.k>
	//* 239  467:ifnull          478
				((Paint) (i$c1)).setStrokeJoin(((i$b) (i$d1)).k);
	//  240  470:aload_1         
	//  241  471:aload_2         
	//  242  472:getfield        #270 <Field android.graphics.Paint$Join i$b.k>
	//  243  475:invokevirtual   #274 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
			if(((i$b) (i$d1)).j != null)
	//* 244  478:aload_2         
	//* 245  479:getfield        #277 <Field android.graphics.Paint$Cap i$b.j>
	//* 246  482:ifnull          493
				((Paint) (i$c1)).setStrokeCap(((i$b) (i$d1)).j);
	//  247  485:aload_1         
	//  248  486:aload_2         
	//  249  487:getfield        #277 <Field android.graphics.Paint$Cap i$b.j>
	//  250  490:invokevirtual   #281 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
			((Paint) (i$c1)).setStrokeMiter(((i$b) (i$d1)).l);
	//  251  493:aload_1         
	//  252  494:aload_2         
	//  253  495:getfield        #283 <Field float i$b.l>
	//  254  498:invokevirtual   #287 <Method void Paint.setStrokeMiter(float)>
			((Paint) (i$c1)).setColor(android.support.b.a.i.a(((i$b) (i$d1)).a, ((i$b) (i$d1)).d));
	//  255  501:aload_1         
	//  256  502:aload_2         
	//  257  503:getfield        #262 <Field int android.support.b.a.i$b.a>
	//  258  506:aload_2         
	//  259  507:getfield        #288 <Field float i$b.d>
	//  260  510:invokestatic    #233 <Method int android.support.b.a.i.a(int, float)>
	//  261  513:invokevirtual   #237 <Method void Paint.setColor(int)>
			((Paint) (i$c1)).setColorFilter(colorfilter);
	//  262  516:aload_1         
	//  263  517:aload           6
	//  264  519:invokevirtual   #241 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//  265  522:pop             
			((Paint) (i$c1)).setStrokeWidth(((i$b) (i$d1)).b * (f1 * f2));
	//  266  523:aload_1         
	//  267  524:aload_2         
	//  268  525:getfield        #289 <Field float i$b.b>
	//  269  528:fload           7
	//  270  530:fload           8
	//  271  532:fmul            
	//  272  533:fmul            
	//  273  534:invokevirtual   #292 <Method void Paint.setStrokeWidth(float)>
			canvas.drawPath(j, ((Paint) (i$c1)));
	//  274  537:aload_3         
	//  275  538:aload_0         
	//  276  539:getfield        #74  <Field Path j>
	//  277  542:aload_1         
	//  278  543:invokevirtual   #260 <Method void Canvas.drawPath(Path, Paint)>
		}
	//  279  546:return          
	}

	static Paint b(i$e i$e1)
	{
		return i$e1.m;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field Paint m>
	//    2    4:areturn         
	}

	static Paint b(i$e i$e1, Paint paint)
	{
		i$e1.m = paint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #264 <Field Paint m>
		return paint;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public void a(Canvas canvas, int i1, int j1, ColorFilter colorfilter)
	{
		a(a, k, canvas, i1, j1, colorfilter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field i$c a>
	//    3    5:getstatic       #41  <Field Matrix k>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #147 <Method void a(i$c, Matrix, Canvas, int, int, ColorFilter)>
	//    9   16:return          
	}

	public float getAlpha()
	{
		return (float)getRootAlpha() / 255F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #297 <Method int getRootAlpha()>
	//    2    4:i2f             
	//    3    5:ldc2            #298 <Float 255F>
	//    4    8:fdiv            
	//    5    9:freturn         
	}

	public int getRootAlpha()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int f>
	//    2    4:ireturn         
	}

	public void setAlpha(float f1)
	{
		setRootAlpha((int)(f1 * 255F));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc2            #298 <Float 255F>
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:invokevirtual   #302 <Method void setRootAlpha(int)>
	//    6   10:return          
	}

	public void setRootAlpha(int i1)
	{
		f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int f>
	//    3    5:return          
	}

	private static final Matrix k = new Matrix();
	final i$c a;
	float b;
	float c;
	float d;
	float e;
	int f;
	String g;
	final a h;
	private final Path i;
	private final Path j;
	private final Matrix l;
	private Paint m;
	private Paint n;
	private PathMeasure o;
	private int p;

	static 
	{
	//    0    0:new             #36  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void Matrix()>
	//    3    7:putstatic       #41  <Field Matrix k>
	//*   4   10:return          
	}

	public i$e()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		l = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #36  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Matrix()>
	//    6   12:putfield        #45  <Field Matrix l>
		b = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #47  <Field float b>
		c = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #49  <Field float c>
		d = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #51  <Field float d>
		e = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #53  <Field float e>
		f = 255;
	//   19   35:aload_0         
	//   20   36:sipush          255
	//   21   39:putfield        #55  <Field int f>
		g = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #57  <Field String g>
		h = new a();
	//   25   47:aload_0         
	//   26   48:new             #59  <Class a>
	//   27   51:dup             
	//   28   52:invokespecial   #60  <Method void a()>
	//   29   55:putfield        #62  <Field a h>
		a = new i$c();
	//   30   58:aload_0         
	//   31   59:new             #64  <Class i$c>
	//   32   62:dup             
	//   33   63:invokespecial   #65  <Method void i$c()>
	//   34   66:putfield        #67  <Field i$c a>
		i = new Path();
	//   35   69:aload_0         
	//   36   70:new             #69  <Class Path>
	//   37   73:dup             
	//   38   74:invokespecial   #70  <Method void Path()>
	//   39   77:putfield        #72  <Field Path i>
		j = new Path();
	//   40   80:aload_0         
	//   41   81:new             #69  <Class Path>
	//   42   84:dup             
	//   43   85:invokespecial   #70  <Method void Path()>
	//   44   88:putfield        #74  <Field Path j>
	//   45   91:return          
	}

	public i$e(i$e i$e1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		l = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #36  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Matrix()>
	//    6   12:putfield        #45  <Field Matrix l>
		b = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #47  <Field float b>
		c = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #49  <Field float c>
		d = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #51  <Field float d>
		e = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #53  <Field float e>
		f = 255;
	//   19   35:aload_0         
	//   20   36:sipush          255
	//   21   39:putfield        #55  <Field int f>
		g = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #57  <Field String g>
		h = new a();
	//   25   47:aload_0         
	//   26   48:new             #59  <Class a>
	//   27   51:dup             
	//   28   52:invokespecial   #60  <Method void a()>
	//   29   55:putfield        #62  <Field a h>
		a = new i$c(i$e1.a, h);
	//   30   58:aload_0         
	//   31   59:new             #64  <Class i$c>
	//   32   62:dup             
	//   33   63:aload_1         
	//   34   64:getfield        #67  <Field i$c a>
	//   35   67:aload_0         
	//   36   68:getfield        #62  <Field a h>
	//   37   71:invokespecial   #78  <Method void i$c(i$c, a)>
	//   38   74:putfield        #67  <Field i$c a>
		i = new Path(i$e1.i);
	//   39   77:aload_0         
	//   40   78:new             #69  <Class Path>
	//   41   81:dup             
	//   42   82:aload_1         
	//   43   83:getfield        #72  <Field Path i>
	//   44   86:invokespecial   #81  <Method void Path(Path)>
	//   45   89:putfield        #72  <Field Path i>
		j = new Path(i$e1.j);
	//   46   92:aload_0         
	//   47   93:new             #69  <Class Path>
	//   48   96:dup             
	//   49   97:aload_1         
	//   50   98:getfield        #74  <Field Path j>
	//   51  101:invokespecial   #81  <Method void Path(Path)>
	//   52  104:putfield        #74  <Field Path j>
		b = i$e1.b;
	//   53  107:aload_0         
	//   54  108:aload_1         
	//   55  109:getfield        #47  <Field float b>
	//   56  112:putfield        #47  <Field float b>
		c = i$e1.c;
	//   57  115:aload_0         
	//   58  116:aload_1         
	//   59  117:getfield        #49  <Field float c>
	//   60  120:putfield        #49  <Field float c>
		d = i$e1.d;
	//   61  123:aload_0         
	//   62  124:aload_1         
	//   63  125:getfield        #51  <Field float d>
	//   64  128:putfield        #51  <Field float d>
		e = i$e1.e;
	//   65  131:aload_0         
	//   66  132:aload_1         
	//   67  133:getfield        #53  <Field float e>
	//   68  136:putfield        #53  <Field float e>
		p = i$e1.p;
	//   69  139:aload_0         
	//   70  140:aload_1         
	//   71  141:getfield        #83  <Field int p>
	//   72  144:putfield        #83  <Field int p>
		f = i$e1.f;
	//   73  147:aload_0         
	//   74  148:aload_1         
	//   75  149:getfield        #55  <Field int f>
	//   76  152:putfield        #55  <Field int f>
		g = i$e1.g;
	//   77  155:aload_0         
	//   78  156:aload_1         
	//   79  157:getfield        #57  <Field String g>
	//   80  160:putfield        #57  <Field String g>
		if(i$e1.g != null)
	//*  81  163:aload_1         
	//*  82  164:getfield        #57  <Field String g>
	//*  83  167:ifnull          183
			h.put(((Object) (i$e1.g)), ((Object) (this)));
	//   84  170:aload_0         
	//   85  171:getfield        #62  <Field a h>
	//   86  174:aload_1         
	//   87  175:getfield        #57  <Field String g>
	//   88  178:aload_0         
	//   89  179:invokevirtual   #87  <Method Object a.put(Object, Object)>
	//   90  182:pop             
	//   91  183:return          
	}
}
