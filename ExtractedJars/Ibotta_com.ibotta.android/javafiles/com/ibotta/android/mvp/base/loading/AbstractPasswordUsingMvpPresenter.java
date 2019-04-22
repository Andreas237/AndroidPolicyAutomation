// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;

import com.ibotta.android.aop.password.PasswordCacheAspect;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.service.api.job.ApiJob;
import com.ibotta.android.service.api.job.SingleApiJob;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.ibotta.android.mvp.base.loading:
//			AbstractLoadingMvpPresenter, LoadingMvpPresenter

public abstract class AbstractPasswordUsingMvpPresenter extends AbstractLoadingMvpPresenter
	implements LoadingMvpPresenter
{

	public AbstractPasswordUsingMvpPresenter(MvpPresenterActions mvppresenteractions)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void AbstractLoadingMvpPresenter(MvpPresenterActions)>
	//    3    5:return          
	}

	private static void ajc$preClinit()
	{
		Factory factory = new Factory("AbstractPasswordUsingMvpPresenter.java", com/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter);
	//    0    0:new             #24  <Class Factory>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "AbstractPasswordUsingMvpPresenter.java">
	//    3    6:ldc1            #2   <Class AbstractPasswordUsingMvpPresenter>
	//    4    8:invokespecial   #29  <Method void Factory(String, Class)>
	//    5   11:astore_0        
		ajc$tjp_0 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("4", "onFetchJobSuccess", "com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter", "com.ibotta.android.service.api.job.ApiJob", "apiJob", "", "void"))), 23);
	//    6   12:aload_0         
	//    7   13:ldc1            #31  <String "method-execution">
	//    8   15:aload_0         
	//    9   16:ldc1            #33  <String "4">
	//   10   18:ldc1            #35  <String "onFetchJobSuccess">
	//   11   20:ldc1            #37  <String "com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter">
	//   12   22:ldc1            #39  <String "com.ibotta.android.service.api.job.ApiJob">
	//   13   24:ldc1            #41  <String "apiJob">
	//   14   26:ldc1            #43  <String "">
	//   15   28:ldc1            #45  <String "void">
	//   16   30:invokevirtual   #49  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   17   33:bipush          23
	//   18   35:invokevirtual   #53  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   19   38:putstatic       #55  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
		ajc$tjp_1 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("4", "onFetchJobFailed", "com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter", "com.ibotta.android.service.api.job.ApiJob", "apiJob", "", "void"))), 28);
	//   20   41:aload_0         
	//   21   42:ldc1            #31  <String "method-execution">
	//   22   44:aload_0         
	//   23   45:ldc1            #33  <String "4">
	//   24   47:ldc1            #57  <String "onFetchJobFailed">
	//   25   49:ldc1            #37  <String "com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter">
	//   26   51:ldc1            #39  <String "com.ibotta.android.service.api.job.ApiJob">
	//   27   53:ldc1            #41  <String "apiJob">
	//   28   55:ldc1            #43  <String "">
	//   29   57:ldc1            #45  <String "void">
	//   30   59:invokevirtual   #49  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   31   62:bipush          28
	//   32   64:invokevirtual   #53  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   33   67:putstatic       #59  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_1>
		ajc$tjp_2 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("4", "onSubmitJobFailed", "com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter", "com.ibotta.android.service.api.job.SingleApiJob", "apiJob", "", "void"))), 33);
	//   34   70:aload_0         
	//   35   71:ldc1            #31  <String "method-execution">
	//   36   73:aload_0         
	//   37   74:ldc1            #33  <String "4">
	//   38   76:ldc1            #61  <String "onSubmitJobFailed">
	//   39   78:ldc1            #37  <String "com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter">
	//   40   80:ldc1            #63  <String "com.ibotta.android.service.api.job.SingleApiJob">
	//   41   82:ldc1            #41  <String "apiJob">
	//   42   84:ldc1            #43  <String "">
	//   43   86:ldc1            #45  <String "void">
	//   44   88:invokevirtual   #49  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   45   91:bipush          33
	//   46   93:invokevirtual   #53  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   47   96:putstatic       #65  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_2>
		ajc$tjp_3 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("4", "onSubmitJobSuccess", "com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter", "com.ibotta.android.service.api.job.SingleApiJob", "apiJob", "", "void"))), 38);
	//   48   99:aload_0         
	//   49  100:ldc1            #31  <String "method-execution">
	//   50  102:aload_0         
	//   51  103:ldc1            #33  <String "4">
	//   52  105:ldc1            #67  <String "onSubmitJobSuccess">
	//   53  107:ldc1            #37  <String "com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter">
	//   54  109:ldc1            #63  <String "com.ibotta.android.service.api.job.SingleApiJob">
	//   55  111:ldc1            #41  <String "apiJob">
	//   56  113:ldc1            #43  <String "">
	//   57  115:ldc1            #45  <String "void">
	//   58  117:invokevirtual   #49  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   59  120:bipush          38
	//   60  122:invokevirtual   #53  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   61  125:putstatic       #69  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_3>
	//   62  128:return          
	}

	protected void onFetchJobFailed(ApiJob apijob)
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, ((Object) (this)), ((Object) (this)), ((Object) (apijob)));
	//    0    0:getstatic       #59  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_1>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #75  <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object, Object)>
	//    5    9:astore_2        
		PasswordCacheAspect.aspectOf().before(joinpoint);
	//    6   10:invokestatic    #81  <Method PasswordCacheAspect PasswordCacheAspect.aspectOf()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #85  <Method void PasswordCacheAspect.before(org.aspectj.lang.JoinPoint)>
		super.onFetchJobFailed(apijob);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #87  <Method void AbstractLoadingMvpPresenter.onFetchJobFailed(ApiJob)>
	//   12   22:return          
	}

	protected void onFetchJobSuccess(ApiJob apijob)
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, ((Object) (this)), ((Object) (this)), ((Object) (apijob)));
	//    0    0:getstatic       #55  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #75  <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object, Object)>
	//    5    9:astore_2        
		PasswordCacheAspect.aspectOf().before(joinpoint);
	//    6   10:invokestatic    #81  <Method PasswordCacheAspect PasswordCacheAspect.aspectOf()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #85  <Method void PasswordCacheAspect.before(org.aspectj.lang.JoinPoint)>
		super.onFetchJobSuccess(apijob);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #90  <Method void AbstractLoadingMvpPresenter.onFetchJobSuccess(ApiJob)>
	//   12   22:return          
	}

	protected void onSubmitJobFailed(SingleApiJob singleapijob)
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, ((Object) (this)), ((Object) (this)), ((Object) (singleapijob)));
	//    0    0:getstatic       #65  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_2>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #75  <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object, Object)>
	//    5    9:astore_2        
		PasswordCacheAspect.aspectOf().before(joinpoint);
	//    6   10:invokestatic    #81  <Method PasswordCacheAspect PasswordCacheAspect.aspectOf()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #85  <Method void PasswordCacheAspect.before(org.aspectj.lang.JoinPoint)>
		super.onSubmitJobFailed(singleapijob);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #93  <Method void AbstractLoadingMvpPresenter.onSubmitJobFailed(SingleApiJob)>
	//   12   22:return          
	}

	protected void onSubmitJobSuccess(SingleApiJob singleapijob)
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, ((Object) (this)), ((Object) (this)), ((Object) (singleapijob)));
	//    0    0:getstatic       #69  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_3>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #75  <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object, Object)>
	//    5    9:astore_2        
		PasswordCacheAspect.aspectOf().before(joinpoint);
	//    6   10:invokestatic    #81  <Method PasswordCacheAspect PasswordCacheAspect.aspectOf()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #85  <Method void PasswordCacheAspect.before(org.aspectj.lang.JoinPoint)>
		super.onSubmitJobSuccess(singleapijob);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #95  <Method void AbstractLoadingMvpPresenter.onSubmitJobSuccess(SingleApiJob)>
	//   12   22:return          
	}

	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;

	static 
	{
		ajc$preClinit();
	//    0    0:invokestatic    #17  <Method void ajc$preClinit()>
	//*   1    3:return          
	}
}
