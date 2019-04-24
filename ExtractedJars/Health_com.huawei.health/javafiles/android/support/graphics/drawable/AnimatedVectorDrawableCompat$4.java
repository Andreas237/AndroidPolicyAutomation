// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.graphics.drawable:
//			AnimatedVectorDrawableCompat

class AnimatedVectorDrawableCompat$4
	implements android.graphics.drawable.Drawable.Callback
{

	public void invalidateDrawable(Drawable drawable)
	{
		c.invalidateSelf();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat c>
	//    2    4:invokevirtual   #23  <Method void AnimatedVectorDrawableCompat.invalidateSelf()>
	//    3    7:return          
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		c.scheduleSelf(runnable, l);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat c>
	//    2    4:aload_2         
	//    3    5:lload_3         
	//    4    6:invokevirtual   #29  <Method void AnimatedVectorDrawableCompat.scheduleSelf(Runnable, long)>
	//    5    9:return          
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		c.unscheduleSelf(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat c>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #35  <Method void AnimatedVectorDrawableCompat.unscheduleSelf(Runnable)>
	//    4    8:return          
	}

	final AnimatedVectorDrawableCompat c;

	AnimatedVectorDrawableCompat$4(AnimatedVectorDrawableCompat animatedvectordrawablecompat)
	{
		c = animatedvectordrawablecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AnimatedVectorDrawableCompat c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
