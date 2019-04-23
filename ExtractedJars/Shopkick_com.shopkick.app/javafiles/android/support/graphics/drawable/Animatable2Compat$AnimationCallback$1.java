// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.graphics.drawable:
//			Animatable2Compat

class Animatable2Compat$AnimationCallback$1 extends android.graphics.drawable.Animatable2.AnimationCallback
{

	public void onAnimationEnd(Drawable drawable)
	{
		Animatable2Compat.AnimationCallback.this.onAnimationEnd(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Animatable2Compat$AnimationCallback this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method void Animatable2Compat$AnimationCallback.onAnimationEnd(Drawable)>
	//    4    8:return          
	}

	public void onAnimationStart(Drawable drawable)
	{
		Animatable2Compat.AnimationCallback.this.onAnimationStart(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Animatable2Compat$AnimationCallback this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method void Animatable2Compat$AnimationCallback.onAnimationStart(Drawable)>
	//    4    8:return          
	}

	final Animatable2Compat.AnimationCallback this$0;

	Animatable2Compat$AnimationCallback$1()
	{
		this$0 = Animatable2Compat.AnimationCallback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Animatable2Compat$AnimationCallback this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void android.graphics.drawable.Animatable2$AnimationCallback()>
	//    5    9:return          
	}
}
