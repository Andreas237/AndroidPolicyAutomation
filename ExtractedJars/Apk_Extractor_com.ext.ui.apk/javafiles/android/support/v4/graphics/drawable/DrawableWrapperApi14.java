// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableWrapper, TintAwareDrawable

class DrawableWrapperApi14 extends Drawable
	implements android.graphics.drawable.Drawable.Callback, DrawableWrapper, TintAwareDrawable
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
		//*   5    9:ifnull          24
				i = mDrawableState.getChangingConfigurations();
		//    6   12:aload_0         
		//    7   13:getfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
		//    8   16:invokevirtual   #40  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
		//    9   19:istore_1        
			else
		//*  10   20:iload_1         
		//*  11   21:iload_2         
		//*  12   22:ior             
		//*  13   23:ireturn         
				i = 0;
		//   14   24:iconst_0        
		//   15   25:istore_1        
			return i | j;
		//*  16   26:goto            20
		}

		public Drawable newDrawable()
		{
			return newDrawable(((Resources) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokevirtual   #45  <Method Drawable newDrawable(Resources)>
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
			mTintMode = DrawableWrapperApi14.DEFAULT_TINT_MODE;
		//    5    9:aload_0         
		//    6   10:getstatic       #26  <Field android.graphics.PorterDuff$Mode DrawableWrapperApi14.DEFAULT_TINT_MODE>
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
			return ((Drawable) (new DrawableWrapperApi14(((DrawableWrapperState) (this)), resources)));
		//    0    0:new             #6   <Class DrawableWrapperApi14>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #17  <Method void DrawableWrapperApi14(DrawableWrapperApi14$DrawableWrapperState, Resources)>
		//    5    9:areturn         
		}

		DrawableWrapperStateBase(DrawableWrapperState drawablewrapperstate, Resources resources)
		{
			super(drawablewrapperstate, resources);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void DrawableWrapperApi14$DrawableWrapperState(DrawableWrapperApi14$DrawableWrapperState, Resources)>
		//    4    6:return          
		}
	}


	DrawableWrapperApi14(Drawable drawable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Drawable()>
		mState = mutateConstantState();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #50  <Method DrawableWrapperApi14$DrawableWrapperState mutateConstantState()>
	//    5    9:putfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
		setWrappedDrawable(drawable);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #55  <Method void setWrappedDrawable(Drawable)>
	//    9   17:return          
	}

	DrawableWrapperApi14(DrawableWrapperState drawablewrapperstate, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Drawable()>
		mState = drawablewrapperstate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
		updateLocalState(resources);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #62  <Method void updateLocalState(Resources)>
	//    8   14:return          
	}

	private void updateLocalState(Resources resources)
	{
		if(mState != null && mState.mDrawableState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//*   5   11:getfield        #66  <Field android.graphics.drawable.Drawable$ConstantState DrawableWrapperApi14$DrawableWrapperState.mDrawableState>
	//*   6   14:ifnull          33
			setWrappedDrawable(newDrawableFromState(mState.mDrawableState, resources));
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//   11   23:getfield        #66  <Field android.graphics.drawable.Drawable$ConstantState DrawableWrapperApi14$DrawableWrapperState.mDrawableState>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #70  <Method Drawable newDrawableFromState(android.graphics.drawable.Drawable$ConstantState, Resources)>
	//   14   30:invokevirtual   #55  <Method void setWrappedDrawable(Drawable)>
	//   15   33:return          
	}

	private boolean updateTint(int ai[])
	{
		if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #76  <Method boolean isCompatTintEnabled()>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			ColorStateList colorstatelist = mState.mTint;
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    7   13:getfield        #80  <Field ColorStateList DrawableWrapperApi14$DrawableWrapperState.mTint>
	//    8   16:astore_3        
			android.graphics.PorterDuff.Mode mode = mState.mTintMode;
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//   11   21:getfield        #83  <Field android.graphics.PorterDuff$Mode DrawableWrapperApi14$DrawableWrapperState.mTintMode>
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
	//   20   38:invokevirtual   #89  <Method int ColorStateList.getDefaultColor()>
	//   21   41:invokevirtual   #93  <Method int ColorStateList.getColorForState(int[], int)>
	//   22   44:istore_2        
				if(!mColorFilterSet || i != mCurrentColor || mode != mCurrentMode)
	//*  23   45:aload_0         
	//*  24   46:getfield        #95  <Field boolean mColorFilterSet>
	//*  25   49:ifeq            69
	//*  26   52:iload_2         
	//*  27   53:aload_0         
	//*  28   54:getfield        #97  <Field int mCurrentColor>
	//*  29   57:icmpne          69
	//*  30   60:aload           4
	//*  31   62:aload_0         
	//*  32   63:getfield        #99  <Field android.graphics.PorterDuff$Mode mCurrentMode>
	//*  33   66:if_acmpeq       7
				{
					setColorFilter(i, mode);
	//   34   69:aload_0         
	//   35   70:iload_2         
	//   36   71:aload           4
	//   37   73:invokevirtual   #103 <Method void setColorFilter(int, android.graphics.PorterDuff$Mode)>
					mCurrentColor = i;
	//   38   76:aload_0         
	//   39   77:iload_2         
	//   40   78:putfield        #97  <Field int mCurrentColor>
					mCurrentMode = mode;
	//   41   81:aload_0         
	//   42   82:aload           4
	//   43   84:putfield        #99  <Field android.graphics.PorterDuff$Mode mCurrentMode>
					mColorFilterSet = true;
	//   44   87:aload_0         
	//   45   88:iconst_1        
	//   46   89:putfield        #95  <Field boolean mColorFilterSet>
					return true;
	//   47   92:iconst_1        
	//   48   93:ireturn         
				}
			} else
			{
				mColorFilterSet = false;
	//   49   94:aload_0         
	//   50   95:iconst_0        
	//   51   96:putfield        #95  <Field boolean mColorFilterSet>
				clearColorFilter();
	//   52   99:aload_0         
	//   53  100:invokevirtual   #106 <Method void clearColorFilter()>
				return false;
	//   54  103:iconst_0        
	//   55  104:ireturn         
			}
		}
		return false;
	}

	public void draw(Canvas canvas)
	{
		mDrawable.draw(canvas);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method void Drawable.draw(Canvas)>
	//    4    8:return          
	}

	public int getChangingConfigurations()
	{
		int j = super.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method int Drawable.getChangingConfigurations()>
	//    2    4:istore_2        
		int i;
		if(mState != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//*   5    9:ifnull          32
			i = mState.getChangingConfigurations();
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    8   16:invokevirtual   #116 <Method int DrawableWrapperApi14$DrawableWrapperState.getChangingConfigurations()>
	//    9   19:istore_1        
		else
	//*  10   20:iload_1         
	//*  11   21:iload_2         
	//*  12   22:ior             
	//*  13   23:aload_0         
	//*  14   24:getfield        #110 <Field Drawable mDrawable>
	//*  15   27:invokevirtual   #115 <Method int Drawable.getChangingConfigurations()>
	//*  16   30:ior             
	//*  17   31:ireturn         
			i = 0;
	//   18   32:iconst_0        
	//   19   33:istore_1        
		return i | j | mDrawable.getChangingConfigurations();
	//*  20   34:goto            20
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mState != null && mState.canConstantState())
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//*   5   11:invokevirtual   #121 <Method boolean DrawableWrapperApi14$DrawableWrapperState.canConstantState()>
	//*   6   14:ifeq            33
		{
			mState.mChangingConfigurations = getChangingConfigurations();
	//    7   17:aload_0         
	//    8   18:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #122 <Method int getChangingConfigurations()>
	//   11   25:putfield        #125 <Field int DrawableWrapperApi14$DrawableWrapperState.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (mState));
	//   12   28:aload_0         
	//   13   29:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
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
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #130 <Method Drawable Drawable.getCurrent()>
	//    3    7:areturn         
	}

	public int getIntrinsicHeight()
	{
		return mDrawable.getIntrinsicHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #133 <Method int Drawable.getIntrinsicHeight()>
	//    3    7:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return mDrawable.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #136 <Method int Drawable.getIntrinsicWidth()>
	//    3    7:ireturn         
	}

	public int getMinimumHeight()
	{
		return mDrawable.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #139 <Method int Drawable.getMinimumHeight()>
	//    3    7:ireturn         
	}

	public int getMinimumWidth()
	{
		return mDrawable.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #142 <Method int Drawable.getMinimumWidth()>
	//    3    7:ireturn         
	}

	public int getOpacity()
	{
		return mDrawable.getOpacity();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #145 <Method int Drawable.getOpacity()>
	//    3    7:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		return mDrawable.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method boolean Drawable.getPadding(Rect)>
	//    4    8:ireturn         
	}

	public int[] getState()
	{
		return mDrawable.getState();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #153 <Method int[] Drawable.getState()>
	//    3    7:areturn         
	}

	public Region getTransparentRegion()
	{
		return mDrawable.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #157 <Method Region Drawable.getTransparentRegion()>
	//    3    7:areturn         
	}

	public final Drawable getWrappedDrawable()
	{
		return mDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:areturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		invalidateSelf();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method void invalidateSelf()>
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
	//*   1    1:invokevirtual   #76  <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            45
	//*   3    7:aload_0         
	//*   4    8:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//*   5   11:ifnull          45
			colorstatelist = mState.mTint;
	//    6   14:aload_0         
	//    7   15:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    8   18:getfield        #80  <Field ColorStateList DrawableWrapperApi14$DrawableWrapperState.mTint>
	//    9   21:astore_1        
		else
	//*  10   22:aload_1         
	//*  11   23:ifnull          33
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #165 <Method boolean ColorStateList.isStateful()>
	//*  14   30:ifne            43
	//*  15   33:aload_0         
	//*  16   34:getfield        #110 <Field Drawable mDrawable>
	//*  17   37:invokevirtual   #166 <Method boolean Drawable.isStateful()>
	//*  18   40:ifeq            50
	//*  19   43:iconst_1        
	//*  20   44:ireturn         
			colorstatelist = null;
	//   21   45:aconst_null     
	//   22   46:astore_1        
		return colorstatelist != null && colorstatelist.isStateful() || mDrawable.isStateful();
	//   23   47:goto            22
	//   24   50:iconst_0        
	//   25   51:ireturn         
	}

	public void jumpToCurrentState()
	{
		mDrawable.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #169 <Method void Drawable.jumpToCurrentState()>
	//    3    7:return          
	}

	public Drawable mutate()
	{
		if(!mMutated && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field boolean mMutated>
	//*   2    4:ifne            75
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #174 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       75
		{
			mState = mutateConstantState();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #50  <Method DrawableWrapperApi14$DrawableWrapperState mutateConstantState()>
	//   10   20:putfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
			if(mDrawable != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #110 <Field Drawable mDrawable>
	//*  13   27:ifnull          38
				mDrawable.mutate();
	//   14   30:aload_0         
	//   15   31:getfield        #110 <Field Drawable mDrawable>
	//   16   34:invokevirtual   #174 <Method Drawable Drawable.mutate()>
	//   17   37:pop             
			if(mState != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//*  20   42:ifnull          70
			{
				DrawableWrapperState drawablewrapperstate = mState;
	//   21   45:aload_0         
	//   22   46:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//   23   49:astore_2        
				android.graphics.drawable.Drawable.ConstantState constantstate;
				if(mDrawable != null)
	//*  24   50:aload_0         
	//*  25   51:getfield        #110 <Field Drawable mDrawable>
	//*  26   54:ifnull          77
					constantstate = mDrawable.getConstantState();
	//   27   57:aload_0         
	//   28   58:getfield        #110 <Field Drawable mDrawable>
	//   29   61:invokevirtual   #176 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   30   64:astore_1        
				else
	//*  31   65:aload_2         
	//*  32   66:aload_1         
	//*  33   67:putfield        #66  <Field android.graphics.drawable.Drawable$ConstantState DrawableWrapperApi14$DrawableWrapperState.mDrawableState>
	//*  34   70:aload_0         
	//*  35   71:iconst_1        
	//*  36   72:putfield        #172 <Field boolean mMutated>
	//*  37   75:aload_0         
	//*  38   76:areturn         
					constantstate = null;
	//   39   77:aconst_null     
	//   40   78:astore_1        
				drawablewrapperstate.mDrawableState = constantstate;
			}
			mMutated = true;
		}
		return ((Drawable) (this));
	//*  41   79:goto            65
	}

	DrawableWrapperState mutateConstantState()
	{
		return ((DrawableWrapperState) (new DrawableWrapperStateBase(mState, ((Resources) (null)))));
	//    0    0:new             #15  <Class DrawableWrapperApi14$DrawableWrapperStateBase>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #178 <Method void DrawableWrapperApi14$DrawableWrapperStateBase(DrawableWrapperApi14$DrawableWrapperState, Resources)>
	//    6   12:areturn         
	}

	protected Drawable newDrawableFromState(android.graphics.drawable.Drawable.ConstantState constantstate, Resources resources)
	{
		return constantstate.newDrawable(resources);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #184 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//    3    5:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		if(mDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field Drawable mDrawable>
	//*   2    4:ifnull          15
			mDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field Drawable mDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #189 <Method void Drawable.setBounds(Rect)>
	//    7   15:return          
	}

	protected boolean onLevelChange(int i)
	{
		return mDrawable.setLevel(i);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #194 <Method boolean Drawable.setLevel(int)>
	//    4    8:ireturn         
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		scheduleSelf(runnable, l);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:lload_3         
	//    3    3:invokevirtual   #200 <Method void scheduleSelf(Runnable, long)>
	//    4    6:return          
	}

	public void setAlpha(int i)
	{
		mDrawable.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #204 <Method void Drawable.setAlpha(int)>
	//    4    8:return          
	}

	public void setChangingConfigurations(int i)
	{
		mDrawable.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #207 <Method void Drawable.setChangingConfigurations(int)>
	//    4    8:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mDrawable.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #210 <Method void Drawable.setColorFilter(ColorFilter)>
	//    4    8:return          
	}

	public void setDither(boolean flag)
	{
		mDrawable.setDither(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #214 <Method void Drawable.setDither(boolean)>
	//    4    8:return          
	}

	public void setFilterBitmap(boolean flag)
	{
		mDrawable.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #217 <Method void Drawable.setFilterBitmap(boolean)>
	//    4    8:return          
	}

	public boolean setState(int ai[])
	{
		boolean flag = mDrawable.setState(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #220 <Method boolean Drawable.setState(int[])>
	//    4    8:istore_2        
		return updateTint(ai) || flag;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #222 <Method boolean updateTint(int[])>
	//    8   14:ifne            21
	//    9   17:iload_2         
	//   10   18:ifeq            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public void setTint(int i)
	{
		setTintList(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #227 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #231 <Method void setTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		mState.mTint = colorstatelist;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    2    4:aload_1         
	//    3    5:putfield        #80  <Field ColorStateList DrawableWrapperApi14$DrawableWrapperState.mTint>
		updateTint(getState());
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #232 <Method int[] getState()>
	//    7   13:invokespecial   #222 <Method boolean updateTint(int[])>
	//    8   16:pop             
	//    9   17:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mState.mTintMode = mode;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//    2    4:aload_1         
	//    3    5:putfield        #83  <Field android.graphics.PorterDuff$Mode DrawableWrapperApi14$DrawableWrapperState.mTintMode>
		updateTint(getState());
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #232 <Method int[] getState()>
	//    7   13:invokespecial   #222 <Method boolean updateTint(int[])>
	//    8   16:pop             
	//    9   17:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		return super.setVisible(flag, flag1) || mDrawable.setVisible(flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #238 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    4    6:ifne            21
	//    5    9:aload_0         
	//    6   10:getfield        #110 <Field Drawable mDrawable>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #238 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   10   18:ifeq            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public final void setWrappedDrawable(Drawable drawable)
	{
		if(mDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field Drawable mDrawable>
	//*   2    4:ifnull          15
			mDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field Drawable mDrawable>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #242 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mDrawable = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #110 <Field Drawable mDrawable>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          83
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #242 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			setVisible(drawable.isVisible(), true);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #245 <Method boolean Drawable.isVisible()>
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #246 <Method boolean setVisible(boolean, boolean)>
	//   20   38:pop             
			setState(drawable.getState());
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #153 <Method int[] Drawable.getState()>
	//   24   44:invokevirtual   #247 <Method boolean setState(int[])>
	//   25   47:pop             
			setLevel(drawable.getLevel());
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #250 <Method int Drawable.getLevel()>
	//   29   53:invokevirtual   #251 <Method boolean setLevel(int)>
	//   30   56:pop             
			setBounds(drawable.getBounds());
	//   31   57:aload_0         
	//   32   58:aload_1         
	//   33   59:invokevirtual   #255 <Method Rect Drawable.getBounds()>
	//   34   62:invokevirtual   #256 <Method void setBounds(Rect)>
			if(mState != null)
	//*  35   65:aload_0         
	//*  36   66:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//*  37   69:ifnull          83
				mState.mDrawableState = drawable.getConstantState();
	//   38   72:aload_0         
	//   39   73:getfield        #52  <Field DrawableWrapperApi14$DrawableWrapperState mState>
	//   40   76:aload_1         
	//   41   77:invokevirtual   #176 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   42   80:putfield        #66  <Field android.graphics.drawable.Drawable$ConstantState DrawableWrapperApi14$DrawableWrapperState.mDrawableState>
		}
		invalidateSelf();
	//   43   83:aload_0         
	//   44   84:invokevirtual   #162 <Method void invalidateSelf()>
	//   45   87:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		unscheduleSelf(runnable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #262 <Method void unscheduleSelf(Runnable)>
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
	//    0    0:getstatic       #38  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #40  <Field android.graphics.PorterDuff$Mode DEFAULT_TINT_MODE>
	//*   2    6:return          
	}
}
