// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import o.ae;
import o.ag;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.graphics.drawable:
//			PathParser

public class VectorDrawableCompat extends ag
{
	static class a extends e
	{

		private void b(TypedArray typedarray)
		{
			String s = typedarray.getString(0);
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #24  <Method String TypedArray.getString(int)>
		//    3    5:astore_2        
			if(s != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          15
				p = s;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #28  <Field String p>
			typedarray = ((TypedArray) (typedarray.getString(1)));
		//    9   15:aload_1         
		//   10   16:iconst_1        
		//   11   17:invokevirtual   #24  <Method String TypedArray.getString(int)>
		//   12   20:astore_1        
			if(typedarray != null)
		//*  13   21:aload_1         
		//*  14   22:ifnull          33
				l = PathParser.c(((String) (typedarray)));
		//   15   25:aload_0         
		//   16   26:aload_1         
		//   17   27:invokestatic    #34  <Method PathParser$PathDataNode[] PathParser.c(String)>
		//   18   30:putfield        #38  <Field PathParser$PathDataNode[] l>
		//   19   33:return          
		}

		public void a(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
		{
			if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
		//*   0    0:aload           4
		//*   1    2:ldc1            #41  <String "pathData">
		//*   2    4:invokestatic    #47  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
		//*   3    7:ifne            11
			{
				return;
		//    4   10:return          
			} else
			{
				resources = ((Resources) (ag.obtainAttributes(resources, theme, attributeset, ae.c)));
		//    5   11:aload_1         
		//    6   12:aload_3         
		//    7   13:aload_2         
		//    8   14:getstatic       #52  <Field int[] ae.c>
		//    9   17:invokestatic    #58  <Method TypedArray ag.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
		//   10   20:astore_1        
				b(((TypedArray) (resources)));
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:invokespecial   #60  <Method void b(TypedArray)>
				((TypedArray) (resources)).recycle();
		//   14   26:aload_1         
		//   15   27:invokevirtual   #63  <Method void TypedArray.recycle()>
				return;
		//   16   30:return          
			}
		}

		public boolean d()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void VectorDrawableCompat$e()>
		//    2    4:return          
		}

		public a(a a1)
		{
			super(((e) (a1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void VectorDrawableCompat$e(VectorDrawableCompat$e)>
		//    3    5:return          
		}
	}

	static class b
	{

		static Paint a(b b1)
		{
			return b1.n;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field Paint n>
		//    2    4:areturn         
		}

		static Paint a(b b1, Paint paint)
		{
			b1.p = paint;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #93  <Field Paint p>
			return paint;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		private void b(d d1, e e1, Canvas canvas, int j, int i1, ColorFilter colorfilter)
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
			d1 = ((d) (d.c(d1)));
		//   16   29:aload_1         
		//   17   30:invokestatic    #103 <Method Matrix VectorDrawableCompat$d.c(VectorDrawableCompat$d)>
		//   18   33:astore_1        
			l.set(((Matrix) (d1)));
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
			f2 = d(((Matrix) (d1)));
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
			e1.a(k);
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
			if(e1.d())
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
			d1 = ((d) ((c)e1));
		//   63  120:aload_2         
		//   64  121:checkcast       #136 <Class VectorDrawableCompat$c>
		//   65  124:astore_1        
			if(((c) (d1)).g != 0.0F || ((c) (d1)).h != 1.0F)
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
				float f7 = ((c) (d1)).g;
		//   76  143:aload_1         
		//   77  144:getfield        #138 <Field float VectorDrawableCompat$c.g>
		//   78  147:fstore          12
				float f8 = ((c) (d1)).f;
		//   79  149:aload_1         
		//   80  150:getfield        #142 <Field float VectorDrawableCompat$c.f>
		//   81  153:fstore          13
				float f5 = ((c) (d1)).h;
		//   82  155:aload_1         
		//   83  156:getfield        #140 <Field float VectorDrawableCompat$c.h>
		//   84  159:fstore          10
				float f6 = ((c) (d1)).f;
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
			if(((c) (d1)).a != 0)
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
				e1 = ((e) (p));
		//  182  353:aload_0         
		//  183  354:getfield        #93  <Field Paint p>
		//  184  357:astore_2        
				((Paint) (e1)).setColor(VectorDrawableCompat.applyAlpha(((c) (d1)).a, ((c) (d1)).i));
		//  185  358:aload_2         
		//  186  359:aload_1         
		//  187  360:getfield        #165 <Field int VectorDrawableCompat$c.a>
		//  188  363:aload_1         
		//  189  364:getfield        #184 <Field float VectorDrawableCompat$c.i>
		//  190  367:invokestatic    #188 <Method int VectorDrawableCompat.applyAlpha(int, float)>
		//  191  370:invokevirtual   #192 <Method void Paint.setColor(int)>
				((Paint) (e1)).setColorFilter(colorfilter);
		//  192  373:aload_2         
		//  193  374:aload           6
		//  194  376:invokevirtual   #196 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//  195  379:pop             
				canvas.drawPath(f, ((Paint) (e1)));
		//  196  380:aload_3         
		//  197  381:aload_0         
		//  198  382:getfield        #74  <Field Path f>
		//  199  385:aload_2         
		//  200  386:invokevirtual   #200 <Method void Canvas.drawPath(Path, Paint)>
			}
			if(((c) (d1)).e != 0)
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
				e1 = ((e) (n));
		//  220  432:aload_0         
		//  221  433:getfield        #90  <Field Paint n>
		//  222  436:astore_2        
				if(((c) (d1)).n != null)
		//* 223  437:aload_1         
		//* 224  438:getfield        #208 <Field android.graphics.Paint$Join VectorDrawableCompat$c.n>
		//* 225  441:ifnull          452
					((Paint) (e1)).setStrokeJoin(((c) (d1)).n);
		//  226  444:aload_2         
		//  227  445:aload_1         
		//  228  446:getfield        #208 <Field android.graphics.Paint$Join VectorDrawableCompat$c.n>
		//  229  449:invokevirtual   #212 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
				if(((c) (d1)).k != null)
		//* 230  452:aload_1         
		//* 231  453:getfield        #215 <Field android.graphics.Paint$Cap VectorDrawableCompat$c.k>
		//* 232  456:ifnull          467
					((Paint) (e1)).setStrokeCap(((c) (d1)).k);
		//  233  459:aload_2         
		//  234  460:aload_1         
		//  235  461:getfield        #215 <Field android.graphics.Paint$Cap VectorDrawableCompat$c.k>
		//  236  464:invokevirtual   #219 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
				((Paint) (e1)).setStrokeMiter(((c) (d1)).o);
		//  237  467:aload_2         
		//  238  468:aload_1         
		//  239  469:getfield        #221 <Field float VectorDrawableCompat$c.o>
		//  240  472:invokevirtual   #225 <Method void Paint.setStrokeMiter(float)>
				((Paint) (e1)).setColor(VectorDrawableCompat.applyAlpha(((c) (d1)).e, ((c) (d1)).b));
		//  241  475:aload_2         
		//  242  476:aload_1         
		//  243  477:getfield        #202 <Field int VectorDrawableCompat$c.e>
		//  244  480:aload_1         
		//  245  481:getfield        #226 <Field float VectorDrawableCompat$c.b>
		//  246  484:invokestatic    #188 <Method int VectorDrawableCompat.applyAlpha(int, float)>
		//  247  487:invokevirtual   #192 <Method void Paint.setColor(int)>
				((Paint) (e1)).setColorFilter(colorfilter);
		//  248  490:aload_2         
		//  249  491:aload           6
		//  250  493:invokevirtual   #196 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//  251  496:pop             
				((Paint) (e1)).setStrokeWidth(((c) (d1)).d * (f1 * f2));
		//  252  497:aload_2         
		//  253  498:aload_1         
		//  254  499:getfield        #228 <Field float VectorDrawableCompat$c.d>
		//  255  502:fload           7
		//  256  504:fload           8
		//  257  506:fmul            
		//  258  507:fmul            
		//  259  508:invokevirtual   #231 <Method void Paint.setStrokeWidth(float)>
				canvas.drawPath(f, ((Paint) (e1)));
		//  260  511:aload_3         
		//  261  512:aload_0         
		//  262  513:getfield        #74  <Field Path f>
		//  263  516:aload_2         
		//  264  517:invokevirtual   #200 <Method void Canvas.drawPath(Path, Paint)>
			}
		//  265  520:return          
		}

		static Paint c(b b1)
		{
			return b1.p;
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

		static Paint d(b b1, Paint paint)
		{
			b1.n = paint;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #90  <Field Paint n>
			return paint;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		private void d(d d1, Matrix matrix, Canvas canvas, int j, int i1, ColorFilter colorfilter)
		{
			d.c(d1).set(matrix);
		//    0    0:aload_1         
		//    1    1:invokestatic    #103 <Method Matrix VectorDrawableCompat$d.c(VectorDrawableCompat$d)>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #107 <Method void Matrix.set(Matrix)>
			d.c(d1).preConcat(d.b(d1));
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
			for(int j1 = 0; j1 < d1.a.size(); j1++)
		//*  13   25:iconst_0        
		//*  14   26:istore          7
		//*  15   28:iload           7
		//*  16   30:aload_1         
		//*  17   31:getfield        #263 <Field ArrayList VectorDrawableCompat$d.a>
		//*  18   34:invokevirtual   #268 <Method int ArrayList.size()>
		//*  19   37:icmpge          111
			{
				matrix = ((Matrix) (d1.a.get(j1)));
		//   20   40:aload_1         
		//   21   41:getfield        #263 <Field ArrayList VectorDrawableCompat$d.a>
		//   22   44:iload           7
		//   23   46:invokevirtual   #272 <Method Object ArrayList.get(int)>
		//   24   49:astore_2        
				if(matrix instanceof d)
		//*  25   50:aload_2         
		//*  26   51:instanceof      #64  <Class VectorDrawableCompat$d>
		//*  27   54:ifeq            79
				{
					d((d)matrix, d.c(d1), canvas, j, i1, colorfilter);
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
				if(matrix instanceof e)
		//*  39   79:aload_2         
		//*  40   80:instanceof      #116 <Class VectorDrawableCompat$e>
		//*  41   83:ifeq            102
					b(d1, (e)matrix, canvas, j, i1, colorfilter);
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
		final d d;
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

		public b()
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
			d = new d();
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

		public b(b b1)
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
			d = new d(b1.d, h);
		//   30   58:aload_0         
		//   31   59:new             #64  <Class VectorDrawableCompat$d>
		//   32   62:dup             
		//   33   63:aload_1         
		//   34   64:getfield        #67  <Field VectorDrawableCompat$d d>
		//   35   67:aload_0         
		//   36   68:getfield        #62  <Field ArrayMap h>
		//   37   71:invokespecial   #78  <Method void VectorDrawableCompat$d(VectorDrawableCompat$d, ArrayMap)>
		//   38   74:putfield        #67  <Field VectorDrawableCompat$d d>
			k = new Path(b1.k);
		//   39   77:aload_0         
		//   40   78:new             #69  <Class Path>
		//   41   81:dup             
		//   42   82:aload_1         
		//   43   83:getfield        #72  <Field Path k>
		//   44   86:invokespecial   #81  <Method void Path(Path)>
		//   45   89:putfield        #72  <Field Path k>
			f = new Path(b1.f);
		//   46   92:aload_0         
		//   47   93:new             #69  <Class Path>
		//   48   96:dup             
		//   49   97:aload_1         
		//   50   98:getfield        #74  <Field Path f>
		//   51  101:invokespecial   #81  <Method void Path(Path)>
		//   52  104:putfield        #74  <Field Path f>
			a = b1.a;
		//   53  107:aload_0         
		//   54  108:aload_1         
		//   55  109:getfield        #47  <Field float a>
		//   56  112:putfield        #47  <Field float a>
			b = b1.b;
		//   57  115:aload_0         
		//   58  116:aload_1         
		//   59  117:getfield        #49  <Field float b>
		//   60  120:putfield        #49  <Field float b>
			e = b1.e;
		//   61  123:aload_0         
		//   62  124:aload_1         
		//   63  125:getfield        #51  <Field float e>
		//   64  128:putfield        #51  <Field float e>
			c = b1.c;
		//   65  131:aload_0         
		//   66  132:aload_1         
		//   67  133:getfield        #53  <Field float c>
		//   68  136:putfield        #53  <Field float c>
			u = b1.u;
		//   69  139:aload_0         
		//   70  140:aload_1         
		//   71  141:getfield        #83  <Field int u>
		//   72  144:putfield        #83  <Field int u>
			i = b1.i;
		//   73  147:aload_0         
		//   74  148:aload_1         
		//   75  149:getfield        #55  <Field int i>
		//   76  152:putfield        #55  <Field int i>
			g = b1.g;
		//   77  155:aload_0         
		//   78  156:aload_1         
		//   79  157:getfield        #57  <Field String g>
		//   80  160:putfield        #57  <Field String g>
			if(b1.g != null)
		//*  81  163:aload_1         
		//*  82  164:getfield        #57  <Field String g>
		//*  83  167:ifnull          183
				h.put(((Object) (b1.g)), ((Object) (this)));
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

	static class c extends e
	{

		private android.graphics.Paint.Cap a(int j, android.graphics.Paint.Cap cap)
		{
			switch(j)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 2: default 28
		//		               0 30
		//		               1 34
		//		               2 38
			default:
				return cap;
		//    2   28:aload_2         
		//    3   29:areturn         

			case 0: // '\0'
				return android.graphics.Paint.Cap.BUTT;
		//    4   30:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
		//    5   33:areturn         

			case 1: // '\001'
				return android.graphics.Paint.Cap.ROUND;
		//    6   34:getstatic       #74  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
		//    7   37:areturn         

			case 2: // '\002'
				return android.graphics.Paint.Cap.SQUARE;
		//    8   38:getstatic       #77  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
		//    9   41:areturn         
			}
		}

		private void a(TypedArray typedarray, XmlPullParser xmlpullparser)
		{
			t = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #68  <Field int[] t>
			if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
		//*   3    5:aload_2         
		//*   4    6:ldc1            #80  <String "pathData">
		//*   5    8:invokestatic    #86  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
		//*   6   11:ifne            15
				return;
		//    7   14:return          
			String s = typedarray.getString(0);
		//    8   15:aload_1         
		//    9   16:iconst_0        
		//   10   17:invokevirtual   #92  <Method String TypedArray.getString(int)>
		//   11   20:astore_3        
			if(s != null)
		//*  12   21:aload_3         
		//*  13   22:ifnull          30
				p = s;
		//   14   25:aload_0         
		//   15   26:aload_3         
		//   16   27:putfield        #96  <Field String p>
			s = typedarray.getString(2);
		//   17   30:aload_1         
		//   18   31:iconst_2        
		//   19   32:invokevirtual   #92  <Method String TypedArray.getString(int)>
		//   20   35:astore_3        
			if(s != null)
		//*  21   36:aload_3         
		//*  22   37:ifnull          48
				l = PathParser.c(s);
		//   23   40:aload_0         
		//   24   41:aload_3         
		//   25   42:invokestatic    #101 <Method PathParser$PathDataNode[] PathParser.c(String)>
		//   26   45:putfield        #105 <Field PathParser$PathDataNode[] l>
			a = TypedArrayUtils.getNamedColor(typedarray, xmlpullparser, "fillColor", 1, a);
		//   27   48:aload_0         
		//   28   49:aload_1         
		//   29   50:aload_2         
		//   30   51:ldc1            #107 <String "fillColor">
		//   31   53:iconst_1        
		//   32   54:aload_0         
		//   33   55:getfield        #34  <Field int a>
		//   34   58:invokestatic    #111 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
		//   35   61:putfield        #34  <Field int a>
			i = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "fillAlpha", 12, i);
		//   36   64:aload_0         
		//   37   65:aload_1         
		//   38   66:aload_2         
		//   39   67:ldc1            #113 <String "fillAlpha">
		//   40   69:bipush          12
		//   41   71:aload_0         
		//   42   72:getfield        #38  <Field float i>
		//   43   75:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   44   78:putfield        #38  <Field float i>
			k = a(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineCap", 8, -1), k);
		//   45   81:aload_0         
		//   46   82:aload_0         
		//   47   83:aload_1         
		//   48   84:aload_2         
		//   49   85:ldc1            #119 <String "strokeLineCap">
		//   50   87:bipush          8
		//   51   89:iconst_m1       
		//   52   90:invokestatic    #122 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
		//   53   93:aload_0         
		//   54   94:getfield        #51  <Field android.graphics.Paint$Cap k>
		//   55   97:invokespecial   #124 <Method android.graphics.Paint$Cap a(int, android.graphics.Paint$Cap)>
		//   56  100:putfield        #51  <Field android.graphics.Paint$Cap k>
			n = c(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineJoin", 9, -1), n);
		//   57  103:aload_0         
		//   58  104:aload_0         
		//   59  105:aload_1         
		//   60  106:aload_2         
		//   61  107:ldc1            #126 <String "strokeLineJoin">
		//   62  109:bipush          9
		//   63  111:iconst_m1       
		//   64  112:invokestatic    #122 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
		//   65  115:aload_0         
		//   66  116:getfield        #58  <Field android.graphics.Paint$Join n>
		//   67  119:invokespecial   #129 <Method android.graphics.Paint$Join c(int, android.graphics.Paint$Join)>
		//   68  122:putfield        #58  <Field android.graphics.Paint$Join n>
			o = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeMiterLimit", 10, o);
		//   69  125:aload_0         
		//   70  126:aload_1         
		//   71  127:aload_2         
		//   72  128:ldc1            #131 <String "strokeMiterLimit">
		//   73  130:bipush          10
		//   74  132:aload_0         
		//   75  133:getfield        #61  <Field float o>
		//   76  136:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   77  139:putfield        #61  <Field float o>
			e = TypedArrayUtils.getNamedColor(typedarray, xmlpullparser, "strokeColor", 3, e);
		//   78  142:aload_0         
		//   79  143:aload_1         
		//   80  144:aload_2         
		//   81  145:ldc1            #133 <String "strokeColor">
		//   82  147:iconst_3        
		//   83  148:aload_0         
		//   84  149:getfield        #30  <Field int e>
		//   85  152:invokestatic    #111 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
		//   86  155:putfield        #30  <Field int e>
			b = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeAlpha", 11, b);
		//   87  158:aload_0         
		//   88  159:aload_1         
		//   89  160:aload_2         
		//   90  161:ldc1            #135 <String "strokeAlpha">
		//   91  163:bipush          11
		//   92  165:aload_0         
		//   93  166:getfield        #36  <Field float b>
		//   94  169:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   95  172:putfield        #36  <Field float b>
			d = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeWidth", 4, d);
		//   96  175:aload_0         
		//   97  176:aload_1         
		//   98  177:aload_2         
		//   99  178:ldc1            #137 <String "strokeWidth">
		//  100  180:iconst_4        
		//  101  181:aload_0         
		//  102  182:getfield        #32  <Field float d>
		//  103  185:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//  104  188:putfield        #32  <Field float d>
			h = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathEnd", 6, h);
		//  105  191:aload_0         
		//  106  192:aload_1         
		//  107  193:aload_2         
		//  108  194:ldc1            #139 <String "trimPathEnd">
		//  109  196:bipush          6
		//  110  198:aload_0         
		//  111  199:getfield        #42  <Field float h>
		//  112  202:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//  113  205:putfield        #42  <Field float h>
			f = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathOffset", 7, f);
		//  114  208:aload_0         
		//  115  209:aload_1         
		//  116  210:aload_2         
		//  117  211:ldc1            #141 <String "trimPathOffset">
		//  118  213:bipush          7
		//  119  215:aload_0         
		//  120  216:getfield        #44  <Field float f>
		//  121  219:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//  122  222:putfield        #44  <Field float f>
			g = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathStart", 5, g);
		//  123  225:aload_0         
		//  124  226:aload_1         
		//  125  227:aload_2         
		//  126  228:ldc1            #143 <String "trimPathStart">
		//  127  230:iconst_5        
		//  128  231:aload_0         
		//  129  232:getfield        #40  <Field float g>
		//  130  235:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//  131  238:putfield        #40  <Field float g>
		//  132  241:return          
		}

		private android.graphics.Paint.Join c(int j, android.graphics.Paint.Join join)
		{
			switch(j)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 2: default 28
		//		               0 30
		//		               1 34
		//		               2 38
			default:
				return join;
		//    2   28:aload_2         
		//    3   29:areturn         

			case 0: // '\0'
				return android.graphics.Paint.Join.MITER;
		//    4   30:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
		//    5   33:areturn         

			case 1: // '\001'
				return android.graphics.Paint.Join.ROUND;
		//    6   34:getstatic       #145 <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
		//    7   37:areturn         

			case 2: // '\002'
				return android.graphics.Paint.Join.BEVEL;
		//    8   38:getstatic       #148 <Field android.graphics.Paint$Join android.graphics.Paint$Join.BEVEL>
		//    9   41:areturn         
			}
		}

		public void a(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
		{
			resources = ((Resources) (ag.obtainAttributes(resources, theme, attributeset, ae.b)));
		//    0    0:aload_1         
		//    1    1:aload_3         
		//    2    2:aload_2         
		//    3    3:getstatic       #153 <Field int[] ae.b>
		//    4    6:invokestatic    #159 <Method TypedArray ag.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
		//    5    9:astore_1        
			a(((TypedArray) (resources)), xmlpullparser);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:aload           4
		//    9   14:invokespecial   #161 <Method void a(TypedArray, XmlPullParser)>
			((TypedArray) (resources)).recycle();
		//   10   17:aload_1         
		//   11   18:invokevirtual   #164 <Method void TypedArray.recycle()>
		//   12   21:return          
		}

		float getFillAlpha()
		{
			return i;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field float i>
		//    2    4:freturn         
		}

		int getFillColor()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int a>
		//    2    4:ireturn         
		}

		float getStrokeAlpha()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field float b>
		//    2    4:freturn         
		}

		int getStrokeColor()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int e>
		//    2    4:ireturn         
		}

		float getStrokeWidth()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field float d>
		//    2    4:freturn         
		}

		float getTrimPathEnd()
		{
			return h;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field float h>
		//    2    4:freturn         
		}

		float getTrimPathOffset()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field float f>
		//    2    4:freturn         
		}

		float getTrimPathStart()
		{
			return g;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field float g>
		//    2    4:freturn         
		}

		void setFillAlpha(float f1)
		{
			i = f1;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #38  <Field float i>
		//    3    5:return          
		}

		void setFillColor(int j)
		{
			a = j;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #34  <Field int a>
		//    3    5:return          
		}

		void setStrokeAlpha(float f1)
		{
			b = f1;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #36  <Field float b>
		//    3    5:return          
		}

		void setStrokeColor(int j)
		{
			e = j;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #30  <Field int e>
		//    3    5:return          
		}

		void setStrokeWidth(float f1)
		{
			d = f1;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #32  <Field float d>
		//    3    5:return          
		}

		void setTrimPathEnd(float f1)
		{
			h = f1;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #42  <Field float h>
		//    3    5:return          
		}

		void setTrimPathOffset(float f1)
		{
			f = f1;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #44  <Field float f>
		//    3    5:return          
		}

		void setTrimPathStart(float f1)
		{
			g = f1;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #40  <Field float g>
		//    3    5:return          
		}

		int a;
		float b;
		int c;
		float d;
		int e;
		float f;
		float g;
		float h;
		float i;
		android.graphics.Paint.Cap k;
		android.graphics.Paint.Join n;
		float o;
		private int t[];

		public c()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void VectorDrawableCompat$e()>
			e = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #30  <Field int e>
			d = 0.0F;
		//    5    9:aload_0         
		//    6   10:fconst_0        
		//    7   11:putfield        #32  <Field float d>
			a = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #34  <Field int a>
			b = 1.0F;
		//   11   19:aload_0         
		//   12   20:fconst_1        
		//   13   21:putfield        #36  <Field float b>
			i = 1.0F;
		//   14   24:aload_0         
		//   15   25:fconst_1        
		//   16   26:putfield        #38  <Field float i>
			g = 0.0F;
		//   17   29:aload_0         
		//   18   30:fconst_0        
		//   19   31:putfield        #40  <Field float g>
			h = 1.0F;
		//   20   34:aload_0         
		//   21   35:fconst_1        
		//   22   36:putfield        #42  <Field float h>
			f = 0.0F;
		//   23   39:aload_0         
		//   24   40:fconst_0        
		//   25   41:putfield        #44  <Field float f>
			k = android.graphics.Paint.Cap.BUTT;
		//   26   44:aload_0         
		//   27   45:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
		//   28   48:putfield        #51  <Field android.graphics.Paint$Cap k>
			n = android.graphics.Paint.Join.MITER;
		//   29   51:aload_0         
		//   30   52:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
		//   31   55:putfield        #58  <Field android.graphics.Paint$Join n>
			o = 4F;
		//   32   58:aload_0         
		//   33   59:ldc1            #59  <Float 4F>
		//   34   61:putfield        #61  <Field float o>
		//   35   64:return          
		}

		public c(c c1)
		{
			super(((e) (c1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #66  <Method void VectorDrawableCompat$e(VectorDrawableCompat$e)>
			e = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #30  <Field int e>
			d = 0.0F;
		//    6   10:aload_0         
		//    7   11:fconst_0        
		//    8   12:putfield        #32  <Field float d>
			a = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #34  <Field int a>
			b = 1.0F;
		//   12   20:aload_0         
		//   13   21:fconst_1        
		//   14   22:putfield        #36  <Field float b>
			i = 1.0F;
		//   15   25:aload_0         
		//   16   26:fconst_1        
		//   17   27:putfield        #38  <Field float i>
			g = 0.0F;
		//   18   30:aload_0         
		//   19   31:fconst_0        
		//   20   32:putfield        #40  <Field float g>
			h = 1.0F;
		//   21   35:aload_0         
		//   22   36:fconst_1        
		//   23   37:putfield        #42  <Field float h>
			f = 0.0F;
		//   24   40:aload_0         
		//   25   41:fconst_0        
		//   26   42:putfield        #44  <Field float f>
			k = android.graphics.Paint.Cap.BUTT;
		//   27   45:aload_0         
		//   28   46:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
		//   29   49:putfield        #51  <Field android.graphics.Paint$Cap k>
			n = android.graphics.Paint.Join.MITER;
		//   30   52:aload_0         
		//   31   53:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
		//   32   56:putfield        #58  <Field android.graphics.Paint$Join n>
			o = 4F;
		//   33   59:aload_0         
		//   34   60:ldc1            #59  <Float 4F>
		//   35   62:putfield        #61  <Field float o>
			t = c1.t;
		//   36   65:aload_0         
		//   37   66:aload_1         
		//   38   67:getfield        #68  <Field int[] t>
		//   39   70:putfield        #68  <Field int[] t>
			e = c1.e;
		//   40   73:aload_0         
		//   41   74:aload_1         
		//   42   75:getfield        #30  <Field int e>
		//   43   78:putfield        #30  <Field int e>
			d = c1.d;
		//   44   81:aload_0         
		//   45   82:aload_1         
		//   46   83:getfield        #32  <Field float d>
		//   47   86:putfield        #32  <Field float d>
			b = c1.b;
		//   48   89:aload_0         
		//   49   90:aload_1         
		//   50   91:getfield        #36  <Field float b>
		//   51   94:putfield        #36  <Field float b>
			a = c1.a;
		//   52   97:aload_0         
		//   53   98:aload_1         
		//   54   99:getfield        #34  <Field int a>
		//   55  102:putfield        #34  <Field int a>
			c = c1.c;
		//   56  105:aload_0         
		//   57  106:aload_1         
		//   58  107:getfield        #70  <Field int c>
		//   59  110:putfield        #70  <Field int c>
			i = c1.i;
		//   60  113:aload_0         
		//   61  114:aload_1         
		//   62  115:getfield        #38  <Field float i>
		//   63  118:putfield        #38  <Field float i>
			g = c1.g;
		//   64  121:aload_0         
		//   65  122:aload_1         
		//   66  123:getfield        #40  <Field float g>
		//   67  126:putfield        #40  <Field float g>
			h = c1.h;
		//   68  129:aload_0         
		//   69  130:aload_1         
		//   70  131:getfield        #42  <Field float h>
		//   71  134:putfield        #42  <Field float h>
			f = c1.f;
		//   72  137:aload_0         
		//   73  138:aload_1         
		//   74  139:getfield        #44  <Field float f>
		//   75  142:putfield        #44  <Field float f>
			k = c1.k;
		//   76  145:aload_0         
		//   77  146:aload_1         
		//   78  147:getfield        #51  <Field android.graphics.Paint$Cap k>
		//   79  150:putfield        #51  <Field android.graphics.Paint$Cap k>
			n = c1.n;
		//   80  153:aload_0         
		//   81  154:aload_1         
		//   82  155:getfield        #58  <Field android.graphics.Paint$Join n>
		//   83  158:putfield        #58  <Field android.graphics.Paint$Join n>
			o = c1.o;
		//   84  161:aload_0         
		//   85  162:aload_1         
		//   86  163:getfield        #61  <Field float o>
		//   87  166:putfield        #61  <Field float o>
		//   88  169:return          
		}
	}

	static class d
	{

		static Matrix b(d d1)
		{
			return d1.m;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Matrix m>
		//    2    4:areturn         
		}

		static Matrix c(d d1)
		{
			return d1.d;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Matrix d>
		//    2    4:areturn         
		}

		private void c()
		{
			m.reset();
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Matrix m>
		//    2    4:invokevirtual   #115 <Method void Matrix.reset()>
			m.postTranslate(-e, -f);
		//    3    7:aload_0         
		//    4    8:getfield        #56  <Field Matrix m>
		//    5   11:aload_0         
		//    6   12:getfield        #44  <Field float e>
		//    7   15:fneg            
		//    8   16:aload_0         
		//    9   17:getfield        #46  <Field float f>
		//   10   20:fneg            
		//   11   21:invokevirtual   #119 <Method boolean Matrix.postTranslate(float, float)>
		//   12   24:pop             
			m.postScale(g, i);
		//   13   25:aload_0         
		//   14   26:getfield        #56  <Field Matrix m>
		//   15   29:aload_0         
		//   16   30:getfield        #48  <Field float g>
		//   17   33:aload_0         
		//   18   34:getfield        #50  <Field float i>
		//   19   37:invokevirtual   #122 <Method boolean Matrix.postScale(float, float)>
		//   20   40:pop             
			m.postRotate(c, 0.0F, 0.0F);
		//   21   41:aload_0         
		//   22   42:getfield        #56  <Field Matrix m>
		//   23   45:aload_0         
		//   24   46:getfield        #42  <Field float c>
		//   25   49:fconst_0        
		//   26   50:fconst_0        
		//   27   51:invokevirtual   #126 <Method boolean Matrix.postRotate(float, float, float)>
		//   28   54:pop             
			m.postTranslate(h + e, k + f);
		//   29   55:aload_0         
		//   30   56:getfield        #56  <Field Matrix m>
		//   31   59:aload_0         
		//   32   60:getfield        #52  <Field float h>
		//   33   63:aload_0         
		//   34   64:getfield        #44  <Field float e>
		//   35   67:fadd            
		//   36   68:aload_0         
		//   37   69:getfield        #54  <Field float k>
		//   38   72:aload_0         
		//   39   73:getfield        #46  <Field float f>
		//   40   76:fadd            
		//   41   77:invokevirtual   #119 <Method boolean Matrix.postTranslate(float, float)>
		//   42   80:pop             
		//   43   81:return          
		}

		private void c(TypedArray typedarray, XmlPullParser xmlpullparser)
		{
			p = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #62  <Field int[] p>
			c = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "rotation", 5, c);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:ldc1            #129 <String "rotation">
		//    7   10:iconst_5        
		//    8   11:aload_0         
		//    9   12:getfield        #42  <Field float c>
		//   10   15:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   11   18:putfield        #42  <Field float c>
			e = typedarray.getFloat(1, e);
		//   12   21:aload_0         
		//   13   22:aload_1         
		//   14   23:iconst_1        
		//   15   24:aload_0         
		//   16   25:getfield        #44  <Field float e>
		//   17   28:invokevirtual   #141 <Method float TypedArray.getFloat(int, float)>
		//   18   31:putfield        #44  <Field float e>
			f = typedarray.getFloat(2, f);
		//   19   34:aload_0         
		//   20   35:aload_1         
		//   21   36:iconst_2        
		//   22   37:aload_0         
		//   23   38:getfield        #46  <Field float f>
		//   24   41:invokevirtual   #141 <Method float TypedArray.getFloat(int, float)>
		//   25   44:putfield        #46  <Field float f>
			g = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleX", 3, g);
		//   26   47:aload_0         
		//   27   48:aload_1         
		//   28   49:aload_2         
		//   29   50:ldc1            #143 <String "scaleX">
		//   30   52:iconst_3        
		//   31   53:aload_0         
		//   32   54:getfield        #48  <Field float g>
		//   33   57:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   34   60:putfield        #48  <Field float g>
			i = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleY", 4, i);
		//   35   63:aload_0         
		//   36   64:aload_1         
		//   37   65:aload_2         
		//   38   66:ldc1            #145 <String "scaleY">
		//   39   68:iconst_4        
		//   40   69:aload_0         
		//   41   70:getfield        #50  <Field float i>
		//   42   73:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   43   76:putfield        #50  <Field float i>
			h = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateX", 6, h);
		//   44   79:aload_0         
		//   45   80:aload_1         
		//   46   81:aload_2         
		//   47   82:ldc1            #147 <String "translateX">
		//   48   84:bipush          6
		//   49   86:aload_0         
		//   50   87:getfield        #52  <Field float h>
		//   51   90:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   52   93:putfield        #52  <Field float h>
			k = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateY", 7, k);
		//   53   96:aload_0         
		//   54   97:aload_1         
		//   55   98:aload_2         
		//   56   99:ldc1            #149 <String "translateY">
		//   57  101:bipush          7
		//   58  103:aload_0         
		//   59  104:getfield        #54  <Field float k>
		//   60  107:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
		//   61  110:putfield        #54  <Field float k>
			typedarray = ((TypedArray) (typedarray.getString(0)));
		//   62  113:aload_1         
		//   63  114:iconst_0        
		//   64  115:invokevirtual   #153 <Method String TypedArray.getString(int)>
		//   65  118:astore_1        
			if(typedarray != null)
		//*  66  119:aload_1         
		//*  67  120:ifnull          128
				n = ((String) (typedarray));
		//   68  123:aload_0         
		//   69  124:aload_1         
		//   70  125:putfield        #58  <Field String n>
			c();
		//   71  128:aload_0         
		//   72  129:invokespecial   #155 <Method void c()>
		//   73  132:return          
		}

		public void e(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
		{
			resources = ((Resources) (ag.obtainAttributes(resources, theme, attributeset, ae.d)));
		//    0    0:aload_1         
		//    1    1:aload_3         
		//    2    2:aload_2         
		//    3    3:getstatic       #160 <Field int[] ae.d>
		//    4    6:invokestatic    #166 <Method TypedArray ag.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
		//    5    9:astore_1        
			c(((TypedArray) (resources)), xmlpullparser);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:aload           4
		//    9   14:invokespecial   #168 <Method void c(TypedArray, XmlPullParser)>
			((TypedArray) (resources)).recycle();
		//   10   17:aload_1         
		//   11   18:invokevirtual   #171 <Method void TypedArray.recycle()>
		//   12   21:return          
		}

		public String getGroupName()
		{
			return n;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field String n>
		//    2    4:areturn         
		}

		public Matrix getLocalMatrix()
		{
			return m;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Matrix m>
		//    2    4:areturn         
		}

		public float getPivotX()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field float e>
		//    2    4:freturn         
		}

		public float getPivotY()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field float f>
		//    2    4:freturn         
		}

		public float getRotation()
		{
			return c;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field float c>
		//    2    4:freturn         
		}

		public float getScaleX()
		{
			return g;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field float g>
		//    2    4:freturn         
		}

		public float getScaleY()
		{
			return i;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field float i>
		//    2    4:freturn         
		}

		public float getTranslateX()
		{
			return h;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field float h>
		//    2    4:freturn         
		}

		public float getTranslateY()
		{
			return k;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field float k>
		//    2    4:freturn         
		}

		public void setPivotX(float f1)
		{
			if(f1 != e)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #44  <Field float e>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				e = f1;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #44  <Field float e>
				c();
		//    8   14:aload_0         
		//    9   15:invokespecial   #155 <Method void c()>
			}
		//   10   18:return          
		}

		public void setPivotY(float f1)
		{
			if(f1 != f)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #46  <Field float f>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				f = f1;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #46  <Field float f>
				c();
		//    8   14:aload_0         
		//    9   15:invokespecial   #155 <Method void c()>
			}
		//   10   18:return          
		}

		public void setRotation(float f1)
		{
			if(f1 != c)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #42  <Field float c>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				c = f1;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #42  <Field float c>
				c();
		//    8   14:aload_0         
		//    9   15:invokespecial   #155 <Method void c()>
			}
		//   10   18:return          
		}

