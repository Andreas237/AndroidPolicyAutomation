// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.zzt;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzaal, zzabn, zzabm, zzabz, 
//			zzabv, zzabs

public abstract class zzzx
{
	static abstract class zza extends zzzx
	{

		public void zza(zzaal zzaal, boolean flag)
		{
		//    0    0:return          
		}

		public final void zza(zzaax.zza zza1)
			throws DeadObjectException
		{
			try
			{
				zzb(zza1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method void zzb(zzaax$zza)>
				return;
		//    3    5:return          
			}
			// Misplaced declaration of an exception variable
			catch(zzaax.zza zza1)
		//*   4    6:astore_1        
			{
				zzz(zzzx.zzb(((RemoteException) (zza1))));
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:invokestatic    #32  <Method Status zzzx.zzb(RemoteException)>
		//    8   12:invokevirtual   #36  <Method void zzz(Status)>
				throw zza1;
		//    9   15:aload_1         
		//   10   16:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(zzaax.zza zza1)
		//*  11   17:astore_1        
			{
				zzz(zzzx.zzb(((RemoteException) (zza1))));
		//   12   18:aload_0         
		//   13   19:aload_1         
		//   14   20:invokestatic    #32  <Method Status zzzx.zzb(RemoteException)>
		//   15   23:invokevirtual   #36  <Method void zzz(Status)>
			}
		//   16   26:return          
		}

		protected abstract void zzb(zzaax.zza zza1)
			throws RemoteException;

		public void zzz(Status status)
		{
			zzazE.trySetException(((Exception) (new com.google.android.gms.common.api.zza(status))));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field TaskCompletionSource zzazE>
		//    2    4:new             #40  <Class com.google.android.gms.common.api.zza>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #42  <Method void com.google.android.gms.common.api.zza(Status)>
		//    6   12:invokevirtual   #48  <Method boolean TaskCompletionSource.trySetException(Exception)>
		//    7   15:pop             
		//    8   16:return          
		}

		protected final TaskCompletionSource zzazE;

		public zza(int i, TaskCompletionSource taskcompletionsource)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #13  <Method void zzzx(int)>
			zzazE = taskcompletionsource;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #15  <Field TaskCompletionSource zzazE>
		//    6   10:return          
		}
	}

	public static class zzb extends zzzx
	{

		public void zza(zzaal zzaal1, boolean flag)
		{
			zzaal1.zza(((zzaaf) (zzazF)), flag);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #16  <Field zzaad$zza zzazF>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #27  <Method void zzaal.zza(zzaaf, boolean)>
		//    5    9:return          
		}

		public void zza(zzaax.zza zza1)
			throws DeadObjectException
		{
			zzazF.zzb(((com.google.android.gms.common.api.Api.zzb) (zza1.zzvU())));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field zzaad$zza zzazF>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method com.google.android.gms.common.api.Api$zze zzaax$zza.zzvU()>
		//    4    8:invokevirtual   #42  <Method void zzaad$zza.zzb(com.google.android.gms.common.api.Api$zzb)>
		//    5   11:return          
		}

		public void zzz(Status status)
		{
			zzazF.zzB(status);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field zzaad$zza zzazF>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #49  <Method void zzaad$zza.zzB(Status)>
		//    4    8:return          
		}

		protected final zzaad.zza zzazF;

		public zzb(int i, zzaad.zza zza1)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #14  <Method void zzzx(int)>
			zzazF = zza1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #16  <Field zzaad$zza zzazF>
		//    6   10:return          
		}
	}

	public static final class zzc extends zza
	{

