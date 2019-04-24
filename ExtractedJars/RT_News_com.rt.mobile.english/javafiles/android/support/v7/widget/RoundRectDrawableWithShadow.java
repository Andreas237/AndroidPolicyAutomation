// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;

class RoundRectDrawableWithShadow extends Drawable
{
	static interface RoundRectHelper
	{

		public abstract void drawRoundRect(Canvas canvas, RectF rectf, float f, Paint paint);
	}


	RoundRectDrawableWithShadow(Resources resources, ColorStateList colorstatelist, float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Drawable()>
		mDirty = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #58  <Field boolean mDirty>
		mAddPaddingForCorners = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #60  <Field boolean mAddPaddingForCorners>
		mPrintedShadowClipWarning = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #62  <Field boolean mPrintedShadowClipWarning>
		mShadowStartColor = resources.getColor(android.support.v7.cardview.R.color.cardview_shadow_start_color);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:getstatic       #67  <Field int android.support.v7.cardview.R$color.cardview_shadow_start_color>
	//   14   24:invokevirtual   #73  <Method int Resources.getColor(int)>
	//   15   27:putfield        #75  <Field int mShadowStartColor>
		mShadowEndColor = resources.getColor(android.support.v7.cardview.R.color.cardview_shadow_end_color);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getstatic       #78  <Field int android.support.v7.cardview.R$color.cardview_shadow_end_color>
	//   19   35:invokevirtual   #73  <Method int Resources.getColor(int)>
	//   20   38:putfield        #80  <Field int mShadowEndColor>
		mInsetShadow = resources.getDimensionPixelSize(android.support.v7.cardview.R.dimen.cardview_compat_inset_shadow);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getstatic       #85  <Field int android.support.v7.cardview.R$dimen.cardview_compat_inset_shadow>
	//   24   46:invokevirtual   #88  <Method int Resources.getDimensionPixelSize(int)>
	//   25   49:putfield        #90  <Field int mInsetShadow>
		mPaint = new Paint(5);
	//   26   52:aload_0         
	//   27   53:new             #92  <Class Paint>
	//   28   56:dup             
	//   29   57:iconst_5        
	//   30   58:invokespecial   #95  <Method void Paint(int)>
	//   31   61:putfield        #97  <Field Paint mPaint>
		setBackground(colorstatelist);
	//   32   64:aload_0         
	//   33   65:aload_2         
	//   34   66:invokespecial   #101 <Method void setBackground(ColorStateList)>
		mCornerShadowPaint = new Paint(5);
	//   35   69:aload_0         
	//   36   70:new             #92  <Class Paint>
	//   37   73:dup             
	//   38   74:iconst_5        
	//   39   75:invokespecial   #95  <Method void Paint(int)>
	//   40   78:putfield        #103 <Field Paint mCornerShadowPaint>
		mCornerShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   41   81:aload_0         
	//   42   82:getfield        #103 <Field Paint mCornerShadowPaint>
	//   43   85:getstatic       #109 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   44   88:invokevirtual   #113 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mCornerRadius = (int)(f + 0.5F);
	//   45   91:aload_0         
	//   46   92:fload_3         
	//   47   93:ldc1            #114 <Float 0.5F>
	//   48   95:fadd            
	//   49   96:f2i             
	//   50   97:i2f             
	//   51   98:putfield        #116 <Field float mCornerRadius>
	//   52  101:aload_0         
	//   53  102:new             #118 <Class RectF>
	//   54  105:dup             
	//   55  106:invokespecial   #119 <Method void RectF()>
	//   56  109:putfield        #121 <Field RectF mCardBounds>
		mEdgeShadowPaint = new Paint(mCornerShadowPaint);
	//   57  112:aload_0         
	//   58  113:new             #92  <Class Paint>
	//   59  116:dup             
	//   60  117:aload_0         
	//   61  118:getfield        #103 <Field Paint mCornerShadowPaint>
	//   62  121:invokespecial   #124 <Method void Paint(Paint)>
	//   63  124:putfield        #126 <Field Paint mEdgeShadowPaint>
		mEdgeShadowPaint.setAntiAlias(false);
	//   64  127:aload_0         
	//   65  128:getfield        #126 <Field Paint mEdgeShadowPaint>
	//   66  131:iconst_0        
	//   67  132:invokevirtual   #130 <Method void Paint.setAntiAlias(boolean)>
		setShadowSize(f1, f2);
	//   68  135:aload_0         
	//   69  136:fload           4
	//   70  138:fload           5
	//   71  140:invokespecial   #134 <Method void setShadowSize(float, float)>
	//   72  143:return          
	}

	private void buildComponents(Rect rect)
	{
		float f = mRawMaxShadowSize * 1.5F;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field float mRawMaxShadowSize>
	//    2    4:ldc1            #12  <Float 1.5F>
	//    3    6:fmul            
	//    4    7:fstore_2        
		mCardBounds.set((float)rect.left + mRawMaxShadowSize, (float)rect.top + f, (float)rect.right - mRawMaxShadowSize, (float)rect.bottom - f);
	//    5    8:aload_0         
	//    6    9:getfield        #121 <Field RectF mCardBounds>
	//    7   12:aload_1         
	//    8   13:getfield        #143 <Field int Rect.left>
	//    9   16:i2f             
	//   10   17:aload_0         
	//   11   18:getfield        #138 <Field float mRawMaxShadowSize>
	//   12   21:fadd            
	//   13   22:aload_1         
	//   14   23:getfield        #146 <Field int Rect.top>
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fadd            
	//   18   29:aload_1         
	//   19   30:getfield        #149 <Field int Rect.right>
	//   20   33:i2f             
	//   21   34:aload_0         
	//   22   35:getfield        #138 <Field float mRawMaxShadowSize>
	//   23   38:fsub            
	//   24   39:aload_1         
	//   25   40:getfield        #152 <Field int Rect.bottom>
	//   26   43:i2f             
	//   27   44:fload_2         
	//   28   45:fsub            
	//   29   46:invokevirtual   #156 <Method void RectF.set(float, float, float, float)>
		buildShadowCorners();
	//   30   49:aload_0         
	//   31   50:invokespecial   #159 <Method void buildShadowCorners()>
	//   32   53:return          
	}

