// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.util.concurrent.Executor;

// Referenced classes of package android.arch.lifecycle:
//			LiveData, ComputableLiveData

class ComputableLiveData$1 extends LiveData
{

	protected void onActive()
	{
		ComputableLiveData.access$000(ComputableLiveData.this).execute(mRefreshRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ComputableLiveData this$0>
	//    2    4:invokestatic    #24  <Method Executor ComputableLiveData.access$000(ComputableLiveData)>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field ComputableLiveData this$0>
	//    5   11:getfield        #28  <Field Runnable ComputableLiveData.mRefreshRunnable>
	//    6   14:invokeinterface #34  <Method void Executor.execute(Runnable)>
	//    7   19:return          
	}

	final ComputableLiveData this$0;

	ComputableLiveData$1()
	{
		this$0 = ComputableLiveData.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ComputableLiveData this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void LiveData()>
	//    5    9:return          
	}
}
