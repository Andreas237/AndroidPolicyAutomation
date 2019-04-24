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
		if(ViewCompat.isAttachedToWindow(mView) || android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field View mView>
	//*   2    4:invokestatic    #28  <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*   3    7:ifne            18
	//*   4   10:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          24
	//*   6   15:icmplt          40
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
	//    7   18:aload_0         
	//    8   19:getfield        #18  <Field View mView>
	//    9   22:new             #9   <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1>
	//   10   25:dup             
	//   11   26:aload_0         
	//   12   27:invokespecial   #37  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1(FragmentManagerImpl$AnimateOnHWLayerIfNeededListener)>
	//   13   30:invokevirtual   #43  <Method boolean View.post(Runnable)>
	//   14   33:pop             
		else
	//*  15   34:aload_0         
	//*  16   35:aload_1         
	//*  17   36:invokespecial   #45  <Method void FragmentManagerImpl$AnimationListenerWrapper.onAnimationEnd(Animation)>
	//*  18   39:return          
			mView.setLayerType(0, ((android.graphics.Paint) (null)));
	//   19   40:aload_0         
	//   20   41:getfield        #18  <Field View mView>
	//   21   44:iconst_0        
	//   22   45:aconst_null     
	//   23   46:invokevirtual   #49  <Method void View.setLayerType(int, android.graphics.Paint)>
		super.onAnimationEnd(animation);
	//*  24   49:goto            34
	}

	View mView;

	FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View view, android.view.animation.Animation.AnimationListener animationlistener)
	{
		super(animationlistener, ((FragmentManagerImpl._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener, FragmentManagerImpl$1)>
		mView = view;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #18  <Field View mView>
	//    7   11:return          
	}
}
