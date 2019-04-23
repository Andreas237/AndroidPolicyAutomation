// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.lifecycle.*;
import java.util.*;

class WorkManagerLiveDataTracker
{
	static class TrackedLiveData extends MediatorLiveData
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

		TrackedLiveData(WorkManagerLiveDataTracker workmanagerlivedatatracker, LiveData livedata)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void MediatorLiveData()>
			mContainer = workmanagerlivedatatracker;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field WorkManagerLiveDataTracker mContainer>
			addSource(livedata, new _cls1());
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


	WorkManagerLiveDataTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class IdentityHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void IdentityHashMap()>
	//    6   12:invokestatic    #26  <Method Set Collections.newSetFromMap(java.util.Map)>
	//    7   15:putfield        #28  <Field Set mLiveDataSet>
	//    8   18:return          
	}

	void onActive(LiveData livedata)
	{
		mLiveDataSet.add(((Object) (livedata)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Set mLiveDataSet>
	//    2    4:aload_1         
	//    3    5:invokeinterface #37  <Method boolean Set.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	void onInactive(LiveData livedata)
	{
		mLiveDataSet.remove(((Object) (livedata)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Set mLiveDataSet>
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public LiveData track(LiveData livedata)
	{
		return ((LiveData) (new TrackedLiveData(this, livedata)));
	//    0    0:new             #6   <Class WorkManagerLiveDataTracker$TrackedLiveData>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #46  <Method void WorkManagerLiveDataTracker$TrackedLiveData(WorkManagerLiveDataTracker, LiveData)>
	//    5    9:areturn         
	}

	final Set mLiveDataSet = Collections.newSetFromMap(((java.util.Map) (new IdentityHashMap())));

	// Unreferenced inner class androidx/work/impl/WorkManagerLiveDataTracker$TrackedLiveData$1

/* anonymous class */
	class TrackedLiveData._cls1
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

		final TrackedLiveData this$0;

			
			{
				this$0 = TrackedLiveData.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field WorkManagerLiveDataTracker$TrackedLiveData this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
	}

}
