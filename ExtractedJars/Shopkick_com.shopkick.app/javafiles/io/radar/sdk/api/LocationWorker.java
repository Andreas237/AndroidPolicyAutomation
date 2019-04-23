// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.content.Context;
import androidx.work.*;
import io.radar.sdk.Radar;
import io.radar.sdk.internal.RadarLogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.*;

public final class LocationWorker extends Worker
{
	public static final class Companion
	{

		public final void cancelWork$sdk_release()
		{
			WorkManager.getInstance().cancelAllWorkByTag("radar_work_tag");
		//    0    0:invokestatic    #39  <Method WorkManager WorkManager.getInstance()>
		//    1    3:ldc1            #41  <String "radar_work_tag">
		//    2    5:invokevirtual   #45  <Method androidx.work.Operation WorkManager.cancelAllWorkByTag(String)>
		//    3    8:pop             
		//    4    9:return          
		}

		public final void scheduleWork$sdk_release()
		{
			Object obj = ((Object) ((new androidx.work.Constraints.Builder()).setRequiredNetworkType(NetworkType.CONNECTED).build()));
		//    0    0:new             #47  <Class androidx.work.Constraints$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #48  <Method void androidx.work.Constraints$Builder()>
		//    3    7:getstatic       #54  <Field NetworkType NetworkType.CONNECTED>
		//    4   10:invokevirtual   #58  <Method androidx.work.Constraints$Builder androidx.work.Constraints$Builder.setRequiredNetworkType(NetworkType)>
		//    5   13:invokevirtual   #62  <Method androidx.work.Constraints androidx.work.Constraints$Builder.build()>
		//    6   16:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(obj, "Constraints.Builder()\n  \u2026NNECTED)\n        .build()");
		//    7   17:aload_1         
		//    8   18:ldc1            #64  <String "Constraints.Builder()\n  \u2026NNECTED)\n        .build()">
		//    9   20:invokestatic    #70  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			obj = ((Object) (((androidx.work.OneTimeWorkRequest.Builder)((androidx.work.OneTimeWorkRequest.Builder)(new androidx.work.OneTimeWorkRequest.Builder(io/radar/sdk/api/LocationWorker)).setConstraints(((androidx.work.Constraints) (obj)))).setInitialDelay(1L, TimeUnit.MINUTES).addTag("radar_work_tag")).build()));
		//   10   23:new             #72  <Class androidx.work.OneTimeWorkRequest$Builder>
		//   11   26:dup             
		//   12   27:ldc1            #6   <Class LocationWorker>
		//   13   29:invokespecial   #75  <Method void androidx.work.OneTimeWorkRequest$Builder(Class)>
		//   14   32:aload_1         
		//   15   33:invokevirtual   #79  <Method androidx.work.WorkRequest$Builder androidx.work.OneTimeWorkRequest$Builder.setConstraints(androidx.work.Constraints)>
		//   16   36:checkcast       #72  <Class androidx.work.OneTimeWorkRequest$Builder>
		//   17   39:lconst_1        
		//   18   40:getstatic       #85  <Field TimeUnit TimeUnit.MINUTES>
		//   19   43:invokevirtual   #89  <Method androidx.work.OneTimeWorkRequest$Builder androidx.work.OneTimeWorkRequest$Builder.setInitialDelay(long, TimeUnit)>
		//   20   46:ldc1            #41  <String "radar_work_tag">
		//   21   48:invokevirtual   #93  <Method androidx.work.WorkRequest$Builder androidx.work.OneTimeWorkRequest$Builder.addTag(String)>
		//   22   51:checkcast       #72  <Class androidx.work.OneTimeWorkRequest$Builder>
		//   23   54:invokevirtual   #96  <Method WorkRequest androidx.work.OneTimeWorkRequest$Builder.build()>
		//   24   57:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(obj, "OneTimeWorkRequestBuilde\u2026ORK_TAG)\n        .build()");
		//   25   58:aload_1         
		//   26   59:ldc1            #98  <String "OneTimeWorkRequestBuilde\u2026ORK_TAG)\n        .build()">
		//   27   61:invokestatic    #70  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			obj = ((Object) ((OneTimeWorkRequest)obj));
		//   28   64:aload_1         
		//   29   65:checkcast       #100 <Class OneTimeWorkRequest>
		//   30   68:astore_1        
			WorkManager.getInstance().enqueue((WorkRequest)obj);
		//   31   69:invokestatic    #39  <Method WorkManager WorkManager.getInstance()>
		//   32   72:aload_1         
		//   33   73:checkcast       #102 <Class WorkRequest>
		//   34   76:invokevirtual   #106 <Method androidx.work.Operation WorkManager.enqueue(WorkRequest)>
		//   35   79:pop             
		//   36   80:return          
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void LocationWorker$Companion()>
		//    2    4:return          
		}
	}


