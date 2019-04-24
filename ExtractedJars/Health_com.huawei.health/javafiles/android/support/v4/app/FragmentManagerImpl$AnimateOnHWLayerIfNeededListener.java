// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.support.v4.os.BuildCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl

static class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener
	implements android.view.animation.Animation.AnimationListener
{

	public void onAnimationEnd(Animation animation)
	{
		if(mView != null && mShouldRunOnHWLayer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field View mView>
	//*   2    4:ifnull          58
	//*   3    7:aload_0         
	//*   4    8:getfield        #30  <Field boolean mShouldRunOnHWLayer>
	//*   5   11:ifeq            58
			if(ViewCompat.isAttachedToWindow(mView) || BuildCompat.isAtLeastN())
	//*   6   14:aload_0         
	//*   7   15:getfield        #24  <Field View mView>
	//*   8   18:invokestatic    #39  <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*   9   21:ifne            30
	//*  10   24:invokestatic    #45  <Method boolean BuildCompat.isAtLeastN()>
	//*  11   27:ifeq            49
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
	//   12   30:aload_0         
	//   13   31:getfield        #24  <Field View mView>
	//   14   34:new             #11  <Class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1>
	//   15   37:dup             
	//   16   38:aload_0         
	//   17   39:invokespecial   #48  <Method void FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1(FragmentManagerImpl$AnimateOnHWLayerIfNeededListener)>
	//   18   42:invokevirtual   #54  <Method boolean View.post(Runnable)>
	//   19   45:pop             
			else
	//*  20   46:goto            58
				mView.setLayerType(0, ((android.graphics.Paint) (null)));
	//   21   49:aload_0         
	//   22   50:getfield        #24  <Field View mView>
	//   23   53:iconst_0        
	//   24   54:aconst_null     
	//   25   55:invokevirtual   #58  <Method void View.setLayerType(int, android.graphics.Paint)>
		if(mOriginalListener != null)
	//*  26   58:aload_0         
	//*  27   59:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
	//*  28   62:ifnull          75
			mOriginalListener.onAnimationEnd(animation);
	//   29   65:aload_0         
	//   30   66:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
	//   31   69:aload_1         
	//   32   70:invokeinterface #60  <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(Animation)>
	//   33   75:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
		if(mOriginalListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
	//*   2    4:ifnull          17
			mOriginalListener.onAnimationRepeat(animation);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #64  <Method void android.view.animation.Animation$AnimationListener.onAnimationRepeat(Animation)>
	//    7   17:return          
	}

	public void onAnimationStart(Animation animation)
	{
		if(mOriginalListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
	//*   2    4:ifnull          17
			mOriginalListener.onAnimationStart(animation);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #67  <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(Animation)>
	//    7   17:return          
	}

	private android.view.animation.Animation.AnimationListener mOriginalListener;
	private boolean mShouldRunOnHWLayer;
	View mView;

	public FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View view, Animation animation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		if(view == null || animation == null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          12
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       13
		{
			return;
	//    6   12:return          
		} else
		{
			mView = view;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #24  <Field View mView>
			return;
	//   10   18:return          
		}
	}

	public FragmentManagerImpl$AnimateOnHWLayerIfNeededListener(View view, Animation animation, android.view.animation.Animation.AnimationListener animationlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		if(view == null || animation == null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          12
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       13
		{
			return;
	//    6   12:return          
		} else
		{
			mOriginalListener = animationlistener;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #28  <Field android.view.animation.Animation$AnimationListener mOriginalListener>
			mView = view;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #24  <Field View mView>
			mShouldRunOnHWLayer = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #30  <Field boolean mShouldRunOnHWLayer>
			return;
	//   16   28:return          
		}
	}
}
