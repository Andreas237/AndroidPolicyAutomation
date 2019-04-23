// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			Observer, MediatorLiveData, LiveData

private static class MediatorLiveData$Source
	implements Observer
{

	public void onChanged(Object obj)
	{
		if(mVersion != mLiveData.getVersion())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int mVersion>
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field LiveData mLiveData>
	//*   4    8:invokevirtual   #41  <Method int LiveData.getVersion()>
	//*   5   11:icmpeq          35
		{
			mVersion = mLiveData.getVersion();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field LiveData mLiveData>
	//    9   19:invokevirtual   #41  <Method int LiveData.getVersion()>
	//   10   22:putfield        #25  <Field int mVersion>
			mObserver.onChanged(obj);
	//   11   25:aload_0         
	//   12   26:getfield        #29  <Field Observer mObserver>
	//   13   29:aload_1         
	//   14   30:invokeinterface #43  <Method void Observer.onChanged(Object)>
		}
	//   15   35:return          
	}

	void plug()
	{
		mLiveData.observeForever(((Observer) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LiveData mLiveData>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #50  <Method void LiveData.observeForever(Observer)>
	//    4    8:return          
	}

	void unplug()
	{
		mLiveData.removeObserver(((Observer) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LiveData mLiveData>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #54  <Method void LiveData.removeObserver(Observer)>
	//    4    8:return          
	}

	final LiveData mLiveData;
	final Observer mObserver;
	int mVersion;

	MediatorLiveData$Source(LiveData livedata, Observer observer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mVersion = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #25  <Field int mVersion>
		mLiveData = livedata;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #27  <Field LiveData mLiveData>
		mObserver = observer;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #29  <Field Observer mObserver>
	//   11   19:return          
	}
}
