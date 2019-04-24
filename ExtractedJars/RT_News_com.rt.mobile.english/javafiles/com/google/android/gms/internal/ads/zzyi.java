// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlp, zzlr

public final class zzyi extends zzlp
{

	public zzyi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzlp()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void Object()>
	//    6   12:putfield        #17  <Field Object mLock>
	//    7   15:return          
	}

	public final float getAspectRatio()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final int getPlaybackState()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final boolean isClickToExpandEnabled()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final boolean isCustomControlsEnabled()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final boolean isMuted()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void mute(boolean flag)
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void pause()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void play()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final void zza(zzlr zzlr)
		throws RemoteException
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzbuq = zzlr;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #38  <Field zzlr zzbuq>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zzlr;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw zzlr;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final float zzim()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final float zzin()
		throws RemoteException
	{
		throw new RemoteException();
	//    0    0:new             #22  <Class RemoteException>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void RemoteException()>
	//    3    7:athrow          
	}

	public final zzlr zzio()
		throws RemoteException
	{
		zzlr zzlr;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzlr = zzbuq;
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field zzlr zzbuq>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return zzlr;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	private final Object mLock = new Object();
	private volatile zzlr zzbuq;
}
