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
		int k = 0;
	//   13   25:iconst_0        
	//   14   26:istore          7
		while(k < vgroup.mChildren.size()) 
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
	//*  27   54:ifeq            85
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
			else
	//*  38   76:iload           7
	//*  39   78:iconst_1        
	//*  40   79:iadd            
	//*  41   80:istore          7
	//*  42   82:goto            28
			if(matrix instanceof VectorDrawableCompat.VPath)
	//*  43   85:aload_2         
	//*  44   86:instanceof      #140 <Class VectorDrawableCompat$VPath>
	//*  45   89:ifeq            76
				drawPath(vgroup, (VectorDrawableCompat.VPath)matrix, canvas, i, j, colorfilter);
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:aload_2         
	//   49   95:checkcast       #140 <Class VectorDrawableCompat$VPath>
	//   50   98:aload_3         
	//   51   99:iload           4
	//   52  101:iload           5
	//   53  103:aload           6
	//   54  105:invokespecial   #144 <Method void drawPath(VectorDrawableCompat$VGroup, VectorDrawableCompat$VPath, Canvas, int, int, ColorFilter)>
			k++;
		}
	//*  55  108:goto            76
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
		if(f1 != 0.0F)
	//*  33   61:fload           8
	//*  34   63:fconst_0        
	//*  35   64:fcmpl           
	//*  36   65:ifne            69
	//*  37   68:return          
		{
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
	//*  75  138:ifeq            273
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
				Paint paint;
				Path path;
				if(f6 > f4)
	//* 124  232:fload           12
	//* 125  234:fload           10
	//* 126  236:fcmpl           
	//* 127  237:ifle            523
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
	//* 144  267:aload_1         
	//* 145  268:fconst_0        
	//* 146  269:fconst_0        
	//* 147  270:invokevirtual   #211 <Method void Path.rLineTo(float, float)>
	//* 148  273:aload_0         
	//* 149  274:getfield        #75  <Field Path mRenderPath>
	//* 150  277:aload_1         
	//* 151  278:aload_0         
	//* 152  279:getfield        #46  <Field Matrix mFinalPathMatrix>
	//* 153  282:invokevirtual   #175 <Method void Path.addPath(Path, Matrix)>
	//* 154  285:aload_2         
	//* 155  286:getfield        #214 <Field int VectorDrawableCompat$VFullPath.mFillColor>
	//* 156  289:ifeq            391
	//* 157  292:aload_0         
	//* 158  293:getfield        #92  <Field Paint mFillPaint>
	//* 159  296:ifnonnull       328
	//* 160  299:aload_0         
	//* 161  300:new             #216 <Class Paint>
	//* 162  303:dup             
	//* 163  304:invokespecial   #217 <Method void Paint()>
	//* 164  307:putfield        #92  <Field Paint mFillPaint>
	//* 165  310:aload_0         
	//* 166  311:getfield        #92  <Field Paint mFillPaint>
	//* 167  314:getstatic       #223 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//* 168  317:invokevirtual   #227 <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//* 169  320:aload_0         
	//* 170  321:getfield        #92  <Field Paint mFillPaint>
	//* 171  324:iconst_1        
	//* 172  325:invokevirtual   #231 <Method void Paint.setAntiAlias(boolean)>
	//* 173  328:aload_0         
	//* 174  329:getfield        #92  <Field Paint mFillPaint>
	//* 175  332:astore          14
	//* 176  334:aload           14
	//* 177  336:aload_2         
	//* 178  337:getfield        #214 <Field int VectorDrawableCompat$VFullPath.mFillColor>
	//* 179  340:aload_2         
	//* 180  341:getfield        #234 <Field float VectorDrawableCompat$VFullPath.mFillAlpha>
	//* 181  344:invokestatic    #238 <Method int VectorDrawableCompat.applyAlpha(int, float)>
	//* 182  347:invokevirtual   #242 <Method void Paint.setColor(int)>
	//* 183  350:aload           14
	//* 184  352:aload           6
	//* 185  354:invokevirtual   #246 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//* 186  357:pop             
	//* 187  358:aload_0         
	//* 188  359:getfield        #75  <Field Path mRenderPath>
	//* 189  362:astore          15
	//* 190  364:aload_2         
	//* 191  365:getfield        #249 <Field int VectorDrawableCompat$VFullPath.mFillRule>
	//* 192  368:ifne            540
	//* 193  371:getstatic       #255 <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
	//* 194  374:astore_1        
	//* 195  375:aload           15
	//* 196  377:aload_1         
	//* 197  378:invokevirtual   #259 <Method void Path.setFillType(android.graphics.Path$FillType)>
	//* 198  381:aload_3         
	//* 199  382:aload_0         
	//* 200  383:getfield        #75  <Field Path mRenderPath>
	//* 201  386:aload           14
	//* 202  388:invokevirtual   #262 <Method void Canvas.drawPath(Path, Paint)>
	//* 203  391:aload_2         
	//* 204  392:getfield        #265 <Field int VectorDrawableCompat$VFullPath.mStrokeColor>
	//* 205  395:ifeq            68
	//* 206  398:aload_0         
	//* 207  399:getfield        #97  <Field Paint mStrokePaint>
	//* 208  402:ifnonnull       434
	//* 209  405:aload_0         
	//* 210  406:new             #216 <Class Paint>
	//* 211  409:dup             
	//* 212  410:invokespecial   #217 <Method void Paint()>
	//* 213  413:putfield        #97  <Field Paint mStrokePaint>
	//* 214  416:aload_0         
	//* 215  417:getfield        #97  <Field Paint mStrokePaint>
	//* 216  420:getstatic       #268 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//* 217  423:invokevirtual   #227 <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//* 218  426:aload_0         
	//* 219  427:getfield        #97  <Field Paint mStrokePaint>
	//* 220  430:iconst_1        
	//* 221  431:invokevirtual   #231 <Method void Paint.setAntiAlias(boolean)>
	//* 222  434:aload_0         
	//* 223  435:getfield        #97  <Field Paint mStrokePaint>
	//* 224  438:astore_1        
	//* 225  439:aload_2         
	//* 226  440:getfield        #272 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
	//* 227  443:ifnull          454
	//* 228  446:aload_1         
	//* 229  447:aload_2         
	//* 230  448:getfield        #272 <Field android.graphics.Paint$Join VectorDrawableCompat$VFullPath.mStrokeLineJoin>
	//* 231  451:invokevirtual   #276 <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
	//* 232  454:aload_2         
	//* 233  455:getfield        #280 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
	//* 234  458:ifnull          469
	//* 235  461:aload_1         
	//* 236  462:aload_2         
	//* 237  463:getfield        #280 <Field android.graphics.Paint$Cap VectorDrawableCompat$VFullPath.mStrokeLineCap>
	//* 238  466:invokevirtual   #284 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
	//* 239  469:aload_1         
	//* 240  470:aload_2         
	//* 241  471:getfield        #287 <Field float VectorDrawableCompat$VFullPath.mStrokeMiterlimit>
	//* 242  474:invokevirtual   #291 <Method void Paint.setStrokeMiter(float)>
	//* 243  477:aload_1         
	//* 244  478:aload_2         
	//* 245  479:getfield        #265 <Field int VectorDrawableCompat$VFullPath.mStrokeColor>
	//* 246  482:aload_2         
	//* 247  483:getfield        #294 <Field float VectorDrawableCompat$VFullPath.mStrokeAlpha>
	//* 248  486:invokestatic    #238 <Method int VectorDrawableCompat.applyAlpha(int, float)>
	//* 249  489:invokevirtual   #242 <Method void Paint.setColor(int)>
	//* 250  492:aload_1         
	//* 251  493:aload           6
	//* 252  495:invokevirtual   #246 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//* 253  498:pop             
	//* 254  499:aload_1         
	//* 255  500:fload           8
	//* 256  502:fload           7
	//* 257  504:fmul            
	//* 258  505:aload_2         
	//* 259  506:getfield        #297 <Field float VectorDrawableCompat$VFullPath.mStrokeWidth>
	//* 260  509:fmul            
	//* 261  510:invokevirtual   #300 <Method void Paint.setStrokeWidth(float)>
	//* 262  513:aload_3         
	//* 263  514:aload_0         
	//* 264  515:getfield        #75  <Field Path mRenderPath>
	//* 265  518:aload_1         
	//* 266  519:invokevirtual   #262 <Method void Canvas.drawPath(Path, Paint)>
	//* 267  522:return          
				{
					mPathMeasure.getSegment(f6, f4, ((Path) (vgroup)), true);
	//  268  523:aload_0         
	//  269  524:getfield        #192 <Field PathMeasure mPathMeasure>
	//  270  527:fload           12
	//  271  529:fload           10
	//  272  531:aload_1         
	//  273  532:iconst_1        
	//  274  533:invokevirtual   #207 <Method boolean PathMeasure.getSegment(float, float, Path, boolean)>
	//  275  536:pop             
				}
				((Path) (vgroup)).rLineTo(0.0F, 0.0F);
			}
			mRenderPath.addPath(((Path) (vgroup)), mFinalPathMatrix);
			if(((VectorDrawableCompat.VFullPath) (vpath)).mFillColor != 0)
			{
				if(mFillPaint == null)
				{
					mFillPaint = new Paint();
					mFillPaint.setStyle(android.graphics.Paint.Style.FILL);
					mFillPaint.setAntiAlias(true);
				}
				paint = mFillPaint;
				paint.setColor(VectorDrawableCompat.applyAlpha(((VectorDrawableCompat.VFullPath) (vpath)).mFillColor, ((VectorDrawableCompat.VFullPath) (vpath)).mFillAlpha));
				paint.setColorFilter(colorfilter);
				path = mRenderPath;
				if(((VectorDrawableCompat.VFullPath) (vpath)).mFillRule == 0)
					vgroup = ((VectorDrawableCompat.VGroup) (android.graphics.Path.FillType.WINDING));
				else
	//* 276  537:goto            267
					vgroup = ((VectorDrawableCompat.VGroup) (android.graphics.Path.FillType.EVEN_ODD));
	//  277  540:getstatic       #303 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//  278  543:astore_1        
				path.setFillType(((android.graphics.Path.FillType) (vgroup)));
				canvas.drawPath(mRenderPath, paint);
			}
			if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeColor != 0)
			{
				if(mStrokePaint == null)
				{
					mStrokePaint = new Paint();
					mStrokePaint.setStyle(android.graphics.Paint.Style.STROKE);
					mStrokePaint.setAntiAlias(true);
				}
				vgroup = ((VectorDrawableCompat.VGroup) (mStrokePaint));
				if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineJoin != null)
					((Paint) (vgroup)).setStrokeJoin(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineJoin);
				if(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineCap != null)
					((Paint) (vgroup)).setStrokeCap(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeLineCap);
				((Paint) (vgroup)).setStrokeMiter(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeMiterlimit);
				((Paint) (vgroup)).setColor(VectorDrawableCompat.applyAlpha(((VectorDrawableCompat.VFullPath) (vpath)).mStrokeColor, ((VectorDrawableCompat.VFullPath) (vpath)).mStrokeAlpha));
				((Paint) (vgroup)).setColorFilter(colorfilter);
				((Paint) (vgroup)).setStrokeWidth(f1 * f * ((VectorDrawableCompat.VFullPath) (vpath)).mStrokeWidth);
				canvas.drawPath(mRenderPath, ((Paint) (vgroup)));
				return;
			}
		}
	//* 279  544:goto            375
	}

	private float getMatrixScale(Matrix matrix)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		float af[] = new float[4];
	//    2    2:iconst_4        
	//    3    3:newarray        float[]
	//    4    5:astore          6
		float[] _tmp = af;
	//    5    7:aload           6
	//    6    9:dup             
	//    7   10:iconst_0        
	//    8   11:fconst_0        
	//    9   12:fastore         
	//   10   13:dup             
	//   11   14:iconst_1        
	//   12   15:fconst_1        
	//   13   16:fastore         
	//   14   17:dup             
	//   15   18:iconst_2        
	//   16   19:fconst_1        
	//   17   20:fastore         
	//   18   21:dup             
	//   19   22:iconst_3        
	//   20   23:fconst_0        
	//   21   24:fastore         
	//   22   25:pop             
		af[0] = 0.0F;
		af[1] = 1.0F;
		af[2] = 1.0F;
		af[3] = 0.0F;
		matrix.mapVectors(af);
	//   23   26:aload_1         
	//   24   27:aload           6
	//   25   29:invokevirtual   #307 <Method void Matrix.mapVectors(float[])>
		float f2 = (float)Math.hypot(af[0], af[1]);
	//   26   32:aload           6
	//   27   34:iconst_0        
	//   28   35:faload          
	//   29   36:f2d             
	//   30   37:aload           6
	//   31   39:iconst_1        
	//   32   40:faload          
	//   33   41:f2d             
	//   34   42:invokestatic    #311 <Method double Math.hypot(double, double)>
	//   35   45:d2f             
	//   36   46:fstore          4
		float f3 = (float)Math.hypot(af[2], af[3]);
	//   37   48:aload           6
	//   38   50:iconst_2        
	//   39   51:faload          
	//   40   52:f2d             
	//   41   53:aload           6
	//   42   55:iconst_3        
	//   43   56:faload          
	//   44   57:f2d             
	//   45   58:invokestatic    #311 <Method double Math.hypot(double, double)>
	//   46   61:d2f             
	//   47   62:fstore          5
		float f1 = cross(af[0], af[1], af[2], af[3]);
	//   48   64:aload           6
	//   49   66:iconst_0        
	//   50   67:faload          
	//   51   68:aload           6
	//   52   70:iconst_1        
	//   53   71:faload          
	//   54   72:aload           6
	//   55   74:iconst_2        
	//   56   75:faload          
	//   57   76:aload           6
	//   58   78:iconst_3        
	//   59   79:faload          
	//   60   80:invokestatic    #313 <Method float cross(float, float, float, float)>
	//   61   83:fstore_3        
		f2 = Math.max(f2, f3);
	//   62   84:fload           4
	//   63   86:fload           5
	//   64   88:invokestatic    #316 <Method float Math.max(float, float)>
	//   65   91:fstore          4
		if(f2 > 0.0F)
	//*  66   93:fload           4
	//*  67   95:fconst_0        
	//*  68   96:fcmpl           
	//*  69   97:ifle            108
			f = Math.abs(f1) / f2;
	//   70  100:fload_3         
	//   71  101:invokestatic    #320 <Method float Math.abs(float)>
	//   72  104:fload           4
	//   73  106:fdiv            
	//   74  107:fstore_2        
		return f;
	//   75  108:fload_2         
	//   76  109:freturn         
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
		setRootAlpha((int)(255F * f));
	//    0    0:aload_0         
	//    1    1:ldc2            #327 <Float 255F>
	//    2    4:fload_1         
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
