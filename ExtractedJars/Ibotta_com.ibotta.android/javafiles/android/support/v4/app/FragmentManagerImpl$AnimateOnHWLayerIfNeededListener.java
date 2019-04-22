// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl

private static class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener extends FragmentManagerImpl.AnimationListenerWrapper
{

	public void onAnimationEnd(Animation animation)
	{
		if(!ViewCompat.isAttachedToWindow(mView) && android.os.Build.VERSION.SDK_INT < 24)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field View mView>
	//*   2    4:invokestatic    #28  <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*   3    7:ifne            33
	//*   4   10:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          24
	//*   6   15:icmplt          21
	//*   7   18:goto            33
			mView.setLayerType(0, ((android.graphics.Paint) (null)));
	//    8   21:aload_0         
	//    9   22:getfield        #18  <Field View mView>
	//   10   25:iconst_0        
	//   11   26:aconst_null     
	//   12   27:invokevirtual   #40  <Method void View.setLayerType(int, android.graphics.Paint)>
		else
	//*  13   30:goto            49
			mView.post(new Runnable() {

				public void run()
				{
					mView.setLayerType(0, ((android.graphics.Paint) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field FragmentManagerImpl$AnimateOnHWLayerIfNeededListener this$0>
				//    2    4:getfield        #29  <Field View FragmentManagerImpl$AnimateOnHWLayerIfNeededListener.mView>
				//    3    7:iconst_0        
				//    4    8:aconst_null     
				//    5    9:invokevirtual   #35  <Method void View.setLayerType(int, android.graphics.Paint)>
				//    6   12:return          
				}

				final FragmentManagerImpl.AnimateOnHWLayerIfNeededListener this$0;

			
			{
				this$0 = FragmentManagerImpl.AnimateOnHWLayerIfNeededListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FragmentManagerImpl$AnimateOnHWLayerIfNeededListener this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   14   33:aload_0         
	//   15   34:getfield        #18  <Field View mView>
	//   16   37:new             #9   <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1>
	//   17   40:dup             
	//   18   41:aload_0         
	//   19   42:invokespecial   #43  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1(FragmentManagerImpl$AnimateOnHWLayerIfNeededListener)>
	//   20   45:invokevirtual   #47  <Method boolean View.post(Runnable)>
	//   21   48:pop             
		super.onAnimationEnd(animation);
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:invokespecial   #49  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
	//   25   54:return          
	}

	View mView;

	FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View view, android.view.animation.Animation.AnimationListener animationlistener)
	{
		super(animationlistener);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #16  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener)>
		mView = view;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #18  <Field View mView>
	//    6   10:return          
	}
}
