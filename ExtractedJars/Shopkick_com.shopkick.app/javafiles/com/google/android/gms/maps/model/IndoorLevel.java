// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzq;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException

public final class IndoorLevel
{

	public IndoorLevel(zzq zzq1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzdf = (zzq)Preconditions.checkNotNull(((Object) (zzq1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #19  <Class zzq>
	//    6   12:putfield        #21  <Field zzq zzdf>
	//    7   15:return          
	}

	public final void activate()
	{
		try
		{
			zzdf.activate();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzq zzdf>
	//    2    4:invokeinterface #27  <Method void zzq.activate()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    5   11:new             #29  <Class RuntimeRemoteException>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//    9   19:athrow          
		}
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof IndoorLevel))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class IndoorLevel>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzdf.zzb(((IndoorLevel)obj).zzdf);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzq zzdf>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class IndoorLevel>
	//    9   17:getfield        #21  <Field zzq zzdf>
	//   10   20:invokeinterface #38  <Method boolean zzq.zzb(zzq)>
	//   11   25:istore_2        
		}
	//*  12   26:iload_2         
	//*  13   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  14   28:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (obj)));
	//   15   29:new             #29  <Class RuntimeRemoteException>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   19   37:athrow          
		}
		return flag;
	}

	public final String getName()
	{
		String s;
		try
		{
			s = zzdf.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzq zzdf>
	//    2    4:invokeinterface #43  <Method String zzq.getName()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return s;
	}

	public final String getShortName()
	{
		String s;
		try
		{
			s = zzdf.getShortName();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzq zzdf>
	//    2    4:invokeinterface #47  <Method String zzq.getShortName()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return s;
	}

	public final int hashCode()
	{
		int i;
		try
		{
			i = zzdf.zzi();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzq zzdf>
	//    2    4:invokeinterface #52  <Method int zzq.zzi()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #29  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #32  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	private final zzq zzdf;
}
