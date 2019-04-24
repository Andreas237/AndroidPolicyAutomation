// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjr, zzane, zzld

abstract class zzjr$zza
{

	protected abstract Object zza(zzld zzld)
		throws RemoteException;

	protected abstract Object zzib()
		throws RemoteException;

	protected final Object zzic()
	{
		Object obj = ((Object) (zzjr.zza(zzart)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzjr zzart>
	//    2    4:invokestatic    #29  <Method zzld zzjr.zza(zzjr)>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       19
		{
			zzane.zzdk("ClientApi class cannot be loaded.");
	//    6   12:ldc1            #31  <String "ClientApi class cannot be loaded.">
	//    7   14:invokestatic    #37  <Method void zzane.zzdk(String)>
			return ((Object) (null));
	//    8   17:aconst_null     
	//    9   18:areturn         
		}
		try
		{
			obj = zza(((zzld) (obj)));
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #39  <Method Object zza(zzld)>
	//   13   24:astore_1        
		}
	//*  14   25:aload_1         
	//*  15   26:areturn         
		catch(RemoteException remoteexception)
	//*  16   27:astore_1        
		{
			zzane.zzc("Cannot invoke local loader using ClientApi class", ((Throwable) (remoteexception)));
	//   17   28:ldc1            #41  <String "Cannot invoke local loader using ClientApi class">
	//   18   30:aload_1         
	//   19   31:invokestatic    #45  <Method void zzane.zzc(String, Throwable)>
			return ((Object) (null));
	//   20   34:aconst_null     
	//   21   35:areturn         
		}
		return obj;
	}

	protected final Object zzid()
	{
		Object obj;
		try
		{
			obj = zzib();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method Object zzib()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(RemoteException remoteexception)
	//*   5    7:astore_1        
		{
			zzane.zzc("Cannot invoke remote loader", ((Throwable) (remoteexception)));
	//    6    8:ldc1            #53  <String "Cannot invoke remote loader">
	//    7   10:aload_1         
	//    8   11:invokestatic    #45  <Method void zzane.zzc(String, Throwable)>
			return ((Object) (null));
	//    9   14:aconst_null     
	//   10   15:areturn         
		}
		return obj;
	}

	private final zzjr zzart;

	zzjr$zza(zzjr zzjr1)
	{
		zzart = zzjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzjr zzart>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
