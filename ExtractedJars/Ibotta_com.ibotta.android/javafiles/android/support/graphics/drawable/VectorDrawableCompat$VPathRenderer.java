// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.*;
import android.support.v4.content.res.ComplexColorCompat;
import android.support.v4.util.ArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

private static class VectorDrawableCompat$VPathRenderer
{

	private static float cross(float f, float f1, float f2, float f3)
	{
		return f * f3 - f1 * f2;
	//    0    0:fload_0         
	//    1    1:fload_3         
	//    2    2:fmul            
	//    3    3:fload_1         
	//    4    4:fload_2         
	//    5    5:fmul            
	//    6    6:fsub            
	//    7    7:freturn         
	}

	private void drawGroupTree(VectorDrawableCompat.VGroup vgroup, Matrix matrix, Canvas canvas, int i, int j, ColorFilter colorfilter)
	{
		vgroup.mStackedMatrix.set(matrix);
	//    0    0:aload_1         
	//    1    1:getfield        #99  <Field Matrix VectorDrawableCompat$VGroup.mStackedMatrix>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #103 <Method void Matrix.set(Matrix)>
		vgroup.mStackedMatrix.preConcat(vgroup.mLocalMatrix);
	//    4    8:aload_1         
	//    5    9:getfield        #99  <Field Matrix VectorDrawableCompat$VGroup.mStackedMatrix>
	//    6   12:aload_1         
	//    7   13:getfield        #106 <Field Matrix VectorDrawableCompat$VGroup.mLocalMatrix>
	//    8   16:invokevirtual   #110 <Method boolean Matrix.preConcat(Matrix)>
	//    9   19:pop             
		canvas.save();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #116 <Method int Canvas.save()>
	//   12   24:pop             
		for(int k = 0; k < vgroup.mChildren.size(); k++)
	//*  13   25:iconst_0        
	//*  14   26:istore          7
	//*  15   28:iload           7
	//*  16   30:aload_1         
	//*  17   31:getfield        #120 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//*  18   34:invokevirtual   #125 <Method int ArrayList.size()>
	//*  19   37:icmpge          114
		{
			matrix = ((Matrix) ((VectorDrawableCompat.VObject)vgroup.mChildren.get(k)));
	//   20   40:aload_1         
	//   21   41:getfield        #120 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//   22   44:iload           7
	//   23   46:invokevirtual   #129 <Method Object ArrayList.get(int)>
	//   24   49:checkcast       #131 <Class VectorDrawableCompat$VObject>
	//   25   52:astore_2        
			if(matrix instanceof VectorDrawableCompat.VGroup)
	//*  26   53:aload_2         
	//*  27   54:instanceof      #69  <Class VectorDrawableCompat$VGroup>
	//*  28   57:ifeq            82
			{
				drawGroupTree((VectorDrawableCompat.VGroup)matrix, vgroup.mStackedMatrix, canvas, i, j, colorfilter);
	//   29   60:aload_0         
	//   30   61:aload_2         
	//   31   62:checkcast       #69  <Class VectorDrawableCompat$VGroup>
	//   32   65:aload_1         
	//   33   66:getfield        #99  <Field Matrix VectorDrawableCompat$VGroup.mStackedMatrix>
	//   34   69:aload_3         
	//   35   70:iload           4
	//   36   72:iload           5
	//   37   74:aload           6
	//   38   76:invokespecial   #133 <Method void drawGroupTree(VectorDrawableCompat$VGroup, Matrix, Canvas, int, int, ColorFilter)>
				continue;
	//   39   79:goto            105
			}
			if(matrix instanceof VectorDrawableCompat.VPath)
	//*  40   82:aload_2         
	//*  41   83:instanceof      #135 <Class VectorDrawableCompat$VPath>
	//*  42   86:ifeq            105
				drawPath(vgroup, (VectorDrawableCompat.VPath)matrix, canvas, i, j, colorfilter);
	//   43   89:aload_0         
	//   44   90:aload_1         
	//   45   91:aload_2         
	//   46   92:checkcast       #135 <Class VectorDrawableCompat$VPath>
	//   47   95:aload_3         
	//   48   96:iload           4
	//   49   98:iload           5
	//   50  100:aload           6
	//   51  102:invokespecial   #139 <Method void drawPath(VectorDrawableCompat$VGroup, VectorDrawableCompat$VPath, Canvas, int, int, ColorFilter)>
		}

	//   52  105:iload           7
	//   53  107:iconst_1        
	//   54  108:iadd            
	//   55  109:istore          7
	//*  56  111:goto            28
		canvas.restore();
	//   57  114:aload_3         
	//   58  115:invokevirtual   #142 <Method void Canvas.restore()>
	//   59  118:return          
	}

