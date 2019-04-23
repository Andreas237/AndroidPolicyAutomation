// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import androidx.work.*;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.api:
//			LocationWorker

public static final class LocationWorker$Companion
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
		obj = ((Object) (((androidx.work.r)((androidx.work.r)(new androidx.work.r(io/radar/sdk/api/LocationWorker)).setConstraints(((androidx.work.Constraints) (obj)))).setInitialDelay(1L, TimeUnit.MINUTES).addTag("radar_work_tag")).build()));
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

	private LocationWorker$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public LocationWorker$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void LocationWorker$Companion()>
	//    2    4:return          
	}
}
