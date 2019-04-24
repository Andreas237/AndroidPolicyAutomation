// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzhd

final class zzhh
	implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
{

	zzhh(zzhd zzhd1)
	{
		zzajt = zzhd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzhd zzajt>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		synchronized(zzhd.zzc(zzajt))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzhd zzajt>
	//*   2    4:invokestatic    #25  <Method Object zzhd.zzc(zzhd)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			zzhd.zza(zzajt, ((zzho) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field zzhd zzajt>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #29  <Method zzho zzhd.zza(zzhd, zzho)>
	//   10   18:pop             
			if(zzhd.zzd(zzajt) != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #12  <Field zzhd zzajt>
	//*  13   23:invokestatic    #33  <Method zzhk zzhd.zzd(zzhd)>
	//*  14   26:ifnull          38
				zzhd.zza(zzajt, ((zzhk) (null)));
	//   15   29:aload_0         
	//   16   30:getfield        #12  <Field zzhd zzajt>
	//   17   33:aconst_null     
	//   18   34:invokestatic    #36  <Method zzhk zzhd.zza(zzhd, zzhk)>
	//   19   37:pop             
			zzhd.zzc(zzajt).notifyAll();
	//   20   38:aload_0         
	//   21   39:getfield        #12  <Field zzhd zzajt>
	//   22   42:invokestatic    #25  <Method Object zzhd.zzc(zzhd)>
	//   23   45:invokevirtual   #39  <Method void Object.notifyAll()>
		}
	//   24   48:aload_1         
	//   25   49:monitorexit     
		return;
	//   26   50:return          
		exception;
	//   27   51:astore_2        
		connectionresult;
	//   28   52:aload_1         
		JVM INSTR monitorexit ;
	//   29   53:monitorexit     
		throw exception;
	//   30   54:aload_2         
	//   31   55:athrow          
	}

	private final zzhd zzajt;
}
