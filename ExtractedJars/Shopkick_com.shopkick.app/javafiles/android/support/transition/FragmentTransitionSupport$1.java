// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Rect;

// Referenced classes of package android.support.transition:
//			FragmentTransitionSupport, Transition

class FragmentTransitionSupport$1 extends 
{

	public Rect onGetEpicenter(Transition transition)
	{
		return val$epicenter;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Rect val$epicenter>
	//    2    4:areturn         
	}

	final FragmentTransitionSupport this$0;
	final Rect val$epicenter;

	FragmentTransitionSupport$1()
	{
		this$0 = final_fragmenttransitionsupport;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FragmentTransitionSupport this$0>
		val$epicenter = Rect.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Rect val$epicenter>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void Transition$EpicenterCallback()>
	//    8   14:return          
	}
}
