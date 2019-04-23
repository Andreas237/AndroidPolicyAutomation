// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.lifecycle.*;

// Referenced classes of package androidx.work.impl:
//			WorkManagerLiveDataTracker

static class WorkManagerLiveDataTracker$TrackedLiveData extends MediatorLiveData
{

	protected void onActive()
	{
		super.onActive();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void MediatorLiveData.onActive()>
		mContainer.onActive(((LiveData) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field WorkManagerLiveDataTracker mContainer>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #35  <Method void WorkManagerLiveDataTracker.onActive(LiveData)>
	//    6   12:return          
	}

	protected void onInactive()
	{
		super.onInactive();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void MediatorLiveData.onInactive()>
		mContainer.onInactive(((LiveData) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field WorkManagerLiveDataTracker mContainer>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #40  <Method void WorkManagerLiveDataTracker.onInactive(LiveData)>
	//    6   12:return          
	}

	private final WorkManagerLiveDataTracker mContainer;

	WorkManagerLiveDataTracker$TrackedLiveData(WorkManagerLiveDataTracker workmanagerlivedatatracker, LiveData livedata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void MediatorLiveData()>
		mContainer = workmanagerlivedatatracker;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field WorkManagerLiveDataTracker mContainer>
		addSource(livedata, new Observer() {

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
);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:new             #10  <Class WorkManagerLiveDataTracker$TrackedLiveData$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #22  <Method void WorkManagerLiveDataTracker$TrackedLiveData$1(WorkManagerLiveDataTracker$TrackedLiveData)>
	//   11   19:invokevirtual   #26  <Method void addSource(LiveData, Observer)>
	//   12   22:return          
	}
}
