// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;

import com.ibotta.android.aop.tracking.TrackingAspect;
import com.ibotta.android.aop.tracking.advice.LoadTimeAdviceFields;
import com.ibotta.android.async.dependency.JobClient;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.contentevents.AbstractContentEventsPresenter;
import com.ibotta.android.service.api.Outcome;
import com.ibotta.android.service.api.job.*;
import com.ibotta.api.ApiCall;
import com.ibotta.api.ApiException;
import java.util.HashSet;
import java.util.Set;
import org.aspectj.runtime.reflect.Factory;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.base.loading:
//			LoadingMvpPresenter, LoadingMvpView

public abstract class AbstractLoadingMvpPresenter extends AbstractContentEventsPresenter
	implements LoadTimeAdviceFields, JobClient, LoadingMvpPresenter
{
	private class SubmitApiJobListener
		implements ApiJobListener
	{

		public void onApiJobFinished(ApiJob apijob)
		{
			if(!isAttached())
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
			if(!isAttached())
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

		private SubmitApiJobListener()
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

	}


	public AbstractLoadingMvpPresenter(MvpPresenterActions mvppresenteractions)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void AbstractContentEventsPresenter(MvpPresenterActions)>
		mvppresenteractions.prepare(((JobClient) (this)));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokeinterface #39  <Method void MvpPresenterActions.prepare(JobClient)>
	//    6   12:return          
	}

	private static void ajc$preClinit()
	{
		Factory factory = new Factory("AbstractLoadingMvpPresenter.java", com/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter);
	//    0    0:new             #48  <Class Factory>
	//    1    3:dup             
	//    2    4:ldc1            #50  <String "AbstractLoadingMvpPresenter.java">
	//    3    6:ldc1            #2   <Class AbstractLoadingMvpPresenter>
	//    4    8:invokespecial   #53  <Method void Factory(String, Class)>
	//    5   11:astore_0        
		ajc$tjp_0 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("11", "onApiJobsFinishedWithFailures", "com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter", "", "", "", "void"))), 173);
	//    6   12:aload_0         
	//    7   13:ldc1            #55  <String "method-execution">
	//    8   15:aload_0         
	//    9   16:ldc1            #57  <String "11">
	//   10   18:ldc1            #59  <String "onApiJobsFinishedWithFailures">
	//   11   20:ldc1            #61  <String "com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter">
	//   12   22:ldc1            #63  <String "">
	//   13   24:ldc1            #63  <String "">
	//   14   26:ldc1            #63  <String "">
	//   15   28:ldc1            #65  <String "void">
	//   16   30:invokevirtual   #69  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   17   33:sipush          173
	//   18   36:invokevirtual   #73  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   19   39:putstatic       #75  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
		ajc$tjp_1 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("11", "onApiJobsFinished", "com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter", "", "", "", "void"))), 182);
	//   20   42:aload_0         
	//   21   43:ldc1            #55  <String "method-execution">
	//   22   45:aload_0         
	//   23   46:ldc1            #57  <String "11">
	//   24   48:ldc1            #77  <String "onApiJobsFinished">
	//   25   50:ldc1            #61  <String "com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter">
	//   26   52:ldc1            #63  <String "">
	//   27   54:ldc1            #63  <String "">
	//   28   56:ldc1            #63  <String "">
	//   29   58:ldc1            #65  <String "void">
	//   30   60:invokevirtual   #69  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   31   63:sipush          182
	//   32   66:invokevirtual   #73  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   33   69:putstatic       #79  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_1>
	//   34   72:return          
	}

	public static void lambda$onFacebookAuthFailed$0(AbstractLoadingMvpPresenter abstractloadingmvppresenter)
	{
		((LoadingMvpView)abstractloadingmvppresenter.mvpView).showFacebookAuthFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #90  <Method void LoadingMvpView.showFacebookAuthFailed()>
	//    4   12:return          
	}

	public static void lambda$onFacebookInfoFailed$3(AbstractLoadingMvpPresenter abstractloadingmvppresenter)
	{
		((LoadingMvpView)abstractloadingmvppresenter.mvpView).showFacebookInfoFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #94  <Method void LoadingMvpView.showFacebookInfoFailed()>
	//    4   12:return          
	}

	public static void lambda$onFacebookLinkFailed$1(AbstractLoadingMvpPresenter abstractloadingmvppresenter)
	{
		((LoadingMvpView)abstractloadingmvppresenter.mvpView).showFacebookLinkFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #98  <Method void LoadingMvpView.showFacebookLinkFailed()>
	//    4   12:return          
	}

	public static void lambda$onFacebookUnlinkFailed$2(AbstractLoadingMvpPresenter abstractloadingmvppresenter)
	{
		((LoadingMvpView)abstractloadingmvppresenter.mvpView).showFacebookUnlinkFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #102 <Method void LoadingMvpView.showFacebookUnlinkFailed()>
	//    4   12:return          
	}

	public final Set getApiJobs()
	{
		Set set = getFetchJobs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method Set getFetchJobs()>
	//    2    4:astore_2        
		Object obj = ((Object) (set));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(set == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       19
			obj = ((Object) (new HashSet()));
	//    7   11:new             #109 <Class HashSet>
	//    8   14:dup             
	//    9   15:invokespecial   #111 <Method void HashSet()>
	//   10   18:astore_1        
		if(mvpPresenterActions.isCriticalDependencyLoadNeeded())
	//*  11   19:aload_0         
	//*  12   20:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//*  13   23:invokeinterface #118 <Method boolean MvpPresenterActions.isCriticalDependencyLoadNeeded()>
	//*  14   28:ifeq            79
		{
			Set set1 = mvpPresenterActions.getCriticalDependencyJobs();
	//   15   31:aload_0         
	//   16   32:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//   17   35:invokeinterface #121 <Method Set MvpPresenterActions.getCriticalDependencyJobs()>
	//   18   40:astore_2        
			Timber.d("Adding %1$d critical jobs surfaced from CriticalDependency", new Object[] {
				Integer.valueOf(set1.size())
			});
	//   19   41:ldc1            #123 <String "Adding %1$d critical jobs surfaced from CriticalDependency">
	//   20   43:iconst_1        
	//   21   44:anewarray       Object[]
	//   22   47:dup             
	//   23   48:iconst_0        
	//   24   49:aload_2         
	//   25   50:invokeinterface #131 <Method int Set.size()>
	//   26   55:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   27   58:aastore         
	//   28   59:invokestatic    #143 <Method void Timber.d(String, Object[])>
			((Set) (obj)).addAll(((java.util.Collection) (set1)));
	//   29   62:aload_1         
	//   30   63:aload_2         
	//   31   64:invokeinterface #147 <Method boolean Set.addAll(java.util.Collection)>
	//   32   69:pop             
			mvpPresenterActions.onCriticalDependencyJobQueued();
	//   33   70:aload_0         
	//   34   71:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//   35   74:invokeinterface #150 <Method void MvpPresenterActions.onCriticalDependencyJobQueued()>
		}
		return ((Set) (obj));
	//   36   79:aload_1         
	//   37   80:areturn         
	}

	protected abstract Set getFetchJobs();

	public long getLoadStartTime()
	{
		return loadStartTime;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field long loadStartTime>
	//    2    4:lreturn         
	}

	public boolean isLoading()
	{
		return mvpPresenterActions.isLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//    2    4:invokeinterface #159 <Method boolean MvpPresenterActions.isLoading()>
	//    3    9:ireturn         
	}

	public final void onAbandonApiJobs()
	{
		onAbandonFetchJobs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method void onAbandonFetchJobs()>
	//    2    4:return          
	}

	protected abstract void onAbandonFetchJobs();

	public final void onApiJobFailed(ApiJob apijob)
	{
		if(!isAttached())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method boolean isAttached()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			onFetchJobFailed(apijob);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #168 <Method void onFetchJobFailed(ApiJob)>
			return;
	//    7   13:return          
		}
	}

	public final void onApiJobSuccess(ApiJob apijob)
	{
		if(!isAttached())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method boolean isAttached()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			onFetchJobSuccess(apijob);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #172 <Method void onFetchJobSuccess(ApiJob)>
			return;
	//    7   13:return          
		}
	}

	public final void onApiJobsFinished()
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, ((Object) (this)), ((Object) (this)));
	//    0    0:getstatic       #79  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_1>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:invokestatic    #182 <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object)>
	//    4    8:astore_1        
		if(isAttached())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #45  <Method boolean isAttached()>
	//*   7   13:ifne            19
	//*   8   16:goto            23
			try
			{
				onFetchFinishedSuccessfully();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #185 <Method void onFetchFinishedSuccessfully()>
			}
	//*  11   23:invokestatic    #191 <Method TrackingAspect TrackingAspect.aspectOf()>
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #195 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
	//*  14   30:return          
			catch(Throwable throwable)
	//*  15   31:astore_2        
			{
				TrackingAspect.aspectOf().after(joinpoint);
	//   16   32:invokestatic    #191 <Method TrackingAspect TrackingAspect.aspectOf()>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #195 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
				throw throwable;
	//   19   39:aload_2         
	//   20   40:athrow          
			}
		TrackingAspect.aspectOf().after(joinpoint);
		return;
	}

	public final void onApiJobsFinishedWithFailures()
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, ((Object) (this)), ((Object) (this)));
	//    0    0:getstatic       #75  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:invokestatic    #182 <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object)>
	//    4    8:astore_1        
		if(isAttached())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #45  <Method boolean isAttached()>
	//*   7   13:ifne            19
	//*   8   16:goto            23
			try
			{
				onFetchFinishedWithFailures();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #199 <Method void onFetchFinishedWithFailures()>
			}
	//*  11   23:invokestatic    #191 <Method TrackingAspect TrackingAspect.aspectOf()>
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #195 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
	//*  14   30:return          
			catch(Throwable throwable)
	//*  15   31:astore_2        
			{
				TrackingAspect.aspectOf().after(joinpoint);
	//   16   32:invokestatic    #191 <Method TrackingAspect TrackingAspect.aspectOf()>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #195 <Method void TrackingAspect.after(org.aspectj.lang.JoinPoint)>
				throw throwable;
	//   19   39:aload_2         
	//   20   40:athrow          
			}
		TrackingAspect.aspectOf().after(joinpoint);
		return;
	}

	public void onDetach()
	{
		mvpPresenterActions.stopLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//    2    4:invokeinterface #203 <Method void MvpPresenterActions.stopLoading()>
		super.onDetach();
	//    3    9:aload_0         
	//    4   10:invokespecial   #205 <Method void AbstractContentEventsPresenter.onDetach()>
	//    5   13:return          
	}

	public void onFacebookAuthFailed()
	{
		ifNetworkConnected(((Runnable) (new _2D_..Lambda.AbstractLoadingMvpPresenter.QPy_2D__YJGdR7DftSSIRFaPgRtstM(this))));
	//    0    0:aload_0         
	//    1    1:new             #208 <Class _2D_$$Lambda$AbstractLoadingMvpPresenter$QPy_2D__YJGdR7DftSSIRFaPgRtstM>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #210 <Method void _2D_$$Lambda$AbstractLoadingMvpPresenter$QPy_2D__YJGdR7DftSSIRFaPgRtstM(AbstractLoadingMvpPresenter)>
	//    5    9:invokevirtual   #214 <Method void ifNetworkConnected(Runnable)>
	//    6   12:return          
	}

	public void onFacebookInfoFailed()
	{
		ifNetworkConnected(((Runnable) (new _2D_..Lambda.AbstractLoadingMvpPresenter.SBiOjSZCiw1Nlbims4muNUj0Akw(this))));
	//    0    0:aload_0         
	//    1    1:new             #217 <Class _2D_$$Lambda$AbstractLoadingMvpPresenter$SBiOjSZCiw1Nlbims4muNUj0Akw>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #218 <Method void _2D_$$Lambda$AbstractLoadingMvpPresenter$SBiOjSZCiw1Nlbims4muNUj0Akw(AbstractLoadingMvpPresenter)>
	//    5    9:invokevirtual   #214 <Method void ifNetworkConnected(Runnable)>
	//    6   12:return          
	}

	public void onFacebookLinkFailed()
	{
		ifNetworkConnected(((Runnable) (new _2D_..Lambda.AbstractLoadingMvpPresenter._cls5fFfp3Pc2cfDsUEiwo4mWkqZxtk(this))));
	//    0    0:aload_0         
	//    1    1:new             #221 <Class _2D_$$Lambda$AbstractLoadingMvpPresenter$5fFfp3Pc2cfDsUEiwo4mWkqZxtk>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #222 <Method void _2D_$$Lambda$AbstractLoadingMvpPresenter$5fFfp3Pc2cfDsUEiwo4mWkqZxtk(AbstractLoadingMvpPresenter)>
	//    5    9:invokevirtual   #214 <Method void ifNetworkConnected(Runnable)>
	//    6   12:return          
	}

	public void onFacebookUnlinkFailed()
	{
		ifNetworkConnected(((Runnable) (new _2D_..Lambda.AbstractLoadingMvpPresenter.awq4O0z1shZWGUxl0RIh98q16lo(this))));
	//    0    0:aload_0         
	//    1    1:new             #225 <Class _2D_$$Lambda$AbstractLoadingMvpPresenter$awq4O0z1shZWGUxl0RIh98q16lo>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #226 <Method void _2D_$$Lambda$AbstractLoadingMvpPresenter$awq4O0z1shZWGUxl0RIh98q16lo(AbstractLoadingMvpPresenter)>
	//    5    9:invokevirtual   #214 <Method void ifNetworkConnected(Runnable)>
	//    6   12:return          
	}

	protected abstract void onFetchFinishedSuccessfully();

	protected void onFetchFinishedWithFailures()
	{
		if(mvpPresenterActions.isNetworkConnected())
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//*   2    4:invokeinterface #229 <Method boolean MvpPresenterActions.isNetworkConnected()>
	//*   3    9:ifeq            25
		{
			((LoadingMvpView)mvpView).showScreenLoadFailed();
	//    4   12:aload_0         
	//    5   13:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    6   16:checkcast       #87  <Class LoadingMvpView>
	//    7   19:invokeinterface #232 <Method void LoadingMvpView.showScreenLoadFailed()>
			return;
	//    8   24:return          
		} else
		{
			((LoadingMvpView)mvpView).showNetworkConnectionError();
	//    9   25:aload_0         
	//   10   26:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   11   29:checkcast       #87  <Class LoadingMvpView>
	//   12   32:invokeinterface #235 <Method void LoadingMvpView.showNetworkConnectionError()>
			return;
	//   13   37:return          
		}
	}

	public void onFetchJobErrorCancelled()
	{
		((LoadingMvpView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #239 <Method void LoadingMvpView.finish()>
	//    4   12:return          
	}

	protected void onFetchJobFailed(ApiJob apijob)
	{
	//    0    0:return          
	}

	protected void onFetchJobSuccess(ApiJob apijob)
	{
	//    0    0:return          
	}

	protected void onFetchStarted()
	{
	//    0    0:return          
	}

	protected void onFetchStopped()
	{
		((LoadingMvpView)mvpView).hideScreenLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #245 <Method void LoadingMvpView.hideScreenLoading()>
	//    4   12:return          
	}

	public final void onLoadingStarted()
	{
		if(!isAttached())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method boolean isAttached()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			loadStartTime = mvpPresenterActions.getCurrentTime();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//    7   13:invokeinterface #249 <Method long MvpPresenterActions.getCurrentTime()>
	//    8   18:putfield        #156 <Field long loadStartTime>
			onFetchStarted();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #251 <Method void onFetchStarted()>
			return;
	//   11   25:return          
		}
	}

	public final void onLoadingStopped()
	{
		if(!isAttached())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method boolean isAttached()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			onFetchStopped();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #254 <Method void onFetchStopped()>
			return;
	//    6   12:return          
		}
	}

	protected void onLongFetchStarted()
	{
		((LoadingMvpView)mvpView).showScreenLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #258 <Method void LoadingMvpView.showScreenLoading()>
	//    4   12:return          
	}

	public final void onLongLoadStarted()
	{
		if(!isAttached())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method boolean isAttached()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			onLongFetchStarted();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #261 <Method void onLongFetchStarted()>
			return;
	//    6   12:return          
		}
	}

	public void onNetworkConnectionErrorRetryClicked()
	{
		((LoadingMvpView)mvpView).recreate();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #265 <Method void LoadingMvpView.recreate()>
	//    4   12:return          
	}

	public void onRefresh()
	{
		reload();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method void reload()>
	//    2    4:return          
	}

	public void onScreenLoadingCancelled()
	{
		((LoadingMvpView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #239 <Method void LoadingMvpView.finish()>
	//    4   12:return          
	}

	public void onScreenLoadingRetry()
	{
		onRefresh();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #273 <Method void onRefresh()>
	//    2    4:return          
	}

	public void onScreenLoadingRetryCancelled()
	{
		((LoadingMvpView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #239 <Method void LoadingMvpView.finish()>
	//    4   12:return          
	}

	public void onStart()
	{
		if(!mvpPresenterActions.isLoading())
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//*   2    4:invokeinterface #159 <Method boolean MvpPresenterActions.isLoading()>
	//*   3    9:ifne            21
			mvpPresenterActions.loadData();
	//    4   12:aload_0         
	//    5   13:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//    6   16:invokeinterface #278 <Method void MvpPresenterActions.loadData()>
	//    7   21:return          
	}

	protected void onSubmitJobFailed(SingleApiJob singleapijob)
	{
		((LoadingMvpView)mvpView).hideSubmittedJobLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #283 <Method void LoadingMvpView.hideSubmittedJobLoading()>
		boolean flag1 = false;
	//    4   12:iconst_0        
	//    5   13:istore_3        
		boolean flag = flag1;
	//    6   14:iload_3         
	//    7   15:istore_2        
		if(singleapijob != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          34
		{
			flag = flag1;
	//   10   20:iload_3         
	//   11   21:istore_2        
			if(singleapijob.getOutcome() == Outcome.NETWORK_LOST)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #289 <Method Outcome SingleApiJob.getOutcome()>
	//*  14   26:getstatic       #295 <Field Outcome Outcome.NETWORK_LOST>
	//*  15   29:if_acmpne       34
				flag = true;
	//   16   32:iconst_1        
	//   17   33:istore_2        
		}
		Object obj = null;
	//   18   34:aconst_null     
	//   19   35:astore          5
		com.ibotta.api.ApiErrorDetails apierrordetails = ((com.ibotta.api.ApiErrorDetails) (obj));
	//   20   37:aload           5
	//   21   39:astore          4
		if(singleapijob != null)
	//*  22   41:aload_1         
	//*  23   42:ifnull          65
		{
			apierrordetails = ((com.ibotta.api.ApiErrorDetails) (obj));
	//   24   45:aload           5
	//   25   47:astore          4
			if(singleapijob.getException() != null)
	//*  26   49:aload_1         
	//*  27   50:invokevirtual   #299 <Method ApiException SingleApiJob.getException()>
	//*  28   53:ifnull          65
				apierrordetails = singleapijob.getException().getDetails();
	//   29   56:aload_1         
	//   30   57:invokevirtual   #299 <Method ApiException SingleApiJob.getException()>
	//   31   60:invokevirtual   #305 <Method com.ibotta.api.ApiErrorDetails ApiException.getDetails()>
	//   32   63:astore          4
		}
		if(!flag && mvpPresenterActions.isNetworkConnected())
	//*  33   65:iload_2         
	//*  34   66:ifne            99
	//*  35   69:aload_0         
	//*  36   70:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//*  37   73:invokeinterface #229 <Method boolean MvpPresenterActions.isNetworkConnected()>
	//*  38   78:ifne            84
	//*  39   81:goto            99
		{
			((LoadingMvpView)mvpView).showSubmittedJobFailed(apierrordetails);
	//   40   84:aload_0         
	//   41   85:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   42   88:checkcast       #87  <Class LoadingMvpView>
	//   43   91:aload           4
	//   44   93:invokeinterface #309 <Method void LoadingMvpView.showSubmittedJobFailed(com.ibotta.api.ApiErrorDetails)>
			return;
	//   45   98:return          
		} else
		{
			((LoadingMvpView)mvpView).showNetworkConnectionErrorDialog();
	//   46   99:aload_0         
	//   47  100:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   48  103:checkcast       #87  <Class LoadingMvpView>
	//   49  106:invokeinterface #312 <Method void LoadingMvpView.showNetworkConnectionErrorDialog()>
			return;
	//   50  111:return          
		}
	}

	protected void onSubmitJobStarted(SingleApiJob singleapijob)
	{
		((LoadingMvpView)mvpView).showSubmittedJobLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #316 <Method void LoadingMvpView.showSubmittedJobLoading()>
	//    4   12:return          
	}

	protected void onSubmitJobSuccess(SingleApiJob singleapijob)
	{
		((LoadingMvpView)mvpView).hideSubmittedJobLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #283 <Method void LoadingMvpView.hideSubmittedJobLoading()>
	//    4   12:return          
	}

	public void onSubmittedJobErrorCancelled()
	{
		((LoadingMvpView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #239 <Method void LoadingMvpView.finish()>
	//    4   12:return          
	}

	public void onSubmittedJobLoadingCancelled()
	{
		((LoadingMvpView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #87  <Class LoadingMvpView>
	//    3    7:invokeinterface #239 <Method void LoadingMvpView.finish()>
	//    4   12:return          
	}

	protected void reload()
	{
		if(!mvpPresenterActions.isLoading())
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//*   2    4:invokeinterface #159 <Method boolean MvpPresenterActions.isLoading()>
	//*   3    9:ifne            21
			mvpPresenterActions.reloadData();
	//    4   12:aload_0         
	//    5   13:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//    6   16:invokeinterface #322 <Method void MvpPresenterActions.reloadData()>
	//    7   21:return          
	}

	public void setNetworkConnectionErrorViewShowing()
	{
		networkConnectionErrorViewShowing = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #325 <Field boolean networkConnectionErrorViewShowing>
	//    3    5:return          
	}

	protected void submitApiCall(ApiCall apicall)
	{
		submitApiJob(((ApiJob) (new SingleApiJob(apicall))));
	//    0    0:aload_0         
	//    1    1:new             #285 <Class SingleApiJob>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #329 <Method void SingleApiJob(ApiCall)>
	//    5    9:invokevirtual   #332 <Method void submitApiJob(ApiJob)>
	//    6   12:return          
	}

	protected void submitApiJob(ApiJob apijob)
	{
		submitApiJob(apijob, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #336 <Method void submitApiJob(ApiJob, boolean)>
	//    4    6:return          
	}

	protected void submitApiJob(ApiJob apijob, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            19
			apijob.addListener(((ApiJobListener) (new SubmitApiJobListener())));
	//    2    4:aload_1         
	//    3    5:new             #15  <Class AbstractLoadingMvpPresenter$SubmitApiJobListener>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #339 <Method void AbstractLoadingMvpPresenter$SubmitApiJobListener(AbstractLoadingMvpPresenter, AbstractLoadingMvpPresenter$1)>
	//    8   14:invokeinterface #345 <Method void ApiJob.addListener(ApiJobListener)>
		mvpPresenterActions.submit(apijob);
	//    9   19:aload_0         
	//   10   20:getfield        #115 <Field MvpPresenterActions mvpPresenterActions>
	//   11   23:aload_1         
	//   12   24:invokeinterface #348 <Method void MvpPresenterActions.submit(ApiJob)>
	//   13   29:return          
	}

	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
	private long loadStartTime;
	protected boolean networkConnectionErrorViewShowing;

	static 
	{
		ajc$preClinit();
	//    0    0:invokestatic    #28  <Method void ajc$preClinit()>
	//*   1    3:return          
	}


/*
	static boolean access$100(AbstractLoadingMvpPresenter abstractloadingmvppresenter)
	{
		return abstractloadingmvppresenter.isAttached();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method boolean isAttached()>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$200(AbstractLoadingMvpPresenter abstractloadingmvppresenter)
	{
		return abstractloadingmvppresenter.isAttached();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method boolean isAttached()>
	//    2    4:ireturn         
	}

*/
}
