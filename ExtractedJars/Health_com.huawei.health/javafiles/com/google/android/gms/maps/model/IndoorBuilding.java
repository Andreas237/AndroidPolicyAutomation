// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.maps.model.internal.zzd;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, IndoorLevel

public final class IndoorBuilding
{

	public IndoorBuilding(zzd zzd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzbpu = (zzd)zzac.zzw(((Object) (zzd1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #19  <Class zzd>
	//    6   12:putfield        #21  <Field zzd zzbpu>
	//    7   15:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof IndoorBuilding))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class IndoorBuilding>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = zzbpu.zzb(((IndoorBuilding)obj).zzbpu);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzd zzbpu>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class IndoorBuilding>
	//    9   17:getfield        #21  <Field zzd zzbpu>
	//   10   20:invokeinterface #30  <Method boolean zzd.zzb(zzd)>
	//   11   25:istore_2        
		}
	//*  12   26:iload_2         
	//*  13   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  14   28:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (obj)));
	//   15   29:new             #32  <Class RuntimeRemoteException>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   19   37:athrow          
		}
		return flag;
	}

	public int getActiveLevelIndex()
	{
		int i;
		try
		{
			i = zzbpu.getActiveLevelIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzd zzbpu>
	//    2    4:invokeinterface #39  <Method int zzd.getActiveLevelIndex()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public int getDefaultLevelIndex()
	{
		int i;
		try
		{
			i = zzbpu.getActiveLevelIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzd zzbpu>
	//    2    4:invokeinterface #39  <Method int zzd.getActiveLevelIndex()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public List getLevels()
	{
		ArrayList arraylist;
		try
		{
			Object obj = ((Object) (zzbpu.getLevels()));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzd zzbpu>
	//    2    4:invokeinterface #44  <Method List zzd.getLevels()>
	//    3    9:astore_2        
			arraylist = new ArrayList(((List) (obj)).size());
	//    4   10:new             #46  <Class ArrayList>
	//    5   13:dup             
	//    6   14:aload_2         
	//    7   15:invokeinterface #51  <Method int List.size()>
	//    8   20:invokespecial   #54  <Method void ArrayList(int)>
	//    9   23:astore_1        
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (new IndoorLevel(com.google.android.gms.maps.model.internal.zze.zza.zzem((IBinder)((Iterator) (obj)).next()))))));
	//   10   24:aload_2         
	//   11   25:invokeinterface #58  <Method Iterator List.iterator()>
	//   12   30:astore_2        
	//   13   31:aload_2         
	//   14   32:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   15   37:ifeq            69
	//   16   40:aload_1         
	//   17   41:new             #66  <Class IndoorLevel>
	//   18   44:dup             
	//   19   45:aload_2         
	//   20   46:invokeinterface #70  <Method Object Iterator.next()>
	//   21   51:checkcast       #72  <Class IBinder>
	//   22   54:invokestatic    #78  <Method com.google.android.gms.maps.model.internal.zze com.google.android.gms.maps.model.internal.zze$zza.zzem(IBinder)>
	//   23   57:invokespecial   #81  <Method void IndoorLevel(com.google.android.gms.maps.model.internal.zze)>
	//   24   60:invokeinterface #84  <Method boolean List.add(Object)>
	//   25   65:pop             
		}
	//*  26   66:goto            31
	//*  27   69:aload_1         
	//*  28   70:areturn         
		catch(RemoteException remoteexception)
	//*  29   71:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   30   72:new             #32  <Class RuntimeRemoteException>
	//   31   75:dup             
	//   32   76:aload_1         
	//   33   77:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   34   80:athrow          
		}
		return ((List) (arraylist));
	}

	public int hashCode()
	{
		int i;
		try
		{
			i = zzbpu.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzd zzbpu>
	//    2    4:invokeinterface #90  <Method int zzd.hashCodeRemote()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public boolean isUnderground()
	{
		boolean flag;
		try
		{
			flag = zzbpu.isUnderground();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzd zzbpu>
	//    2    4:invokeinterface #93  <Method boolean zzd.isUnderground()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #32  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #35  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	private final zzd zzbpu;
}
