// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;

import com.ibotta.android.service.api.job.*;

// Referenced classes of package com.ibotta.android.mvp.base.loading:
//			AbstractLoadingMvpPresenter

private class AbstractLoadingMvpPresenter$SubmitApiJobListener
	implements ApiJobListener
{

	public void onApiJobFinished(ApiJob apijob)
	{
		if(!AbstractLoadingMvpPresenter.access$200(AbstractLoadingMvpPresenter.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field AbstractLoadingMvpPresenter this$0>
	//*   2    4:invokestatic    #28  <Method boolean AbstractLoadingMvpPresenter.access$200(AbstractLoadingMvpPresenter)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(apijob.isSuccessfullyLoaded())
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #34  <Method boolean ApiJob.isSuccessfullyLoaded()>
	//*   7   17:ifeq            32
		{
			onSubmitJobSuccess((SingleApiJob)apijob);
	//    8   20:aload_0         
	//    9   21:getfield        #15  <Field AbstractLoadingMvpPresenter this$0>
	//   10   24:aload_1         
	//   11   25:checkcast       #36  <Class SingleApiJob>
	//   12   28:invokevirtual   #40  <Method void AbstractLoadingMvpPresenter.onSubmitJobSuccess(SingleApiJob)>
			return;
	//   13   31:return          
		} else
		{
			onSubmitJobFailed((SingleApiJob)apijob);
	//   14   32:aload_0         
	//   15   33:getfield        #15  <Field AbstractLoadingMvpPresenter this$0>
	//   16   36:aload_1         
	//   17   37:checkcast       #36  <Class SingleApiJob>
	//   18   40:invokevirtual   #43  <Method void AbstractLoadingMvpPresenter.onSubmitJobFailed(SingleApiJob)>
			return;
	//   19   43:return          
		}
	}

	public void onApiJobLongTask(ApiJob apijob)
	{
		if(!AbstractLoadingMvpPresenter.access$100(AbstractLoadingMvpPresenter.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field AbstractLoadingMvpPresenter this$0>
	//*   2    4:invokestatic    #47  <Method boolean AbstractLoadingMvpPresenter.access$100(AbstractLoadingMvpPresenter)>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			onSubmitJobStarted((SingleApiJob)apijob);
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field AbstractLoadingMvpPresenter this$0>
	//    7   15:aload_1         
	//    8   16:checkcast       #36  <Class SingleApiJob>
	//    9   19:invokevirtual   #50  <Method void AbstractLoadingMvpPresenter.onSubmitJobStarted(SingleApiJob)>
			return;
	//   10   22:return          
		}
	}

	final AbstractLoadingMvpPresenter this$0;

	private AbstractLoadingMvpPresenter$SubmitApiJobListener()
	{
		this$0 = AbstractLoadingMvpPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AbstractLoadingMvpPresenter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	AbstractLoadingMvpPresenter$SubmitApiJobListener(AbstractLoadingMvpPresenter._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void AbstractLoadingMvpPresenter$SubmitApiJobListener(AbstractLoadingMvpPresenter)>
	//    3    5:return          
	}
}
