// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.*;
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
		VectorDrawableCompat.VGroup.access$200(vgroup).set(matrix);
	//    0    0:aload_1         
	//    1    1:invokestatic    #106 <Method Matrix VectorDrawableCompat$VGroup.access$200(VectorDrawableCompat$VGroup)>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #110 <Method void Matrix.set(Matrix)>
		VectorDrawableCompat.VGroup.access$200(vgroup).preConcat(VectorDrawableCompat.VGroup.access$300(vgroup));
	//    4    8:aload_1         
	//    5    9:invokestatic    #106 <Method Matrix VectorDrawableCompat$VGroup.access$200(VectorDrawableCompat$VGroup)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #113 <Method Matrix VectorDrawableCompat$VGroup.access$300(VectorDrawableCompat$VGroup)>
	//    8   16:invokevirtual   #117 <Method boolean Matrix.preConcat(Matrix)>
	//    9   19:pop             
		canvas.save();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #123 <Method int Canvas.save()>
	//   12   24:pop             
		for(int k = 0; k < vgroup.mChildren.size(); k++)
	//*  13   25:iconst_0        
	//*  14   26:istore          7
	//*  15   28:iload           7
	//*  16   30:aload_1         
	//*  17   31:getfield        #127 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//*  18   34:invokevirtual   #132 <Method int ArrayList.size()>
	//*  19   37:icmpge          111
		{
			matrix = ((Matrix) (vgroup.mChildren.get(k)));
	//   20   40:aload_1         
	//   21   41:getfield        #127 <Field ArrayList VectorDrawableCompat$VGroup.mChildren>
	//   22   44:iload           7
	//   23   46:invokevirtual   #136 <Method Object ArrayList.get(int)>
	//   24   49:astore_2        
			if(matrix instanceof VectorDrawableCompat.VGroup)
	//*  25   50:aload_2         
	//*  26   51:instanceof      #65  <Class VectorDrawableCompat$VGroup>
	//*  27   54:ifeq            79
			{
				drawGroupTree((VectorDrawableCompat.VGroup)matrix, VectorDrawableCompat.VGroup.access$200(vgroup), canvas, i, j, colorfilter);
	//   28   57:aload_0         
	//   29   58:aload_2         
	//   30   59:checkcast       #65  <Class VectorDrawableCompat$VGroup>
	//   31   62:aload_1         
	//   32   63:invokestatic    #106 <Method Matrix VectorDrawableCompat$VGroup.access$200(VectorDrawableCompat$VGroup)>
	//   33   66:aload_3         
	//   34   67:iload           4
	//   35   69:iload           5
	//   36   71:aload           6
	//   37   73:invokespecial   #138 <Method void drawGroupTree(VectorDrawableCompat$VGroup, Matrix, Canvas, int, int, ColorFilter)>
				continue;
	//   38   76:goto            102
			}
			if(matrix instanceof VectorDrawableCompat.VPath)
	//*  39   79:aload_2         
	//*  40   80:instanceof      #140 <Class VectorDrawableCompat$VPath>
	//*  41   83:ifeq            102
				drawPath(vgroup, (VectorDrawableCompat.VPath)matrix, canvas, i, j, colorfilter);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:aload_2         
	//   45   89:checkcast       #140 <Class VectorDrawableCompat$VPath>
	//   46   92:aload_3         
	//   47   93:iload           4
	//   48   95:iload           5
	//   49   97:aload           6
	//   50   99:invokespecial   #144 <Method void drawPath(VectorDrawableCompat$VGroup, VectorDrawableCompat$VPath, Canvas, int, int, ColorFilter)>
		}

	//   51  102:iload           7
	//   52  104:iconst_1        
	//   53  105:iadd            
	//   54  106:istore          7
	//*  55  108:goto            28
		canvas.restore();
	//   56  111:aload_3         
	//   57  112:invokevirtual   #147 <Method void Canvas.restore()>
	//   58  115:return          
	}

	private void drawPath(VectorDrawableCompat.VGroup vgroup, VectorDrawableCompat.VPath vpath, Canvas canvas, int i, int j, ColorFilter colorfilter)
	{
		float f1 = (float)i / mViewportWidth;
	//    0    0:iload           4
	//    1    2:i2f             
	//    2    3:aload_0         
	//    3    4:getfield        #52  <Field float mViewportWidth>
	//    4    7:fdiv            
	//    5    8:fstore          8
		float f2 = (float)j / mViewportHeight;
	//    6   10:iload           5
	//    7   12:i2f             
	//    8   13:aload_0         
	//    9   14:getfield        #54  <Field float mViewportHeight>
	//   10   17:fdiv            
	//   11   18:fstore          9
		float f = Math.min(f1, f2);
	//   12   20:fload           8
	//   13   22:fload           9
	//   14   24:invokestatic    #153 <Method float Math.min(float, float)>
	//   15   27:fstore          7
		vgroup = ((VectorDrawableCompat.VGroup) (VectorDrawableCompat.VGroup.access$200(vgroup)));
	//   16   29:aload_1         
	//   17   30:invokestatic    #106 <Method Matrix VectorDrawableCompat$VGroup.access$200(VectorDrawableCompat$VGroup)>
	//   18   33:astore_1        
		mFinalPathMatrix.set(((Matrix) (vgroup)));
	//   19   34:aload_0         
	//   20   35:getfield        #46  <Field Matrix mFinalPathMatrix>
	//   21   38:aload_1         
	//   22   39:invokevirtual   #110 <Method void Matrix.set(Matrix)>
		mFinalPathMatrix.postScale(f1, f2);
	//   23   42:aload_0         
	//   24   43:getfield        #46  <Field Matrix mFinalPathMatrix>
	//   25   46:fload           8
	//   26   48:fload           9
	//   27   50:invokevirtual   #157 <Method boolean Matrix.postScale(float, float)>
	//   28   53:pop             
		f1 = getMatrixScale(((Matrix) (vgroup)));
	//   29   54:aload_0         
	//   30   55:aload_1         
	//   31   56:invokespecial   #161 <Method float getMatrixScale(Matrix)>
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
	//   40   71:getfield        #73  <Field Path mPath>
	//   41   74:invokevirtual   #164 <Method void VectorDrawableCompat$VPath.toPath(Path)>
		vgroup = ((VectorDrawableCompat.VGroup) (mPath));
	//   42   77:aload_0         
	//   43   78:getfield        #73  <Field Path mPath>
	//   44   81:astore_1        
		mRenderPath.reset();
	//   45   82:aload_0         
	//   46   83:getfield        #75  <Field Path mRenderPath>
	//   47   86:invokevirtual   #167 <Method void Path.reset()>
		if(vpath.isClipPath())
	//*  48   89:aload_2         
	//*  49   90:invokevirtual   #171 <Method boolean VectorDrawableCompat$VPath.isClipPath()>
	//*  50   93:ifeq            118
		{
			mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
	//   51   96:aload_0         
	//   52   97:getfield        #75  <Field Path mRenderPath>
	//   53  100:aload_1         
	//   54  101:aload_0         
	//   55  102:getfield        #46  <Field Matrix mFinalPathMatrix>
	//   56  105:invokevirtual   #175 <Method void Path.addPath(Path, Matrix)>
			canvas.clipPath(mRenderPath);
	//   57  108:aload_3         
	//   58  109:aload_0         
	//   59  110:getfield        #75  <Field Path mRenderPath>
	//   60  113:invokevirtual   #179 <Method boolean Canvas.clipPath(Path)>
	//   61  116:pop             
			return;
	//   62  117:return          
		}
		vpath = ((VectorDrawableCompat.VPath) ((VectorDrawableCompat.VFullPath)vpath));
	//   63  118:aload_2         
	//   64  119:checkcast       #181 <Class VectorDrawableCompat$VFullPath>
	//   65  122:astore_2        
		if(((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathStart != 0.0F || ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathEnd != 1.0F)
	//*  66  123:aload_2         
	//*  67  124:getfield        #184 <Field float VectorDrawableCompat$VFullPath.mTrimPathStart>
	//*  68  127:fconst_0        
	//*  69  128:fcmpl           
	//*  70  129:ifne            141
	//*  71  132:aload_2         
	//*  72  133:getfield        #187 <Field float VectorDrawableCompat$VFullPath.mTrimPathEnd>
	//*  73  136:fconst_1        
	//*  74  137:fcmpl           
	//*  75  138:ifeq            290
		{
			float f6 = ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathStart;
	//   76  141:aload_2         
	//   77  142:getfield        #184 <Field float VectorDrawableCompat$VFullPath.mTrimPathStart>
	//   78  145:fstore          12
			float f7 = ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathOffset;
	//   79  147:aload_2         
	//   80  148:getfield        #190 <Field float VectorDrawableCompat$VFullPath.mTrimPathOffset>
	//   81  151:fstore          13
			float f4 = ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathEnd;
	//   82  153:aload_2         
	//   83  154:getfield        #187 <Field float VectorDrawableCompat$VFullPath.mTrimPathEnd>
	//   84  157:fstore          10
			float f5 = ((VectorDrawableCompat.VFullPath) (vpath)).mTrimPathOffset;
	//   85  159:aload_2         
	//   86  160:getfield        #190 <Field float VectorDrawableCompat$VFullPath.mTrimPathOffset>
	//   87  163:fstore          11
			if(mPathMeasure == null)
	//*  88  165:aload_0         
	//*  89  166:getfield        #192 <Field PathMeasure mPathMeasure>
	//*  90  169:ifnonnull       183
				mPathMeasure = new PathMeasure();
	//   91  172:aload_0         
	//   92  173:new             #194 <Class PathMeasure>
	//   93  176:dup             
	//   94  177:invokespecial   #195 <Method void PathMeasure()>
	//   95  180:putfield        #192 <Field PathMeasure mPathMeasure>
			mPathMeasure.setPath(mPath, false);
	//   96  183:aload_0         
	//   97  184:getfield        #192 <Field PathMeasure mPathMeasure>
	//   98  187:aload_0         
	//   99  188:getfield        #73  <Field Path mPath>
	//  100  191:iconst_0        
	//  101  192:invokevirtual   #199 <Method void PathMeasure.setPath(Path, boolean)>
			float f3 = mPathMeasure.getLength();
	//  102  195:aload_0         
	//  103  196:getfield        #192 <Field PathMeasure mPathMeasure>
	//  104  199:invokevirtual   #203 <Method float PathMeasure.getLength()>
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
	//  123  229:invokevirtual   #167 <Method void Path.reset()>
			if(f6 > f4)
	//* 124  232:fload           12
	//* 125  234:fload           10
	//* 126  236:fcmpl           
	//* 127  237:ifle            270
			{
				mPathMeasure.getSegment(f6, f3, ((Path) (vgroup)), true);
	//  128  240:aload_0         
	//  129  241:getfield        #192 <Field PathMeasure mPathMeasure>
	//  130  244:fload           12
	//  131  246:fload           9
	//  132  248:aload_1         
	//  133  249:iconst_1        
	//  134  250:invokevirtual   #207 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  135  253:pop             
				mPathMeasure.getSegment(0.0F, f4, ((Path) (vgroup)), true);
	//  136  254:aload_0         
	//  137  255:getfield        #192 <Field PathMeasure mPathMeasure>
	//  138  258:fconst_0        
	//  139  259:fload           10
	//  140  261:aload_1         
	//  141  262:iconst_1        
	//  142  263:invokevirtual   #207 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  143  266:pop             
			} else
	//* 144  267:goto            284
			{
				mPathMeasure.getSegment(f6, f4, ((Path) (vgroup)), true);
	//  145  270:aload_0         
	//  146  271:getfield        #192 <Field PathMeasure mPathMeasure>
	//  147  274:fload           12
	//  148  276:fload           10
	//  149  278:aload_1         
	//  150  279:iconst_1        
	//  151  280:invokevirtual   #207 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  152  283:pop             
			}
			((Path) (vgroup)).rLineTo(0.0F, 0.0F);
	//  153  284:aload_1         
	//  154  285:fconst_0        
	//  155  286:fconst_0        
	//  156  287:invokevirtual   #211 <Method void Path.rLineTo(float, float)>
		}
		mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
	//  157  290:aload_0         
	//  158  291:getfield        #75  <Field Path mRenderPath>
	//  159  294:aload_1         
	//  160  295:aload_0         
	//  161  296:getfield        #46  <Field Matrix mFinalPathMatrix>
	//  162  299:invokevirtual   #175 <Method void Path.addPath(Path, Matrix)>
		if(((VectorDrawableCompat.VFullPath) (vpath)).mFillColor != 0)
	//* 163  302:aload_2         
	//* 164  303:getfield        #214 <Field int VectorDrawableCompat$VFullPath.mFillColor>
	//* 165  306:ifeq            415
		{
			if(mFillPaint == null)
	//* 166  309:aload_0         
	//* 167  310:getfield        #92  <Field Paint mFillPaint>
	//* 168  313:ifnonnull       345
			{
				mFillPaint = new Paint();
	//  169  316:aload_0         
	//  170  317:new             #216 <Class Paint>
	//  171  320:dup             
	//  172  321:invokespecial   #217 <Method void Paint()>
	//  173  324:putfield        #92  <Field Paint mFillPaint>
				mFillPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  174  327:aload_0         
	//  175  328:getfield        #92  <Field Paint mFillPaint>
	//  176  331:getstatic       #223 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  177  334:invokevirtual   #227 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				mFillPaint.setAntiAlias(true);
	//  178  337:aload_0         
	//  179  338:getfield        #92  <Field Paint mFillPaint>
	//  180  341:iconst_1        
	//  181  342:invokevirtual   #231 <Method void Paint.setAntiAlias(boolean)>
			}
			Paint paint = mFillPaint;
	//  182  345:aload_0         
	//  183  346:getfield        #92  <Field Paint mFillPaint>
	//  184  349:astore          14
			paint.setColor(VectorDrawableCompat.applyAlpha(((VectorDrawableCompat.VFullPath) (vpath)).mFillColor, ((VectorDrawableCompat.VFullPath) (vpath)).mFillAlpha));
	//  185  351:aload           14
	//  186  353:aload_2         
	//  187  354:getfield        #214 <Field int VectorDrawableCompat$VFullPath.mFillColor>
	//  188  357:aload_2         
	//  189  358:getfield        #234 <Field float VectorDrawableCompat$VFullPath.mFillAlpha>
	//  190  361:invokestatic    #238 <Method int VectorDrawableCompat.applyAlpha(int, float)>
	//  191  364:invokevirtual   #242 <Method void Paint.setColor(int)>
			paint.setColorFilter(colorfilter);
	//  192  367:aload           14
	//  193  369:aload           6
	//  194  371:invokevirtual   #246 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//  195  374:pop             
			Path path = mRenderPath;
	//  196  375:aload_0         
	//  197  376:getfield        #75  <Field Path mRenderPath>
	//  198  379:astore          15
			if(((VectorDrawableCompat.VFullPath) (vpath)).mFillRule == 0)
	//* 199  381:aload_2         
	//* 200  382:getfield        #249 <Field int VectorDrawableCompat$VFullPath.mFillRule>
	//* 201  385:ifne            395
				vgroup = ((VectorDrawableCompat.VGroup) (android.graphics.Path.FillType.WINDING));
	//  202  388:getstatic       #255 <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
	//  203  391:astore_1        
			else
	//* 204  392:goto            399
				vgroup = ((VectorDrawableCompat.VGroup) (android.graphics.Path.FillType.EVEN_ODD));
	//  205  395:getstatic       #258 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//  206  398:astore_1        
			path.setFillType(((android.graphics.Path.FillType) (vgroup)));
	//  207  399:aload           15
	//  208  401:aload_1         
	//  209  402:invokevirtual   #262 <Method void Path.setFillType(android.graphics.Path$FillType)>
			canvas.drawPath(mRenderPath, paint);
	//  210  405:aload_3         
	//  211  406:aload_0         
	//  212  407:getfield        #75  <Field Path mRenderPath>
	//  213  410:aload           14
	//  214  412:invokevirtual   #265 <Method void Canvas.drawPath(Path, Paint)>
		}
		if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeColor != 0)
	//* 215  415:aload_2         
	//* 216  416:getfield        #268 <Field int VectorDrawableCompat$VFullPath.mStrokeColor>
	//* 217  419:ifeq            546
		{
			if(mStrokePaint == null)
	//* 218  422:aload_0         
	//* 219  423:getfield        #97  <Field Paint mStrokePaint>
	//* 220  426:ifnonnull       458
			{
				mStrokePaint = new Paint();
	//  221  429:aload_0         
	//  222  430:new             #216 <Class Paint>
	//  223  433:dup             
	//  224  434:invokespecial   #217 <Method void Paint()>
	//  225  437:putfield        #97  <Field Paint mStrokePaint>
				mStrokePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//  226  440:aload_0         
	//  227  441:getfield        #97  <Field Paint mStrokePaint>
	//  228  444:getstatic       #271 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  229  447:invokevirtual   #227 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				mStrokePaint.setAntiAlias(true);
	//  230  450:aload_0         
	//  231  451:getfield        #97  <Field Paint mStrokePaint>
	//  232  454:iconst_1        
	//  233  455:invokevirtual   #231 <Method void Paint.setAntiAlias(boolean)>
			}
			vgroup = ((VectorDrawableCompat.VGroup) (mStrokePaint));
	//  234  458:aload_0         
	//  235  459:getfield        #97  <Field Paint mStrokePaint>
	//  236  462:astore_1        
			if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineJoin != null)
	//* 237  463:aload_2         
	//* 238  464:getfield        #275 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
	//* 239  467:ifnull          478
				((Paint) (vgroup)).setStrokeJoin(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineJoin);
	//  240  470:aload_1         
	//  241  471:aload_2         
	//  242  472:getfield        #275 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
	//  243  475:invokevirtual   #279 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
			if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineCap != null)
	//* 244  478:aload_2         
	//* 245  479:getfield        #283 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
	//* 246  482:ifnull          493
				((Paint) (vgroup)).setStrokeCap(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineCap);
	//  247  485:aload_1         
	//  248  486:aload_2         
	//  249  487:getfield        #283 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
	//  250  490:invokevirtual   #287 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
			((Paint) (vgroup)).setStrokeMiter(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeMiterlimit);
	//  251  493:aload_1         
	//  252  494:aload_2         
	//  253  495:getfield        #290 <Field float VectorDrawableCompat$VFullPath.mStrokeMiterlimit>
	//  254  498:invokevirtual   #294 <Method void Paint.setStrokeMiter(float)>
			((Paint) (vgroup)).setColor(VectorDrawableCompat.applyAlpha(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeColor, ((VectorDrawableCompat.VFullPath) (vpath)).mStrokeAlpha));
	//  255  501:aload_1         
	//  256  502:aload_2         
	//  257  503:getfield        #268 <Field int VectorDrawableCompat$VFullPath.mStrokeColor>
	//  258  506:aload_2         
	//  259  507:getfield        #297 <Field float VectorDrawableCompat$VFullPath.mStrokeAlpha>
	//  260  510:invokestatic    #238 <Method int VectorDrawableCompat.applyAlpha(int, float)>
	//  261  513:invokevirtual   #242 <Method void Paint.setColor(int)>
			((Paint) (vgroup)).setColorFilter(colorfilter);
	//  262  516:aload_1         
	//  263  517:aload           6
	//  264  519:invokevirtual   #246 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//  265  522:pop             
			((Paint) (vgroup)).setStrokeWidth(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeWidth * (f * f1));
	//  266  523:aload_1         
	//  267  524:aload_2         
	//  268  525:getfield        #300 <Field float VectorDrawableCompat$VFullPath.mStrokeWidth>
	//  269  528:fload           7
	//  270  530:fload           8
	//  271  532:fmul            
	//  272  533:fmul            
	//  273  534:invokevirtual   #303 <Method void Paint.setStrokeWidth(float)>
			canvas.drawPath(mRenderPath, ((Paint) (vgroup)));
	//  274  537:aload_3         
	//  275  538:aload_0         
	//  276  539:getfield        #75  <Field Path mRenderPath>
	//  277  542:aload_1         
	//  278  543:invokevirtual   #265 <Method void Canvas.drawPath(Path, Paint)>
		}
	//  279  546:return          
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
	//   23   27:invokevirtual   #307 <Method void Matrix.mapVectors(float[])>
		float f = (float)Math.hypot(af[0], af[1]);
	//   24   30:aload           5
	//   25   32:iconst_0        
	//   26   33:faload          
	//   27   34:f2d             
	//   28   35:aload           5
	//   29   37:iconst_1        
	//   30   38:faload          
	//   31   39:f2d             
	//   32   40:invokestatic    #311 <Method double Math.hypot(double, double)>
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
	//   43   55:invokestatic    #311 <Method double Math.hypot(double, double)>
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
	//   58   77:invokestatic    #313 <Method float cross(float, float, float, float)>
	//   59   80:fstore_3        
		f2 = Math.max(f, f2);
	//   60   81:fload_2         
	//   61   82:fload           4
	//   62   84:invokestatic    #316 <Method float Math.max(float, float)>
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
	//   71   99:invokestatic    #320 <Method float Math.abs(float)>
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
	//    2    2:getfield        #68  <Field VectorDrawableCompat$VGroup mRootGroup>
	//    3    5:getstatic       #42  <Field Matrix IDENTITY_MATRIX>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #138 <Method void drawGroupTree(VectorDrawableCompat$VGroup, Matrix, Canvas, int, int, ColorFilter)>
	//    9   16:return          
	}

	public float getAlpha()
	{
		return (float)getRootAlpha() / 255F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #326 <Method int getRootAlpha()>
	//    2    4:i2f             
	//    3    5:ldc2            #327 <Float 255F>
	//    4    8:fdiv            
	//    5    9:freturn         
	}

	public int getRootAlpha()
	{
		return mRootAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int mRootAlpha>
	//    2    4:ireturn         
	}

	public void setAlpha(float f)
	{
		setRootAlpha((int)(f * 255F));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc2            #327 <Float 255F>
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:invokevirtual   #331 <Method void setRootAlpha(int)>
	//    6   10:return          
	}

	public void setRootAlpha(int i)
	{
		mRootAlpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int mRootAlpha>
	//    3    5:return          
	}

	private static final Matrix IDENTITY_MATRIX = new Matrix();
	float mBaseHeight;
	float mBaseWidth;
	private int mChangingConfigurations;
	private Paint mFillPaint;
	private final Matrix mFinalPathMatrix;
	private final Path mPath;
	private PathMeasure mPathMeasure;
	private final Path mRenderPath;
	int mRootAlpha;
	final VectorDrawableCompat.VGroup mRootGroup;
	String mRootName;
	private Paint mStrokePaint;
	final ArrayMap mVGTargetsMap;
	float mViewportHeight;
	float mViewportWidth;

	static 
	{
	//    0    0:new             #37  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void Matrix()>
	//    3    7:putstatic       #42  <Field Matrix IDENTITY_MATRIX>
	//*   4   10:return          
	}


