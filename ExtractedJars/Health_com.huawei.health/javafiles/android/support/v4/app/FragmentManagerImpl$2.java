// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl, Fragment

class FragmentManagerImpl$2 extends imateOnHWLayerIfNeededListener
{

	public void onAnimationEnd(Animation animation)
	{
		super.onAnimationEnd(animation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener.onAnimationEnd(Animation)>
		if(val$fragment.getAnimatingAway() != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field Fragment val$fragment>
	//*   5    9:invokevirtual   #33  <Method View Fragment.getAnimatingAway()>
	//*   6   12:ifnull          44
		{
			val$fragment.setAnimatingAway(((View) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field Fragment val$fragment>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #37  <Method void Fragment.setAnimatingAway(View)>
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
	//   21   41:invokevirtual   #42  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
		}
	//   22   44:return          
	}

	final FragmentManagerImpl this$0;
	final Fragment val$fragment;

	FragmentManagerImpl$2(Animation animation, Fragment fragment1)
	{
		this$0 = final_fragmentmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FragmentManagerImpl this$0>
		val$fragment = fragment1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #19  <Field Fragment val$fragment>
		super(View.this, animation);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:aload_3         
	//    9   14:invokespecial   #22  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View, Animation)>
	//   10   17:return          
	}
}
