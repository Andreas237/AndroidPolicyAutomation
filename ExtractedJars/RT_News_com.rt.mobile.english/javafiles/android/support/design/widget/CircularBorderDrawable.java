// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.ColorUtils;

class CircularBorderDrawable extends Drawable
{

	public CircularBorderDrawable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Drawable()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void Rect()>
	//    6   12:putfield        #34  <Field Rect mRect>
	//    7   15:aload_0         
	//    8   16:new             #36  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void RectF()>
	//   11   23:putfield        #39  <Field RectF mRectF>
		mInvalidateShader = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #41  <Field boolean mInvalidateShader>
	//   15   31:aload_0         
	//   16   32:new             #43  <Class Paint>
	//   17   35:dup             
	//   18   36:iconst_1        
	//   19   37:invokespecial   #46  <Method void Paint(int)>
	//   20   40:putfield        #48  <Field Paint mPaint>
		mPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   21   43:aload_0         
	//   22   44:getfield        #48  <Field Paint mPaint>
	//   23   47:getstatic       #54  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   24   50:invokevirtual   #58  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   25   53:return          
	}

	private Shader createGradientShader()
	{
		Object obj = ((Object) (mRect));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Rect mRect>
	//    2    4:astore          10
		copyBounds(((Rect) (obj)));
	//    3    6:aload_0         
	//    4    7:aload           10
	//    5    9:invokevirtual   #65  <Method void copyBounds(Rect)>
		float f = mBorderWidth / (float)((Rect) (obj)).height();
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field float mBorderWidth>
	//    8   16:aload           10
	//    9   18:invokevirtual   #71  <Method int Rect.height()>
	//   10   21:i2f             
	//   11   22:fdiv            
	//   12   23:fstore_1        
		int i = ColorUtils.compositeColors(mTopOuterStrokeColor, mCurrentBorderTintColor);
	//   13   24:aload_0         
	//   14   25:getfield        #73  <Field int mTopOuterStrokeColor>
	//   15   28:aload_0         
	//   16   29:getfield        #75  <Field int mCurrentBorderTintColor>
	//   17   32:invokestatic    #81  <Method int ColorUtils.compositeColors(int, int)>
	//   18   35:istore          4
		int j = ColorUtils.compositeColors(mTopInnerStrokeColor, mCurrentBorderTintColor);
	//   19   37:aload_0         
	//   20   38:getfield        #83  <Field int mTopInnerStrokeColor>
	//   21   41:aload_0         
	//   22   42:getfield        #75  <Field int mCurrentBorderTintColor>
	//   23   45:invokestatic    #81  <Method int ColorUtils.compositeColors(int, int)>
	//   24   48:istore          5
		int k = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(mTopInnerStrokeColor, 0), mCurrentBorderTintColor);
	//   25   50:aload_0         
	//   26   51:getfield        #83  <Field int mTopInnerStrokeColor>
	//   27   54:iconst_0        
	//   28   55:invokestatic    #86  <Method int ColorUtils.setAlphaComponent(int, int)>
	//   29   58:aload_0         
	//   30   59:getfield        #75  <Field int mCurrentBorderTintColor>
	//   31   62:invokestatic    #81  <Method int ColorUtils.compositeColors(int, int)>
	//   32   65:istore          6
		int l = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(mBottomInnerStrokeColor, 0), mCurrentBorderTintColor);
	//   33   67:aload_0         
	//   34   68:getfield        #88  <Field int mBottomInnerStrokeColor>
	//   35   71:iconst_0        
	//   36   72:invokestatic    #86  <Method int ColorUtils.setAlphaComponent(int, int)>
	//   37   75:aload_0         
	//   38   76:getfield        #75  <Field int mCurrentBorderTintColor>
	//   39   79:invokestatic    #81  <Method int ColorUtils.compositeColors(int, int)>
	//   40   82:istore          7
		int i1 = ColorUtils.compositeColors(mBottomInnerStrokeColor, mCurrentBorderTintColor);
	//   41   84:aload_0         
	//   42   85:getfield        #88  <Field int mBottomInnerStrokeColor>
	//   43   88:aload_0         
	//   44   89:getfield        #75  <Field int mCurrentBorderTintColor>
	//   45   92:invokestatic    #81  <Method int ColorUtils.compositeColors(int, int)>
	//   46   95:istore          8
		int j1 = ColorUtils.compositeColors(mBottomOuterStrokeColor, mCurrentBorderTintColor);
	//   47   97:aload_0         
	//   48   98:getfield        #90  <Field int mBottomOuterStrokeColor>
	//   49  101:aload_0         
	//   50  102:getfield        #75  <Field int mCurrentBorderTintColor>
	//   51  105:invokestatic    #81  <Method int ColorUtils.compositeColors(int, int)>
	//   52  108:istore          9
		float f1 = ((Rect) (obj)).top;
	//   53  110:aload           10
	//   54  112:getfield        #93  <Field int Rect.top>
	//   55  115:i2f             
	//   56  116:fstore_2        
		float f2 = ((Rect) (obj)).bottom;
	//   57  117:aload           10
	//   58  119:getfield        #96  <Field int Rect.bottom>
	//   59  122:i2f             
	//   60  123:fstore_3        
		obj = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//   61  124:getstatic       #102 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   62  127:astore          10
		return ((Shader) (new LinearGradient(0.0F, f1, 0.0F, f2, new int[] {
			i, j, k, l, i1, j1
		}, new float[] {
			0.0F, f, 0.5F, 0.5F, 1.0F - f, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj)))));
	//   63  129:new             #104 <Class LinearGradient>
	//   64  132:dup             
	//   65  133:fconst_0        
	//   66  134:fload_2         
	//   67  135:fconst_0        
	//   68  136:fload_3         
	//   69  137:bipush          6
	//   70  139:newarray        int[]
	//   71  141:dup             
	//   72  142:iconst_0        
	//   73  143:iload           4
	//   74  145:iastore         
	//   75  146:dup             
	//   76  147:iconst_1        
	//   77  148:iload           5
	//   78  150:iastore         
	//   79  151:dup             
	//   80  152:iconst_2        
	//   81  153:iload           6
	//   82  155:iastore         
	//   83  156:dup             
	//   84  157:iconst_3        
	//   85  158:iload           7
	//   86  160:iastore         
	//   87  161:dup             
	//   88  162:iconst_4        
	//   89  163:iload           8
	//   90  165:iastore         
	//   91  166:dup             
	//   92  167:iconst_5        
	//   93  168:iload           9
	//   94  170:iastore         
	//   95  171:bipush          6
	//   96  173:newarray        float[]
	//   97  175:dup             
	//   98  176:iconst_0        
	//   99  177:fconst_0        
	//  100  178:fastore         
	//  101  179:dup             
	//  102  180:iconst_1        
	//  103  181:fload_1         
	//  104  182:fastore         
	//  105  183:dup             
	//  106  184:iconst_2        
	//  107  185:ldc1            #105 <Float 0.5F>
	//  108  187:fastore         
	//  109  188:dup             
	//  110  189:iconst_3        
	//  111  190:ldc1            #105 <Float 0.5F>
	//  112  192:fastore         
	//  113  193:dup             
	//  114  194:iconst_4        
	//  115  195:fconst_1        
	//  116  196:fload_1         
	//  117  197:fsub            
	//  118  198:fastore         
	//  119  199:dup             
	//  120  200:iconst_5        
	//  121  201:fconst_1        
	//  122  202:fastore         
	//  123  203:aload           10
	//  124  205:invokespecial   #108 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  125  208:areturn         
	}

	public void draw(Canvas canvas)
	{
		if(mInvalidateShader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean mInvalidateShader>
	//*   2    4:ifeq            24
		{
			mPaint.setShader(createGradientShader());
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field Paint mPaint>
	//    5   11:aload_0         
	//    6   12:invokespecial   #112 <Method Shader createGradientShader()>
	//    7   15:invokevirtual   #116 <Method Shader Paint.setShader(Shader)>
	//    8   18:pop             
			mInvalidateShader = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #41  <Field boolean mInvalidateShader>
		}
		float f = mPaint.getStrokeWidth() / 2.0F;
	//   12   24:aload_0         
	//   13   25:getfield        #48  <Field Paint mPaint>
	//   14   28:invokevirtual   #120 <Method float Paint.getStrokeWidth()>
	//   15   31:fconst_2        
	//   16   32:fdiv            
	//   17   33:fstore_2        
		RectF rectf = mRectF;
	//   18   34:aload_0         
	//   19   35:getfield        #39  <Field RectF mRectF>
	//   20   38:astore_3        
		copyBounds(mRect);
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #34  <Field Rect mRect>
	//   24   44:invokevirtual   #65  <Method void copyBounds(Rect)>
		rectf.set(mRect);
	//   25   47:aload_3         
	//   26   48:aload_0         
	//   27   49:getfield        #34  <Field Rect mRect>
	//   28   52:invokevirtual   #123 <Method void RectF.set(Rect)>
		rectf.left = rectf.left + f;
	//   29   55:aload_3         
	//   30   56:aload_3         
	//   31   57:getfield        #126 <Field float RectF.left>
	//   32   60:fload_2         
	//   33   61:fadd            
	//   34   62:putfield        #126 <Field float RectF.left>
		rectf.top = rectf.top + f;
	//   35   65:aload_3         
	//   36   66:aload_3         
	//   37   67:getfield        #128 <Field float RectF.top>
	//   38   70:fload_2         
	//   39   71:fadd            
	//   40   72:putfield        #128 <Field float RectF.top>
		rectf.right = rectf.right - f;
	//   41   75:aload_3         
	//   42   76:aload_3         
	//   43   77:getfield        #131 <Field float RectF.right>
	//   44   80:fload_2         
	//   45   81:fsub            
	//   46   82:putfield        #131 <Field float RectF.right>
		rectf.bottom = rectf.bottom - f;
	//   47   85:aload_3         
	//   48   86:aload_3         
	//   49   87:getfield        #133 <Field float RectF.bottom>
	//   50   90:fload_2         
	//   51   91:fsub            
	//   52   92:putfield        #133 <Field float RectF.bottom>
		canvas.save();
	//   53   95:aload_1         
	//   54   96:invokevirtual   #138 <Method int Canvas.save()>
	//   55   99:pop             
		canvas.rotate(mRotation, rectf.centerX(), rectf.centerY());
	//   56  100:aload_1         
	//   57  101:aload_0         
	//   58  102:getfield        #140 <Field float mRotation>
	//   59  105:aload_3         
	//   60  106:invokevirtual   #143 <Method float RectF.centerX()>
	//   61  109:aload_3         
	//   62  110:invokevirtual   #146 <Method float RectF.centerY()>
	//   63  113:invokevirtual   #150 <Method void Canvas.rotate(float, float, float)>
		canvas.drawOval(rectf, mPaint);
	//   64  116:aload_1         
	//   65  117:aload_3         
	//   66  118:aload_0         
	//   67  119:getfield        #48  <Field Paint mPaint>
	//   68  122:invokevirtual   #154 <Method void Canvas.drawOval(RectF, Paint)>
		canvas.restore();
	//   69  125:aload_1         
	//   70  126:invokevirtual   #157 <Method void Canvas.restore()>
	//   71  129:return          
	}

	public int getOpacity()
	{
		return mBorderWidth <= 0.0F ? -2 : -3;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float mBorderWidth>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifle            12
	//    5    9:bipush          -3
	//    6   11:ireturn         
	//    7   12:bipush          -2
	//    8   14:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		int i = Math.round(mBorderWidth);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float mBorderWidth>
	//    2    4:invokestatic    #166 <Method int Math.round(float)>
	//    3    7:istore_2        
		rect.set(i, i, i, i);
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_2         
	//    7   11:iload_2         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #169 <Method void Rect.set(int, int, int, int)>
		return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
	}

	public boolean isStateful()
	{
		return mBorderTint != null && mBorderTint.isStateful() || super.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field ColorStateList mBorderTint>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #173 <Field ColorStateList mBorderTint>
	//    5   11:invokevirtual   #177 <Method boolean ColorStateList.isStateful()>
	//    6   14:ifne            24
	//    7   17:aload_0         
	//    8   18:invokespecial   #178 <Method boolean Drawable.isStateful()>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		mInvalidateShader = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #41  <Field boolean mInvalidateShader>
	//    3    5:return          
	}

	protected boolean onStateChange(int ai[])
	{
		if(mBorderTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field ColorStateList mBorderTint>
	//*   2    4:ifnull          38
		{
			int i = mBorderTint.getColorForState(ai, mCurrentBorderTintColor);
	//    3    7:aload_0         
	//    4    8:getfield        #173 <Field ColorStateList mBorderTint>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field int mCurrentBorderTintColor>
	//    8   16:invokevirtual   #185 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   19:istore_2        
			if(i != mCurrentBorderTintColor)
	//*  10   20:iload_2         
	//*  11   21:aload_0         
	//*  12   22:getfield        #75  <Field int mCurrentBorderTintColor>
	//*  13   25:icmpeq          38
			{
				mInvalidateShader = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #41  <Field boolean mInvalidateShader>
				mCurrentBorderTintColor = i;
	//   17   33:aload_0         
	//   18   34:iload_2         
	//   19   35:putfield        #75  <Field int mCurrentBorderTintColor>
			}
		}
		if(mInvalidateShader)
	//*  20   38:aload_0         
	//*  21   39:getfield        #41  <Field boolean mInvalidateShader>
	//*  22   42:ifeq            49
			invalidateSelf();
	//   23   45:aload_0         
	//   24   46:invokevirtual   #188 <Method void invalidateSelf()>
		return mInvalidateShader;
	//   25   49:aload_0         
	//   26   50:getfield        #41  <Field boolean mInvalidateShader>
	//   27   53:ireturn         
	}

	public void setAlpha(int i)
	{
		mPaint.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Paint mPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #191 <Method void Paint.setAlpha(int)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #188 <Method void invalidateSelf()>
	//    6   12:return          
	}

	void setBorderTint(ColorStateList colorstatelist)
	{
		if(colorstatelist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
			mCurrentBorderTintColor = colorstatelist.getColorForState(getState(), mCurrentBorderTintColor);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #197 <Method int[] getState()>
	//    6   10:aload_0         
	//    7   11:getfield        #75  <Field int mCurrentBorderTintColor>
	//    8   14:invokevirtual   #185 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   17:putfield        #75  <Field int mCurrentBorderTintColor>
		mBorderTint = colorstatelist;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #173 <Field ColorStateList mBorderTint>
		mInvalidateShader = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #41  <Field boolean mInvalidateShader>
		invalidateSelf();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #188 <Method void invalidateSelf()>
	//   18   34:return          
	}

	void setBorderWidth(float f)
	{
		if(mBorderWidth != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field float mBorderWidth>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            34
		{
			mBorderWidth = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #67  <Field float mBorderWidth>
			mPaint.setStrokeWidth(f * 1.3333F);
	//    8   14:aload_0         
	//    9   15:getfield        #48  <Field Paint mPaint>
	//   10   18:fload_1         
	//   11   19:ldc1            #7   <Float 1.3333F>
	//   12   21:fmul            
	//   13   22:invokevirtual   #202 <Method void Paint.setStrokeWidth(float)>
			mInvalidateShader = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #41  <Field boolean mInvalidateShader>
			invalidateSelf();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #188 <Method void invalidateSelf()>
		}
	//   19   34:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #207 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #188 <Method void invalidateSelf()>
	//    7   13:return          
	}

	void setGradientColors(int i, int j, int k, int l)
	{
		mTopOuterStrokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field int mTopOuterStrokeColor>
		mTopInnerStrokeColor = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #83  <Field int mTopInnerStrokeColor>
		mBottomOuterStrokeColor = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #90  <Field int mBottomOuterStrokeColor>
		mBottomInnerStrokeColor = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #88  <Field int mBottomInnerStrokeColor>
	//   12   21:return          
	}

	final void setRotation(float f)
	{
		if(f != mRotation)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #140 <Field float mRotation>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mRotation = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #140 <Field float mRotation>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #188 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333F;
	private ColorStateList mBorderTint;
	float mBorderWidth;
	private int mBottomInnerStrokeColor;
	private int mBottomOuterStrokeColor;
	private int mCurrentBorderTintColor;
	private boolean mInvalidateShader;
	final Paint mPaint = new Paint(1);
	final Rect mRect = new Rect();
	final RectF mRectF = new RectF();
	private float mRotation;
	private int mTopInnerStrokeColor;
	private int mTopOuterStrokeColor;
}