/*
	static Paint access$000(VectorDrawableCompat$VPathRenderer vectordrawablecompat$vpathrenderer)
	{
		return vectordrawablecompat$vpathrenderer.mFillPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Paint mFillPaint>
	//    2    4:areturn         
	}

*/


/*
	static Paint access$002(VectorDrawableCompat$VPathRenderer vectordrawablecompat$vpathrenderer, Paint paint)
	{
		vectordrawablecompat$vpathrenderer.mFillPaint = paint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field Paint mFillPaint>
		return paint;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Paint access$100(VectorDrawableCompat$VPathRenderer vectordrawablecompat$vpathrenderer)
	{
		return vectordrawablecompat$vpathrenderer.mStrokePaint;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Paint mStrokePaint>
	//    2    4:areturn         
	}

*/


/*
	static Paint access$102(VectorDrawableCompat$VPathRenderer vectordrawablecompat$vpathrenderer, Paint paint)
	{
		vectordrawablecompat$vpathrenderer.mStrokePaint = paint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field Paint mStrokePaint>
		return paint;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	public VectorDrawableCompat$VPathRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mFinalPathMatrix = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void Matrix()>
	//    6   12:putfield        #46  <Field Matrix mFinalPathMatrix>
		mBaseWidth = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #48  <Field float mBaseWidth>
		mBaseHeight = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #50  <Field float mBaseHeight>
		mViewportWidth = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #52  <Field float mViewportWidth>
		mViewportHeight = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #54  <Field float mViewportHeight>
		mRootAlpha = 255;
	//   19   35:aload_0         
	//   20   36:sipush          255
	//   21   39:putfield        #56  <Field int mRootAlpha>
		mRootName = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #58  <Field String mRootName>
		mVGTargetsMap = new ArrayMap();
	//   25   47:aload_0         
	//   26   48:new             #60  <Class ArrayMap>
	//   27   51:dup             
	//   28   52:invokespecial   #61  <Method void ArrayMap()>
	//   29   55:putfield        #63  <Field ArrayMap mVGTargetsMap>
		mRootGroup = new VectorDrawableCompat.VGroup();
	//   30   58:aload_0         
	//   31   59:new             #65  <Class VectorDrawableCompat$VGroup>
	//   32   62:dup             
	//   33   63:invokespecial   #66  <Method void VectorDrawableCompat$VGroup()>
	//   34   66:putfield        #68  <Field VectorDrawableCompat$VGroup mRootGroup>
		mPath = new Path();
	//   35   69:aload_0         
	//   36   70:new             #70  <Class Path>
	//   37   73:dup             
	//   38   74:invokespecial   #71  <Method void Path()>
	//   39   77:putfield        #73  <Field Path mPath>
		mRenderPath = new Path();
	//   40   80:aload_0         
	//   41   81:new             #70  <Class Path>
	//   42   84:dup             
	//   43   85:invokespecial   #71  <Method void Path()>
	//   44   88:putfield        #75  <Field Path mRenderPath>
	//   45   91:return          
	}

	public VectorDrawableCompat$VPathRenderer(VectorDrawableCompat$VPathRenderer vectordrawablecompat$vpathrenderer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mFinalPathMatrix = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #37  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void Matrix()>
	//    6   12:putfield        #46  <Field Matrix mFinalPathMatrix>
		mBaseWidth = 0.0F;
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:putfield        #48  <Field float mBaseWidth>
		mBaseHeight = 0.0F;
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:putfield        #50  <Field float mBaseHeight>
		mViewportWidth = 0.0F;
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:putfield        #52  <Field float mViewportWidth>
		mViewportHeight = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #54  <Field float mViewportHeight>
		mRootAlpha = 255;
	//   19   35:aload_0         
	//   20   36:sipush          255
	//   21   39:putfield        #56  <Field int mRootAlpha>
		mRootName = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #58  <Field String mRootName>
		mVGTargetsMap = new ArrayMap();
	//   25   47:aload_0         
	//   26   48:new             #60  <Class ArrayMap>
	//   27   51:dup             
	//   28   52:invokespecial   #61  <Method void ArrayMap()>
	//   29   55:putfield        #63  <Field ArrayMap mVGTargetsMap>
		mRootGroup = new VectorDrawableCompat.VGroup(vectordrawablecompat$vpathrenderer.mRootGroup, mVGTargetsMap);
	//   30   58:aload_0         
	//   31   59:new             #65  <Class VectorDrawableCompat$VGroup>
	//   32   62:dup             
	//   33   63:aload_1         
	//   34   64:getfield        #68  <Field VectorDrawableCompat$VGroup mRootGroup>
	//   35   67:aload_0         
	//   36   68:getfield        #63  <Field ArrayMap mVGTargetsMap>
	//   37   71:invokespecial   #79  <Method void VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup, ArrayMap)>
	//   38   74:putfield        #68  <Field VectorDrawableCompat$VGroup mRootGroup>
		mPath = new Path(vectordrawablecompat$vpathrenderer.mPath);
	//   39   77:aload_0         
	//   40   78:new             #70  <Class Path>
	//   41   81:dup             
	//   42   82:aload_1         
	//   43   83:getfield        #73  <Field Path mPath>
	//   44   86:invokespecial   #82  <Method void Path(Path)>
	//   45   89:putfield        #73  <Field Path mPath>
		mRenderPath = new Path(vectordrawablecompat$vpathrenderer.mRenderPath);
	//   46   92:aload_0         
	//   47   93:new             #70  <Class Path>
	//   48   96:dup             
	//   49   97:aload_1         
	//   50   98:getfield        #75  <Field Path mRenderPath>
	//   51  101:invokespecial   #82  <Method void Path(Path)>
	//   52  104:putfield        #75  <Field Path mRenderPath>
		mBaseWidth = vectordrawablecompat$vpathrenderer.mBaseWidth;
	//   53  107:aload_0         
	//   54  108:aload_1         
	//   55  109:getfield        #48  <Field float mBaseWidth>
	//   56  112:putfield        #48  <Field float mBaseWidth>
		mBaseHeight = vectordrawablecompat$vpathrenderer.mBaseHeight;
	//   57  115:aload_0         
	//   58  116:aload_1         
	//   59  117:getfield        #50  <Field float mBaseHeight>
	//   60  120:putfield        #50  <Field float mBaseHeight>
		mViewportWidth = vectordrawablecompat$vpathrenderer.mViewportWidth;
	//   61  123:aload_0         
	//   62  124:aload_1         
	//   63  125:getfield        #52  <Field float mViewportWidth>
	//   64  128:putfield        #52  <Field float mViewportWidth>
		mViewportHeight = vectordrawablecompat$vpathrenderer.mViewportHeight;
	//   65  131:aload_0         
	//   66  132:aload_1         
	//   67  133:getfield        #54  <Field float mViewportHeight>
	//   68  136:putfield        #54  <Field float mViewportHeight>
		mChangingConfigurations = vectordrawablecompat$vpathrenderer.mChangingConfigurations;
	//   69  139:aload_0         
	//   70  140:aload_1         
	//   71  141:getfield        #84  <Field int mChangingConfigurations>
	//   72  144:putfield        #84  <Field int mChangingConfigurations>
		mRootAlpha = vectordrawablecompat$vpathrenderer.mRootAlpha;
	//   73  147:aload_0         
	//   74  148:aload_1         
	//   75  149:getfield        #56  <Field int mRootAlpha>
	//   76  152:putfield        #56  <Field int mRootAlpha>
		mRootName = vectordrawablecompat$vpathrenderer.mRootName;
	//   77  155:aload_0         
	//   78  156:aload_1         
	//   79  157:getfield        #58  <Field String mRootName>
	//   80  160:putfield        #58  <Field String mRootName>
		if(vectordrawablecompat$vpathrenderer.mRootName != null)
	//*  81  163:aload_1         
	//*  82  164:getfield        #58  <Field String mRootName>
	//*  83  167:ifnull          183
			mVGTargetsMap.put(((Object) (vectordrawablecompat$vpathrenderer.mRootName)), ((Object) (this)));
	//   84  170:aload_0         
	//   85  171:getfield        #63  <Field ArrayMap mVGTargetsMap>
	//   86  174:aload_1         
	//   87  175:getfield        #58  <Field String mRootName>
	//   88  178:aload_0         
	//   89  179:invokevirtual   #88  <Method Object ArrayMap.put(Object, Object)>
	//   90  182:pop             
	//   91  183:return          
	}
}
