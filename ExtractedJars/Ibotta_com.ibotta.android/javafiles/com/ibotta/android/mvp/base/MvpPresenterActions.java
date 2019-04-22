// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import com.ibotta.android.async.dependency.JobClient;
import com.ibotta.android.fragment.retailer.RetailerParcel;
import com.ibotta.android.service.api.job.ApiJob;
import com.ibotta.api.model.RetailerModel;
import java.util.Set;

public interface MvpPresenterActions
{

	public abstract Set getCriticalDependencyJobs();

	public abstract long getCurrentTime();

	public abstract boolean isCriticalDependencyLoadNeeded();

	public abstract boolean isLoading();

	public abstract boolean isNetworkConnected();

	public abstract void loadData();

	public abstract void onCriticalDependencyJobQueued();

	public abstract void prepare(JobClient jobclient);

	public abstract void reloadData();

	public abstract void stopLoading();

	public abstract void submit(ApiJob apijob);

	public abstract RetailerParcel toRetailerParcel(RetailerModel retailermodel);
}
