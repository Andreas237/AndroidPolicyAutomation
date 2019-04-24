// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener

class ForwardingListener$2
	implements android.view.obalLayoutListener
{

	public void onGlobalLayout()
	{
		boolean flag = mIsAttached;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean mIsAttached>
	//    2    4:istore_1        
		mIsAttached = ViewCompat.isAttachedToWindow(mSrc);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field ForwardingListener this$0>
	//    6   10:getfield        #26  <Field android.view.View ForwardingListener.mSrc>
	//    7   13:invokestatic    #32  <Method boolean ViewCompat.isAttachedToWindow(android.view.View)>
	//    8   16:putfield        #34  <Field boolean mIsAttached>
		if(flag && !mIsAttached)
	//*   9   19:iload_1         
	//*  10   20:ifeq            37
	//*  11   23:aload_0         
	//*  12   24:getfield        #34  <Field boolean mIsAttached>
	//*  13   27:ifne            37
			ForwardingListener.access$000(ForwardingListener.this);
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field ForwardingListener this$0>
	//   16   34:invokestatic    #39  <Method void ForwardingListener.access$000(ForwardingListener)>
	//   17   37:return          
	}

	boolean mIsAttached;
	final ForwardingListener this$0;

	ForwardingListener$2()
	{
		this$0 = ForwardingListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ForwardingListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mIsAttached = ViewCompat.isAttachedToWindow(mSrc);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field ForwardingListener this$0>
	//    8   14:getfield        #26  <Field android.view.View ForwardingListener.mSrc>
	//    9   17:invokestatic    #32  <Method boolean ViewCompat.isAttachedToWindow(android.view.View)>
	//   10   20:putfield        #34  <Field boolean mIsAttached>
	//   11   23:return          
	}
}
