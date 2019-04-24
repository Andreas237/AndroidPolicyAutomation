// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzaad, zzabf, zzabe, zzabr, 
//			zzabn, zzabk

public abstract class zzzq
{
	private static abstract class zza extends zzzq
	{

		public void zza(zzaad zzaad, boolean flag)
		{
		//    0    0:return          
		}

		public final void zza(zzaap.zza zza1)
			throws DeadObjectException
		{
			try
			{
				zzb(zza1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method void zzb(zzaap$zza)>
				return;
		//    3    5:return          
			}
			// Misplaced declaration of an exception variable
			catch(zzaap.zza zza1)
		//*   4    6:astore_1        
			{
				zzy(zzzq.zzb(((RemoteException) (zza1))));
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:invokestatic    #32  <Method Status zzzq.zzb(RemoteException)>
		//    8   12:invokevirtual   #36  <Method void zzy(Status)>
				throw zza1;
		//    9   15:aload_1         
		//   10   16:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(zzaap.zza zza1)
		//*  11   17:astore_1        
			{
				zzy(zzzq.zzb(((RemoteException) (zza1))));
		//   12   18:aload_0         
		//   13   19:aload_1         
		//   14   20:invokestatic    #32  <Method Status zzzq.zzb(RemoteException)>
		//   15   23:invokevirtual   #36  <Method void zzy(Status)>
			}
		//   16   26:return          
		}

		protected abstract void zzb(zzaap.zza zza1)
			throws RemoteException;

		public void zzy(Status status)
		{
			zzayo.trySetException(((Exception) (new com.google.android.gms.common.api.zza(status))));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field TaskCompletionSource zzayo>
		//    2    4:new             #40  <Class com.google.android.gms.common.api.zza>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #42  <Method void com.google.android.gms.common.api.zza(Status)>
		//    6   12:invokevirtual   #48  <Method boolean TaskCompletionSource.trySetException(Exception)>
		//    7   15:pop             
		//    8   16:return          
		}

		protected final TaskCompletionSource zzayo;

		public zza(int i, TaskCompletionSource taskcompletionsource)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #13  <Method void zzzq(int)>
			zzayo = taskcompletionsource;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #15  <Field TaskCompletionSource zzayo>
		//    6   10:return          
		}
	}

	public static class zzb extends zzzq
	{

		public void zza(zzaad zzaad1, boolean flag)
		{
			zzaad1.zza(((zzzx) (zzayp)), flag);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #16  <Field zzzv$zza zzayp>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #27  <Method void zzaad.zza(zzzx, boolean)>
		//    5    9:return          
		}

		public void zza(zzaap.zza zza1)
			throws DeadObjectException
		{
			zzayp.zzb(((com.google.android.gms.common.api.Api.zzb) (zza1.zzvr())));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field zzzv$zza zzayp>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method com.google.android.gms.common.api.Api$zze zzaap$zza.zzvr()>
		//    4    8:invokevirtual   #42  <Method void zzzv$zza.zzb(com.google.android.gms.common.api.Api$zzb)>
		//    5   11:return          
		}

		public void zzy(Status status)
		{
			zzayp.zzA(status);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field zzzv$zza zzayp>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #49  <Method void zzzv$zza.zzA(Status)>
		//    4    8:return          
		}

		protected final zzzv.zza zzayp;

		public zzb(int i, zzzv.zza zza1)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #14  <Method void zzzq(int)>
			zzayp = zza1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #16  <Field zzzv$zza zzayp>
		//    6   10:return          
		}
	}

	public static final class zzc extends zza
	{