	private void drawPath(VectorDrawableCompat.VGroup vgroup, VectorDrawableCompat.VPath vpath, Canvas canvas, int i, int j, ColorFilter colorfilter)
	{
		float f1 = (float)i / mViewportWidth;
	//    0    0:iload           4
	//    1    2:i2f             
	//    2    3:aload_0         
	//    3    4:getfield        #54  <Field float mViewportWidth>
	//    4    7:fdiv            
	//    5    8:fstore          8
		float f2 = (float)j / mViewportHeight;
	//    6   10:iload           5
	//    7   12:i2f             
	//    8   13:aload_0         
	//    9   14:getfield        #56  <Field float mViewportHeight>
	//   10   17:fdiv            
	//   11   18:fstore          9
		float f = Math.min(f1, f2);
	//   12   20:fload           8
	//   13   22:fload           9
	//   14   24:invokestatic    #148 <Method float Math.min(float, float)>
	//   15   27:fstore          7
		vgroup = ((VectorDrawableCompat.VGroup) (vgroup.mStackedMatrix));
	//   16   29:aload_1         
	//   17   30:getfield        #99  <Field Matrix VectorDrawableCompat$VGroup.mStackedMatrix>
	//   18   33:astore_1        
		mFinalPathMatrix.set(((Matrix) (vgroup)));
	//   19   34:aload_0         
	//   20   35:getfield        #48  <Field Matrix mFinalPathMatrix>
	//   21   38:aload_1         
	//   22   39:invokevirtual   #103 <Method void Matrix.set(Matrix)>
		mFinalPathMatrix.postScale(f1, f2);
	//   23   42:aload_0         
	//   24   43:getfield        #48  <Field Matrix mFinalPathMatrix>
	//   25   46:fload           8
	//   26   48:fload           9
	//   27   50:invokevirtual   #152 <Method boolean Matrix.postScale(float, float)>
	//   28   53:pop             
		f1 = getMatrixScale(((Matrix) (vgroup)));
	//   29   54:aload_0         
	//   30   55:aload_1         
	//   31   56:invokespecial   #156 <Method float getMatrixScale(Matrix)>
	//   32   59:fstore          8
		if(f1 == 0.0F)
	//*  33   61:fload           8
	//*  34   63:fconst_0        
	//*  35   64:fcmpl           
	//*  36   65:ifne            69
			return;
	//   37   68:return          
		vpath.toPath(mPath);
	//   38   69:aload_2         
	//   39   70:aload_0         
	//   40   71:getfield        #77  <Field Path mPath>
	//   41   74:invokevirtual   #159 <Method void VectorDrawableCompat$VPath.toPath(Path)>
		vgroup = ((VectorDrawableCompat.VGroup) (mPath));
	//   42   77:aload_0         
	//   43   78:getfield        #77  <Field Path mPath>
	//   44   81:astore_1        
		mRenderPath.reset();
	//   45   82:aload_0         
	//   46   83:getfield        #79  <Field Path mRenderPath>
	//   47   86:invokevirtual   #162 <Method void Path.reset()>
		if(vpath.isClipPath())
	//*  48   89:aload_2         
	//*  49   90:invokevirtual   #166 <Method boolean VectorDrawableCompat$VPath.isClipPath()>
	//*  50   93:ifeq            118
		{
			mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
	//   51   96:aload_0         
	//   52   97:getfield        #79  <Field Path mRenderPath>
	//   53  100:aload_1         
	//   54  101:aload_0         
	//   55  102:getfield        #48  <Field Matrix mFinalPathMatrix>
	//   56  105:invokevirtual   #170 <Method void Path.addPath(Path, Matrix)>
			canvas.clipPath(mRenderPath);
	//   57  108:aload_3         
	//   58  109:aload_0         
	//   59  110:getfield        #79  <Field Path mRenderPath>
	//   60  113:invokevirtual   #174 <Method boolean Canvas.clipPath(Path)>
	//   61  116:pop             
			return;
	//   62  117:return          
		}
		vpath = ((VectorDrawableCompat.VPath) ((VectorDrawableCompat.VFullPath)vpath));
	//   63  118:aload_2         
	//   64  119:checkcast       #176 <Class VectorDrawableCompat$VFullPath>
	//   65  122:astore_2        
		if(((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathStart != 0.0F || ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathEnd != 1.0F)
	//*  66  123:aload_2         
	//*  67  124:getfield        #179 <Field float VectorDrawableCompat$VFullPath.mTrimPathStart>
	//*  68  127:fconst_0        
	//*  69  128:fcmpl           
	//*  70  129:ifne            141
	//*  71  132:aload_2         
	//*  72  133:getfield        #182 <Field float VectorDrawableCompat$VFullPath.mTrimPathEnd>
	//*  73  136:fconst_1        
	//*  74  137:fcmpl           
	//*  75  138:ifeq            290
		{
			float f6 = ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathStart;
	//   76  141:aload_2         
	//   77  142:getfield        #179 <Field float VectorDrawableCompat$VFullPath.mTrimPathStart>
	//   78  145:fstore          12
			float f7 = ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathOffset;
	//   79  147:aload_2         
	//   80  148:getfield        #185 <Field float VectorDrawableCompat$VFullPath.mTrimPathOffset>
	//   81  151:fstore          13
			float f4 = ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathEnd;
	//   82  153:aload_2         
	//   83  154:getfield        #182 <Field float VectorDrawableCompat$VFullPath.mTrimPathEnd>
	//   84  157:fstore          10
			float f5 = ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathOffset;
	//   85  159:aload_2         
	//   86  160:getfield        #185 <Field float VectorDrawableCompat$VFullPath.mTrimPathOffset>
	//   87  163:fstore          11
			if(mPathMeasure == null)
	//*  88  165:aload_0         
	//*  89  166:getfield        #187 <Field PathMeasure mPathMeasure>
	//*  90  169:ifnonnull       183
				mPathMeasure = new PathMeasure();
	//   91  172:aload_0         
	//   92  173:new             #189 <Class PathMeasure>
	//   93  176:dup             
	//   94  177:invokespecial   #190 <Method void PathMeasure()>
	//   95  180:putfield        #187 <Field PathMeasure mPathMeasure>
			mPathMeasure.setPath(mPath, false);
	//   96  183:aload_0         
	//   97  184:getfield        #187 <Field PathMeasure mPathMeasure>
	//   98  187:aload_0         
	//   99  188:getfield        #77  <Field Path mPath>
	//  100  191:iconst_0        
	//  101  192:invokevirtual   #194 <Method void PathMeasure.setPath(Path, boolean)>
			float f3 = mPathMeasure.getLength();
	//  102  195:aload_0         
	//  103  196:getfield        #187 <Field PathMeasure mPathMeasure>
	//  104  199:invokevirtual   #198 <Method float PathMeasure.getLength()>
	//  105  202:fstore          9
			f6 = ((f6 + f7) % 1.0F) * f3;
	//  106  204:fload           12
	//  107  206:fload           13
	//  108  208:fadd            
	//  109  209:fconst_1        
	//  110  210:frem            
	//  111  211:fload           9
	//  112  213:fmul            
	//  113  214:fstore          12
			f4 = ((f4 + f5) % 1.0F) * f3;
	//  114  216:fload           10
	//  115  218:fload           11
	//  116  220:fadd            
	//  117  221:fconst_1        
	//  118  222:frem            
	//  119  223:fload           9
	//  120  225:fmul            
	//  121  226:fstore          10
			((Path) (vgroup)).reset();
	//  122  228:aload_1         
	//  123  229:invokevirtual   #162 <Method void Path.reset()>
			if(f6 > f4)
	//* 124  232:fload           12
	//* 125  234:fload           10
	//* 126  236:fcmpl           
	//* 127  237:ifle            270
			{
				mPathMeasure.getSegment(f6, f3, ((Path) (vgroup)), true);
	//  128  240:aload_0         
	//  129  241:getfield        #187 <Field PathMeasure mPathMeasure>
	//  130  244:fload           12
	//  131  246:fload           9
	//  132  248:aload_1         
	//  133  249:iconst_1        
	//  134  250:invokevirtual   #202 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  135  253:pop             
				mPathMeasure.getSegment(0.0F, f4, ((Path) (vgroup)), true);
	//  136  254:aload_0         
	//  137  255:getfield        #187 <Field PathMeasure mPathMeasure>
	//  138  258:fconst_0        
	//  139  259:fload           10
	//  140  261:aload_1         
	//  141  262:iconst_1        
	//  142  263:invokevirtual   #202 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  143  266:pop             
			} else
	//* 144  267:goto            284
			{
				mPathMeasure.getSegment(f6, f4, ((Path) (vgroup)), true);
	//  145  270:aload_0         
	//  146  271:getfield        #187 <Field PathMeasure mPathMeasure>
	//  147  274:fload           12
	//  148  276:fload           10
	//  149  278:aload_1         
	//  150  279:iconst_1        
	//  151  280:invokevirtual   #202 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  152  283:pop             
			}
			((Path) (vgroup)).rLineTo(0.0F, 0.0F);
	//  153  284:aload_1         
	//  154  285:fconst_0        
	//  155  286:fconst_0        
	//  156  287:invokevirtual   #206 <Method void Path.rLineTo(float, float)>
		}
		mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
	//  157  290:aload_0         
	//  158  291:getfield        #79  <Field Path mRenderPath>
	//  159  294:aload_1         
	//  160  295:aload_0         
	//  161  296:getfield        #48  <Field Matrix mFinalPathMatrix>
	//  162  299:invokevirtual   #170 <Method void Path.addPath(Path, Matrix)>
		if(((VectorDrawableCompat.VFullPath) (vpath)).mFillColor.willDraw())
	//* 163  302:aload_2         
	//* 164  303:getfield        #210 <Field ComplexColorCompat VectorDrawableCompat$VFullPath.mFillColor>
	//* 165  306:invokevirtual   #215 <Method boolean ComplexColorCompat.willDraw()>
	//* 166  309:ifeq            461
		{
			vgroup = ((VectorDrawableCompat.VGroup) (((VectorDrawableCompat.VFullPath) (vpath)).mFillColor));
	//  167  312:aload_2         
	//  168  313:getfield        #210 <Field ComplexColorCompat VectorDrawableCompat$VFullPath.mFillColor>
	//  169  316:astore_1        
			if(mFillPaint == null)
	//* 170  317:aload_0         
	//* 171  318:getfield        #217 <Field Paint mFillPaint>
	//* 172  321:ifnonnull       346
			{
				mFillPaint = new Paint(1);
	//  173  324:aload_0         
	//  174  325:new             #219 <Class Paint>
	//  175  328:dup             
	//  176  329:iconst_1        
	//  177  330:invokespecial   #222 <Method void Paint(int)>
	//  178  333:putfield        #217 <Field Paint mFillPaint>
				mFillPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  179  336:aload_0         
	//  180  337:getfield        #217 <Field Paint mFillPaint>
	//  181  340:getstatic       #228 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  182  343:invokevirtual   #232 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			}
			Paint paint = mFillPaint;
	//  183  346:aload_0         
	//  184  347:getfield        #217 <Field Paint mFillPaint>
	//  185  350:astore          14
			if(((ComplexColorCompat) (vgroup)).isGradient())
	//* 186  352:aload_1         
	//* 187  353:invokevirtual   #235 <Method boolean ComplexColorCompat.isGradient()>
	//* 188  356:ifeq            397
			{
				vgroup = ((VectorDrawableCompat.VGroup) (((ComplexColorCompat) (vgroup)).getShader()));
	//  189  359:aload_1         
	//  190  360:invokevirtual   #239 <Method Shader ComplexColorCompat.getShader()>
	//  191  363:astore_1        
				((Shader) (vgroup)).setLocalMatrix(mFinalPathMatrix);
	//  192  364:aload_1         
	//  193  365:aload_0         
	//  194  366:getfield        #48  <Field Matrix mFinalPathMatrix>
	//  195  369:invokevirtual   #244 <Method void Shader.setLocalMatrix(Matrix)>
				paint.setShader(((Shader) (vgroup)));
	//  196  372:aload           14
	//  197  374:aload_1         
	//  198  375:invokevirtual   #248 <Method Shader Paint.setShader(Shader)>
	//  199  378:pop             
				paint.setAlpha(Math.round(((VectorDrawableCompat.VFullPath) (vpath)).mFillAlpha * 255F));
	//  200  379:aload           14
	//  201  381:aload_2         
	//  202  382:getfield        #251 <Field float VectorDrawableCompat$VFullPath.mFillAlpha>
	//  203  385:ldc1            #252 <Float 255F>
	//  204  387:fmul            
	//  205  388:invokestatic    #256 <Method int Math.round(float)>
	//  206  391:invokevirtual   #259 <Method void Paint.setAlpha(int)>
			} else
	//* 207  394:goto            413
			{
				paint.setColor(VectorDrawableCompat.applyAlpha(((ComplexColorCompat) (vgroup)).getColor(), ((VectorDrawableCompat.VFullPath) (vpath)).mFillAlpha));
	//  208  397:aload           14
	//  209  399:aload_1         
	//  210  400:invokevirtual   #262 <Method int ComplexColorCompat.getColor()>
	//  211  403:aload_2         
	//  212  404:getfield        #251 <Field float VectorDrawableCompat$VFullPath.mFillAlpha>
	//  213  407:invokestatic    #266 <Method int VectorDrawableCompat.applyAlpha(int, float)>
	//  214  410:invokevirtual   #269 <Method void Paint.setColor(int)>
			}
			paint.setColorFilter(colorfilter);
	//  215  413:aload           14
	//  216  415:aload           6
	//  217  417:invokevirtual   #273 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//  218  420:pop             
			Path path = mRenderPath;
	//  219  421:aload_0         
	//  220  422:getfield        #79  <Field Path mRenderPath>
	//  221  425:astore          15
			if(((VectorDrawableCompat.VFullPath) (vpath)).mFillRule == 0)
	//* 222  427:aload_2         
	//* 223  428:getfield        #276 <Field int VectorDrawableCompat$VFullPath.mFillRule>
	//* 224  431:ifne            441
				vgroup = ((VectorDrawableCompat.VGroup) (android.graphics.Path.FillType.WINDING));
	//  225  434:getstatic       #282 <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
	//  226  437:astore_1        
			else
	//* 227  438:goto            445
				vgroup = ((VectorDrawableCompat.VGroup) (android.graphics.Path.FillType.EVEN_ODD));
	//  228  441:getstatic       #285 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//  229  444:astore_1        
			path.setFillType(((android.graphics.Path.FillType) (vgroup)));
	//  230  445:aload           15
	//  231  447:aload_1         
	//  232  448:invokevirtual   #289 <Method void Path.setFillType(android.graphics.Path$FillType)>
			canvas.drawPath(mRenderPath, paint);
	//  233  451:aload_3         
	//  234  452:aload_0         
	//  235  453:getfield        #79  <Field Path mRenderPath>
	//  236  456:aload           14
	//  237  458:invokevirtual   #292 <Method void Canvas.drawPath(Path, Paint)>
		}
		if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeColor.willDraw())
	//* 238  461:aload_2         
	//* 239  462:getfield        #295 <Field ComplexColorCompat VectorDrawableCompat$VFullPath.mStrokeColor>
	//* 240  465:invokevirtual   #215 <Method boolean ComplexColorCompat.willDraw()>
	//* 241  468:ifeq            643
		{
			Object obj = ((Object) (((VectorDrawableCompat.VFullPath) (vpath)).mStrokeColor));
	//  242  471:aload_2         
	//  243  472:getfield        #295 <Field ComplexColorCompat VectorDrawableCompat$VFullPath.mStrokeColor>
	//  244  475:astore          14
			if(mStrokePaint == null)
	//* 245  477:aload_0         
	//* 246  478:getfield        #297 <Field Paint mStrokePaint>
	//* 247  481:ifnonnull       506
			{
				mStrokePaint = new Paint(1);
	//  248  484:aload_0         
	//  249  485:new             #219 <Class Paint>
	//  250  488:dup             
	//  251  489:iconst_1        
	//  252  490:invokespecial   #222 <Method void Paint(int)>
	//  253  493:putfield        #297 <Field Paint mStrokePaint>
				mStrokePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//  254  496:aload_0         
	//  255  497:getfield        #297 <Field Paint mStrokePaint>
	//  256  500:getstatic       #300 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  257  503:invokevirtual   #232 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			}
			vgroup = ((VectorDrawableCompat.VGroup) (mStrokePaint));
	//  258  506:aload_0         
	//  259  507:getfield        #297 <Field Paint mStrokePaint>
	//  260  510:astore_1        
			if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineJoin != null)
	//* 261  511:aload_2         
	//* 262  512:getfield        #304 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
	//* 263  515:ifnull          526
				((Paint) (vgroup)).setStrokeJoin(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineJoin);
	//  264  518:aload_1         
	//  265  519:aload_2         
	//  266  520:getfield        #304 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
	//  267  523:invokevirtual   #308 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
			if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineCap != null)
	//* 268  526:aload_2         
	//* 269  527:getfield        #312 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
	//* 270  530:ifnull          541
				((Paint) (vgroup)).setStrokeCap(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineCap);
	//  271  533:aload_1         
	//  272  534:aload_2         
	//  273  535:getfield        #312 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
	//  274  538:invokevirtual   #316 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
			((Paint) (vgroup)).setStrokeMiter(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeMiterlimit);
	//  275  541:aload_1         
	//  276  542:aload_2         
	//  277  543:getfield        #319 <Field float VectorDrawableCompat$VFullPath.mStrokeMiterlimit>
	//  278  546:invokevirtual   #323 <Method void Paint.setStrokeMiter(float)>
			if(((ComplexColorCompat) (obj)).isGradient())
	//* 279  549:aload           14
	//* 280  551:invokevirtual   #235 <Method boolean ComplexColorCompat.isGradient()>
	//* 281  554:ifeq            597
			{
				obj = ((Object) (((ComplexColorCompat) (obj)).getShader()));
	//  282  557:aload           14
	//  283  559:invokevirtual   #239 <Method Shader ComplexColorCompat.getShader()>
	//  284  562:astore          14
				((Shader) (obj)).setLocalMatrix(mFinalPathMatrix);
	//  285  564:aload           14
	//  286  566:aload_0         
	//  287  567:getfield        #48  <Field Matrix mFinalPathMatrix>
	//  288  570:invokevirtual   #244 <Method void Shader.setLocalMatrix(Matrix)>
				((Paint) (vgroup)).setShader(((Shader) (obj)));
	//  289  573:aload_1         
	//  290  574:aload           14
	//  291  576:invokevirtual   #248 <Method Shader Paint.setShader(Shader)>
	//  292  579:pop             
				((Paint) (vgroup)).setAlpha(Math.round(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeAlpha * 255F));
	//  293  580:aload_1         
	//  294  581:aload_2         
	//  295  582:getfield        #326 <Field float VectorDrawableCompat$VFullPath.mStrokeAlpha>
	//  296  585:ldc1            #252 <Float 255F>
	//  297  587:fmul            
	//  298  588:invokestatic    #256 <Method int Math.round(float)>
	//  299  591:invokevirtual   #259 <Method void Paint.setAlpha(int)>
			} else
	//* 300  594:goto            613
			{
				((Paint) (vgroup)).setColor(VectorDrawableCompat.applyAlpha(((ComplexColorCompat) (obj)).getColor(), ((VectorDrawableCompat.VFullPath) (vpath)).mStrokeAlpha));
	//  301  597:aload_1         
	//  302  598:aload           14
	//  303  600:invokevirtual   #262 <Method int ComplexColorCompat.getColor()>
	//  304  603:aload_2         
	//  305  604:getfield        #326 <Field float VectorDrawableCompat$VFullPath.mStrokeAlpha>
	//  306  607:invokestatic    #266 <Method int VectorDrawableCompat.applyAlpha(int, float)>
	//  307  610:invokevirtual   #269 <Method void Paint.setColor(int)>
			}
			((Paint) (vgroup)).setColorFilter(colorfilter);
	//  308  613:aload_1         
	//  309  614:aload           6
	//  310  616:invokevirtual   #273 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//  311  619:pop             
			((Paint) (vgroup)).setStrokeWidth(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeWidth * (f * f1));
	//  312  620:aload_1         
	//  313  621:aload_2         
	//  314  622:getfield        #329 <Field float VectorDrawableCompat$VFullPath.mStrokeWidth>
	//  315  625:fload           7
	//  316  627:fload           8
	//  317  629:fmul            
	//  318  630:fmul            
	//  319  631:invokevirtual   #332 <Method void Paint.setStrokeWidth(float)>
			canvas.drawPath(mRenderPath, ((Paint) (vgroup)));
	//  320  634:aload_3         
	//  321  635:aload_0         
	//  322  636:getfield        #79  <Field Path mRenderPath>
	//  323  639:aload_1         
	//  324  640:invokevirtual   #292 <Method void Canvas.drawPath(Path, Paint)>
		}
	//  325  643:return          
	}

	private float getMatrixScale(Matrix matrix)
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
	//   23   27:invokevirtual   #336 <Method void Matrix.mapVectors(float[])>
		float f = (float)Math.hypot(af[0], af[1]);
	//   24   30:aload           5
	//   25   32:iconst_0        
	//   26   33:faload          
	//   27   34:f2d             
	//   28   35:aload           5
	//   29   37:iconst_1        
	//   30   38:faload          
	//   31   39:f2d             
	//   32   40:invokestatic    #340 <Method double Math.hypot(double, double)>
	//   33   43:d2f             
	//   34   44:fstore_2        
		float f2 = (float)Math.hypot(af[2], af[3]);
	//   35   45:aload           5
	//   36   47:iconst_2        
	//   37   48:faload          
	//   38   49:f2d             
	//   39   50:aload           5
	//   40   52:iconst_3        
	//   41   53:faload          
	//   42   54:f2d             
	//   43   55:invokestatic    #340 <Method double Math.hypot(double, double)>
	//   44   58:d2f             
	//   45   59:fstore          4
		float f1 = cross(af[0], af[1], af[2], af[3]);
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
	//   58   77:invokestatic    #342 <Method float cross(float, float, float, float)>
	//   59   80:fstore_3        
		f2 = Math.max(f, f2);
	//   60   81:fload_2         
	//   61   82:fload           4
	//   62   84:invokestatic    #345 <Method float Math.max(float, float)>
	//   63   87:fstore          4
		f = 0.0F;
	//   64   89:fconst_0        
	//   65   90:fstore_2        
		if(f2 > 0.0F)
	//*  66   91:fload           4
	//*  67   93:fconst_0        
	//*  68   94:fcmpl           
	//*  69   95:ifle            106
			f = Math.abs(f1) / f2;
	//   70   98:fload_3         
	//   71   99:invokestatic    #349 <Method float Math.abs(float)>
	//   72  102:fload           4
	//   73  104:fdiv            
	//   74  105:fstore_2        
		return f;
	//   75  106:fload_2         
	//   76  107:freturn         
	}

