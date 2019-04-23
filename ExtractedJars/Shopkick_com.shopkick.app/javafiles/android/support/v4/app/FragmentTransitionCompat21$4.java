// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionCompat21

class FragmentTransitionCompat21$4 extends android.transition.Transition$EpicenterCallback
{

	public Rect onGetEpicenter(Transition transition)
	{
		transition = ((Transition) (val$epicenter));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Rect val$epicenter>
	//    2    4:astore_1        
		if(transition != null && !((Rect) (transition)).isEmpty())
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #31  <Method boolean Rect.isEmpty()>
	//*   7   13:ifeq            19
	//*   8   16:goto            24
			return val$epicenter;
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field Rect val$epicenter>
	//   11   23:areturn         
		else
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
	}

	final FragmentTransitionCompat21 this$0;
	final Rect val$epicenter;

	FragmentTransitionCompat21$4()
	{
		this$0 = final_fragmenttransitioncompat21;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FragmentTransitionCompat21 this$0>
		val$epicenter = Rect.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Rect val$epicenter>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void android.transition.Transition$EpicenterCallback()>
	//    8   14:return          
	}
}
