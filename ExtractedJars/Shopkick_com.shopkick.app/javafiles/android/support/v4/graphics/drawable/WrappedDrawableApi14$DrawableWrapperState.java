// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//			WrappedDrawableApi14

protected static abstract class WrappedDrawableApi14$DrawableWrapperState extends android.graphics.drawable.Drawable.ConstantState
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

	WrappedDrawableApi14$DrawableWrapperState(WrappedDrawableApi14$DrawableWrapperState wrappeddrawableapi14$drawablewrapperstate, Resources resources)
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
		if(wrappeddrawableapi14$drawablewrapperstate != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          52
		{
			mChangingConfigurations = wrappeddrawableapi14$drawablewrapperstate.mChangingConfigurations;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #30  <Field int mChangingConfigurations>
	//   13   25:putfield        #30  <Field int mChangingConfigurations>
			mDrawableState = wrappeddrawableapi14$drawablewrapperstate.mDrawableState;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
	//   17   33:putfield        #32  <Field android.graphics.drawable.Drawable$ConstantState mDrawableState>
			mTint = wrappeddrawableapi14$drawablewrapperstate.mTint;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #23  <Field ColorStateList mTint>
	//   21   41:putfield        #23  <Field ColorStateList mTint>
			mTintMode = wrappeddrawableapi14$drawablewrapperstate.mTintMode;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #28  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   25   49:putfield        #28  <Field android.graphics.PorterDuff$Mode mTintMode>
		}
	//   26   52:return          
	}
}
