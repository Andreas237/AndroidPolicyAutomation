// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Rect;

// Referenced classes of package android.support.transition:
//			FragmentTransitionSupport, Transition

class FragmentTransitionSupport$4 extends 
{

	public Rect onGetEpicenter(Transition transition)
	{
		if(val$epicenter != null && !val$epicenter.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Rect val$epicenter>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #19  <Field Rect val$epicenter>
	//*   5   11:invokevirtual   #32  <Method boolean Rect.isEmpty()>
	//*   6   14:ifeq            20
	//*   7   17:goto            25
			return val$epicenter;
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field Rect val$epicenter>
	//   10   24:areturn         
		else
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
	}

	final FragmentTransitionSupport this$0;
	final Rect val$epicenter;

	FragmentTransitionSupport$4()
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