		public volatile void zza(zzaad zzaad, boolean flag)
		{
			super.zza(zzaad, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #34  <Method void zzzq$zza.zza(zzaad, boolean)>
		//    4    6:return          
		}

		public void zzb(zzaap.zza zza1)
			throws RemoteException
		{
			if(zzayq.zzwp() != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field zzabe zzayq>
		//*   2    4:invokevirtual   #45  <Method zzaaz$zzb zzabe.zzwp()>
		//*   3    7:ifnull          42
				zza1.zzwc().put(((Object) (zzayq.zzwp())), ((Object) (new zzabf(zzayq, zzayr))));
		//    4   10:aload_1         
		//    5   11:invokevirtual   #51  <Method Map zzaap$zza.zzwc()>
		//    6   14:aload_0         
		//    7   15:getfield        #23  <Field zzabe zzayq>
		//    8   18:invokevirtual   #45  <Method zzaaz$zzb zzabe.zzwp()>
		//    9   21:new             #20  <Class zzabf>
		//   10   24:dup             
		//   11   25:aload_0         
		//   12   26:getfield        #23  <Field zzabe zzayq>
		//   13   29:aload_0         
		//   14   30:getfield        #26  <Field zzabr zzayr>
		//   15   33:invokespecial   #54  <Method void zzabf(zzabe, zzabr)>
		//   16   36:invokeinterface #60  <Method Object Map.put(Object, Object)>
		//   17   41:pop             
		//   18   42:return          
		}

		public volatile void zzy(Status status)
		{
			super.zzy(status);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #66  <Method void zzzq$zza.zzy(Status)>
		//    3    5:return          
		}

		public final zzabe zzayq;
		public final zzabr zzayr;

		public zzc(zzabf zzabf1, TaskCompletionSource taskcompletionsource)
		{
			super(3, taskcompletionsource);
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:aload_2         
		//    3    3:invokespecial   #18  <Method void zzzq$zza(int, TaskCompletionSource)>
			zzayq = zzabf1.zzayq;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:getfield        #22  <Field zzabe zzabf.zzayq>
		//    7   11:putfield        #23  <Field zzabe zzayq>
			zzayr = zzabf1.zzayr;
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:getfield        #25  <Field zzabr zzabf.zzayr>
		//   11   19:putfield        #26  <Field zzabr zzayr>
		//   12   22:return          
		}
	}

	public static final class zzd extends zzzq
	{

		public void zza(zzaad zzaad1, boolean flag)
		{
			zzaad1.zza(zzayo, flag);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #21  <Field TaskCompletionSource zzayo>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #36  <Method void zzaad.zza(TaskCompletionSource, boolean)>
		//    5    9:return          
		}

		public void zza(zzaap.zza zza1)
			throws DeadObjectException
		{
			try
			{
				zzays.zza(((com.google.android.gms.common.api.Api.zzb) (zza1.zzvr())), zzayo);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field zzabn zzays>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #48  <Method com.google.android.gms.common.api.Api$zze zzaap$zza.zzvr()>
		//    4    8:aload_0         
		//    5    9:getfield        #21  <Field TaskCompletionSource zzayo>
		//    6   12:invokevirtual   #53  <Method void zzabn.zza(com.google.android.gms.common.api.Api$zzb, TaskCompletionSource)>
				return;
		//    7   15:return          
			}
			// Misplaced declaration of an exception variable
			catch(zzaap.zza zza1)
		//*   8   16:astore_1        
			{
				throw zza1;
		//    9   17:aload_1         
		//   10   18:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(zzaap.zza zza1)
		//*  11   19:astore_1        
			{
				zzy(zzzq.zzb(((RemoteException) (zza1))));
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:invokestatic    #57  <Method Status zzzq.zzb(RemoteException)>
		//   15   25:invokevirtual   #61  <Method void zzy(Status)>
			}
		//   16   28:return          
		}

		public void zzy(Status status)
		{
			zzayo.trySetException(zzayt.zzz(status));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field TaskCompletionSource zzayo>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field zzabk zzayt>
		//    4    8:aload_1         
		//    5    9:invokeinterface #69  <Method Exception zzabk.zzz(Status)>
		//    6   14:invokevirtual   #75  <Method boolean TaskCompletionSource.trySetException(Exception)>
		//    7   17:pop             
		//    8   18:return          
		}

		private final TaskCompletionSource zzayo;
		private final zzabn zzays;
		private final zzabk zzayt;

		public zzd(int i, zzabn zzabn1, TaskCompletionSource taskcompletionsource, zzabk zzabk1)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #19  <Method void zzzq(int)>
			zzayo = taskcompletionsource;
		//    3    5:aload_0         
		//    4    6:aload_3         
		//    5    7:putfield        #21  <Field TaskCompletionSource zzayo>
			zzays = zzabn1;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #23  <Field zzabn zzays>
			zzayt = zzabk1;
		//    9   15:aload_0         
		//   10   16:aload           4
		//   11   18:putfield        #25  <Field zzabk zzayt>
		//   12   21:return          
		}
	}

	public static final class zze extends zza
	{

		public volatile void zza(zzaad zzaad, boolean flag)
		{
			super.zza(zzaad, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #25  <Method void zzzq$zza.zza(zzaad, boolean)>
		//    4    6:return          
		}

		public void zzb(zzaap.zza zza1)
			throws RemoteException
		{
			zza1 = ((zzaap.zza) ((zzabf)zza1.zzwc().remove(((Object) (zzayu)))));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #36  <Method Map zzaap$zza.zzwc()>
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field zzaaz$zzb zzayu>
		//    4    8:invokeinterface #42  <Method Object Map.remove(Object)>
		//    5   13:checkcast       #44  <Class zzabf>
		//    6   16:astore_1        
			if(zza1 != null)
		//*   7   17:aload_1         
		//*   8   18:ifnull          29
			{
				((zzabf) (zza1)).zzayq.zzwq();
		//    9   21:aload_1         
		//   10   22:getfield        #48  <Field zzabe zzabf.zzayq>
		//   11   25:invokevirtual   #54  <Method void zzabe.zzwq()>
				return;
		//   12   28:return          
			} else
			{
				Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", ((Throwable) (new Exception())));
		//   13   29:ldc1            #56  <String "UnregisterListenerTask">
		//   14   31:ldc1            #58  <String "Received call to unregister a listener without a matching registration call.">
		//   15   33:new             #60  <Class Exception>
		//   16   36:dup             
		//   17   37:invokespecial   #62  <Method void Exception()>
		//   18   40:invokestatic    #68  <Method int Log.wtf(String, String, Throwable)>
		//   19   43:pop             
				zzayo.trySetException(((Exception) (new com.google.android.gms.common.api.zza(Status.zzayj))));
		//   20   44:aload_0         
		//   21   45:getfield        #72  <Field TaskCompletionSource zzayo>
		//   22   48:new             #74  <Class com.google.android.gms.common.api.zza>
		//   23   51:dup             
		//   24   52:getstatic       #80  <Field Status Status.zzayj>
		//   25   55:invokespecial   #83  <Method void com.google.android.gms.common.api.zza(Status)>
		//   26   58:invokevirtual   #89  <Method boolean TaskCompletionSource.trySetException(Exception)>
		//   27   61:pop             
				return;
		//   28   62:return          
			}
		}

		public volatile void zzy(Status status)
		{
			super.zzy(status);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #94  <Method void zzzq$zza.zzy(Status)>
		//    3    5:return          
		}

		public final zzaaz.zzb zzayu;

		public zze(zzaaz.zzb zzb1, TaskCompletionSource taskcompletionsource)
		{
			super(4, taskcompletionsource);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void zzzq$zza(int, TaskCompletionSource)>
			zzayu = zzb1;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:putfield        #17  <Field zzaaz$zzb zzayu>
		//    7   11:return          
		}
	}


	public zzzq(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzanR = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int zzanR>
	//    5    9:return          
	}

	private static Status zza(RemoteException remoteexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_1        
		if(zzs.zzyB() && (remoteexception instanceof TransactionTooLargeException))
	//*   4    8:invokestatic    #39  <Method boolean zzs.zzyB()>
	//*   5   11:ifeq            28
	//*   6   14:aload_0         
	//*   7   15:instanceof      #41  <Class TransactionTooLargeException>
	//*   8   18:ifeq            28
			stringbuilder.append("TransactionTooLargeException: ");
	//    9   21:aload_1         
	//   10   22:ldc1            #43  <String "TransactionTooLargeException: ">
	//   11   24:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		stringbuilder.append(remoteexception.getLocalizedMessage());
	//   13   28:aload_1         
	//   14   29:aload_0         
	//   15   30:invokevirtual   #53  <Method String RemoteException.getLocalizedMessage()>
	//   16   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		return new Status(8, stringbuilder.toString());
	//   18   37:new             #55  <Class Status>
	//   19   40:dup             
	//   20   41:bipush          8
	//   21   43:aload_1         
	//   22   44:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   23   47:invokespecial   #61  <Method void Status(int, String)>
	//   24   50:areturn         
	}

	static Status zzb(RemoteException remoteexception)
	{
		return zza(remoteexception);
	//    0    0:aload_0         
	//    1    1:invokestatic    #63  <Method Status zza(RemoteException)>
	//    2    4:areturn         
	}

	public abstract void zza(zzaad zzaad, boolean flag);

	public abstract void zza(zzaap.zza zza1)
		throws DeadObjectException;

	public abstract void zzy(Status status);

	public final int zzanR;
}
