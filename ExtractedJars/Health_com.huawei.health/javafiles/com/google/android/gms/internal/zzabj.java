// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.google.android.gms.internal:
//			zzaae, zzabf

public class zzabj extends zzaae
{

	private zzabj(zzabf zzabf1)
	{
		super(zzabf1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzaae(zzabf)>
		zzazE = new TaskCompletionSource();
	//    3    5:aload_0         
	//    4    6:new             #13  <Class TaskCompletionSource>
	//    5    9:dup             
	//    6   10:invokespecial   #16  <Method void TaskCompletionSource()>
	//    7   13:putfield        #18  <Field TaskCompletionSource zzazE>
		zzaCR.zza("GmsAvailabilityHelper", ((zzabe) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field zzabf zzaCR>
	//   10   20:ldc1            #24  <String "GmsAvailabilityHelper">
	//   11   22:aload_0         
	//   12   23:invokeinterface #30  <Method void zzabf.zza(String, zzabe)>
	//   13   28:return          
	}

	public static zzabj zzu(Activity activity)
	{
		activity = ((Activity) (zzs(activity)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method zzabf zzs(Activity)>
	//    2    4:astore_0        
		zzabj zzabj1 = (zzabj)((zzabf) (activity)).zza("GmsAvailabilityHelper", com/google/android/gms/internal/zzabj);
	//    3    5:aload_0         
	//    4    6:ldc1            #24  <String "GmsAvailabilityHelper">
	//    5    8:ldc1            #2   <Class zzabj>
	//    6   10:invokeinterface #40  <Method zzabe zzabf.zza(String, Class)>
	//    7   15:checkcast       #2   <Class zzabj>
	//    8   18:astore_1        
		if(zzabj1 != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          49
		{
			if(zzabj1.zzazE.getTask().isComplete())
	//*  11   23:aload_1         
	//*  12   24:getfield        #18  <Field TaskCompletionSource zzazE>
	//*  13   27:invokevirtual   #44  <Method Task TaskCompletionSource.getTask()>
	//*  14   30:invokevirtual   #50  <Method boolean Task.isComplete()>
	//*  15   33:ifeq            47
				zzabj1.zzazE = new TaskCompletionSource();
	//   16   36:aload_1         
	//   17   37:new             #13  <Class TaskCompletionSource>
	//   18   40:dup             
	//   19   41:invokespecial   #16  <Method void TaskCompletionSource()>
	//   20   44:putfield        #18  <Field TaskCompletionSource zzazE>
			return zzabj1;
	//   21   47:aload_1         
	//   22   48:areturn         
		} else
		{
			return new zzabj(((zzabf) (activity)));
	//   23   49:new             #2   <Class zzabj>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:invokespecial   #51  <Method void zzabj(zzabf)>
	//   27   57:areturn         
		}
	}

	public Task getTask()
	{
		return zzazE.getTask();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TaskCompletionSource zzazE>
	//    2    4:invokevirtual   #44  <Method Task TaskCompletionSource.getTask()>
	//    3    7:areturn         
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void zzaae.onDestroy()>
		zzazE.setException(((Exception) (new CancellationException("Host activity was destroyed before Google Play services could be made available."))));
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field TaskCompletionSource zzazE>
	//    4    8:new             #58  <Class CancellationException>
	//    5   11:dup             
	//    6   12:ldc1            #60  <String "Host activity was destroyed before Google Play services could be made available.">
	//    7   14:invokespecial   #63  <Method void CancellationException(String)>
	//    8   17:invokevirtual   #67  <Method void TaskCompletionSource.setException(Exception)>
	//    9   20:return          
	}

	protected void zza(ConnectionResult connectionresult, int i)
	{
		zzazE.setException(((Exception) (zzb.zzl(connectionresult))));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TaskCompletionSource zzazE>
	//    2    4:aload_1         
	//    3    5:invokestatic    #74  <Method com.google.android.gms.common.api.zza zzb.zzl(ConnectionResult)>
	//    4    8:invokevirtual   #67  <Method void TaskCompletionSource.setException(Exception)>
	//    5   11:return          
	}

	public void zzk(ConnectionResult connectionresult)
	{
		zzb(connectionresult, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #79  <Method void zzb(ConnectionResult, int)>
	//    4    6:return          
	}

	protected void zzvx()
	{
		int i = zzazn.isGooglePlayServicesAvailable(((android.content.Context) (zzaCR.zzwV())));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field GoogleApiAvailability zzazn>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field zzabf zzaCR>
	//    4    8:invokeinterface #88  <Method Activity zzabf.zzwV()>
	//    5   13:invokevirtual   #94  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context)>
	//    6   16:istore_1        
		if(i == 0)
	//*   7   17:iload_1         
	//*   8   18:ifne            30
		{
			zzazE.setResult(((Object) (null)));
	//    9   21:aload_0         
	//   10   22:getfield        #18  <Field TaskCompletionSource zzazE>
	//   11   25:aconst_null     
	//   12   26:invokevirtual   #98  <Method void TaskCompletionSource.setResult(Object)>
			return;
	//   13   29:return          
		} else
		{
			zzk(new ConnectionResult(i, ((android.app.PendingIntent) (null))));
	//   14   30:aload_0         
	//   15   31:new             #100 <Class ConnectionResult>
	//   16   34:dup             
	//   17   35:iload_1         
	//   18   36:aconst_null     
	//   19   37:invokespecial   #103 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   20   40:invokevirtual   #105 <Method void zzk(ConnectionResult)>
			return;
	//   21   43:return          
		}
	}

	private TaskCompletionSource zzazE;
}