	public LocationWorker(Context context, WorkerParameters workerparameters)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #46  <String "context">
	//    2    3:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (workerparameters)), "params");
	//    3    6:aload_2         
	//    4    7:ldc1            #53  <String "params">
	//    5    9:invokestatic    #52  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super(context, workerparameters);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #55  <Method void Worker(Context, WorkerParameters)>
	//   10   18:return          
	}

	public androidx.work.ListenableWorker.Result doWork()
	{
		CountDownLatch countdownlatch = new CountDownLatch(1);
	//    0    0:new             #59  <Class CountDownLatch>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #62  <Method void CountDownLatch(int)>
	//    4    8:astore_1        
		RadarLogger.d$default(RadarLogger.INSTANCE, "Worker started - retrying failed stop", ((Throwable) (null)), 2, ((Object) (null)));
	//    5    9:getstatic       #68  <Field RadarLogger RadarLogger.INSTANCE>
	//    6   12:ldc1            #70  <String "Worker started - retrying failed stop">
	//    7   14:aconst_null     
	//    8   15:iconst_2        
	//    9   16:aconst_null     
	//   10   17:invokestatic    #74  <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
		Radar.INSTANCE.retryFailedStop$sdk_release((Function0)new Function0(countdownlatch) {

			public volatile Object invoke()
			{
				invoke();
			//    0    0:aload_0         
			//    1    1:invokevirtual   #40  <Method void invoke()>
				return ((Object) (Unit.INSTANCE));
			//    2    4:getstatic       #46  <Field Unit Unit.INSTANCE>
			//    3    7:areturn         
			}

			public final void invoke()
			{
				$countDownLatch.countDown();
			//    0    0:aload_0         
			//    1    1:getfield        #32  <Field CountDownLatch $countDownLatch>
			//    2    4:invokevirtual   #51  <Method void CountDownLatch.countDown()>
			//    3    7:return          
			}

			final CountDownLatch $countDownLatch;

			
			{
				$countDownLatch = countdownlatch;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #32  <Field CountDownLatch $countDownLatch>
				super(0);
			//    3    5:aload_0         
			//    4    6:iconst_0        
			//    5    7:invokespecial   #35  <Method void Lambda(int)>
			//    6   10:return          
			}
		}
);
	//   11   20:getstatic       #79  <Field Radar Radar.INSTANCE>
	//   12   23:new             #9   <Class LocationWorker$doWork$1>
	//   13   26:dup             
	//   14   27:aload_1         
	//   15   28:invokespecial   #82  <Method void LocationWorker$doWork$1(CountDownLatch)>
	//   16   31:checkcast       #84  <Class Function0>
	//   17   34:invokevirtual   #88  <Method void Radar.retryFailedStop$sdk_release(Function0)>
		if(countdownlatch.await(10L, TimeUnit.SECONDS))
	//*  18   37:aload_1         
	//*  19   38:ldc2w           #89  <Long 10L>
	//*  20   41:getstatic       #96  <Field TimeUnit TimeUnit.SECONDS>
	//*  21   44:invokevirtual   #100 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//*  22   47:ifeq            62
		{
			androidx.work.ListenableWorker.Result result = androidx.work.ListenableWorker.Result.success();
	//   23   50:invokestatic    #105 <Method androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.success()>
	//   24   53:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (result)), "Result.success()");
	//   25   54:aload_1         
	//   26   55:ldc1            #107 <String "Result.success()">
	//   27   57:invokestatic    #110 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return result;
	//   28   60:aload_1         
	//   29   61:areturn         
		} else
		{
			androidx.work.ListenableWorker.Result result1 = androidx.work.ListenableWorker.Result.failure();
	//   30   62:invokestatic    #113 <Method androidx.work.ListenableWorker$Result androidx.work.ListenableWorker$Result.failure()>
	//   31   65:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (result1)), "Result.failure()");
	//   32   66:aload_1         
	//   33   67:ldc1            #115 <String "Result.failure()">
	//   34   69:invokestatic    #110 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return result1;
	//   35   72:aload_1         
	//   36   73:areturn         
		}
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	private static final String WORK_TAG = "radar_work_tag";

	static 
	{
	//    0    0:new             #6   <Class LocationWorker$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #41  <Method void LocationWorker$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #43  <Field LocationWorker$Companion Companion>
	//*   5   11:return          
	}
}