		public volatile void zza(zzaal zzaal, boolean flag)
		{
			super.zza(zzaal, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #34  <Method void zzzx$zza.zza(zzaal, boolean)>
		//    4    6:return          
		}

		public void zzb(zzaax.zza zza1)
			throws RemoteException
		{
			if(zzazG.zzwW() != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field zzabm zzazG>
		//*   2    4:invokevirtual   #45  <Method zzabh$zzb zzabm.zzwW()>
		//*   3    7:ifnull          42
				zza1.zzwI().put(((Object) (zzazG.zzwW())), ((Object) (new zzabn(zzazG, zzazH))));
		//    4   10:aload_1         
		//    5   11:invokevirtual   #51  <Method Map zzaax$zza.zzwI()>
		//    6   14:aload_0         
		//    7   15:getfield        #23  <Field zzabm zzazG>
		//    8   18:invokevirtual   #45  <Method zzabh$zzb zzabm.zzwW()>
		//    9   21:new             #20  <Class zzabn>
		//   10   24:dup             
		//   11   25:aload_0         
		//   12   26:getfield        #23  <Field zzabm zzazG>
		//   13   29:aload_0         
		//   14   30:getfield        #26  <Field zzabz zzazH>
		//   15   33:invokespecial   #54  <Method void zzabn(zzabm, zzabz)>
		//   16   36:invokeinterface #60  <Method Object Map.put(Object, Object)>
		//   17   41:pop             
		//   18   42:return          
		}

		public volatile void zzz(Status status)
		{
			super.zzz(status);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #66  <Method void zzzx$zza.zzz(Status)>
		//    3    5:return          
		}

		public final zzabm zzazG;
		public final zzabz zzazH;

		public zzc(zzabn zzabn1, TaskCompletionSource taskcompletionsource)
		{
			super(3, taskcompletionsource);
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:aload_2         
		//    3    3:invokespecial   #18  <Method void zzzx$zza(int, TaskCompletionSource)>
			zzazG = zzabn1.zzazG;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:getfield        #22  <Field zzabm zzabn.zzazG>
		//    7   11:putfield        #23  <Field zzabm zzazG>
			zzazH = zzabn1.zzazH;
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:getfield        #25  <Field zzabz zzabn.zzazH>
		//   11   19:putfield        #26  <Field zzabz zzazH>
		//   12   22:return          
		}
	}

	public static final class zzd extends zzzx
	{

		public void zza(zzaal zzaal1, boolean flag)
		{
			zzaal1.zza(zzazE, flag);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #21  <Field TaskCompletionSource zzazE>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #36  <Method void zzaal.zza(TaskCompletionSource, boolean)>
		//    5    9:return          
		}

		public void zza(zzaax.zza zza1)
			throws DeadObjectException
		{
			try
			{
				zzazI.zza(((com.google.android.gms.common.api.Api.zzb) (zza1.zzvU())), zzazE);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field zzabv zzazI>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #48  <Method com.google.android.gms.common.api.Api$zze zzaax$zza.zzvU()>
		//    4    8:aload_0         
		//    5    9:getfield        #21  <Field TaskCompletionSource zzazE>
		//    6   12:invokevirtual   #53  <Method void zzabv.zza(com.google.android.gms.common.api.Api$zzb, TaskCompletionSource)>
				return;
		//    7   15:return          
			}
			// Misplaced declaration of an exception variable
			catch(zzaax.zza zza1)
		//*   8   16:astore_1        
			{
				throw zza1;
		//    9   17:aload_1         
		//   10   18:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(zzaax.zza zza1)
		//*  11   19:astore_1        
			{
				zzz(zzzx.zzb(((RemoteException) (zza1))));
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:invokestatic    #57  <Method Status zzzx.zzb(RemoteException)>
		//   15   25:invokevirtual   #61  <Method void zzz(Status)>
			}
		//   16   28:return          
		}

		public void zzz(Status status)
		{
			zzazE.trySetException(zzazJ.zzA(status));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field TaskCompletionSource zzazE>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field zzabs zzazJ>
		//    4    8:aload_1         
		//    5    9:invokeinterface #69  <Method Exception zzabs.zzA(Status)>
		//    6   14:invokevirtual   #75  <Method boolean TaskCompletionSource.trySetException(Exception)>
		//    7   17:pop             
		//    8   18:return          
		}

		private final TaskCompletionSource zzazE;
		private final zzabv zzazI;
		private final zzabs zzazJ;

		public zzd(int i, zzabv zzabv1, TaskCompletionSource taskcompletionsource, zzabs zzabs1)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #19  <Method void zzzx(int)>
			zzazE = taskcompletionsource;
		//    3    5:aload_0         
		//    4    6:aload_3         
		//    5    7:putfield        #21  <Field TaskCompletionSource zzazE>
			zzazI = zzabv1;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #23  <Field zzabv zzazI>
			zzazJ = zzabs1;
		//    9   15:aload_0         
		//   10   16:aload           4
		//   11   18:putfield        #25  <Field zzabs zzazJ>
		//   12   21:return          
		}
	}

	public static final class zze extends zza
	{

		public volatile void zza(zzaal zzaal, boolean flag)
		{
			super.zza(zzaal, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #25  <Method void zzzx$zza.zza(zzaal, boolean)>
		//    4    6:return          
		}

		public void zzb(zzaax.zza zza1)
			throws RemoteException
		{
			zza1 = ((zzaax.zza) ((zzabn)zza1.zzwI().remove(((Object) (zzazK)))));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #36  <Method Map zzaax$zza.zzwI()>
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field zzabh$zzb zzazK>
		//    4    8:invokeinterface #42  <Method Object Map.remove(Object)>
		//    5   13:checkcast       #44  <Class zzabn>
		//    6   16:astore_1        
			if(zza1 != null)
		//*   7   17:aload_1         
		//*   8   18:ifnull          29
			{
				((zzabn) (zza1)).zzazG.zzwX();
		//    9   21:aload_1         
		//   10   22:getfield        #48  <Field zzabm zzabn.zzazG>
		//   11   25:invokevirtual   #54  <Method void zzabm.zzwX()>
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
				zzazE.trySetException(((Exception) (new com.google.android.gms.common.api.zza(Status.zzazz))));
		//   20   44:aload_0         
		//   21   45:getfield        #72  <Field TaskCompletionSource zzazE>
		//   22   48:new             #74  <Class com.google.android.gms.common.api.zza>
		//   23   51:dup             
		//   24   52:getstatic       #80  <Field Status Status.zzazz>
		//   25   55:invokespecial   #83  <Method void com.google.android.gms.common.api.zza(Status)>
		//   26   58:invokevirtual   #89  <Method boolean TaskCompletionSource.trySetException(Exception)>
		//   27   61:pop             
				return;
		//   28   62:return          
			}
		}

		public volatile void zzz(Status status)
		{
			super.zzz(status);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #94  <Method void zzzx$zza.zzz(Status)>
		//    3    5:return          
		}

		public final zzabh.zzb zzazK;

		public zze(zzabh.zzb zzb1, TaskCompletionSource taskcompletionsource)
		{
			super(4, taskcompletionsource);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void zzzx$zza(int, TaskCompletionSource)>
			zzazK = zzb1;
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:putfield        #17  <Field zzabh$zzb zzazK>
		//    7   11:return          
		}
	}


	public zzzx(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzakD = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int zzakD>
	//    5    9:return          
	}

	private static Status zza(RemoteException remoteexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_1        
		if(zzt.zzzh() && (remoteexception instanceof TransactionTooLargeException))
	//*   4    8:invokestatic    #39  <Method boolean zzt.zzzh()>
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

	public abstract void zza(zzaal zzaal, boolean flag);

	public abstract void zza(zzaax.zza zza1)
		throws DeadObjectException;

	public abstract void zzz(Status status);

	public final int zzakD;
}
