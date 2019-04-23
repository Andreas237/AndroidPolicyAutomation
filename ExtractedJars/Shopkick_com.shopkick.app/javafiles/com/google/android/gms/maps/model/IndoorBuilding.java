// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//			RuntimeRemoteException, IndoorLevel

public final class IndoorBuilding
{
	static final class zza
	{

		public static zzq zza(IBinder ibinder)
		{
			return zzr.zzf(ibinder);
		//    0    0:aload_0         
		//    1    1:invokestatic    #26  <Method zzq zzr.zzf(IBinder)>
		//    2    4:areturn         
		}

		public static IndoorLevel zza(zzq zzq)
		{
			return new IndoorLevel(zzq);
		//    0    0:new             #30  <Class IndoorLevel>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #33  <Method void IndoorLevel(zzq)>
		//    4    8:areturn         
		}

		public static final zza zzde = new zza();

		static 
		{
		//    0    0:new             #2   <Class IndoorBuilding$zza>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void IndoorBuilding$zza()>
		//    3    7:putstatic       #17  <Field IndoorBuilding$zza zzde>
		//*   4   10:return          
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	public IndoorBuilding(zzn zzn1)
	{
		this(zzn1, zza.zzde);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #17  <Field IndoorBuilding$zza IndoorBuilding$zza.zzde>
	//    3    5:invokespecial   #20  <Method void IndoorBuilding(zzn, IndoorBuilding$zza)>
	//    4    8:return          
	}

	private IndoorBuilding(zzn zzn1, zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzdc = (zzn)Preconditions.checkNotNull(((Object) (zzn1)), "delegate");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #28  <String "delegate">
	//    5    8:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    6   11:checkcast       #36  <Class zzn>
	//    7   14:putfield        #38  <Field zzn zzdc>
		zzdd = (zza)Preconditions.checkNotNull(((Object) (zza1)), "shim");
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:ldc1            #40  <String "shim">
	//   11   21:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   12   24:checkcast       #6   <Class IndoorBuilding$zza>
	//   13   27:putfield        #42  <Field IndoorBuilding$zza zzdd>
	//   14   30:return          
	}

	public final boolean equals(Object obj)
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
			flag = zzdc.zzb(((IndoorBuilding)obj).zzdc);
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field zzn zzdc>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class IndoorBuilding>
	//    9   17:getfield        #38  <Field zzn zzdc>
	//   10   20:invokeinterface #51  <Method boolean zzn.zzb(zzn)>
	//   11   25:istore_2        
		}
	//*  12   26:iload_2         
	//*  13   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  14   28:astore_1        
		{
			throw new RuntimeRemoteException(((RemoteException) (obj)));
	//   15   29:new             #53  <Class RuntimeRemoteException>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   19   37:athrow          
		}
		return flag;
	}

	public final int getActiveLevelIndex()
	{
		int i;
		try
		{
			i = zzdc.getActiveLevelIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field zzn zzdc>
	//    2    4:invokeinterface #60  <Method int zzn.getActiveLevelIndex()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #53  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public final int getDefaultLevelIndex()
	{
		int i;
		try
		{
			i = zzdc.getDefaultLevelIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field zzn zzdc>
	//    2    4:invokeinterface #63  <Method int zzn.getDefaultLevelIndex()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #53  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public final List getLevels()
	{
		ArrayList arraylist;
		try
		{
			Object obj = ((Object) (zzdc.getLevels()));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field zzn zzdc>
	//    2    4:invokeinterface #67  <Method List zzn.getLevels()>
	//    3    9:astore_2        
			arraylist = new ArrayList(((List) (obj)).size());
	//    4   10:new             #69  <Class ArrayList>
	//    5   13:dup             
	//    6   14:aload_2         
	//    7   15:invokeinterface #74  <Method int List.size()>
	//    8   20:invokespecial   #77  <Method void ArrayList(int)>
	//    9   23:astore_1        
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (zza.zza(zza.zza((IBinder)((Iterator) (obj)).next()))))));
	//   10   24:aload_2         
	//   11   25:invokeinterface #81  <Method Iterator List.iterator()>
	//   12   30:astore_2        
	//   13   31:aload_2         
	//   14   32:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   15   37:ifeq            65
	//   16   40:aload_1         
	//   17   41:aload_2         
	//   18   42:invokeinterface #91  <Method Object Iterator.next()>
	//   19   47:checkcast       #93  <Class IBinder>
	//   20   50:invokestatic    #96  <Method zzq IndoorBuilding$zza.zza(IBinder)>
	//   21   53:invokestatic    #99  <Method IndoorLevel IndoorBuilding$zza.zza(zzq)>
	//   22   56:invokeinterface #102 <Method boolean List.add(Object)>
	//   23   61:pop             
		}
	//*  24   62:goto            31
	//*  25   65:aload_1         
	//*  26   66:areturn         
		catch(RemoteException remoteexception)
	//*  27   67:astore_1        
		{
			throw new RuntimeRemoteException(remoteexception);
	//   28   68:new             #53  <Class RuntimeRemoteException>
	//   29   71:dup             
	//   30   72:aload_1         
	//   31   73:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   32   76:athrow          
		}
		return ((List) (arraylist));
	}

	public final int hashCode()
	{
		int i;
		try
		{
			i = zzdc.zzi();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field zzn zzdc>
	//    2    4:invokeinterface #108 <Method int zzn.zzi()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #53  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return i;
	}

	public final boolean isUnderground()
	{
		boolean flag;
		try
		{
			flag = zzdc.isUnderground();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field zzn zzdc>
	//    2    4:invokeinterface #111 <Method boolean zzn.isUnderground()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			throw new RuntimeRemoteException(remoteexception);
	//    7   13:new             #53  <Class RuntimeRemoteException>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #56  <Method void RuntimeRemoteException(RemoteException)>
	//   11   21:athrow          
		}
		return flag;
	}

	private final zzn zzdc;
	private final zza zzdd;
}
