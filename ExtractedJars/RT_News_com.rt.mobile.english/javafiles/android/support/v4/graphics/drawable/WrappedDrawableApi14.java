// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			WrappedDrawable, TintAwareDrawable

class WrappedDrawableApi14 extends Drawable
	implements android.graphics.drawable.Drawable.Callback, WrappedDrawable, TintAwareDrawable
{
	protected static abstract class DrawableWrapperState extends android.graphics.drawable.Drawable.ConstantState
	{

		boolean canConstantState()
		{
			return mDrawableState != null;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public int getChangingConfigurations()
		{
			int j = mChangingConfigurations;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int mChangingConfigurations>
		//    2    4:istore_2        
			int i;
			if(mDrawableState != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
		//*   5    9:ifnull          23
				i = mDrawableState.getChangingConfigurations();
		//    6   12:aload_0         
		//    7   13:getfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
		//    8   16:invokevirtual   #40  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
		//    9   19:istore_1        
			else
		//*  10   20:goto            25
				i = 0;
		//   11   23:iconst_0        
		//   12   24:istore_1        
			return j | i;
		//   13   25:iload_2         
		//   14   26:iload_1         
		//   15   27:ior             
		//   16   28:ireturn         
		}

		public Drawable newDrawable()
		{
			return newDrawable(((Resources) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokevirtual   #46  <Method Drawable newDrawable(Resources)>
		//    3    5:areturn         
		}

		public abstract Drawable newDrawable(Resources resources);

		int mChangingConfigurations;
		android.graphics.drawable.Drawable.ConstantState mDrawableState;
		ColorStateList mTint;
		android.graphics.PorterDuff.Mode mTintMode;

		DrawableWrapperState(DrawableWrapperState drawablewrapperstate, Resources resources)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void android.graphics.drawable.Drawable$ConstantState()>
			mTint = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #23  <Field ColorStateList mTint>
			mTintMode = WrappedDrawableApi14.DEFAULT_TINT_MODE;
		//    5    9:aload_0         
		//    6   10:getstatic       #26  <Field android.graphics.PorterDuff$Mode WrappedDrawableApi14.DEFAULT_TINT_MODE>
		//    7   13:putfield        #28  <Field android.graphics.PorterDuff$Mode mTintMode>
			if(drawablewrapperstate != null)
		//*   8   16:aload_1         
		//*   9   17:ifnull          52
			{
				mChangingConfigurations = drawablewrapperstate.mChangingConfigurations;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #30  <Field int mChangingConfigurations>
		//   13   25:putfield        #30  <Field int mChangingConfigurations>
				mDrawableState = drawablewrapperstate.mDrawableState;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:getfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
		//   17   33:putfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
				mTint = drawablewrapperstate.mTint;
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:getfield        #23  <Field ColorStateList mTint>
		//   21   41:putfield        #23  <Field ColorStateList mTint>
				mTintMode = drawablewrapperstate.mTintMode;
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:getfield        #28  <Field android.graphics.PorterDuff$Mode mTintMode>
		//   25   49:putfield        #28  <Field android.graphics.PorterDuff$Mode mTintMode>
			}
		//   26   52:return          
		}
	}

	private static class DrawableWrapperStateBase extends DrawableWrapperState
	{

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new WrappedDrawableApi14(((DrawableWrapperState) (this)), resources)));
		//    0    0:new             #6   <Class WrappedDrawableApi14>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #18  <Method void WrappedDrawableApi14(WrappedDrawableApi14$DrawableWrapperState, Resources)>
		//    5    9:areturn         
		}

		DrawableWrapperStateBase(DrawableWrapperState drawablewrapperstate, Resources resources)
		{
			super(drawablewrapperstate, resources);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void WrappedDrawableApi14$DrawableWrapperState(WrappedDrawableApi14$DrawableWrapperState, Resources)>
		//    4    6:return          
		}
	}


	WrappedDrawableApi14(Drawable drawable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Drawable()>
		mState = mutateConstantState();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #47  <Method WrappedDrawableApi14$DrawableWrapperState mutateConstantState()>
	//    5    9:putfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
		setWrappedDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #52  <Method void setWrappedDrawable(Drawable)>
	//    9   17:return          
	}

	WrappedDrawableApi14(DrawableWrapperState drawablewrapperstate, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Drawable()>
		mState = drawablewrapperstate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
		updateLocalState(resources);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #59  <Method void updateLocalState(Resources)>
	//    8   14:return          
	}

	private void updateLocalState(Resources resources)
	{
		if(mState != null && mState.mDrawableState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//*   2    4:ifnull          32
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//*   5   11:getfield        #63  <Field android.graphics.drawable.Drawable$ConstantState WrappedDrawableApi14$DrawableWrapperState.mDrawableState>
	//*   6   14:ifnull          32
			setWrappedDrawable(mState.mDrawableState.newDrawable(resources));
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   10   22:getfield        #63  <Field android.graphics.drawable.Drawable$ConstantState WrappedDrawableApi14$DrawableWrapperState.mDrawableState>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #69  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   13   29:invokevirtual   #52  <Method void setWrappedDrawable(Drawable)>
	//   14   32:return          
	}

	private boolean updateTint(int ai[])
	{
		if(!isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #75  <Method boolean isCompatTintEnabled()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		ColorStateList colorstatelist = mState.mTint;
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    7   13:getfield        #79  <Field ColorStateList WrappedDrawableApi14$DrawableWrapperState.mTint>
	//    8   16:astore_3        
		android.graphics.PorterDuff.Mode mode = mState.mTintMode;
	//    9   17:aload_0         
	//   10   18:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   11   21:getfield        #82  <Field android.graphics.PorterDuff$Mode WrappedDrawableApi14$DrawableWrapperState.mTintMode>
	//   12   24:astore          4
		if(colorstatelist != null && mode != null)
	//*  13   26:aload_3         
	//*  14   27:ifnull          94
	//*  15   30:aload           4
	//*  16   32:ifnull          94
		{
			int i = colorstatelist.getColorForState(ai, colorstatelist.getDefaultColor());
	//   17   35:aload_3         
	//   18   36:aload_1         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #88  <Method int ColorStateList.getDefaultColor()>
	//   21   41:invokevirtual   #92  <Method int ColorStateList.getColorForState(int[], int)>
	//   22   44:istore_2        
			if(!mColorFilterSet || i != mCurrentColor || mode != mCurrentMode)
	//*  23   45:aload_0         
	//*  24   46:getfield        #94  <Field boolean mColorFilterSet>
	//*  25   49:ifeq            69
	//*  26   52:iload_2         
	//*  27   53:aload_0         
	//*  28   54:getfield        #96  <Field int mCurrentColor>
	//*  29   57:icmpne          69
	//*  30   60:aload           4
	//*  31   62:aload_0         
	//*  32   63:getfield        #98  <Field android.graphics.PorterDuff$Mode mCurrentMode>
	//*  33   66:if_acmpeq       103
			{
				setColorFilter(i, mode);
	//   34   69:aload_0         
	//   35   70:iload_2         
	//   36   71:aload           4
	//   37   73:invokevirtual   #102 <Method void setColorFilter(int, android.graphics.PorterDuff$Mode)>
				mCurrentColor = i;
	//   38   76:aload_0         
	//   39   77:iload_2         
	//   40   78:putfield        #96  <Field int mCurrentColor>
				mCurrentMode = mode;
	//   41   81:aload_0         
	//   42   82:aload           4
	//   43   84:putfield        #98  <Field android.graphics.PorterDuff$Mode mCurrentMode>
				mColorFilterSet = true;
	//   44   87:aload_0         
	//   45   88:iconst_1        
	//   46   89:putfield        #94  <Field boolean mColorFilterSet>
				return true;
	//   47   92:iconst_1        
	//   48   93:ireturn         
			}
		} else
		{
			mColorFilterSet = false;
	//   49   94:aload_0         
	//   50   95:iconst_0        
	//   51   96:putfield        #94  <Field boolean mColorFilterSet>
			clearColorFilter();
	//   52   99:aload_0         
	//   53  100:invokevirtual   #105 <Method void clearColorFilter()>
		}
		return false;
	//   54  103:iconst_0        
	//   55  104:ireturn         
	}

	public void draw(Canvas canvas)
	{
		mDrawable.draw(canvas);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #111 <Method void Drawable.draw(Canvas)>
	//    4    8:return          
	}

	public int getChangingConfigurations()
	{
		int j = super.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method int Drawable.getChangingConfigurations()>
	//    2    4:istore_2        
		int i;
		if(mState != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//*   5    9:ifnull          23
			i = mState.getChangingConfigurations();
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    8   16:invokevirtual   #115 <Method int WrappedDrawableApi14$DrawableWrapperState.getChangingConfigurations()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		return j | i | mDrawable.getChangingConfigurations();
	//   13   25:iload_2         
	//   14   26:iload_1         
	//   15   27:ior             
	//   16   28:aload_0         
	//   17   29:getfield        #109 <Field Drawable mDrawable>
	//   18   32:invokevirtual   #114 <Method int Drawable.getChangingConfigurations()>
	//   19   35:ior             
	//   20   36:ireturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mState != null && mState.canConstantState())
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//*   5   11:invokevirtual   #120 <Method boolean WrappedDrawableApi14$DrawableWrapperState.canConstantState()>
	//*   6   14:ifeq            33
		{
			mState.mChangingConfigurations = getChangingConfigurations();
	//    7   17:aload_0         
	//    8   18:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #121 <Method int getChangingConfigurations()>
	//   11   25:putfield        #124 <Field int WrappedDrawableApi14$DrawableWrapperState.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (mState));
	//   12   28:aload_0         
	//   13   29:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   14   32:areturn         
		} else
		{
			return null;
	//   15   33:aconst_null     
	//   16   34:areturn         
		}
	}

	public Drawable getCurrent()
	{
		return mDrawable.getCurrent();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #129 <Method Drawable Drawable.getCurrent()>
	//    3    7:areturn         
	}

	public int getIntrinsicHeight()
	{
		return mDrawable.getIntrinsicHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #132 <Method int Drawable.getIntrinsicHeight()>
	//    3    7:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return mDrawable.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #135 <Method int Drawable.getIntrinsicWidth()>
	//    3    7:ireturn         
	}

	public int getMinimumHeight()
	{
		return mDrawable.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #138 <Method int Drawable.getMinimumHeight()>
	//    3    7:ireturn         
	}

	public int getMinimumWidth()
	{
		return mDrawable.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #141 <Method int Drawable.getMinimumWidth()>
	//    3    7:ireturn         
	}

	public int getOpacity()
	{
		return mDrawable.getOpacity();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #144 <Method int Drawable.getOpacity()>
	//    3    7:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		return mDrawable.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method boolean Drawable.getPadding(Rect)>
	//    4    8:ireturn         
	}

	public int[] getState()
	{
		return mDrawable.getState();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #152 <Method int[] Drawable.getState()>
	//    3    7:areturn         
	}

	public Region getTransparentRegion()
	{
		return mDrawable.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #156 <Method Region Drawable.getTransparentRegion()>
	//    3    7:areturn         
	}

	public final Drawable getWrappedDrawable()
	{
		return mDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:areturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		invalidateSelf();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method void invalidateSelf()>
	//    2    4:return          
	}

	protected boolean isCompatTintEnabled()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isStateful()
	{
		ColorStateList colorstatelist;
		if(isCompatTintEnabled() && mState != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #75  <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//*   5   11:ifnull          25
			colorstatelist = mState.mTint;
	//    6   14:aload_0         
	//    7   15:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    8   18:getfield        #79  <Field ColorStateList WrappedDrawableApi14$DrawableWrapperState.mTint>
	//    9   21:astore_1        
		else
	//*  10   22:goto            27
			colorstatelist = null;
	//   11   25:aconst_null     
	//   12   26:astore_1        
		return colorstatelist != null && colorstatelist.isStateful() || mDrawable.isStateful();
	//   13   27:aload_1         
	//   14   28:ifnull          38
	//   15   31:aload_1         
	//   16   32:invokevirtual   #164 <Method boolean ColorStateList.isStateful()>
	//   17   35:ifne            48
	//   18   38:aload_0         
	//   19   39:getfield        #109 <Field Drawable mDrawable>
	//   20   42:invokevirtual   #165 <Method boolean Drawable.isStateful()>
	//   21   45:ifeq            50
	//   22   48:iconst_1        
	//   23   49:ireturn         
	//   24   50:iconst_0        
	//   25   51:ireturn         
	}

	public void jumpToCurrentState()
	{
		mDrawable.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #168 <Method void Drawable.jumpToCurrentState()>
	//    3    7:return          
	}

	public Drawable mutate()
	{
		if(!mMutated && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field boolean mMutated>
	//*   2    4:ifne            80
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #173 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       80
		{
			mState = mutateConstantState();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #47  <Method WrappedDrawableApi14$DrawableWrapperState mutateConstantState()>
	//   10   20:putfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
			if(mDrawable != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #109 <Field Drawable mDrawable>
	//*  13   27:ifnull          38
				mDrawable.mutate();
	//   14   30:aload_0         
	//   15   31:getfield        #109 <Field Drawable mDrawable>
	//   16   34:invokevirtual   #173 <Method Drawable Drawable.mutate()>
	//   17   37:pop             
			if(mState != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//*  20   42:ifnull          75
			{
				DrawableWrapperState drawablewrapperstate = mState;
	//   21   45:aload_0         
	//   22   46:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   23   49:astore_2        
				android.graphics.drawable.Drawable.ConstantState constantstate;
				if(mDrawable != null)
	//*  24   50:aload_0         
	//*  25   51:getfield        #109 <Field Drawable mDrawable>
	//*  26   54:ifnull          68
					constantstate = mDrawable.getConstantState();
	//   27   57:aload_0         
	//   28   58:getfield        #109 <Field Drawable mDrawable>
	//   29   61:invokevirtual   #175 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   30   64:astore_1        
				else
	//*  31   65:goto            70
					constantstate = null;
	//   32   68:aconst_null     
	//   33   69:astore_1        
				drawablewrapperstate.mDrawableState = constantstate;
	//   34   70:aload_2         
	//   35   71:aload_1         
	//   36   72:putfield        #63  <Field android.graphics.drawable.Drawable$ConstantState WrappedDrawableApi14$DrawableWrapperState.mDrawableState>
			}
			mMutated = true;
	//   37   75:aload_0         
	//   38   76:iconst_1        
	//   39   77:putfield        #171 <Field boolean mMutated>
		}
		return ((Drawable) (this));
	//   40   80:aload_0         
	//   41   81:areturn         
	}

	DrawableWrapperState mutateConstantState()
	{
		return ((DrawableWrapperState) (new DrawableWrapperStateBase(mState, ((Resources) (null)))));
	//    0    0:new             #15  <Class WrappedDrawableApi14$DrawableWrapperStateBase>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #177 <Method void WrappedDrawableApi14$DrawableWrapperStateBase(WrappedDrawableApi14$DrawableWrapperState, Resources)>
	//    6   12:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		if(mDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field Drawable mDrawable>
	//*   2    4:ifnull          15
			mDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #109 <Field Drawable mDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #182 <Method void Drawable.setBounds(Rect)>
	//    7   15:return          
	}

	protected boolean onLevelChange(int i)
	{
		return mDrawable.setLevel(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #187 <Method boolean Drawable.setLevel(int)>
	//    4    8:ireturn         
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		scheduleSelf(runnable, l);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:lload_3         
	//    3    3:invokevirtual   #193 <Method void scheduleSelf(Runnable, long)>
	//    4    6:return          
	}

	public void setAlpha(int i)
	{
		mDrawable.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #197 <Method void Drawable.setAlpha(int)>
	//    4    8:return          
	}

	public void setChangingConfigurations(int i)
	{
		mDrawable.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #200 <Method void Drawable.setChangingConfigurations(int)>
	//    4    8:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mDrawable.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #203 <Method void Drawable.setColorFilter(ColorFilter)>
	//    4    8:return          
	}

	public void setDither(boolean flag)
	{
		mDrawable.setDither(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #207 <Method void Drawable.setDither(boolean)>
	//    4    8:return          
	}

	public void setFilterBitmap(boolean flag)
	{
		mDrawable.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #210 <Method void Drawable.setFilterBitmap(boolean)>
	//    4    8:return          
	}

	public boolean setState(int ai[])
	{
		boolean flag = mDrawable.setState(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #213 <Method boolean Drawable.setState(int[])>
	//    4    8:istore_2        
		return updateTint(ai) || flag;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #215 <Method boolean updateTint(int[])>
	//    8   14:ifne            26
	//    9   17:iload_2         
	//   10   18:ifeq            24
	//   11   21:goto            26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	public void setTint(int i)
	{
		setTintList(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #220 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #224 <Method void setTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		mState.mTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    2    4:aload_1         
	//    3    5:putfield        #79  <Field ColorStateList WrappedDrawableApi14$DrawableWrapperState.mTint>
		updateTint(getState());
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #225 <Method int[] getState()>
	//    7   13:invokespecial   #215 <Method boolean updateTint(int[])>
	//    8   16:pop             
	//    9   17:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mState.mTintMode = mode;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    2    4:aload_1         
	//    3    5:putfield        #82  <Field android.graphics.PorterDuff$Mode WrappedDrawableApi14$DrawableWrapperState.mTintMode>
		updateTint(getState());
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #225 <Method int[] getState()>
	//    7   13:invokespecial   #215 <Method boolean updateTint(int[])>
	//    8   16:pop             
	//    9   17:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		return super.setVisible(flag, flag1) || mDrawable.setVisible(flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #231 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    4    6:ifne            26
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field Drawable mDrawable>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #231 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   10   18:ifeq            24
	//   11   21:goto            26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	public final void setWrappedDrawable(Drawable drawable)
	{
		if(mDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field Drawable mDrawable>
	//*   2    4:ifnull          15
			mDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #109 <Field Drawable mDrawable>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #235 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mDrawable = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #109 <Field Drawable mDrawable>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          83
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #235 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			setVisible(drawable.isVisible(), true);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #238 <Method boolean Drawable.isVisible()>
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #239 <Method boolean setVisible(boolean, boolean)>
	//   20   38:pop             
			setState(drawable.getState());
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #152 <Method int[] Drawable.getState()>
	//   24   44:invokevirtual   #240 <Method boolean setState(int[])>
	//   25   47:pop             
			setLevel(drawable.getLevel());
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #243 <Method int Drawable.getLevel()>
	//   29   53:invokevirtual   #244 <Method boolean setLevel(int)>
	//   30   56:pop             
			setBounds(drawable.getBounds());
	//   31   57:aload_0         
	//   32   58:aload_1         
	//   33   59:invokevirtual   #248 <Method Rect Drawable.getBounds()>
	//   34   62:invokevirtual   #249 <Method void setBounds(Rect)>
			if(mState != null)
	//*  35   65:aload_0         
	//*  36   66:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//*  37   69:ifnull          83
				mState.mDrawableState = drawable.getConstantState();
	//   38   72:aload_0         
	//   39   73:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   40   76:aload_1         
	//   41   77:invokevirtual   #175 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   42   80:putfield        #63  <Field android.graphics.drawable.Drawable$ConstantState WrappedDrawableApi14$DrawableWrapperState.mDrawableState>
		}
		invalidateSelf();
	//   43   83:aload_0         
	//   44   84:invokevirtual   #161 <Method void invalidateSelf()>
	//   45   87:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		unscheduleSelf(runnable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #255 <Method void unscheduleSelf(Runnable)>
	//    3    5:return          
	}

	static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE;
	private boolean mColorFilterSet;
	private int mCurrentColor;
	private android.graphics.PorterDuff.Mode mCurrentMode;
	Drawable mDrawable;
	private boolean mMutated;
	DrawableWrapperState mState;

	static 
	{
		DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
	//    0    0:getstatic       #35  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #37  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*   2    6:return          
	}
}
