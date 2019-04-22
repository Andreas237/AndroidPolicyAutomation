// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

private static class VectorDrawableCompat$VectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState
{

	public boolean canApplyTheme()
	{
		return mDelegateState.canApplyTheme();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
	//    2    4:invokevirtual   #24  <Method boolean android.graphics.drawable.Drawable$ConstantState.canApplyTheme()>
	//    3    7:ireturn         
	}

	public int getChangingConfigurations()
	{
		return mDelegateState.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
	//    2    4:invokevirtual   #28  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
	//    3    7:ireturn         
	}

	public Drawable newDrawable()
	{
		VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void VectorDrawableCompat()>
	//    3    7:astore_1        
		vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)mDelegateState.newDrawable()));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
	//    7   13:invokevirtual   #33  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//    8   16:checkcast       #35  <Class VectorDrawable>
	//    9   19:putfield        #39  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
		return ((Drawable) (vectordrawablecompat));
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void VectorDrawableCompat()>
	//    3    7:astore_2        
		vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)mDelegateState.newDrawable(resources)));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #42  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//    9   17:checkcast       #35  <Class VectorDrawable>
	//   10   20:putfield        #39  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
		return ((Drawable) (vectordrawablecompat));
	//   11   23:aload_2         
	//   12   24:areturn         
	}

	public Drawable newDrawable(Resources resources, android.content.res.Resources.Theme theme)
	{
		VectorDrawableCompat vectordrawablecompat = new VectorDrawableCompat();
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void VectorDrawableCompat()>
	//    3    7:astore_3        
		vectordrawablecompat.mDelegateDrawable = ((Drawable) ((VectorDrawable)mDelegateState.newDrawable(resources, theme)));
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #45  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources, android.content.res.Resources$Theme)>
	//   10   18:checkcast       #35  <Class VectorDrawable>
	//   11   21:putfield        #39  <Field Drawable VectorDrawableCompat.mDelegateDrawable>
		return ((Drawable) (vectordrawablecompat));
	//   12   24:aload_3         
	//   13   25:areturn         
	}

	private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

	public VectorDrawableCompat$VectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState constantstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void android.graphics.drawable.Drawable$ConstantState()>
		mDelegateState = constantstate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field android.graphics.drawable.Drawable$ConstantState mDelegateState>
	//    5    9:return          
	}
}
