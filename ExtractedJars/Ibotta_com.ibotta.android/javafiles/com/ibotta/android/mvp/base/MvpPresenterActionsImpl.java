// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import com.ibotta.android.api.critical.CriticalDependency;
import com.ibotta.android.async.dependency.JobClient;
import com.ibotta.android.async.dependency.JobDependencyManagerImpl;
import com.ibotta.android.fragment.retailer.RetailerParcel;
import com.ibotta.android.fragment.retailer.RetailerParcelHelper;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.job.ApiJob;
import com.ibotta.android.util.AppHelper;
import com.ibotta.api.model.RetailerModel;
import java.util.Set;

// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpPresenterActions

public final class MvpPresenterActionsImpl
	implements MvpPresenterActions
{

	public MvpPresenterActionsImpl(AppHelper apphelper, Hardware hardware1, CriticalDependency criticaldependency, RetailerParcelHelper retailerparcelhelper, ApiWorkSubmitter apiworksubmitter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		appHelper = apphelper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field AppHelper appHelper>
		hardware = hardware1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field Hardware hardware>
		criticalDependency = criticaldependency;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field CriticalDependency criticalDependency>
		retailerParcelHelper = retailerparcelhelper;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #32  <Field RetailerParcelHelper retailerParcelHelper>
		apiWorkSubmitter = apiworksubmitter;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #34  <Field ApiWorkSubmitter apiWorkSubmitter>
	//   17   31:return          
	}

	public Set getCriticalDependencyJobs()
	{
		return criticalDependency.getApiJobs();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CriticalDependency criticalDependency>
	//    2    4:invokeinterface #43  <Method Set CriticalDependency.getApiJobs()>
	//    3    9:areturn         
	}

	public long getCurrentTime()
	{
		return appHelper.getCurrentTime();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AppHelper appHelper>
	//    2    4:invokeinterface #51  <Method long AppHelper.getCurrentTime()>
	//    3    9:lreturn         
	}

	public boolean isCriticalDependencyLoadNeeded()
	{
		return criticalDependency.isLoadNeeded();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CriticalDependency criticalDependency>
	//    2    4:invokeinterface #56  <Method boolean CriticalDependency.isLoadNeeded()>
	//    3    9:ireturn         
	}

	public boolean isLoading()
	{
		return jobDependencyManager.isLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JobDependencyManagerImpl jobDependencyManager>
	//    2    4:invokevirtual   #63  <Method boolean JobDependencyManagerImpl.isLoading()>
	//    3    7:ireturn         
	}

	public boolean isNetworkConnected()
	{
		return hardware.isNetworkConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Hardware hardware>
	//    2    4:invokeinterface #68  <Method boolean Hardware.isNetworkConnected()>
	//    3    9:ireturn         
	}

	public void loadData()
	{
		jobDependencyManager.loadData();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JobDependencyManagerImpl jobDependencyManager>
	//    2    4:invokevirtual   #71  <Method void JobDependencyManagerImpl.loadData()>
	//    3    7:return          
	}

	public void onCriticalDependencyJobQueued()
	{
		criticalDependency.onJobQueued();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field CriticalDependency criticalDependency>
	//    2    4:invokeinterface #75  <Method void CriticalDependency.onJobQueued()>
	//    3    9:return          
	}

	public void prepare(JobClient jobclient)
	{
		jobDependencyManager = new JobDependencyManagerImpl(jobclient, apiWorkSubmitter);
	//    0    0:aload_0         
	//    1    1:new             #61  <Class JobDependencyManagerImpl>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field ApiWorkSubmitter apiWorkSubmitter>
	//    6   10:invokespecial   #80  <Method void JobDependencyManagerImpl(JobClient, ApiWorkSubmitter)>
	//    7   13:putfield        #59  <Field JobDependencyManagerImpl jobDependencyManager>
	//    8   16:return          
	}

	public void reloadData()
	{
		jobDependencyManager.reloadData();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JobDependencyManagerImpl jobDependencyManager>
	//    2    4:invokevirtual   #83  <Method void JobDependencyManagerImpl.reloadData()>
	//    3    7:return          
	}

	public void stopLoading()
	{
		jobDependencyManager.stopLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JobDependencyManagerImpl jobDependencyManager>
	//    2    4:invokevirtual   #86  <Method void JobDependencyManagerImpl.stopLoading()>
	//    3    7:return          
	}

	public void submit(ApiJob apijob)
	{
		apiWorkSubmitter.submit(apijob);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ApiWorkSubmitter apiWorkSubmitter>
	//    2    4:aload_1         
	//    3    5:invokeinterface #92  <Method void ApiWorkSubmitter.submit(ApiJob)>
	//    4   10:return          
	}

	public RetailerParcel toRetailerParcel(RetailerModel retailermodel)
	{
		return retailerParcelHelper.toRetailerParcel(retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RetailerParcelHelper retailerParcelHelper>
	//    2    4:aload_1         
	//    3    5:invokeinterface #99  <Method RetailerParcel RetailerParcelHelper.toRetailerParcel(RetailerModel)>
	//    4   10:areturn         
	}

	private final ApiWorkSubmitter apiWorkSubmitter;
	private final AppHelper appHelper;
	private final CriticalDependency criticalDependency;
	private final Hardware hardware;
	private JobDependencyManagerImpl jobDependencyManager;
	private final RetailerParcelHelper retailerParcelHelper;
}
