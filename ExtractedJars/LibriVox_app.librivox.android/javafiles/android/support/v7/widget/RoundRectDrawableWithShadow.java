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

	RoundRectDrawableWithShadow(Resources resources, ColorStateList colorstatelist, float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Drawable()>
		mDirty = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #55  <Field boolean mDirty>
		mAddPaddingForCorners = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #57  <Field boolean mAddPaddingForCorners>
		mPrintedShadowClipWarning = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #59  <Field boolean mPrintedShadowClipWarning>
		mShadowStartColor = resources.getColor(android.support.v7.cardview.R.color.cardview_shadow_start_color);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:getstatic       #64  <Field int android.support.v7.cardview.R$color.cardview_shadow_start_color>
	//   14   24:invokevirtual   #70  <Method int Resources.getColor(int)>
	//   15   27:putfield        #72  <Field int mShadowStartColor>
		mShadowEndColor = resources.getColor(android.support.v7.cardview.R.color.cardview_shadow_end_color);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getstatic       #75  <Field int android.support.v7.cardview.R$color.cardview_shadow_end_color>
	//   19   35:invokevirtual   #70  <Method int Resources.getColor(int)>
	//   20   38:putfield        #77  <Field int mShadowEndColor>
		mInsetShadow = resources.getDimensionPixelSize(android.support.v7.cardview.R.dimen.cardview_compat_inset_shadow);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getstatic       #82  <Field int android.support.v7.cardview.R$dimen.cardview_compat_inset_shadow>
	//   24   46:invokevirtual   #85  <Method int Resources.getDimensionPixelSize(int)>
	//   25   49:putfield        #87  <Field int mInsetShadow>
		mPaint = new Paint(5);
	//   26   52:aload_0         
	//   27   53:new             #89  <Class Paint>
	//   28   56:dup             
	//   29   57:iconst_5        
	//   30   58:invokespecial   #92  <Method void Paint(int)>
	//   31   61:putfield        #94  <Field Paint mPaint>
		setBackground(colorstatelist);
	//   32   64:aload_0         
	//   33   65:aload_2         
	//   34   66:invokespecial   #98  <Method void setBackground(ColorStateList)>
		mCornerShadowPaint = new Paint(5);
	//   35   69:aload_0         
	//   36   70:new             #89  <Class Paint>
	//   37   73:dup             
	//   38   74:iconst_5        
	//   39   75:invokespecial   #92  <Method void Paint(int)>
	//   40   78:putfield        #100 <Field Paint mCornerShadowPaint>
		mCornerShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   41   81:aload_0         
	//   42   82:getfield        #100 <Field Paint mCornerShadowPaint>
	//   43   85:getstatic       #106 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   44   88:invokevirtual   #110 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mCornerRadius = (int)(f + 0.5F);
	//   45   91:aload_0         
	//   46   92:fload_3         
	//   47   93:ldc1            #111 <Float 0.5F>
	//   48   95:fadd            
	//   49   96:f2i             
	//   50   97:i2f             
	//   51   98:putfield        #113 <Field float mCornerRadius>
	//   52  101:aload_0         
	//   53  102:new             #115 <Class RectF>
	//   54  105:dup             
	//   55  106:invokespecial   #116 <Method void RectF()>
	//   56  109:putfield        #118 <Field RectF mCardBounds>
		mEdgeShadowPaint = new Paint(mCornerShadowPaint);
	//   57  112:aload_0         
	//   58  113:new             #89  <Class Paint>
	//   59  116:dup             
	//   60  117:aload_0         
	//   61  118:getfield        #100 <Field Paint mCornerShadowPaint>
	//   62  121:invokespecial   #121 <Method void Paint(Paint)>
	//   63  124:putfield        #123 <Field Paint mEdgeShadowPaint>
		mEdgeShadowPaint.setAntiAlias(false);
	//   64  127:aload_0         
	//   65  128:getfield        #123 <Field Paint mEdgeShadowPaint>
	//   66  131:iconst_0        
	//   67  132:invokevirtual   #127 <Method void Paint.setAntiAlias(boolean)>
		setShadowSize(f1, f2);
	//   68  135:aload_0         
	//   69  136:fload           4
	//   70  138:fload           5
	//   71  140:invokespecial   #131 <Method void setShadowSize(float, float)>
	//   72  143:return          
	}

	private void buildComponents(Rect rect)
	{
		float f = mRawMaxShadowSize * 1.5F;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field float mRawMaxShadowSize>
	//    2    4:ldc1            #9   <Float 1.5F>
	//    3    6:fmul            
	//    4    7:fstore_2        
		mCardBounds.set((float)rect.left + mRawMaxShadowSize, (float)rect.top + f, (float)rect.right - mRawMaxShadowSize, (float)rect.bottom - f);
	//    5    8:aload_0         
	//    6    9:getfield        #118 <Field RectF mCardBounds>
	//    7   12:aload_1         
	//    8   13:getfield        #140 <Field int Rect.left>
	//    9   16:i2f             
	//   10   17:aload_0         
	//   11   18:getfield        #135 <Field float mRawMaxShadowSize>
	//   12   21:fadd            
	//   13   22:aload_1         
	//   14   23:getfield        #143 <Field int Rect.top>
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fadd            
	//   18   29:aload_1         
	//   19   30:getfield        #146 <Field int Rect.right>
	//   20   33:i2f             
	//   21   34:aload_0         
	//   22   35:getfield        #135 <Field float mRawMaxShadowSize>
	//   23   38:fsub            
	//   24   39:aload_1         
	//   25   40:getfield        #149 <Field int Rect.bottom>
	//   26   43:i2f             
	//   27   44:fload_2         
	//   28   45:fsub            
	//   29   46:invokevirtual   #153 <Method void RectF.set(float, float, float, float)>
		buildShadowCorners();
	//   30   49:aload_0         
	//   31   50:invokespecial   #156 <Method void buildShadowCorners()>
	//   32   53:return          
	}

	private void buildShadowCorners()
	{
		float f = mCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field float mCornerRadius>
	//    2    4:fstore_1        
		Object obj = ((Object) (new RectF(-f, -f, f, f)));
	//    3    5:new             #115 <Class RectF>
	//    4    8:dup             
	//    5    9:fload_1         
	//    6   10:fneg            
	//    7   11:fload_1         
	//    8   12:fneg            
	//    9   13:fload_1         
	//   10   14:fload_1         
	//   11   15:invokespecial   #158 <Method void RectF(float, float, float, float)>
	//   12   18:astore          6
		Object obj1 = ((Object) (new RectF(((RectF) (obj)))));
	//   13   20:new             #115 <Class RectF>
	//   14   23:dup             
	//   15   24:aload           6
	//   16   26:invokespecial   #161 <Method void RectF(RectF)>
	//   17   29:astore          7
		f = mShadowSize;
	//   18   31:aload_0         
	//   19   32:getfield        #163 <Field float mShadowSize>
	//   20   35:fstore_1        
		((RectF) (obj1)).inset(-f, -f);
	//   21   36:aload           7
	//   22   38:fload_1         
	//   23   39:fneg            
	//   24   40:fload_1         
	//   25   41:fneg            
	//   26   42:invokevirtual   #166 <Method void RectF.inset(float, float)>
		Path path = mCornerShadowPath;
	//   27   45:aload_0         
	//   28   46:getfield        #168 <Field Path mCornerShadowPath>
	//   29   49:astore          8
		if(path == null)
	//*  30   51:aload           8
	//*  31   53:ifnonnull       70
			mCornerShadowPath = new Path();
	//   32   56:aload_0         
	//   33   57:new             #170 <Class Path>
	//   34   60:dup             
	//   35   61:invokespecial   #171 <Method void Path()>
	//   36   64:putfield        #168 <Field Path mCornerShadowPath>
		else
	//*  37   67:goto            75
			path.reset();
	//   38   70:aload           8
	//   39   72:invokevirtual   #174 <Method void Path.reset()>
		mCornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
	//   40   75:aload_0         
	//   41   76:getfield        #168 <Field Path mCornerShadowPath>
	//   42   79:getstatic       #180 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   43   82:invokevirtual   #184 <Method void Path.setFillType(android.graphics.Path$FillType)>
		mCornerShadowPath.moveTo(-mCornerRadius, 0.0F);
	//   44   85:aload_0         
	//   45   86:getfield        #168 <Field Path mCornerShadowPath>
	//   46   89:aload_0         
	//   47   90:getfield        #113 <Field float mCornerRadius>
	//   48   93:fneg            
	//   49   94:fconst_0        
	//   50   95:invokevirtual   #187 <Method void Path.moveTo(float, float)>
		mCornerShadowPath.rLineTo(-mShadowSize, 0.0F);
	//   51   98:aload_0         
	//   52   99:getfield        #168 <Field Path mCornerShadowPath>
	//   53  102:aload_0         
	//   54  103:getfield        #163 <Field float mShadowSize>
	//   55  106:fneg            
	//   56  107:fconst_0        
	//   57  108:invokevirtual   #190 <Method void Path.rLineTo(float, float)>
		mCornerShadowPath.arcTo(((RectF) (obj1)), 180F, 90F, false);
	//   58  111:aload_0         
	//   59  112:getfield        #168 <Field Path mCornerShadowPath>
	//   60  115:aload           7
	//   61  117:ldc1            #191 <Float 180F>
	//   62  119:ldc1            #192 <Float 90F>
	//   63  121:iconst_0        
	//   64  122:invokevirtual   #196 <Method void Path.arcTo(RectF, float, float, boolean)>
		mCornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
	//   65  125:aload_0         
	//   66  126:getfield        #168 <Field Path mCornerShadowPath>
	//   67  129:aload           6
	//   68  131:ldc1            #197 <Float 270F>
	//   69  133:ldc1            #198 <Float -90F>
	//   70  135:iconst_0        
	//   71  136:invokevirtual   #196 <Method void Path.arcTo(RectF, float, float, boolean)>
		mCornerShadowPath.close();
	//   72  139:aload_0         
	//   73  140:getfield        #168 <Field Path mCornerShadowPath>
	//   74  143:invokevirtual   #201 <Method void Path.close()>
		f = mCornerRadius;
	//   75  146:aload_0         
	//   76  147:getfield        #113 <Field float mCornerRadius>
	//   77  150:fstore_1        
		float f1 = mShadowSize;
	//   78  151:aload_0         
	//   79  152:getfield        #163 <Field float mShadowSize>
	//   80  155:fstore_2        
		float f2 = f / (f + f1);
	//   81  156:fload_1         
	//   82  157:fload_1         
	//   83  158:fload_2         
	//   84  159:fadd            
	//   85  160:fdiv            
	//   86  161:fstore_3        
		obj = ((Object) (mCornerShadowPaint));
	//   87  162:aload_0         
	//   88  163:getfield        #100 <Field Paint mCornerShadowPaint>
	//   89  166:astore          6
		int i = mShadowStartColor;
	//   90  168:aload_0         
	//   91  169:getfield        #72  <Field int mShadowStartColor>
	//   92  172:istore          4
		int j = mShadowEndColor;
	//   93  174:aload_0         
	//   94  175:getfield        #77  <Field int mShadowEndColor>
	//   95  178:istore          5
		obj1 = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//   96  180:getstatic       #207 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   97  183:astore          7
		((Paint) (obj)).setShader(((android.graphics.Shader) (new RadialGradient(0.0F, 0.0F, f + f1, new int[] {
			i, i, j
		}, new float[] {
			0.0F, f2, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj1))))));
	//   98  185:aload           6
	//   99  187:new             #209 <Class RadialGradient>
	//  100  190:dup             
	//  101  191:fconst_0        
	//  102  192:fconst_0        
	//  103  193:fload_1         
	//  104  194:fload_2         
	//  105  195:fadd            
	//  106  196:iconst_3        
	//  107  197:newarray        int[]
	//  108  199:dup             
	//  109  200:iconst_0        
	//  110  201:iload           4
	//  111  203:iastore         
	//  112  204:dup             
	//  113  205:iconst_1        
	//  114  206:iload           4
	//  115  208:iastore         
	//  116  209:dup             
	//  117  210:iconst_2        
	//  118  211:iload           5
	//  119  213:iastore         
	//  120  214:iconst_3        
	//  121  215:newarray        float[]
	//  122  217:dup             
	//  123  218:iconst_0        
	//  124  219:fconst_0        
	//  125  220:fastore         
	//  126  221:dup             
	//  127  222:iconst_1        
	//  128  223:fload_3         
	//  129  224:fastore         
	//  130  225:dup             
	//  131  226:iconst_2        
	//  132  227:fconst_1        
	//  133  228:fastore         
	//  134  229:aload           7
	//  135  231:invokespecial   #212 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  136  234:invokevirtual   #216 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  137  237:pop             
		obj = ((Object) (mEdgeShadowPaint));
	//  138  238:aload_0         
	//  139  239:getfield        #123 <Field Paint mEdgeShadowPaint>
	//  140  242:astore          6
		f2 = mCornerRadius;
	//  141  244:aload_0         
	//  142  245:getfield        #113 <Field float mCornerRadius>
	//  143  248:fstore_3        
		f = -f2;
	//  144  249:fload_3         
	//  145  250:fneg            
	//  146  251:fstore_1        
		f1 = mShadowSize;
	//  147  252:aload_0         
	//  148  253:getfield        #163 <Field float mShadowSize>
	//  149  256:fstore_2        
		f2 = -f2;
	//  150  257:fload_3         
	//  151  258:fneg            
	//  152  259:fstore_3        
		i = mShadowStartColor;
	//  153  260:aload_0         
	//  154  261:getfield        #72  <Field int mShadowStartColor>
	//  155  264:istore          4
		j = mShadowEndColor;
	//  156  266:aload_0         
	//  157  267:getfield        #77  <Field int mShadowEndColor>
	//  158  270:istore          5
		obj1 = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//  159  272:getstatic       #207 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  160  275:astore          7
		((Paint) (obj)).setShader(((android.graphics.Shader) (new LinearGradient(0.0F, f + f1, 0.0F, f2 - f1, new int[] {
			i, i, j
		}, new float[] {
			0.0F, 0.5F, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj1))))));
	//  161  277:aload           6
	//  162  279:new             #218 <Class LinearGradient>
	//  163  282:dup             
	//  164  283:fconst_0        
	//  165  284:fload_1         
	//  166  285:fload_2         
	//  167  286:fadd            
	//  168  287:fconst_0        
	//  169  288:fload_3         
	//  170  289:fload_2         
	//  171  290:fsub            
	//  172  291:iconst_3        
	//  173  292:newarray        int[]
	//  174  294:dup             
	//  175  295:iconst_0        
	//  176  296:iload           4
	//  177  298:iastore         
	//  178  299:dup             
	//  179  300:iconst_1        
	//  180  301:iload           4
	//  181  303:iastore         
	//  182  304:dup             
	//  183  305:iconst_2        
	//  184  306:iload           5
	//  185  308:iastore         
	//  186  309:iconst_3        
	//  187  310:newarray        float[]
	//  188  312:dup             
	//  189  313:iconst_0        
	//  190  314:fconst_0        
	//  191  315:fastore         
	//  192  316:dup             
	//  193  317:iconst_1        
	//  194  318:ldc1            #111 <Float 0.5F>
	//  195  320:fastore         
	//  196  321:dup             
	//  197  322:iconst_2        
	//  198  323:fconst_1        
	//  199  324:fastore         
	//  200  325:aload           7
	//  201  327:invokespecial   #221 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  202  330:invokevirtual   #216 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  203  333:pop             
		mEdgeShadowPaint.setAntiAlias(false);
	//  204  334:aload_0         
	//  205  335:getfield        #123 <Field Paint mEdgeShadowPaint>
	//  206  338:iconst_0        
	//  207  339:invokevirtual   #127 <Method void Paint.setAntiAlias(boolean)>
	//  208  342:return          
	}

	static float calculateHorizontalPadding(float f, float f1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            38
		{
			double d = f;
	//    2    4:fload_0         
	//    3    5:f2d             
	//    4    6:dstore_3        
			double d1 = COS_45;
	//    5    7:getstatic       #48  <Field double COS_45>
	//    6   10:dstore          5
			double d2 = f1;
	//    7   12:fload_1         
	//    8   13:f2d             
	//    9   14:dstore          7
			Double.isNaN(d2);
	//   10   16:dload           7
	//   11   18:invokestatic    #229 <Method boolean Double.isNaN(double)>
	//   12   21:pop             
			Double.isNaN(d);
	//   13   22:dload_3         
	//   14   23:invokestatic    #229 <Method boolean Double.isNaN(double)>
	//   15   26:pop             
			return (float)(d + (1.0D - d1) * d2);
	//   16   27:dload_3         
	//   17   28:dconst_1        
	//   18   29:dload           5
	//   19   31:dsub            
	//   20   32:dload           7
	//   21   34:dmul            
	//   22   35:dadd            
	//   23   36:d2f             
	//   24   37:freturn         
		} else
		{
			return f;
	//   25   38:fload_0         
	//   26   39:freturn         
		}
	}

	static float calculateVerticalPadding(float f, float f1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            41
		{
			double d = f * 1.5F;
	//    2    4:fload_0         
	//    3    5:ldc1            #9   <Float 1.5F>
	//    4    7:fmul            
	//    5    8:f2d             
	//    6    9:dstore_3        
			double d1 = COS_45;
	//    7   10:getstatic       #48  <Field double COS_45>
	//    8   13:dstore          5
			double d2 = f1;
	//    9   15:fload_1         
	//   10   16:f2d             
	//   11   17:dstore          7
			Double.isNaN(d2);
	//   12   19:dload           7
	//   13   21:invokestatic    #229 <Method boolean Double.isNaN(double)>
	//   14   24:pop             
			Double.isNaN(d);
	//   15   25:dload_3         
	//   16   26:invokestatic    #229 <Method boolean Double.isNaN(double)>
	//   17   29:pop             
			return (float)(d + (1.0D - d1) * d2);
	//   18   30:dload_3         
	//   19   31:dconst_1        
	//   20   32:dload           5
	//   21   34:dsub            
	//   22   35:dload           7
	//   23   37:dmul            
	//   24   38:dadd            
	//   25   39:d2f             
	//   26   40:freturn         
		} else
		{
			return f * 1.5F;
	//   27   41:fload_0         
	//   28   42:ldc1            #9   <Float 1.5F>
	//   29   44:fmul            
	//   30   45:freturn         
		}
	}

	private void drawShadow(Canvas canvas)
	{
		float f1 = mCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field float mCornerRadius>
	//    2    4:fstore_3        
		float f = -f1 - mShadowSize;
	//    3    5:fload_3         
	//    4    6:fneg            
	//    5    7:aload_0         
	//    6    8:getfield        #163 <Field float mShadowSize>
	//    7   11:fsub            
	//    8   12:fstore_2        
		f1 = f1 + (float)mInsetShadow + mRawShadowSize / 2.0F;
	//    9   13:fload_3         
	//   10   14:aload_0         
	//   11   15:getfield        #87  <Field int mInsetShadow>
	//   12   18:i2f             
	//   13   19:fadd            
	//   14   20:aload_0         
	//   15   21:getfield        #234 <Field float mRawShadowSize>
	//   16   24:fconst_2        
	//   17   25:fdiv            
	//   18   26:fadd            
	//   19   27:fstore_3        
		float f2 = mCardBounds.width();
	//   20   28:aload_0         
	//   21   29:getfield        #118 <Field RectF mCardBounds>
	//   22   32:invokevirtual   #238 <Method float RectF.width()>
	//   23   35:fstore          4
		float f3 = f1 * 2.0F;
	//   24   37:fload_3         
	//   25   38:fconst_2        
	//   26   39:fmul            
	//   27   40:fstore          5
		boolean flag;
		if(f2 - f3 > 0.0F)
	//*  28   42:fload           4
	//*  29   44:fload           5
	//*  30   46:fsub            
	//*  31   47:fconst_0        
	//*  32   48:fcmpl           
	//*  33   49:ifle            58
			flag = true;
	//   34   52:iconst_1        
	//   35   53:istore          6
		else
	//*  36   55:goto            61
			flag = false;
	//   37   58:iconst_0        
	//   38   59:istore          6
		boolean flag1;
		if(mCardBounds.height() - f3 > 0.0F)
	//*  39   61:aload_0         
	//*  40   62:getfield        #118 <Field RectF mCardBounds>
	//*  41   65:invokevirtual   #241 <Method float RectF.height()>
	//*  42   68:fload           5
	//*  43   70:fsub            
	//*  44   71:fconst_0        
	//*  45   72:fcmpl           
	//*  46   73:ifle            82
			flag1 = true;
	//   47   76:iconst_1        
	//   48   77:istore          7
		else
	//*  49   79:goto            85
			flag1 = false;
	//   50   82:iconst_0        
	//   51   83:istore          7
		int j = canvas.save();
	//   52   85:aload_1         
	//   53   86:invokevirtual   #247 <Method int Canvas.save()>
	//   54   89:istore          8
		canvas.translate(mCardBounds.left + f1, mCardBounds.top + f1);
	//   55   91:aload_1         
	//   56   92:aload_0         
	//   57   93:getfield        #118 <Field RectF mCardBounds>
	//   58   96:getfield        #249 <Field float RectF.left>
	//   59   99:fload_3         
	//   60  100:fadd            
	//   61  101:aload_0         
	//   62  102:getfield        #118 <Field RectF mCardBounds>
	//   63  105:getfield        #251 <Field float RectF.top>
	//   64  108:fload_3         
	//   65  109:fadd            
	//   66  110:invokevirtual   #254 <Method void Canvas.translate(float, float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//   67  113:aload_1         
	//   68  114:aload_0         
	//   69  115:getfield        #168 <Field Path mCornerShadowPath>
	//   70  118:aload_0         
	//   71  119:getfield        #100 <Field Paint mCornerShadowPaint>
	//   72  122:invokevirtual   #258 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//*  73  125:iload           6
	//*  74  127:ifeq            155
			canvas.drawRect(0.0F, f, mCardBounds.width() - f3, -mCornerRadius, mEdgeShadowPaint);
	//   75  130:aload_1         
	//   76  131:fconst_0        
	//   77  132:fload_2         
	//   78  133:aload_0         
	//   79  134:getfield        #118 <Field RectF mCardBounds>
	//   80  137:invokevirtual   #238 <Method float RectF.width()>
	//   81  140:fload           5
	//   82  142:fsub            
	//   83  143:aload_0         
	//   84  144:getfield        #113 <Field float mCornerRadius>
	//   85  147:fneg            
	//   86  148:aload_0         
	//   87  149:getfield        #123 <Field Paint mEdgeShadowPaint>
	//   88  152:invokevirtual   #262 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(j);
	//   89  155:aload_1         
	//   90  156:iload           8
	//   91  158:invokevirtual   #265 <Method void Canvas.restoreToCount(int)>
		j = canvas.save();
	//   92  161:aload_1         
	//   93  162:invokevirtual   #247 <Method int Canvas.save()>
	//   94  165:istore          8
		canvas.translate(mCardBounds.right - f1, mCardBounds.bottom - f1);
	//   95  167:aload_1         
	//   96  168:aload_0         
	//   97  169:getfield        #118 <Field RectF mCardBounds>
	//   98  172:getfield        #267 <Field float RectF.right>
	//   99  175:fload_3         
	//  100  176:fsub            
	//  101  177:aload_0         
	//  102  178:getfield        #118 <Field RectF mCardBounds>
	//  103  181:getfield        #269 <Field float RectF.bottom>
	//  104  184:fload_3         
	//  105  185:fsub            
	//  106  186:invokevirtual   #254 <Method void Canvas.translate(float, float)>
		canvas.rotate(180F);
	//  107  189:aload_1         
	//  108  190:ldc1            #191 <Float 180F>
	//  109  192:invokevirtual   #273 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  110  195:aload_1         
	//  111  196:aload_0         
	//  112  197:getfield        #168 <Field Path mCornerShadowPath>
	//  113  200:aload_0         
	//  114  201:getfield        #100 <Field Paint mCornerShadowPaint>
	//  115  204:invokevirtual   #258 <Method void Canvas.drawPath(Path, Paint)>
		if(flag)
	//* 116  207:iload           6
	//* 117  209:ifeq            242
			canvas.drawRect(0.0F, f, mCardBounds.width() - f3, -mCornerRadius + mShadowSize, mEdgeShadowPaint);
	//  118  212:aload_1         
	//  119  213:fconst_0        
	//  120  214:fload_2         
	//  121  215:aload_0         
	//  122  216:getfield        #118 <Field RectF mCardBounds>
	//  123  219:invokevirtual   #238 <Method float RectF.width()>
	//  124  222:fload           5
	//  125  224:fsub            
	//  126  225:aload_0         
	//  127  226:getfield        #113 <Field float mCornerRadius>
	//  128  229:fneg            
	//  129  230:aload_0         
	//  130  231:getfield        #163 <Field float mShadowSize>
	//  131  234:fadd            
	//  132  235:aload_0         
	//  133  236:getfield        #123 <Field Paint mEdgeShadowPaint>
	//  134  239:invokevirtual   #262 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(j);
	//  135  242:aload_1         
	//  136  243:iload           8
	//  137  245:invokevirtual   #265 <Method void Canvas.restoreToCount(int)>
		int i = canvas.save();
	//  138  248:aload_1         
	//  139  249:invokevirtual   #247 <Method int Canvas.save()>
	//  140  252:istore          6
		canvas.translate(mCardBounds.left + f1, mCardBounds.bottom - f1);
	//  141  254:aload_1         
	//  142  255:aload_0         
	//  143  256:getfield        #118 <Field RectF mCardBounds>
	//  144  259:getfield        #249 <Field float RectF.left>
	//  145  262:fload_3         
	//  146  263:fadd            
	//  147  264:aload_0         
	//  148  265:getfield        #118 <Field RectF mCardBounds>
	//  149  268:getfield        #269 <Field float RectF.bottom>
	//  150  271:fload_3         
	//  151  272:fsub            
	//  152  273:invokevirtual   #254 <Method void Canvas.translate(float, float)>
		canvas.rotate(270F);
	//  153  276:aload_1         
	//  154  277:ldc1            #197 <Float 270F>
	//  155  279:invokevirtual   #273 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  156  282:aload_1         
	//  157  283:aload_0         
	//  158  284:getfield        #168 <Field Path mCornerShadowPath>
	//  159  287:aload_0         
	//  160  288:getfield        #100 <Field Paint mCornerShadowPaint>
	//  161  291:invokevirtual   #258 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 162  294:iload           7
	//* 163  296:ifeq            324
			canvas.drawRect(0.0F, f, mCardBounds.height() - f3, -mCornerRadius, mEdgeShadowPaint);
	//  164  299:aload_1         
	//  165  300:fconst_0        
	//  166  301:fload_2         
	//  167  302:aload_0         
	//  168  303:getfield        #118 <Field RectF mCardBounds>
	//  169  306:invokevirtual   #241 <Method float RectF.height()>
	//  170  309:fload           5
	//  171  311:fsub            
	//  172  312:aload_0         
	//  173  313:getfield        #113 <Field float mCornerRadius>
	//  174  316:fneg            
	//  175  317:aload_0         
	//  176  318:getfield        #123 <Field Paint mEdgeShadowPaint>
	//  177  321:invokevirtual   #262 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(i);
	//  178  324:aload_1         
	//  179  325:iload           6
	//  180  327:invokevirtual   #265 <Method void Canvas.restoreToCount(int)>
		i = canvas.save();
	//  181  330:aload_1         
	//  182  331:invokevirtual   #247 <Method int Canvas.save()>
	//  183  334:istore          6
		canvas.translate(mCardBounds.right - f1, mCardBounds.top + f1);
	//  184  336:aload_1         
	//  185  337:aload_0         
	//  186  338:getfield        #118 <Field RectF mCardBounds>
	//  187  341:getfield        #267 <Field float RectF.right>
	//  188  344:fload_3         
	//  189  345:fsub            
	//  190  346:aload_0         
	//  191  347:getfield        #118 <Field RectF mCardBounds>
	//  192  350:getfield        #251 <Field float RectF.top>
	//  193  353:fload_3         
	//  194  354:fadd            
	//  195  355:invokevirtual   #254 <Method void Canvas.translate(float, float)>
		canvas.rotate(90F);
	//  196  358:aload_1         
	//  197  359:ldc1            #192 <Float 90F>
	//  198  361:invokevirtual   #273 <Method void Canvas.rotate(float)>
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
	//  199  364:aload_1         
	//  200  365:aload_0         
	//  201  366:getfield        #168 <Field Path mCornerShadowPath>
	//  202  369:aload_0         
	//  203  370:getfield        #100 <Field Paint mCornerShadowPaint>
	//  204  373:invokevirtual   #258 <Method void Canvas.drawPath(Path, Paint)>
		if(flag1)
	//* 205  376:iload           7
	//* 206  378:ifeq            406
			canvas.drawRect(0.0F, f, mCardBounds.height() - f3, -mCornerRadius, mEdgeShadowPaint);
	//  207  381:aload_1         
	//  208  382:fconst_0        
	//  209  383:fload_2         
	//  210  384:aload_0         
	//  211  385:getfield        #118 <Field RectF mCardBounds>
	//  212  388:invokevirtual   #241 <Method float RectF.height()>
	//  213  391:fload           5
	//  214  393:fsub            
	//  215  394:aload_0         
	//  216  395:getfield        #113 <Field float mCornerRadius>
	//  217  398:fneg            
	//  218  399:aload_0         
	//  219  400:getfield        #123 <Field Paint mEdgeShadowPaint>
	//  220  403:invokevirtual   #262 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		canvas.restoreToCount(i);
	//  221  406:aload_1         
	//  222  407:iload           6
	//  223  409:invokevirtual   #265 <Method void Canvas.restoreToCount(int)>
	//  224  412:return          
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
	//    5    7:invokestatic    #279 <Method ColorStateList ColorStateList.valueOf(int)>
	//    6   10:astore_2        
		mBackground = colorstatelist1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #281 <Field ColorStateList mBackground>
		mPaint.setColor(mBackground.getColorForState(getState(), mBackground.getDefaultColor()));
	//   10   16:aload_0         
	//   11   17:getfield        #94  <Field Paint mPaint>
	//   12   20:aload_0         
	//   13   21:getfield        #281 <Field ColorStateList mBackground>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #285 <Method int[] getState()>
	//   16   28:aload_0         
	//   17   29:getfield        #281 <Field ColorStateList mBackground>
	//   18   32:invokevirtual   #288 <Method int ColorStateList.getDefaultColor()>
	//   19   35:invokevirtual   #292 <Method int ColorStateList.getColorForState(int[], int)>
	//   20   38:invokevirtual   #295 <Method void Paint.setColor(int)>
	//   21   41:return          
	}

	private void setShadowSize(float f, float f1)
	{
		if(f >= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            153
		{
			if(f1 >= 0.0F)
	//*   4    6:fload_2         
	//*   5    7:fconst_0        
	//*   6    8:fcmpg           
	//*   7    9:iflt            106
			{
				float f2 = toEven(f);
	//    8   12:aload_0         
	//    9   13:fload_1         
	//   10   14:invokespecial   #299 <Method int toEven(float)>
	//   11   17:i2f             
	//   12   18:fstore_3        
				f1 = toEven(f1);
	//   13   19:aload_0         
	//   14   20:fload_2         
	//   15   21:invokespecial   #299 <Method int toEven(float)>
	//   16   24:i2f             
	//   17   25:fstore_2        
				f = f2;
	//   18   26:fload_3         
	//   19   27:fstore_1        
				if(f2 > f1)
	//*  20   28:fload_3         
	//*  21   29:fload_2         
	//*  22   30:fcmpl           
	//*  23   31:ifle            48
				{
					if(!mPrintedShadowClipWarning)
	//*  24   34:aload_0         
	//*  25   35:getfield        #59  <Field boolean mPrintedShadowClipWarning>
	//*  26   38:ifne            46
						mPrintedShadowClipWarning = true;
	//   27   41:aload_0         
	//   28   42:iconst_1        
	//   29   43:putfield        #59  <Field boolean mPrintedShadowClipWarning>
					f = f1;
	//   30   46:fload_2         
	//   31   47:fstore_1        
				}
				if(mRawShadowSize == f && mRawMaxShadowSize == f1)
	//*  32   48:aload_0         
	//*  33   49:getfield        #234 <Field float mRawShadowSize>
	//*  34   52:fload_1         
	//*  35   53:fcmpl           
	//*  36   54:ifne            67
	//*  37   57:aload_0         
	//*  38   58:getfield        #135 <Field float mRawMaxShadowSize>
	//*  39   61:fload_2         
	//*  40   62:fcmpl           
	//*  41   63:ifne            67
				{
					return;
	//   42   66:return          
				} else
				{
					mRawShadowSize = f;
	//   43   67:aload_0         
	//   44   68:fload_1         
	//   45   69:putfield        #234 <Field float mRawShadowSize>
					mRawMaxShadowSize = f1;
	//   46   72:aload_0         
	//   47   73:fload_2         
	//   48   74:putfield        #135 <Field float mRawMaxShadowSize>
					mShadowSize = (int)(f * 1.5F + (float)mInsetShadow + 0.5F);
	//   49   77:aload_0         
	//   50   78:fload_1         
	//   51   79:ldc1            #9   <Float 1.5F>
	//   52   81:fmul            
	//   53   82:aload_0         
	//   54   83:getfield        #87  <Field int mInsetShadow>
	//   55   86:i2f             
	//   56   87:fadd            
	//   57   88:ldc1            #111 <Float 0.5F>
	//   58   90:fadd            
	//   59   91:f2i             
	//   60   92:i2f             
	//   61   93:putfield        #163 <Field float mShadowSize>
					mDirty = true;
	//   62   96:aload_0         
	//   63   97:iconst_1        
	//   64   98:putfield        #55  <Field boolean mDirty>
					invalidateSelf();
	//   65  101:aload_0         
	//   66  102:invokevirtual   #302 <Method void invalidateSelf()>
					return;
	//   67  105:return          
				}
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   68  106:new             #304 <Class StringBuilder>
	//   69  109:dup             
	//   70  110:invokespecial   #305 <Method void StringBuilder()>
	//   71  113:astore          4
				stringbuilder.append("Invalid max shadow size ");
	//   72  115:aload           4
	//   73  117:ldc2            #307 <String "Invalid max shadow size ">
	//   74  120:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   75  123:pop             
				stringbuilder.append(f1);
	//   76  124:aload           4
	//   77  126:fload_2         
	//   78  127:invokevirtual   #314 <Method StringBuilder StringBuilder.append(float)>
	//   79  130:pop             
				stringbuilder.append(". Must be >= 0");
	//   80  131:aload           4
	//   81  133:ldc2            #316 <String ". Must be >= 0">
	//   82  136:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   83  139:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   84  140:new             #318 <Class IllegalArgumentException>
	//   85  143:dup             
	//   86  144:aload           4
	//   87  146:invokevirtual   #322 <Method String StringBuilder.toString()>
	//   88  149:invokespecial   #325 <Method void IllegalArgumentException(String)>
	//   89  152:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   90  153:new             #304 <Class StringBuilder>
	//   91  156:dup             
	//   92  157:invokespecial   #305 <Method void StringBuilder()>
	//   93  160:astore          4
			stringbuilder1.append("Invalid shadow size ");
	//   94  162:aload           4
	//   95  164:ldc2            #327 <String "Invalid shadow size ">
	//   96  167:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   97  170:pop             
			stringbuilder1.append(f);
	//   98  171:aload           4
	//   99  173:fload_1         
	//  100  174:invokevirtual   #314 <Method StringBuilder StringBuilder.append(float)>
	//  101  177:pop             
			stringbuilder1.append(". Must be >= 0");
	//  102  178:aload           4
	//  103  180:ldc2            #316 <String ". Must be >= 0">
	//  104  183:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//  105  186:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//  106  187:new             #318 <Class IllegalArgumentException>
	//  107  190:dup             
	//  108  191:aload           4
	//  109  193:invokevirtual   #322 <Method String StringBuilder.toString()>
	//  110  196:invokespecial   #325 <Method void IllegalArgumentException(String)>
	//  111  199:athrow          
		}
	}

	private int toEven(float f)
	{
		int i = (int)(f + 0.5F);
	//    0    0:fload_1         
	//    1    1:ldc1            #111 <Float 0.5F>
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
	//*   1    1:getfield        #55  <Field boolean mDirty>
	//*   2    4:ifeq            20
		{
			buildComponents(getBounds());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #332 <Method Rect getBounds()>
	//    6   12:invokespecial   #334 <Method void buildComponents(Rect)>
			mDirty = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #55  <Field boolean mDirty>
		}
		canvas.translate(0.0F, mRawShadowSize / 2.0F);
	//   10   20:aload_1         
	//   11   21:fconst_0        
	//   12   22:aload_0         
	//   13   23:getfield        #234 <Field float mRawShadowSize>
	//   14   26:fconst_2        
	//   15   27:fdiv            
	//   16   28:invokevirtual   #254 <Method void Canvas.translate(float, float)>
		drawShadow(canvas);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokespecial   #336 <Method void drawShadow(Canvas)>
		canvas.translate(0.0F, -mRawShadowSize / 2.0F);
	//   20   36:aload_1         
	//   21   37:fconst_0        
	//   22   38:aload_0         
	//   23   39:getfield        #234 <Field float mRawShadowSize>
	//   24   42:fneg            
	//   25   43:fconst_2        
	//   26   44:fdiv            
	//   27   45:invokevirtual   #254 <Method void Canvas.translate(float, float)>
		sRoundRectHelper.drawRoundRect(canvas, mCardBounds, mCornerRadius, mPaint);
	//   28   48:getstatic       #338 <Field RoundRectDrawableWithShadow$RoundRectHelper sRoundRectHelper>
	//   29   51:aload_1         
	//   30   52:aload_0         
	//   31   53:getfield        #118 <Field RectF mCardBounds>
	//   32   56:aload_0         
	//   33   57:getfield        #113 <Field float mCornerRadius>
	//   34   60:aload_0         
	//   35   61:getfield        #94  <Field Paint mPaint>
	//   36   64:invokeinterface #344 <Method void RoundRectDrawableWithShadow$RoundRectHelper.drawRoundRect(Canvas, RectF, float, Paint)>
	//   37   69:return          
	}

	ColorStateList getColor()
	{
		return mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field ColorStateList mBackground>
	//    2    4:areturn         
	}

	float getCornerRadius()
	{
		return mCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field float mCornerRadius>
	//    2    4:freturn         
	}

	void getMaxShadowAndCornerPadding(Rect rect)
	{
		getPadding(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #351 <Method boolean getPadding(Rect)>
	//    3    5:pop             
	//    4    6:return          
	}

	float getMaxShadowSize()
	{
		return mRawMaxShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field float mRawMaxShadowSize>
	//    2    4:freturn         
	}

	float getMinHeight()
	{
		float f = mRawMaxShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field float mRawMaxShadowSize>
	//    2    4:fstore_1        
		return Math.max(f, mCornerRadius + (float)mInsetShadow + (f * 1.5F) / 2.0F) * 2.0F + (mRawMaxShadowSize * 1.5F + (float)mInsetShadow) * 2.0F;
	//    3    5:fload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #113 <Field float mCornerRadius>
	//    6   10:aload_0         
	//    7   11:getfield        #87  <Field int mInsetShadow>
	//    8   14:i2f             
	//    9   15:fadd            
	//   10   16:fload_1         
	//   11   17:ldc1            #9   <Float 1.5F>
	//   12   19:fmul            
	//   13   20:fconst_2        
	//   14   21:fdiv            
	//   15   22:fadd            
	//   16   23:invokestatic    #357 <Method float Math.max(float, float)>
	//   17   26:fconst_2        
	//   18   27:fmul            
	//   19   28:aload_0         
	//   20   29:getfield        #135 <Field float mRawMaxShadowSize>
	//   21   32:ldc1            #9   <Float 1.5F>
	//   22   34:fmul            
	//   23   35:aload_0         
	//   24   36:getfield        #87  <Field int mInsetShadow>
	//   25   39:i2f             
	//   26   40:fadd            
	//   27   41:fconst_2        
	//   28   42:fmul            
	//   29   43:fadd            
	//   30   44:freturn         
	}

	float getMinWidth()
	{
		float f = mRawMaxShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field float mRawMaxShadowSize>
	//    2    4:fstore_1        
		return Math.max(f, mCornerRadius + (float)mInsetShadow + f / 2.0F) * 2.0F + (mRawMaxShadowSize + (float)mInsetShadow) * 2.0F;
	//    3    5:fload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #113 <Field float mCornerRadius>
	//    6   10:aload_0         
	//    7   11:getfield        #87  <Field int mInsetShadow>
	//    8   14:i2f             
	//    9   15:fadd            
	//   10   16:fload_1         
	//   11   17:fconst_2        
	//   12   18:fdiv            
	//   13   19:fadd            
	//   14   20:invokestatic    #357 <Method float Math.max(float, float)>
	//   15   23:fconst_2        
	//   16   24:fmul            
	//   17   25:aload_0         
	//   18   26:getfield        #135 <Field float mRawMaxShadowSize>
	//   19   29:aload_0         
	//   20   30:getfield        #87  <Field int mInsetShadow>
	//   21   33:i2f             
	//   22   34:fadd            
	//   23   35:fconst_2        
	//   24   36:fmul            
	//   25   37:fadd            
	//   26   38:freturn         
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
	//    1    1:getfield        #135 <Field float mRawMaxShadowSize>
	//    2    4:aload_0         
	//    3    5:getfield        #113 <Field float mCornerRadius>
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field boolean mAddPaddingForCorners>
	//    6   12:invokestatic    #361 <Method float calculateVerticalPadding(float, float, boolean)>
	//    7   15:f2d             
	//    8   16:invokestatic    #364 <Method double Math.ceil(double)>
	//    9   19:d2i             
	//   10   20:istore_2        
		int j = (int)Math.ceil(calculateHorizontalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
	//   11   21:aload_0         
	//   12   22:getfield        #135 <Field float mRawMaxShadowSize>
	//   13   25:aload_0         
	//   14   26:getfield        #113 <Field float mCornerRadius>
	//   15   29:aload_0         
	//   16   30:getfield        #57  <Field boolean mAddPaddingForCorners>
	//   17   33:invokestatic    #366 <Method float calculateHorizontalPadding(float, float, boolean)>
	//   18   36:f2d             
	//   19   37:invokestatic    #364 <Method double Math.ceil(double)>
	//   20   40:d2i             
	//   21   41:istore_3        
		rect.set(j, i, j, i);
	//   22   42:aload_1         
	//   23   43:iload_3         
	//   24   44:iload_2         
	//   25   45:iload_3         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #369 <Method void Rect.set(int, int, int, int)>
		return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
	}

	float getShadowSize()
	{
		return mRawShadowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field float mRawShadowSize>
	//    2    4:freturn         
	}

	public boolean isStateful()
	{
		ColorStateList colorstatelist = mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field ColorStateList mBackground>
	//    2    4:astore_1        
		return colorstatelist != null && colorstatelist.isStateful() || super.isStateful();
	//    3    5:aload_1         
	//    4    6:ifnull          16
	//    5    9:aload_1         
	//    6   10:invokevirtual   #374 <Method boolean ColorStateList.isStateful()>
	//    7   13:ifne            23
	//    8   16:aload_0         
	//    9   17:invokespecial   #375 <Method boolean Drawable.isStateful()>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		super.onBoundsChange(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #378 <Method void Drawable.onBoundsChange(Rect)>
		mDirty = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #55  <Field boolean mDirty>
	//    6   10:return          
	}

	protected boolean onStateChange(int ai[])
	{
		ColorStateList colorstatelist = mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field ColorStateList mBackground>
	//    2    4:astore_3        
		int i = colorstatelist.getColorForState(ai, colorstatelist.getDefaultColor());
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #288 <Method int ColorStateList.getDefaultColor()>
	//    7   11:invokevirtual   #292 <Method int ColorStateList.getColorForState(int[], int)>
	//    8   14:istore_2        
		if(mPaint.getColor() == i)
	//*   9   15:aload_0         
	//*  10   16:getfield        #94  <Field Paint mPaint>
	//*  11   19:invokevirtual   #382 <Method int Paint.getColor()>
	//*  12   22:iload_2         
	//*  13   23:icmpne          28
		{
			return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
		} else
		{
			mPaint.setColor(i);
	//   16   28:aload_0         
	//   17   29:getfield        #94  <Field Paint mPaint>
	//   18   32:iload_2         
	//   19   33:invokevirtual   #295 <Method void Paint.setColor(int)>
			mDirty = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #55  <Field boolean mDirty>
			invalidateSelf();
	//   23   41:aload_0         
	//   24   42:invokevirtual   #302 <Method void invalidateSelf()>
			return true;
	//   25   45:iconst_1        
	//   26   46:ireturn         
		}
	}

	void setAddPaddingForCorners(boolean flag)
	{
		mAddPaddingForCorners = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean mAddPaddingForCorners>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #302 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setAlpha(int i)
	{
		mPaint.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Paint mPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #386 <Method void Paint.setAlpha(int)>
		mCornerShadowPaint.setAlpha(i);
	//    4    8:aload_0         
	//    5    9:getfield        #100 <Field Paint mCornerShadowPaint>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #386 <Method void Paint.setAlpha(int)>
		mEdgeShadowPaint.setAlpha(i);
	//    8   16:aload_0         
	//    9   17:getfield        #123 <Field Paint mEdgeShadowPaint>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #386 <Method void Paint.setAlpha(int)>
	//   12   24:return          
	}

	void setColor(ColorStateList colorstatelist)
	{
		setBackground(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void setBackground(ColorStateList)>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #302 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #391 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setCornerRadius(float f)
	{
		if(f >= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            38
		{
			f = (int)(f + 0.5F);
	//    4    6:fload_1         
	//    5    7:ldc1            #111 <Float 0.5F>
	//    6    9:fadd            
	//    7   10:f2i             
	//    8   11:i2f             
	//    9   12:fstore_1        
			if(mCornerRadius == f)
	//*  10   13:aload_0         
	//*  11   14:getfield        #113 <Field float mCornerRadius>
	//*  12   17:fload_1         
	//*  13   18:fcmpl           
	//*  14   19:ifne            23
			{
				return;
	//   15   22:return          
			} else
			{
				mCornerRadius = f;
	//   16   23:aload_0         
	//   17   24:fload_1         
	//   18   25:putfield        #113 <Field float mCornerRadius>
				mDirty = true;
	//   19   28:aload_0         
	//   20   29:iconst_1        
	//   21   30:putfield        #55  <Field boolean mDirty>
				invalidateSelf();
	//   22   33:aload_0         
	//   23   34:invokevirtual   #302 <Method void invalidateSelf()>
				return;
	//   24   37:return          
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   25   38:new             #304 <Class StringBuilder>
	//   26   41:dup             
	//   27   42:invokespecial   #305 <Method void StringBuilder()>
	//   28   45:astore_2        
			stringbuilder.append("Invalid radius ");
	//   29   46:aload_2         
	//   30   47:ldc2            #394 <String "Invalid radius ">
	//   31   50:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   32   53:pop             
			stringbuilder.append(f);
	//   33   54:aload_2         
	//   34   55:fload_1         
	//   35   56:invokevirtual   #314 <Method StringBuilder StringBuilder.append(float)>
	//   36   59:pop             
			stringbuilder.append(". Must be >= 0");
	//   37   60:aload_2         
	//   38   61:ldc2            #316 <String ". Must be >= 0">
	//   39   64:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   40   67:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   41   68:new             #318 <Class IllegalArgumentException>
	//   42   71:dup             
	//   43   72:aload_2         
	//   44   73:invokevirtual   #322 <Method String StringBuilder.toString()>
	//   45   76:invokespecial   #325 <Method void IllegalArgumentException(String)>
	//   46   79:athrow          
		}
	}

	void setMaxShadowSize(float f)
	{
		setShadowSize(mRawShadowSize, f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #234 <Field float mRawShadowSize>
	//    3    5:fload_1         
	//    4    6:invokespecial   #131 <Method void setShadowSize(float, float)>
	//    5    9:return          
	}

	void setShadowSize(float f)
	{
		setShadowSize(f, mRawMaxShadowSize);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #135 <Field float mRawMaxShadowSize>
	//    4    6:invokespecial   #131 <Method void setShadowSize(float, float)>
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
	//    0    0:ldc2w           #36  <Double 45D>
	//    1    3:invokestatic    #43  <Method double Math.toRadians(double)>
	//    2    6:invokestatic    #46  <Method double Math.cos(double)>
	//    3    9:putstatic       #48  <Field double COS_45>
	//*   4   12:return          
	}

	private class RoundRectHelper
	{

		public abstract void drawRoundRect(Canvas canvas, RectF rectf, float f, Paint paint);
	}

}
