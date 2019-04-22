// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.android.service.api.job.*;
import com.ibotta.api.call.home.HomeResponse;

// Referenced classes of package com.ibotta.android.mvp.base.search:
//			AbstractSearchMvpPresenter, SearchMvpView

class AbstractSearchMvpPresenter$1
	implements ApiJobListener
{

	public void onApiJobFinished(ApiJob apijob)
	{
		if(AbstractSearchMvpPresenter.access$000(AbstractSearchMvpPresenter.this) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field AbstractSearchMvpPresenter this$0>
	//*   2    4:invokestatic    #24  <Method com.ibotta.android.mvp.base.MvpView AbstractSearchMvpPresenter.access$000(AbstractSearchMvpPresenter)>
	//*   3    7:ifnonnull       11
			return;
	//    4   10:return          
		if(AbstractSearchMvpPresenter.access$100(AbstractSearchMvpPresenter.this) != null && AbstractSearchMvpPresenter.access$100(AbstractSearchMvpPresenter.this).isSuccessfullyLoaded())
	//*   5   11:aload_0         
	//*   6   12:getfield        #14  <Field AbstractSearchMvpPresenter this$0>
	//*   7   15:invokestatic    #28  <Method HomeApiJob AbstractSearchMvpPresenter.access$100(AbstractSearchMvpPresenter)>
	//*   8   18:ifnull          53
	//*   9   21:aload_0         
	//*  10   22:getfield        #14  <Field AbstractSearchMvpPresenter this$0>
	//*  11   25:invokestatic    #28  <Method HomeApiJob AbstractSearchMvpPresenter.access$100(AbstractSearchMvpPresenter)>
	//*  12   28:invokevirtual   #34  <Method boolean HomeApiJob.isSuccessfullyLoaded()>
	//*  13   31:ifeq            53
		{
			apijob = ((ApiJob) (AbstractSearchMvpPresenter.this));
	//   14   34:aload_0         
	//   15   35:getfield        #14  <Field AbstractSearchMvpPresenter this$0>
	//   16   38:astore_1        
			AbstractSearchMvpPresenter.access$200(((AbstractSearchMvpPresenter) (apijob)), (HomeResponse)AbstractSearchMvpPresenter.access$100(((AbstractSearchMvpPresenter) (apijob))).getApiResponse());
	//   17   39:aload_1         
	//   18   40:aload_1         
	//   19   41:invokestatic    #28  <Method HomeApiJob AbstractSearchMvpPresenter.access$100(AbstractSearchMvpPresenter)>
	//   20   44:invokevirtual   #38  <Method com.ibotta.api.ApiResponse HomeApiJob.getApiResponse()>
	//   21   47:checkcast       #40  <Class HomeResponse>
	//   22   50:invokestatic    #44  <Method void AbstractSearchMvpPresenter.access$200(AbstractSearchMvpPresenter, HomeResponse)>
		}
		apijob = ((ApiJob) (AbstractSearchMvpPresenter.this));
	//   23   53:aload_0         
	//   24   54:getfield        #14  <Field AbstractSearchMvpPresenter this$0>
	//   25   57:astore_1        
		AbstractSearchMvpPresenter.access$400(((AbstractSearchMvpPresenter) (apijob)), (SearchMvpView)AbstractSearchMvpPresenter.access$300(((AbstractSearchMvpPresenter) (apijob))));
	//   26   58:aload_1         
	//   27   59:aload_1         
	//   28   60:invokestatic    #47  <Method com.ibotta.android.mvp.base.MvpView AbstractSearchMvpPresenter.access$300(AbstractSearchMvpPresenter)>
	//   29   63:checkcast       #49  <Class SearchMvpView>
	//   30   66:invokestatic    #53  <Method void AbstractSearchMvpPresenter.access$400(AbstractSearchMvpPresenter, SearchMvpView)>
	//   31   69:return          
	}

	public void onApiJobLongTask(ApiJob apijob)
	{
	//    0    0:return          
	}

	final AbstractSearchMvpPresenter this$0;

	AbstractSearchMvpPresenter$1()
	{
		this$0 = AbstractSearchMvpPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AbstractSearchMvpPresenter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
