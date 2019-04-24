// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableWrapperApi14

protected static abstract class DrawableWrapperApi14$DrawableWrapperState extends android.graphics.drawable.Drawable.ConstantState
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

	DrawableWrapperApi14$DrawableWrapperState(DrawableWrapperApi14$DrawableWrapperState drawablewrapperapi14$drawablewrapperstate, Resources resources)
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
		if(drawablewrapperapi14$drawablewrapperstate != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          52
		{
			mChangingConfigurations = drawablewrapperapi14$drawablewrapperstate.mChangingConfigurations;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #30  <Field int mChangingConfigurations>
	//   13   25:putfield        #30  <Field int mChangingConfigurations>
			mDrawableState = drawablewrapperapi14$drawablewrapperstate.mDrawableState;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
	//   17   33:putfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
			mTint = drawablewrapperapi14$drawablewrapperstate.mTint;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #23  <Field ColorStateList mTint>
	//   21   41:putfield        #23  <Field ColorStateList mTint>
			mTintMode = drawablewrapperapi14$drawablewrapperstate.mTintMode;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #28  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   25   49:putfield        #28  <Field android.graphics.PorterDuff$Mode mTintMode>
		}
	//   26   52:return          
	}
}
