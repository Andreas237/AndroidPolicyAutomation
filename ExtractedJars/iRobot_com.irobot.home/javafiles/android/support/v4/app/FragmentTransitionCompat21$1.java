// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionCompat21

static final class FragmentTransitionCompat21$1 extends android.transition.Transition$EpicenterCallback
{

	public Rect onGetEpicenter(Transition transition)
	{
		return val$epicenter;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Rect val$epicenter>
	//    2    4:areturn         
	}

	final Rect val$epicenter;

	FragmentTransitionCompat21$1(Rect rect)
	{
		val$epicenter = rect;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Rect val$epicenter>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.transition.Transition$EpicenterCallback()>
	//    5    9:return          
	}
}
