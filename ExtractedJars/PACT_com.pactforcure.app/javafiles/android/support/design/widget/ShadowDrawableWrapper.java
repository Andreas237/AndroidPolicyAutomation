// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.drawable.DrawableWrapper;

class ShadowDrawableWrapper extends DrawableWrapper
{

	public ShadowDrawableWrapper(Context context, Drawable drawable, float f, float f1, float f2)
	{
		super(drawable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #57  <Method void DrawableWrapper(Drawable)>
		mDirty = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #59  <Field boolean mDirty>
		mAddPaddingForCorners = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #61  <Field boolean mAddPaddingForCorners>
		mPrintedShadowClipWarning = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #63  <Field boolean mPrintedShadowClipWarning>
		mShadowStartColor = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_start_color);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:getstatic       #68  <Field int android.support.design.R$color.design_fab_shadow_start_color>
	//   15   25:invokestatic    #74  <Method int ContextCompat.getColor(Context, int)>
	//   16   28:putfield        #76  <Field int mShadowStartColor>
		mShadowMiddleColor = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_mid_color);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getstatic       #79  <Field int android.support.design.R$color.design_fab_shadow_mid_color>
	//   20   36:invokestatic    #74  <Method int ContextCompat.getColor(Context, int)>
	//   21   39:putfield        #81  <Field int mShadowMiddleColor>
		mShadowEndColor = ContextCompat.getColor(context, android.support.design.R.color.design_fab_shadow_end_color);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getstatic       #84  <Field int android.support.design.R$color.design_fab_shadow_end_color>
	//   25   47:invokestatic    #74  <Method int ContextCompat.getColor(Context, int)>
	//   26   50:putfield        #86  <Field int mShadowEndColor>
	//   27   53:aload_0         
	//   28   54:new             #88  <Class Paint>
	//   29   57:dup             
	//   30   58:iconst_5        
	//   31   59:invokespecial   #91  <Method void Paint(int)>
	//   32   62:putfield        #93  <Field Paint mCornerShadowPaint>
		mCornerShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   33   65:aload_0         
	//   34   66:getfield        #93  <Field Paint mCornerShadowPaint>
	//   35   69:getstatic       #99  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   36   72:invokevirtual   #103 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mCornerRadius = Math.round(f);
	//   37   75:aload_0         
	//   38   76:fload_3         
	//   39   77:invokestatic    #107 <Method int Math.round(float)>
	//   40   80:i2f             
	//   41   81:putfield        #109 <Field float mCornerRadius>
	//   42   84:aload_0         
	//   43   85:new             #111 <Class RectF>
	//   44   88:dup             
	//   45   89:invokespecial   #113 <Method void RectF()>
	//   46   92:putfield        #115 <Field RectF mContentBounds>
		mEdgeShadowPaint = new Paint(mCornerShadowPaint);
	//   47   95:aload_0         
	//   48   96:new             #88  <Class Paint>
	//   49   99:dup             
	//   50  100:aload_0         
	//   51  101:getfield        #93  <Field Paint mCornerShadowPaint>
	//   52  104:invokespecial   #118 <Method void Paint(Paint)>
	//   53  107:putfield        #120 <Field Paint mEdgeShadowPaint>
		mEdgeShadowPaint.setAntiAlias(false);
	//   54  110:aload_0         
	//   55  111:getfield        #120 <Field Paint mEdgeShadowPaint>
	//   56  114:iconst_0        
	//   57  115:invokevirtual   #124 <Method void Paint.setAntiAlias(boolean)>
		setShadowSize(f1, f2);
	//   58  118:aload_0         
	//   59  119:fload           4
	//   60  121:fload           5
	//   61  123:invokevirtual   #128 <Method void setShadowSize(float, float)>
	//   62  126:return          
	}

	private void buildComponents(Rect rect)
	{
		float f = mRawMaxShadowSize * 1.5F;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float mRawMaxShadowSize>
	//    2    4:ldc1            #13  <Float 1.5F>
	//    3    6:fmul            
	//    4    7:fstore_2        
		mContentBounds.set((float)rect.left + mRawMaxShadowSize, (float)rect.top + f, (float)rect.right - mRawMaxShadowSize, (float)rect.bottom - f);
	//    5    8:aload_0         
	//    6    9:getfield        #115 <Field RectF mContentBounds>
	//    7   12:aload_1         
	//    8   13:getfield        #137 <Field int Rect.left>
	//    9   16:i2f             
	//   10   17:aload_0         
	//   11   18:getfield        #132 <Field float mRawMaxShadowSize>
	//   12   21:fadd            
	//   13   22:aload_1         
	//   14   23:getfield        #140 <Field int Rect.top>
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fadd            
	//   18   29:aload_1         
	//   19   30:getfield        #143 <Field int Rect.right>
	//   20   33:i2f             
	//   21   34:aload_0         
	//   22   35:getfield        #132 <Field float mRawMaxShadowSize>
	//   23   38:fsub            
	//   24   39:aload_1         
	//   25   40:getfield        #146 <Field int Rect.bottom>
	//   26   43:i2f             
	//   27   44:fload_2         
	//   28   45:fsub            
	//   29   46:invokevirtual   #150 <Method void RectF.set(float, float, float, float)>
		getWrappedDrawable().setBounds((int)mContentBounds.left, (int)mContentBounds.top, (int)mContentBounds.right, (int)mContentBounds.bottom);
	//   30   49:aload_0         
	//   31   50:invokevirtual   #154 <Method Drawable getWrappedDrawable()>
	//   32   53:aload_0         
	//   33   54:getfield        #115 <Field RectF mContentBounds>
	//   34   57:getfield        #156 <Field float RectF.left>
	//   35   60:f2i             
	//   36   61:aload_0         
	//   37   62:getfield        #115 <Field RectF mContentBounds>
	//   38   65:getfield        #158 <Field float RectF.top>
	//   39   68:f2i             
	//   40   69:aload_0         
	//   41   70:getfield        #115 <Field RectF mContentBounds>
	//   42   73:getfield        #160 <Field float RectF.right>
	//   43   76:f2i             
	//   44   77:aload_0         
	//   45   78:getfield        #115 <Field RectF mContentBounds>
	//   46   81:getfield        #162 <Field float RectF.bottom>
	//   47   84:f2i             
	//   48   85:invokevirtual   #168 <Method void Drawable.setBounds(int, int, int, int)>
		buildShadowCorners();
	//   49   88:aload_0         
	//   50   89:invokespecial   #171 <Method void buildShadowCorners()>
	//   51   92:return          
	}

	private void buildShadowCorners()
	{
		Object obj = ((Object) (new RectF(-mCornerRadius, -mCornerRadius, mCornerRadius, mCornerRadius)));
	//    0    0:new             #111 <Class RectF>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field float mCornerRadius>
	//    4    8:fneg            
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field float mCornerRadius>
	//    7   13:fneg            
	//    8   14:aload_0         
	//    9   15:getfield        #109 <Field float mCornerRadius>
	//   10   18:aload_0         
	//   11   19:getfield        #109 <Field float mCornerRadius>
	//   12   22:invokespecial   #173 <Method void RectF(float, float, float, float)>
	//   13   25:astore          7
		RectF rectf = new RectF(((RectF) (obj)));
	//   14   27:new             #111 <Class RectF>
	//   15   30:dup             
	//   16   31:aload           7
	//   17   33:invokespecial   #176 <Method void RectF(RectF)>
	//   18   36:astore          8
		rectf.inset(-mShadowSize, -mShadowSize);
	//   19   38:aload           8
	//   20   40:aload_0         
	//   21   41:getfield        #178 <Field float mShadowSize>
	//   22   44:fneg            
	//   23   45:aload_0         
	//   24   46:getfield        #178 <Field float mShadowSize>
	//   25   49:fneg            
	//   26   50:invokevirtual   #181 <Method void RectF.inset(float, float)>
		float f;
		float f2;
		int j;
		int l;
		int j1;
		Paint paint1;
		if(mCornerShadowPath == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #183 <Field Path mCornerShadowPath>
	//*  29   57:ifnonnull       361
			mCornerShadowPath = new Path();
	//   30   60:aload_0         
	//   31   61:new             #185 <Class Path>
	//   32   64:dup             
	//   33   65:invokespecial   #186 <Method void Path()>
	//   34   68:putfield        #183 <Field Path mCornerShadowPath>
		else
	//*  35   71:aload_0         
	//*  36   72:getfield        #183 <Field Path mCornerShadowPath>
	//*  37   75:getstatic       #192 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//*  38   78:invokevirtual   #196 <Method void Path.setFillType(android.graphics.Path$FillType)>
	//*  39   81:aload_0         
	//*  40   82:getfield        #183 <Field Path mCornerShadowPath>
	//*  41   85:aload_0         
	//*  42   86:getfield        #109 <Field float mCornerRadius>
	//*  43   89:fneg            
	//*  44   90:fconst_0        
	//*  45   91:invokevirtual   #199 <Method void Path.moveTo(float, float)>
	//*  46   94:aload_0         
	//*  47   95:getfield        #183 <Field Path mCornerShadowPath>
	//*  48   98:aload_0         
	//*  49   99:getfield        #178 <Field float mShadowSize>
	//*  50  102:fneg            
	//*  51  103:fconst_0        
	//*  52  104:invokevirtual   #202 <Method void Path.rLineTo(float, float)>
	//*  53  107:aload_0         
	//*  54  108:getfield        #183 <Field Path mCornerShadowPath>
	//*  55  111:aload           8
	//*  56  113:ldc1            #203 <Float 180F>
	//*  57  115:ldc1            #204 <Float 90F>
	//*  58  117:iconst_0        
	//*  59  118:invokevirtual   #208 <Method void Path.arcTo(RectF, float, float, boolean)>
	//*  60  121:aload_0         
	//*  61  122:getfield        #183 <Field Path mCornerShadowPath>
	//*  62  125:aload           7
	//*  63  127:ldc1            #209 <Float 270F>
	//*  64  129:ldc1            #210 <Float -90F>
	//*  65  131:iconst_0        
	//*  66  132:invokevirtual   #208 <Method void Path.arcTo(RectF, float, float, boolean)>
	//*  67  135:aload_0         
	//*  68  136:getfield        #183 <Field Path mCornerShadowPath>
	//*  69  139:invokevirtual   #213 <Method void Path.close()>
	//*  70  142:aload           8
	//*  71  144:getfield        #158 <Field float RectF.top>
	//*  72  147:fneg            
	//*  73  148:fstore_1        
	//*  74  149:fload_1         
	//*  75  150:fconst_0        
	//*  76  151:fcmpl           
	//*  77  152:ifle            258
	//*  78  155:aload_0         
	//*  79  156:getfield        #109 <Field float mCornerRadius>
	//*  80  159:fload_1         
	//*  81  160:fdiv            
	//*  82  161:fstore_2        
	//*  83  162:fconst_1        
	//*  84  163:fload_2         
	//*  85  164:fsub            
	//*  86  165:fconst_2        
	//*  87  166:fdiv            
	//*  88  167:fstore_3        
	//*  89  168:aload_0         
	//*  90  169:getfield        #93  <Field Paint mCornerShadowPaint>
	//*  91  172:astore          9
	//*  92  174:aload_0         
	//*  93  175:getfield        #76  <Field int mShadowStartColor>
	//*  94  178:istore          4
	//*  95  180:aload_0         
	//*  96  181:getfield        #81  <Field int mShadowMiddleColor>
	//*  97  184:istore          5
	//*  98  186:aload_0         
	//*  99  187:getfield        #86  <Field int mShadowEndColor>
	//* 100  190:istore          6
	//* 101  192:getstatic       #219 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//* 102  195:astore          10
	//* 103  197:aload           9
	//* 104  199:new             #221 <Class RadialGradient>
	//* 105  202:dup             
	//* 106  203:fconst_0        
	//* 107  204:fconst_0        
	//* 108  205:fload_1         
	//* 109  206:iconst_4        
	//* 110  207:newarray        int[]
	//* 111  209:dup             
	//* 112  210:iconst_0        
	//* 113  211:iconst_0        
	//* 114  212:iastore         
	//* 115  213:dup             
	//* 116  214:iconst_1        
	//* 117  215:iload           4
	//* 118  217:iastore         
	//* 119  218:dup             
	//* 120  219:iconst_2        
	//* 121  220:iload           5
	//* 122  222:iastore         
	//* 123  223:dup             
	//* 124  224:iconst_3        
	//* 125  225:iload           6
	//* 126  227:iastore         
	//* 127  228:iconst_4        
	//* 128  229:newarray        float[]
	//* 129  231:dup             
	//* 130  232:iconst_0        
	//* 131  233:fconst_0        
	//* 132  234:fastore         
	//* 133  235:dup             
	//* 134  236:iconst_1        
	//* 135  237:fload_2         
	//* 136  238:fastore         
	//* 137  239:dup             
	//* 138  240:iconst_2        
	//* 139  241:fload_2         
	//* 140  242:fload_3         
	//* 141  243:fadd            
	//* 142  244:fastore         
	//* 143  245:dup             
	//* 144  246:iconst_3        
	//* 145  247:fconst_1        
	//* 146  248:fastore         
	//* 147  249:aload           10
	//* 148  251:invokespecial   #224 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//* 149  254:invokevirtual   #228 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//* 150  257:pop             
	//* 151  258:aload_0         
	//* 152  259:getfield        #120 <Field Paint mEdgeShadowPaint>
	//* 153  262:astore          9
	//* 154  264:aload           7
	//* 155  266:getfield        #158 <Field float RectF.top>
	//* 156  269:fstore_1        
	//* 157  270:aload           8
	//* 158  272:getfield        #158 <Field float RectF.top>
	//* 159  275:fstore_2        
	//* 160  276:aload_0         
	//* 161  277:getfield        #76  <Field int mShadowStartColor>
	//* 162  280:istore          4
	//* 163  282:aload_0         
	//* 164  283:getfield        #81  <Field int mShadowMiddleColor>
	//* 165  286:istore          5
	//* 166  288:aload_0         
	//* 167  289:getfield        #86  <Field int mShadowEndColor>
	//* 168  292:istore          6
	//* 169  294:getstatic       #219 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//* 170  297:astore          7
	//* 171  299:aload           9
	//* 172  301:new             #230 <Class LinearGradient>
	//* 173  304:dup             
	//* 174  305:fconst_0        
	//* 175  306:fload_1         
	//* 176  307:fconst_0        
	//* 177  308:fload_2         
	//* 178  309:iconst_3        
	//* 179  310:newarray        int[]
	//* 180  312:dup             
	//* 181  313:iconst_0        
	//* 182  314:iload           4
	//* 183  316:iastore         
	//* 184  317:dup             
	//* 185  318:iconst_1        
	//* 186  319:iload           5
	//* 187  321:iastore         
	//* 188  322:dup             
	//* 189  323:iconst_2        
	//* 190  324:iload           6
	//* 191  326:iastore         
	//* 192  327:iconst_3        
	//* 193  328:newarray        float[]
	//* 194  330:dup             
	//* 195  331:iconst_0        
	//* 196  332:fconst_0        
	//* 197  333:fastore         
	//* 198  334:dup             
	//* 199  335:iconst_1        
	//* 200  336:ldc1            #11  <Float 0.5F>
	//* 201  338:fastore         
	//* 202  339:dup             
	//* 203  340:iconst_2        
	//* 204  341:fconst_1        
	//* 205  342:fastore         
	//* 206  343:aload           7
	//* 207  345:invokespecial   #233 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//* 208  348:invokevirtual   #228 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//* 209  351:pop             
	//* 210  352:aload_0         
	//* 211  353:getfield        #120 <Field Paint mEdgeShadowPaint>
	//* 212  356:iconst_0        
	//* 213  357:invokevirtual   #124 <Method void Paint.setAntiAlias(boolean)>
	//* 214  360:return          
			mCornerShadowPath.reset();
	//  215  361:aload_0         
	//  216  362:getfield        #183 <Field Path mCornerShadowPath>
	//  217  365:invokevirtual   #236 <Method void Path.reset()>
		mCornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
		mCornerShadowPath.moveTo(-mCornerRadius, 0.0F);
		mCornerShadowPath.rLineTo(-mShadowSize, 0.0F);
		mCornerShadowPath.arcTo(rectf, 180F, 90F, false);
		mCornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
		mCornerShadowPath.close();
		f = -rectf.top;
		if(f > 0.0F)
		{
			float f1 = mCornerRadius / f;
			float f3 = (1.0F - f1) / 2.0F;
			Paint paint = mCornerShadowPaint;
			int i = mShadowStartColor;
			int k = mShadowMiddleColor;
			int i1 = mShadowEndColor;
			android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
			paint.setShader(((android.graphics.Shader) (new RadialGradient(0.0F, 0.0F, f, new int[] {
				0, i, k, i1
			}, new float[] {
				0.0F, f1, f1 + f3, 1.0F
			}, tilemode))));
		}
		paint1 = mEdgeShadowPaint;
		f = ((RectF) (obj)).top;
		f2 = rectf.top;
		j = mShadowStartColor;
		l = mShadowMiddleColor;
		j1 = mShadowEndColor;
		obj = ((Object) (android.graphics.Shader.TileMode.CLAMP));
		paint1.setShader(((android.graphics.Shader) (new LinearGradient(0.0F, f, 0.0F, f2, new int[] {
			j, l, j1
		}, new float[] {
			0.0F, 0.5F, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj))))));
		mEdgeShadowPaint.setAntiAlias(false);
	//* 218  368:goto            71
	}

	public static float calculateHorizontalPadding(float f, float f1, boolean flag)
	{
		float f2 = f;
	//    0    0:fload_0         
	//    1    1:fstore_3        
		if(flag)
	//*   2    2:iload_2         
	//*   3    3:ifeq            19
			f2 = (float)((double)f + (1.0D - COS_45) * (double)f1);
	//    4    6:fload_0         
	//    5    7:f2d             
	//    6    8:dconst_1        
	//    7    9:getstatic       #51  <Field double COS_45>
	//    8   12:dsub            
	//    9   13:fload_1         
	//   10   14:f2d             
	//   11   15:dmul            
	//   12   16:dadd            
	//   13   17:d2f             
	//   14   18:fstore_3        
		return f2;
	//   15   19:fload_3         
	//   16   20:freturn         
	}

	public static float calculateVerticalPadding(float f, float f1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
			return (float)((double)(1.5F * f) + (1.0D - COS_45) * (double)f1);
	//    2    4:ldc1            #13  <Float 1.5F>
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
	//   15   20:ldc1            #13  <Float 1.5F>
	//   16   22:fload_0         
	//   17   23:fmul            
	//   18   24:freturn         
	}

	private void drawShadow(Canvas canvas)
	{
		int j = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #247 <Method int Canvas.save()>
	//    2    4:istore          12
		canvas.rotate(mRotation, mContentBounds.centerX(), mContentBounds.centerY());
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:getfield        #249 <Field float mRotation>
	//    6   11:aload_0         
	//    7   12:getfield        #115 <Field RectF mContentBounds>
	//    8   15:invokevirtual   #253 <Method float RectF.centerX()>
	//    9   18:aload_0         
	//   10   19:getfield        #115 <Field RectF mContentBounds>
	//   11   22:invokevirtual   #256 <Method float RectF.centerY()>
	//   12   25:invokevirtual   #260 <Method void Canvas.rotate(float, float, float)>
		float f = -mCornerRadius - mShadowSize;
	//   13   28:aload_0         
	//   14   29:getfield        #109 <Field float mCornerRadius>
	//   15   32:fneg            
	//   16   33:aload_0         
	//   17   34:getfield        #178 <Field float mShadowSize>
	//   18   37:fsub            
	//   19   38:fstore_2        
		float f1 = mCornerRadius;
	//   20   39:aload_0         
	//   21   40:getfield        #109 <Field float mCornerRadius>
	//   22   43:fstore_3        
		float f2;
		float f3;
		float f4;
		float f6;
		float f7;
		float f9;
		int i;
		boolean flag;
		int k;
		if(mContentBounds.width() - 2.0F * f1 > 0.0F)
	//*  23   44:aload_0         
	//*  24   45:getfield        #115 <Field RectF mContentBounds>
	//*  25   48:invokevirtual   #263 <Method float RectF.width()>
	//*  26   51:fconst_2        
	//*  27   52:fload_3         
	//*  28   53:fmul            
	//*  29   54:fsub            
	//*  30   55:fconst_0        
	//*  31   56:fcmpl           
	//*  32   57:ifle            573
			i = 1;
	//   33   60:iconst_1        
	//   34   61:istore          10
		else
	//*  35   63:aload_0         
	//*  36   64:getfield        #115 <Field RectF mContentBounds>
	//*  37   67:invokevirtual   #266 <Method float RectF.height()>
	//*  38   70:fconst_2        
	//*  39   71:fload_3         
	//*  40   72:fmul            
	//*  41   73:fsub            
	//*  42   74:fconst_0        
	//*  43   75:fcmpl           
	//*  44   76:ifle            579
	//*  45   79:iconst_1        
	//*  46   80:istore          11
	//*  47   82:aload_0         
	//*  48   83:getfield        #268 <Field float mRawShadowSize>
	//*  49   86:fstore          7
	//*  50   88:aload_0         
	//*  51   89:getfield        #268 <Field float mRawShadowSize>
	//*  52   92:fstore          8
	//*  53   94:aload_0         
	//*  54   95:getfield        #268 <Field float mRawShadowSize>
	//*  55   98:fstore          4
	//*  56  100:aload_0         
	//*  57  101:getfield        #268 <Field float mRawShadowSize>
	//*  58  104:fstore          9
	//*  59  106:aload_0         
	//*  60  107:getfield        #268 <Field float mRawShadowSize>
	//*  61  110:fstore          5
	//*  62  112:aload_0         
	//*  63  113:getfield        #268 <Field float mRawShadowSize>
	//*  64  116:fstore          6
	//*  65  118:fload_3         
	//*  66  119:fload_3         
	//*  67  120:fload           4
	//*  68  122:fload           9
	//*  69  124:ldc1            #11  <Float 0.5F>
	//*  70  126:fmul            
	//*  71  127:fsub            
	//*  72  128:fadd            
	//*  73  129:fdiv            
	//*  74  130:fstore          4
	//*  75  132:fload_3         
	//*  76  133:fload_3         
	//*  77  134:fload           7
	//*  78  136:fload           8
	//*  79  138:ldc1            #15  <Float 0.25F>
	//*  80  140:fmul            
	//*  81  141:fsub            
	//*  82  142:fadd            
	//*  83  143:fdiv            
	//*  84  144:fstore          7
	//*  85  146:fload_3         
	//*  86  147:fload_3         
	//*  87  148:fload           5
	//*  88  150:fload           6
	//*  89  152:fconst_1        
	//*  90  153:fmul            
	//*  91  154:fsub            
	//*  92  155:fadd            
	//*  93  156:fdiv            
	//*  94  157:fstore          5
	//*  95  159:aload_1         
	//*  96  160:invokevirtual   #247 <Method int Canvas.save()>
	//*  97  163:istore          13
	//*  98  165:aload_1         
	//*  99  166:aload_0         
	//* 100  167:getfield        #115 <Field RectF mContentBounds>
	//* 101  170:getfield        #156 <Field float RectF.left>
	//* 102  173:fload_3         
	//* 103  174:fadd            
	//* 104  175:aload_0         
	//* 105  176:getfield        #115 <Field RectF mContentBounds>
	//* 106  179:getfield        #158 <Field float RectF.top>
	//* 107  182:fload_3         
	//* 108  183:fadd            
	//* 109  184:invokevirtual   #271 <Method void Canvas.translate(float, float)>
	//* 110  187:aload_1         
	//* 111  188:fload           4
	//* 112  190:fload           7
	//* 113  192:invokevirtual   #274 <Method void Canvas.scale(float, float)>
	//* 114  195:aload_1         
	//* 115  196:aload_0         
	//* 116  197:getfield        #183 <Field Path mCornerShadowPath>
	//* 117  200:aload_0         
	//* 118  201:getfield        #93  <Field Paint mCornerShadowPaint>
	//* 119  204:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
	//* 120  207:iload           10
	//* 121  209:ifeq            247
	//* 122  212:aload_1         
	//* 123  213:fconst_1        
	//* 124  214:fload           4
	//* 125  216:fdiv            
	//* 126  217:fconst_1        
	//* 127  218:invokevirtual   #274 <Method void Canvas.scale(float, float)>
	//* 128  221:aload_1         
	//* 129  222:fconst_0        
	//* 130  223:fload_2         
	//* 131  224:aload_0         
	//* 132  225:getfield        #115 <Field RectF mContentBounds>
	//* 133  228:invokevirtual   #263 <Method float RectF.width()>
	//* 134  231:fconst_2        
	//* 135  232:fload_3         
	//* 136  233:fmul            
	//* 137  234:fsub            
	//* 138  235:aload_0         
	//* 139  236:getfield        #109 <Field float mCornerRadius>
	//* 140  239:fneg            
	//* 141  240:aload_0         
	//* 142  241:getfield        #120 <Field Paint mEdgeShadowPaint>
	//* 143  244:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 144  247:aload_1         
	//* 145  248:iload           13
	//* 146  250:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
	//* 147  253:aload_1         
	//* 148  254:invokevirtual   #247 <Method int Canvas.save()>
	//* 149  257:istore          13
	//* 150  259:aload_1         
	//* 151  260:aload_0         
	//* 152  261:getfield        #115 <Field RectF mContentBounds>
	//* 153  264:getfield        #160 <Field float RectF.right>
	//* 154  267:fload_3         
	//* 155  268:fsub            
	//* 156  269:aload_0         
	//* 157  270:getfield        #115 <Field RectF mContentBounds>
	//* 158  273:getfield        #162 <Field float RectF.bottom>
	//* 159  276:fload_3         
	//* 160  277:fsub            
	//* 161  278:invokevirtual   #271 <Method void Canvas.translate(float, float)>
	//* 162  281:aload_1         
	//* 163  282:fload           4
	//* 164  284:fload           5
	//* 165  286:invokevirtual   #274 <Method void Canvas.scale(float, float)>
	//* 166  289:aload_1         
	//* 167  290:ldc1            #203 <Float 180F>
	//* 168  292:invokevirtual   #288 <Method void Canvas.rotate(float)>
	//* 169  295:aload_1         
	//* 170  296:aload_0         
	//* 171  297:getfield        #183 <Field Path mCornerShadowPath>
	//* 172  300:aload_0         
	//* 173  301:getfield        #93  <Field Paint mCornerShadowPaint>
	//* 174  304:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
	//* 175  307:iload           10
	//* 176  309:ifeq            360
	//* 177  312:aload_1         
	//* 178  313:fconst_1        
	//* 179  314:fload           4
	//* 180  316:fdiv            
	//* 181  317:fconst_1        
	//* 182  318:invokevirtual   #274 <Method void Canvas.scale(float, float)>
	//* 183  321:aload_0         
	//* 184  322:getfield        #115 <Field RectF mContentBounds>
	//* 185  325:invokevirtual   #263 <Method float RectF.width()>
	//* 186  328:fstore          6
	//* 187  330:aload_0         
	//* 188  331:getfield        #109 <Field float mCornerRadius>
	//* 189  334:fneg            
	//* 190  335:fstore          8
	//* 191  337:aload_1         
	//* 192  338:fconst_0        
	//* 193  339:fload_2         
	//* 194  340:fload           6
	//* 195  342:fconst_2        
	//* 196  343:fload_3         
	//* 197  344:fmul            
	//* 198  345:fsub            
	//* 199  346:aload_0         
	//* 200  347:getfield        #178 <Field float mShadowSize>
	//* 201  350:fload           8
	//* 202  352:fadd            
	//* 203  353:aload_0         
	//* 204  354:getfield        #120 <Field Paint mEdgeShadowPaint>
	//* 205  357:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 206  360:aload_1         
	//* 207  361:iload           13
	//* 208  363:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
	//* 209  366:aload_1         
	//* 210  367:invokevirtual   #247 <Method int Canvas.save()>
	//* 211  370:istore          10
	//* 212  372:aload_1         
	//* 213  373:aload_0         
	//* 214  374:getfield        #115 <Field RectF mContentBounds>
	//* 215  377:getfield        #156 <Field float RectF.left>
	//* 216  380:fload_3         
	//* 217  381:fadd            
	//* 218  382:aload_0         
	//* 219  383:getfield        #115 <Field RectF mContentBounds>
	//* 220  386:getfield        #162 <Field float RectF.bottom>
	//* 221  389:fload_3         
	//* 222  390:fsub            
	//* 223  391:invokevirtual   #271 <Method void Canvas.translate(float, float)>
	//* 224  394:aload_1         
	//* 225  395:fload           4
	//* 226  397:fload           5
	//* 227  399:invokevirtual   #274 <Method void Canvas.scale(float, float)>
	//* 228  402:aload_1         
	//* 229  403:ldc1            #209 <Float 270F>
	//* 230  405:invokevirtual   #288 <Method void Canvas.rotate(float)>
	//* 231  408:aload_1         
	//* 232  409:aload_0         
	//* 233  410:getfield        #183 <Field Path mCornerShadowPath>
	//* 234  413:aload_0         
	//* 235  414:getfield        #93  <Field Paint mCornerShadowPaint>
	//* 236  417:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
	//* 237  420:iload           11
	//* 238  422:ifeq            460
	//* 239  425:aload_1         
	//* 240  426:fconst_1        
	//* 241  427:fload           5
	//* 242  429:fdiv            
	//* 243  430:fconst_1        
	//* 244  431:invokevirtual   #274 <Method void Canvas.scale(float, float)>
	//* 245  434:aload_1         
	//* 246  435:fconst_0        
	//* 247  436:fload_2         
	//* 248  437:aload_0         
	//* 249  438:getfield        #115 <Field RectF mContentBounds>
	//* 250  441:invokevirtual   #266 <Method float RectF.height()>
	//* 251  444:fconst_2        
	//* 252  445:fload_3         
	//* 253  446:fmul            
	//* 254  447:fsub            
	//* 255  448:aload_0         
	//* 256  449:getfield        #109 <Field float mCornerRadius>
	//* 257  452:fneg            
	//* 258  453:aload_0         
	//* 259  454:getfield        #120 <Field Paint mEdgeShadowPaint>
	//* 260  457:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 261  460:aload_1         
	//* 262  461:iload           10
	//* 263  463:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
	//* 264  466:aload_1         
	//* 265  467:invokevirtual   #247 <Method int Canvas.save()>
	//* 266  470:istore          10
	//* 267  472:aload_1         
	//* 268  473:aload_0         
	//* 269  474:getfield        #115 <Field RectF mContentBounds>
	//* 270  477:getfield        #160 <Field float RectF.right>
	//* 271  480:fload_3         
	//* 272  481:fsub            
	//* 273  482:aload_0         
	//* 274  483:getfield        #115 <Field RectF mContentBounds>
	//* 275  486:getfield        #158 <Field float RectF.top>
	//* 276  489:fload_3         
	//* 277  490:fadd            
	//* 278  491:invokevirtual   #271 <Method void Canvas.translate(float, float)>
	//* 279  494:aload_1         
	//* 280  495:fload           4
	//* 281  497:fload           7
	//* 282  499:invokevirtual   #274 <Method void Canvas.scale(float, float)>
	//* 283  502:aload_1         
	//* 284  503:ldc1            #204 <Float 90F>
	//* 285  505:invokevirtual   #288 <Method void Canvas.rotate(float)>
	//* 286  508:aload_1         
	//* 287  509:aload_0         
	//* 288  510:getfield        #183 <Field Path mCornerShadowPath>
	//* 289  513:aload_0         
	//* 290  514:getfield        #93  <Field Paint mCornerShadowPaint>
	//* 291  517:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
	//* 292  520:iload           11
	//* 293  522:ifeq            560
	//* 294  525:aload_1         
	//* 295  526:fconst_1        
	//* 296  527:fload           7
	//* 297  529:fdiv            
	//* 298  530:fconst_1        
	//* 299  531:invokevirtual   #274 <Method void Canvas.scale(float, float)>
	//* 300  534:aload_1         
	//* 301  535:fconst_0        
	//* 302  536:fload_2         
	//* 303  537:aload_0         
	//* 304  538:getfield        #115 <Field RectF mContentBounds>
	//* 305  541:invokevirtual   #266 <Method float RectF.height()>
	//* 306  544:fconst_2        
	//* 307  545:fload_3         
	//* 308  546:fmul            
	//* 309  547:fsub            
	//* 310  548:aload_0         
	//* 311  549:getfield        #109 <Field float mCornerRadius>
	//* 312  552:fneg            
	//* 313  553:aload_0         
	//* 314  554:getfield        #120 <Field Paint mEdgeShadowPaint>
	//* 315  557:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 316  560:aload_1         
	//* 317  561:iload           10
	//* 318  563:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
	//* 319  566:aload_1         
	//* 320  567:iload           12
	//* 321  569:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
	//* 322  572:return          
			i = 0;
	//  323  573:iconst_0        
	//  324  574:istore          10
		if(mContentBounds.height() - 2.0F * f1 > 0.0F)
			flag = true;
		else
	//* 325  576:goto            63
			flag = false;
	//  326  579:iconst_0        
	//  327  580:istore          11
		f6 = mRawShadowSize;
		f7 = mRawShadowSize;
		f2 = mRawShadowSize;
		f9 = mRawShadowSize;
		f3 = mRawShadowSize;
		f4 = mRawShadowSize;
		f2 = f1 / (f1 + (f2 - f9 * 0.5F));
		f6 = f1 / (f1 + (f6 - f7 * 0.25F));
		f3 = f1 / (f1 + (f3 - f4 * 1.0F));
		k = canvas.save();
		canvas.translate(mContentBounds.left + f1, mContentBounds.top + f1);
		canvas.scale(f2, f6);
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
		if(i != 0)
		{
			canvas.scale(1.0F / f2, 1.0F);
			canvas.drawRect(0.0F, f, mContentBounds.width() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
		}
		canvas.restoreToCount(k);
		k = canvas.save();
		canvas.translate(mContentBounds.right - f1, mContentBounds.bottom - f1);
		canvas.scale(f2, f3);
		canvas.rotate(180F);
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
		if(i != 0)
		{
			canvas.scale(1.0F / f2, 1.0F);
			float f5 = mContentBounds.width();
			float f8 = -mCornerRadius;
			canvas.drawRect(0.0F, f, f5 - 2.0F * f1, mShadowSize + f8, mEdgeShadowPaint);
		}
		canvas.restoreToCount(k);
		i = canvas.save();
		canvas.translate(mContentBounds.left + f1, mContentBounds.bottom - f1);
		canvas.scale(f2, f3);
		canvas.rotate(270F);
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
		if(flag)
		{
			canvas.scale(1.0F / f3, 1.0F);
			canvas.drawRect(0.0F, f, mContentBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
		}
		canvas.restoreToCount(i);
		i = canvas.save();
		canvas.translate(mContentBounds.right - f1, mContentBounds.top + f1);
		canvas.scale(f2, f6);
		canvas.rotate(90F);
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
		if(flag)
		{
			canvas.scale(1.0F / f6, 1.0F);
			canvas.drawRect(0.0F, f, mContentBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
		}
		canvas.restoreToCount(i);
		canvas.restoreToCount(j);
	//* 328  582:goto            82
	}

	private static int toEven(float f)
	{
		int j = Math.round(f);
	//    0    0:fload_0         
	//    1    1:invokestatic    #107 <Method int Math.round(float)>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j % 2 == 1)
	//*   5    7:iload_2         
	//*   6    8:iconst_2        
	//*   7    9:irem            
	//*   8   10:iconst_1        
	//*   9   11:icmpne          18
			i = j - 1;
	//   10   14:iload_2         
	//   11   15:iconst_1        
	//   12   16:isub            
	//   13   17:istore_1        
		return i;
	//   14   18:iload_1         
	//   15   19:ireturn         
	}

	public void draw(Canvas canvas)
	{
		if(mDirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mDirty>
	//*   2    4:ifeq            20
		{
			buildComponents(getBounds());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #294 <Method Rect getBounds()>
	//    6   12:invokespecial   #296 <Method void buildComponents(Rect)>
			mDirty = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #59  <Field boolean mDirty>
		}
		drawShadow(canvas);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #298 <Method void drawShadow(Canvas)>
		super.draw(canvas);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #300 <Method void DrawableWrapper.draw(Canvas)>
	//   16   30:return          
	}

	public float getCornerRadius()
	{
		return mCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field float mCornerRadius>
	//    2    4:freturn         
	}

	public float getMaxShadowSize()
	{
		return mRawMaxShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float mRawMaxShadowSize>
	//    2    4:freturn         
	}

	public float getMinHeight()
	{
		float f = Math.max(mRawMaxShadowSize, mCornerRadius + (mRawMaxShadowSize * 1.5F) / 2.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float mRawMaxShadowSize>
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field float mCornerRadius>
	//    4    8:aload_0         
	//    5    9:getfield        #132 <Field float mRawMaxShadowSize>
	//    6   12:ldc1            #13  <Float 1.5F>
	//    7   14:fmul            
	//    8   15:fconst_2        
	//    9   16:fdiv            
	//   10   17:fadd            
	//   11   18:invokestatic    #307 <Method float Math.max(float, float)>
	//   12   21:fstore_1        
		return mRawMaxShadowSize * 1.5F * 2.0F + 2.0F * f;
	//   13   22:aload_0         
	//   14   23:getfield        #132 <Field float mRawMaxShadowSize>
	//   15   26:ldc1            #13  <Float 1.5F>
	//   16   28:fmul            
	//   17   29:fconst_2        
	//   18   30:fmul            
	//   19   31:fconst_2        
	//   20   32:fload_1         
	//   21   33:fmul            
	//   22   34:fadd            
	//   23   35:freturn         
	}

	public float getMinWidth()
	{
		float f = Math.max(mRawMaxShadowSize, mCornerRadius + mRawMaxShadowSize / 2.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field float mRawMaxShadowSize>
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field float mCornerRadius>
	//    4    8:aload_0         
	//    5    9:getfield        #132 <Field float mRawMaxShadowSize>
	//    6   12:fconst_2        
	//    7   13:fdiv            
	//    8   14:fadd            
	//    9   15:invokestatic    #307 <Method float Math.max(float, float)>
	//   10   18:fstore_1        
		return mRawMaxShadowSize * 2.0F + 2.0F * f;
	//   11   19:aload_0         
	//   12   20:getfield        #132 <Field float mRawMaxShadowSize>
	//   13   23:fconst_2        
	//   14   24:fmul            
	//   15   25:fconst_2        
	//   16   26:fload_1         
	//   17   27:fmul            
	//   18   28:fadd            
	//   19   29:freturn         
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
	//    1    1:getfield        #132 <Field float mRawMaxShadowSize>
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field float mCornerRadius>
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field boolean mAddPaddingForCorners>
	//    6   12:invokestatic    #313 <Method float calculateVerticalPadding(float, float, boolean)>
	//    7   15:f2d             
	//    8   16:invokestatic    #316 <Method double Math.ceil(double)>
	//    9   19:d2i             
	//   10   20:istore_2        
		int j = (int)Math.ceil(calculateHorizontalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
	//   11   21:aload_0         
	//   12   22:getfield        #132 <Field float mRawMaxShadowSize>
	//   13   25:aload_0         
	//   14   26:getfield        #109 <Field float mCornerRadius>
	//   15   29:aload_0         
	//   16   30:getfield        #61  <Field boolean mAddPaddingForCorners>
	//   17   33:invokestatic    #318 <Method float calculateHorizontalPadding(float, float, boolean)>
	//   18   36:f2d             
	//   19   37:invokestatic    #316 <Method double Math.ceil(double)>
	//   20   40:d2i             
	//   21   41:istore_3        
		rect.set(j, i, j, i);
	//   22   42:aload_1         
	//   23   43:iload_3         
	//   24   44:iload_2         
	//   25   45:iload_3         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #320 <Method void Rect.set(int, int, int, int)>
		return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
	}

	public float getShadowSize()
	{
		return mRawShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field float mRawShadowSize>
	//    2    4:freturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		mDirty = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #59  <Field boolean mDirty>
	//    3    5:return          
	}

	public void setAddPaddingForCorners(boolean flag)
	{
		mAddPaddingForCorners = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean mAddPaddingForCorners>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #326 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setAlpha(int i)
	{
		super.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #329 <Method void DrawableWrapper.setAlpha(int)>
		mCornerShadowPaint.setAlpha(i);
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field Paint mCornerShadowPaint>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #330 <Method void Paint.setAlpha(int)>
		mEdgeShadowPaint.setAlpha(i);
	//    7   13:aload_0         
	//    8   14:getfield        #120 <Field Paint mEdgeShadowPaint>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #330 <Method void Paint.setAlpha(int)>
	//   11   21:return          
	}

	public void setCornerRadius(float f)
	{
		f = Math.round(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #107 <Method int Math.round(float)>
	//    2    4:i2f             
	//    3    5:fstore_1        
		if(mCornerRadius == f)
	//*   4    6:aload_0         
	//*   5    7:getfield        #109 <Field float mCornerRadius>
	//*   6   10:fload_1         
	//*   7   11:fcmpl           
	//*   8   12:ifne            16
		{
			return;
	//    9   15:return          
		} else
		{
			mCornerRadius = f;
	//   10   16:aload_0         
	//   11   17:fload_1         
	//   12   18:putfield        #109 <Field float mCornerRadius>
			mDirty = true;
	//   13   21:aload_0         
	//   14   22:iconst_1        
	//   15   23:putfield        #59  <Field boolean mDirty>
			invalidateSelf();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #326 <Method void invalidateSelf()>
			return;
	//   18   30:return          
		}
	}

	public void setMaxShadowSize(float f)
	{
		setShadowSize(mRawShadowSize, f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #268 <Field float mRawShadowSize>
	//    3    5:fload_1         
	//    4    6:invokevirtual   #128 <Method void setShadowSize(float, float)>
	//    5    9:return          
	}

	final void setRotation(float f)
	{
		if(mRotation != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #249 <Field float mRotation>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mRotation = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #249 <Field float mRotation>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #326 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setShadowSize(float f)
	{
		setShadowSize(f, mRawMaxShadowSize);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #132 <Field float mRawMaxShadowSize>
	//    4    6:invokevirtual   #128 <Method void setShadowSize(float, float)>
	//    5    9:return          
	}

	void setShadowSize(float f, float f1)
	{
		if(f < 0.0F || f1 < 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            12
	//*   4    6:fload_2         
	//*   5    7:fconst_0        
	//*   6    8:fcmpg           
	//*   7    9:ifge            23
			throw new IllegalArgumentException("invalid shadow size");
	//    8   12:new             #335 <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc2            #337 <String "invalid shadow size">
	//   11   19:invokespecial   #340 <Method void IllegalArgumentException(String)>
	//   12   22:athrow          
		float f2 = toEven(f);
	//   13   23:fload_1         
	//   14   24:invokestatic    #342 <Method int toEven(float)>
	//   15   27:i2f             
	//   16   28:fstore_3        
		float f3 = toEven(f1);
	//   17   29:fload_2         
	//   18   30:invokestatic    #342 <Method int toEven(float)>
	//   19   33:i2f             
	//   20   34:fstore          4
		f = f2;
	//   21   36:fload_3         
	//   22   37:fstore_1        
		if(f2 > f3)
	//*  23   38:fload_3         
	//*  24   39:fload           4
	//*  25   41:fcmpl           
	//*  26   42:ifle            64
		{
			f1 = f3;
	//   27   45:fload           4
	//   28   47:fstore_2        
			f = f1;
	//   29   48:fload_2         
	//   30   49:fstore_1        
			if(!mPrintedShadowClipWarning)
	//*  31   50:aload_0         
	//*  32   51:getfield        #63  <Field boolean mPrintedShadowClipWarning>
	//*  33   54:ifne            64
			{
				mPrintedShadowClipWarning = true;
	//   34   57:aload_0         
	//   35   58:iconst_1        
	//   36   59:putfield        #63  <Field boolean mPrintedShadowClipWarning>
				f = f1;
	//   37   62:fload_2         
	//   38   63:fstore_1        
			}
		}
		if(mRawShadowSize == f && mRawMaxShadowSize == f3)
	//*  39   64:aload_0         
	//*  40   65:getfield        #268 <Field float mRawShadowSize>
	//*  41   68:fload_1         
	//*  42   69:fcmpl           
	//*  43   70:ifne            84
	//*  44   73:aload_0         
	//*  45   74:getfield        #132 <Field float mRawMaxShadowSize>
	//*  46   77:fload           4
	//*  47   79:fcmpl           
	//*  48   80:ifne            84
		{
			return;
	//   49   83:return          
		} else
		{
			mRawShadowSize = f;
	//   50   84:aload_0         
	//   51   85:fload_1         
	//   52   86:putfield        #268 <Field float mRawShadowSize>
			mRawMaxShadowSize = f3;
	//   53   89:aload_0         
	//   54   90:fload           4
	//   55   92:putfield        #132 <Field float mRawMaxShadowSize>
			mShadowSize = Math.round(1.5F * f);
	//   56   95:aload_0         
	//   57   96:ldc1            #13  <Float 1.5F>
	//   58   98:fload_1         
	//   59   99:fmul            
	//   60  100:invokestatic    #107 <Method int Math.round(float)>
	//   61  103:i2f             
	//   62  104:putfield        #178 <Field float mShadowSize>
			mMaxShadowSize = f3;
	//   63  107:aload_0         
	//   64  108:fload           4
	//   65  110:putfield        #344 <Field float mMaxShadowSize>
			mDirty = true;
	//   66  113:aload_0         
	//   67  114:iconst_1        
	//   68  115:putfield        #59  <Field boolean mDirty>
			invalidateSelf();
	//   69  118:aload_0         
	//   70  119:invokevirtual   #326 <Method void invalidateSelf()>
			return;
	//   71  122:return          
		}
	}

	static final double COS_45 = Math.cos(Math.toRadians(45D));
	static final float SHADOW_BOTTOM_SCALE = 1F;
	static final float SHADOW_HORIZ_SCALE = 0.5F;
	static final float SHADOW_MULTIPLIER = 1.5F;
	static final float SHADOW_TOP_SCALE = 0.25F;
	private boolean mAddPaddingForCorners;
	final RectF mContentBounds = new RectF();
	float mCornerRadius;
	final Paint mCornerShadowPaint = new Paint(5);
	Path mCornerShadowPath;
	private boolean mDirty;
	final Paint mEdgeShadowPaint;
	float mMaxShadowSize;
	private boolean mPrintedShadowClipWarning;
	float mRawMaxShadowSize;
	float mRawShadowSize;
	private float mRotation;
	private final int mShadowEndColor;
	private final int mShadowMiddleColor;
	float mShadowSize;
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
