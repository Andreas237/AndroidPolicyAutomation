// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.lifecycle.Observer;

// Referenced classes of package androidx.work.impl:
//			WorkManagerLiveDataTracker

class WorkManagerLiveDataTracker$TrackedLiveData$1
	implements Observer
{

	public void onChanged(Object obj)
	{
		setValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WorkManagerLiveDataTracker$TrackedLiveData this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method void WorkManagerLiveDataTracker$TrackedLiveData.setValue(Object)>
	//    4    8:return          
	}

	final WorkManagerLiveDataTracker.TrackedLiveData this$0;

	WorkManagerLiveDataTracker$TrackedLiveData$1()
	{
		this$0 = WorkManagerLiveDataTracker.TrackedLiveData.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field WorkManagerLiveDataTracker$TrackedLiveData this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
