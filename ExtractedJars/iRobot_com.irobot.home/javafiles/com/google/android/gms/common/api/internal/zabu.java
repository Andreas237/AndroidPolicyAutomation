// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zal, LifecycleFragment

public class zabu extends zal
{

	private zabu(LifecycleFragment lifecyclefragment)
	{
		super(lifecyclefragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zal(LifecycleFragment)>
		zajo = new TaskCompletionSource();
	//    3    5:aload_0         
	//    4    6:new             #13  <Class TaskCompletionSource>
	//    5    9:dup             
	//    6   10:invokespecial   #16  <Method void TaskCompletionSource()>
	//    7   13:putfield        #18  <Field TaskCompletionSource zajo>
		mLifecycleFragment.addCallback("GmsAvailabilityHelper", ((LifecycleCallback) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field LifecycleFragment mLifecycleFragment>
	//   10   20:ldc1            #24  <String "GmsAvailabilityHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #30  <Method void LifecycleFragment.addCallback(String, LifecycleCallback)>
	//   13   28:return          
	}

	public static zabu zac(Activity activity)
	{
		activity = ((Activity) (getFragment(activity)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method LifecycleFragment getFragment(Activity)>
	//    2    4:astore_0        
		zabu zabu1 = (zabu)((LifecycleFragment) (activity)).getCallbackOrNull("GmsAvailabilityHelper", com/google/android/gms/common/api/internal/zabu);
	//    3    5:aload_0         
	//    4    6:ldc1            #24  <String "GmsAvailabilityHelper">
	//    5    8:ldc1            #2   <Class zabu>
	//    6   10:invokeinterface #41  <Method LifecycleCallback LifecycleFragment.getCallbackOrNull(String, Class)>
	//    7   15:checkcast       #2   <Class zabu>
	//    8   18:astore_1        
		if(zabu1 != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          49
		{
			if(zabu1.zajo.getTask().isComplete())
	//*  11   23:aload_1         
	//*  12   24:getfield        #18  <Field TaskCompletionSource zajo>
	//*  13   27:invokevirtual   #45  <Method Task TaskCompletionSource.getTask()>
	//*  14   30:invokevirtual   #51  <Method boolean Task.isComplete()>
	//*  15   33:ifeq            47
				zabu1.zajo = new TaskCompletionSource();
	//   16   36:aload_1         
	//   17   37:new             #13  <Class TaskCompletionSource>
	//   18   40:dup             
	//   19   41:invokespecial   #16  <Method void TaskCompletionSource()>
	//   20   44:putfield        #18  <Field TaskCompletionSource zajo>
			return zabu1;
	//   21   47:aload_1         
	//   22   48:areturn         
		} else
		{
			return new zabu(((LifecycleFragment) (activity)));
	//   23   49:new             #2   <Class zabu>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:invokespecial   #52  <Method void zabu(LifecycleFragment)>
	//   27   57:areturn         
		}
	}

	public final Task getTask()
	{
		return zajo.getTask();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TaskCompletionSource zajo>
	//    2    4:invokevirtual   #45  <Method Task TaskCompletionSource.getTask()>
	//    3    7:areturn         
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void zal.onDestroy()>
		zajo.trySetException(((Exception) (new CancellationException("Host activity was destroyed before Google Play services could be made available."))));
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field TaskCompletionSource zajo>
	//    4    8:new             #59  <Class CancellationException>
	//    5   11:dup             
	//    6   12:ldc1            #61  <String "Host activity was destroyed before Google Play services could be made available.">
	//    7   14:invokespecial   #64  <Method void CancellationException(String)>
	//    8   17:invokevirtual   #68  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//    9   20:pop             
	//   10   21:return          
	}

	protected final void zaa(ConnectionResult connectionresult, int i)
	{
		zajo.setException(((Exception) (ApiExceptionUtil.fromStatus(new Status(connectionresult.getErrorCode(), connectionresult.getErrorMessage(), connectionresult.getResolution())))));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TaskCompletionSource zajo>
	//    2    4:new             #72  <Class Status>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #78  <Method int ConnectionResult.getErrorCode()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #82  <Method String ConnectionResult.getErrorMessage()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #86  <Method android.app.PendingIntent ConnectionResult.getResolution()>
	//   10   20:invokespecial   #89  <Method void Status(int, String, android.app.PendingIntent)>
	//   11   23:invokestatic    #95  <Method com.google.android.gms.common.api.ApiException ApiExceptionUtil.fromStatus(Status)>
	//   12   26:invokevirtual   #99  <Method void TaskCompletionSource.setException(Exception)>
	//   13   29:return          
	}

	protected final void zao()
	{
		int i = zacc.isGooglePlayServicesAvailable(((android.content.Context) (mLifecycleFragment.getLifecycleActivity())));
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field GoogleApiAvailability zacc>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field LifecycleFragment mLifecycleFragment>
	//    4    8:invokeinterface #108 <Method Activity LifecycleFragment.getLifecycleActivity()>
	//    5   13:invokevirtual   #114 <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
	//    6   16:istore_1        
		if(i == 0)
	//*   7   17:iload_1         
	//*   8   18:ifne            30
		{
			zajo.setResult(((Object) (null)));
	//    9   21:aload_0         
	//   10   22:getfield        #18  <Field TaskCompletionSource zajo>
	//   11   25:aconst_null     
	//   12   26:invokevirtual   #118 <Method void TaskCompletionSource.setResult(Object)>
			return;
	//   13   29:return          
		}
		if(!zajo.getTask().isComplete())
	//*  14   30:aload_0         
	//*  15   31:getfield        #18  <Field TaskCompletionSource zajo>
	//*  16   34:invokevirtual   #45  <Method Task TaskCompletionSource.getTask()>
	//*  17   37:invokevirtual   #51  <Method boolean Task.isComplete()>
	//*  18   40:ifne            57
			((zal)this).zab(new ConnectionResult(i, ((android.app.PendingIntent) (null))), 0);
	//   19   43:aload_0         
	//   20   44:new             #74  <Class ConnectionResult>
	//   21   47:dup             
	//   22   48:iload_1         
	//   23   49:aconst_null     
	//   24   50:invokespecial   #121 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   25   53:iconst_0        
	//   26   54:invokevirtual   #124 <Method void zal.zab(ConnectionResult, int)>
	//   27   57:return          
	}

	private TaskCompletionSource zajo;
}
