// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.graphics.drawable:
//			AnimatedVectorDrawableCompat

static class AnimatedVectorDrawableCompat$c extends android.graphics.drawable.Drawable.ConstantState
{

	public boolean canApplyTheme()
	{
		return e.canApplyTheme();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
	//    2    4:invokevirtual   #21  <Method boolean android.graphics.drawable.Drawable$ConstantState.canApplyTheme()>
	//    3    7:ireturn         
	}

	public int getChangingConfigurations()
	{
		return e.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
	//    2    4:invokevirtual   #25  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
	//    3    7:ireturn         
	}

	public Drawable newDrawable()
	{
		AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
	//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void AnimatedVectorDrawableCompat()>
	//    3    7:astore_1        
		animatedvectordrawablecompat.mDelegateDrawable = e.newDrawable();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
	//    7   13:invokevirtual   #30  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//    8   16:putfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
	//    9   19:aload_1         
	//   10   20:getfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
	//   11   23:aload_1         
	//   12   24:getfield        #38  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
	//   13   27:invokevirtual   #44  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		return ((Drawable) (animatedvectordrawablecompat));
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
	//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void AnimatedVectorDrawableCompat()>
	//    3    7:astore_2        
		animatedvectordrawablecompat.mDelegateDrawable = e.newDrawable(resources);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #47  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//    9   17:putfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
	//   10   20:aload_2         
	//   11   21:getfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
	//   12   24:aload_2         
	//   13   25:getfield        #38  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
	//   14   28:invokevirtual   #44  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		return ((Drawable) (animatedvectordrawablecompat));
	//   15   31:aload_2         
	//   16   32:areturn         
	}

	public Drawable newDrawable(Resources resources, android.content.res.Resources.Theme theme)
	{
		AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
	//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void AnimatedVectorDrawableCompat()>
	//    3    7:astore_3        
		animatedvectordrawablecompat.mDelegateDrawable = e.newDrawable(resources, theme);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #50  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources, android.content.res.Resources$Theme)>
	//   10   18:putfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
	//   11   21:aload_3         
	//   12   22:getfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
	//   13   25:aload_3         
	//   14   26:getfield        #38  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
	//   15   29:invokevirtual   #44  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		return ((Drawable) (animatedvectordrawablecompat));
	//   16   32:aload_3         
	//   17   33:areturn         
	}

	private final android.graphics.drawable.Drawable.ConstantState e;

	public AnimatedVectorDrawableCompat$c(android.graphics.drawable.Drawable.ConstantState constantstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void android.graphics.drawable.Drawable$ConstantState()>
		e = constantstate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
	//    5    9:return          
	}
}
