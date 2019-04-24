// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.widget:
//			RoundRectDrawableWithShadow

class RoundRectDrawable extends Drawable
{

	RoundRectDrawable(ColorStateList colorstatelist, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Drawable()>
		mInsetForPadding = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #33  <Field boolean mInsetForPadding>
		mInsetForRadius = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #35  <Field boolean mInsetForRadius>
		mTintMode = android.graphics.PorterDuff.Mode.SRC_IN;
	//    8   14:aload_0         
	//    9   15:getstatic       #40  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   10   18:putfield        #42  <Field android.graphics.PorterDuff$Mode mTintMode>
		mRadius = f;
	//   11   21:aload_0         
	//   12   22:fload_2         
	//   13   23:putfield        #44  <Field float mRadius>
	//   14   26:aload_0         
	//   15   27:new             #46  <Class Paint>
	//   16   30:dup             
	//   17   31:iconst_5        
	//   18   32:invokespecial   #49  <Method void Paint(int)>
	//   19   35:putfield        #51  <Field Paint mPaint>
		setBackground(colorstatelist);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokespecial   #55  <Method void setBackground(ColorStateList)>
	//   23   43:aload_0         
	//   24   44:new             #57  <Class RectF>
	//   25   47:dup             
	//   26   48:invokespecial   #58  <Method void RectF()>
	//   27   51:putfield        #60  <Field RectF mBoundsF>
	//   28   54:aload_0         
	//   29   55:new             #62  <Class Rect>
	//   30   58:dup             
	//   31   59:invokespecial   #63  <Method void Rect()>
	//   32   62:putfield        #65  <Field Rect mBoundsI>
	//   33   65:return          
	}

