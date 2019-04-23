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
			android.graphics.drawable.Drawable.ConstantState constantstate = mDrawableState;
		//    3    5:aload_0         
		//    4    6:getfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
		//    5    9:astore_3        
			int i;
			if(constantstate != null)
		//*   6   10:aload_3         
		//*   7   11:ifnull          22
				i = constantstate.getChangingConfigurations();
		//    8   14:aload_3         
		//    9   15:invokevirtual   #40  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
		//   10   18:istore_1        
			else
		//*  11   19:goto            24
				i = 0;
		//   12   22:iconst_0        
		//   13   23:istore_1        
			return j | i;
		//   14   24:iload_2         
		//   15   25:iload_1         
		//   16   26:ior             
		//   17   27:ireturn         
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
		DrawableWrapperState drawablewrapperstate = mState;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    2    4:astore_2        
		if(drawablewrapperstate != null && drawablewrapperstate.mDrawableState != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          31
	//*   5    9:aload_2         
	//*   6   10:getfield        #63  <Field android.graphics.drawable.Drawable$ConstantState WrappedDrawableApi14$DrawableWrapperState.mDrawableState>
	//*   7   13:ifnull          31
			setWrappedDrawable(mState.mDrawableState.newDrawable(resources));
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   11   21:getfield        #63  <Field android.graphics.drawable.Drawable$ConstantState WrappedDrawableApi14$DrawableWrapperState.mDrawableState>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #69  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   14   28:invokevirtual   #52  <Method void setWrappedDrawable(Drawable)>
	//   15   31:return          
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
		DrawableWrapperState drawablewrapperstate = mState;
	//    3    5:aload_0         
	//    4    6:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    5    9:astore_3        
		int i;
		if(drawablewrapperstate != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          22
			i = drawablewrapperstate.getChangingConfigurations();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #115 <Method int WrappedDrawableApi14$DrawableWrapperState.getChangingConfigurations()>
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		return j | i | mDrawable.getChangingConfigurations();
	//   14   24:iload_2         
	//   15   25:iload_1         
	//   16   26:ior             
	//   17   27:aload_0         
	//   18   28:getfield        #109 <Field Drawable mDrawable>
	//   19   31:invokevirtual   #114 <Method int Drawable.getChangingConfigurations()>
	//   20   34:ior             
	//   21   35:ireturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		DrawableWrapperState drawablewrapperstate = mState;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    2    4:astore_1        
		if(drawablewrapperstate != null && drawablewrapperstate.canConstantState())
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #120 <Method boolean WrappedDrawableApi14$DrawableWrapperState.canConstantState()>
	//*   7   13:ifeq            32
		{
			mState.mChangingConfigurations = getChangingConfigurations();
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #121 <Method int getChangingConfigurations()>
	//   12   24:putfield        #124 <Field int WrappedDrawableApi14$DrawableWrapperState.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (mState));
	//   13   27:aload_0         
	//   14   28:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   15   31:areturn         
		} else
		{
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
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

	public boolean isAutoMirrored()
	{
		return mDrawable.isAutoMirrored();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #167 <Method boolean Drawable.isAutoMirrored()>
	//    3    7:ireturn         
	}

	protected boolean isCompatTintEnabled()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isStateful()
	{
		Object obj;
label0:
		{
			if(isCompatTintEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #75  <Method boolean isCompatTintEnabled()>
	//*   2    4:ifeq            24
			{
				obj = ((Object) (mState));
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    5   11:astore_1        
				if(obj != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
				{
					obj = ((Object) (((DrawableWrapperState) (obj)).mTint));
	//    8   16:aload_1         
	//    9   17:getfield        #79  <Field ColorStateList WrappedDrawableApi14$DrawableWrapperState.mTint>
	//   10   20:astore_1        
					break label0;
	//   11   21:goto            26
				}
			}
			obj = null;
	//   12   24:aconst_null     
	//   13   25:astore_1        
		}
		return obj != null && ((ColorStateList) (obj)).isStateful() || mDrawable.isStateful();
	//   14   26:aload_1         
	//   15   27:ifnull          37
	//   16   30:aload_1         
	//   17   31:invokevirtual   #170 <Method boolean ColorStateList.isStateful()>
	//   18   34:ifne            47
	//   19   37:aload_0         
	//   20   38:getfield        #109 <Field Drawable mDrawable>
	//   21   41:invokevirtual   #171 <Method boolean Drawable.isStateful()>
	//   22   44:ifeq            49
	//   23   47:iconst_1        
	//   24   48:ireturn         
	//   25   49:iconst_0        
	//   26   50:ireturn         
	}

	public void jumpToCurrentState()
	{
		mDrawable.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:invokevirtual   #174 <Method void Drawable.jumpToCurrentState()>
	//    3    7:return          
	}

	public Drawable mutate()
	{
		if(!mMutated && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field boolean mMutated>
	//*   2    4:ifne            75
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #179 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       75
		{
			mState = mutateConstantState();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #47  <Method WrappedDrawableApi14$DrawableWrapperState mutateConstantState()>
	//   10   20:putfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
			Drawable drawable = mDrawable;
	//   11   23:aload_0         
	//   12   24:getfield        #109 <Field Drawable mDrawable>
	//   13   27:astore_1        
			if(drawable != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          37
				drawable.mutate();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #179 <Method Drawable Drawable.mutate()>
	//   18   36:pop             
			DrawableWrapperState drawablewrapperstate = mState;
	//   19   37:aload_0         
	//   20   38:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   21   41:astore_2        
			if(drawablewrapperstate != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          70
			{
				Object obj = ((Object) (mDrawable));
	//   24   46:aload_0         
	//   25   47:getfield        #109 <Field Drawable mDrawable>
	//   26   50:astore_1        
				if(obj != null)
	//*  27   51:aload_1         
	//*  28   52:ifnull          63
					obj = ((Object) (((Drawable) (obj)).getConstantState()));
	//   29   55:aload_1         
	//   30   56:invokevirtual   #181 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   31   59:astore_1        
				else
	//*  32   60:goto            65
					obj = null;
	//   33   63:aconst_null     
	//   34   64:astore_1        
				drawablewrapperstate.mDrawableState = ((android.graphics.drawable.Drawable.ConstantState) (obj));
	//   35   65:aload_2         
	//   36   66:aload_1         
	//   37   67:putfield        #63  <Field android.graphics.drawable.Drawable$ConstantState WrappedDrawableApi14$DrawableWrapperState.mDrawableState>
			}
			mMutated = true;
	//   38   70:aload_0         
	//   39   71:iconst_1        
	//   40   72:putfield        #177 <Field boolean mMutated>
		}
		return ((Drawable) (this));
	//   41   75:aload_0         
	//   42   76:areturn         
	}

	DrawableWrapperState mutateConstantState()
	{
		return ((DrawableWrapperState) (new DrawableWrapperStateBase(mState, ((Resources) (null)))));
	//    0    0:new             #15  <Class WrappedDrawableApi14$DrawableWrapperStateBase>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #183 <Method void WrappedDrawableApi14$DrawableWrapperStateBase(WrappedDrawableApi14$DrawableWrapperState, Resources)>
	//    6   12:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		Drawable drawable = mDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable.setBounds(rect);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #188 <Method void Drawable.setBounds(Rect)>
	//    8   14:return          
	}

	protected boolean onLevelChange(int i)
	{
		return mDrawable.setLevel(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #193 <Method boolean Drawable.setLevel(int)>
	//    4    8:ireturn         
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		scheduleSelf(runnable, l);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:lload_3         
	//    3    3:invokevirtual   #199 <Method void scheduleSelf(Runnable, long)>
	//    4    6:return          
	}

	public void setAlpha(int i)
	{
		mDrawable.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #203 <Method void Drawable.setAlpha(int)>
	//    4    8:return          
	}

	public void setAutoMirrored(boolean flag)
	{
		mDrawable.setAutoMirrored(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #207 <Method void Drawable.setAutoMirrored(boolean)>
	//    4    8:return          
	}

	public void setChangingConfigurations(int i)
	{
		mDrawable.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #210 <Method void Drawable.setChangingConfigurations(int)>
	//    4    8:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mDrawable.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #213 <Method void Drawable.setColorFilter(ColorFilter)>
	//    4    8:return          
	}

	public void setDither(boolean flag)
	{
		mDrawable.setDither(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #216 <Method void Drawable.setDither(boolean)>
	//    4    8:return          
	}

	public void setFilterBitmap(boolean flag)
	{
		mDrawable.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #219 <Method void Drawable.setFilterBitmap(boolean)>
	//    4    8:return          
	}

	public boolean setState(int ai[])
	{
		boolean flag = mDrawable.setState(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #222 <Method boolean Drawable.setState(int[])>
	//    4    8:istore_2        
		return updateTint(ai) || flag;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #224 <Method boolean updateTint(int[])>
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
	//    2    2:invokestatic    #229 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #233 <Method void setTintList(ColorStateList)>
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
	//    6   10:invokevirtual   #234 <Method int[] getState()>
	//    7   13:invokespecial   #224 <Method boolean updateTint(int[])>
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
	//    6   10:invokevirtual   #234 <Method int[] getState()>
	//    7   13:invokespecial   #224 <Method boolean updateTint(int[])>
	//    8   16:pop             
	//    9   17:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		return super.setVisible(flag, flag1) || mDrawable.setVisible(flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #240 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    4    6:ifne            26
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field Drawable mDrawable>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #240 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   10   18:ifeq            24
	//   11   21:goto            26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	public final void setWrappedDrawable(Drawable drawable)
	{
		Drawable drawable1 = mDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Drawable mDrawable>
	//    2    4:astore_2        
		if(drawable1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #244 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mDrawable = drawable;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #109 <Field Drawable mDrawable>
		if(drawable != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          81
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #244 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			setVisible(drawable.isVisible(), true);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #247 <Method boolean Drawable.isVisible()>
	//   19   33:iconst_1        
	//   20   34:invokevirtual   #248 <Method boolean setVisible(boolean, boolean)>
	//   21   37:pop             
			setState(drawable.getState());
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:invokevirtual   #152 <Method int[] Drawable.getState()>
	//   25   43:invokevirtual   #249 <Method boolean setState(int[])>
	//   26   46:pop             
			setLevel(drawable.getLevel());
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:invokevirtual   #252 <Method int Drawable.getLevel()>
	//   30   52:invokevirtual   #253 <Method boolean setLevel(int)>
	//   31   55:pop             
			setBounds(drawable.getBounds());
	//   32   56:aload_0         
	//   33   57:aload_1         
	//   34   58:invokevirtual   #257 <Method Rect Drawable.getBounds()>
	//   35   61:invokevirtual   #258 <Method void setBounds(Rect)>
			DrawableWrapperState drawablewrapperstate = mState;
	//   36   64:aload_0         
	//   37   65:getfield        #49  <Field WrappedDrawableApi14$DrawableWrapperState mState>
	//   38   68:astore_2        
			if(drawablewrapperstate != null)
	//*  39   69:aload_2         
	//*  40   70:ifnull          81
				drawablewrapperstate.mDrawableState = drawable.getConstantState();
	//   41   73:aload_2         
	//   42   74:aload_1         
	//   43   75:invokevirtual   #181 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   44   78:putfield        #63  <Field android.graphics.drawable.Drawable$ConstantState WrappedDrawableApi14$DrawableWrapperState.mDrawableState>
		}
		invalidateSelf();
	//   45   81:aload_0         
	//   46   82:invokevirtual   #161 <Method void invalidateSelf()>
	//   47   85:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		unscheduleSelf(runnable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #264 <Method void unscheduleSelf(Runnable)>
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
