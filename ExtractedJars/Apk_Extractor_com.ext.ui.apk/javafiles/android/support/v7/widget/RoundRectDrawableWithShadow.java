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
		float f;
		float f1;
		float f2;
		float f3;
		int i;
		int j;
		int k;
		if(mCornerShadowPath == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #171 <Field Path mCornerShadowPath>
	//*  29   57:ifnonnull       368
			mCornerShadowPath = new Path();
	//   30   60:aload_0         
	//   31   61:new             #173 <Class Path>
	//   32   64:dup             
	//   33   65:invokespecial   #174 <Method void Path()>
	//   34   68:putfield        #171 <Field Path mCornerShadowPath>
		else
	//*  35   71:aload_0         
	//*  36   72:getfield        #171 <Field Path mCornerShadowPath>
	//*  37   75:getstatic       #180 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//*  38   78:invokevirtual   #184 <Method void Path.setFillType(android.graphics.Path$FillType)>
	//*  39   81:aload_0         
	//*  40   82:getfield        #171 <Field Path mCornerShadowPath>
	//*  41   85:aload_0         
	//*  42   86:getfield        #116 <Field float mCornerRadius>
	//*  43   89:fneg            
	//*  44   90:fconst_0        
	//*  45   91:invokevirtual   #187 <Method void Path.moveTo(float, float)>
	//*  46   94:aload_0         
	//*  47   95:getfield        #171 <Field Path mCornerShadowPath>
	//*  48   98:aload_0         
	//*  49   99:getfield        #166 <Field float mShadowSize>
	//*  50  102:fneg            
	//*  51  103:fconst_0        
	//*  52  104:invokevirtual   #190 <Method void Path.rLineTo(float, float)>
	//*  53  107:aload_0         
	//*  54  108:getfield        #171 <Field Path mCornerShadowPath>
	//*  55  111:aload           9
	//*  56  113:ldc1            #191 <Float 180F>
	//*  57  115:ldc1            #192 <Float 90F>
	//*  58  117:iconst_0        
	//*  59  118:invokevirtual   #196 <Method void Path.arcTo(RectF, float, float, boolean)>
	//*  60  121:aload_0         
	//*  61  122:getfield        #171 <Field Path mCornerShadowPath>
	//*  62  125:aload           8
	//*  63  127:ldc1            #197 <Float 270F>
	//*  64  129:ldc1            #198 <Float -90F>
	//*  65  131:iconst_0        
	//*  66  132:invokevirtual   #196 <Method void Path.arcTo(RectF, float, float, boolean)>
	//*  67  135:aload_0         
	//*  68  136:getfield        #171 <Field Path mCornerShadowPath>
	//*  69  139:invokevirtual   #201 <Method void Path.close()>
	//*  70  142:aload_0         
	//*  71  143:getfield        #116 <Field float mCornerRadius>
	//*  72  146:aload_0         
	//*  73  147:getfield        #116 <Field float mCornerRadius>
	//*  74  150:aload_0         
	//*  75  151:getfield        #166 <Field float mShadowSize>
	//*  76  154:fadd            
	//*  77  155:fdiv            
	//*  78  156:fstore_1        
	//*  79  157:aload_0         
	//*  80  158:getfield        #103 <Field Paint mCornerShadowPaint>
	//*  81  161:astore          8
	//*  82  163:aload_0         
	//*  83  164:getfield        #116 <Field float mCornerRadius>
	//*  84  167:fstore_2        
	//*  85  168:aload_0         
	//*  86  169:getfield        #166 <Field float mShadowSize>
	//*  87  172:fstore_3        
	//*  88  173:aload_0         
	//*  89  174:getfield        #75  <Field int mShadowStartColor>
	//*  90  177:istore          5
	//*  91  179:aload_0         
	//*  92  180:getfield        #75  <Field int mShadowStartColor>
	//*  93  183:istore          6
	//*  94  185:aload_0         
	//*  95  186:getfield        #80  <Field int mShadowEndColor>
	//*  96  189:istore          7
	//*  97  191:getstatic       #207 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//*  98  194:astore          9
	//*  99  196:aload           8
	//* 100  198:new             #209 <Class RadialGradient>
	//* 101  201:dup             
	//* 102  202:fconst_0        
	//* 103  203:fconst_0        
	//* 104  204:fload_2         
	//* 105  205:fload_3         
	//* 106  206:fadd            
	//* 107  207:iconst_3        
	//* 108  208:newarray        int[]
	//* 109  210:dup             
	//* 110  211:iconst_0        
	//* 111  212:iload           5
	//* 112  214:iastore         
	//* 113  215:dup             
	//* 114  216:iconst_1        
	//* 115  217:iload           6
	//* 116  219:iastore         
	//* 117  220:dup             
	//* 118  221:iconst_2        
	//* 119  222:iload           7
	//* 120  224:iastore         
	//* 121  225:iconst_3        
	//* 122  226:newarray        float[]
	//* 123  228:dup             
	//* 124  229:iconst_0        
	//* 125  230:fconst_0        
	//* 126  231:fastore         
	//* 127  232:dup             
	//* 128  233:iconst_1        
	//* 129  234:fload_1         
	//* 130  235:fastore         
	//* 131  236:dup             
	//* 132  237:iconst_2        
	//* 133  238:fconst_1        
	//* 134  239:fastore         
	//* 135  240:aload           9
	//* 136  242:invokespecial   #212 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//* 137  245:invokevirtual   #216 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//* 138  248:pop             
	//* 139  249:aload_0         
	//* 140  250:getfield        #126 <Field Paint mEdgeShadowPaint>
	//* 141  253:astore          8
	//* 142  255:aload_0         
	//* 143  256:getfield        #116 <Field float mCornerRadius>
	//* 144  259:fneg            
	//* 145  260:fstore_1        
	//* 146  261:aload_0         
	//* 147  262:getfield        #166 <Field float mShadowSize>
	//* 148  265:fstore_2        
	//* 149  266:aload_0         
	//* 150  267:getfield        #116 <Field float mCornerRadius>
	//* 151  270:fneg            
	//* 152  271:fstore_3        
	//* 153  272:aload_0         
	//* 154  273:getfield        #166 <Field float mShadowSize>
	//* 155  276:fstore          4
	//* 156  278:aload_0         
	//* 157  279:getfield        #75  <Field int mShadowStartColor>
	//* 158  282:istore          5
	//* 159  284:aload_0         
	//* 160  285:getfield        #75  <Field int mShadowStartColor>
	//* 161  288:istore          6
	//* 162  290:aload_0         
	//* 163  291:getfield        #80  <Field int mShadowEndColor>
	//* 164  294:istore          7
	//* 165  296:getstatic       #207 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//* 166  299:astore          9
	//* 167  301:aload           8
	//* 168  303:new             #218 <Class LinearGradient>
	//* 169  306:dup             
	//* 170  307:fconst_0        
	//* 171  308:fload_1         
	//* 172  309:fload_2         
	//* 173  310:fadd            
	//* 174  311:fconst_0        
	//* 175  312:fload_3         
	//* 176  313:fload           4
	//* 177  315:fsub            
	//* 178  316:iconst_3        
	//* 179  317:newarray        int[]
	//* 180  319:dup             
	//* 181  320:iconst_0        
	//* 182  321:iload           5
	//* 183  323:iastore         
	//* 184  324:dup             
	//* 185  325:iconst_1        
	//* 186  326:iload           6
	//* 187  328:iastore         
	//* 188  329:dup             
	//* 189  330:iconst_2        
	//* 190  331:iload           7
	//* 191  333:iastore         
	//* 192  334:iconst_3        
	//* 193  335:newarray        float[]
	//* 194  337:dup             
	//* 195  338:iconst_0        
	//* 196  339:fconst_0        
	//* 197  340:fastore         
	//* 198  341:dup             
	//* 199  342:iconst_1        
	//* 200  343:ldc1            #114 <Float 0.5F>
	//* 201  345:fastore         
	//* 202  346:dup             
	//* 203  347:iconst_2        
	//* 204  348:fconst_1        
	//* 205  349:fastore         
	//* 206  350:aload           9
	//* 207  352:invokespecial   #221 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//* 208  355:invokevirtual   #216 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//* 209  358:pop             
	//* 210  359:aload_0         
	//* 211  360:getfield        #126 <Field Paint mEdgeShadowPaint>
	//* 212  363:iconst_0        
	//* 213  364:invokevirtual   #130 <Method void Paint.setAntiAlias(boolean)>
	//* 214  367:return          
			mCornerShadowPath.reset();
	//  215  368:aload_0         
	//  216  369:getfield        #171 <Field Path mCornerShadowPath>
	//  217  372:invokevirtual   #224 <Method void Path.reset()>
		mCornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
		mCornerShadowPath.moveTo(-mCornerRadius, 0.0F);
		mCornerShadowPath.rLineTo(-mShadowSize, 0.0F);
		mCornerShadowPath.arcTo(((RectF) (obj1)), 180F, 90F, false);
		mCornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
		mCornerShadowPath.close();
		f = mCornerRadius / (mCornerRadius + mShadowSize);
		obj = ((Object) (mCornerShadowPaint));
		f1 = mCornerRadius;
		f2 = mShadowSize;
		i = mShadowStartColor;
		j = mShadowStartColor;
		k = mShadowEndColor;
		obj1 = ((Object) (android.graphics.Shader.TileMode.CLAMP));
		((Paint) (obj)).setShader(((android.graphics.Shader) (new RadialGradient(0.0F, 0.0F, f1 + f2, new int[] {
			i, j, k
		}, new float[] {
			0.0F, f, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj1))))));
		obj = ((Object) (mEdgeShadowPaint));
		f = -mCornerRadius;
		f1 = mShadowSize;
		f2 = -mCornerRadius;
		f3 = mShadowSize;
		i = mShadowStartColor;
		j = mShadowStartColor;
		k = mShadowEndColor;
		obj1 = ((Object) (android.graphics.Shader.TileMode.CLAMP));
		((Paint) (obj)).setShader(((android.graphics.Shader) (new LinearGradient(0.0F, f + f1, 0.0F, f2 - f3, new int[] {
			i, j, k
		}, new float[] {
			0.0F, 0.5F, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj1))))));
		mEdgeShadowPaint.setAntiAlias(false);
	//* 218  375:goto            71
	}

	static float calculateHorizontalPadding(float f, float f1, boolean flag)
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
		int i;
		boolean flag;
		int j;
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
	//*  28   42:ifle            407
			i = 1;
	//   29   45:iconst_1        
	//   30   46:istore          6
		else
	//*  31   48:aload_0         
	//*  32   49:getfield        #121 <Field RectF mCardBounds>
	//*  33   52:invokevirtual   #238 <Method float RectF.height()>
	//*  34   55:fconst_2        
	//*  35   56:fload_3         
	//*  36   57:fmul            
	//*  37   58:fsub            
	//*  38   59:fconst_0        
	//*  39   60:fcmpl           
	//*  40   61:ifle            413
	//*  41   64:iconst_1        
	//*  42   65:istore          7
	//*  43   67:aload_1         
	//*  44   68:invokevirtual   #244 <Method int Canvas.save()>
	//*  45   71:istore          8
	//*  46   73:aload_1         
	//*  47   74:aload_0         
	//*  48   75:getfield        #121 <Field RectF mCardBounds>
	//*  49   78:getfield        #246 <Field float RectF.left>
	//*  50   81:fload_3         
	//*  51   82:fadd            
	//*  52   83:aload_0         
	//*  53   84:getfield        #121 <Field RectF mCardBounds>
	//*  54   87:getfield        #248 <Field float RectF.top>
	//*  55   90:fload_3         
	//*  56   91:fadd            
	//*  57   92:invokevirtual   #251 <Method void Canvas.translate(float, float)>
	//*  58   95:aload_1         
	//*  59   96:aload_0         
	//*  60   97:getfield        #171 <Field Path mCornerShadowPath>
	//*  61  100:aload_0         
	//*  62  101:getfield        #103 <Field Paint mCornerShadowPaint>
	//*  63  104:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
	//*  64  107:iload           6
	//*  65  109:ifeq            138
	//*  66  112:aload_1         
	//*  67  113:fconst_0        
	//*  68  114:fload_2         
	//*  69  115:aload_0         
	//*  70  116:getfield        #121 <Field RectF mCardBounds>
	//*  71  119:invokevirtual   #235 <Method float RectF.width()>
	//*  72  122:fconst_2        
	//*  73  123:fload_3         
	//*  74  124:fmul            
	//*  75  125:fsub            
	//*  76  126:aload_0         
	//*  77  127:getfield        #116 <Field float mCornerRadius>
	//*  78  130:fneg            
	//*  79  131:aload_0         
	//*  80  132:getfield        #126 <Field Paint mEdgeShadowPaint>
	//*  81  135:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//*  82  138:aload_1         
	//*  83  139:iload           8
	//*  84  141:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
	//*  85  144:aload_1         
	//*  86  145:invokevirtual   #244 <Method int Canvas.save()>
	//*  87  148:istore          8
	//*  88  150:aload_1         
	//*  89  151:aload_0         
	//*  90  152:getfield        #121 <Field RectF mCardBounds>
	//*  91  155:getfield        #264 <Field float RectF.right>
	//*  92  158:fload_3         
	//*  93  159:fsub            
	//*  94  160:aload_0         
	//*  95  161:getfield        #121 <Field RectF mCardBounds>
	//*  96  164:getfield        #266 <Field float RectF.bottom>
	//*  97  167:fload_3         
	//*  98  168:fsub            
	//*  99  169:invokevirtual   #251 <Method void Canvas.translate(float, float)>
	//* 100  172:aload_1         
	//* 101  173:ldc1            #191 <Float 180F>
	//* 102  175:invokevirtual   #270 <Method void Canvas.rotate(float)>
	//* 103  178:aload_1         
	//* 104  179:aload_0         
	//* 105  180:getfield        #171 <Field Path mCornerShadowPath>
	//* 106  183:aload_0         
	//* 107  184:getfield        #103 <Field Paint mCornerShadowPaint>
	//* 108  187:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
	//* 109  190:iload           6
	//* 110  192:ifeq            234
	//* 111  195:aload_0         
	//* 112  196:getfield        #121 <Field RectF mCardBounds>
	//* 113  199:invokevirtual   #235 <Method float RectF.width()>
	//* 114  202:fstore          4
	//* 115  204:aload_0         
	//* 116  205:getfield        #116 <Field float mCornerRadius>
	//* 117  208:fneg            
	//* 118  209:fstore          5
	//* 119  211:aload_1         
	//* 120  212:fconst_0        
	//* 121  213:fload_2         
	//* 122  214:fload           4
	//* 123  216:fconst_2        
	//* 124  217:fload_3         
	//* 125  218:fmul            
	//* 126  219:fsub            
	//* 127  220:aload_0         
	//* 128  221:getfield        #166 <Field float mShadowSize>
	//* 129  224:fload           5
	//* 130  226:fadd            
	//* 131  227:aload_0         
	//* 132  228:getfield        #126 <Field Paint mEdgeShadowPaint>
	//* 133  231:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 134  234:aload_1         
	//* 135  235:iload           8
	//* 136  237:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
	//* 137  240:aload_1         
	//* 138  241:invokevirtual   #244 <Method int Canvas.save()>
	//* 139  244:istore          6
	//* 140  246:aload_1         
	//* 141  247:aload_0         
	//* 142  248:getfield        #121 <Field RectF mCardBounds>
	//* 143  251:getfield        #246 <Field float RectF.left>
	//* 144  254:fload_3         
	//* 145  255:fadd            
	//* 146  256:aload_0         
	//* 147  257:getfield        #121 <Field RectF mCardBounds>
	//* 148  260:getfield        #266 <Field float RectF.bottom>
	//* 149  263:fload_3         
	//* 150  264:fsub            
	//* 151  265:invokevirtual   #251 <Method void Canvas.translate(float, float)>
	//* 152  268:aload_1         
	//* 153  269:ldc1            #197 <Float 270F>
	//* 154  271:invokevirtual   #270 <Method void Canvas.rotate(float)>
	//* 155  274:aload_1         
	//* 156  275:aload_0         
	//* 157  276:getfield        #171 <Field Path mCornerShadowPath>
	//* 158  279:aload_0         
	//* 159  280:getfield        #103 <Field Paint mCornerShadowPaint>
	//* 160  283:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
	//* 161  286:iload           7
	//* 162  288:ifeq            317
	//* 163  291:aload_1         
	//* 164  292:fconst_0        
	//* 165  293:fload_2         
	//* 166  294:aload_0         
	//* 167  295:getfield        #121 <Field RectF mCardBounds>
	//* 168  298:invokevirtual   #238 <Method float RectF.height()>
	//* 169  301:fconst_2        
	//* 170  302:fload_3         
	//* 171  303:fmul            
	//* 172  304:fsub            
	//* 173  305:aload_0         
	//* 174  306:getfield        #116 <Field float mCornerRadius>
	//* 175  309:fneg            
	//* 176  310:aload_0         
	//* 177  311:getfield        #126 <Field Paint mEdgeShadowPaint>
	//* 178  314:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 179  317:aload_1         
	//* 180  318:iload           6
	//* 181  320:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
	//* 182  323:aload_1         
	//* 183  324:invokevirtual   #244 <Method int Canvas.save()>
	//* 184  327:istore          6
	//* 185  329:aload_1         
	//* 186  330:aload_0         
	//* 187  331:getfield        #121 <Field RectF mCardBounds>
	//* 188  334:getfield        #264 <Field float RectF.right>
	//* 189  337:fload_3         
	//* 190  338:fsub            
	//* 191  339:aload_0         
	//* 192  340:getfield        #121 <Field RectF mCardBounds>
	//* 193  343:getfield        #248 <Field float RectF.top>
	//* 194  346:fload_3         
	//* 195  347:fadd            
	//* 196  348:invokevirtual   #251 <Method void Canvas.translate(float, float)>
	//* 197  351:aload_1         
	//* 198  352:ldc1            #192 <Float 90F>
	//* 199  354:invokevirtual   #270 <Method void Canvas.rotate(float)>
	//* 200  357:aload_1         
	//* 201  358:aload_0         
	//* 202  359:getfield        #171 <Field Path mCornerShadowPath>
	//* 203  362:aload_0         
	//* 204  363:getfield        #103 <Field Paint mCornerShadowPaint>
	//* 205  366:invokevirtual   #255 <Method void Canvas.drawPath(Path, Paint)>
	//* 206  369:iload           7
	//* 207  371:ifeq            400
	//* 208  374:aload_1         
	//* 209  375:fconst_0        
	//* 210  376:fload_2         
	//* 211  377:aload_0         
	//* 212  378:getfield        #121 <Field RectF mCardBounds>
	//* 213  381:invokevirtual   #238 <Method float RectF.height()>
	//* 214  384:fconst_2        
	//* 215  385:fload_3         
	//* 216  386:fmul            
	//* 217  387:fsub            
	//* 218  388:aload_0         
	//* 219  389:getfield        #116 <Field float mCornerRadius>
	//* 220  392:fneg            
	//* 221  393:aload_0         
	//* 222  394:getfield        #126 <Field Paint mEdgeShadowPaint>
	//* 223  397:invokevirtual   #259 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 224  400:aload_1         
	//* 225  401:iload           6
	//* 226  403:invokevirtual   #262 <Method void Canvas.restoreToCount(int)>
	//* 227  406:return          
			i = 0;
	//  228  407:iconst_0        
	//  229  408:istore          6
		if(mCardBounds.height() - 2.0F * f1 > 0.0F)
			flag = true;
		else
	//* 230  410:goto            48
			flag = false;
	//  231  413:iconst_0        
	//  232  414:istore          7
		j = canvas.save();
		canvas.translate(mCardBounds.left + f1, mCardBounds.top + f1);
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
		if(i != 0)
			canvas.drawRect(0.0F, f, mCardBounds.width() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
		canvas.restoreToCount(j);
		j = canvas.save();
		canvas.translate(mCardBounds.right - f1, mCardBounds.bottom - f1);
		canvas.rotate(180F);
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
		if(i != 0)
		{
			float f2 = mCardBounds.width();
			float f3 = -mCornerRadius;
			canvas.drawRect(0.0F, f, f2 - 2.0F * f1, mShadowSize + f3, mEdgeShadowPaint);
		}
		canvas.restoreToCount(j);
		i = canvas.save();
		canvas.translate(mCardBounds.left + f1, mCardBounds.bottom - f1);
		canvas.rotate(270F);
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
		if(flag)
			canvas.drawRect(0.0F, f, mCardBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
		canvas.restoreToCount(i);
		i = canvas.save();
		canvas.translate(mCardBounds.right - f1, mCardBounds.top + f1);
		canvas.rotate(90F);
		canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
		if(flag)
			canvas.drawRect(0.0F, f, mCardBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
		canvas.restoreToCount(i);
	//* 233  416:goto            67
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
		f1 = toEven(f1);
	//   41   87:aload_0         
	//   42   88:fload_2         
	//   43   89:invokespecial   #321 <Method int toEven(float)>
	//   44   92:i2f             
	//   45   93:fstore_2        
		f = f2;
	//   46   94:fload_3         
	//   47   95:fstore_1        
		if(f2 > f1)
	//*  48   96:fload_3         
	//*  49   97:fload_2         
	//*  50   98:fcmpl           
	//*  51   99:ifle            116
		{
			if(!mPrintedShadowClipWarning)
	//*  52  102:aload_0         
	//*  53  103:getfield        #62  <Field boolean mPrintedShadowClipWarning>
	//*  54  106:ifne            114
				mPrintedShadowClipWarning = true;
	//   55  109:aload_0         
	//   56  110:iconst_1        
	//   57  111:putfield        #62  <Field boolean mPrintedShadowClipWarning>
			f = f1;
	//   58  114:fload_2         
	//   59  115:fstore_1        
		}
		if(mRawShadowSize == f && mRawMaxShadowSize == f1)
	//*  60  116:aload_0         
	//*  61  117:getfield        #231 <Field float mRawShadowSize>
	//*  62  120:fload_1         
	//*  63  121:fcmpl           
	//*  64  122:ifne            135
	//*  65  125:aload_0         
	//*  66  126:getfield        #138 <Field float mRawMaxShadowSize>
	//*  67  129:fload_2         
	//*  68  130:fcmpl           
	//*  69  131:ifne            135
		{
			return;
	//   70  134:return          
		} else
		{
			mRawShadowSize = f;
	//   71  135:aload_0         
	//   72  136:fload_1         
	//   73  137:putfield        #231 <Field float mRawShadowSize>
			mRawMaxShadowSize = f1;
	//   74  140:aload_0         
	//   75  141:fload_2         
	//   76  142:putfield        #138 <Field float mRawMaxShadowSize>
			mShadowSize = (int)(f * 1.5F + (float)mInsetShadow + 0.5F);
	//   77  145:aload_0         
	//   78  146:fload_1         
	//   79  147:ldc1            #12  <Float 1.5F>
	//   80  149:fmul            
	//   81  150:aload_0         
	//   82  151:getfield        #90  <Field int mInsetShadow>
	//   83  154:i2f             
	//   84  155:fadd            
	//   85  156:ldc1            #114 <Float 0.5F>
	//   86  158:fadd            
	//   87  159:f2i             
	//   88  160:i2f             
	//   89  161:putfield        #166 <Field float mShadowSize>
			mDirty = true;
	//   90  164:aload_0         
	//   91  165:iconst_1        
	//   92  166:putfield        #58  <Field boolean mDirty>
			invalidateSelf();
	//   93  169:aload_0         
	//   94  170:invokevirtual   #324 <Method void invalidateSelf()>
			return;
	//   95  173:return          
		}
	}

	private int toEven(float f)
	{
		int j = (int)(0.5F + f);
	//    0    0:ldc1            #114 <Float 0.5F>
	//    1    2:fload_1         
	//    2    3:fadd            
	//    3    4:f2i             
	//    4    5:istore_3        
		int i = j;
	//    5    6:iload_3         
	//    6    7:istore_2        
		if(j % 2 == 1)
	//*   7    8:iload_3         
	//*   8    9:iconst_2        
	//*   9   10:irem            
	//*  10   11:iconst_1        
	//*  11   12:icmpne          19
			i = j - 1;
	//   12   15:iload_3         
	//   13   16:iconst_1        
	//   14   17:isub            
	//   15   18:istore_2        
		return i;
	//   16   19:iload_2         
	//   17   20:ireturn         
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