	private PorterDuffColorFilter createTintFilter(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
	{
		if(colorstatelist == null || mode == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return new PorterDuffColorFilter(colorstatelist.getColorForState(getState(), 0), mode);
	//    6   10:new             #70  <Class PorterDuffColorFilter>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #74  <Method int[] getState()>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #80  <Method int ColorStateList.getColorForState(int[], int)>
	//   13   23:aload_2         
	//   14   24:invokespecial   #83  <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   15   27:areturn         
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
	//    5    7:invokestatic    #87  <Method ColorStateList ColorStateList.valueOf(int)>
	//    6   10:astore_2        
		mBackground = colorstatelist1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #89  <Field ColorStateList mBackground>
		mPaint.setColor(mBackground.getColorForState(getState(), mBackground.getDefaultColor()));
	//   10   16:aload_0         
	//   11   17:getfield        #51  <Field Paint mPaint>
	//   12   20:aload_0         
	//   13   21:getfield        #89  <Field ColorStateList mBackground>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #74  <Method int[] getState()>
	//   16   28:aload_0         
	//   17   29:getfield        #89  <Field ColorStateList mBackground>
	//   18   32:invokevirtual   #93  <Method int ColorStateList.getDefaultColor()>
	//   19   35:invokevirtual   #80  <Method int ColorStateList.getColorForState(int[], int)>
	//   20   38:invokevirtual   #96  <Method void Paint.setColor(int)>
	//   21   41:return          
	}

	private void updateBounds(Rect rect)
	{
		Rect rect1 = rect;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(rect == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       13
			rect1 = getBounds();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #102 <Method Rect getBounds()>
	//    6   11:astore          4
		mBoundsF.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field RectF mBoundsF>
	//    9   17:aload           4
	//   10   19:getfield        #106 <Field int Rect.left>
	//   11   22:i2f             
	//   12   23:aload           4
	//   13   25:getfield        #109 <Field int Rect.top>
	//   14   28:i2f             
	//   15   29:aload           4
	//   16   31:getfield        #112 <Field int Rect.right>
	//   17   34:i2f             
	//   18   35:aload           4
	//   19   37:getfield        #115 <Field int Rect.bottom>
	//   20   40:i2f             
	//   21   41:invokevirtual   #119 <Method void RectF.set(float, float, float, float)>
		mBoundsI.set(rect1);
	//   22   44:aload_0         
	//   23   45:getfield        #65  <Field Rect mBoundsI>
	//   24   48:aload           4
	//   25   50:invokevirtual   #121 <Method void Rect.set(Rect)>
		if(mInsetForPadding)
	//*  26   53:aload_0         
	//*  27   54:getfield        #33  <Field boolean mInsetForPadding>
	//*  28   57:ifeq            122
		{
			float f = RoundRectDrawableWithShadow.calculateVerticalPadding(mPadding, mRadius, mInsetForRadius);
	//   29   60:aload_0         
	//   30   61:getfield        #123 <Field float mPadding>
	//   31   64:aload_0         
	//   32   65:getfield        #44  <Field float mRadius>
	//   33   68:aload_0         
	//   34   69:getfield        #35  <Field boolean mInsetForRadius>
	//   35   72:invokestatic    #129 <Method float RoundRectDrawableWithShadow.calculateVerticalPadding(float, float, boolean)>
	//   36   75:fstore_2        
			float f1 = RoundRectDrawableWithShadow.calculateHorizontalPadding(mPadding, mRadius, mInsetForRadius);
	//   37   76:aload_0         
	//   38   77:getfield        #123 <Field float mPadding>
	//   39   80:aload_0         
	//   40   81:getfield        #44  <Field float mRadius>
	//   41   84:aload_0         
	//   42   85:getfield        #35  <Field boolean mInsetForRadius>
	//   43   88:invokestatic    #132 <Method float RoundRectDrawableWithShadow.calculateHorizontalPadding(float, float, boolean)>
	//   44   91:fstore_3        
			mBoundsI.inset((int)Math.ceil(f1), (int)Math.ceil(f));
	//   45   92:aload_0         
	//   46   93:getfield        #65  <Field Rect mBoundsI>
	//   47   96:fload_3         
	//   48   97:f2d             
	//   49   98:invokestatic    #138 <Method double Math.ceil(double)>
	//   50  101:d2i             
	//   51  102:fload_2         
	//   52  103:f2d             
	//   53  104:invokestatic    #138 <Method double Math.ceil(double)>
	//   54  107:d2i             
	//   55  108:invokevirtual   #142 <Method void Rect.inset(int, int)>
			mBoundsF.set(mBoundsI);
	//   56  111:aload_0         
	//   57  112:getfield        #60  <Field RectF mBoundsF>
	//   58  115:aload_0         
	//   59  116:getfield        #65  <Field Rect mBoundsI>
	//   60  119:invokevirtual   #143 <Method void RectF.set(Rect)>
		}
	//   61  122:return          
	}

	public void draw(Canvas canvas)
	{
		Paint paint = mPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Paint mPaint>
	//    2    4:astore_3        
		boolean flag;
		if(mTintFilter != null && paint.getColorFilter() == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #147 <Field PorterDuffColorFilter mTintFilter>
	//*   5    9:ifnull          58
	//*   6   12:aload_3         
	//*   7   13:invokevirtual   #151 <Method ColorFilter Paint.getColorFilter()>
	//*   8   16:ifnonnull       58
		{
			paint.setColorFilter(((ColorFilter) (mTintFilter)));
	//    9   19:aload_3         
	//   10   20:aload_0         
	//   11   21:getfield        #147 <Field PorterDuffColorFilter mTintFilter>
	//   12   24:invokevirtual   #155 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   13   27:pop             
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_2        
		} else
	//*  16   30:aload_1         
	//*  17   31:aload_0         
	//*  18   32:getfield        #60  <Field RectF mBoundsF>
	//*  19   35:aload_0         
	//*  20   36:getfield        #44  <Field float mRadius>
	//*  21   39:aload_0         
	//*  22   40:getfield        #44  <Field float mRadius>
	//*  23   43:aload_3         
	//*  24   44:invokevirtual   #161 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
	//*  25   47:iload_2         
	//*  26   48:ifeq            57
	//*  27   51:aload_3         
	//*  28   52:aconst_null     
	//*  29   53:invokevirtual   #155 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//*  30   56:pop             
	//*  31   57:return          
		{
			flag = false;
	//   32   58:iconst_0        
	//   33   59:istore_2        
		}
		canvas.drawRoundRect(mBoundsF, mRadius, mRadius, paint);
		if(flag)
			paint.setColorFilter(((ColorFilter) (null)));
	//*  34   60:goto            30
	}

	public ColorStateList getColor()
	{
		return mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field ColorStateList mBackground>
	//    2    4:areturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public void getOutline(Outline outline)
	{
		outline.setRoundRect(mBoundsI, mRadius);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field Rect mBoundsI>
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field float mRadius>
	//    5    9:invokevirtual   #172 <Method void Outline.setRoundRect(Rect, float)>
	//    6   12:return          
	}

	float getPadding()
	{
		return mPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field float mPadding>
	//    2    4:freturn         
	}

	public float getRadius()
	{
		return mRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field float mRadius>
	//    2    4:freturn         
	}

	public boolean isStateful()
	{
		return mTint != null && mTint.isStateful() || mBackground != null && mBackground.isStateful() || super.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field ColorStateList mTint>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #179 <Field ColorStateList mTint>
	//    5   11:invokevirtual   #181 <Method boolean ColorStateList.isStateful()>
	//    6   14:ifne            41
	//    7   17:aload_0         
	//    8   18:getfield        #89  <Field ColorStateList mBackground>
	//    9   21:ifnull          34
	//   10   24:aload_0         
	//   11   25:getfield        #89  <Field ColorStateList mBackground>
	//   12   28:invokevirtual   #181 <Method boolean ColorStateList.isStateful()>
	//   13   31:ifne            41
	//   14   34:aload_0         
	//   15   35:invokespecial   #182 <Method boolean Drawable.isStateful()>
	//   16   38:ifeq            43
	//   17   41:iconst_1        
	//   18   42:ireturn         
	//   19   43:iconst_0        
	//   20   44:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		super.onBoundsChange(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void Drawable.onBoundsChange(Rect)>
		updateBounds(rect);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #187 <Method void updateBounds(Rect)>
	//    6   10:return          
	}

	protected boolean onStateChange(int ai[])
	{
		int i = mBackground.getColorForState(ai, mBackground.getDefaultColor());
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field ColorStateList mBackground>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field ColorStateList mBackground>
	//    5    9:invokevirtual   #93  <Method int ColorStateList.getDefaultColor()>
	//    6   12:invokevirtual   #80  <Method int ColorStateList.getColorForState(int[], int)>
	//    7   15:istore_2        
		boolean flag;
		boolean flag1;
		if(i != mPaint.getColor())
	//*   8   16:iload_2         
	//*   9   17:aload_0         
	//*  10   18:getfield        #51  <Field Paint mPaint>
	//*  11   21:invokevirtual   #191 <Method int Paint.getColor()>
	//*  12   24:icmpeq          83
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_3        
		else
	//*  15   29:iload_3         
	//*  16   30:ifeq            41
	//*  17   33:aload_0         
	//*  18   34:getfield        #51  <Field Paint mPaint>
	//*  19   37:iload_2         
	//*  20   38:invokevirtual   #96  <Method void Paint.setColor(int)>
	//*  21   41:iload_3         
	//*  22   42:istore          4
	//*  23   44:aload_0         
	//*  24   45:getfield        #179 <Field ColorStateList mTint>
	//*  25   48:ifnull          80
	//*  26   51:iload_3         
	//*  27   52:istore          4
	//*  28   54:aload_0         
	//*  29   55:getfield        #42  <Field android.graphics.PorterDuff$Mode mTintMode>
	//*  30   58:ifnull          80
	//*  31   61:aload_0         
	//*  32   62:aload_0         
	//*  33   63:aload_0         
	//*  34   64:getfield        #179 <Field ColorStateList mTint>
	//*  35   67:aload_0         
	//*  36   68:getfield        #42  <Field android.graphics.PorterDuff$Mode mTintMode>
	//*  37   71:invokespecial   #193 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode)>
	//*  38   74:putfield        #147 <Field PorterDuffColorFilter mTintFilter>
	//*  39   77:iconst_1        
	//*  40   78:istore          4
	//*  41   80:iload           4
	//*  42   82:ireturn         
			flag = false;
	//   43   83:iconst_0        
	//   44   84:istore_3        
		if(flag)
			mPaint.setColor(i);
		flag1 = flag;
		if(mTint != null)
		{
			flag1 = flag;
			if(mTintMode != null)
			{
				mTintFilter = createTintFilter(mTint, mTintMode);
				flag1 = true;
			}
		}
		return flag1;
	//*  45   85:goto            29
	}

	public void setAlpha(int i)
	{
		mPaint.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Paint mPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #196 <Method void Paint.setAlpha(int)>
	//    4    8:return          
	}

	public void setColor(ColorStateList colorstatelist)
	{
		setBackground(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void setBackground(ColorStateList)>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #200 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #155 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setPadding(float f, boolean flag, boolean flag1)
	{
		if(f == mPadding && mInsetForPadding == flag && mInsetForRadius == flag1)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #123 <Field float mPadding>
	//*   3    5:fcmpl           
	//*   4    6:ifne            26
	//*   5    9:aload_0         
	//*   6   10:getfield        #33  <Field boolean mInsetForPadding>
	//*   7   13:iload_2         
	//*   8   14:icmpne          26
	//*   9   17:aload_0         
	//*  10   18:getfield        #35  <Field boolean mInsetForRadius>
	//*  11   21:iload_3         
	//*  12   22:icmpne          26
		{
			return;
	//   13   25:return          
		} else
		{
			mPadding = f;
	//   14   26:aload_0         
	//   15   27:fload_1         
	//   16   28:putfield        #123 <Field float mPadding>
			mInsetForPadding = flag;
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:putfield        #33  <Field boolean mInsetForPadding>
			mInsetForRadius = flag1;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #35  <Field boolean mInsetForRadius>
			updateBounds(((Rect) (null)));
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:invokespecial   #187 <Method void updateBounds(Rect)>
			invalidateSelf();
	//   26   46:aload_0         
	//   27   47:invokevirtual   #200 <Method void invalidateSelf()>
			return;
	//   28   50:return          
		}
	}

	void setRadius(float f)
	{
		if(f == mRadius)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #44  <Field float mRadius>
	//*   3    5:fcmpl           
	//*   4    6:ifne            10
		{
			return;
	//    5    9:return          
		} else
		{
			mRadius = f;
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:putfield        #44  <Field float mRadius>
			updateBounds(((Rect) (null)));
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:invokespecial   #187 <Method void updateBounds(Rect)>
			invalidateSelf();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #200 <Method void invalidateSelf()>
			return;
	//   14   24:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		mTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field ColorStateList mTint>
		mTintFilter = createTintFilter(mTint, mTintMode);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #179 <Field ColorStateList mTint>
	//    7   11:aload_0         
	//    8   12:getfield        #42  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    9   15:invokespecial   #193 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode)>
	//   10   18:putfield        #147 <Field PorterDuffColorFilter mTintFilter>
		invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #200 <Method void invalidateSelf()>
	//   13   25:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field android.graphics.PorterDuff$Mode mTintMode>
		mTintFilter = createTintFilter(mTint, mTintMode);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #179 <Field ColorStateList mTint>
	//    7   11:aload_0         
	//    8   12:getfield        #42  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    9   15:invokespecial   #193 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode)>
	//   10   18:putfield        #147 <Field PorterDuffColorFilter mTintFilter>
		invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #200 <Method void invalidateSelf()>
	//   13   25:return          
	}

	private ColorStateList mBackground;
	private final RectF mBoundsF = new RectF();
	private final Rect mBoundsI = new Rect();
	private boolean mInsetForPadding;
	private boolean mInsetForRadius;
	private float mPadding;
	private final Paint mPaint = new Paint(5);
	private float mRadius;
	private ColorStateList mTint;
	private PorterDuffColorFilter mTintFilter;
	private android.graphics.PorterDuff.Mode mTintMode;
}
