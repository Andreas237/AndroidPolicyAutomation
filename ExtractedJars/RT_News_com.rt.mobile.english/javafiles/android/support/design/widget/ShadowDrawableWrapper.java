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
		if(mCornerShadowPath == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #183 <Field Path mCornerShadowPath>
	//*  29   57:ifnonnull       74
			mCornerShadowPath = new Path();
	//   30   60:aload_0         
	//   31   61:new             #185 <Class Path>
	//   32   64:dup             
	//   33   65:invokespecial   #186 <Method void Path()>
	//   34   68:putfield        #183 <Field Path mCornerShadowPath>
		else
	//*  35   71:goto            81
			mCornerShadowPath.reset();
	//   36   74:aload_0         
	//   37   75:getfield        #183 <Field Path mCornerShadowPath>
	//   38   78:invokevirtual   #189 <Method void Path.reset()>
		mCornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
	//   39   81:aload_0         
	//   40   82:getfield        #183 <Field Path mCornerShadowPath>
	//   41   85:getstatic       #195 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   42   88:invokevirtual   #199 <Method void Path.setFillType(android.graphics.Path$FillType)>
		mCornerShadowPath.moveTo(-mCornerRadius, 0.0F);
	//   43   91:aload_0         
	//   44   92:getfield        #183 <Field Path mCornerShadowPath>
	//   45   95:aload_0         
	//   46   96:getfield        #109 <Field float mCornerRadius>
	//   47   99:fneg            
	//   48  100:fconst_0        
	//   49  101:invokevirtual   #202 <Method void Path.moveTo(float, float)>
		mCornerShadowPath.rLineTo(-mShadowSize, 0.0F);
	//   50  104:aload_0         
	//   51  105:getfield        #183 <Field Path mCornerShadowPath>
	//   52  108:aload_0         
	//   53  109:getfield        #178 <Field float mShadowSize>
	//   54  112:fneg            
	//   55  113:fconst_0        
	//   56  114:invokevirtual   #205 <Method void Path.rLineTo(float, float)>
		mCornerShadowPath.arcTo(rectf, 180F, 90F, false);
	//   57  117:aload_0         
	//   58  118:getfield        #183 <Field Path mCornerShadowPath>
	//   59  121:aload           8
	//   60  123:ldc1            #206 <Float 180F>
	//   61  125:ldc1            #207 <Float 90F>
	//   62  127:iconst_0        
	//   63  128:invokevirtual   #211 <Method void Path.arcTo(RectF, float, float, boolean)>
		mCornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
	//   64  131:aload_0         
	//   65  132:getfield        #183 <Field Path mCornerShadowPath>
	//   66  135:aload           7
	//   67  137:ldc1            #212 <Float 270F>
	//   68  139:ldc1            #213 <Float -90F>
	//   69  141:iconst_0        
	//   70  142:invokevirtual   #211 <Method void Path.arcTo(RectF, float, float, boolean)>
		mCornerShadowPath.close();
	//   71  145:aload_0         
	//   72  146:getfield        #183 <Field Path mCornerShadowPath>
	//   73  149:invokevirtual   #216 <Method void Path.close()>
		float f = -rectf.top;
	//   74  152:aload           8
	//   75  154:getfield        #158 <Field float RectF.top>
	//   76  157:fneg            
	//   77  158:fstore_1        
		if(f > 0.0F)
	//*  78  159:fload_1         
	//*  79  160:fconst_0        
	//*  80  161:fcmpl           
	//*  81  162:ifle            268
		{
			float f1 = mCornerRadius / f;
	//   82  165:aload_0         
	//   83  166:getfield        #109 <Field float mCornerRadius>
	//   84  169:fload_1         
	//   85  170:fdiv            
	//   86  171:fstore_2        
			float f3 = (1.0F - f1) / 2.0F;
	//   87  172:fconst_1        
	//   88  173:fload_2         
	//   89  174:fsub            
	//   90  175:fconst_2        
	//   91  176:fdiv            
	//   92  177:fstore_3        
			Paint paint = mCornerShadowPaint;
	//   93  178:aload_0         
	//   94  179:getfield        #93  <Field Paint mCornerShadowPaint>
	//   95  182:astore          9
			int i = mShadowStartColor;
	//   96  184:aload_0         
	//   97  185:getfield        #76  <Field int mShadowStartColor>
	//   98  188:istore          4
			int k = mShadowMiddleColor;
	//   99  190:aload_0         
	//  100  191:getfield        #81  <Field int mShadowMiddleColor>
	//  101  194:istore          5
			int i1 = mShadowEndColor;
	//  102  196:aload_0         
	//  103  197:getfield        #86  <Field int mShadowEndColor>
	//  104  200:istore          6
			android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
	//  105  202:getstatic       #222 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  106  205:astore          10
			paint.setShader(((android.graphics.Shader) (new RadialGradient(0.0F, 0.0F, f, new int[] {
				0, i, k, i1
			}, new float[] {
				0.0F, f1, f3 + f1, 1.0F
			}, tilemode))));
	//  107  207:aload           9
	//  108  209:new             #224 <Class RadialGradient>
	//  109  212:dup             
	//  110  213:fconst_0        
	//  111  214:fconst_0        
	//  112  215:fload_1         
	//  113  216:iconst_4        
	//  114  217:newarray        int[]
	//  115  219:dup             
	//  116  220:iconst_0        
	//  117  221:iconst_0        
	//  118  222:iastore         
	//  119  223:dup             
	//  120  224:iconst_1        
	//  121  225:iload           4
	//  122  227:iastore         
	//  123  228:dup             
	//  124  229:iconst_2        
	//  125  230:iload           5
	//  126  232:iastore         
	//  127  233:dup             
	//  128  234:iconst_3        
	//  129  235:iload           6
	//  130  237:iastore         
	//  131  238:iconst_4        
	//  132  239:newarray        float[]
	//  133  241:dup             
	//  134  242:iconst_0        
	//  135  243:fconst_0        
	//  136  244:fastore         
	//  137  245:dup             
	//  138  246:iconst_1        
	//  139  247:fload_2         
	//  140  248:fastore         
	//  141  249:dup             
	//  142  250:iconst_2        
	//  143  251:fload_3         
	//  144  252:fload_2         
	//  145  253:fadd            
	//  146  254:fastore         
	//  147  255:dup             
	//  148  256:iconst_3        
	//  149  257:fconst_1        
	//  150  258:fastore         
	//  151  259:aload           10
	//  152  261:invokespecial   #227 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  153  264:invokevirtual   #231 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  154  267:pop             
		}
		Paint paint1 = mEdgeShadowPaint;
	//  155  268:aload_0         
	//  156  269:getfield        #120 <Field Paint mEdgeShadowPaint>
	//  157  272:astore          9
		f = ((RectF) (obj)).top;
	//  158  274:aload           7
	//  159  276:getfield        #158 <Field float RectF.top>
	//  160  279:fstore_1        
		float f2 = rectf.top;
	//  161  280:aload           8
	//  162  282:getfield        #158 <Field float RectF.top>
	//  163  285:fstore_2        
		int j = mShadowStartColor;
	//  164  286:aload_0         
	//  165  287:getfield        #76  <Field int mShadowStartColor>
	//  166  290:istore          4
		int l = mShadowMiddleColor;
	//  167  292:aload_0         
	//  168  293:getfield        #81  <Field int mShadowMiddleColor>
	//  169  296:istore          5
		int j1 = mShadowEndColor;
	//  170  298:aload_0         
	//  171  299:getfield        #86  <Field int mShadowEndColor>
	//  172  302:istore          6
		obj = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//  173  304:getstatic       #222 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  174  307:astore          7
		paint1.setShader(((android.graphics.Shader) (new LinearGradient(0.0F, f, 0.0F, f2, new int[] {
			j, l, j1
		}, new float[] {
			0.0F, 0.5F, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj))))));
	//  175  309:aload           9
	//  176  311:new             #233 <Class LinearGradient>
	//  177  314:dup             
	//  178  315:fconst_0        
	//  179  316:fload_1         
	//  180  317:fconst_0        
	//  181  318:fload_2         
	//  182  319:iconst_3        
	//  183  320:newarray        int[]
	//  184  322:dup             
	//  185  323:iconst_0        
	//  186  324:iload           4
	//  187  326:iastore         
	//  188  327:dup             
	//  189  328:iconst_1        
	//  190  329:iload           5
	//  191  331:iastore         
	//  192  332:dup             
	//  193  333:iconst_2        
	//  194  334:iload           6
	//  195  336:iastore         
	//  196  337:iconst_3        
	//  197  338:newarray        float[]
	//  198  340:dup             
	//  199  341:iconst_0        
	//  200  342:fconst_0        
	//  201  343:fastore         
	//  202  344:dup             
	//  203  345:iconst_1        
	//  204  346:ldc1            #11  <Float 0.5F>
	//  205  348:fastore         
	//  206  349:dup             
	//  207  350:iconst_2        
	//  208  351:fconst_1        
	//  209  352:fastore         
	//  210  353:aload           7
	//  211  355:invokespecial   #236 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  212  358:invokevirtual   #231 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  213  361:pop             
		mEdgeShadowPaint.setAntiAlias(false);
	//  214  362:aload_0         
	//  215  363:getfield        #120 <Field Paint mEdgeShadowPaint>
	//  216  366:iconst_0        
	//  217  367:invokevirtual   #124 <Method void Paint.setAntiAlias(boolean)>
	//  218  370:return          
	}

	public static float calculateHorizontalPadding(float f, float f1, boolean flag)
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

	public static float calculateVerticalPadding(float f, float f1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
			return (float)((double)(f * 1.5F) + (1.0D - COS_45) * (double)f1);
	//    2    4:fload_0         
	//    3    5:ldc1            #13  <Float 1.5F>
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
	//   16   21:ldc1            #13  <Float 1.5F>
	//   17   23:fmul            
	//   18   24:freturn         
	}

	private void drawShadow(Canvas canvas)
	{
		int j = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #247 <Method int Canvas.save()>
	//    2    4:istore          13
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
		float f2 = -mCornerRadius - mShadowSize;
	//   13   28:aload_0         
	//   14   29:getfield        #109 <Field float mCornerRadius>
	//   15   32:fneg            
	//   16   33:aload_0         
	//   17   34:getfield        #178 <Field float mShadowSize>
	//   18   37:fsub            
	//   19   38:fstore          4
		float f3 = mCornerRadius;
	//   20   40:aload_0         
	//   21   41:getfield        #109 <Field float mCornerRadius>
	//   22   44:fstore          5
		float f = mContentBounds.width();
	//   23   46:aload_0         
	//   24   47:getfield        #115 <Field RectF mContentBounds>
	//   25   50:invokevirtual   #263 <Method float RectF.width()>
	//   26   53:fstore_2        
		float f4 = 2.0F * f3;
	//   27   54:fconst_2        
	//   28   55:fload           5
	//   29   57:fmul            
	//   30   58:fstore          6
		boolean flag;
		if(f - f4 > 0.0F)
	//*  31   60:fload_2         
	//*  32   61:fload           6
	//*  33   63:fsub            
	//*  34   64:fconst_0        
	//*  35   65:fcmpl           
	//*  36   66:ifle            75
			flag = true;
	//   37   69:iconst_1        
	//   38   70:istore          11
		else
	//*  39   72:goto            78
			flag = false;
	//   40   75:iconst_0        
	//   41   76:istore          11
		boolean flag1;
		if(mContentBounds.height() - f4 > 0.0F)
	//*  42   78:aload_0         
	//*  43   79:getfield        #115 <Field RectF mContentBounds>
	//*  44   82:invokevirtual   #266 <Method float RectF.height()>
	//*  45   85:fload           6
	//*  46   87:fsub            
	//*  47   88:fconst_0        
	//*  48   89:fcmpl           
	//*  49   90:ifle            99
			flag1 = true;
	//   50   93:iconst_1        
	//   51   94:istore          12
		else
	//*  52   96:goto            102
			flag1 = false;
	//   53   99:iconst_0        
	//   54  100:istore          12
		float f1 = mRawShadowSize;
	//   55  102:aload_0         
	//   56  103:getfield        #268 <Field float mRawShadowSize>
	//   57  106:fstore_3        
		float f7 = mRawShadowSize;
	//   58  107:aload_0         
	//   59  108:getfield        #268 <Field float mRawShadowSize>
	//   60  111:fstore          9
		float f5 = mRawShadowSize;
	//   61  113:aload_0         
	//   62  114:getfield        #268 <Field float mRawShadowSize>
	//   63  117:fstore          7
		float f8 = mRawShadowSize;
	//   64  119:aload_0         
	//   65  120:getfield        #268 <Field float mRawShadowSize>
	//   66  123:fstore          10
		f = mRawShadowSize;
	//   67  125:aload_0         
	//   68  126:getfield        #268 <Field float mRawShadowSize>
	//   69  129:fstore_2        
		float f6 = mRawShadowSize;
	//   70  130:aload_0         
	//   71  131:getfield        #268 <Field float mRawShadowSize>
	//   72  134:fstore          8
		f5 = f3 / ((f5 - f8 * 0.5F) + f3);
	//   73  136:fload           5
	//   74  138:fload           7
	//   75  140:fload           10
	//   76  142:ldc1            #11  <Float 0.5F>
	//   77  144:fmul            
	//   78  145:fsub            
	//   79  146:fload           5
	//   80  148:fadd            
	//   81  149:fdiv            
	//   82  150:fstore          7
		f1 = f3 / ((f1 - f7 * 0.25F) + f3);
	//   83  152:fload           5
	//   84  154:fload_3         
	//   85  155:fload           9
	//   86  157:ldc1            #15  <Float 0.25F>
	//   87  159:fmul            
	//   88  160:fsub            
	//   89  161:fload           5
	//   90  163:fadd            
	//   91  164:fdiv            
	//   92  165:fstore_3        
		f = f3 / ((f - f6 * 1.0F) + f3);
	//   93  166:fload           5
	//   94  168:fload_2         
	//   95  169:fload           8
	//   96  171:fconst_1        
	//   97  172:fmul            
	//   98  173:fsub            
	//   99  174:fload           5
	//  100  176:fadd            
	//  101  177:fdiv            
	//  102  178:fstore_2        
		int k = canvas.save();
	//  103  179:aload_1         
	//  104  180:invokevirtual   #247 <Method int Canvas.save()>
	//  105  183:istore          14
		canvas.translate(mContentBounds.left + f3, mContentBounds.top + f3);
	//  106  185:aload_1         
	//  107  186:aload_0         
	//  108  187:getfield        #115 <Field RectF mContentBounds>
	//  109  190:getfield        #156 <Field float RectF.left>
	//  110  193:fload           5
	//  111  195:fadd            
	//  112  196:aload_0         
	//  113  197:getfield        #115 <Field RectF mContentBounds>
	//  114  200:getfield        #158 <Field float RectF.top>
	//  115  203:fload           5
	//  116  205:fadd            
	//  117  206:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		canvas.scale(f5, f1);
	//  118  209:aload_1         
	//  119  210:fload           7
	//  120  212:fload_3         
	//  121  213:invokevirtual   #274 <Method void Canvas.scale(float, float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  122  216:aload_1         
	//  123  217:aload_0         
	//  124  218:getfield        #183 <Field Path mCornerShadowPath>
	//  125  221:aload_0         
	//  126  222:getfield        #93  <Field Paint mCornerShadowPaint>
	//  127  225:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 128  228:iload           11
	//* 129  230:ifeq            271
		{
			canvas.scale(1.0F / f5, 1.0F);
	//  130  233:aload_1         
	//  131  234:fconst_1        
	//  132  235:fload           7
	//  133  237:fdiv            
	//  134  238:fconst_1        
	//  135  239:invokevirtual   #274 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f2, mContentBounds.width() - f4, -mCornerRadius, mEdgeShadowPaint);
	//  136  242:aload_1         
	//  137  243:fconst_0        
	//  138  244:fload           4
	//  139  246:aload_0         
	//  140  247:getfield        #115 <Field RectF mContentBounds>
	//  141  250:invokevirtual   #263 <Method float RectF.width()>
	//  142  253:fload           6
	//  143  255:fsub            
	//  144  256:aload_0         
	//  145  257:getfield        #109 <Field float mCornerRadius>
	//  146  260:fneg            
	//  147  261:aload_0         
	//  148  262:getfield        #120 <Field Paint mEdgeShadowPaint>
	//  149  265:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
	//* 150  268:goto            271
		canvas.restoreToCount(k);
	//  151  271:aload_1         
	//  152  272:iload           14
	//  153  274:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
		k = canvas.save();
	//  154  277:aload_1         
	//  155  278:invokevirtual   #247 <Method int Canvas.save()>
	//  156  281:istore          14
		canvas.translate(mContentBounds.right - f3, mContentBounds.bottom - f3);
	//  157  283:aload_1         
	//  158  284:aload_0         
	//  159  285:getfield        #115 <Field RectF mContentBounds>
	//  160  288:getfield        #160 <Field float RectF.right>
	//  161  291:fload           5
	//  162  293:fsub            
	//  163  294:aload_0         
	//  164  295:getfield        #115 <Field RectF mContentBounds>
	//  165  298:getfield        #162 <Field float RectF.bottom>
	//  166  301:fload           5
	//  167  303:fsub            
	//  168  304:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		canvas.scale(f5, f);
	//  169  307:aload_1         
	//  170  308:fload           7
	//  171  310:fload_2         
	//  172  311:invokevirtual   #274 <Method void Canvas.scale(float, float)>
		canvas.rotate(180F);
	//  173  314:aload_1         
	//  174  315:ldc1            #206 <Float 180F>
	//  175  317:invokevirtual   #288 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  176  320:aload_1         
	//  177  321:aload_0         
	//  178  322:getfield        #183 <Field Path mCornerShadowPath>
	//  179  325:aload_0         
	//  180  326:getfield        #93  <Field Paint mCornerShadowPaint>
	//  181  329:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 182  332:iload           11
	//* 183  334:ifeq            380
		{
			canvas.scale(1.0F / f5, 1.0F);
	//  184  337:aload_1         
	//  185  338:fconst_1        
	//  186  339:fload           7
	//  187  341:fdiv            
	//  188  342:fconst_1        
	//  189  343:invokevirtual   #274 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f2, mContentBounds.width() - f4, -mCornerRadius + mShadowSize, mEdgeShadowPaint);
	//  190  346:aload_1         
	//  191  347:fconst_0        
	//  192  348:fload           4
	//  193  350:aload_0         
	//  194  351:getfield        #115 <Field RectF mContentBounds>
	//  195  354:invokevirtual   #263 <Method float RectF.width()>
	//  196  357:fload           6
	//  197  359:fsub            
	//  198  360:aload_0         
	//  199  361:getfield        #109 <Field float mCornerRadius>
	//  200  364:fneg            
	//  201  365:aload_0         
	//  202  366:getfield        #178 <Field float mShadowSize>
	//  203  369:fadd            
	//  204  370:aload_0         
	//  205  371:getfield        #120 <Field Paint mEdgeShadowPaint>
	//  206  374:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
	//* 207  377:goto            380
		canvas.restoreToCount(k);
	//  208  380:aload_1         
	//  209  381:iload           14
	//  210  383:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
		int i = canvas.save();
	//  211  386:aload_1         
	//  212  387:invokevirtual   #247 <Method int Canvas.save()>
	//  213  390:istore          11
		canvas.translate(mContentBounds.left + f3, mContentBounds.bottom - f3);
	//  214  392:aload_1         
	//  215  393:aload_0         
	//  216  394:getfield        #115 <Field RectF mContentBounds>
	//  217  397:getfield        #156 <Field float RectF.left>
	//  218  400:fload           5
	//  219  402:fadd            
	//  220  403:aload_0         
	//  221  404:getfield        #115 <Field RectF mContentBounds>
	//  222  407:getfield        #162 <Field float RectF.bottom>
	//  223  410:fload           5
	//  224  412:fsub            
	//  225  413:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		canvas.scale(f5, f);
	//  226  416:aload_1         
	//  227  417:fload           7
	//  228  419:fload_2         
	//  229  420:invokevirtual   #274 <Method void Canvas.scale(float, float)>
		canvas.rotate(270F);
	//  230  423:aload_1         
	//  231  424:ldc1            #212 <Float 270F>
	//  232  426:invokevirtual   #288 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  233  429:aload_1         
	//  234  430:aload_0         
	//  235  431:getfield        #183 <Field Path mCornerShadowPath>
	//  236  434:aload_0         
	//  237  435:getfield        #93  <Field Paint mCornerShadowPaint>
	//  238  438:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 239  441:iload           12
	//* 240  443:ifeq            480
		{
			canvas.scale(1.0F / f, 1.0F);
	//  241  446:aload_1         
	//  242  447:fconst_1        
	//  243  448:fload_2         
	//  244  449:fdiv            
	//  245  450:fconst_1        
	//  246  451:invokevirtual   #274 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f2, mContentBounds.height() - f4, -mCornerRadius, mEdgeShadowPaint);
	//  247  454:aload_1         
	//  248  455:fconst_0        
	//  249  456:fload           4
	//  250  458:aload_0         
	//  251  459:getfield        #115 <Field RectF mContentBounds>
	//  252  462:invokevirtual   #266 <Method float RectF.height()>
	//  253  465:fload           6
	//  254  467:fsub            
	//  255  468:aload_0         
	//  256  469:getfield        #109 <Field float mCornerRadius>
	//  257  472:fneg            
	//  258  473:aload_0         
	//  259  474:getfield        #120 <Field Paint mEdgeShadowPaint>
	//  260  477:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(i);
	//  261  480:aload_1         
	//  262  481:iload           11
	//  263  483:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
		i = canvas.save();
	//  264  486:aload_1         
	//  265  487:invokevirtual   #247 <Method int Canvas.save()>
	//  266  490:istore          11
		canvas.translate(mContentBounds.right - f3, mContentBounds.top + f3);
	//  267  492:aload_1         
	//  268  493:aload_0         
	//  269  494:getfield        #115 <Field RectF mContentBounds>
	//  270  497:getfield        #160 <Field float RectF.right>
	//  271  500:fload           5
	//  272  502:fsub            
	//  273  503:aload_0         
	//  274  504:getfield        #115 <Field RectF mContentBounds>
	//  275  507:getfield        #158 <Field float RectF.top>
	//  276  510:fload           5
	//  277  512:fadd            
	//  278  513:invokevirtual   #271 <Method void Canvas.translate(float, float)>
		canvas.scale(f5, f1);
	//  279  516:aload_1         
	//  280  517:fload           7
	//  281  519:fload_3         
	//  282  520:invokevirtual   #274 <Method void Canvas.scale(float, float)>
		canvas.rotate(90F);
	//  283  523:aload_1         
	//  284  524:ldc1            #207 <Float 90F>
	//  285  526:invokevirtual   #288 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  286  529:aload_1         
	//  287  530:aload_0         
	//  288  531:getfield        #183 <Field Path mCornerShadowPath>
	//  289  534:aload_0         
	//  290  535:getfield        #93  <Field Paint mCornerShadowPaint>
	//  291  538:invokevirtual   #278 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 292  541:iload           12
	//* 293  543:ifeq            580
		{
			canvas.scale(1.0F / f1, 1.0F);
	//  294  546:aload_1         
	//  295  547:fconst_1        
	//  296  548:fload_3         
	//  297  549:fdiv            
	//  298  550:fconst_1        
	//  299  551:invokevirtual   #274 <Method void Canvas.scale(float, float)>
			canvas.drawRect(0.0F, f2, mContentBounds.height() - f4, -mCornerRadius, mEdgeShadowPaint);
	//  300  554:aload_1         
	//  301  555:fconst_0        
	//  302  556:fload           4
	//  303  558:aload_0         
	//  304  559:getfield        #115 <Field RectF mContentBounds>
	//  305  562:invokevirtual   #266 <Method float RectF.height()>
	//  306  565:fload           6
	//  307  567:fsub            
	//  308  568:aload_0         
	//  309  569:getfield        #109 <Field float mCornerRadius>
	//  310  572:fneg            
	//  311  573:aload_0         
	//  312  574:getfield        #120 <Field Paint mEdgeShadowPaint>
	//  313  577:invokevirtual   #282 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		canvas.restoreToCount(i);
	//  314  580:aload_1         
	//  315  581:iload           11
	//  316  583:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
		canvas.restoreToCount(j);
	//  317  586:aload_1         
	//  318  587:iload           13
	//  319  589:invokevirtual   #285 <Method void Canvas.restoreToCount(int)>
	//  320  592:return          
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
		return Math.max(mRawMaxShadowSize, mCornerRadius + (mRawMaxShadowSize * 1.5F) / 2.0F) * 2.0F + mRawMaxShadowSize * 1.5F * 2.0F;
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
	//   12   21:fconst_2        
	//   13   22:fmul            
	//   14   23:aload_0         
	//   15   24:getfield        #132 <Field float mRawMaxShadowSize>
	//   16   27:ldc1            #13  <Float 1.5F>
	//   17   29:fmul            
	//   18   30:fconst_2        
	//   19   31:fmul            
	//   20   32:fadd            
	//   21   33:freturn         
	}

	public float getMinWidth()
	{
		return Math.max(mRawMaxShadowSize, mCornerRadius + mRawMaxShadowSize / 2.0F) * 2.0F + mRawMaxShadowSize * 2.0F;
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
	//   10   18:fconst_2        
	//   11   19:fmul            
	//   12   20:aload_0         
	//   13   21:getfield        #132 <Field float mRawMaxShadowSize>
	//   14   24:fconst_2        
	//   15   25:fmul            
	//   16   26:fadd            
	//   17   27:freturn         
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
		if(f >= 0.0F && f1 >= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            105
	//*   4    6:fload_2         
	//*   5    7:fconst_0        
	//*   6    8:fcmpg           
	//*   7    9:ifge            15
	//*   8   12:goto            105
		{
			float f2 = toEven(f);
	//    9   15:fload_1         
	//   10   16:invokestatic    #335 <Method int toEven(float)>
	//   11   19:i2f             
	//   12   20:fstore_3        
			f1 = toEven(f1);
	//   13   21:fload_2         
	//   14   22:invokestatic    #335 <Method int toEven(float)>
	//   15   25:i2f             
	//   16   26:fstore_2        
			f = f2;
	//   17   27:fload_3         
	//   18   28:fstore_1        
			if(f2 > f1)
	//*  19   29:fload_3         
	//*  20   30:fload_2         
	//*  21   31:fcmpl           
	//*  22   32:ifle            49
			{
				if(!mPrintedShadowClipWarning)
	//*  23   35:aload_0         
	//*  24   36:getfield        #63  <Field boolean mPrintedShadowClipWarning>
	//*  25   39:ifne            47
					mPrintedShadowClipWarning = true;
	//   26   42:aload_0         
	//   27   43:iconst_1        
	//   28   44:putfield        #63  <Field boolean mPrintedShadowClipWarning>
				f = f1;
	//   29   47:fload_2         
	//   30   48:fstore_1        
			}
			if(mRawShadowSize == f && mRawMaxShadowSize == f1)
	//*  31   49:aload_0         
	//*  32   50:getfield        #268 <Field float mRawShadowSize>
	//*  33   53:fload_1         
	//*  34   54:fcmpl           
	//*  35   55:ifne            68
	//*  36   58:aload_0         
	//*  37   59:getfield        #132 <Field float mRawMaxShadowSize>
	//*  38   62:fload_2         
	//*  39   63:fcmpl           
	//*  40   64:ifne            68
			{
				return;
	//   41   67:return          
			} else
			{
				mRawShadowSize = f;
	//   42   68:aload_0         
	//   43   69:fload_1         
	//   44   70:putfield        #268 <Field float mRawShadowSize>
				mRawMaxShadowSize = f1;
	//   45   73:aload_0         
	//   46   74:fload_2         
	//   47   75:putfield        #132 <Field float mRawMaxShadowSize>
				mShadowSize = Math.round(f * 1.5F);
	//   48   78:aload_0         
	//   49   79:fload_1         
	//   50   80:ldc1            #13  <Float 1.5F>
	//   51   82:fmul            
	//   52   83:invokestatic    #107 <Method int Math.round(float)>
	//   53   86:i2f             
	//   54   87:putfield        #178 <Field float mShadowSize>
				mMaxShadowSize = f1;
	//   55   90:aload_0         
	//   56   91:fload_2         
	//   57   92:putfield        #337 <Field float mMaxShadowSize>
				mDirty = true;
	//   58   95:aload_0         
	//   59   96:iconst_1        
	//   60   97:putfield        #59  <Field boolean mDirty>
				invalidateSelf();
	//   61  100:aload_0         
	//   62  101:invokevirtual   #326 <Method void invalidateSelf()>
				return;
	//   63  104:return          
			}
		} else
		{
			throw new IllegalArgumentException("invalid shadow size");
	//   64  105:new             #339 <Class IllegalArgumentException>
	//   65  108:dup             
	//   66  109:ldc2            #341 <String "invalid shadow size">
	//   67  112:invokespecial   #344 <Method void IllegalArgumentException(String)>
	//   68  115:athrow          
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
