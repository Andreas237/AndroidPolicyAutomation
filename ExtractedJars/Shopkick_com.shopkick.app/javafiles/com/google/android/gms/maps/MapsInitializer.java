// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			CameraUpdateFactory

public final class MapsInitializer
{

	private MapsInitializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static int initialize(Context context)
	{
		com/google/android/gms/maps/MapsInitializer;
	//    0    0:ldc1            #2   <Class MapsInitializer>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		Preconditions.checkNotNull(((Object) (context)), "Context is null");
	//    2    3:aload_0         
	//    3    4:ldc1            #24  <String "Context is null">
	//    4    6:invokestatic    #30  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5    9:pop             
		flag = zzbl;
	//    6   10:getstatic       #32  <Field boolean zzbl>
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
		context = ((Context) (zzbz.zza(context)));
	//   14   23:aload_0         
	//   15   24:invokestatic    #38  <Method zze zzbz.zza(Context)>
	//   16   27:astore_0        
		CameraUpdateFactory.zza(((zze) (context)).zzd());
	//   17   28:aload_0         
	//   18   29:invokeinterface #44  <Method com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zze.zzd()>
	//   19   34:invokestatic    #49  <Method void CameraUpdateFactory.zza(com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate)>
		BitmapDescriptorFactory.zza(((zze) (context)).zze());
	//   20   37:aload_0         
	//   21   38:invokeinterface #53  <Method com.google.android.gms.internal.maps.zze zze.zze()>
	//   22   43:invokestatic    #58  <Method void BitmapDescriptorFactory.zza(com.google.android.gms.internal.maps.zze)>
		zzbl = true;
	//   23   46:iconst_1        
	//   24   47:putstatic       #32  <Field boolean zzbl>
		com/google/android/gms/maps/MapsInitializer;
	//   25   50:ldc1            #2   <Class MapsInitializer>
		JVM INSTR monitorexit ;
	//   26   52:monitorexit     
		return 0;
	//   27   53:iconst_0        
	//   28   54:ireturn         
		context;
	//   29   55:astore_0        
		throw new RuntimeRemoteException(((RemoteException) (context)));
	//   30   56:new             #60  <Class RuntimeRemoteException>
	//   31   59:dup             
	//   32   60:aload_0         
	//   33   61:invokespecial   #63  <Method void RuntimeRemoteException(RemoteException)>
	//   34   64:athrow          
		context;
	//   35   65:astore_0        
		int i = ((GooglePlayServicesNotAvailableException) (context)).errorCode;
	//   36   66:aload_0         
	//   37   67:getfield        #67  <Field int GooglePlayServicesNotAvailableException.errorCode>
	//   38   70:istore_1        
		com/google/android/gms/maps/MapsInitializer;
	//   39   71:ldc1            #2   <Class MapsInitializer>
		JVM INSTR monitorexit ;
	//   40   73:monitorexit     
		return i;
	//   41   74:iload_1         
	//   42   75:ireturn         
		context;
	//   43   76:astore_0        
	//*  44   77:ldc1            #2   <Class MapsInitializer>
		throw context;
	//   45   79:monitorexit     
	//   46   80:aload_0         
	//   47   81:athrow          
	}

	private static boolean zzbl = false;

	static 
	{
	//    0    0:return          
	}
}