	private void buildShadowCorners()
	{
		Object obj = ((Object) (new RectF(-mCornerRadius, -mCornerRadius, mCornerRadius, mCornerRadius)));
	//    0    0:new             #118 <Class RectF>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #116 <Field float mCornerRadius>
	//    4    8:fneg            
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field float mCornerRadius>
	//    7   13:fneg            
	//    8   14:aload_0         
	//    9   15:getfield        #116 <Field float mCornerRadius>
	//   10   18:aload_0         
	//   11   19:getfield        #116 <Field float mCornerRadius>
	//   12   22:invokespecial   #161 <Method void RectF(float, float, float, float)>
	//   13   25:astore          8
		Object obj1 = ((Object) (new RectF(((RectF) (obj)))));
	//   14   27:new             #118 <Class RectF>
	//   15   30:dup             
	//   16   31:aload           8
	//   17   33:invokespecial   #164 <Method void RectF(RectF)>
	//   18   36:astore          9
		((RectF) (obj1)).inset(-mShadowSize, -mShadowSize);
	//   19   38:aload           9
	//   20   40:aload_0         
	//   21   41:getfield        #166 <Field float mShadowSize>
	//   22   44:fneg            
	//   23   45:aload_0         
	//   24   46:getfield        #166 <Field float mShadowSize>
	//   25   49:fneg            
	//   26   50:invokevirtual   #169 <Method void RectF.inset(float, float)>
		if(mCornerShadowPath == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #171 <Field Path mCornerShadowPath>
	//*  29   57:ifnonnull       74
			mCornerShadowPath = new Path();
	//   30   60:aload_0         
	//   31   61:new             #173 <Class Path>
	//   32   64:dup             
	//   33   65:invokespecial   #174 <Method void Path()>
	//   34   68:putfield        #171 <Field Path mCornerShadowPath>
		else
	//*  35   71:goto            81
			mCornerShadowPath.reset();
	//   36   74:aload_0         
	//   37   75:getfield        #171 <Field Path mCornerShadowPath>
	//   38   78:invokevirtual   #177 <Method void Path.reset()>
		mCornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
	//   39   81:aload_0         
	//   40   82:getfield        #171 <Field Path mCornerShadowPath>
	//   41   85:getstatic       #183 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   42   88:invokevirtual   #187 <Method void Path.setFillType(android.graphics.Path$FillType)>
		mCornerShadowPath.moveTo(-mCornerRadius, 0.0F);
	//   43   91:aload_0         
	//   44   92:getfield        #171 <Field Path mCornerShadowPath>
	//   45   95:aload_0         
	//   46   96:getfield        #116 <Field float mCornerRadius>
	//   47   99:fneg            
	//   48  100:fconst_0        
	//   49  101:invokevirtual   #190 <Method void Path.moveTo(float, float)>
		mCornerShadowPath.rLineTo(-mShadowSize, 0.0F);
	//   50  104:aload_0         
	//   51  105:getfield        #171 <Field Path mCornerShadowPath>
	//   52  108:aload_0         
	//   53  109:getfield        #166 <Field float mShadowSize>
	//   54  112:fneg            
	//   55  113:fconst_0        
	//   56  114:invokevirtual   #193 <Method void Path.rLineTo(float, float)>
		mCornerShadowPath.arcTo(((RectF) (obj1)), 180F, 90F, false);
	//   57  117:aload_0         
	//   58  118:getfield        #171 <Field Path mCornerShadowPath>
	//   59  121:aload           9
	//   60  123:ldc1            #194 <Float 180F>
	//   61  125:ldc1            #195 <Float 90F>
	//   62  127:iconst_0        
	//   63  128:invokevirtual   #199 <Method void Path.arcTo(RectF, float, float, boolean)>
		mCornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
	//   64  131:aload_0         
	//   65  132:getfield        #171 <Field Path mCornerShadowPath>
	//   66  135:aload           8
	//   67  137:ldc1            #200 <Float 270F>
	//   68  139:ldc1            #201 <Float -90F>
	//   69  141:iconst_0        
	//   70  142:invokevirtual   #199 <Method void Path.arcTo(RectF, float, float, boolean)>
		mCornerShadowPath.close();
	//   71  145:aload_0         
	//   72  146:getfield        #171 <Field Path mCornerShadowPath>
	//   73  149:invokevirtual   #204 <Method void Path.close()>
		float f = mCornerRadius / (mCornerRadius + mShadowSize);
	//   74  152:aload_0         
	//   75  153:getfield        #116 <Field float mCornerRadius>
	//   76  156:aload_0         
	//   77  157:getfield        #116 <Field float mCornerRadius>
	//   78  160:aload_0         
	//   79  161:getfield        #166 <Field float mShadowSize>
	//   80  164:fadd            
	//   81  165:fdiv            
	//   82  166:fstore_1        
		obj = ((Object) (mCornerShadowPaint));
	//   83  167:aload_0         
	//   84  168:getfield        #103 <Field Paint mCornerShadowPaint>
	//   85  171:astore          8
		float f1 = mCornerRadius;
	//   86  173:aload_0         
	//   87  174:getfield        #116 <Field float mCornerRadius>
	//   88  177:fstore_2        
		float f2 = mShadowSize;
	//   89  178:aload_0         
	//   90  179:getfield        #166 <Field float mShadowSize>
	//   91  182:fstore_3        
		int i = mShadowStartColor;
	//   92  183:aload_0         
	//   93  184:getfield        #75  <Field int mShadowStartColor>
	//   94  187:istore          5
		int j = mShadowStartColor;
	//   95  189:aload_0         
	//   96  190:getfield        #75  <Field int mShadowStartColor>
	//   97  193:istore          6
		int k = mShadowEndColor;
	//   98  195:aload_0         
	//   99  196:getfield        #80  <Field int mShadowEndColor>
	//  100  199:istore          7
		obj1 = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//  101  201:getstatic       #210 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  102  204:astore          9
		((Paint) (obj)).setShader(((android.graphics.Shader) (new RadialGradient(0.0F, 0.0F, f1 + f2, new int[] {
			i, j, k
		}, new float[] {
			0.0F, f, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj1))))));
	//  103  206:aload           8
	//  104  208:new             #212 <Class RadialGradient>
	//  105  211:dup             
	//  106  212:fconst_0        
	//  107  213:fconst_0        
	//  108  214:fload_2         
	//  109  215:fload_3         
	//  110  216:fadd            
	//  111  217:iconst_3        
	//  112  218:newarray        int[]
	//  113  220:dup             
	//  114  221:iconst_0        
	//  115  222:iload           5
	//  116  224:iastore         
	//  117  225:dup             
	//  118  226:iconst_1        
	//  119  227:iload           6
	//  120  229:iastore         
	//  121  230:dup             
	//  122  231:iconst_2        
	//  123  232:iload           7
	//  124  234:iastore         
	//  125  235:iconst_3        
	//  126  236:newarray        float[]
	//  127  238:dup             
	//  128  239:iconst_0        
	//  129  240:fconst_0        
	//  130  241:fastore         
	//  131  242:dup             
	//  132  243:iconst_1        
	//  133  244:fload_1         
	//  134  245:fastore         
	//  135  246:dup             
	//  136  247:iconst_2        
	//  137  248:fconst_1        
	//  138  249:fastore         
	//  139  250:aload           9
	//  140  252:invokespecial   #215 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  141  255:invokevirtual   #219 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  142  258:pop             
		obj = ((Object) (mEdgeShadowPaint));
	//  143  259:aload_0         
	//  144  260:getfield        #126 <Field Paint mEdgeShadowPaint>
	//  145  263:astore          8
		f = -mCornerRadius;
	//  146  265:aload_0         
	//  147  266:getfield        #116 <Field float mCornerRadius>
	//  148  269:fneg            
	//  149  270:fstore_1        
		f1 = mShadowSize;
	//  150  271:aload_0         
	//  151  272:getfield        #166 <Field float mShadowSize>
	//  152  275:fstore_2        
		f2 = -mCornerRadius;
	//  153  276:aload_0         
	//  154  277:getfield        #116 <Field float mCornerRadius>
	//  155  280:fneg            
	//  156  281:fstore_3        
		float f3 = mShadowSize;
	//  157  282:aload_0         
	//  158  283:getfield        #166 <Field float mShadowSize>
	//  159  286:fstore          4
		i = mShadowStartColor;
	//  160  288:aload_0         
	//  161  289:getfield        #75  <Field int mShadowStartColor>
	//  162  292:istore          5
		j = mShadowStartColor;
	//  163  294:aload_0         
	//  164  295:getfield        #75  <Field int mShadowStartColor>
	//  165  298:istore          6
		k = mShadowEndColor;
	//  166  300:aload_0         
	//  167  301:getfield        #80  <Field int mShadowEndColor>
	//  168  304:istore          7
		obj1 = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//  169  306:getstatic       #210 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  170  309:astore          9
		((Paint) (obj)).setShader(((android.graphics.Shader) (new LinearGradient(0.0F, f + f1, 0.0F, f2 - f3, new int[] {
			i, j, k
		}, new float[] {
			0.0F, 0.5F, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj1))))));
	//  171  311:aload           8
	//  172  313:new             #221 <Class LinearGradient>
	//  173  316:dup             
	//  174  317:fconst_0        
	//  175  318:fload_1         
	//  176  319:fload_2         
	//  177  320:fadd            
	//  178  321:fconst_0        
	//  179  322:fload_3         
	//  180  323:fload           4
	//  181  325:fsub            
	//  182  326:iconst_3        
	//  183  327:newarray        int[]
	//  184  329:dup             
	//  185  330:iconst_0        
	//  186  331:iload           5
	//  187  333:iastore         
	//  188  334:dup             
	//  189  335:iconst_1        
	//  190  336:iload           6
	//  191  338:iastore         
	//  192  339:dup             
	//  193  340:iconst_2        
	//  194  341:iload           7
	//  195  343:iastore         
	//  196  344:iconst_3        
	//  197  345:newarray        float[]
	//  198  347:dup             
	//  199  348:iconst_0        
	//  200  349:fconst_0        
	//  201  350:fastore         
	//  202  351:dup             
	//  203  352:iconst_1        
	//  204  353:ldc1            #114 <Float 0.5F>
	//  205  355:fastore         
	//  206  356:dup             
	//  207  357:iconst_2        
	//  208  358:fconst_1        
	//  209  359:fastore         
	//  210  360:aload           9
	//  211  362:invokespecial   #224 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  212  365:invokevirtual   #219 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  213  368:pop             
		mEdgeShadowPaint.setAntiAlias(false);
	//  214  369:aload_0         
	//  215  370:getfield        #126 <Field Paint mEdgeShadowPaint>
	//  216  373:iconst_0        
	//  217  374:invokevirtual   #130 <Method void Paint.setAntiAlias(boolean)>
	//  218  377:return          
	}

	static float calculateHorizontalPadding(float f, float f1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            17
			return (float)((double)f + (1.0D - COS_45) * (double)f1);
	//    2    4:fload_0         
	//    3    5:f2d             
	//    4    6:dconst_1        
	//    5    7:getstatic       #51  <Field double COS_45>
	//    6   10:dsub            
	//    7   11:fload_1         
	//    8   12:f2d             
	//    9   13:dmul            
	//   10   14:dadd            
	//   11   15:d2f             
	//   12   16:freturn         
		else
			return f;
	//   13   17:fload_0         
	//   14   18:freturn         
	}

	static float calculateVerticalPadding(float f, float f1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
			return (float)((double)(f * 1.5F) + (1.0D - COS_45) * (double)f1);
	//    2    4:fload_0         
	//    3    5:ldc1            #12  <Float 1.5F>
	//    4    7:fmul            
	//    5    8:f2d             
	//    6    9:dconst_1        
	//    7   10:getstatic       #51  <Field double COS_45>
	//    8   13:dsub            
	//    9   14:fload_1         
	//   10   15:f2d             
	//   11   16:dmul            
	//   12   17:dadd            
	//   13   18:d2f             
	//   14   19:freturn         
		else
			return f * 1.5F;
	//   15   20:fload_0         
	//   16   21:ldc1            #12  <Float 1.5F>
	//   17   23:fmul            
	//   18   24:freturn         
	}

	private void drawShadow(Canvas canvas)
	{
		float f = -mCornerRadius - mShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field float mCornerRadius>
	//    2    4:fneg            
	//    3    5:aload_0         
	//    4    6:getfield        #166 <Field float mShadowSize>
	//    5    9:fsub            
	//    6   10:fstore_2        
		float f1 = mCornerRadius + (float)mInsetShadow + mRawShadowSize / 2.0F;
	//    7   11:aload_0         
	//    8   12:getfield        #116 <Field float mCornerRadius>
	//    9   15:aload_0         
	//   10   16:getfield        #90  <Field int mInsetShadow>
	//   11   19:i2f             
	//   12   20:fadd            
	//   13   21:aload_0         
	//   14   22:getfield        #231 <Field float mRawShadowSize>
	//   15   25:fconst_2        
	//   16   26:fdiv            
	//   17   27:fadd            
	//   18   28:fstore_3        
		float f2 = mCardBounds.width();
	//   19   29:aload_0         
	//   20   30:getfield        #121 <Field RectF mCardBounds>
	//   21   33:invokevirtual   #235 <Method float RectF.width()>
	//   22   36:fstore          4
		float f3 = 2.0F * f1;
	//   23   38:fconst_2        
	//   24   39:fload_3         
	//   25   40:fmul            
	//   26   41:fstore          5
		boolean flag;
		if(f2 - f3 > 0.0F)
	//*  27   43:fload           4
	//*  28   45:fload           5
	//*  29   47:fsub            
	//*  30   48:fconst_0        
	//*  31   49:fcmpl           
	//*  32   50:ifle            59
			flag = true;
	//   33   53:iconst_1        
	//   34   54:istore          6
		else
	//*  35   56:goto            62
			flag = false;
	//   36   59:iconst_0        
	//   37   60:istore          6
		boolean flag1;
		if(mCardBounds.height() - f3 > 0.0F)
	//*  38   62:aload_0         
	//*  39   63:getfield        #121 <Field RectF mCardBounds>
	//*  40   66:invokevirtual   #238 <Method float RectF.height()>
	//*  41   69:fload           5
	//*  42   71:fsub            
	//*  43   72:fconst_0        
	//*  44   73:fcmpl           
	//*  45   74:ifle            83
			flag1 = true;
	//   46   77:iconst_1        
	//   47   78:istore          7
		else
	//*  48   80:goto            86
			flag1 = false;
	//   49   83:iconst_0        
	//   50   84:istore          7
		int j = canvas.save();
	//   51   86:aload_1         
	//   52   87:invokevirtual   #244 <Method int Canvas.save()>
	//   53   90:istore          8
		canvas.translate(mCardBounds.left + f1, mCardBounds.top + f1);
	//   54   92:aload_1         
	//   55   93:aload_0         
	//   56   94:getfield        #121 <Field RectF mCardBounds>
	//   57   97:getfield        #246 <Field float RectF.left>
	//   58  100:fload_3         
	//   59  101:fadd            
	//   60  102:aload_0         
	//   61  103:getfield        #121 <Field RectF mCardBounds>
	//   62  106:getfield        #248 <Field float RectF.top>
	//   63  109:fload_3         
	//   64  110:fadd            
	//   65  111:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//   66  114:aload_1         
	//   67  115:aload_0         
	//   68  116:getfield        #171 <Field Path mCornerShadowPath>
	//   69  119:aload_0         
	//   70  120:getfield        #103 <Field Paint mCornerShadowPaint>
	//   71  123:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//*  72  126:iload           6
	//*  73  128:ifeq            156
			canvas.drawRect(0.0F, f, mCardBounds.width() - f3, -mCornerRadius, mEdgeShadowPaint);
	//   74  131:aload_1         
	//   75  132:fconst_0        
	//   76  133:fload_2         
	//   77  134:aload_0         
	//   78  135:getfield        #121 <Field RectF mCardBounds>
	//   79  138:invokevirtual   #235 <Method float RectF.width()>
	//   80  141:fload           5
	//   81  143:fsub            
	//   82  144:aload_0         
	//   83  145:getfield        #116 <Field float mCornerRadius>
	//   84  148:fneg            
	//   85  149:aload_0         
	//   86  150:getfield        #126 <Field Paint mEdgeShadowPaint>
	//   87  153:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(j);
	//   88  156:aload_1         
	//   89  157:iload           8
	//   90  159:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
		j = canvas.save();
	//   91  162:aload_1         
	//   92  163:invokevirtual   #244 <Method int Canvas.save()>
	//   93  166:istore          8
		canvas.translate(mCardBounds.right - f1, mCardBounds.bottom - f1);
	//   94  168:aload_1         
	//   95  169:aload_0         
	//   96  170:getfield        #121 <Field RectF mCardBounds>
	//   97  173:getfield        #264 <Field float RectF.right>
	//   98  176:fload_3         
	//   99  177:fsub            
	//  100  178:aload_0         
	//  101  179:getfield        #121 <Field RectF mCardBounds>
	//  102  182:getfield        #266 <Field float RectF.bottom>
	//  103  185:fload_3         
	//  104  186:fsub            
	//  105  187:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		canvas.rotate(180F);
	//  106  190:aload_1         
	//  107  191:ldc1            #194 <Float 180F>
	//  108  193:invokevirtual   #270 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  109  196:aload_1         
	//  110  197:aload_0         
	//  111  198:getfield        #171 <Field Path mCornerShadowPath>
	//  112  201:aload_0         
	//  113  202:getfield        #103 <Field Paint mCornerShadowPaint>
	//  114  205:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 115  208:iload           6
	//* 116  210:ifeq            243
			canvas.drawRect(0.0F, f, mCardBounds.width() - f3, -mCornerRadius + mShadowSize, mEdgeShadowPaint);
	//  117  213:aload_1         
	//  118  214:fconst_0        
	//  119  215:fload_2         
	//  120  216:aload_0         
	//  121  217:getfield        #121 <Field RectF mCardBounds>
	//  122  220:invokevirtual   #235 <Method float RectF.width()>
	//  123  223:fload           5
	//  124  225:fsub            
	//  125  226:aload_0         
	//  126  227:getfield        #116 <Field float mCornerRadius>
	//  127  230:fneg            
	//  128  231:aload_0         
	//  129  232:getfield        #166 <Field float mShadowSize>
	//  130  235:fadd            
	//  131  236:aload_0         
	//  132  237:getfield        #126 <Field Paint mEdgeShadowPaint>
	//  133  240:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(j);
	//  134  243:aload_1         
	//  135  244:iload           8
	//  136  246:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
		int i = canvas.save();
	//  137  249:aload_1         
	//  138  250:invokevirtual   #244 <Method int Canvas.save()>
	//  139  253:istore          6
		canvas.translate(mCardBounds.left + f1, mCardBounds.bottom - f1);
	//  140  255:aload_1         
	//  141  256:aload_0         
	//  142  257:getfield        #121 <Field RectF mCardBounds>
	//  143  260:getfield        #246 <Field float RectF.left>
	//  144  263:fload_3         
	//  145  264:fadd            
	//  146  265:aload_0         
	//  147  266:getfield        #121 <Field RectF mCardBounds>
	//  148  269:getfield        #266 <Field float RectF.bottom>
	//  149  272:fload_3         
	//  150  273:fsub            
	//  151  274:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		canvas.rotate(270F);
	//  152  277:aload_1         
	//  153  278:ldc1            #200 <Float 270F>
	//  154  280:invokevirtual   #270 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  155  283:aload_1         
	//  156  284:aload_0         
	//  157  285:getfield        #171 <Field Path mCornerShadowPath>
	//  158  288:aload_0         
	//  159  289:getfield        #103 <Field Paint mCornerShadowPaint>
	//  160  292:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 161  295:iload           7
	//* 162  297:ifeq            325
			canvas.drawRect(0.0F, f, mCardBounds.height() - f3, -mCornerRadius, mEdgeShadowPaint);
	//  163  300:aload_1         
	//  164  301:fconst_0        
	//  165  302:fload_2         
	//  166  303:aload_0         
	//  167  304:getfield        #121 <Field RectF mCardBounds>
	//  168  307:invokevirtual   #238 <Method float RectF.height()>
	//  169  310:fload           5
	//  170  312:fsub            
	//  171  313:aload_0         
	//  172  314:getfield        #116 <Field float mCornerRadius>
	//  173  317:fneg            
	//  174  318:aload_0         
	//  175  319:getfield        #126 <Field Paint mEdgeShadowPaint>
	//  176  322:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(i);
	//  177  325:aload_1         
	//  178  326:iload           6
	//  179  328:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
		i = canvas.save();
	//  180  331:aload_1         
	//  181  332:invokevirtual   #244 <Method int Canvas.save()>
	//  182  335:istore          6
		canvas.translate(mCardBounds.right - f1, mCardBounds.top + f1);
	//  183  337:aload_1         
	//  184  338:aload_0         
	//  185  339:getfield        #121 <Field RectF mCardBounds>
	//  186  342:getfield        #264 <Field float RectF.right>
	//  187  345:fload_3         
	//  188  346:fsub            
	//  189  347:aload_0         
	//  190  348:getfield        #121 <Field RectF mCardBounds>
	//  191  351:getfield        #248 <Field float RectF.top>
	//  192  354:fload_3         
	//  193  355:fadd            
	//  194  356:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		canvas.rotate(90F);
	//  195  359:aload_1         
	//  196  360:ldc1            #195 <Float 90F>
	//  197  362:invokevirtual   #270 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  198  365:aload_1         
	//  199  366:aload_0         
	//  200  367:getfield        #171 <Field Path mCornerShadowPath>
	//  201  370:aload_0         
	//  202  371:getfield        #103 <Field Paint mCornerShadowPaint>
	//  203  374:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 204  377:iload           7
	//* 205  379:ifeq            407
			canvas.drawRect(0.0F, f, mCardBounds.height() - f3, -mCornerRadius, mEdgeShadowPaint);
	//  206  382:aload_1         
	//  207  383:fconst_0        
	//  208  384:fload_2         
	//  209  385:aload_0         
	//  210  386:getfield        #121 <Field RectF mCardBounds>
	//  211  389:invokevirtual   #238 <Method float RectF.height()>
	//  212  392:fload           5
	//  213  394:fsub            
	//  214  395:aload_0         
	//  215  396:getfield        #116 <Field float mCornerRadius>
	//  216  399:fneg            
	//  217  400:aload_0         
	//  218  401:getfield        #126 <Field Paint mEdgeShadowPaint>
	//  219  404:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(i);
	//  220  407:aload_1         
	//  221  408:iload           6
	//  222  410:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
	//  223  413:return          
	}

	private void setBackground(ColorStateList colorstatelist)
	{
		ColorStateList colorstatelist1 = colorstatelist;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(colorstatelist == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       11
			colorstatelist1 = ColorStateList.valueOf(0);
	//    4    6:iconst_0        
	//    5    7:invokestatic    #276 <Method ColorStateList ColorStateList.valueOf(int)>
	//    6   10:astore_2        
		mBackground = colorstatelist1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #278 <Field ColorStateList mBackground>
		mPaint.setColor(mBackground.getColorForState(getState(), mBackground.getDefaultColor()));
	//   10   16:aload_0         
	//   11   17:getfield        #97  <Field Paint mPaint>
	//   12   20:aload_0         
	//   13   21:getfield        #278 <Field ColorStateList mBackground>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #282 <Method int[] getState()>
	//   16   28:aload_0         
	//   17   29:getfield        #278 <Field ColorStateList mBackground>
	//   18   32:invokevirtual   #285 <Method int ColorStateList.getDefaultColor()>
	//   19   35:invokevirtual   #289 <Method int ColorStateList.getColorForState(int[], int)>
	//   20   38:invokevirtual   #292 <Method void Paint.setColor(int)>
	//   21   41:return          
	}

	private void setShadowSize(float f, float f1)
	{
		if(f < 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #294 <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #295 <Method void StringBuilder()>
	//    7   13:astore          4
			stringbuilder.append("Invalid shadow size ");
	//    8   15:aload           4
	//    9   17:ldc2            #297 <String "Invalid shadow size ">
	//   10   20:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(f);
	//   12   24:aload           4
	//   13   26:fload_1         
	//   14   27:invokevirtual   #304 <Method StringBuilder StringBuilder.append(float)>
	//   15   30:pop             
			stringbuilder.append(". Must be >= 0");
	//   16   31:aload           4
	//   17   33:ldc2            #306 <String ". Must be >= 0">
	//   18   36:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   40:new             #308 <Class IllegalArgumentException>
	//   21   43:dup             
	//   22   44:aload           4
	//   23   46:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   24   49:invokespecial   #315 <Method void IllegalArgumentException(String)>
	//   25   52:athrow          
		}
		if(f1 < 0.0F)
	//*  26   53:fload_2         
	//*  27   54:fconst_0        
	//*  28   55:fcmpg           
	//*  29   56:ifge            106
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   59:new             #294 <Class StringBuilder>
	//   31   62:dup             
	//   32   63:invokespecial   #295 <Method void StringBuilder()>
	//   33   66:astore          4
			stringbuilder1.append("Invalid max shadow size ");
	//   34   68:aload           4
	//   35   70:ldc2            #317 <String "Invalid max shadow size ">
	//   36   73:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
			stringbuilder1.append(f1);
	//   38   77:aload           4
	//   39   79:fload_2         
	//   40   80:invokevirtual   #304 <Method StringBuilder StringBuilder.append(float)>
	//   41   83:pop             
			stringbuilder1.append(". Must be >= 0");
	//   42   84:aload           4
	//   43   86:ldc2            #306 <String ". Must be >= 0">
	//   44   89:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   46   93:new             #308 <Class IllegalArgumentException>
	//   47   96:dup             
	//   48   97:aload           4
	//   49   99:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   50  102:invokespecial   #315 <Method void IllegalArgumentException(String)>
	//   51  105:athrow          
		}
		float f2 = toEven(f);
	//   52  106:aload_0         
	//   53  107:fload_1         
	//   54  108:invokespecial   #321 <Method int toEven(float)>
	//   55  111:i2f             
	//   56  112:fstore_3        
		f1 = toEven(f1);
	//   57  113:aload_0         
	//   58  114:fload_2         
	//   59  115:invokespecial   #321 <Method int toEven(float)>
	//   60  118:i2f             
	//   61  119:fstore_2        
		f = f2;
	//   62  120:fload_3         
	//   63  121:fstore_1        
		if(f2 > f1)
	//*  64  122:fload_3         
	//*  65  123:fload_2         
	//*  66  124:fcmpl           
	//*  67  125:ifle            142
		{
			if(!mPrintedShadowClipWarning)
	//*  68  128:aload_0         
	//*  69  129:getfield        #62  <Field boolean mPrintedShadowClipWarning>
	//*  70  132:ifne            140
				mPrintedShadowClipWarning = true;
	//   71  135:aload_0         
	//   72  136:iconst_1        
	//   73  137:putfield        #62  <Field boolean mPrintedShadowClipWarning>
			f = f1;
	//   74  140:fload_2         
	//   75  141:fstore_1        
		}
		if(mRawShadowSize == f && mRawMaxShadowSize == f1)
	//*  76  142:aload_0         
	//*  77  143:getfield        #231 <Field float mRawShadowSize>
	//*  78  146:fload_1         
	//*  79  147:fcmpl           
	//*  80  148:ifne            161
	//*  81  151:aload_0         
	//*  82  152:getfield        #138 <Field float mRawMaxShadowSize>
	//*  83  155:fload_2         
	//*  84  156:fcmpl           
	//*  85  157:ifne            161
		{
			return;
	//   86  160:return          
		} else
		{
			mRawShadowSize = f;
	//   87  161:aload_0         
	//   88  162:fload_1         
	//   89  163:putfield        #231 <Field float mRawShadowSize>
			mRawMaxShadowSize = f1;
	//   90  166:aload_0         
	//   91  167:fload_2         
	//   92  168:putfield        #138 <Field float mRawMaxShadowSize>
			mShadowSize = (int)(f * 1.5F + (float)mInsetShadow + 0.5F);
	//   93  171:aload_0         
	//   94  172:fload_1         
	//   95  173:ldc1            #12  <Float 1.5F>
	//   96  175:fmul            
	//   97  176:aload_0         
	//   98  177:getfield        #90  <Field int mInsetShadow>
	//   99  180:i2f             
	//  100  181:fadd            
	//  101  182:ldc1            #114 <Float 0.5F>
	//  102  184:fadd            
	//  103  185:f2i             
	//  104  186:i2f             
	//  105  187:putfield        #166 <Field float mShadowSize>
			mDirty = true;
	//  106  190:aload_0         
	//  107  191:iconst_1        
	//  108  192:putfield        #58  <Field boolean mDirty>
			invalidateSelf();
	//  109  195:aload_0         
	//  110  196:invokevirtual   #324 <Method void invalidateSelf()>
			return;
	//  111  199:return          
		}
	}

	private int toEven(float f)
	{
		int i = (int)(f + 0.5F);
	//    0    0:fload_1         
	//    1    1:ldc1            #114 <Float 0.5F>
	//    2    3:fadd            
	//    3    4:f2i             
	//    4    5:istore_2        
		if(i % 2 == 1)
	//*   5    6:iload_2         
	//*   6    7:iconst_2        
	//*   7    8:irem            
	//*   8    9:iconst_1        
	//*   9   10:icmpne          17
			return i - 1;
	//   10   13:iload_2         
	//   11   14:iconst_1        
	//   12   15:isub            
	//   13   16:ireturn         
		else
			return i;
	//   14   17:iload_2         
	//   15   18:ireturn         
	}

	public void draw(Canvas canvas)
	{
		if(mDirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field boolean mDirty>
	//*   2    4:ifeq            20
		{
			buildComponents(getBounds());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #329 <Method Rect getBounds()>
	//    6   12:invokespecial   #331 <Method void buildComponents(Rect)>
			mDirty = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #58  <Field boolean mDirty>
		}
		canvas.translate(0.0F, mRawShadowSize / 2.0F);
	//   10   20:aload_1         
	//   11   21:fconst_0        
	//   12   22:aload_0         
	//   13   23:getfield        #231 <Field float mRawShadowSize>
	//   14   26:fconst_2        
	//   15   27:fdiv            
	//   16   28:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		drawShadow(canvas);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokespecial   #333 <Method void drawShadow(Canvas)>
		canvas.translate(0.0F, -mRawShadowSize / 2.0F);
	//   20   36:aload_1         
	//   21   37:fconst_0        
	//   22   38:aload_0         
	//   23   39:getfield        #231 <Field float mRawShadowSize>
	//   24   42:fneg            
	//   25   43:fconst_2        
	//   26   44:fdiv            
	//   27   45:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		sRoundRectHelper.drawRoundRect(canvas, mCardBounds, mCornerRadius, mPaint);
	//   28   48:getstatic       #335 <Field RoundRectDrawableWithShadow$RoundRectHelper sRoundRectHelper>
	//   29   51:aload_1         
	//   30   52:aload_0         
	//   31   53:getfield        #121 <Field RectF mCardBounds>
	//   32   56:aload_0         
	//   33   57:getfield        #116 <Field float mCornerRadius>
	//   34   60:aload_0         
	//   35   61:getfield        #97  <Field Paint mPaint>
	//   36   64:invokeinterface #339 <Method void RoundRectDrawableWithShadow$RoundRectHelper.drawRoundRect(Canvas, RectF, float, Paint)>
	//   37   69:return          
	}

	ColorStateList getColor()
	{
		return mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ColorStateList mBackground>
	//    2    4:areturn         
	}

	float getCornerRadius()
	{
		return mCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field float mCornerRadius>
	//    2    4:freturn         
	}

	void getMaxShadowAndCornerPadding(Rect rect)
	{
		getPadding(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #346 <Method boolean getPadding(Rect)>
	//    3    5:pop             
	//    4    6:return          
	}

	float getMaxShadowSize()
	{
		return mRawMaxShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field float mRawMaxShadowSize>
	//    2    4:freturn         
	}

	float getMinHeight()
	{
		return Math.max(mRawMaxShadowSize, mCornerRadius + (float)mInsetShadow + (mRawMaxShadowSize * 1.5F) / 2.0F) * 2.0F + (mRawMaxShadowSize * 1.5F + (float)mInsetShadow) * 2.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field float mRawMaxShadowSize>
	//    2    4:aload_0         
	//    3    5:getfield        #116 <Field float mCornerRadius>
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field int mInsetShadow>
	//    6   12:i2f             
	//    7   13:fadd            
	//    8   14:aload_0         
	//    9   15:getfield        #138 <Field float mRawMaxShadowSize>
	//   10   18:ldc1            #12  <Float 1.5F>
	//   11   20:fmul            
	//   12   21:fconst_2        
	//   13   22:fdiv            
	//   14   23:fadd            
	//   15   24:invokestatic    #352 <Method float Math.max(float, float)>
	//   16   27:fconst_2        
	//   17   28:fmul            
	//   18   29:aload_0         
	//   19   30:getfield        #138 <Field float mRawMaxShadowSize>
	//   20   33:ldc1            #12  <Float 1.5F>
	//   21   35:fmul            
	//   22   36:aload_0         
	//   23   37:getfield        #90  <Field int mInsetShadow>
	//   24   40:i2f             
	//   25   41:fadd            
	//   26   42:fconst_2        
	//   27   43:fmul            
	//   28   44:fadd            
	//   29   45:freturn         
	}

	float getMinWidth()
	{
		return Math.max(mRawMaxShadowSize, mCornerRadius + (float)mInsetShadow + mRawMaxShadowSize / 2.0F) * 2.0F + (mRawMaxShadowSize + (float)mInsetShadow) * 2.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field float mRawMaxShadowSize>
	//    2    4:aload_0         
	//    3    5:getfield        #116 <Field float mCornerRadius>
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field int mInsetShadow>
	//    6   12:i2f             
	//    7   13:fadd            
	//    8   14:aload_0         
	//    9   15:getfield        #138 <Field float mRawMaxShadowSize>
	//   10   18:fconst_2        
	//   11   19:fdiv            
	//   12   20:fadd            
	//   13   21:invokestatic    #352 <Method float Math.max(float, float)>
	//   14   24:fconst_2        
	//   15   25:fmul            
	//   16   26:aload_0         
	//   17   27:getfield        #138 <Field float mRawMaxShadowSize>
	//   18   30:aload_0         
	//   19   31:getfield        #90  <Field int mInsetShadow>
	//   20   34:i2f             
	//   21   35:fadd            
	//   22   36:fconst_2        
	//   23   37:fmul            
	//   24   38:fadd            
	//   25   39:freturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		int i = (int)Math.ceil(calculateVerticalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field float mRawMaxShadowSize>
	//    2    4:aload_0         
	//    3    5:getfield        #116 <Field float mCornerRadius>
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field boolean mAddPaddingForCorners>
	//    6   12:invokestatic    #356 <Method float calculateVerticalPadding(float, float, boolean)>
	//    7   15:f2d             
	//    8   16:invokestatic    #359 <Method double Math.ceil(double)>
	//    9   19:d2i             
	//   10   20:istore_2        
		int j = (int)Math.ceil(calculateHorizontalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
	//   11   21:aload_0         
	//   12   22:getfield        #138 <Field float mRawMaxShadowSize>
	//   13   25:aload_0         
	//   14   26:getfield        #116 <Field float mCornerRadius>
	//   15   29:aload_0         
	//   16   30:getfield        #60  <Field boolean mAddPaddingForCorners>
	//   17   33:invokestatic    #361 <Method float calculateHorizontalPadding(float, float, boolean)>
	//   18   36:f2d             
	//   19   37:invokestatic    #359 <Method double Math.ceil(double)>
	//   20   40:d2i             
	//   21   41:istore_3        
		rect.set(j, i, j, i);
	//   22   42:aload_1         
	//   23   43:iload_3         
	//   24   44:iload_2         
	//   25   45:iload_3         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #364 <Method void Rect.set(int, int, int, int)>
		return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
	}

	float getShadowSize()
	{
		return mRawShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field float mRawShadowSize>
	//    2    4:freturn         
	}

	public boolean isStateful()
	{
		return mBackground != null && mBackground.isStateful() || super.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ColorStateList mBackground>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #278 <Field ColorStateList mBackground>
	//    5   11:invokevirtual   #369 <Method boolean ColorStateList.isStateful()>
	//    6   14:ifne            24
	//    7   17:aload_0         
	//    8   18:invokespecial   #370 <Method boolean Drawable.isStateful()>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		super.onBoundsChange(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #373 <Method void Drawable.onBoundsChange(Rect)>
		mDirty = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #58  <Field boolean mDirty>
	//    6   10:return          
	}

	protected boolean onStateChange(int ai[])
	{
		int i = mBackground.getColorForState(ai, mBackground.getDefaultColor());
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ColorStateList mBackground>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #278 <Field ColorStateList mBackground>
	//    5    9:invokevirtual   #285 <Method int ColorStateList.getDefaultColor()>
	//    6   12:invokevirtual   #289 <Method int ColorStateList.getColorForState(int[], int)>
	//    7   15:istore_2        
		if(mPaint.getColor() == i)
	//*   8   16:aload_0         
	//*   9   17:getfield        #97  <Field Paint mPaint>
	//*  10   20:invokevirtual   #377 <Method int Paint.getColor()>
	//*  11   23:iload_2         
	//*  12   24:icmpne          29
		{
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
		} else
		{
			mPaint.setColor(i);
	//   15   29:aload_0         
	//   16   30:getfield        #97  <Field Paint mPaint>
	//   17   33:iload_2         
	//   18   34:invokevirtual   #292 <Method void Paint.setColor(int)>
			mDirty = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #58  <Field boolean mDirty>
			invalidateSelf();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #324 <Method void invalidateSelf()>
			return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
		}
	}

	void setAddPaddingForCorners(boolean flag)
	{
		mAddPaddingForCorners = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean mAddPaddingForCorners>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #324 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setAlpha(int i)
	{
		mPaint.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Paint mPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #381 <Method void Paint.setAlpha(int)>
		mCornerShadowPaint.setAlpha(i);
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field Paint mCornerShadowPaint>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #381 <Method void Paint.setAlpha(int)>
		mEdgeShadowPaint.setAlpha(i);
	//    8   16:aload_0         
	//    9   17:getfield        #126 <Field Paint mEdgeShadowPaint>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #381 <Method void Paint.setAlpha(int)>
	//   12   24:return          
	}

	void setColor(ColorStateList colorstatelist)
	{
		setBackground(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void setBackground(ColorStateList)>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #324 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #388 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setCornerRadius(float f)
	{
		if(f < 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            48
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #294 <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #295 <Method void StringBuilder()>
	//    7   13:astore_2        
			stringbuilder.append("Invalid radius ");
	//    8   14:aload_2         
	//    9   15:ldc2            #391 <String "Invalid radius ">
	//   10   18:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
			stringbuilder.append(f);
	//   12   22:aload_2         
	//   13   23:fload_1         
	//   14   24:invokevirtual   #304 <Method StringBuilder StringBuilder.append(float)>
	//   15   27:pop             
			stringbuilder.append(". Must be >= 0");
	//   16   28:aload_2         
	//   17   29:ldc2            #306 <String ". Must be >= 0">
	//   18   32:invokevirtual   #301 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   36:new             #308 <Class IllegalArgumentException>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   24   44:invokespecial   #315 <Method void IllegalArgumentException(String)>
	//   25   47:athrow          
		}
		f = (int)(f + 0.5F);
	//   26   48:fload_1         
	//   27   49:ldc1            #114 <Float 0.5F>
	//   28   51:fadd            
	//   29   52:f2i             
	//   30   53:i2f             
	//   31   54:fstore_1        
		if(mCornerRadius == f)
	//*  32   55:aload_0         
	//*  33   56:getfield        #116 <Field float mCornerRadius>
	//*  34   59:fload_1         
	//*  35   60:fcmpl           
	//*  36   61:ifne            65
		{
			return;
	//   37   64:return          
		} else
		{
			mCornerRadius = f;
	//   38   65:aload_0         
	//   39   66:fload_1         
	//   40   67:putfield        #116 <Field float mCornerRadius>
			mDirty = true;
	//   41   70:aload_0         
	//   42   71:iconst_1        
	//   43   72:putfield        #58  <Field boolean mDirty>
			invalidateSelf();
	//   44   75:aload_0         
	//   45   76:invokevirtual   #324 <Method void invalidateSelf()>
			return;
	//   46   79:return          
		}
	}

	void setMaxShadowSize(float f)
	{
		setShadowSize(mRawShadowSize, f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #231 <Field float mRawShadowSize>
	//    3    5:fload_1         
	//    4    6:invokespecial   #134 <Method void setShadowSize(float, float)>
	//    5    9:return          
	}

	void setShadowSize(float f)
	{
		setShadowSize(f, mRawMaxShadowSize);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #138 <Field float mRawMaxShadowSize>
	//    4    6:invokespecial   #134 <Method void setShadowSize(float, float)>
	//    5    9:return          
	}

	private static final double COS_45 = Math.cos(Math.toRadians(45D));
	private static final float SHADOW_MULTIPLIER = 1.5F;
	static RoundRectHelper sRoundRectHelper;
	private boolean mAddPaddingForCorners;
	private ColorStateList mBackground;
	private final RectF mCardBounds = new RectF();
	private float mCornerRadius;
	private Paint mCornerShadowPaint;
	private Path mCornerShadowPath;
	private boolean mDirty;
	private Paint mEdgeShadowPaint;
	private final int mInsetShadow;
	private Paint mPaint;
	private boolean mPrintedShadowClipWarning;
	private float mRawMaxShadowSize;
	private float mRawShadowSize;
	private final int mShadowEndColor;
	private float mShadowSize;
	private final int mShadowStartColor;

	static 
	{
	//    0    0:ldc2w           #39  <Double 45D>
	//    1    3:invokestatic    #46  <Method double Math.toRadians(double)>
	//    2    6:invokestatic    #49  <Method double Math.cos(double)>
	//    3    9:putstatic       #51  <Field double COS_45>
	//*   4   12:return          
	}
}
