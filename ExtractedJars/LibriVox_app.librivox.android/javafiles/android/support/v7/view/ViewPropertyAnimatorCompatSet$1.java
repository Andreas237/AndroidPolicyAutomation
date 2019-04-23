// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.support.v4.view.ay;
import android.support.v4.view.az;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view:
//			ViewPropertyAnimatorCompatSet

class ViewPropertyAnimatorCompatSet$1 extends az
{

	public void onAnimationEnd(View view)
	{
		int i = mProxyEndCount + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int mProxyEndCount>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_2        
		mProxyEndCount = i;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #21  <Field int mProxyEndCount>
		if(i == mAnimators.size())
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #14  <Field ViewPropertyAnimatorCompatSet this$0>
	//*  11   17:getfield        #30  <Field ArrayList ViewPropertyAnimatorCompatSet.mAnimators>
	//*  12   20:invokevirtual   #36  <Method int ArrayList.size()>
	//*  13   23:icmpne          53
		{
			if(mListener != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #14  <Field ViewPropertyAnimatorCompatSet this$0>
	//*  16   30:getfield        #40  <Field ay ViewPropertyAnimatorCompatSet.mListener>
	//*  17   33:ifnull          49
				mListener.onAnimationEnd(((View) (null)));
	//   18   36:aload_0         
	//   19   37:getfield        #14  <Field ViewPropertyAnimatorCompatSet this$0>
	//   20   40:getfield        #40  <Field ay ViewPropertyAnimatorCompatSet.mListener>
	//   21   43:aconst_null     
	//   22   44:invokeinterface #44  <Method void ay.onAnimationEnd(View)>
			onEnd();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #47  <Method void onEnd()>
		}
	//   25   53:return          
	}

	public void onAnimationStart(View view)
	{
		if(mProxyStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean mProxyStarted>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mProxyStarted = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #19  <Field boolean mProxyStarted>
		if(mListener != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #14  <Field ViewPropertyAnimatorCompatSet this$0>
	//*   9   17:getfield        #40  <Field ay ViewPropertyAnimatorCompatSet.mListener>
	//*  10   20:ifnull          36
			mListener.onAnimationStart(((View) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #14  <Field ViewPropertyAnimatorCompatSet this$0>
	//   13   27:getfield        #40  <Field ay ViewPropertyAnimatorCompatSet.mListener>
	//   14   30:aconst_null     
	//   15   31:invokeinterface #50  <Method void ay.onAnimationStart(View)>
	//   16   36:return          
	}

	void onEnd()
	{
		mProxyEndCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #21  <Field int mProxyEndCount>
		mProxyStarted = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #19  <Field boolean mProxyStarted>
		onAnimationsEnded();
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field ViewPropertyAnimatorCompatSet this$0>
	//    8   14:invokevirtual   #53  <Method void ViewPropertyAnimatorCompatSet.onAnimationsEnded()>
	//    9   17:return          
	}

	private int mProxyEndCount;
	private boolean mProxyStarted;
	final ViewPropertyAnimatorCompatSet this$0;

	ViewPropertyAnimatorCompatSet$1()
	{
		this$0 = ViewPropertyAnimatorCompatSet.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ViewPropertyAnimatorCompatSet this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void az()>
		mProxyStarted = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field boolean mProxyStarted>
		mProxyEndCount = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #21  <Field int mProxyEndCount>
	//   11   19:return          
	}
}
