// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl, Fragment

class FragmentManagerImpl$2 extends imationListenerWrapper
{

	public void onAnimationEnd(Animation animation)
	{
		super.onAnimationEnd(animation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
		if(val$fragment.getAnimatingAway() != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field Fragment val$fragment>
	//*   5    9:invokevirtual   #33  <Method android.view.View Fragment.getAnimatingAway()>
	//*   6   12:ifnull          44
		{
			val$fragment.setAnimatingAway(((android.view.View) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field Fragment val$fragment>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #37  <Method void Fragment.setAnimatingAway(android.view.View)>
			moveToState(val$fragment, val$fragment.getStateAfterAnimating(), 0, 0, false);
	//   11   23:aload_0         
	//   12   24:getfield        #17  <Field FragmentManagerImpl this$0>
	//   13   27:aload_0         
	//   14   28:getfield        #19  <Field Fragment val$fragment>
	//   15   31:aload_0         
	//   16   32:getfield        #19  <Field Fragment val$fragment>
	//   17   35:invokevirtual   #41  <Method int Fragment.getStateAfterAnimating()>
	//   18   38:iconst_0        
	//   19   39:iconst_0        
	//   20   40:iconst_0        
	//   21   41:invokevirtual   #45  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
		}
	//   22   44:return          
	}

	final FragmentManagerImpl this$0;
	final Fragment val$fragment;

	FragmentManagerImpl$2(Fragment fragment1)
	{
		this$0 = final_fragmentmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FragmentManagerImpl this$0>
		val$fragment = fragment1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field Fragment val$fragment>
		super(android.view.animation.tener.this, ((FragmentManagerImpl$1) (null)));
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:aconst_null     
	//    9   13:invokespecial   #22  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener, FragmentManagerImpl$1)>
	//   10   16:return          
	}
}
