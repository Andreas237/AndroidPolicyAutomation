// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl

class FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1
	implements Runnable
{

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

	FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1()
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
