// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LiveData, Observer

private class LiveData$AlwaysActiveObserver extends LiveData.ObserverWrapper
{

	boolean shouldBeActive()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final LiveData this$0;

	LiveData$AlwaysActiveObserver(Observer observer)
	{
		this$0 = LiveData.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LiveData this$0>
		super(LiveData.this, observer);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #16  <Method void LiveData$ObserverWrapper(LiveData, Observer)>
	//    7   11:return          
	}
}
