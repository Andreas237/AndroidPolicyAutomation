// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.maps.internal.zzai;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			CameraUpdateFactory

public final class MapsInitializer
{

	private MapsInitializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static int initialize(Context context)
	{
		com/google/android/gms/maps/MapsInitializer;
	//    0    0:ldc1            #2   <Class MapsInitializer>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		zzac.zzb(((Object) (context)), "Context is null");
	//    2    3:aload_0         
	//    3    4:ldc1            #20  <String "Context is null">
	//    4    6:invokestatic    #26  <Method Object zzac.zzb(Object, Object)>
	//    5    9:pop             
		flag = zzpT;
	//    6   10:getstatic       #10  <Field boolean zzpT>
	//    7   13:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_23;
	//    8   14:iload_2         
	//    9   15:ifeq            23
		com/google/android/gms/maps/MapsInitializer;
	//   10   18:ldc1            #2   <Class MapsInitializer>
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return 0;
	//   12   21:iconst_0        
	//   13   22:ireturn         
		context = ((Context) (zzai.zzbI(context)));
	//   14   23:aload_0         
	//   15   24:invokestatic    #32  <Method zzc zzai.zzbI(Context)>
	//   16   27:astore_0        
		break MISSING_BLOCK_LABEL_42;
	//   17   28:goto            42
		context;
	//   18   31:astore_0        
		int i = ((GooglePlayServicesNotAvailableException) (context)).errorCode;
	//   19   32:aload_0         
	//   20   33:getfield        #36  <Field int GooglePlayServicesNotAvailableException.errorCode>
	//   21   36:istore_1        
		com/google/android/gms/maps/MapsInitializer;
	//   22   37:ldc1            #2   <Class MapsInitializer>
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		return i;
	//   24   40:iload_1         
	//   25   41:ireturn         
		zza(((zzc) (context)));
	//   26   42:aload_0         
	//   27   43:invokestatic    #40  <Method void zza(zzc)>
		zzpT = true;
	//   28   46:iconst_1        
	//   29   47:putstatic       #10  <Field boolean zzpT>
		com/google/android/gms/maps/MapsInitializer;
	//   30   50:ldc1            #2   <Class MapsInitializer>
		JVM INSTR monitorexit ;
	//   31   52:monitorexit     
		return 0;
	//   32   53:iconst_0        
	//   33   54:ireturn         
		context;
	//   34   55:astore_0        
	//*  35   56:ldc1            #2   <Class MapsInitializer>
		throw context;
	//   36   58:monitorexit     
	//   37   59:aload_0         
	//   38   60:athrow          
	}

	public static void zza(zzc zzc1)
	{
		try
		{
			CameraUpdateFactory.zza(zzc1.zzJE());
	//    0    0:aload_0         
	//    1    1:invokeinterface #48  <Method com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zzc.zzJE()>
	//    2    6:invokestatic    #53  <Method void CameraUpdateFactory.zza(com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate)>
			BitmapDescriptorFactory.zza(zzc1.zzJF());
	//    3    9:aload_0         
	//    4   10:invokeinterface #57  <Method com.google.android.gms.maps.model.internal.zza zzc.zzJF()>
	//    5   15:invokestatic    #62  <Method void BitmapDescriptorFactory.zza(com.google.android.gms.maps.model.internal.zza)>
			return;
	//    6   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzc zzc1)
	//*   7   19:astore_0        
		{
			throw new RuntimeRemoteException(((RemoteException) (zzc1)));
	//    8   20:new             #64  <Class RuntimeRemoteException>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:invokespecial   #67  <Method void RuntimeRemoteException(RemoteException)>
	//   12   28:athrow          
		}
	}

	private static boolean zzpT = false;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #10  <Field boolean zzpT>
	//*   2    4:return          
	}
}
