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
	//    1    1:invokespecial   #28  <Method void Drawable()>
		mInsetForPadding = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean mInsetForPadding>
		mInsetForRadius = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #32  <Field boolean mInsetForRadius>
		mTintMode = android.graphics.PorterDuff.Mode.SRC_IN;
	//    8   14:aload_0         
	//    9   15:getstatic       #37  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   10   18:putfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
		mRadius = f;
	//   11   21:aload_0         
	//   12   22:fload_2         
	//   13   23:putfield        #41  <Field float mRadius>
	//   14   26:aload_0         
	//   15   27:new             #43  <Class Paint>
	//   16   30:dup             
	//   17   31:iconst_5        
	//   18   32:invokespecial   #46  <Method void Paint(int)>
	//   19   35:putfield        #48  <Field Paint mPaint>
		setBackground(colorstatelist);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokespecial   #52  <Method void setBackground(ColorStateList)>
	//   23   43:aload_0         
	//   24   44:new             #54  <Class RectF>
	//   25   47:dup             
	//   26   48:invokespecial   #55  <Method void RectF()>
	//   27   51:putfield        #57  <Field RectF mBoundsF>
	//   28   54:aload_0         
	//   29   55:new             #59  <Class Rect>
	//   30   58:dup             
	//   31   59:invokespecial   #60  <Method void Rect()>
	//   32   62:putfield        #62  <Field Rect mBoundsI>
	//   33   65:return          
	}

	private PorterDuffColorFilter createTintFilter(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
	{
		if(colorstatelist != null && mode != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            29
			return new PorterDuffColorFilter(colorstatelist.getColorForState(getState(), 0), mode);
	//    5   11:new             #67  <Class PorterDuffColorFilter>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #71  <Method int[] getState()>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #77  <Method int ColorStateList.getColorForState(int[], int)>
	//   12   24:aload_2         
	//   13   25:invokespecial   #80  <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   14   28:areturn         
		else
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
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
	//    5    7:invokestatic    #84  <Method ColorStateList ColorStateList.valueOf(int)>
	//    6   10:astore_2        
		mBackground = colorstatelist1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #86  <Field ColorStateList mBackground>
		mPaint.setColor(mBackground.getColorForState(getState(), mBackground.getDefaultColor()));
	//   10   16:aload_0         
	//   11   17:getfield        #48  <Field Paint mPaint>
	//   12   20:aload_0         
	//   13   21:getfield        #86  <Field ColorStateList mBackground>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #71  <Method int[] getState()>
	//   16   28:aload_0         
	//   17   29:getfield        #86  <Field ColorStateList mBackground>
	//   18   32:invokevirtual   #90  <Method int ColorStateList.getDefaultColor()>
	//   19   35:invokevirtual   #77  <Method int ColorStateList.getColorForState(int[], int)>
	//   20   38:invokevirtual   #93  <Method void Paint.setColor(int)>
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
	//    5    8:invokevirtual   #99  <Method Rect getBounds()>
	//    6   11:astore          4
		mBoundsF.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
	//    7   13:aload_0         
	//    8   14:getfield        #57  <Field RectF mBoundsF>
	//    9   17:aload           4
	//   10   19:getfield        #103 <Field int Rect.left>
	//   11   22:i2f             
	//   12   23:aload           4
	//   13   25:getfield        #106 <Field int Rect.top>
	//   14   28:i2f             
	//   15   29:aload           4
	//   16   31:getfield        #109 <Field int Rect.right>
	//   17   34:i2f             
	//   18   35:aload           4
	//   19   37:getfield        #112 <Field int Rect.bottom>
	//   20   40:i2f             
	//   21   41:invokevirtual   #116 <Method void RectF.set(float, float, float, float)>
		mBoundsI.set(rect1);
	//   22   44:aload_0         
	//   23   45:getfield        #62  <Field Rect mBoundsI>
	//   24   48:aload           4
	//   25   50:invokevirtual   #118 <Method void Rect.set(Rect)>
		if(mInsetForPadding)
	//*  26   53:aload_0         
	//*  27   54:getfield        #30  <Field boolean mInsetForPadding>
	//*  28   57:ifeq            122
		{
			float f = RoundRectDrawableWithShadow.calculateVerticalPadding(mPadding, mRadius, mInsetForRadius);
	//   29   60:aload_0         
	//   30   61:getfield        #120 <Field float mPadding>
	//   31   64:aload_0         
	//   32   65:getfield        #41  <Field float mRadius>
	//   33   68:aload_0         
	//   34   69:getfield        #32  <Field boolean mInsetForRadius>
	//   35   72:invokestatic    #126 <Method float RoundRectDrawableWithShadow.calculateVerticalPadding(float, float, boolean)>
	//   36   75:fstore_2        
			float f1 = RoundRectDrawableWithShadow.calculateHorizontalPadding(mPadding, mRadius, mInsetForRadius);
	//   37   76:aload_0         
	//   38   77:getfield        #120 <Field float mPadding>
	//   39   80:aload_0         
	//   40   81:getfield        #41  <Field float mRadius>
	//   41   84:aload_0         
	//   42   85:getfield        #32  <Field boolean mInsetForRadius>
	//   43   88:invokestatic    #129 <Method float RoundRectDrawableWithShadow.calculateHorizontalPadding(float, float, boolean)>
	//   44   91:fstore_3        
			mBoundsI.inset((int)Math.ceil(f1), (int)Math.ceil(f));
	//   45   92:aload_0         
	//   46   93:getfield        #62  <Field Rect mBoundsI>
	//   47   96:fload_3         
	//   48   97:f2d             
	//   49   98:invokestatic    #135 <Method double Math.ceil(double)>
	//   50  101:d2i             
	//   51  102:fload_2         
	//   52  103:f2d             
	//   53  104:invokestatic    #135 <Method double Math.ceil(double)>
	//   54  107:d2i             
	//   55  108:invokevirtual   #139 <Method void Rect.inset(int, int)>
			mBoundsF.set(mBoundsI);
	//   56  111:aload_0         
	//   57  112:getfield        #57  <Field RectF mBoundsF>
	//   58  115:aload_0         
	//   59  116:getfield        #62  <Field Rect mBoundsI>
	//   60  119:invokevirtual   #140 <Method void RectF.set(Rect)>
		}
	//   61  122:return          
	}

	public void draw(Canvas canvas)
	{
		Paint paint = mPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Paint mPaint>
	//    2    4:astore          4
		boolean flag;
		if(mTintFilter != null && paint.getColorFilter() == null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #144 <Field PorterDuffColorFilter mTintFilter>
	//*   5   10:ifnull          36
	//*   6   13:aload           4
	//*   7   15:invokevirtual   #148 <Method ColorFilter Paint.getColorFilter()>
	//*   8   18:ifnonnull       36
		{
			paint.setColorFilter(((ColorFilter) (mTintFilter)));
	//    9   21:aload           4
	//   10   23:aload_0         
	//   11   24:getfield        #144 <Field PorterDuffColorFilter mTintFilter>
	//   12   27:invokevirtual   #152 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   13   30:pop             
			flag = true;
	//   14   31:iconst_1        
	//   15   32:istore_3        
		} else
	//*  16   33:goto            38
		{
			flag = false;
	//   17   36:iconst_0        
	//   18   37:istore_3        
		}
		RectF rectf = mBoundsF;
	//   19   38:aload_0         
	//   20   39:getfield        #57  <Field RectF mBoundsF>
	//   21   42:astore          5
		float f = mRadius;
	//   22   44:aload_0         
	//   23   45:getfield        #41  <Field float mRadius>
	//   24   48:fstore_2        
		canvas.drawRoundRect(rectf, f, f, paint);
	//   25   49:aload_1         
	//   26   50:aload           5
	//   27   52:fload_2         
	//   28   53:fload_2         
	//   29   54:aload           4
	//   30   56:invokevirtual   #158 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
		if(flag)
	//*  31   59:iload_3         
	//*  32   60:ifeq            70
			paint.setColorFilter(((ColorFilter) (null)));
	//   33   63:aload           4
	//   34   65:aconst_null     
	//   35   66:invokevirtual   #152 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   36   69:pop             
	//   37   70:return          
	}

	public ColorStateList getColor()
	{
		return mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field ColorStateList mBackground>
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
	//    2    2:getfield        #62  <Field Rect mBoundsI>
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field float mRadius>
	//    5    9:invokevirtual   #169 <Method void Outline.setRoundRect(Rect, float)>
	//    6   12:return          
	}

	float getPadding()
	{
		return mPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field float mPadding>
	//    2    4:freturn         
	}

	public float getRadius()
	{
		return mRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float mRadius>
	//    2    4:freturn         
	}

	public boolean isStateful()
	{
label0:
		{
			ColorStateList colorstatelist = mTint;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field ColorStateList mTint>
	//    2    4:astore_1        
			if(colorstatelist == null || !colorstatelist.isStateful())
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #178 <Method boolean ColorStateList.isStateful()>
	//*   7   13:ifne            39
			{
				ColorStateList colorstatelist1 = mBackground;
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field ColorStateList mBackground>
	//   10   20:astore_1        
				if((colorstatelist1 == null || !colorstatelist1.isStateful()) && !super.isStateful())
					break label0;
	//   11   21:aload_1         
	//   12   22:ifnull          32
	//   13   25:aload_1         
	//   14   26:invokevirtual   #178 <Method boolean ColorStateList.isStateful()>
	//   15   29:ifne            39
	//   16   32:aload_0         
	//   17   33:invokespecial   #179 <Method boolean Drawable.isStateful()>
	//   18   36:ifeq            41
			}
			return true;
	//   19   39:iconst_1        
	//   20   40:ireturn         
		}
		return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		super.onBoundsChange(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #182 <Method void Drawable.onBoundsChange(Rect)>
		updateBounds(rect);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #184 <Method void updateBounds(Rect)>
	//    6   10:return          
	}

	protected boolean onStateChange(int ai[])
	{
		ColorStateList colorstatelist = mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field ColorStateList mBackground>
	//    2    4:astore          4
		int i = colorstatelist.getColorForState(ai, colorstatelist.getDefaultColor());
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:aload           4
	//    6   11:invokevirtual   #90  <Method int ColorStateList.getDefaultColor()>
	//    7   14:invokevirtual   #77  <Method int ColorStateList.getColorForState(int[], int)>
	//    8   17:istore_2        
		boolean flag;
		if(i != mPaint.getColor())
	//*   9   18:iload_2         
	//*  10   19:aload_0         
	//*  11   20:getfield        #48  <Field Paint mPaint>
	//*  12   23:invokevirtual   #188 <Method int Paint.getColor()>
	//*  13   26:icmpeq          34
			flag = true;
	//   14   29:iconst_1        
	//   15   30:istore_3        
		else
	//*  16   31:goto            36
			flag = false;
	//   17   34:iconst_0        
	//   18   35:istore_3        
		if(flag)
	//*  19   36:iload_3         
	//*  20   37:ifeq            48
			mPaint.setColor(i);
	//   21   40:aload_0         
	//   22   41:getfield        #48  <Field Paint mPaint>
	//   23   44:iload_2         
	//   24   45:invokevirtual   #93  <Method void Paint.setColor(int)>
		ai = ((int []) (mTint));
	//   25   48:aload_0         
	//   26   49:getfield        #176 <Field ColorStateList mTint>
	//   27   52:astore_1        
		if(ai != null)
	//*  28   53:aload_1         
	//*  29   54:ifnull          81
		{
			android.graphics.PorterDuff.Mode mode = mTintMode;
	//   30   57:aload_0         
	//   31   58:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   32   61:astore          4
			if(mode != null)
	//*  33   63:aload           4
	//*  34   65:ifnull          81
			{
				mTintFilter = createTintFilter(((ColorStateList) (ai)), mode);
	//   35   68:aload_0         
	//   36   69:aload_0         
	//   37   70:aload_1         
	//   38   71:aload           4
	//   39   73:invokespecial   #190 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode)>
	//   40   76:putfield        #144 <Field PorterDuffColorFilter mTintFilter>
				return true;
	//   41   79:iconst_1        
	//   42   80:ireturn         
			}
		}
		return flag;
	//   43   81:iload_3         
	//   44   82:ireturn         
	}

	public void setAlpha(int i)
	{
		mPaint.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Paint mPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #193 <Method void Paint.setAlpha(int)>
	//    4    8:return          
	}

	public void setColor(ColorStateList colorstatelist)
	{
		setBackground(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void setBackground(ColorStateList)>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #196 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setPadding(float f, boolean flag, boolean flag1)
	{
		if(f == mPadding && mInsetForPadding == flag && mInsetForRadius == flag1)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #120 <Field float mPadding>
	//*   3    5:fcmpl           
	//*   4    6:ifne            26
	//*   5    9:aload_0         
	//*   6   10:getfield        #30  <Field boolean mInsetForPadding>
	//*   7   13:iload_2         
	//*   8   14:icmpne          26
	//*   9   17:aload_0         
	//*  10   18:getfield        #32  <Field boolean mInsetForRadius>
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
	//   16   28:putfield        #120 <Field float mPadding>
			mInsetForPadding = flag;
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:putfield        #30  <Field boolean mInsetForPadding>
			mInsetForRadius = flag1;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #32  <Field boolean mInsetForRadius>
			updateBounds(((Rect) (null)));
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:invokespecial   #184 <Method void updateBounds(Rect)>
			invalidateSelf();
	//   26   46:aload_0         
	//   27   47:invokevirtual   #196 <Method void invalidateSelf()>
			return;
	//   28   50:return          
		}
	}

	void setRadius(float f)
	{
		if(f == mRadius)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #41  <Field float mRadius>
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
	//    8   12:putfield        #41  <Field float mRadius>
			updateBounds(((Rect) (null)));
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:invokespecial   #184 <Method void updateBounds(Rect)>
			invalidateSelf();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #196 <Method void invalidateSelf()>
			return;
	//   14   24:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		mTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #176 <Field ColorStateList mTint>
		mTintFilter = createTintFilter(mTint, mTintMode);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #176 <Field ColorStateList mTint>
	//    7   11:aload_0         
	//    8   12:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    9   15:invokespecial   #190 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode)>
	//   10   18:putfield        #144 <Field PorterDuffColorFilter mTintFilter>
		invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #196 <Method void invalidateSelf()>
	//   13   25:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
		mTintFilter = createTintFilter(mTint, mTintMode);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #176 <Field ColorStateList mTint>
	//    7   11:aload_0         
	//    8   12:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    9   15:invokespecial   #190 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode)>
	//   10   18:putfield        #144 <Field PorterDuffColorFilter mTintFilter>
		invalidateSelf();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #196 <Method void invalidateSelf()>
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
