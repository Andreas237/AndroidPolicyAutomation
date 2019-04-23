// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package androidx.work:
//			ListenableWorker

public final class PeriodicWorkRequestKt
{

	private static final PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long l, TimeUnit timeunit)
	{
		Intrinsics.reifiedOperationMarker(4, "W");
	//    0    0:iconst_4        
	//    1    1:ldc1            #30  <String "W">
	//    2    3:invokestatic    #36  <Method void Intrinsics.reifiedOperationMarker(int, String)>
		return new PeriodicWorkRequest.Builder(androidx/work/ListenableWorker, l, timeunit);
	//    3    6:new             #38  <Class PeriodicWorkRequest$Builder>
	//    4    9:dup             
	//    5   10:ldc1            #40  <Class ListenableWorker>
	//    6   12:lload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #44  <Method void PeriodicWorkRequest$Builder(Class, long, TimeUnit)>
	//    9   17:areturn         
	}

	private static final PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long l, TimeUnit timeunit, long l1, TimeUnit timeunit1)
	{
		Intrinsics.reifiedOperationMarker(4, "W");
	//    0    0:iconst_4        
	//    1    1:ldc1            #30  <String "W">
	//    2    3:invokestatic    #36  <Method void Intrinsics.reifiedOperationMarker(int, String)>
		return new PeriodicWorkRequest.Builder(androidx/work/ListenableWorker, l, timeunit, l1, timeunit1);
	//    3    6:new             #38  <Class PeriodicWorkRequest$Builder>
	//    4    9:dup             
	//    5   10:ldc1            #40  <Class ListenableWorker>
	//    6   12:lload_0         
	//    7   13:aload_2         
	//    8   14:lload_3         
	//    9   15:aload           5
	//   10   17:invokespecial   #51  <Method void PeriodicWorkRequest$Builder(Class, long, TimeUnit, long, TimeUnit)>
	//   11   20:areturn         
	}

	private static final PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration)
	{
		Intrinsics.reifiedOperationMarker(4, "W");
	//    0    0:iconst_4        
	//    1    1:ldc1            #30  <String "W">
	//    2    3:invokestatic    #36  <Method void Intrinsics.reifiedOperationMarker(int, String)>
		return new PeriodicWorkRequest.Builder(androidx/work/ListenableWorker, duration);
	//    3    6:new             #38  <Class PeriodicWorkRequest$Builder>
	//    4    9:dup             
	//    5   10:ldc1            #40  <Class ListenableWorker>
	//    6   12:aload_0         
	//    7   13:invokespecial   #59  <Method void PeriodicWorkRequest$Builder(Class, Duration)>
	//    8   16:areturn         
	}

	private static final PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration, Duration duration1)
	{
		Intrinsics.reifiedOperationMarker(4, "W");
	//    0    0:iconst_4        
	//    1    1:ldc1            #30  <String "W">
	//    2    3:invokestatic    #36  <Method void Intrinsics.reifiedOperationMarker(int, String)>
		return new PeriodicWorkRequest.Builder(androidx/work/ListenableWorker, duration, duration1);
	//    3    6:new             #38  <Class PeriodicWorkRequest$Builder>
	//    4    9:dup             
	//    5   10:ldc1            #40  <Class ListenableWorker>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #65  <Method void PeriodicWorkRequest$Builder(Class, Duration, Duration)>
	//    9   17:areturn         
	}
}
