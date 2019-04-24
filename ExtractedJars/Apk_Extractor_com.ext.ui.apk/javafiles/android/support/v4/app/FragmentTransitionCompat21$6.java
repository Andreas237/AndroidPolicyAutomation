// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionCompat21

static final class FragmentTransitionCompat21$6 extends android.transition.Transition$EpicenterCallback
{

	public Rect onGetEpicenter(Transition transition)
	{
		if(val$epicenter == null || val$epicenter.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Rect val$epicenter>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #15  <Field Rect val$epicenter>
	//*   5   11:invokevirtual   #27  <Method boolean Rect.isEmpty()>
	//*   6   14:ifeq            19
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
		else
			return val$epicenter;
	//    9   19:aload_0         
	//   10   20:getfield        #15  <Field Rect val$epicenter>
	//   11   23:areturn         
	}

	final Rect val$epicenter;

	FragmentTransitionCompat21$6(Rect rect)
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
