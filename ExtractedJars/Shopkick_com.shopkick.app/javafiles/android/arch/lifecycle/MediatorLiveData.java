// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.arch.core.internal.SafeIterableMap;
import java.util.Iterator;

// Referenced classes of package android.arch.lifecycle:
//			MutableLiveData, LiveData, Observer

public class MediatorLiveData extends MutableLiveData
{
	private static class Source
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

		Source(LiveData livedata, Observer observer)
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


	public MediatorLiveData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void MutableLiveData()>
		mSources = new SafeIterableMap();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class SafeIterableMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void SafeIterableMap()>
	//    6   12:putfield        #20  <Field SafeIterableMap mSources>
	//    7   15:return          
	}

	public void addSource(LiveData livedata, Observer observer)
	{
		Source source = new Source(livedata, observer);
	//    0    0:new             #7   <Class MediatorLiveData$Source>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #27  <Method void MediatorLiveData$Source(LiveData, Observer)>
	//    5    9:astore_3        
		livedata = ((LiveData) ((Source)mSources.putIfAbsent(((Object) (livedata)), ((Object) (source)))));
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field SafeIterableMap mSources>
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #31  <Method Object SafeIterableMap.putIfAbsent(Object, Object)>
	//   11   19:checkcast       #7   <Class MediatorLiveData$Source>
	//   12   22:astore_1        
		if(livedata != null && ((Source) (livedata)).mObserver != observer)
	//*  13   23:aload_1         
	//*  14   24:ifnull          48
	//*  15   27:aload_1         
	//*  16   28:getfield        #35  <Field Observer MediatorLiveData$Source.mObserver>
	//*  17   31:aload_2         
	//*  18   32:if_acmpne       38
	//*  19   35:goto            48
			throw new IllegalArgumentException("This source was already added with the different observer");
	//   20   38:new             #37  <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:ldc1            #39  <String "This source was already added with the different observer">
	//   23   44:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   24   47:athrow          
		if(livedata != null)
	//*  25   48:aload_1         
	//*  26   49:ifnull          53
			return;
	//   27   52:return          
		if(hasActiveObservers())
	//*  28   53:aload_0         
	//*  29   54:invokevirtual   #46  <Method boolean hasActiveObservers()>
	//*  30   57:ifeq            64
			source.plug();
	//   31   60:aload_3         
	//   32   61:invokevirtual   #49  <Method void MediatorLiveData$Source.plug()>
	//   33   64:return          
	}

	protected void onActive()
	{
		for(Iterator iterator = mSources.iterator(); iterator.hasNext(); ((Source)((java.util.Map.Entry)iterator.next()).getValue()).plug());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SafeIterableMap mSources>
	//    2    4:invokevirtual   #59  <Method Iterator SafeIterableMap.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            40
	//    7   17:aload_1         
	//    8   18:invokeinterface #68  <Method Object Iterator.next()>
	//    9   23:checkcast       #70  <Class java.util.Map$Entry>
	//   10   26:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   11   31:checkcast       #7   <Class MediatorLiveData$Source>
	//   12   34:invokevirtual   #49  <Method void MediatorLiveData$Source.plug()>
	//*  13   37:goto            8
	//   14   40:return          
	}

	protected void onInactive()
	{
		for(Iterator iterator = mSources.iterator(); iterator.hasNext(); ((Source)((java.util.Map.Entry)iterator.next()).getValue()).unplug());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SafeIterableMap mSources>
	//    2    4:invokevirtual   #59  <Method Iterator SafeIterableMap.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            40
	//    7   17:aload_1         
	//    8   18:invokeinterface #68  <Method Object Iterator.next()>
	//    9   23:checkcast       #70  <Class java.util.Map$Entry>
	//   10   26:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   11   31:checkcast       #7   <Class MediatorLiveData$Source>
	//   12   34:invokevirtual   #77  <Method void MediatorLiveData$Source.unplug()>
	//*  13   37:goto            8
	//   14   40:return          
	}

	public void removeSource(LiveData livedata)
	{
		livedata = ((LiveData) ((Source)mSources.remove(((Object) (livedata)))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SafeIterableMap mSources>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method Object SafeIterableMap.remove(Object)>
	//    4    8:checkcast       #7   <Class MediatorLiveData$Source>
	//    5   11:astore_1        
		if(livedata != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          20
			((Source) (livedata)).unplug();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #77  <Method void MediatorLiveData$Source.unplug()>
	//   10   20:return          
	}

	private SafeIterableMap mSources;
}
