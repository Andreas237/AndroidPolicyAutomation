// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zac, zab, zaab

abstract class zad extends zac
{

	public zad(int i, TaskCompletionSource taskcompletionsource)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #13  <Method void zac(int)>
		zacm = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field TaskCompletionSource zacm>
	//    6   10:return          
	}

	public void zaa(Status status)
	{
		zacm.trySetException(((Exception) (new ApiException(status))));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TaskCompletionSource zacm>
	//    2    4:new             #23  <Class ApiException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void ApiException(Status)>
	//    6   12:invokevirtual   #31  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//    7   15:pop             
	//    8   16:return          
	}

	public final void zaa(GoogleApiManager.zaa zaa1)
		throws DeadObjectException
	{
		try
		{
			zad(zaa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #42  <Method void zad(GoogleApiManager$zaa)>
			return;
	//    3    5:return          
		}
	//*   4    6:astore_1        
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokevirtual   #47  <Method void zab.zaa(RuntimeException)>
	//*   8   12:return          
	//*   9   13:astore_1        
	//*  10   14:aload_0         
	//*  11   15:aload_1         
	//*  12   16:invokestatic    #51  <Method Status zab.zab(RemoteException)>
	//*  13   19:invokevirtual   #53  <Method void zab.zaa(Status)>
	//*  14   22:return          
		// Misplaced declaration of an exception variable
		catch(GoogleApiManager.zaa zaa1)
	//*  15   23:astore_1        
		{
			((zab)this).zaa(zab.zab(((RemoteException) (zaa1))));
	//   16   24:aload_0         
	//   17   25:aload_1         
	//   18   26:invokestatic    #51  <Method Status zab.zab(RemoteException)>
	//   19   29:invokevirtual   #53  <Method void zab.zaa(Status)>
		}
		// Misplaced declaration of an exception variable
		catch(GoogleApiManager.zaa zaa1)
		{
			((zab)this).zaa(zab.zab(((RemoteException) (zaa1))));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(GoogleApiManager.zaa zaa1)
		{
			((zab)this).zaa(((RuntimeException) (zaa1)));
			return;
		}
		throw zaa1;
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	public void zaa(zaab zaab, boolean flag)
	{
	//    0    0:return          
	}

	public void zaa(RuntimeException runtimeexception)
	{
		zacm.trySetException(((Exception) (runtimeexception)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TaskCompletionSource zacm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method boolean TaskCompletionSource.trySetException(Exception)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected abstract void zad(GoogleApiManager.zaa zaa1)
		throws RemoteException;

	protected final TaskCompletionSource zacm;
}
