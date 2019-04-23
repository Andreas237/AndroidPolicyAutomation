// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LiveData, Observer, LifecycleOwner

private abstract class LiveData$ObserverWrapper
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
		int i = LiveData.access$300(LiveData.this);
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
		int j = LiveData.access$300(livedata);
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
		LiveData.access$302(livedata, j + byte0);
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
		if(LiveData.access$300(LiveData.this) == 0 && !mActive)
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
			LiveData.access$400(LiveData.this, this);
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

	LiveData$ObserverWrapper(Observer observer)
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
