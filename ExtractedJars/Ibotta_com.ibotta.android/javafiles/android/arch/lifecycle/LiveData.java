// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.arch.core.executor.ArchTaskExecutor;
import android.arch.core.internal.SafeIterableMap;
import java.util.Iterator;

// Referenced classes of package android.arch.lifecycle:
//			Observer, LifecycleOwner, Lifecycle, GenericLifecycleObserver

public abstract class LiveData
{
	private class AlwaysActiveObserver extends ObserverWrapper
	{

		boolean shouldBeActive()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		final LiveData this$0;

		AlwaysActiveObserver(Observer observer)
		{
			this$0 = LiveData.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field LiveData this$0>
			super(observer);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokespecial   #16  <Method void LiveData$ObserverWrapper(LiveData, Observer)>
		//    7   11:return          
		}
	}

	class LifecycleBoundObserver extends ObserverWrapper
		implements GenericLifecycleObserver
	{

		void detachObserver()
		{
			mOwner.getLifecycle().removeObserver(((LifecycleObserver) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LifecycleOwner mOwner>
		//    2    4:invokeinterface #36  <Method Lifecycle LifecycleOwner.getLifecycle()>
		//    3    9:aload_0         
		//    4   10:invokevirtual   #42  <Method void Lifecycle.removeObserver(LifecycleObserver)>
		//    5   13:return          
		}

		boolean isAttachedTo(LifecycleOwner lifecycleowner)
		{
			return mOwner == lifecycleowner;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LifecycleOwner mOwner>
		//    2    4:aload_1         
		//    3    5:if_acmpne       10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public void onStateChanged(LifecycleOwner lifecycleowner, Lifecycle.Event event)
		{
			if(mOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field LifecycleOwner mOwner>
		//*   2    4:invokeinterface #36  <Method Lifecycle LifecycleOwner.getLifecycle()>
		//*   3    9:invokevirtual   #50  <Method Lifecycle$State Lifecycle.getCurrentState()>
		//*   4   12:getstatic       #56  <Field Lifecycle$State Lifecycle$State.DESTROYED>
		//*   5   15:if_acmpne       30
			{
				removeObserver(mObserver);
		//    6   18:aload_0         
		//    7   19:getfield        #19  <Field LiveData this$0>
		//    8   22:aload_0         
		//    9   23:getfield        #60  <Field Observer mObserver>
		//   10   26:invokevirtual   #63  <Method void LiveData.removeObserver(Observer)>
				return;
		//   11   29:return          
			} else
			{
				activeStateChanged(shouldBeActive());
		//   12   30:aload_0         
		//   13   31:aload_0         
		//   14   32:invokevirtual   #67  <Method boolean shouldBeActive()>
		//   15   35:invokevirtual   #71  <Method void activeStateChanged(boolean)>
				return;
		//   16   38:return          
			}
		}

		boolean shouldBeActive()
		{
			return mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field LifecycleOwner mOwner>
		//    2    4:invokeinterface #36  <Method Lifecycle LifecycleOwner.getLifecycle()>
		//    3    9:invokevirtual   #50  <Method Lifecycle$State Lifecycle.getCurrentState()>
		//    4   12:getstatic       #74  <Field Lifecycle$State Lifecycle$State.STARTED>
		//    5   15:invokevirtual   #78  <Method boolean Lifecycle$State.isAtLeast(Lifecycle$State)>
		//    6   18:ireturn         
		}

		final LifecycleOwner mOwner;
		final LiveData this$0;

		LifecycleBoundObserver(LifecycleOwner lifecycleowner, Observer observer)
		{
			this$0 = LiveData.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field LiveData this$0>
			super(observer);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_3         
		//    6    8:invokespecial   #22  <Method void LiveData$ObserverWrapper(LiveData, Observer)>
			mOwner = lifecycleowner;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #24  <Field LifecycleOwner mOwner>
		//   10   16:return          
		}
	}

	private abstract class ObserverWrapper
	{

		void activeStateChanged(boolean flag)
		{
			if(flag == mActive)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #34  <Field boolean mActive>
		//*   3    5:icmpne          9
				return;
		//    4    8:return          
			mActive = flag;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #34  <Field boolean mActive>
			int i = mActiveCount;
		//    8   14:aload_0         
		//    9   15:getfield        #20  <Field LiveData this$0>
		//   10   18:invokestatic    #38  <Method int LiveData.access$300(LiveData)>
		//   11   21:istore_2        
			byte byte0 = 1;
		//   12   22:iconst_1        
		//   13   23:istore_3        
			if(i == 0)
		//*  14   24:iload_2         
		//*  15   25:ifne            33
				i = 1;
		//   16   28:iconst_1        
		//   17   29:istore_2        
			else
		//*  18   30:goto            35
				i = 0;
		//   19   33:iconst_0        
		//   20   34:istore_2        
			LiveData livedata = LiveData.this;
		//   21   35:aload_0         
		//   22   36:getfield        #20  <Field LiveData this$0>
		//   23   39:astore          5
			int j = livedata.mActiveCount;
		//   24   41:aload           5
		//   25   43:invokestatic    #38  <Method int LiveData.access$300(LiveData)>
		//   26   46:istore          4
			if(!mActive)
		//*  27   48:aload_0         
		//*  28   49:getfield        #34  <Field boolean mActive>
		//*  29   52:ifeq            58
		//*  30   55:goto            60
				byte0 = -1;
		//   31   58:iconst_m1       
		//   32   59:istore_3        
			livedata.mActiveCount = j + byte0;
		//   33   60:aload           5
		//   34   62:iload           4
		//   35   64:iload_3         
		//   36   65:iadd            
		//   37   66:invokestatic    #42  <Method int LiveData.access$302(LiveData, int)>
		//   38   69:pop             
			if(i && mActive)
		//*  39   70:iload_2         
		//*  40   71:ifeq            88
		//*  41   74:aload_0         
		//*  42   75:getfield        #34  <Field boolean mActive>
		//*  43   78:ifeq            88
				onActive();
		//   44   81:aload_0         
		//   45   82:getfield        #20  <Field LiveData this$0>
		//   46   85:invokevirtual   #45  <Method void LiveData.onActive()>
			if(mActiveCount == 0 && !mActive)
		//*  47   88:aload_0         
		//*  48   89:getfield        #20  <Field LiveData this$0>
		//*  49   92:invokestatic    #38  <Method int LiveData.access$300(LiveData)>
		//*  50   95:ifne            112
		//*  51   98:aload_0         
		//*  52   99:getfield        #34  <Field boolean mActive>
		//*  53  102:ifne            112
				onInactive();
		//   54  105:aload_0         
		//   55  106:getfield        #20  <Field LiveData this$0>
		//   56  109:invokevirtual   #48  <Method void LiveData.onInactive()>
			if(mActive)
		//*  57  112:aload_0         
		//*  58  113:getfield        #34  <Field boolean mActive>
		//*  59  116:ifeq            127
				dispatchingValue(this);
		//   60  119:aload_0         
		//   61  120:getfield        #20  <Field LiveData this$0>
		//   62  123:aload_0         
		//   63  124:invokestatic    #52  <Method void LiveData.access$400(LiveData, LiveData$ObserverWrapper)>
		//   64  127:return          
		}

		void detachObserver()
		{
		//    0    0:return          
		}

		boolean isAttachedTo(LifecycleOwner lifecycleowner)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		abstract boolean shouldBeActive();

		boolean mActive;
		int mLastVersion;
		final Observer mObserver;
		final LiveData this$0;

		ObserverWrapper(Observer observer)
		{
			this$0 = LiveData.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field LiveData this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			mLastVersion = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #25  <Field int mLastVersion>
			mObserver = observer;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #27  <Field Observer mObserver>
		//   11   19:return          
		}
	}


	public LiveData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void Object()>
	//    6   12:putfield        #42  <Field Object mDataLock>
		mObservers = new SafeIterableMap();
	//    7   15:aload_0         
	//    8   16:new             #44  <Class SafeIterableMap>
	//    9   19:dup             
	//   10   20:invokespecial   #45  <Method void SafeIterableMap()>
	//   11   23:putfield        #47  <Field SafeIterableMap mObservers>
		mActiveCount = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #49  <Field int mActiveCount>
		Object obj = NOT_SET;
	//   15   31:getstatic       #39  <Field Object NOT_SET>
	//   16   34:astore_1        
		mData = obj;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #51  <Field Object mData>
		mPendingData = obj;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:putfield        #53  <Field Object mPendingData>
		mVersion = -1;
	//   23   45:aload_0         
	//   24   46:iconst_m1       
	//   25   47:putfield        #55  <Field int mVersion>
	//   26   50:aload_0         
	//   27   51:new             #7   <Class LiveData$1>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:invokespecial   #58  <Method void LiveData$1(LiveData)>
	//   31   59:putfield        #60  <Field Runnable mPostValueRunnable>
	//   32   62:return          
	}

	private static void assertMainThread(String s)
	{
		if(ArchTaskExecutor.getInstance().isMainThread())
	//*   0    0:invokestatic    #85  <Method ArchTaskExecutor ArchTaskExecutor.getInstance()>
	//*   1    3:invokevirtual   #89  <Method boolean ArchTaskExecutor.isMainThread()>
	//*   2    6:ifeq            10
		{
			return;
	//    3    9:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #91  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #92  <Method void StringBuilder()>
	//    7   17:astore_1        
			stringbuilder.append("Cannot invoke ");
	//    8   18:aload_1         
	//    9   19:ldc1            #94  <String "Cannot invoke ">
	//   10   21:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			stringbuilder.append(s);
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(" on a background");
	//   16   31:aload_1         
	//   17   32:ldc1            #100 <String " on a background">
	//   18   34:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" thread");
	//   20   38:aload_1         
	//   21   39:ldc1            #102 <String " thread">
	//   22   41:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   24   45:new             #104 <Class IllegalStateException>
	//   25   48:dup             
	//   26   49:aload_1         
	//   27   50:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #110 <Method void IllegalStateException(String)>
	//   29   56:athrow          
		}
	}

	private void considerNotify(ObserverWrapper observerwrapper)
	{
		if(!observerwrapper.mActive)
	//*   0    0:aload_1         
	//*   1    1:getfield        #114 <Field boolean LiveData$ObserverWrapper.mActive>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!observerwrapper.shouldBeActive())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #117 <Method boolean LiveData$ObserverWrapper.shouldBeActive()>
	//*   6   12:ifne            21
		{
			observerwrapper.activeStateChanged(false);
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #121 <Method void LiveData$ObserverWrapper.activeStateChanged(boolean)>
			return;
	//   10   20:return          
		}
		int i = observerwrapper.mLastVersion;
	//   11   21:aload_1         
	//   12   22:getfield        #124 <Field int LiveData$ObserverWrapper.mLastVersion>
	//   13   25:istore_2        
		int j = mVersion;
	//   14   26:aload_0         
	//   15   27:getfield        #55  <Field int mVersion>
	//   16   30:istore_3        
		if(i >= j)
	//*  17   31:iload_2         
	//*  18   32:iload_3         
	//*  19   33:icmplt          37
		{
			return;
	//   20   36:return          
		} else
		{
			observerwrapper.mLastVersion = j;
	//   21   37:aload_1         
	//   22   38:iload_3         
	//   23   39:putfield        #124 <Field int LiveData$ObserverWrapper.mLastVersion>
			observerwrapper.mObserver.onChanged(mData);
	//   24   42:aload_1         
	//   25   43:getfield        #128 <Field Observer LiveData$ObserverWrapper.mObserver>
	//   26   46:aload_0         
	//   27   47:getfield        #51  <Field Object mData>
	//   28   50:invokeinterface #134 <Method void Observer.onChanged(Object)>
			return;
	//   29   55:return          
		}
	}

	private void dispatchingValue(ObserverWrapper observerwrapper)
	{
		if(mDispatchingValue)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean mDispatchingValue>
	//*   2    4:ifeq            13
		{
			mDispatchInvalidated = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #141 <Field boolean mDispatchInvalidated>
			return;
	//    6   12:return          
		}
		mDispatchingValue = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #139 <Field boolean mDispatchingValue>
		do
		{
			ObserverWrapper observerwrapper1;
label0:
			{
				mDispatchInvalidated = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #141 <Field boolean mDispatchInvalidated>
				if(observerwrapper != null)
	//*  13   23:aload_1         
	//*  14   24:ifnull          37
				{
					considerNotify(observerwrapper);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #143 <Method void considerNotify(LiveData$ObserverWrapper)>
					observerwrapper1 = null;
	//   18   32:aconst_null     
	//   19   33:astore_2        
					break label0;
	//   20   34:goto            86
				}
				android.arch.core.internal.SafeIterableMap.IteratorWithAdditions iteratorwithadditions = mObservers.iteratorWithAdditions();
	//   21   37:aload_0         
	//   22   38:getfield        #47  <Field SafeIterableMap mObservers>
	//   23   41:invokevirtual   #147 <Method android.arch.core.internal.SafeIterableMap$IteratorWithAdditions SafeIterableMap.iteratorWithAdditions()>
	//   24   44:astore_3        
				do
				{
					observerwrapper1 = observerwrapper;
	//   25   45:aload_1         
	//   26   46:astore_2        
					if(!((Iterator) (iteratorwithadditions)).hasNext())
						break label0;
	//   27   47:aload_3         
	//   28   48:invokeinterface #152 <Method boolean Iterator.hasNext()>
	//   29   53:ifeq            86
					considerNotify((ObserverWrapper)((java.util.Map.Entry)((Iterator) (iteratorwithadditions)).next()).getValue());
	//   30   56:aload_0         
	//   31   57:aload_3         
	//   32   58:invokeinterface #155 <Method Object Iterator.next()>
	//   33   63:checkcast       #157 <Class java.util.Map$Entry>
	//   34   66:invokeinterface #160 <Method Object java.util.Map$Entry.getValue()>
	//   35   71:checkcast       #15  <Class LiveData$ObserverWrapper>
	//   36   74:invokespecial   #143 <Method void considerNotify(LiveData$ObserverWrapper)>
				} while(!mDispatchInvalidated);
	//   37   77:aload_0         
	//   38   78:getfield        #141 <Field boolean mDispatchInvalidated>
	//   39   81:ifeq            45
				observerwrapper1 = observerwrapper;
	//   40   84:aload_1         
	//   41   85:astore_2        
			}
			observerwrapper = observerwrapper1;
	//   42   86:aload_2         
	//   43   87:astore_1        
			if(!mDispatchInvalidated)
	//*  44   88:aload_0         
	//*  45   89:getfield        #141 <Field boolean mDispatchInvalidated>
	//*  46   92:ifne            18
			{
				mDispatchingValue = false;
	//   47   95:aload_0         
	//   48   96:iconst_0        
	//   49   97:putfield        #139 <Field boolean mDispatchingValue>
				return;
	//   50  100:return          
			}
		} while(true);
	}

	public Object getValue()
	{
		Object obj = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object mData>
	//    2    4:astore_1        
		if(obj != NOT_SET)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #39  <Field Object NOT_SET>
	//*   5    9:if_acmpeq       14
			return obj;
	//    6   12:aload_1         
	//    7   13:areturn         
		else
			return ((Object) (null));
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public boolean hasActiveObservers()
	{
		return mActiveCount > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mActiveCount>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void observe(LifecycleOwner lifecycleowner, Observer observer)
	{
		if(lifecycleowner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #174 <Method Lifecycle LifecycleOwner.getLifecycle()>
	//*   2    6:invokevirtual   #180 <Method Lifecycle$State Lifecycle.getCurrentState()>
	//*   3    9:getstatic       #186 <Field Lifecycle$State Lifecycle$State.DESTROYED>
	//*   4   12:if_acmpne       16
			return;
	//    5   15:return          
		LifecycleBoundObserver lifecycleboundobserver = new LifecycleBoundObserver(lifecycleowner, observer);
	//    6   16:new             #12  <Class LiveData$LifecycleBoundObserver>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:invokespecial   #189 <Method void LiveData$LifecycleBoundObserver(LiveData, LifecycleOwner, Observer)>
	//   12   26:astore_3        
		observer = ((Observer) ((ObserverWrapper)mObservers.putIfAbsent(((Object) (observer)), ((Object) (lifecycleboundobserver)))));
	//   13   27:aload_0         
	//   14   28:getfield        #47  <Field SafeIterableMap mObservers>
	//   15   31:aload_2         
	//   16   32:aload_3         
	//   17   33:invokevirtual   #193 <Method Object SafeIterableMap.putIfAbsent(Object, Object)>
	//   18   36:checkcast       #15  <Class LiveData$ObserverWrapper>
	//   19   39:astore_2        
		if(observer != null && !((ObserverWrapper) (observer)).isAttachedTo(lifecycleowner))
	//*  20   40:aload_2         
	//*  21   41:ifnull          65
	//*  22   44:aload_2         
	//*  23   45:aload_1         
	//*  24   46:invokevirtual   #197 <Method boolean LiveData$ObserverWrapper.isAttachedTo(LifecycleOwner)>
	//*  25   49:ifeq            55
	//*  26   52:goto            65
			throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
	//   27   55:new             #199 <Class IllegalArgumentException>
	//   28   58:dup             
	//   29   59:ldc1            #201 <String "Cannot add the same observer with different lifecycles">
	//   30   61:invokespecial   #202 <Method void IllegalArgumentException(String)>
	//   31   64:athrow          
		if(observer != null)
	//*  32   65:aload_2         
	//*  33   66:ifnull          70
		{
			return;
	//   34   69:return          
		} else
		{
			lifecycleowner.getLifecycle().addObserver(((LifecycleObserver) (lifecycleboundobserver)));
	//   35   70:aload_1         
	//   36   71:invokeinterface #174 <Method Lifecycle LifecycleOwner.getLifecycle()>
	//   37   76:aload_3         
	//   38   77:invokevirtual   #206 <Method void Lifecycle.addObserver(LifecycleObserver)>
			return;
	//   39   80:return          
		}
	}

	public void observeForever(Observer observer)
	{
		AlwaysActiveObserver alwaysactiveobserver = new AlwaysActiveObserver(observer);
	//    0    0:new             #9   <Class LiveData$AlwaysActiveObserver>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #212 <Method void LiveData$AlwaysActiveObserver(LiveData, Observer)>
	//    5    9:astore_2        
		observer = ((Observer) ((ObserverWrapper)mObservers.putIfAbsent(((Object) (observer)), ((Object) (alwaysactiveobserver)))));
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field SafeIterableMap mObservers>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #193 <Method Object SafeIterableMap.putIfAbsent(Object, Object)>
	//   11   19:checkcast       #15  <Class LiveData$ObserverWrapper>
	//   12   22:astore_1        
		if(observer != null && (observer instanceof LifecycleBoundObserver))
	//*  13   23:aload_1         
	//*  14   24:ifnull          47
	//*  15   27:aload_1         
	//*  16   28:instanceof      #12  <Class LiveData$LifecycleBoundObserver>
	//*  17   31:ifne            37
	//*  18   34:goto            47
			throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
	//   19   37:new             #199 <Class IllegalArgumentException>
	//   20   40:dup             
	//   21   41:ldc1            #201 <String "Cannot add the same observer with different lifecycles">
	//   22   43:invokespecial   #202 <Method void IllegalArgumentException(String)>
	//   23   46:athrow          
		if(observer != null)
	//*  24   47:aload_1         
	//*  25   48:ifnull          52
		{
			return;
	//   26   51:return          
		} else
		{
			alwaysactiveobserver.activeStateChanged(true);
	//   27   52:aload_2         
	//   28   53:iconst_1        
	//   29   54:invokevirtual   #213 <Method void LiveData$AlwaysActiveObserver.activeStateChanged(boolean)>
			return;
	//   30   57:return          
		}
	}

	protected void onActive()
	{
	//    0    0:return          
	}

	protected void onInactive()
	{
	//    0    0:return          
	}

	protected void postValue(Object obj)
	{
		Object obj1 = mDataLock;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object mDataLock>
	//    2    4:astore_3        
		obj1;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if(mPendingData == NOT_SET)
	//*   5    7:aload_0         
	//*   6    8:getfield        #53  <Field Object mPendingData>
	//*   7   11:getstatic       #39  <Field Object NOT_SET>
	//*   8   14:if_acmpne       50
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            22
	//*  12   22:aload_0         
	//*  13   23:aload_1         
	//*  14   24:putfield        #53  <Field Object mPendingData>
	//*  15   27:aload_3         
	//*  16   28:monitorexit     
	//*  17   29:iload_2         
	//*  18   30:ifne            34
	//*  19   33:return          
	//*  20   34:invokestatic    #85  <Method ArchTaskExecutor ArchTaskExecutor.getInstance()>
	//*  21   37:aload_0         
	//*  22   38:getfield        #60  <Field Runnable mPostValueRunnable>
	//*  23   41:invokevirtual   #221 <Method void ArchTaskExecutor.postToMainThread(Runnable)>
	//*  24   44:return          
	//*  25   45:astore_1        
	//*  26   46:aload_3         
	//*  27   47:monitorexit     
	//*  28   48:aload_1         
	//*  29   49:athrow          
			flag = false;
	//   30   50:iconst_0        
	//   31   51:istore_2        
		mPendingData = obj;
		obj1;
		JVM INSTR monitorexit ;
		if(!flag)
		{
			return;
		} else
		{
			ArchTaskExecutor.getInstance().postToMainThread(mPostValueRunnable);
			return;
		}
		obj;
		obj1;
		JVM INSTR monitorexit ;
		throw obj;
	//*  32   52:goto            22
	}

	public void removeObserver(Observer observer)
	{
		assertMainThread("removeObserver");
	//    0    0:ldc1            #224 <String "removeObserver">
	//    1    2:invokestatic    #226 <Method void assertMainThread(String)>
		observer = ((Observer) ((ObserverWrapper)mObservers.remove(((Object) (observer)))));
	//    2    5:aload_0         
	//    3    6:getfield        #47  <Field SafeIterableMap mObservers>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #230 <Method Object SafeIterableMap.remove(Object)>
	//    6   13:checkcast       #15  <Class LiveData$ObserverWrapper>
	//    7   16:astore_1        
		if(observer == null)
	//*   8   17:aload_1         
	//*   9   18:ifnonnull       22
		{
			return;
	//   10   21:return          
		} else
		{
			((ObserverWrapper) (observer)).detachObserver();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #233 <Method void LiveData$ObserverWrapper.detachObserver()>
			((ObserverWrapper) (observer)).activeStateChanged(false);
	//   13   26:aload_1         
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #121 <Method void LiveData$ObserverWrapper.activeStateChanged(boolean)>
			return;
	//   16   31:return          
		}
	}

	protected void setValue(Object obj)
	{
		assertMainThread("setValue");
	//    0    0:ldc1            #235 <String "setValue">
	//    1    2:invokestatic    #226 <Method void assertMainThread(String)>
		mVersion = mVersion + 1;
	//    2    5:aload_0         
	//    3    6:aload_0         
	//    4    7:getfield        #55  <Field int mVersion>
	//    5   10:iconst_1        
	//    6   11:iadd            
	//    7   12:putfield        #55  <Field int mVersion>
		mData = obj;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:putfield        #51  <Field Object mData>
		dispatchingValue(((ObserverWrapper) (null)));
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:invokespecial   #77  <Method void dispatchingValue(LiveData$ObserverWrapper)>
	//   14   25:return          
	}

	private static final Object NOT_SET = new Object();
	private int mActiveCount;
	private volatile Object mData;
	private final Object mDataLock = new Object();
	private boolean mDispatchInvalidated;
	private boolean mDispatchingValue;
	private SafeIterableMap mObservers;
	private volatile Object mPendingData;
	private final Runnable mPostValueRunnable = new Runnable() {

		public void run()
		{
			Object obj2;
			synchronized(mDataLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field LiveData this$0>
		//*   2    4:invokestatic    #23  <Method Object LiveData.access$000(LiveData)>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				obj2 = mPendingData;
		//    6   10:aload_0         
		//    7   11:getfield        #14  <Field LiveData this$0>
		//    8   14:invokestatic    #26  <Method Object LiveData.access$100(LiveData)>
		//    9   17:astore_2        
				mPendingData = LiveData.NOT_SET;
		//   10   18:aload_0         
		//   11   19:getfield        #14  <Field LiveData this$0>
		//   12   22:invokestatic    #30  <Method Object LiveData.access$200()>
		//   13   25:invokestatic    #34  <Method Object LiveData.access$102(LiveData, Object)>
		//   14   28:pop             
			}
		//   15   29:aload_1         
		//   16   30:monitorexit     
			setValue(obj2);
		//   17   31:aload_0         
		//   18   32:getfield        #14  <Field LiveData this$0>
		//   19   35:aload_2         
		//   20   36:invokevirtual   #38  <Method void LiveData.setValue(Object)>
			return;
		//   21   39:return          
			exception;
		//   22   40:astore_2        
			obj1;
		//   23   41:aload_1         
			JVM INSTR monitorexit ;
		//   24   42:monitorexit     
			throw exception;
		//   25   43:aload_2         
		//   26   44:athrow          
		}

		final LiveData this$0;

			
			{
				this$0 = LiveData.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field LiveData this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private int mVersion;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void Object()>
	//    3    7:putstatic       #39  <Field Object NOT_SET>
	//*   4   10:return          
	}


/*
	static Object access$000(LiveData livedata)
	{
		return livedata.mDataLock;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object mDataLock>
	//    2    4:areturn         
	}

*/


/*
	static Object access$100(LiveData livedata)
	{
		return livedata.mPendingData;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object mPendingData>
	//    2    4:areturn         
	}

*/


/*
	static Object access$102(LiveData livedata, Object obj)
	{
		livedata.mPendingData = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field Object mPendingData>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$200()
	{
		return NOT_SET;
	//    0    0:getstatic       #39  <Field Object NOT_SET>
	//    1    3:areturn         
	}

*/


/*
	static int access$300(LiveData livedata)
	{
		return livedata.mActiveCount;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mActiveCount>
	//    2    4:ireturn         
	}

*/


/*
	static int access$302(LiveData livedata, int i)
	{
		livedata.mActiveCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int mActiveCount>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$400(LiveData livedata, ObserverWrapper observerwrapper)
	{
		livedata.dispatchingValue(observerwrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method void dispatchingValue(LiveData$ObserverWrapper)>
		return;
	//    3    5:return          
	}

*/
}
