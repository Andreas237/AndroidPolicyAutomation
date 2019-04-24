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
		mCornerRadius = (int)(0.5F + f);
	//   45   91:aload_0         
	//   46   92:ldc1            #114 <Float 0.5F>
	//   47   94:fload_3         
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
		((Paint) (obj)).setShader(((android.graphics.Shader) (new LinearGradient(0.0F, f1 + f, 0.0F, f2 - f3, new int[] {
			i, j, k
		}, new float[] {
			0.0F, 0.5F, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj1))))));
	//  171  311:aload           8
	//  172  313:new             #221 <Class LinearGradient>
	//  173  316:dup             
	//  174  317:fconst_0        
	//  175  318:fload_2         
	//  176  319:fload_1         
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
			return (float)((double)(1.5F * f) + (1.0D - COS_45) * (double)f1);
	//    2    4:ldc1            #12  <Float 1.5F>
	//    3    6:fload_0         
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
			return 1.5F * f;
	//   15   20:ldc1            #12  <Float 1.5F>
	//   16   22:fload_0         
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
		boolean flag;
		if(mCardBounds.width() - 2.0F * f1 > 0.0F)
	//*  19   29:aload_0         
	//*  20   30:getfield        #121 <Field RectF mCardBounds>
	//*  21   33:invokevirtual   #235 <Method float RectF.width()>
	//*  22   36:fconst_2        
	//*  23   37:fload_3         
	//*  24   38:fmul            
	//*  25   39:fsub            
	//*  26   40:fconst_0        
	//*  27   41:fcmpl           
	//*  28   42:ifle            51
			flag = true;
	//   29   45:iconst_1        
	//   30   46:istore          6
		else
	//*  31   48:goto            54
			flag = false;
	//   32   51:iconst_0        
	//   33   52:istore          6
		boolean flag1;
		if(mCardBounds.height() - 2.0F * f1 > 0.0F)
	//*  34   54:aload_0         
	//*  35   55:getfield        #121 <Field RectF mCardBounds>
	//*  36   58:invokevirtual   #238 <Method float RectF.height()>
	//*  37   61:fconst_2        
	//*  38   62:fload_3         
	//*  39   63:fmul            
	//*  40   64:fsub            
	//*  41   65:fconst_0        
	//*  42   66:fcmpl           
	//*  43   67:ifle            76
			flag1 = true;
	//   44   70:iconst_1        
	//   45   71:istore          7
		else
	//*  46   73:goto            79
			flag1 = false;
	//   47   76:iconst_0        
	//   48   77:istore          7
		int j = canvas.save();
	//   49   79:aload_1         
	//   50   80:invokevirtual   #244 <Method int Canvas.save()>
	//   51   83:istore          8
		canvas.translate(mCardBounds.left + f1, mCardBounds.top + f1);
	//   52   85:aload_1         
	//   53   86:aload_0         
	//   54   87:getfield        #121 <Field RectF mCardBounds>
	//   55   90:getfield        #246 <Field float RectF.left>
	//   56   93:fload_3         
	//   57   94:fadd            
	//   58   95:aload_0         
	//   59   96:getfield        #121 <Field RectF mCardBounds>
	//   60   99:getfield        #248 <Field float RectF.top>
	//   61  102:fload_3         
	//   62  103:fadd            
	//   63  104:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//   64  107:aload_1         
	//   65  108:aload_0         
	//   66  109:getfield        #171 <Field Path mCornerShadowPath>
	//   67  112:aload_0         
	//   68  113:getfield        #103 <Field Paint mCornerShadowPaint>
	//   69  116:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//*  70  119:iload           6
	//*  71  121:ifeq            150
			canvas.drawRect(0.0F, f, mCardBounds.width() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
	//   72  124:aload_1         
	//   73  125:fconst_0        
	//   74  126:fload_2         
	//   75  127:aload_0         
	//   76  128:getfield        #121 <Field RectF mCardBounds>
	//   77  131:invokevirtual   #235 <Method float RectF.width()>
	//   78  134:fconst_2        
	//   79  135:fload_3         
	//   80  136:fmul            
	//   81  137:fsub            
	//   82  138:aload_0         
	//   83  139:getfield        #116 <Field float mCornerRadius>
	//   84  142:fneg            
	//   85  143:aload_0         
	//   86  144:getfield        #126 <Field Paint mEdgeShadowPaint>
	//   87  147:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(j);
	//   88  150:aload_1         
	//   89  151:iload           8
	//   90  153:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
		j = canvas.save();
	//   91  156:aload_1         
	//   92  157:invokevirtual   #244 <Method int Canvas.save()>
	//   93  160:istore          8
		canvas.translate(mCardBounds.right - f1, mCardBounds.bottom - f1);
	//   94  162:aload_1         
	//   95  163:aload_0         
	//   96  164:getfield        #121 <Field RectF mCardBounds>
	//   97  167:getfield        #264 <Field float RectF.right>
	//   98  170:fload_3         
	//   99  171:fsub            
	//  100  172:aload_0         
	//  101  173:getfield        #121 <Field RectF mCardBounds>
	//  102  176:getfield        #266 <Field float RectF.bottom>
	//  103  179:fload_3         
	//  104  180:fsub            
	//  105  181:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		canvas.rotate(180F);
	//  106  184:aload_1         
	//  107  185:ldc1            #194 <Float 180F>
	//  108  187:invokevirtual   #270 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  109  190:aload_1         
	//  110  191:aload_0         
	//  111  192:getfield        #171 <Field Path mCornerShadowPath>
	//  112  195:aload_0         
	//  113  196:getfield        #103 <Field Paint mCornerShadowPaint>
	//  114  199:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 115  202:iload           6
	//* 116  204:ifeq            246
		{
			float f2 = mCardBounds.width();
	//  117  207:aload_0         
	//  118  208:getfield        #121 <Field RectF mCardBounds>
	//  119  211:invokevirtual   #235 <Method float RectF.width()>
	//  120  214:fstore          4
			float f3 = -mCornerRadius;
	//  121  216:aload_0         
	//  122  217:getfield        #116 <Field float mCornerRadius>
	//  123  220:fneg            
	//  124  221:fstore          5
			canvas.drawRect(0.0F, f, f2 - 2.0F * f1, mShadowSize + f3, mEdgeShadowPaint);
	//  125  223:aload_1         
	//  126  224:fconst_0        
	//  127  225:fload_2         
	//  128  226:fload           4
	//  129  228:fconst_2        
	//  130  229:fload_3         
	//  131  230:fmul            
	//  132  231:fsub            
	//  133  232:aload_0         
	//  134  233:getfield        #166 <Field float mShadowSize>
	//  135  236:fload           5
	//  136  238:fadd            
	//  137  239:aload_0         
	//  138  240:getfield        #126 <Field Paint mEdgeShadowPaint>
	//  139  243:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(j);
	//  140  246:aload_1         
	//  141  247:iload           8
	//  142  249:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
		int i = canvas.save();
	//  143  252:aload_1         
	//  144  253:invokevirtual   #244 <Method int Canvas.save()>
	//  145  256:istore          6
		canvas.translate(mCardBounds.left + f1, mCardBounds.bottom - f1);
	//  146  258:aload_1         
	//  147  259:aload_0         
	//  148  260:getfield        #121 <Field RectF mCardBounds>
	//  149  263:getfield        #246 <Field float RectF.left>
	//  150  266:fload_3         
	//  151  267:fadd            
	//  152  268:aload_0         
	//  153  269:getfield        #121 <Field RectF mCardBounds>
	//  154  272:getfield        #266 <Field float RectF.bottom>
	//  155  275:fload_3         
	//  156  276:fsub            
	//  157  277:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		canvas.rotate(270F);
	//  158  280:aload_1         
	//  159  281:ldc1            #200 <Float 270F>
	//  160  283:invokevirtual   #270 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  161  286:aload_1         
	//  162  287:aload_0         
	//  163  288:getfield        #171 <Field Path mCornerShadowPath>
	//  164  291:aload_0         
	//  165  292:getfield        #103 <Field Paint mCornerShadowPaint>
	//  166  295:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 167  298:iload           7
	//* 168  300:ifeq            329
			canvas.drawRect(0.0F, f, mCardBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
	//  169  303:aload_1         
	//  170  304:fconst_0        
	//  171  305:fload_2         
	//  172  306:aload_0         
	//  173  307:getfield        #121 <Field RectF mCardBounds>
	//  174  310:invokevirtual   #238 <Method float RectF.height()>
	//  175  313:fconst_2        
	//  176  314:fload_3         
	//  177  315:fmul            
	//  178  316:fsub            
	//  179  317:aload_0         
	//  180  318:getfield        #116 <Field float mCornerRadius>
	//  181  321:fneg            
	//  182  322:aload_0         
	//  183  323:getfield        #126 <Field Paint mEdgeShadowPaint>
	//  184  326:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(i);
	//  185  329:aload_1         
	//  186  330:iload           6
	//  187  332:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
		i = canvas.save();
	//  188  335:aload_1         
	//  189  336:invokevirtual   #244 <Method int Canvas.save()>
	//  190  339:istore          6
		canvas.translate(mCardBounds.right - f1, mCardBounds.top + f1);
	//  191  341:aload_1         
	//  192  342:aload_0         
	//  193  343:getfield        #121 <Field RectF mCardBounds>
	//  194  346:getfield        #264 <Field float RectF.right>
	//  195  349:fload_3         
	//  196  350:fsub            
	//  197  351:aload_0         
	//  198  352:getfield        #121 <Field RectF mCardBounds>
	//  199  355:getfield        #248 <Field float RectF.top>
	//  200  358:fload_3         
	//  201  359:fadd            
	//  202  360:invokevirtual   #251 <Method void Canvas.translate(float, float)>
		canvas.rotate(90F);
	//  203  363:aload_1         
	//  204  364:ldc1            #195 <Float 90F>
	//  205  366:invokevirtual   #270 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  206  369:aload_1         
	//  207  370:aload_0         
	//  208  371:getfield        #171 <Field Path mCornerShadowPath>
	//  209  374:aload_0         
	//  210  375:getfield        #103 <Field Paint mCornerShadowPaint>
	//  211  378:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 212  381:iload           7
	//* 213  383:ifeq            412
			canvas.drawRect(0.0F, f, mCardBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
	//  214  386:aload_1         
	//  215  387:fconst_0        
	//  216  388:fload_2         
	//  217  389:aload_0         
	//  218  390:getfield        #121 <Field RectF mCardBounds>
	//  219  393:invokevirtual   #238 <Method float RectF.height()>
	//  220  396:fconst_2        
	//  221  397:fload_3         
	//  222  398:fmul            
	//  223  399:fsub            
	//  224  400:aload_0         
	//  225  401:getfield        #116 <Field float mCornerRadius>
	//  226  404:fneg            
	//  227  405:aload_0         
	//  228  406:getfield        #126 <Field Paint mEdgeShadowPaint>
	//  229  409:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(i);
	//  230  412:aload_1         
	//  231  413:iload           6
	//  232  415:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
	//  233  418:return          
	}

	private void setBackground(ColorStateList colorstatelist)
	{
		if(colorstatelist == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			colorstatelist = ColorStateList.valueOf(0);
	//    2    4:iconst_0        
	//    3    5:invokestatic    #276 <Method ColorStateList ColorStateList.valueOf(int)>
	//    4    8:astore_1        
	//*   5    9:goto            12
		mBackground = colorstatelist;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #278 <Field ColorStateList mBackground>
		mPaint.setColor(mBackground.getColorForState(getState(), mBackground.getDefaultColor()));
	//    9   17:aload_0         
	//   10   18:getfield        #97  <Field Paint mPaint>
	//   11   21:aload_0         
	//   12   22:getfield        #278 <Field ColorStateList mBackground>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #282 <Method int[] getState()>
	//   15   29:aload_0         
	//   16   30:getfield        #278 <Field ColorStateList mBackground>
	//   17   33:invokevirtual   #285 <Method int ColorStateList.getDefaultColor()>
	//   18   36:invokevirtual   #289 <Method int ColorStateList.getColorForState(int[], int)>
	//   19   39:invokevirtual   #292 <Method void Paint.setColor(int)>
	//   20   42:return          
	}

	private void setShadowSize(float f, float f1)
	{
		if(f < 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            40
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid shadow size ").append(f).append(". Must be >= 0").toString());
	//    4    6:new             #294 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:new             #296 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #297 <Method void StringBuilder()>
	//    9   17:ldc2            #299 <String "Invalid shadow size ">
	//   10   20:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:fload_1         
	//   12   24:invokevirtual   #306 <Method StringBuilder StringBuilder.append(float)>
	//   13   27:ldc2            #308 <String ". Must be >= 0">
	//   14   30:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #315 <Method void IllegalArgumentException(String)>
	//   17   39:athrow          
		if(f1 < 0.0F)
	//*  18   40:fload_2         
	//*  19   41:fconst_0        
	//*  20   42:fcmpg           
	//*  21   43:ifge            80
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid max shadow size ").append(f1).append(". Must be >= 0").toString());
	//   22   46:new             #294 <Class IllegalArgumentException>
	//   23   49:dup             
	//   24   50:new             #296 <Class StringBuilder>
	//   25   53:dup             
	//   26   54:invokespecial   #297 <Method void StringBuilder()>
	//   27   57:ldc2            #317 <String "Invalid max shadow size ">
	//   28   60:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:fload_2         
	//   30   64:invokevirtual   #306 <Method StringBuilder StringBuilder.append(float)>
	//   31   67:ldc2            #308 <String ". Must be >= 0">
	//   32   70:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   34   76:invokespecial   #315 <Method void IllegalArgumentException(String)>
	//   35   79:athrow          
		float f2 = toEven(f);
	//   36   80:aload_0         
	//   37   81:fload_1         
	//   38   82:invokespecial   #321 <Method int toEven(float)>
	//   39   85:i2f             
	//   40   86:fstore_3        
		float f3 = toEven(f1);
	//   41   87:aload_0         
	//   42   88:fload_2         
	//   43   89:invokespecial   #321 <Method int toEven(float)>
	//   44   92:i2f             
	//   45   93:fstore          4
		f = f2;
	//   46   95:fload_3         
	//   47   96:fstore_1        
		if(f2 > f3)
	//*  48   97:fload_3         
	//*  49   98:fload           4
	//*  50  100:fcmpl           
	//*  51  101:ifle            123
		{
			f1 = f3;
	//   52  104:fload           4
	//   53  106:fstore_2        
			f = f1;
	//   54  107:fload_2         
	//   55  108:fstore_1        
			if(!mPrintedShadowClipWarning)
	//*  56  109:aload_0         
	//*  57  110:getfield        #62  <Field boolean mPrintedShadowClipWarning>
	//*  58  113:ifne            123
			{
				mPrintedShadowClipWarning = true;
	//   59  116:aload_0         
	//   60  117:iconst_1        
	//   61  118:putfield        #62  <Field boolean mPrintedShadowClipWarning>
				f = f1;
	//   62  121:fload_2         
	//   63  122:fstore_1        
			}
		}
		if(mRawShadowSize == f && mRawMaxShadowSize == f3)
	//*  64  123:aload_0         
	//*  65  124:getfield        #231 <Field float mRawShadowSize>
	//*  66  127:fload_1         
	//*  67  128:fcmpl           
	//*  68  129:ifne            143
	//*  69  132:aload_0         
	//*  70  133:getfield        #138 <Field float mRawMaxShadowSize>
	//*  71  136:fload           4
	//*  72  138:fcmpl           
	//*  73  139:ifne            143
		{
			return;
	//   74  142:return          
		} else
		{
			mRawShadowSize = f;
	//   75  143:aload_0         
	//   76  144:fload_1         
	//   77  145:putfield        #231 <Field float mRawShadowSize>
			mRawMaxShadowSize = f3;
	//   78  148:aload_0         
	//   79  149:fload           4
	//   80  151:putfield        #138 <Field float mRawMaxShadowSize>
			mShadowSize = (int)(1.5F * f + (float)mInsetShadow + 0.5F);
	//   81  154:aload_0         
	//   82  155:ldc1            #12  <Float 1.5F>
	//   83  157:fload_1         
	//   84  158:fmul            
	//   85  159:aload_0         
	//   86  160:getfield        #90  <Field int mInsetShadow>
	//   87  163:i2f             
	//   88  164:fadd            
	//   89  165:ldc1            #114 <Float 0.5F>
	//   90  167:fadd            
	//   91  168:f2i             
	//   92  169:i2f             
	//   93  170:putfield        #166 <Field float mShadowSize>
			mDirty = true;
	//   94  173:aload_0         
	//   95  174:iconst_1        
	//   96  175:putfield        #58  <Field boolean mDirty>
			invalidateSelf();
	//   97  178:aload_0         
	//   98  179:invokevirtual   #324 <Method void invalidateSelf()>
			return;
	//   99  182:return          
		}
	}

	private int toEven(float f)
	{
		int i = (int)(0.5F + f);
	//    0    0:ldc1            #114 <Float 0.5F>
	//    1    2:fload_1         
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
		float f = Math.max(mRawMaxShadowSize, mCornerRadius + (float)mInsetShadow + (mRawMaxShadowSize * 1.5F) / 2.0F);
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
	//   16   27:fstore_1        
		return (mRawMaxShadowSize * 1.5F + (float)mInsetShadow) * 2.0F + 2.0F * f;
	//   17   28:aload_0         
	//   18   29:getfield        #138 <Field float mRawMaxShadowSize>
	//   19   32:ldc1            #12  <Float 1.5F>
	//   20   34:fmul            
	//   21   35:aload_0         
	//   22   36:getfield        #90  <Field int mInsetShadow>
	//   23   39:i2f             
	//   24   40:fadd            
	//   25   41:fconst_2        
	//   26   42:fmul            
	//   27   43:fconst_2        
	//   28   44:fload_1         
	//   29   45:fmul            
	//   30   46:fadd            
	//   31   47:freturn         
	}

	float getMinWidth()
	{
		float f = Math.max(mRawMaxShadowSize, mCornerRadius + (float)mInsetShadow + mRawMaxShadowSize / 2.0F);
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
	//   14   24:fstore_1        
		return (mRawMaxShadowSize + (float)mInsetShadow) * 2.0F + 2.0F * f;
	//   15   25:aload_0         
	//   16   26:getfield        #138 <Field float mRawMaxShadowSize>
	//   17   29:aload_0         
	//   18   30:getfield        #90  <Field int mInsetShadow>
	//   19   33:i2f             
	//   20   34:fadd            
	//   21   35:fconst_2        
	//   22   36:fmul            
	//   23   37:fconst_2        
	//   24   38:fload_1         
	//   25   39:fmul            
	//   26   40:fadd            
	//   27   41:freturn         
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
	//*   3    3:ifge            40
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid radius ").append(f).append(". Must be >= 0").toString());
	//    4    6:new             #294 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:new             #296 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #297 <Method void StringBuilder()>
	//    9   17:ldc2            #391 <String "Invalid radius ">
	//   10   20:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:fload_1         
	//   12   24:invokevirtual   #306 <Method StringBuilder StringBuilder.append(float)>
	//   13   27:ldc2            #308 <String ". Must be >= 0">
	//   14   30:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #315 <Method void IllegalArgumentException(String)>
	//   17   39:athrow          
		f = (int)(0.5F + f);
	//   18   40:ldc1            #114 <Float 0.5F>
	//   19   42:fload_1         
	//   20   43:fadd            
	//   21   44:f2i             
	//   22   45:i2f             
	//   23   46:fstore_1        
		if(mCornerRadius == f)
	//*  24   47:aload_0         
	//*  25   48:getfield        #116 <Field float mCornerRadius>
	//*  26   51:fload_1         
	//*  27   52:fcmpl           
	//*  28   53:ifne            57
		{
			return;
	//   29   56:return          
		} else
		{
			mCornerRadius = f;
	//   30   57:aload_0         
	//   31   58:fload_1         
	//   32   59:putfield        #116 <Field float mCornerRadius>
			mDirty = true;
	//   33   62:aload_0         
	//   34   63:iconst_1        
	//   35   64:putfield        #58  <Field boolean mDirty>
			invalidateSelf();
	//   36   67:aload_0         
	//   37   68:invokevirtual   #324 <Method void invalidateSelf()>
			return;
	//   38   71:return          
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
