// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.transition;

import android.view.View;

// Referenced classes of package com.bumptech.glide.request.transition:
//			Transition

public class ViewPropertyTransition
	implements Transition
{
	public static interface Animator
	{

		public abstract void animate(View view);
	}


	public ViewPropertyTransition(Animator animator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		animator = animator1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ViewPropertyTransition$Animator animator>
	//    5    9:return          
	}

	public boolean transition(Object obj, Transition.ViewAdapter viewadapter)
	{
		if(viewadapter.getView() != null)
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #28  <Method View Transition$ViewAdapter.getView()>
	//*   2    6:ifnull          24
			animator.animate(viewadapter.getView());
	//    3    9:aload_0         
	//    4   10:getfield        #19  <Field ViewPropertyTransition$Animator animator>
	//    5   13:aload_2         
	//    6   14:invokeinterface #28  <Method View Transition$ViewAdapter.getView()>
	//    7   19:invokeinterface #32  <Method void ViewPropertyTransition$Animator.animate(View)>
		return false;
	//    8   24:iconst_0        
	//    9   25:ireturn         
	}

	private final Animator animator;
}