		public void setScaleX(float f1)
		{
			if(f1 != g)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #48  <Field float g>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				g = f1;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #48  <Field float g>
				c();
		//    8   14:aload_0         
		//    9   15:invokespecial   #155 <Method void c()>
			}
		//   10   18:return          
		}

		public void setScaleY(float f1)
		{
			if(f1 != i)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #50  <Field float i>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				i = f1;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #50  <Field float i>
				c();
		//    8   14:aload_0         
		//    9   15:invokespecial   #155 <Method void c()>
			}
		//   10   18:return          
		}

		public void setTranslateX(float f1)
		{
			if(f1 != h)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #52  <Field float h>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				h = f1;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #52  <Field float h>
				c();
		//    8   14:aload_0         
		//    9   15:invokespecial   #155 <Method void c()>
			}
		//   10   18:return          
		}

		public void setTranslateY(float f1)
		{
			if(f1 != k)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #54  <Field float k>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				k = f1;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #54  <Field float k>
				c();
		//    8   14:aload_0         
		//    9   15:invokespecial   #155 <Method void c()>
			}
		//   10   18:return          
		}

		final ArrayList a;
		int b;
		float c;
		private final Matrix d;
		private float e;
		private float f;
		private float g;
		private float h;
		private float i;
		private float k;
		private final Matrix m;
		private String n;
		private int p[];

		public d()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			d = new Matrix();
		//    2    4:aload_0         
		//    3    5:new             #32  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #33  <Method void Matrix()>
		//    6   12:putfield        #35  <Field Matrix d>
			a = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #37  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #38  <Method void ArrayList()>
		//   11   23:putfield        #40  <Field ArrayList a>
			c = 0.0F;
		//   12   26:aload_0         
		//   13   27:fconst_0        
		//   14   28:putfield        #42  <Field float c>
			e = 0.0F;
		//   15   31:aload_0         
		//   16   32:fconst_0        
		//   17   33:putfield        #44  <Field float e>
			f = 0.0F;
		//   18   36:aload_0         
		//   19   37:fconst_0        
		//   20   38:putfield        #46  <Field float f>
			g = 1.0F;
		//   21   41:aload_0         
		//   22   42:fconst_1        
		//   23   43:putfield        #48  <Field float g>
			i = 1.0F;
		//   24   46:aload_0         
		//   25   47:fconst_1        
		//   26   48:putfield        #50  <Field float i>
			h = 0.0F;
		//   27   51:aload_0         
		//   28   52:fconst_0        
		//   29   53:putfield        #52  <Field float h>
			k = 0.0F;
		//   30   56:aload_0         
		//   31   57:fconst_0        
		//   32   58:putfield        #54  <Field float k>
			m = new Matrix();
		//   33   61:aload_0         
		//   34   62:new             #32  <Class Matrix>
		//   35   65:dup             
		//   36   66:invokespecial   #33  <Method void Matrix()>
		//   37   69:putfield        #56  <Field Matrix m>
			n = null;
		//   38   72:aload_0         
		//   39   73:aconst_null     
		//   40   74:putfield        #58  <Field String n>
		//   41   77:return          
		}

		public d(d d1, ArrayMap arraymap)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			d = new Matrix();
		//    2    4:aload_0         
		//    3    5:new             #32  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #33  <Method void Matrix()>
		//    6   12:putfield        #35  <Field Matrix d>
			a = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #37  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #38  <Method void ArrayList()>
		//   11   23:putfield        #40  <Field ArrayList a>
			c = 0.0F;
		//   12   26:aload_0         
		//   13   27:fconst_0        
		//   14   28:putfield        #42  <Field float c>
			e = 0.0F;
		//   15   31:aload_0         
		//   16   32:fconst_0        
		//   17   33:putfield        #44  <Field float e>
			f = 0.0F;
		//   18   36:aload_0         
		//   19   37:fconst_0        
		//   20   38:putfield        #46  <Field float f>
			g = 1.0F;
		//   21   41:aload_0         
		//   22   42:fconst_1        
		//   23   43:putfield        #48  <Field float g>
			i = 1.0F;
		//   24   46:aload_0         
		//   25   47:fconst_1        
		//   26   48:putfield        #50  <Field float i>
			h = 0.0F;
		//   27   51:aload_0         
		//   28   52:fconst_0        
		//   29   53:putfield        #52  <Field float h>
			k = 0.0F;
		//   30   56:aload_0         
		//   31   57:fconst_0        
		//   32   58:putfield        #54  <Field float k>
			m = new Matrix();
		//   33   61:aload_0         
		//   34   62:new             #32  <Class Matrix>
		//   35   65:dup             
		//   36   66:invokespecial   #33  <Method void Matrix()>
		//   37   69:putfield        #56  <Field Matrix m>
			n = null;
		//   38   72:aload_0         
		//   39   73:aconst_null     
		//   40   74:putfield        #58  <Field String n>
			c = d1.c;
		//   41   77:aload_0         
		//   42   78:aload_1         
		//   43   79:getfield        #42  <Field float c>
		//   44   82:putfield        #42  <Field float c>
			e = d1.e;
		//   45   85:aload_0         
		//   46   86:aload_1         
		//   47   87:getfield        #44  <Field float e>
		//   48   90:putfield        #44  <Field float e>
			f = d1.f;
		//   49   93:aload_0         
		//   50   94:aload_1         
		//   51   95:getfield        #46  <Field float f>
		//   52   98:putfield        #46  <Field float f>
			g = d1.g;
		//   53  101:aload_0         
		//   54  102:aload_1         
		//   55  103:getfield        #48  <Field float g>
		//   56  106:putfield        #48  <Field float g>
			i = d1.i;
		//   57  109:aload_0         
		//   58  110:aload_1         
		//   59  111:getfield        #50  <Field float i>
		//   60  114:putfield        #50  <Field float i>
			h = d1.h;
		//   61  117:aload_0         
		//   62  118:aload_1         
		//   63  119:getfield        #52  <Field float h>
		//   64  122:putfield        #52  <Field float h>
			k = d1.k;
		//   65  125:aload_0         
		//   66  126:aload_1         
		//   67  127:getfield        #54  <Field float k>
		//   68  130:putfield        #54  <Field float k>
			p = d1.p;
		//   69  133:aload_0         
		//   70  134:aload_1         
		//   71  135:getfield        #62  <Field int[] p>
		//   72  138:putfield        #62  <Field int[] p>
			n = d1.n;
		//   73  141:aload_0         
		//   74  142:aload_1         
		//   75  143:getfield        #58  <Field String n>
		//   76  146:putfield        #58  <Field String n>
			b = d1.b;
		//   77  149:aload_0         
		//   78  150:aload_1         
		//   79  151:getfield        #64  <Field int b>
		//   80  154:putfield        #64  <Field int b>
			if(n != null)
		//*  81  157:aload_0         
		//*  82  158:getfield        #58  <Field String n>
		//*  83  161:ifnull          174
				arraymap.put(((Object) (n)), ((Object) (this)));
		//   84  164:aload_2         
		//   85  165:aload_0         
		//   86  166:getfield        #58  <Field String n>
		//   87  169:aload_0         
		//   88  170:invokevirtual   #70  <Method Object ArrayMap.put(Object, Object)>
		//   89  173:pop             
			m.set(d1.m);
		//   90  174:aload_0         
		//   91  175:getfield        #56  <Field Matrix m>
		//   92  178:aload_1         
		//   93  179:getfield        #56  <Field Matrix m>
		//   94  182:invokevirtual   #74  <Method void Matrix.set(Matrix)>
			ArrayList arraylist = d1.a;
		//   95  185:aload_1         
		//   96  186:getfield        #40  <Field ArrayList a>
		//   97  189:astore          4
			for(int j = 0; j < arraylist.size(); j++)
		//*  98  191:iconst_0        
		//*  99  192:istore_3        
		//* 100  193:iload_3         
		//* 101  194:aload           4
		//* 102  196:invokevirtual   #78  <Method int ArrayList.size()>
		//* 103  199:icmpge          328
			{
				d1 = ((d) (arraylist.get(j)));
		//  104  202:aload           4
		//  105  204:iload_3         
		//  106  205:invokevirtual   #82  <Method Object ArrayList.get(int)>
		//  107  208:astore_1        
				if(d1 instanceof d)
		//* 108  209:aload_1         
		//* 109  210:instanceof      #2   <Class VectorDrawableCompat$d>
		//* 110  213:ifeq            241
				{
					d1 = (d)d1;
		//  111  216:aload_1         
		//  112  217:checkcast       #2   <Class VectorDrawableCompat$d>
		//  113  220:astore_1        
					a.add(((Object) (new d(d1, arraymap))));
		//  114  221:aload_0         
		//  115  222:getfield        #40  <Field ArrayList a>
		//  116  225:new             #2   <Class VectorDrawableCompat$d>
		//  117  228:dup             
		//  118  229:aload_1         
		//  119  230:aload_2         
		//  120  231:invokespecial   #84  <Method void VectorDrawableCompat$d(VectorDrawableCompat$d, ArrayMap)>
		//  121  234:invokevirtual   #88  <Method boolean ArrayList.add(Object)>
		//  122  237:pop             
					continue;
		//  123  238:goto            321
				}
				if(d1 instanceof c)
		//* 124  241:aload_1         
		//* 125  242:instanceof      #90  <Class VectorDrawableCompat$c>
		//* 126  245:ifeq            263
					d1 = ((d) (new c((c)d1)));
		//  127  248:new             #90  <Class VectorDrawableCompat$c>
		//  128  251:dup             
		//  129  252:aload_1         
		//  130  253:checkcast       #90  <Class VectorDrawableCompat$c>
		//  131  256:invokespecial   #93  <Method void VectorDrawableCompat$c(VectorDrawableCompat$c)>
		//  132  259:astore_1        
				else
		//* 133  260:goto            295
				if(d1 instanceof a)
		//* 134  263:aload_1         
		//* 135  264:instanceof      #95  <Class VectorDrawableCompat$a>
		//* 136  267:ifeq            285
					d1 = ((d) (new a((a)d1)));
		//  137  270:new             #95  <Class VectorDrawableCompat$a>
		//  138  273:dup             
		//  139  274:aload_1         
		//  140  275:checkcast       #95  <Class VectorDrawableCompat$a>
		//  141  278:invokespecial   #98  <Method void VectorDrawableCompat$a(VectorDrawableCompat$a)>
		//  142  281:astore_1        
				else
		//* 143  282:goto            295
					throw new IllegalStateException("Unknown object in the tree!");
		//  144  285:new             #100 <Class IllegalStateException>
		//  145  288:dup             
		//  146  289:ldc1            #102 <String "Unknown object in the tree!">
		//  147  291:invokespecial   #105 <Method void IllegalStateException(String)>
		//  148  294:athrow          
				a.add(((Object) (d1)));
		//  149  295:aload_0         
		//  150  296:getfield        #40  <Field ArrayList a>
		//  151  299:aload_1         
		//  152  300:invokevirtual   #88  <Method boolean ArrayList.add(Object)>
		//  153  303:pop             
				if(((e) (d1)).p != null)
		//* 154  304:aload_1         
		//* 155  305:getfield        #109 <Field String VectorDrawableCompat$e.p>
		//* 156  308:ifnull          321
					arraymap.put(((Object) (((e) (d1)).p)), ((Object) (d1)));
		//  157  311:aload_2         
		//  158  312:aload_1         
		//  159  313:getfield        #109 <Field String VectorDrawableCompat$e.p>
		//  160  316:aload_1         
		//  161  317:invokevirtual   #70  <Method Object ArrayMap.put(Object, Object)>
		//  162  320:pop             
			}

		//  163  321:iload_3         
		//  164  322:iconst_1        
		//  165  323:iadd            
		//  166  324:istore_3        
		//* 167  325:goto            193
		//  168  328:return          
		}
	}

	static class e
	{

		public String a(PathParser.PathDataNode apathdatanode[])
		{
			String s = " ";
		//    0    0:ldc1            #35  <String " ">
		//    1    2:astore          4
			for(int i = 0; i < apathdatanode.length; i++)
		//*   2    4:iconst_0        
		//*   3    5:istore_2        
		//*   4    6:iload_2         
		//*   5    7:aload_1         
		//*   6    8:arraylength     
		//*   7    9:icmpge          103
			{
				s = (new StringBuilder()).append(s).append(apathdatanode[i].type).append(":").toString();
		//    8   12:new             #37  <Class StringBuilder>
		//    9   15:dup             
		//   10   16:invokespecial   #38  <Method void StringBuilder()>
		//   11   19:aload           4
		//   12   21:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   13   24:aload_1         
		//   14   25:iload_2         
		//   15   26:aaload          
		//   16   27:getfield        #48  <Field char PathParser$PathDataNode.type>
		//   17   30:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
		//   18   33:ldc1            #53  <String ":">
		//   19   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   20   38:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   21   41:astore          4
				float af[] = apathdatanode[i].params;
		//   22   43:aload_1         
		//   23   44:iload_2         
		//   24   45:aaload          
		//   25   46:getfield        #61  <Field float[] PathParser$PathDataNode.params>
		//   26   49:astore          5
				for(int j = 0; j < af.length; j++)
		//*  27   51:iconst_0        
		//*  28   52:istore_3        
		//*  29   53:iload_3         
		//*  30   54:aload           5
		//*  31   56:arraylength     
		//*  32   57:icmpge          96
					s = (new StringBuilder()).append(s).append(af[j]).append(",").toString();
		//   33   60:new             #37  <Class StringBuilder>
		//   34   63:dup             
		//   35   64:invokespecial   #38  <Method void StringBuilder()>
		//   36   67:aload           4
		//   37   69:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   38   72:aload           5
		//   39   74:iload_3         
		//   40   75:faload          
		//   41   76:invokevirtual   #64  <Method StringBuilder StringBuilder.append(float)>
		//   42   79:ldc1            #66  <String ",">
		//   43   81:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   44   84:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   45   87:astore          4

		//   46   89:iload_3         
		//   47   90:iconst_1        
		//   48   91:iadd            
		//   49   92:istore_3        
			}

		//   50   93:goto            53
		//   51   96:iload_2         
		//   52   97:iconst_1        
		//   53   98:iadd            
		//   54   99:istore_2        
		//*  55  100:goto            6
			return s;
		//   56  103:aload           4
		//   57  105:areturn         
		}

		public void a(Path path)
		{
			path.reset();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #72  <Method void Path.reset()>
			if(l != null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #19  <Field PathParser$PathDataNode[] l>
		//*   4    8:ifnull          19
				PathParser.PathDataNode.nodesToPath(l, path);
		//    5   11:aload_0         
		//    6   12:getfield        #19  <Field PathParser$PathDataNode[] l>
		//    7   15:aload_1         
		//    8   16:invokestatic    #76  <Method void PathParser$PathDataNode.nodesToPath(PathParser$PathDataNode[], Path)>
		//    9   19:return          
		}

		public boolean d()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void e(int i)
		{
			String s = "";
		//    0    0:ldc1            #81  <String "">
		//    1    2:astore_3        
			for(int j = 0; j < i; j++)
		//*   2    3:iconst_0        
		//*   3    4:istore_2        
		//*   4    5:iload_2         
		//*   5    6:iload_1         
		//*   6    7:icmpge          37
				s = (new StringBuilder()).append(s).append("    ").toString();
		//    7   10:new             #37  <Class StringBuilder>
		//    8   13:dup             
		//    9   14:invokespecial   #38  <Method void StringBuilder()>
		//   10   17:aload_3         
		//   11   18:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   12   21:ldc1            #83  <String "    ">
		//   13   23:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   14   26:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   15   29:astore_3        

		//   16   30:iload_2         
		//   17   31:iconst_1        
		//   18   32:iadd            
		//   19   33:istore_2        
		//*  20   34:goto            5
			Log.v("VectorDrawableCompat", (new StringBuilder()).append(s).append("current path is :").append(p).append(" pathData is ").append(a(l)).toString());
		//   21   37:ldc1            #85  <String "VectorDrawableCompat">
		//   22   39:new             #37  <Class StringBuilder>
		//   23   42:dup             
		//   24   43:invokespecial   #38  <Method void StringBuilder()>
		//   25   46:aload_3         
		//   26   47:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   27   50:ldc1            #87  <String "current path is :">
		//   28   52:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   29   55:aload_0         
		//   30   56:getfield        #23  <Field String p>
		//   31   59:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   32   62:ldc1            #89  <String " pathData is ">
		//   33   64:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   34   67:aload_0         
		//   35   68:aload_0         
		//   36   69:getfield        #19  <Field PathParser$PathDataNode[] l>
		//   37   72:invokevirtual   #91  <Method String a(PathParser$PathDataNode[])>
		//   38   75:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   39   78:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   40   81:invokestatic    #97  <Method int Log.v(String, String)>
		//   41   84:pop             
		//   42   85:return          
		}

		public PathParser.PathDataNode[] getPathData()
		{
			return l;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field PathParser$PathDataNode[] l>
		//    2    4:areturn         
		}

		public String getPathName()
		{
			return p;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String p>
		//    2    4:areturn         
		}

		public void setPathData(PathParser.PathDataNode apathdatanode[])
		{
			if(!PathParser.d(l, apathdatanode))
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field PathParser$PathDataNode[] l>
		//*   2    4:aload_1         
		//*   3    5:invokestatic    #105 <Method boolean PathParser.d(PathParser$PathDataNode[], PathParser$PathDataNode[])>
		//*   4    8:ifne            20
			{
				l = PathParser.b(apathdatanode);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokestatic    #31  <Method PathParser$PathDataNode[] PathParser.b(PathParser$PathDataNode[])>
		//    8   16:putfield        #19  <Field PathParser$PathDataNode[] l>
				return;
		//    9   19:return          
			} else
			{
				PathParser.e(l, apathdatanode);
		//   10   20:aload_0         
		//   11   21:getfield        #19  <Field PathParser$PathDataNode[] l>
		//   12   24:aload_1         
		//   13   25:invokestatic    #108 <Method void PathParser.e(PathParser$PathDataNode[], PathParser$PathDataNode[])>
				return;
		//   14   28:return          
			}
		}

		protected PathParser.PathDataNode l[];
		int m;
		String p;

		public e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			l = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #19  <Field PathParser$PathDataNode[] l>
		//    5    9:return          
		}

		public e(e e1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			l = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #19  <Field PathParser$PathDataNode[] l>
			p = e1.p;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #23  <Field String p>
		//    8   14:putfield        #23  <Field String p>
			m = e1.m;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #25  <Field int m>
		//   12   22:putfield        #25  <Field int m>
			l = PathParser.b(e1.l);
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:getfield        #19  <Field PathParser$PathDataNode[] l>
		//   16   30:invokestatic    #31  <Method PathParser$PathDataNode[] PathParser.b(PathParser$PathDataNode[])>
		//   17   33:putfield        #19  <Field PathParser$PathDataNode[] l>
		//   18   36:return          
		}
	}

	static class g extends android.graphics.drawable.Drawable.ConstantState
	{

		public boolean canApplyTheme()
		{
			return b.canApplyTheme();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState b>
		//    2    4:invokevirtual   #21  <Method boolean android.graphics.drawable.Drawable$ConstantState.canApplyTheme()>
		//    3    7:ireturn         
		}

		public int getChangingConfigurations()
		{
			return b.getChangingConfigurations();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState b>
		//    2    4:invokevirtual   #25  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
		//    3    7:ireturn         
		}

		public Drawable newDrawable()
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void VectorDrawableCompat()>
		//    3    7:astore_1        
			vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)b.newDrawable()));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState b>
		//    7   13:invokevirtual   #30  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//    8   16:checkcast       #32  <Class VectorDrawable>
		//    9   19:putfield        #36  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
			return ((Drawable) (vectordrawablecompat));
		//   10   22:aload_1         
		//   11   23:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void VectorDrawableCompat()>
		//    3    7:astore_2        
			vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)b.newDrawable(resources)));
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState b>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #39  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
		//    9   17:checkcast       #32  <Class VectorDrawable>
		//   10   20:putfield        #36  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
			return ((Drawable) (vectordrawablecompat));
		//   11   23:aload_2         
		//   12   24:areturn         
		}

		public Drawable newDrawable(Resources resources, android.content.res.Resources.Theme theme)
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void VectorDrawableCompat()>
		//    3    7:astore_3        
			vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)b.newDrawable(resources, theme)));
		//    4    8:aload_3         
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState b>
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokevirtual   #42  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources, android.content.res.Resources$Theme)>
		//   10   18:checkcast       #32  <Class VectorDrawable>
		//   11   21:putfield        #36  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
			return ((Drawable) (vectordrawablecompat));
		//   12   24:aload_3         
		//   13   25:areturn         
		}

		private final android.graphics.drawable.Drawable.ConstantState b;

		public g(android.graphics.drawable.Drawable.ConstantState constantstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void android.graphics.drawable.Drawable$ConstantState()>
			b = constantstate;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field android.graphics.drawable.Drawable$ConstantState b>
		//    5    9:return          
		}
	}

	static class h extends android.graphics.drawable.Drawable.ConstantState
	{

		public Paint a(ColorFilter colorfilter)
		{
			if(!e() && colorfilter == null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #69  <Method boolean e()>
		//*   2    4:ifne            13
		//*   3    7:aload_1         
		//*   4    8:ifnonnull       13
				return null;
		//    5   11:aconst_null     
		//    6   12:areturn         
			if(m == null)
		//*   7   13:aload_0         
		//*   8   14:getfield        #71  <Field Paint m>
		//*   9   17:ifnonnull       39
			{
				m = new Paint();
		//   10   20:aload_0         
		//   11   21:new             #53  <Class Paint>
		//   12   24:dup             
		//   13   25:invokespecial   #72  <Method void Paint()>
		//   14   28:putfield        #71  <Field Paint m>
				m.setFilterBitmap(true);
		//   15   31:aload_0         
		//   16   32:getfield        #71  <Field Paint m>
		//   17   35:iconst_1        
		//   18   36:invokevirtual   #76  <Method void Paint.setFilterBitmap(boolean)>
			}
			m.setAlpha(b.getRootAlpha());
		//   19   39:aload_0         
		//   20   40:getfield        #71  <Field Paint m>
		//   21   43:aload_0         
		//   22   44:getfield        #41  <Field VectorDrawableCompat$b b>
		//   23   47:invokevirtual   #80  <Method int VectorDrawableCompat$b.getRootAlpha()>
		//   24   50:invokevirtual   #84  <Method void Paint.setAlpha(int)>
			m.setColorFilter(colorfilter);
		//   25   53:aload_0         
		//   26   54:getfield        #71  <Field Paint m>
		//   27   57:aload_1         
		//   28   58:invokevirtual   #88  <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//   29   61:pop             
			return m;
		//   30   62:aload_0         
		//   31   63:getfield        #71  <Field Paint m>
		//   32   66:areturn         
		}

		public void a()
		{
			i = c;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #31  <Field ColorStateList c>
		//    3    5:putfield        #90  <Field ColorStateList i>
			g = a;
		//    4    8:aload_0         
		//    5    9:aload_0         
		//    6   10:getfield        #36  <Field android.graphics.PorterDuff$Mode a>
		//    7   13:putfield        #92  <Field android.graphics.PorterDuff$Mode g>
			k = b.getRootAlpha();
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #41  <Field VectorDrawableCompat$b b>
		//   11   21:invokevirtual   #80  <Method int VectorDrawableCompat$b.getRootAlpha()>
		//   12   24:putfield        #94  <Field int k>
			f = d;
		//   13   27:aload_0         
		//   14   28:aload_0         
		//   15   29:getfield        #65  <Field boolean d>
		//   16   32:putfield        #96  <Field boolean f>
			p = false;
		//   17   35:aload_0         
		//   18   36:iconst_0        
		//   19   37:putfield        #98  <Field boolean p>
		//   20   40:return          
		}

		public void a(int j, int l)
		{
			h.eraseColor(0);
		//    0    0:aload_0         
		//    1    1:getfield        #101 <Field Bitmap h>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #106 <Method void Bitmap.eraseColor(int)>
			Canvas canvas = new Canvas(h);
		//    4    8:new             #108 <Class Canvas>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #101 <Field Bitmap h>
		//    8   16:invokespecial   #111 <Method void Canvas(Bitmap)>
		//    9   19:astore_3        
			b.b(canvas, j, l, ((ColorFilter) (null)));
		//   10   20:aload_0         
		//   11   21:getfield        #41  <Field VectorDrawableCompat$b b>
		//   12   24:aload_3         
		//   13   25:iload_1         
		//   14   26:iload_2         
		//   15   27:aconst_null     
		//   16   28:invokevirtual   #114 <Method void VectorDrawableCompat$b.b(Canvas, int, int, ColorFilter)>
		//   17   31:return          
		}

		public void b(Canvas canvas, ColorFilter colorfilter, Rect rect)
		{
			colorfilter = ((ColorFilter) (a(colorfilter)));
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #117 <Method Paint a(ColorFilter)>
		//    3    5:astore_2        
			canvas.drawBitmap(h, ((Rect) (null)), rect, ((Paint) (colorfilter)));
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #101 <Field Bitmap h>
		//    7   11:aconst_null     
		//    8   12:aload_3         
		//    9   13:aload_2         
		//   10   14:invokevirtual   #121 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
		//   11   17:return          
		}

		public boolean b()
		{
			return !p && i == c && g == a && f == d && k == b.getRootAlpha();
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field boolean p>
		//    2    4:ifne            56
		//    3    7:aload_0         
		//    4    8:getfield        #90  <Field ColorStateList i>
		//    5   11:aload_0         
		//    6   12:getfield        #31  <Field ColorStateList c>
		//    7   15:if_acmpne       56
		//    8   18:aload_0         
		//    9   19:getfield        #92  <Field android.graphics.PorterDuff$Mode g>
		//   10   22:aload_0         
		//   11   23:getfield        #36  <Field android.graphics.PorterDuff$Mode a>
		//   12   26:if_acmpne       56
		//   13   29:aload_0         
		//   14   30:getfield        #96  <Field boolean f>
		//   15   33:aload_0         
		//   16   34:getfield        #65  <Field boolean d>
		//   17   37:icmpne          56
		//   18   40:aload_0         
		//   19   41:getfield        #94  <Field int k>
		//   20   44:aload_0         
		//   21   45:getfield        #41  <Field VectorDrawableCompat$b b>
		//   22   48:invokevirtual   #80  <Method int VectorDrawableCompat$b.getRootAlpha()>
		//   23   51:icmpne          56
		//   24   54:iconst_1        
		//   25   55:ireturn         
		//   26   56:iconst_0        
		//   27   57:ireturn         
		}

		public boolean b(int j, int l)
		{
			return j == h.getWidth() && l == h.getHeight();
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #101 <Field Bitmap h>
		//    3    5:invokevirtual   #125 <Method int Bitmap.getWidth()>
		//    4    8:icmpne          24
		//    5   11:iload_2         
		//    6   12:aload_0         
		//    7   13:getfield        #101 <Field Bitmap h>
		//    8   16:invokevirtual   #128 <Method int Bitmap.getHeight()>
		//    9   19:icmpne          24
		//   10   22:iconst_1        
		//   11   23:ireturn         
		//   12   24:iconst_0        
		//   13   25:ireturn         
		}

		public void d(int j, int l)
		{
			if(h == null || !b(j, l))
		//*   0    0:aload_0         
		//*   1    1:getfield        #101 <Field Bitmap h>
		//*   2    4:ifnull          16
		//*   3    7:aload_0         
		//*   4    8:iload_1         
		//*   5    9:iload_2         
		//*   6   10:invokevirtual   #130 <Method boolean b(int, int)>
		//*   7   13:ifne            33
			{
				h = Bitmap.createBitmap(j, l, android.graphics.Bitmap.Config.ARGB_8888);
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:iload_2         
		//   11   19:getstatic       #136 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
		//   12   22:invokestatic    #140 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
		//   13   25:putfield        #101 <Field Bitmap h>
				p = true;
		//   14   28:aload_0         
		//   15   29:iconst_1        
		//   16   30:putfield        #98  <Field boolean p>
			}
		//   17   33:return          
		}

		public boolean e()
		{
			return b.getRootAlpha() < 255;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field VectorDrawableCompat$b b>
		//    2    4:invokevirtual   #80  <Method int VectorDrawableCompat$b.getRootAlpha()>
		//    3    7:sipush          255
		//    4   10:icmpge          15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		public int getChangingConfigurations()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field int e>
		//    2    4:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (new VectorDrawableCompat(this)));
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #145 <Method void VectorDrawableCompat(VectorDrawableCompat$h)>
		//    4    8:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new VectorDrawableCompat(this)));
		//    0    0:new             #6   <Class VectorDrawableCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #145 <Method void VectorDrawableCompat(VectorDrawableCompat$h)>
		//    4    8:areturn         
		}

		android.graphics.PorterDuff.Mode a;
		b b;
		ColorStateList c;
		boolean d;
		int e;
		boolean f;
		android.graphics.PorterDuff.Mode g;
		Bitmap h;
		ColorStateList i;
		int k;
		Paint m;
		boolean p;

		public h()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void android.graphics.drawable.Drawable$ConstantState()>
			c = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #31  <Field ColorStateList c>
			a = VectorDrawableCompat.DEFAULT_TINT_MODE;
		//    5    9:aload_0         
		//    6   10:getstatic       #34  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
		//    7   13:putfield        #36  <Field android.graphics.PorterDuff$Mode a>
			b = new b();
		//    8   16:aload_0         
		//    9   17:new             #38  <Class VectorDrawableCompat$b>
		//   10   20:dup             
		//   11   21:invokespecial   #39  <Method void VectorDrawableCompat$b()>
		//   12   24:putfield        #41  <Field VectorDrawableCompat$b b>
		//   13   27:return          
		}

		public h(h h1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void android.graphics.drawable.Drawable$ConstantState()>
			c = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #31  <Field ColorStateList c>
			a = VectorDrawableCompat.DEFAULT_TINT_MODE;
		//    5    9:aload_0         
		//    6   10:getstatic       #34  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
		//    7   13:putfield        #36  <Field android.graphics.PorterDuff$Mode a>
			if(h1 != null)
		//*   8   16:aload_1         
		//*   9   17:ifnull          131
			{
				e = h1.e;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #45  <Field int e>
		//   13   25:putfield        #45  <Field int e>
				b = new b(h1.b);
		//   14   28:aload_0         
		//   15   29:new             #38  <Class VectorDrawableCompat$b>
		//   16   32:dup             
		//   17   33:aload_1         
		//   18   34:getfield        #41  <Field VectorDrawableCompat$b b>
		//   19   37:invokespecial   #48  <Method void VectorDrawableCompat$b(VectorDrawableCompat$b)>
		//   20   40:putfield        #41  <Field VectorDrawableCompat$b b>
				if(b.c(h1.b) != null)
		//*  21   43:aload_1         
		//*  22   44:getfield        #41  <Field VectorDrawableCompat$b b>
		//*  23   47:invokestatic    #51  <Method Paint VectorDrawableCompat$b.c(VectorDrawableCompat$b)>
		//*  24   50:ifnull          75
					b.a(b, new Paint(b.c(h1.b)));
		//   25   53:aload_0         
		//   26   54:getfield        #41  <Field VectorDrawableCompat$b b>
		//   27   57:new             #53  <Class Paint>
		//   28   60:dup             
		//   29   61:aload_1         
		//   30   62:getfield        #41  <Field VectorDrawableCompat$b b>
		//   31   65:invokestatic    #51  <Method Paint VectorDrawableCompat$b.c(VectorDrawableCompat$b)>
		//   32   68:invokespecial   #56  <Method void Paint(Paint)>
		//   33   71:invokestatic    #59  <Method Paint VectorDrawableCompat$b.a(VectorDrawableCompat$b, Paint)>
		//   34   74:pop             
				if(b.a(h1.b) != null)
		//*  35   75:aload_1         
		//*  36   76:getfield        #41  <Field VectorDrawableCompat$b b>
		//*  37   79:invokestatic    #61  <Method Paint VectorDrawableCompat$b.a(VectorDrawableCompat$b)>
		//*  38   82:ifnull          107
					b.d(b, new Paint(b.a(h1.b)));
		//   39   85:aload_0         
		//   40   86:getfield        #41  <Field VectorDrawableCompat$b b>
		//   41   89:new             #53  <Class Paint>
		//   42   92:dup             
		//   43   93:aload_1         
		//   44   94:getfield        #41  <Field VectorDrawableCompat$b b>
		//   45   97:invokestatic    #61  <Method Paint VectorDrawableCompat$b.a(VectorDrawableCompat$b)>
		//   46  100:invokespecial   #56  <Method void Paint(Paint)>
		//   47  103:invokestatic    #63  <Method Paint VectorDrawableCompat$b.d(VectorDrawableCompat$b, Paint)>
		//   48  106:pop             
				c = h1.c;
		//   49  107:aload_0         
		//   50  108:aload_1         
		//   51  109:getfield        #31  <Field ColorStateList c>
		//   52  112:putfield        #31  <Field ColorStateList c>
				a = h1.a;
		//   53  115:aload_0         
		//   54  116:aload_1         
		//   55  117:getfield        #36  <Field android.graphics.PorterDuff$Mode a>
		//   56  120:putfield        #36  <Field android.graphics.PorterDuff$Mode a>
				d = h1.d;
		//   57  123:aload_0         
		//   58  124:aload_1         
		//   59  125:getfield        #65  <Field boolean d>
		//   60  128:putfield        #65  <Field boolean d>
			}
		//   61  131:return          
		}
	}


	VectorDrawableCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void ag()>
		mAllowCaching = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #88  <Field boolean mAllowCaching>
		mTmpFloats = new float[9];
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:newarray        float[]
	//    8   14:putfield        #90  <Field float[] mTmpFloats>
		mTmpMatrix = new Matrix();
	//    9   17:aload_0         
	//   10   18:new             #92  <Class Matrix>
	//   11   21:dup             
	//   12   22:invokespecial   #93  <Method void Matrix()>
	//   13   25:putfield        #95  <Field Matrix mTmpMatrix>
		mTmpBounds = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #97  <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #98  <Method void Rect()>
	//   18   36:putfield        #100 <Field Rect mTmpBounds>
		mVectorState = new h();
	//   19   39:aload_0         
	//   20   40:new             #24  <Class VectorDrawableCompat$h>
	//   21   43:dup             
	//   22   44:invokespecial   #101 <Method void VectorDrawableCompat$h()>
	//   23   47:putfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   24   50:return          
	}

	VectorDrawableCompat(h h1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void ag()>
		mAllowCaching = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #88  <Field boolean mAllowCaching>
		mTmpFloats = new float[9];
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:newarray        float[]
	//    8   14:putfield        #90  <Field float[] mTmpFloats>
		mTmpMatrix = new Matrix();
	//    9   17:aload_0         
	//   10   18:new             #92  <Class Matrix>
	//   11   21:dup             
	//   12   22:invokespecial   #93  <Method void Matrix()>
	//   13   25:putfield        #95  <Field Matrix mTmpMatrix>
		mTmpBounds = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #97  <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #98  <Method void Rect()>
	//   18   36:putfield        #100 <Field Rect mTmpBounds>
		mVectorState = h1;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #103 <Field VectorDrawableCompat$h mVectorState>
		mTintFilter = updateTintFilter(mTintFilter, h1.c, h1.a);
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   26   50:aload_1         
	//   27   51:getfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
	//   28   54:aload_1         
	//   29   55:getfield        #112 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$h.a>
	//   30   58:invokevirtual   #116 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   31   61:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   32   64:return          
	}

	static int applyAlpha(int i, float f)
	{
		return i & 0xffffff | (int)((float)Color.alpha(i) * f) << 24;
	//    0    0:iload_0         
	//    1    1:ldc1            #120 <Int 0xffffff>
	//    2    3:iand            
	//    3    4:iload_0         
	//    4    5:invokestatic    #126 <Method int Color.alpha(int)>
	//    5    8:i2f             
	//    6    9:fload_1         
	//    7   10:fmul            
	//    8   11:f2i             
	//    9   12:bipush          24
	//   10   14:ishl            
	//   11   15:ior             
	//   12   16:ireturn         
	}

	public static VectorDrawableCompat create(Resources resources, int i, android.content.res.Resources.Theme theme)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #142 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          46
		{
			VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    3    8:new             #2   <Class VectorDrawableCompat>
	//    4   11:dup             
	//    5   12:invokespecial   #143 <Method void VectorDrawableCompat()>
	//    6   15:astore_3        
			vectordrawablecompat.mDelegateDrawable = ResourcesCompat.getDrawable(resources, i, theme);
	//    7   16:aload_3         
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:aload_2         
	//   11   20:invokestatic    #149 <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//   12   23:putfield        #153 <Field Drawable mDelegateDrawable>
			vectordrawablecompat.mCachedConstantStateDelegate = ((android.graphics.drawable.Drawable.ConstantState) (new g(vectordrawablecompat.mDelegateDrawable.getConstantState())));
	//   13   26:aload_3         
	//   14   27:new             #21  <Class VectorDrawableCompat$g>
	//   15   30:dup             
	//   16   31:aload_3         
	//   17   32:getfield        #153 <Field Drawable mDelegateDrawable>
	//   18   35:invokevirtual   #159 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   19   38:invokespecial   #162 <Method void VectorDrawableCompat$g(android.graphics.drawable.Drawable$ConstantState)>
	//   20   41:putfield        #164 <Field android.graphics.drawable.Drawable$ConstantState mCachedConstantStateDelegate>
			return vectordrawablecompat;
	//   21   44:aload_3         
	//   22   45:areturn         
		}
		android.content.res.XmlResourceParser xmlresourceparser;
		AttributeSet attributeset;
		xmlresourceparser = resources.getXml(i);
	//   23   46:aload_0         
	//   24   47:iload_1         
	//   25   48:invokevirtual   #170 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   26   51:astore_3        
		attributeset = Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser)));
	//   27   52:aload_3         
	//   28   53:invokestatic    #176 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   29   56:astore          4
		do
			i = ((XmlPullParser) (xmlresourceparser)).next();
	//   30   58:aload_3         
	//   31   59:invokeinterface #182 <Method int XmlPullParser.next()>
	//   32   64:istore_1        
		while(i != 2 && i != 1);
	//   33   65:iload_1         
	//   34   66:iconst_2        
	//   35   67:icmpeq          78
	//   36   70:iload_1         
	//   37   71:iconst_1        
	//   38   72:icmpeq          78
	//*  39   75:goto            58
		if(i == 2)
			break MISSING_BLOCK_LABEL_93;
	//   40   78:iload_1         
	//   41   79:iconst_2        
	//   42   80:icmpeq          93
		throw new XmlPullParserException("No start tag found");
	//   43   83:new             #135 <Class XmlPullParserException>
	//   44   86:dup             
	//   45   87:ldc1            #184 <String "No start tag found">
	//   46   89:invokespecial   #187 <Method void XmlPullParserException(String)>
	//   47   92:athrow          
		resources = ((Resources) (createFromXmlInner(resources, ((XmlPullParser) (xmlresourceparser)), attributeset, theme)));
	//   48   93:aload_0         
	//   49   94:aload_3         
	//   50   95:aload           4
	//   51   97:aload_2         
	//   52   98:invokestatic    #191 <Method VectorDrawableCompat createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   53  101:astore_0        
		return ((VectorDrawableCompat) (resources));
	//   54  102:aload_0         
	//   55  103:areturn         
		resources;
	//   56  104:astore_0        
		Log.e("VectorDrawableCompat", "parser error", ((Throwable) (resources)));
	//   57  105:ldc1            #43  <String "VectorDrawableCompat">
	//   58  107:ldc1            #193 <String "parser error">
	//   59  109:aload_0         
	//   60  110:invokestatic    #198 <Method int Log.e(String, String, Throwable)>
	//   61  113:pop             
		break MISSING_BLOCK_LABEL_127;
	//   62  114:goto            127
		resources;
	//   63  117:astore_0        
		Log.e("VectorDrawableCompat", "parser error", ((Throwable) (resources)));
	//   64  118:ldc1            #43  <String "VectorDrawableCompat">
	//   65  120:ldc1            #193 <String "parser error">
	//   66  122:aload_0         
	//   67  123:invokestatic    #198 <Method int Log.e(String, String, Throwable)>
	//   68  126:pop             
		return null;
	//   69  127:aconst_null     
	//   70  128:areturn         
	}

	public static VectorDrawableCompat createFromXmlInner(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    0    0:new             #2   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #143 <Method void VectorDrawableCompat()>
	//    3    7:astore          4
		vectordrawablecompat.inflate(resources, xmlpullparser, attributeset, theme);
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #203 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		return vectordrawablecompat;
	//   10   18:aload           4
	//   11   20:areturn         
	}

	private void inflateInternal(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		h h1 = mVectorState;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//    2    4:astore          9
		b b1 = h1.b;
	//    3    6:aload           9
	//    4    8:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//    5   11:astore          10
		int i = 1;
	//    6   13:iconst_1        
	//    7   14:istore          5
		Stack stack = new Stack();
	//    8   16:new             #210 <Class Stack>
	//    9   19:dup             
	//   10   20:invokespecial   #211 <Method void Stack()>
	//   11   23:astore          11
		stack.push(((Object) (b1.d)));
	//   12   25:aload           11
	//   13   27:aload           10
	//   14   29:getfield        #214 <Field VectorDrawableCompat$d VectorDrawableCompat$b.d>
	//   15   32:invokevirtual   #218 <Method Object Stack.push(Object)>
	//   16   35:pop             
		int j = xmlpullparser.getEventType();
	//   17   36:aload_2         
	//   18   37:invokeinterface #221 <Method int XmlPullParser.getEventType()>
	//   19   42:istore          6
		for(int l = xmlpullparser.getDepth(); j != 1 && (xmlpullparser.getDepth() >= l + 1 || j != 3);)
	//*  20   44:aload_2         
	//*  21   45:invokeinterface #224 <Method int XmlPullParser.getDepth()>
	//*  22   50:istore          8
	//*  23   52:iload           6
	//*  24   54:iconst_1        
	//*  25   55:icmpeq          430
	//*  26   58:aload_2         
	//*  27   59:invokeinterface #224 <Method int XmlPullParser.getDepth()>
	//*  28   64:iload           8
	//*  29   66:iconst_1        
	//*  30   67:iadd            
	//*  31   68:icmpge          77
	//*  32   71:iload           6
	//*  33   73:iconst_3        
	//*  34   74:icmpeq          430
		{
			int k;
			if(j == 2)
	//*  35   77:iload           6
	//*  36   79:iconst_2        
	//*  37   80:icmpne          377
			{
				Object obj = ((Object) (xmlpullparser.getName()));
	//   38   83:aload_2         
	//   39   84:invokeinterface #228 <Method String XmlPullParser.getName()>
	//   40   89:astore          13
				d d1 = (d)stack.peek();
	//   41   91:aload           11
	//   42   93:invokevirtual   #232 <Method Object Stack.peek()>
	//   43   96:checkcast       #15  <Class VectorDrawableCompat$d>
	//   44   99:astore          12
				if("path".equals(obj))
	//*  45  101:ldc1            #54  <String "path">
	//*  46  103:aload           13
	//*  47  105:invokevirtual   #238 <Method boolean String.equals(Object)>
	//*  48  108:ifeq            187
				{
					obj = ((Object) (new c()));
	//   49  111:new             #12  <Class VectorDrawableCompat$c>
	//   50  114:dup             
	//   51  115:invokespecial   #239 <Method void VectorDrawableCompat$c()>
	//   52  118:astore          13
					((c) (obj)).a(resources, attributeset, theme, xmlpullparser);
	//   53  120:aload           13
	//   54  122:aload_1         
	//   55  123:aload_3         
	//   56  124:aload           4
	//   57  126:aload_2         
	//   58  127:invokevirtual   #242 <Method void VectorDrawableCompat$c.a(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
					d1.a.add(obj);
	//   59  130:aload           12
	//   60  132:getfield        #245 <Field ArrayList VectorDrawableCompat$d.a>
	//   61  135:aload           13
	//   62  137:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//   63  140:pop             
					if(((c) (obj)).getPathName() != null)
	//*  64  141:aload           13
	//*  65  143:invokevirtual   #253 <Method String VectorDrawableCompat$c.getPathName()>
	//*  66  146:ifnull          165
						b1.h.put(((Object) (((c) (obj)).getPathName())), obj);
	//   67  149:aload           10
	//   68  151:getfield        #256 <Field ArrayMap VectorDrawableCompat$b.h>
	//   69  154:aload           13
	//   70  156:invokevirtual   #253 <Method String VectorDrawableCompat$c.getPathName()>
	//   71  159:aload           13
	//   72  161:invokevirtual   #262 <Method Object ArrayMap.put(Object, Object)>
	//   73  164:pop             
					j = 0;
	//   74  165:iconst_0        
	//   75  166:istore          6
					h1.e = h1.e | ((c) (obj)).m;
	//   76  168:aload           9
	//   77  170:aload           9
	//   78  172:getfield        #264 <Field int VectorDrawableCompat$h.e>
	//   79  175:aload           13
	//   80  177:getfield        #267 <Field int VectorDrawableCompat$c.m>
	//   81  180:ior             
	//   82  181:putfield        #264 <Field int VectorDrawableCompat$h.e>
				} else
	//*  83  184:goto            370
				if("clip-path".equals(obj))
	//*  84  187:ldc1            #48  <String "clip-path">
	//*  85  189:aload           13
	//*  86  191:invokevirtual   #238 <Method boolean String.equals(Object)>
	//*  87  194:ifeq            274
				{
					obj = ((Object) (new a()));
	//   88  197:new             #6   <Class VectorDrawableCompat$a>
	//   89  200:dup             
	//   90  201:invokespecial   #268 <Method void VectorDrawableCompat$a()>
	//   91  204:astore          13
					((a) (obj)).a(resources, attributeset, theme, xmlpullparser);
	//   92  206:aload           13
	//   93  208:aload_1         
	//   94  209:aload_3         
	//   95  210:aload           4
	//   96  212:aload_2         
	//   97  213:invokevirtual   #269 <Method void VectorDrawableCompat$a.a(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
					d1.a.add(obj);
	//   98  216:aload           12
	//   99  218:getfield        #245 <Field ArrayList VectorDrawableCompat$d.a>
	//  100  221:aload           13
	//  101  223:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//  102  226:pop             
					if(((a) (obj)).getPathName() != null)
	//* 103  227:aload           13
	//* 104  229:invokevirtual   #270 <Method String VectorDrawableCompat$a.getPathName()>
	//* 105  232:ifnull          251
						b1.h.put(((Object) (((a) (obj)).getPathName())), obj);
	//  106  235:aload           10
	//  107  237:getfield        #256 <Field ArrayMap VectorDrawableCompat$b.h>
	//  108  240:aload           13
	//  109  242:invokevirtual   #270 <Method String VectorDrawableCompat$a.getPathName()>
	//  110  245:aload           13
	//  111  247:invokevirtual   #262 <Method Object ArrayMap.put(Object, Object)>
	//  112  250:pop             
					h1.e = h1.e | ((a) (obj)).m;
	//  113  251:aload           9
	//  114  253:aload           9
	//  115  255:getfield        #264 <Field int VectorDrawableCompat$h.e>
	//  116  258:aload           13
	//  117  260:getfield        #271 <Field int VectorDrawableCompat$a.m>
	//  118  263:ior             
	//  119  264:putfield        #264 <Field int VectorDrawableCompat$h.e>
					j = i;
	//  120  267:iload           5
	//  121  269:istore          6
				} else
	//* 122  271:goto            370
				{
					j = i;
	//  123  274:iload           5
	//  124  276:istore          6
					if("group".equals(obj))
	//* 125  278:ldc1            #51  <String "group">
	//* 126  280:aload           13
	//* 127  282:invokevirtual   #238 <Method boolean String.equals(Object)>
	//* 128  285:ifeq            370
					{
						d d2 = new d();
	//  129  288:new             #15  <Class VectorDrawableCompat$d>
	//  130  291:dup             
	//  131  292:invokespecial   #272 <Method void VectorDrawableCompat$d()>
	//  132  295:astore          13
						d2.e(resources, attributeset, theme, xmlpullparser);
	//  133  297:aload           13
	//  134  299:aload_1         
	//  135  300:aload_3         
	//  136  301:aload           4
	//  137  303:aload_2         
	//  138  304:invokevirtual   #274 <Method void VectorDrawableCompat$d.e(Resources, AttributeSet, android.content.res.Resources$Theme, XmlPullParser)>
						d1.a.add(((Object) (d2)));
	//  139  307:aload           12
	//  140  309:getfield        #245 <Field ArrayList VectorDrawableCompat$d.a>
	//  141  312:aload           13
	//  142  314:invokevirtual   #250 <Method boolean ArrayList.add(Object)>
	//  143  317:pop             
						stack.push(((Object) (d2)));
	//  144  318:aload           11
	//  145  320:aload           13
	//  146  322:invokevirtual   #218 <Method Object Stack.push(Object)>
	//  147  325:pop             
						if(d2.getGroupName() != null)
	//* 148  326:aload           13
	//* 149  328:invokevirtual   #277 <Method String VectorDrawableCompat$d.getGroupName()>
	//* 150  331:ifnull          350
							b1.h.put(((Object) (d2.getGroupName())), ((Object) (d2)));
	//  151  334:aload           10
	//  152  336:getfield        #256 <Field ArrayMap VectorDrawableCompat$b.h>
	//  153  339:aload           13
	//  154  341:invokevirtual   #277 <Method String VectorDrawableCompat$d.getGroupName()>
	//  155  344:aload           13
	//  156  346:invokevirtual   #262 <Method Object ArrayMap.put(Object, Object)>
	//  157  349:pop             
						h1.e = h1.e | d2.b;
	//  158  350:aload           9
	//  159  352:aload           9
	//  160  354:getfield        #264 <Field int VectorDrawableCompat$h.e>
	//  161  357:aload           13
	//  162  359:getfield        #279 <Field int VectorDrawableCompat$d.b>
	//  163  362:ior             
	//  164  363:putfield        #264 <Field int VectorDrawableCompat$h.e>
						j = i;
	//  165  366:iload           5
	//  166  368:istore          6
					}
				}
				k = j;
	//  167  370:iload           6
	//  168  372:istore          7
			} else
	//* 169  374:goto            415
			{
				k = i;
	//  170  377:iload           5
	//  171  379:istore          7
				if(j == 3)
	//* 172  381:iload           6
	//* 173  383:iconst_3        
	//* 174  384:icmpne          415
				{
					k = i;
	//  175  387:iload           5
	//  176  389:istore          7
					if("group".equals(((Object) (xmlpullparser.getName()))))
	//* 177  391:ldc1            #51  <String "group">
	//* 178  393:aload_2         
	//* 179  394:invokeinterface #228 <Method String XmlPullParser.getName()>
	//* 180  399:invokevirtual   #238 <Method boolean String.equals(Object)>
	//* 181  402:ifeq            415
					{
						stack.pop();
	//  182  405:aload           11
	//  183  407:invokevirtual   #282 <Method Object Stack.pop()>
	//  184  410:pop             
						k = i;
	//  185  411:iload           5
	//  186  413:istore          7
					}
				}
			}
			j = xmlpullparser.next();
	//  187  415:aload_2         
	//  188  416:invokeinterface #182 <Method int XmlPullParser.next()>
	//  189  421:istore          6
			i = k;
	//  190  423:iload           7
	//  191  425:istore          5
		}

	//* 192  427:goto            52
		if(i != 0)
	//* 193  430:iload           5
	//* 194  432:ifeq            499
		{
			resources = ((Resources) (new StringBuffer()));
	//  195  435:new             #284 <Class StringBuffer>
	//  196  438:dup             
	//  197  439:invokespecial   #285 <Method void StringBuffer()>
	//  198  442:astore_1        
			if(((StringBuffer) (resources)).length() > 0)
	//* 199  443:aload_1         
	//* 200  444:invokevirtual   #288 <Method int StringBuffer.length()>
	//* 201  447:ifle            458
				((StringBuffer) (resources)).append(" or ");
	//  202  450:aload_1         
	//  203  451:ldc2            #290 <String " or ">
	//  204  454:invokevirtual   #294 <Method StringBuffer StringBuffer.append(String)>
	//  205  457:pop             
			((StringBuffer) (resources)).append("path");
	//  206  458:aload_1         
	//  207  459:ldc1            #54  <String "path">
	//  208  461:invokevirtual   #294 <Method StringBuffer StringBuffer.append(String)>
	//  209  464:pop             
			throw new XmlPullParserException((new StringBuilder()).append("no ").append(((Object) (resources))).append(" defined").toString());
	//  210  465:new             #135 <Class XmlPullParserException>
	//  211  468:dup             
	//  212  469:new             #296 <Class StringBuilder>
	//  213  472:dup             
	//  214  473:invokespecial   #297 <Method void StringBuilder()>
	//  215  476:ldc2            #299 <String "no ">
	//  216  479:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  217  482:aload_1         
	//  218  483:invokevirtual   #305 <Method StringBuilder StringBuilder.append(Object)>
	//  219  486:ldc2            #307 <String " defined">
	//  220  489:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  221  492:invokevirtual   #310 <Method String StringBuilder.toString()>
	//  222  495:invokespecial   #187 <Method void XmlPullParserException(String)>
	//  223  498:athrow          
		} else
		{
			return;
	//  224  499:return          
		}
	}

	private boolean needMirroring()
	{
		if(android.os.Build.VERSION.SDK_INT < 17)
	//*   0    0:getstatic       #142 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmpge          10
			return false;
	//    3    8:iconst_0        
	//    4    9:ireturn         
		return isAutoMirrored() && getLayoutDirection() == 1;
	//    5   10:aload_0         
	//    6   11:invokevirtual   #315 <Method boolean isAutoMirrored()>
	//    7   14:ifeq            27
	//    8   17:aload_0         
	//    9   18:invokevirtual   #318 <Method int getLayoutDirection()>
	//   10   21:iconst_1        
	//   11   22:icmpne          27
	//   12   25:iconst_1        
	//   13   26:ireturn         
	//   14   27:iconst_0        
	//   15   28:ireturn         
	}

	private static android.graphics.PorterDuff.Mode parseTintModeCompat(int i, android.graphics.PorterDuff.Mode mode)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     3 16: default 72
	//	               3 74
	//	               4 108
	//	               5 78
	//	               6 108
	//	               7 108
	//	               8 108
	//	               9 82
	//	               10 108
	//	               11 108
	//	               12 108
	//	               13 108
	//	               14 86
	//	               15 90
	//	               16 94
		default:
			return mode;
	//    2   72:aload_1         
	//    3   73:areturn         

		case 3: // '\003'
			return android.graphics.PorterDuff.Mode.SRC_OVER;
	//    4   74:getstatic       #323 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//    5   77:areturn         

		case 5: // '\005'
			return android.graphics.PorterDuff.Mode.SRC_IN;
	//    6   78:getstatic       #80  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    7   81:areturn         

		case 9: // '\t'
			return android.graphics.PorterDuff.Mode.SRC_ATOP;
	//    8   82:getstatic       #326 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
	//    9   85:areturn         

		case 14: // '\016'
			return android.graphics.PorterDuff.Mode.MULTIPLY;
	//   10   86:getstatic       #329 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   11   89:areturn         

		case 15: // '\017'
			return android.graphics.PorterDuff.Mode.SCREEN;
	//   12   90:getstatic       #332 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SCREEN>
	//   13   93:areturn         

		case 16: // '\020'
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  14   94:getstatic       #142 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   97:bipush          11
	//*  16   99:icmplt          106
				return android.graphics.PorterDuff.Mode.ADD;
	//   17  102:getstatic       #335 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.ADD>
	//   18  105:areturn         
			else
				return mode;
	//   19  106:aload_1         
	//   20  107:areturn         

		case 4: // '\004'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
		case 10: // '\n'
		case 11: // '\013'
		case 12: // '\f'
		case 13: // '\r'
			return mode;
	//   21  108:aload_1         
	//   22  109:areturn         
		}
	}

	private void printGroupTree(d d1, int i)
	{
		String s = "";
	//    0    0:ldc2            #339 <String "">
	//    1    3:astore          4
		for(int j = 0; j < i; j++)
	//*   2    5:iconst_0        
	//*   3    6:istore_3        
	//*   4    7:iload_3         
	//*   5    8:iload_2         
	//*   6    9:icmpge          42
			s = (new StringBuilder()).append(s).append("    ").toString();
	//    7   12:new             #296 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #297 <Method void StringBuilder()>
	//   10   19:aload           4
	//   11   21:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:ldc2            #341 <String "    ">
	//   13   27:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   15   33:astore          4

	//   16   35:iload_3         
	//   17   36:iconst_1        
	//   18   37:iadd            
	//   19   38:istore_3        
	//*  20   39:goto            7
		Log.v("VectorDrawableCompat", (new StringBuilder()).append(s).append("current group is :").append(d1.getGroupName()).append(" rotation is ").append(d1.c).toString());
	//   21   42:ldc1            #43  <String "VectorDrawableCompat">
	//   22   44:new             #296 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #297 <Method void StringBuilder()>
	//   25   51:aload           4
	//   26   53:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:ldc2            #343 <String "current group is :">
	//   28   59:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:aload_1         
	//   30   63:invokevirtual   #277 <Method String VectorDrawableCompat$d.getGroupName()>
	//   31   66:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   32   69:ldc2            #345 <String " rotation is ">
	//   33   72:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   34   75:aload_1         
	//   35   76:getfield        #348 <Field float VectorDrawableCompat$d.c>
	//   36   79:invokevirtual   #351 <Method StringBuilder StringBuilder.append(float)>
	//   37   82:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   38   85:invokestatic    #355 <Method int Log.v(String, String)>
	//   39   88:pop             
		Log.v("VectorDrawableCompat", (new StringBuilder()).append(s).append("matrix is :").append(d1.getLocalMatrix().toString()).toString());
	//   40   89:ldc1            #43  <String "VectorDrawableCompat">
	//   41   91:new             #296 <Class StringBuilder>
	//   42   94:dup             
	//   43   95:invokespecial   #297 <Method void StringBuilder()>
	//   44   98:aload           4
	//   45  100:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   46  103:ldc2            #357 <String "matrix is :">
	//   47  106:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   48  109:aload_1         
	//   49  110:invokevirtual   #361 <Method Matrix VectorDrawableCompat$d.getLocalMatrix()>
	//   50  113:invokevirtual   #362 <Method String Matrix.toString()>
	//   51  116:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   52  119:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   53  122:invokestatic    #355 <Method int Log.v(String, String)>
	//   54  125:pop             
		for(int k = 0; k < d1.a.size(); k++)
	//*  55  126:iconst_0        
	//*  56  127:istore_3        
	//*  57  128:iload_3         
	//*  58  129:aload_1         
	//*  59  130:getfield        #245 <Field ArrayList VectorDrawableCompat$d.a>
	//*  60  133:invokevirtual   #365 <Method int ArrayList.size()>
	//*  61  136:icmpge          190
		{
			Object obj = d1.a.get(k);
	//   62  139:aload_1         
	//   63  140:getfield        #245 <Field ArrayList VectorDrawableCompat$d.a>
	//   64  143:iload_3         
	//   65  144:invokevirtual   #369 <Method Object ArrayList.get(int)>
	//   66  147:astore          4
			if(obj instanceof d)
	//*  67  149:aload           4
	//*  68  151:instanceof      #15  <Class VectorDrawableCompat$d>
	//*  69  154:ifeq            172
				printGroupTree((d)obj, i + 1);
	//   70  157:aload_0         
	//   71  158:aload           4
	//   72  160:checkcast       #15  <Class VectorDrawableCompat$d>
	//   73  163:iload_2         
	//   74  164:iconst_1        
	//   75  165:iadd            
	//   76  166:invokespecial   #371 <Method void printGroupTree(VectorDrawableCompat$d, int)>
			else
	//*  77  169:goto            183
				((e)obj).e(i + 1);
	//   78  172:aload           4
	//   79  174:checkcast       #18  <Class VectorDrawableCompat$e>
	//   80  177:iload_2         
	//   81  178:iconst_1        
	//   82  179:iadd            
	//   83  180:invokevirtual   #374 <Method void VectorDrawableCompat$e.e(int)>
		}

	//   84  183:iload_3         
	//   85  184:iconst_1        
	//   86  185:iadd            
	//   87  186:istore_3        
	//*  88  187:goto            128
	//   89  190:return          
	}

	private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
		throws XmlPullParserException
	{
		h h1 = mVectorState;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//    2    4:astore          4
		b b1 = h1.b;
	//    3    6:aload           4
	//    4    8:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//    5   11:astore_3        
		h1.a = parseTintModeCompat(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "tintMode", 6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
	//    6   12:aload           4
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:ldc2            #378 <String "tintMode">
	//   10   19:bipush          6
	//   11   21:iconst_m1       
	//   12   22:invokestatic    #384 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   13   25:getstatic       #80  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   14   28:invokestatic    #386 <Method android.graphics.PorterDuff$Mode parseTintModeCompat(int, android.graphics.PorterDuff$Mode)>
	//   15   31:putfield        #112 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$h.a>
		ColorStateList colorstatelist = typedarray.getColorStateList(1);
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #392 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   19   39:astore          5
		if(colorstatelist != null)
	//*  20   41:aload           5
	//*  21   43:ifnull          53
			h1.c = colorstatelist;
	//   22   46:aload           4
	//   23   48:aload           5
	//   24   50:putfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
		h1.d = TypedArrayUtils.getNamedBoolean(typedarray, xmlpullparser, "autoMirrored", 5, h1.d);
	//   25   53:aload           4
	//   26   55:aload_1         
	//   27   56:aload_2         
	//   28   57:ldc2            #394 <String "autoMirrored">
	//   29   60:iconst_5        
	//   30   61:aload           4
	//   31   63:getfield        #396 <Field boolean VectorDrawableCompat$h.d>
	//   32   66:invokestatic    #400 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, XmlPullParser, String, int, boolean)>
	//   33   69:putfield        #396 <Field boolean VectorDrawableCompat$h.d>
		b1.e = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "viewportWidth", 7, b1.e);
	//   34   72:aload_3         
	//   35   73:aload_1         
	//   36   74:aload_2         
	//   37   75:ldc2            #402 <String "viewportWidth">
	//   38   78:bipush          7
	//   39   80:aload_3         
	//   40   81:getfield        #404 <Field float VectorDrawableCompat$b.e>
	//   41   84:invokestatic    #408 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   42   87:putfield        #404 <Field float VectorDrawableCompat$b.e>
		b1.c = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "viewportHeight", 8, b1.c);
	//   43   90:aload_3         
	//   44   91:aload_1         
	//   45   92:aload_2         
	//   46   93:ldc2            #410 <String "viewportHeight">
	//   47   96:bipush          8
	//   48   98:aload_3         
	//   49   99:getfield        #411 <Field float VectorDrawableCompat$b.c>
	//   50  102:invokestatic    #408 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   51  105:putfield        #411 <Field float VectorDrawableCompat$b.c>
		if(b1.e <= 0.0F)
	//*  52  108:aload_3         
	//*  53  109:getfield        #404 <Field float VectorDrawableCompat$b.e>
	//*  54  112:fconst_0        
	//*  55  113:fcmpg           
	//*  56  114:ifgt            148
			throw new XmlPullParserException((new StringBuilder()).append(typedarray.getPositionDescription()).append("<vector> tag requires viewportWidth > 0").toString());
	//   57  117:new             #135 <Class XmlPullParserException>
	//   58  120:dup             
	//   59  121:new             #296 <Class StringBuilder>
	//   60  124:dup             
	//   61  125:invokespecial   #297 <Method void StringBuilder()>
	//   62  128:aload_1         
	//   63  129:invokevirtual   #414 <Method String TypedArray.getPositionDescription()>
	//   64  132:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   65  135:ldc2            #416 <String "<vector> tag requires viewportWidth > 0">
	//   66  138:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   67  141:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   68  144:invokespecial   #187 <Method void XmlPullParserException(String)>
	//   69  147:athrow          
		if(b1.c <= 0.0F)
	//*  70  148:aload_3         
	//*  71  149:getfield        #411 <Field float VectorDrawableCompat$b.c>
	//*  72  152:fconst_0        
	//*  73  153:fcmpg           
	//*  74  154:ifgt            188
			throw new XmlPullParserException((new StringBuilder()).append(typedarray.getPositionDescription()).append("<vector> tag requires viewportHeight > 0").toString());
	//   75  157:new             #135 <Class XmlPullParserException>
	//   76  160:dup             
	//   77  161:new             #296 <Class StringBuilder>
	//   78  164:dup             
	//   79  165:invokespecial   #297 <Method void StringBuilder()>
	//   80  168:aload_1         
	//   81  169:invokevirtual   #414 <Method String TypedArray.getPositionDescription()>
	//   82  172:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   83  175:ldc2            #418 <String "<vector> tag requires viewportHeight > 0">
	//   84  178:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//   85  181:invokevirtual   #310 <Method String StringBuilder.toString()>
	//   86  184:invokespecial   #187 <Method void XmlPullParserException(String)>
	//   87  187:athrow          
		b1.a = typedarray.getDimension(3, b1.a);
	//   88  188:aload_3         
	//   89  189:aload_1         
	//   90  190:iconst_3        
	//   91  191:aload_3         
	//   92  192:getfield        #420 <Field float VectorDrawableCompat$b.a>
	//   93  195:invokevirtual   #424 <Method float TypedArray.getDimension(int, float)>
	//   94  198:putfield        #420 <Field float VectorDrawableCompat$b.a>
		b1.b = typedarray.getDimension(2, b1.b);
	//   95  201:aload_3         
	//   96  202:aload_1         
	//   97  203:iconst_2        
	//   98  204:aload_3         
	//   99  205:getfield        #426 <Field float VectorDrawableCompat$b.b>
	//  100  208:invokevirtual   #424 <Method float TypedArray.getDimension(int, float)>
	//  101  211:putfield        #426 <Field float VectorDrawableCompat$b.b>
		if(b1.a <= 0.0F)
	//* 102  214:aload_3         
	//* 103  215:getfield        #420 <Field float VectorDrawableCompat$b.a>
	//* 104  218:fconst_0        
	//* 105  219:fcmpg           
	//* 106  220:ifgt            254
			throw new XmlPullParserException((new StringBuilder()).append(typedarray.getPositionDescription()).append("<vector> tag requires width > 0").toString());
	//  107  223:new             #135 <Class XmlPullParserException>
	//  108  226:dup             
	//  109  227:new             #296 <Class StringBuilder>
	//  110  230:dup             
	//  111  231:invokespecial   #297 <Method void StringBuilder()>
	//  112  234:aload_1         
	//  113  235:invokevirtual   #414 <Method String TypedArray.getPositionDescription()>
	//  114  238:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  115  241:ldc2            #428 <String "<vector> tag requires width > 0">
	//  116  244:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  117  247:invokevirtual   #310 <Method String StringBuilder.toString()>
	//  118  250:invokespecial   #187 <Method void XmlPullParserException(String)>
	//  119  253:athrow          
		if(b1.b <= 0.0F)
	//* 120  254:aload_3         
	//* 121  255:getfield        #426 <Field float VectorDrawableCompat$b.b>
	//* 122  258:fconst_0        
	//* 123  259:fcmpg           
	//* 124  260:ifgt            294
			throw new XmlPullParserException((new StringBuilder()).append(typedarray.getPositionDescription()).append("<vector> tag requires height > 0").toString());
	//  125  263:new             #135 <Class XmlPullParserException>
	//  126  266:dup             
	//  127  267:new             #296 <Class StringBuilder>
	//  128  270:dup             
	//  129  271:invokespecial   #297 <Method void StringBuilder()>
	//  130  274:aload_1         
	//  131  275:invokevirtual   #414 <Method String TypedArray.getPositionDescription()>
	//  132  278:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  133  281:ldc2            #430 <String "<vector> tag requires height > 0">
	//  134  284:invokevirtual   #302 <Method StringBuilder StringBuilder.append(String)>
	//  135  287:invokevirtual   #310 <Method String StringBuilder.toString()>
	//  136  290:invokespecial   #187 <Method void XmlPullParserException(String)>
	//  137  293:athrow          
		b1.setAlpha(TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "alpha", 4, b1.getAlpha()));
	//  138  294:aload_3         
	//  139  295:aload_1         
	//  140  296:aload_2         
	//  141  297:ldc2            #431 <String "alpha">
	//  142  300:iconst_4        
	//  143  301:aload_3         
	//  144  302:invokevirtual   #435 <Method float VectorDrawableCompat$b.getAlpha()>
	//  145  305:invokestatic    #408 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  146  308:invokevirtual   #439 <Method void VectorDrawableCompat$b.setAlpha(float)>
		typedarray = ((TypedArray) (typedarray.getString(0)));
	//  147  311:aload_1         
	//  148  312:iconst_0        
	//  149  313:invokevirtual   #443 <Method String TypedArray.getString(int)>
	//  150  316:astore_1        
		if(typedarray != null)
	//* 151  317:aload_1         
	//* 152  318:ifnull          336
		{
			b1.g = ((String) (typedarray));
	//  153  321:aload_3         
	//  154  322:aload_1         
	//  155  323:putfield        #445 <Field String VectorDrawableCompat$b.g>
			b1.h.put(((Object) (typedarray)), ((Object) (b1)));
	//  156  326:aload_3         
	//  157  327:getfield        #256 <Field ArrayMap VectorDrawableCompat$b.h>
	//  158  330:aload_1         
	//  159  331:aload_3         
	//  160  332:invokevirtual   #262 <Method Object ArrayMap.put(Object, Object)>
	//  161  335:pop             
		}
	//  162  336:return          
	}

	public volatile void applyTheme(android.content.res.Resources.Theme theme)
	{
		super.applyTheme(theme);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #449 <Method void ag.applyTheme(android.content.res.Resources$Theme)>
	//    3    5:return          
	}

	public boolean canApplyTheme()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			DrawableCompat.canApplyTheme(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #455 <Method boolean DrawableCompat.canApplyTheme(Drawable)>
	//    6   14:pop             
		return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile void clearColorFilter()
	{
		super.clearColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #458 <Method void ag.clearColorFilter()>
	//    2    4:return          
	}

	public void draw(Canvas canvas)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.draw(canvas);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #462 <Method void Drawable.draw(Canvas)>
			return;
	//    7   15:return          
		}
		copyBounds(mTmpBounds);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #100 <Field Rect mTmpBounds>
	//   11   21:invokevirtual   #466 <Method void copyBounds(Rect)>
		if(mTmpBounds.width() <= 0 || mTmpBounds.height() <= 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #100 <Field Rect mTmpBounds>
	//*  14   28:invokevirtual   #469 <Method int Rect.width()>
	//*  15   31:ifle            44
	//*  16   34:aload_0         
	//*  17   35:getfield        #100 <Field Rect mTmpBounds>
	//*  18   38:invokevirtual   #472 <Method int Rect.height()>
	//*  19   41:ifgt            45
			return;
	//   20   44:return          
		Object obj;
		if(mColorFilter == null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #474 <Field ColorFilter mColorFilter>
	//*  23   49:ifnonnull       61
			obj = ((Object) (mTintFilter));
	//   24   52:aload_0         
	//   25   53:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   26   56:astore          9
		else
	//*  27   58:goto            67
			obj = ((Object) (mColorFilter));
	//   28   61:aload_0         
	//   29   62:getfield        #474 <Field ColorFilter mColorFilter>
	//   30   65:astore          9
		canvas.getMatrix(mTmpMatrix);
	//   31   67:aload_1         
	//   32   68:aload_0         
	//   33   69:getfield        #95  <Field Matrix mTmpMatrix>
	//   34   72:invokevirtual   #480 <Method void Canvas.getMatrix(Matrix)>
		mTmpMatrix.getValues(mTmpFloats);
	//   35   75:aload_0         
	//   36   76:getfield        #95  <Field Matrix mTmpMatrix>
	//   37   79:aload_0         
	//   38   80:getfield        #90  <Field float[] mTmpFloats>
	//   39   83:invokevirtual   #484 <Method void Matrix.getValues(float[])>
		float f = Math.abs(mTmpFloats[0]);
	//   40   86:aload_0         
	//   41   87:getfield        #90  <Field float[] mTmpFloats>
	//   42   90:iconst_0        
	//   43   91:faload          
	//   44   92:invokestatic    #490 <Method float Math.abs(float)>
	//   45   95:fstore_2        
		float f1 = Math.abs(mTmpFloats[4]);
	//   46   96:aload_0         
	//   47   97:getfield        #90  <Field float[] mTmpFloats>
	//   48  100:iconst_4        
	//   49  101:faload          
	//   50  102:invokestatic    #490 <Method float Math.abs(float)>
	//   51  105:fstore_3        
		float f3 = Math.abs(mTmpFloats[1]);
	//   52  106:aload_0         
	//   53  107:getfield        #90  <Field float[] mTmpFloats>
	//   54  110:iconst_1        
	//   55  111:faload          
	//   56  112:invokestatic    #490 <Method float Math.abs(float)>
	//   57  115:fstore          5
		float f2 = Math.abs(mTmpFloats[3]);
	//   58  117:aload_0         
	//   59  118:getfield        #90  <Field float[] mTmpFloats>
	//   60  121:iconst_3        
	//   61  122:faload          
	//   62  123:invokestatic    #490 <Method float Math.abs(float)>
	//   63  126:fstore          4
		if(f3 != 0.0F || f2 != 0.0F)
	//*  64  128:fload           5
	//*  65  130:fconst_0        
	//*  66  131:fcmpl           
	//*  67  132:ifne            142
	//*  68  135:fload           4
	//*  69  137:fconst_0        
	//*  70  138:fcmpl           
	//*  71  139:ifeq            146
		{
			f = 1.0F;
	//   72  142:fconst_1        
	//   73  143:fstore_2        
			f1 = 1.0F;
	//   74  144:fconst_1        
	//   75  145:fstore_3        
		}
		int i = (int)((float)mTmpBounds.width() * f);
	//   76  146:aload_0         
	//   77  147:getfield        #100 <Field Rect mTmpBounds>
	//   78  150:invokevirtual   #469 <Method int Rect.width()>
	//   79  153:i2f             
	//   80  154:fload_2         
	//   81  155:fmul            
	//   82  156:f2i             
	//   83  157:istore          6
		int j = (int)((float)mTmpBounds.height() * f1);
	//   84  159:aload_0         
	//   85  160:getfield        #100 <Field Rect mTmpBounds>
	//   86  163:invokevirtual   #472 <Method int Rect.height()>
	//   87  166:i2f             
	//   88  167:fload_3         
	//   89  168:fmul            
	//   90  169:f2i             
	//   91  170:istore          7
		i = Math.min(2048, i);
	//   92  172:sipush          2048
	//   93  175:iload           6
	//   94  177:invokestatic    #494 <Method int Math.min(int, int)>
	//   95  180:istore          6
		j = Math.min(2048, j);
	//   96  182:sipush          2048
	//   97  185:iload           7
	//   98  187:invokestatic    #494 <Method int Math.min(int, int)>
	//   99  190:istore          7
		if(i <= 0 || j <= 0)
	//* 100  192:iload           6
	//* 101  194:ifle            202
	//* 102  197:iload           7
	//* 103  199:ifgt            203
			return;
	//  104  202:return          
		int k = canvas.save();
	//  105  203:aload_1         
	//  106  204:invokevirtual   #497 <Method int Canvas.save()>
	//  107  207:istore          8
		canvas.translate(mTmpBounds.left, mTmpBounds.top);
	//  108  209:aload_1         
	//  109  210:aload_0         
	//  110  211:getfield        #100 <Field Rect mTmpBounds>
	//  111  214:getfield        #500 <Field int Rect.left>
	//  112  217:i2f             
	//  113  218:aload_0         
	//  114  219:getfield        #100 <Field Rect mTmpBounds>
	//  115  222:getfield        #503 <Field int Rect.top>
	//  116  225:i2f             
	//  117  226:invokevirtual   #507 <Method void Canvas.translate(float, float)>
		if(needMirroring())
	//* 118  229:aload_0         
	//* 119  230:invokespecial   #509 <Method boolean needMirroring()>
	//* 120  233:ifeq            257
		{
			canvas.translate(mTmpBounds.width(), 0.0F);
	//  121  236:aload_1         
	//  122  237:aload_0         
	//  123  238:getfield        #100 <Field Rect mTmpBounds>
	//  124  241:invokevirtual   #469 <Method int Rect.width()>
	//  125  244:i2f             
	//  126  245:fconst_0        
	//  127  246:invokevirtual   #507 <Method void Canvas.translate(float, float)>
			canvas.scale(-1F, 1.0F);
	//  128  249:aload_1         
	//  129  250:ldc2            #510 <Float -1F>
	//  130  253:fconst_1        
	//  131  254:invokevirtual   #513 <Method void Canvas.scale(float, float)>
		}
		mTmpBounds.offsetTo(0, 0);
	//  132  257:aload_0         
	//  133  258:getfield        #100 <Field Rect mTmpBounds>
	//  134  261:iconst_0        
	//  135  262:iconst_0        
	//  136  263:invokevirtual   #517 <Method void Rect.offsetTo(int, int)>
		mVectorState.d(i, j);
	//  137  266:aload_0         
	//  138  267:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//  139  270:iload           6
	//  140  272:iload           7
	//  141  274:invokevirtual   #519 <Method void VectorDrawableCompat$h.d(int, int)>
		if(!mAllowCaching)
	//* 142  277:aload_0         
	//* 143  278:getfield        #88  <Field boolean mAllowCaching>
	//* 144  281:ifne            298
			mVectorState.a(i, j);
	//  145  284:aload_0         
	//  146  285:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//  147  288:iload           6
	//  148  290:iload           7
	//  149  292:invokevirtual   #521 <Method void VectorDrawableCompat$h.a(int, int)>
		else
	//* 150  295:goto            326
		if(!mVectorState.b())
	//* 151  298:aload_0         
	//* 152  299:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//* 153  302:invokevirtual   #523 <Method boolean VectorDrawableCompat$h.b()>
	//* 154  305:ifne            326
		{
			mVectorState.a(i, j);
	//  155  308:aload_0         
	//  156  309:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//  157  312:iload           6
	//  158  314:iload           7
	//  159  316:invokevirtual   #521 <Method void VectorDrawableCompat$h.a(int, int)>
			mVectorState.a();
	//  160  319:aload_0         
	//  161  320:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//  162  323:invokevirtual   #525 <Method void VectorDrawableCompat$h.a()>
		}
		mVectorState.b(canvas, ((ColorFilter) (obj)), mTmpBounds);
	//  163  326:aload_0         
	//  164  327:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//  165  330:aload_1         
	//  166  331:aload           9
	//  167  333:aload_0         
	//  168  334:getfield        #100 <Field Rect mTmpBounds>
	//  169  337:invokevirtual   #528 <Method void VectorDrawableCompat$h.b(Canvas, ColorFilter, Rect)>
		canvas.restoreToCount(k);
	//  170  340:aload_1         
	//  171  341:iload           8
	//  172  343:invokevirtual   #531 <Method void Canvas.restoreToCount(int)>
	//  173  346:return          
	}

	public int getAlpha()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.getAlpha(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #534 <Method int DrawableCompat.getAlpha(Drawable)>
	//    6   14:ireturn         
		else
			return mVectorState.b.getRootAlpha();
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//    9   19:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//   10   22:invokevirtual   #537 <Method int VectorDrawableCompat$b.getRootAlpha()>
	//   11   25:ireturn         
	}

	public int getChangingConfigurations()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #540 <Method int Drawable.getChangingConfigurations()>
	//    6   14:ireturn         
		else
			return super.getChangingConfigurations() | mVectorState.getChangingConfigurations();
	//    7   15:aload_0         
	//    8   16:invokespecial   #541 <Method int ag.getChangingConfigurations()>
	//    9   19:aload_0         
	//   10   20:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   11   23:invokevirtual   #542 <Method int VectorDrawableCompat$h.getChangingConfigurations()>
	//   12   26:ior             
	//   13   27:ireturn         
	}

	public volatile ColorFilter getColorFilter()
	{
		return super.getColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #546 <Method ColorFilter ag.getColorFilter()>
	//    2    4:areturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          22
		{
			return ((android.graphics.drawable.Drawable.ConstantState) (new g(mDelegateDrawable.getConstantState())));
	//    3    7:new             #21  <Class VectorDrawableCompat$g>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #153 <Field Drawable mDelegateDrawable>
	//    7   15:invokevirtual   #159 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    8   18:invokespecial   #162 <Method void VectorDrawableCompat$g(android.graphics.drawable.Drawable$ConstantState)>
	//    9   21:areturn         
		} else
		{
			mVectorState.e = getChangingConfigurations();
	//   10   22:aload_0         
	//   11   23:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #547 <Method int getChangingConfigurations()>
	//   14   30:putfield        #264 <Field int VectorDrawableCompat$h.e>
			return ((android.graphics.drawable.Drawable.ConstantState) (mVectorState));
	//   15   33:aload_0         
	//   16   34:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   17   37:areturn         
		}
	}

	public volatile Drawable getCurrent()
	{
		return super.getCurrent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #551 <Method Drawable ag.getCurrent()>
	//    2    4:areturn         
	}

	public int getIntrinsicHeight()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicHeight();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #554 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:ireturn         
		else
			return (int)mVectorState.b.b;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//    9   19:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//   10   22:getfield        #426 <Field float VectorDrawableCompat$b.b>
	//   11   25:f2i             
	//   12   26:ireturn         
	}

	public int getIntrinsicWidth()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #557 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:ireturn         
		else
			return (int)mVectorState.b.a;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//    9   19:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//   10   22:getfield        #420 <Field float VectorDrawableCompat$b.a>
	//   11   25:f2i             
	//   12   26:ireturn         
	}

	public volatile int getMinimumHeight()
	{
		return super.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #560 <Method int ag.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumWidth()
	{
		return super.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #563 <Method int ag.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getOpacity();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #566 <Method int Drawable.getOpacity()>
	//    6   14:ireturn         
		else
			return -3;
	//    7   15:bipush          -3
	//    8   17:ireturn         
	}

	public volatile boolean getPadding(Rect rect)
	{
		return super.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #570 <Method boolean ag.getPadding(Rect)>
	//    3    5:ireturn         
	}

	public float getPixelSize()
	{
		if(mVectorState == null && mVectorState.b == null || mVectorState.b.a == 0.0F || mVectorState.b.b == 0.0F || mVectorState.b.c == 0.0F || mVectorState.b.e == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//*   2    4:ifnonnull       17
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//*   5   11:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//*   6   14:ifnull          77
	//*   7   17:aload_0         
	//*   8   18:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//*   9   21:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//*  10   24:getfield        #420 <Field float VectorDrawableCompat$b.a>
	//*  11   27:fconst_0        
	//*  12   28:fcmpl           
	//*  13   29:ifeq            77
	//*  14   32:aload_0         
	//*  15   33:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//*  16   36:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//*  17   39:getfield        #426 <Field float VectorDrawableCompat$b.b>
	//*  18   42:fconst_0        
	//*  19   43:fcmpl           
	//*  20   44:ifeq            77
	//*  21   47:aload_0         
	//*  22   48:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//*  23   51:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//*  24   54:getfield        #411 <Field float VectorDrawableCompat$b.c>
	//*  25   57:fconst_0        
	//*  26   58:fcmpl           
	//*  27   59:ifeq            77
	//*  28   62:aload_0         
	//*  29   63:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//*  30   66:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//*  31   69:getfield        #404 <Field float VectorDrawableCompat$b.e>
	//*  32   72:fconst_0        
	//*  33   73:fcmpl           
	//*  34   74:ifne            79
		{
			return 1.0F;
	//   35   77:fconst_1        
	//   36   78:freturn         
		} else
		{
			float f = mVectorState.b.a;
	//   37   79:aload_0         
	//   38   80:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   39   83:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//   40   86:getfield        #420 <Field float VectorDrawableCompat$b.a>
	//   41   89:fstore_1        
			float f1 = mVectorState.b.b;
	//   42   90:aload_0         
	//   43   91:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   44   94:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//   45   97:getfield        #426 <Field float VectorDrawableCompat$b.b>
	//   46  100:fstore_2        
			float f2 = mVectorState.b.e;
	//   47  101:aload_0         
	//   48  102:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   49  105:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//   50  108:getfield        #404 <Field float VectorDrawableCompat$b.e>
	//   51  111:fstore_3        
			float f3 = mVectorState.b.c;
	//   52  112:aload_0         
	//   53  113:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   54  116:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//   55  119:getfield        #411 <Field float VectorDrawableCompat$b.c>
	//   56  122:fstore          4
			return Math.min(f2 / f, f3 / f1);
	//   57  124:fload_3         
	//   58  125:fload_1         
	//   59  126:fdiv            
	//   60  127:fload           4
	//   61  129:fload_2         
	//   62  130:fdiv            
	//   63  131:invokestatic    #577 <Method float Math.min(float, float)>
	//   64  134:freturn         
		}
	}

	public volatile int[] getState()
	{
		return super.getState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #581 <Method int[] ag.getState()>
	//    2    4:areturn         
	}

	Object getTargetByName(String s)
	{
		return mVectorState.b.h.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//    2    4:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//    3    7:getfield        #256 <Field ArrayMap VectorDrawableCompat$b.h>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #585 <Method Object ArrayMap.get(Object)>
	//    6   14:areturn         
	}

	public volatile Region getTransparentRegion()
	{
		return super.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #589 <Method Region ag.getTransparentRegion()>
	//    2    4:areturn         
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			mDelegateDrawable.inflate(resources, xmlpullparser, attributeset);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #592 <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet)>
			return;
	//    9   17:return          
		} else
		{
			inflate(resources, xmlpullparser, attributeset, ((android.content.res.Resources.Theme) (null)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:aconst_null     
	//   15   23:invokevirtual   #203 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   16   26:return          
		}
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          20
		{
			DrawableCompat.inflate(mDelegateDrawable, resources, xmlpullparser, attributeset, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokestatic    #595 <Method void DrawableCompat.inflate(Drawable, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   10   19:return          
		} else
		{
			h h1 = mVectorState;
	//   11   20:aload_0         
	//   12   21:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   13   24:astore          5
			h1.b = new b();
	//   14   26:aload           5
	//   15   28:new             #9   <Class VectorDrawableCompat$b>
	//   16   31:dup             
	//   17   32:invokespecial   #596 <Method void VectorDrawableCompat$b()>
	//   18   35:putfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
			TypedArray typedarray = obtainAttributes(resources, theme, attributeset, ae.a);
	//   19   38:aload_1         
	//   20   39:aload           4
	//   21   41:aload_3         
	//   22   42:getstatic       #601 <Field int[] ae.a>
	//   23   45:invokestatic    #605 <Method TypedArray obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   24   48:astore          6
			updateStateFromTypedArray(typedarray, xmlpullparser);
	//   25   50:aload_0         
	//   26   51:aload           6
	//   27   53:aload_2         
	//   28   54:invokespecial   #607 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
			typedarray.recycle();
	//   29   57:aload           6
	//   30   59:invokevirtual   #610 <Method void TypedArray.recycle()>
			h1.e = getChangingConfigurations();
	//   31   62:aload           5
	//   32   64:aload_0         
	//   33   65:invokevirtual   #547 <Method int getChangingConfigurations()>
	//   34   68:putfield        #264 <Field int VectorDrawableCompat$h.e>
			h1.p = true;
	//   35   71:aload           5
	//   36   73:iconst_1        
	//   37   74:putfield        #613 <Field boolean VectorDrawableCompat$h.p>
			inflateInternal(resources, xmlpullparser, attributeset, theme);
	//   38   77:aload_0         
	//   39   78:aload_1         
	//   40   79:aload_2         
	//   41   80:aload_3         
	//   42   81:aload           4
	//   43   83:invokespecial   #615 <Method void inflateInternal(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			mTintFilter = updateTintFilter(mTintFilter, h1.c, h1.a);
	//   44   86:aload_0         
	//   45   87:aload_0         
	//   46   88:aload_0         
	//   47   89:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   48   92:aload           5
	//   49   94:getfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
	//   50   97:aload           5
	//   51   99:getfield        #112 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$h.a>
	//   52  102:invokevirtual   #116 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   53  105:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
			return;
	//   54  108:return          
		}
	}

	public void invalidateSelf()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
		{
			mDelegateDrawable.invalidateSelf();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #618 <Method void Drawable.invalidateSelf()>
			return;
	//    6   14:return          
		} else
		{
			super.invalidateSelf();
	//    7   15:aload_0         
	//    8   16:invokespecial   #619 <Method void ag.invalidateSelf()>
			return;
	//    9   19:return          
		}
	}

	public boolean isAutoMirrored()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.isAutoMirrored(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #621 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//    6   14:ireturn         
		else
			return mVectorState.d;
	//    7   15:aload_0         
	//    8   16:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//    9   19:getfield        #396 <Field boolean VectorDrawableCompat$h.d>
	//   10   22:ireturn         
	}

	public boolean isStateful()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.isStateful();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #624 <Method boolean Drawable.isStateful()>
	//    6   14:ireturn         
		return super.isStateful() || mVectorState != null && mVectorState.c != null && mVectorState.c.isStateful();
	//    7   15:aload_0         
	//    8   16:invokespecial   #625 <Method boolean ag.isStateful()>
	//    9   19:ifne            52
	//   10   22:aload_0         
	//   11   23:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   12   26:ifnull          54
	//   13   29:aload_0         
	//   14   30:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   15   33:getfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
	//   16   36:ifnull          54
	//   17   39:aload_0         
	//   18   40:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   19   43:getfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
	//   20   46:invokevirtual   #628 <Method boolean ColorStateList.isStateful()>
	//   21   49:ifeq            54
	//   22   52:iconst_1        
	//   23   53:ireturn         
	//   24   54:iconst_0        
	//   25   55:ireturn         
	}

	public volatile void jumpToCurrentState()
	{
		super.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #631 <Method void ag.jumpToCurrentState()>
	//    2    4:return          
	}

	public Drawable mutate()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			mDelegateDrawable.mutate();
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #634 <Method Drawable Drawable.mutate()>
	//    6   14:pop             
			return ((Drawable) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
		}
		if(!mMutated && super.mutate() == this)
	//*   9   17:aload_0         
	//*  10   18:getfield        #636 <Field boolean mMutated>
	//*  11   21:ifne            52
	//*  12   24:aload_0         
	//*  13   25:invokespecial   #637 <Method Drawable ag.mutate()>
	//*  14   28:aload_0         
	//*  15   29:if_acmpne       52
		{
			mVectorState = new h(mVectorState);
	//   16   32:aload_0         
	//   17   33:new             #24  <Class VectorDrawableCompat$h>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   21   41:invokespecial   #639 <Method void VectorDrawableCompat$h(VectorDrawableCompat$h)>
	//   22   44:putfield        #103 <Field VectorDrawableCompat$h mVectorState>
			mMutated = true;
	//   23   47:aload_0         
	//   24   48:iconst_1        
	//   25   49:putfield        #636 <Field boolean mMutated>
		}
		return ((Drawable) (this));
	//   26   52:aload_0         
	//   27   53:areturn         
	}

	public void onBoundsChange(Rect rect)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			mDelegateDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #643 <Method void Drawable.setBounds(Rect)>
	//    7   15:return          
	}

	protected boolean onStateChange(int ai[])
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setState(ai);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #648 <Method boolean Drawable.setState(int[])>
	//    7   15:ireturn         
		ai = ((int []) (mVectorState));
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   10   20:astore_1        
		if(((h) (ai)).c != null && ((h) (ai)).a != null)
	//*  11   21:aload_1         
	//*  12   22:getfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
	//*  13   25:ifnull          61
	//*  14   28:aload_1         
	//*  15   29:getfield        #112 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$h.a>
	//*  16   32:ifnull          61
		{
			mTintFilter = updateTintFilter(mTintFilter, ((h) (ai)).c, ((h) (ai)).a);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   21   41:aload_1         
	//   22   42:getfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
	//   23   45:aload_1         
	//   24   46:getfield        #112 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$h.a>
	//   25   49:invokevirtual   #116 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   26   52:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
			invalidateSelf();
	//   27   55:aload_0         
	//   28   56:invokevirtual   #649 <Method void invalidateSelf()>
			return true;
	//   29   59:iconst_1        
	//   30   60:ireturn         
		} else
		{
			return false;
	//   31   61:iconst_0        
	//   32   62:ireturn         
		}
	}

	public void scheduleSelf(Runnable runnable, long l)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			mDelegateDrawable.scheduleSelf(runnable, l);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:lload_2         
	//    7   13:invokevirtual   #653 <Method void Drawable.scheduleSelf(Runnable, long)>
			return;
	//    8   16:return          
		} else
		{
			super.scheduleSelf(runnable, l);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:lload_2         
	//   12   20:invokespecial   #654 <Method void ag.scheduleSelf(Runnable, long)>
			return;
	//   13   23:return          
		}
	}

	void setAllowCaching(boolean flag)
	{
		mAllowCaching = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean mAllowCaching>
	//    3    5:return          
	}

	public void setAlpha(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setAlpha(i);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #658 <Method void Drawable.setAlpha(int)>
			return;
	//    7   15:return          
		}
		if(mVectorState.b.getRootAlpha() != i)
	//*   8   16:aload_0         
	//*   9   17:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//*  10   20:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//*  11   23:invokevirtual   #537 <Method int VectorDrawableCompat$b.getRootAlpha()>
	//*  12   26:iload_1         
	//*  13   27:icmpeq          45
		{
			mVectorState.b.setRootAlpha(i);
	//   14   30:aload_0         
	//   15   31:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   16   34:getfield        #208 <Field VectorDrawableCompat$b VectorDrawableCompat$h.b>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #661 <Method void VectorDrawableCompat$b.setRootAlpha(int)>
			invalidateSelf();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #649 <Method void invalidateSelf()>
		}
	//   21   45:return          
	}

	public void setAutoMirrored(boolean flag)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setAutoMirrored(mDelegateDrawable, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #665 <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
			return;
	//    7   15:return          
		} else
		{
			mVectorState.d = flag;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   10   20:iload_1         
	//   11   21:putfield        #396 <Field boolean VectorDrawableCompat$h.d>
			return;
	//   12   24:return          
		}
	}

	public volatile void setChangingConfigurations(int i)
	{
		super.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #668 <Method void ag.setChangingConfigurations(int)>
	//    3    5:return          
	}

	public volatile void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		super.setColorFilter(i, mode);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #672 <Method void ag.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    4    6:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setColorFilter(colorfilter);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #675 <Method void Drawable.setColorFilter(ColorFilter)>
			return;
	//    7   15:return          
		} else
		{
			mColorFilter = colorfilter;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #474 <Field ColorFilter mColorFilter>
			invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #649 <Method void invalidateSelf()>
			return;
	//   13   25:return          
		}
	}

	public volatile void setFilterBitmap(boolean flag)
	{
		super.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #678 <Method void ag.setFilterBitmap(boolean)>
	//    3    5:return          
	}

	public volatile void setHotspot(float f, float f1)
	{
		super.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #681 <Method void ag.setHotspot(float, float)>
	//    4    6:return          
	}

	public volatile void setHotspotBounds(int i, int j, int k, int l)
	{
		super.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #685 <Method void ag.setHotspotBounds(int, int, int, int)>
	//    6    9:return          
	}

	public volatile boolean setState(int ai[])
	{
		return super.setState(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #686 <Method boolean ag.setState(int[])>
	//    3    5:ireturn         
	}

	public void setTint(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTint(mDelegateDrawable, i);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #690 <Method void DrawableCompat.setTint(Drawable, int)>
			return;
	//    7   15:return          
		} else
		{
			setTintList(ColorStateList.valueOf(i));
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokestatic    #693 <Method ColorStateList ColorStateList.valueOf(int)>
	//   11   21:invokevirtual   #697 <Method void setTintList(ColorStateList)>
			return;
	//   12   24:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintList(mDelegateDrawable, colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #700 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			return;
	//    7   15:return          
		}
		h h1 = mVectorState;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   10   20:astore_2        
		if(h1.c != colorstatelist)
	//*  11   21:aload_2         
	//*  12   22:getfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       55
		{
			h1.c = colorstatelist;
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:putfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
			mTintFilter = updateTintFilter(mTintFilter, colorstatelist, h1.a);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:getfield        #112 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$h.a>
	//   25   45:invokevirtual   #116 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   26   48:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
			invalidateSelf();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #649 <Method void invalidateSelf()>
		}
	//   29   55:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintMode(mDelegateDrawable, mode);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #705 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			return;
	//    7   15:return          
		}
		h h1 = mVectorState;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field VectorDrawableCompat$h mVectorState>
	//   10   20:astore_2        
		if(h1.a != mode)
	//*  11   21:aload_2         
	//*  12   22:getfield        #112 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$h.a>
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       55
		{
			h1.a = mode;
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:putfield        #112 <Field android.graphics.PorterDuff$Mode VectorDrawableCompat$h.a>
			mTintFilter = updateTintFilter(mTintFilter, h1.c, mode);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #107 <Field PorterDuffColorFilter mTintFilter>
	//   22   40:aload_2         
	//   23   41:getfield        #110 <Field ColorStateList VectorDrawableCompat$h.c>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #116 <Method PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   26   48:putfield        #107 <Field PorterDuffColorFilter mTintFilter>
			invalidateSelf();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #649 <Method void invalidateSelf()>
		}
	//   29   55:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
			return mDelegateDrawable.setVisible(flag, flag1);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #709 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    8   16:ireturn         
		else
			return super.setVisible(flag, flag1);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:invokespecial   #710 <Method boolean ag.setVisible(boolean, boolean)>
	//   13   23:ireturn         
	}

	public void unscheduleSelf(Runnable runnable)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.unscheduleSelf(runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #714 <Method void Drawable.unscheduleSelf(Runnable)>
			return;
	//    7   15:return          
		} else
		{
			super.unscheduleSelf(runnable);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #715 <Method void ag.unscheduleSelf(Runnable)>
			return;
	//   11   21:return          
		}
	}

	PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter porterduffcolorfilter, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
	{
		if(colorstatelist == null || mode == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          8
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return new PorterDuffColorFilter(colorstatelist.getColorForState(getState(), 0), mode);
	//    6   10:new             #717 <Class PorterDuffColorFilter>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #718 <Method int[] getState()>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #722 <Method int ColorStateList.getColorForState(int[], int)>
	//   13   23:aload_3         
	//   14   24:invokespecial   #724 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   15   27:areturn         
	}

	private static final boolean DBG_VECTOR_DRAWABLE = false;
	static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE;
	private static final int LINECAP_BUTT = 0;
	private static final int LINECAP_ROUND = 1;
	private static final int LINECAP_SQUARE = 2;
	private static final int LINEJOIN_BEVEL = 2;
	private static final int LINEJOIN_MITER = 0;
	private static final int LINEJOIN_ROUND = 1;
	static final String LOGTAG = "VectorDrawableCompat";
	private static final int MAX_CACHED_BITMAP_SIZE = 2048;
	private static final String SHAPE_CLIP_PATH = "clip-path";
	private static final String SHAPE_GROUP = "group";
	private static final String SHAPE_PATH = "path";
	private static final String SHAPE_VECTOR = "vector";
	private boolean mAllowCaching;
	private android.graphics.drawable.Drawable.ConstantState mCachedConstantStateDelegate;
	private ColorFilter mColorFilter;
	private boolean mMutated;
	private PorterDuffColorFilter mTintFilter;
	private final Rect mTmpBounds;
	private final float mTmpFloats[];
	private final Matrix mTmpMatrix;
	private h mVectorState;

	static 
	{
		DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
	//    0    0:getstatic       #80  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #82  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*   2    6:return          
	}
}
