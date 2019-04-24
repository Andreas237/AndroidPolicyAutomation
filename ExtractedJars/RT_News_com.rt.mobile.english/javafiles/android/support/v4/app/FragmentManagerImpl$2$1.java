// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//			Fragment, FragmentManagerImpl

class FragmentManagerImpl$2$1
	implements Runnable
{

	public void run()
	{
		if(val$fragment.getAnimatingAway() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field FragmentManagerImpl$2 this$1>
	//*   2    4:getfield        #26  <Field Fragment FragmentManagerImpl$2.val$fragment>
	//*   3    7:invokevirtual   #32  <Method android.view.View Fragment.getAnimatingAway()>
	//*   4   10:ifnull          54
		{
			val$fragment.setAnimatingAway(((android.view.View) (null)));
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field FragmentManagerImpl$2 this$1>
	//    7   17:getfield        #26  <Field Fragment FragmentManagerImpl$2.val$fragment>
	//    8   20:aconst_null     
	//    9   21:invokevirtual   #36  <Method void Fragment.setAnimatingAway(android.view.View)>
			moveToState(val$fragment, val$fragment.getStateAfterAnimating(), 0, 0, false);
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field FragmentManagerImpl$2 this$1>
	//   12   28:getfield        #40  <Field FragmentManagerImpl FragmentManagerImpl$2.this$0>
	//   13   31:aload_0         
	//   14   32:getfield        #17  <Field FragmentManagerImpl$2 this$1>
	//   15   35:getfield        #26  <Field Fragment FragmentManagerImpl$2.val$fragment>
	//   16   38:aload_0         
	//   17   39:getfield        #17  <Field FragmentManagerImpl$2 this$1>
	//   18   42:getfield        #26  <Field Fragment FragmentManagerImpl$2.val$fragment>
	//   19   45:invokevirtual   #44  <Method int Fragment.getStateAfterAnimating()>
	//   20   48:iconst_0        
	//   21   49:iconst_0        
	//   22   50:iconst_0        
	//   23   51:invokevirtual   #50  <Method void FragmentManagerImpl.moveToState(Fragment, int, int, int, boolean)>
		}
	//   24   54:return          
	}

	final FragmentManagerImpl._cls2 this$1;

	FragmentManagerImpl$2$1()
	{
		this$1 = FragmentManagerImpl._cls2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FragmentManagerImpl$2 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class android/support/v4/app/FragmentManagerImpl$2

/* anonymous class */
	class FragmentManagerImpl._cls2 extends FragmentManagerImpl.AnimationListenerWrapper
	{

		public void onAnimationEnd(Animation animation)
		{
			super.onAnimationEnd(animation);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
			container.post(((Runnable) (new FragmentManagerImpl._cls2._cls1())));
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field ViewGroup val$container>
		//    5    9:new             #11  <Class FragmentManagerImpl$2$1>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:invokespecial   #36  <Method void FragmentManagerImpl$2$1(FragmentManagerImpl$2)>
		//    9   17:invokevirtual   #42  <Method boolean ViewGroup.post(Runnable)>
		//   10   20:pop             
		//   11   21:return          
		}

		final FragmentManagerImpl this$0;
		final ViewGroup val$container;
		final Fragment val$fragment;

			
			{
				this$0 = final_fragmentmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FragmentManagerImpl this$0>
				container = ViewGroup.this;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field ViewGroup val$container>
				fragment = fragment1;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #25  <Field Fragment val$fragment>
				super(final_animationlistener, ((FragmentManagerImpl._cls1) (null)));
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:aconst_null     
			//   12   19:invokespecial   #28  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener, FragmentManagerImpl$1)>
			//   13   22:return          
			}
	}

}