	public void draw(Canvas canvas, int i, int j, ColorFilter colorfilter)
	{
		drawGroupTree(mRootGroup, IDENTITY_MATRIX, canvas, i, j, colorfilter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
	//    3    5:getstatic       #44  <Field Matrix IDENTITY_MATRIX>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #133 <Method void drawGroupTree(VectorDrawableCompat$VGroup, Matrix, Canvas, int, int, ColorFilter)>
	//    9   16:return          
	}

	public float getAlpha()
	{
		return (float)getRootAlpha() / 255F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #355 <Method int getRootAlpha()>
	//    2    4:i2f             
	//    3    5:ldc1            #252 <Float 255F>
	//    4    7:fdiv            
	//    5    8:freturn         
	}

	public int getRootAlpha()
	{
		return mRootAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int mRootAlpha>
	//    2    4:ireturn         
	}

	public boolean isStateful()
	{
		if(mIsStateful == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field Boolean mIsStateful>
	//*   2    4:ifnonnull       21
			mIsStateful = Boolean.valueOf(mRootGroup.isStateful());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
	//    6   12:invokevirtual   #358 <Method boolean VectorDrawableCompat$VGroup.isStateful()>
	//    7   15:invokestatic    #364 <Method Boolean Boolean.valueOf(boolean)>
	//    8   18:putfield        #62  <Field Boolean mIsStateful>
		return mIsStateful.booleanValue();
	//    9   21:aload_0         
	//   10   22:getfield        #62  <Field Boolean mIsStateful>
	//   11   25:invokevirtual   #367 <Method boolean Boolean.booleanValue()>
	//   12   28:ireturn         
	}

	public boolean onStateChanged(int ai[])
	{
		return mRootGroup.onStateChanged(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #371 <Method boolean VectorDrawableCompat$VGroup.onStateChanged(int[])>
	//    4    8:ireturn         
	}

	public void setAlpha(float f)
	{
		setRootAlpha((int)(f * 255F));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #252 <Float 255F>
	//    3    4:fmul            
	//    4    5:f2i             
	//    5    6:invokevirtual   #374 <Method void setRootAlpha(int)>
	//    6    9:return          
	}

	public void setRootAlpha(int i)
	{
		mRootAlpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int mRootAlpha>
	//    3    5:return          
	}

	private static final Matrix IDENTITY_MATRIX = new Matrix();
	float mBaseHeight;
	float mBaseWidth;
	private int mChangingConfigurations;
	Paint mFillPaint;
	private final Matrix mFinalPathMatrix;
	Boolean mIsStateful;
	private final Path mPath;
	private PathMeasure mPathMeasure;
	private final Path mRenderPath;
	int mRootAlpha;
	final VectorDrawableCompat.VGroup mRootGroup;
	String mRootName;
	Paint mStrokePaint;
	final ArrayMap mVGTargetsMap;
	float mViewportHeight;
	float mViewportWidth;

	static 
	{
	//    0    0:new             #39  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void Matrix()>
	//    3    7:putstatic       #44  <Field Matrix IDENTITY_MATRIX>
	//*   4   10:return          
	}

	public VectorDrawableCompat$VPathRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		mFinalPathMatrix = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #39  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void Matrix()>
	//    6   12:putfield        #48  <Field Matrix mFinalPathMatrix>
		mBaseWidth = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #50  <Field float mBaseWidth>
		mBaseHeight = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #52  <Field float mBaseHeight>
		mViewportWidth = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #54  <Field float mViewportWidth>
		mViewportHeight = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #56  <Field float mViewportHeight>
		mRootAlpha = 255;
	//   19   35:aload_0         
	//   20   36:sipush          255
	//   21   39:putfield        #58  <Field int mRootAlpha>
		mRootName = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #60  <Field String mRootName>
		mIsStateful = null;
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:putfield        #62  <Field Boolean mIsStateful>
		mVGTargetsMap = new ArrayMap();
	//   28   52:aload_0         
	//   29   53:new             #64  <Class ArrayMap>
	//   30   56:dup             
	//   31   57:invokespecial   #65  <Method void ArrayMap()>
	//   32   60:putfield        #67  <Field ArrayMap mVGTargetsMap>
		mRootGroup = new VectorDrawableCompat.VGroup();
	//   33   63:aload_0         
	//   34   64:new             #69  <Class VectorDrawableCompat$VGroup>
	//   35   67:dup             
	//   36   68:invokespecial   #70  <Method void VectorDrawableCompat$VGroup()>
	//   37   71:putfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
		mPath = new Path();
	//   38   74:aload_0         
	//   39   75:new             #74  <Class Path>
	//   40   78:dup             
	//   41   79:invokespecial   #75  <Method void Path()>
	//   42   82:putfield        #77  <Field Path mPath>
		mRenderPath = new Path();
	//   43   85:aload_0         
	//   44   86:new             #74  <Class Path>
	//   45   89:dup             
	//   46   90:invokespecial   #75  <Method void Path()>
	//   47   93:putfield        #79  <Field Path mRenderPath>
	//   48   96:return          
	}

	public VectorDrawableCompat$VPathRenderer(VectorDrawableCompat$VPathRenderer vectordrawablecompat$vpathrenderer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		mFinalPathMatrix = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #39  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void Matrix()>
	//    6   12:putfield        #48  <Field Matrix mFinalPathMatrix>
		mBaseWidth = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #50  <Field float mBaseWidth>
		mBaseHeight = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #52  <Field float mBaseHeight>
		mViewportWidth = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #54  <Field float mViewportWidth>
		mViewportHeight = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #56  <Field float mViewportHeight>
		mRootAlpha = 255;
	//   19   35:aload_0         
	//   20   36:sipush          255
	//   21   39:putfield        #58  <Field int mRootAlpha>
		mRootName = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #60  <Field String mRootName>
		mIsStateful = null;
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:putfield        #62  <Field Boolean mIsStateful>
		mVGTargetsMap = new ArrayMap();
	//   28   52:aload_0         
	//   29   53:new             #64  <Class ArrayMap>
	//   30   56:dup             
	//   31   57:invokespecial   #65  <Method void ArrayMap()>
	//   32   60:putfield        #67  <Field ArrayMap mVGTargetsMap>
		mRootGroup = new VectorDrawableCompat.VGroup(vectordrawablecompat$vpathrenderer.mRootGroup, mVGTargetsMap);
	//   33   63:aload_0         
	//   34   64:new             #69  <Class VectorDrawableCompat$VGroup>
	//   35   67:dup             
	//   36   68:aload_1         
	//   37   69:getfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
	//   38   72:aload_0         
	//   39   73:getfield        #67  <Field ArrayMap mVGTargetsMap>
	//   40   76:invokespecial   #83  <Method void VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup, ArrayMap)>
	//   41   79:putfield        #72  <Field VectorDrawableCompat$VGroup mRootGroup>
		mPath = new Path(vectordrawablecompat$vpathrenderer.mPath);
	//   42   82:aload_0         
	//   43   83:new             #74  <Class Path>
	//   44   86:dup             
	//   45   87:aload_1         
	//   46   88:getfield        #77  <Field Path mPath>
	//   47   91:invokespecial   #86  <Method void Path(Path)>
	//   48   94:putfield        #77  <Field Path mPath>
		mRenderPath = new Path(vectordrawablecompat$vpathrenderer.mRenderPath);
	//   49   97:aload_0         
	//   50   98:new             #74  <Class Path>
	//   51  101:dup             
	//   52  102:aload_1         
	//   53  103:getfield        #79  <Field Path mRenderPath>
	//   54  106:invokespecial   #86  <Method void Path(Path)>
	//   55  109:putfield        #79  <Field Path mRenderPath>
		mBaseWidth = vectordrawablecompat$vpathrenderer.mBaseWidth;
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:getfield        #50  <Field float mBaseWidth>
	//   59  117:putfield        #50  <Field float mBaseWidth>
		mBaseHeight = vectordrawablecompat$vpathrenderer.mBaseHeight;
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:getfield        #52  <Field float mBaseHeight>
	//   63  125:putfield        #52  <Field float mBaseHeight>
		mViewportWidth = vectordrawablecompat$vpathrenderer.mViewportWidth;
	//   64  128:aload_0         
	//   65  129:aload_1         
	//   66  130:getfield        #54  <Field float mViewportWidth>
	//   67  133:putfield        #54  <Field float mViewportWidth>
		mViewportHeight = vectordrawablecompat$vpathrenderer.mViewportHeight;
	//   68  136:aload_0         
	//   69  137:aload_1         
	//   70  138:getfield        #56  <Field float mViewportHeight>
	//   71  141:putfield        #56  <Field float mViewportHeight>
		mChangingConfigurations = vectordrawablecompat$vpathrenderer.mChangingConfigurations;
	//   72  144:aload_0         
	//   73  145:aload_1         
	//   74  146:getfield        #88  <Field int mChangingConfigurations>
	//   75  149:putfield        #88  <Field int mChangingConfigurations>
		mRootAlpha = vectordrawablecompat$vpathrenderer.mRootAlpha;
	//   76  152:aload_0         
	//   77  153:aload_1         
	//   78  154:getfield        #58  <Field int mRootAlpha>
	//   79  157:putfield        #58  <Field int mRootAlpha>
		mRootName = vectordrawablecompat$vpathrenderer.mRootName;
	//   80  160:aload_0         
	//   81  161:aload_1         
	//   82  162:getfield        #60  <Field String mRootName>
	//   83  165:putfield        #60  <Field String mRootName>
		String s = vectordrawablecompat$vpathrenderer.mRootName;
	//   84  168:aload_1         
	//   85  169:getfield        #60  <Field String mRootName>
	//   86  172:astore_2        
		if(s != null)
	//*  87  173:aload_2         
	//*  88  174:ifnull          187
			mVGTargetsMap.put(((Object) (s)), ((Object) (this)));
	//   89  177:aload_0         
	//   90  178:getfield        #67  <Field ArrayMap mVGTargetsMap>
	//   91  181:aload_2         
	//   92  182:aload_0         
	//   93  183:invokevirtual   #92  <Method Object ArrayMap.put(Object, Object)>
	//   94  186:pop             
		mIsStateful = vectordrawablecompat$vpathrenderer.mIsStateful;
	//   95  187:aload_0         
	//   96  188:aload_1         
	//   97  189:getfield        #62  <Field Boolean mIsStateful>
	//   98  192:putfield        #62  <Field Boolean mIsStateful>
	//   99  195:return          
	}
}
