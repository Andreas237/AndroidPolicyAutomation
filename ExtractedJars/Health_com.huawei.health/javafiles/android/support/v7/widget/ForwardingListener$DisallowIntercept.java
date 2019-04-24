// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener

class ForwardingListener$DisallowIntercept
	implements Runnable
{

	public void run()
	{
		ViewParent viewparent = mSrc.getParent();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ForwardingListener this$0>
	//    2    4:getfield        #24  <Field View ForwardingListener.mSrc>
	//    3    7:invokevirtual   #30  <Method ViewParent View.getParent()>
	//    4   10:astore_1        
		if(viewparent != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			viewparent.requestDisallowInterceptTouchEvent(true);
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokeinterface #36  <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//   10   22:return          
	}

	final ForwardingListener this$0;

	ForwardingListener$DisallowIntercept()
	{
		this$0 = ForwardingListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ForwardingListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
