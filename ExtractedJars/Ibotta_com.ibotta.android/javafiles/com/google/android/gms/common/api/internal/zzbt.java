// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzk, LifecycleFragment

public class zzbt extends zzk
{

	private zzbt(LifecycleFragment lifecyclefragment)
	{
		super(lifecyclefragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzk(LifecycleFragment)>
		zzln = new TaskCompletionSource();
	//    3    5:aload_0         
	//    4    6:new             #13  <Class TaskCompletionSource>
	//    5    9:dup             
	//    6   10:invokespecial   #16  <Method void TaskCompletionSource()>
	//    7   13:putfield        #18  <Field TaskCompletionSource zzln>
		mLifecycleFragment.addCallback("GmsAvailabilityHelper", ((LifecycleCallback) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field LifecycleFragment mLifecycleFragment>
	//   10   20:ldc1            #24  <String "GmsAvailabilityHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #30  <Method void LifecycleFragment.addCallback(String, LifecycleCallback)>
	//   13   28:return          
	}

	public static zzbt zzd(Activity activity)
	{
		activity = ((Activity) (getFragment(activity)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method LifecycleFragment getFragment(Activity)>
	//    2    4:astore_0        
		zzbt zzbt1 = (zzbt)((LifecycleFragment) (activity)).getCallbackOrNull("GmsAvailabilityHelper", com/google/android/gms/common/api/internal/zzbt);
	//    3    5:aload_0         
	//    4    6:ldc1            #24  <String "GmsAvailabilityHelper">
	//    5    8:ldc1            #2   <Class zzbt>
	//    6   10:invokeinterface #41  <Method LifecycleCallback LifecycleFragment.getCallbackOrNull(String, Class)>
	//    7   15:checkcast       #2   <Class zzbt>
	//    8   18:astore_1        
		if(zzbt1 != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          49
		{
			if(zzbt1.zzln.getTask().isComplete())
	//*  11   23:aload_1         
	//*  12   24:getfield        #18  <Field TaskCompletionSource zzln>
	//*  13   27:invokevirtual   #45  <Method Task TaskCompletionSource.getTask()>
	//*  14   30:invokevirtual   #51  <Method boolean Task.isComplete()>
	//*  15   33:ifeq            47
				zzbt1.zzln = new TaskCompletionSource();
	//   16   36:aload_1         
	//   17   37:new             #13  <Class TaskCompletionSource>
	//   18   40:dup             
	//   19   41:invokespecial   #16  <Method void TaskCompletionSource()>
	//   20   44:putfield        #18  <Field TaskCompletionSource zzln>
			return zzbt1;
	//   21   47:aload_1         
	//   22   48:areturn         
		} else
		{
			return new zzbt(((LifecycleFragment) (activity)));
	//   23   49:new             #2   <Class zzbt>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:invokespecial   #52  <Method void zzbt(LifecycleFragment)>
	//   27   57:areturn         
		}
	}

	public final Task getTask()
	{
		return zzln.getTask();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TaskCompletionSource zzln>
	//    2    4:invokevirtual   #45  <Method Task TaskCompletionSource.getTask()>
	//    3    7:areturn         
	}

	public final void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void zzk.onDestroy()>
		zzln.trySetException(((Exception) (new CancellationException("Host activity was destroyed before Google Play services could be made available."))));
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field TaskCompletionSource zzln>
	//    4    8:new             #59  <Class CancellationException>
	//    5   11:dup             
	//    6   12:ldc1            #61  <String "Host activity was destroyed before Google Play services could be made available.">
	//    7   14:invokespecial   #64  <Method void CancellationException(String)>
	//    8   17:invokevirtual   #68  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//    9   20:pop             
	//   10   21:return          
	}

	protected final void zza(ConnectionResult connectionresult, int i)
	{
		zzln.setException(((Exception) (ApiExceptionUtil.fromConnectionResult(connectionresult))));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TaskCompletionSource zzln>
	//    2    4:aload_1         
	//    3    5:invokestatic    #76  <Method com.google.android.gms.common.api.ApiException ApiExceptionUtil.fromConnectionResult(ConnectionResult)>
	//    4    8:invokevirtual   #80  <Method void TaskCompletionSource.setException(Exception)>
	//    5   11:return          
	}

	protected final void zzr()
	{
		int i = ((GoogleApiAvailabilityLight) (zzdg)).isGooglePlayServicesAvailable(((android.content.Context) (mLifecycleFragment.getLifecycleActivity())));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field com.google.android.gms.common.GoogleApiAvailability zzdg>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field LifecycleFragment mLifecycleFragment>
	//    4    8:invokeinterface #89  <Method Activity LifecycleFragment.getLifecycleActivity()>
	//    5   13:invokevirtual   #95  <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(android.content.Context)>
	//    6   16:istore_1        
		if(i == 0)
	//*   7   17:iload_1         
	//*   8   18:ifne            30
		{
			zzln.setResult(((Object) (null)));
	//    9   21:aload_0         
	//   10   22:getfield        #18  <Field TaskCompletionSource zzln>
	//   11   25:aconst_null     
	//   12   26:invokevirtual   #99  <Method void TaskCompletionSource.setResult(Object)>
			return;
	//   13   29:return          
		}
		if(!zzln.getTask().isComplete())
	//*  14   30:aload_0         
	//*  15   31:getfield        #18  <Field TaskCompletionSource zzln>
	//*  16   34:invokevirtual   #45  <Method Task TaskCompletionSource.getTask()>
	//*  17   37:invokevirtual   #51  <Method boolean Task.isComplete()>
	//*  18   40:ifne            57
			((zzk)this).zzb(new ConnectionResult(i, ((android.app.PendingIntent) (null))), 0);
	//   19   43:aload_0         
	//   20   44:new             #101 <Class ConnectionResult>
	//   21   47:dup             
	//   22   48:iload_1         
	//   23   49:aconst_null     
	//   24   50:invokespecial   #104 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   25   53:iconst_0        
	//   26   54:invokevirtual   #107 <Method void zzk.zzb(ConnectionResult, int)>
	//   27   57:return          
	}

	private TaskCompletionSource zzln;
}
