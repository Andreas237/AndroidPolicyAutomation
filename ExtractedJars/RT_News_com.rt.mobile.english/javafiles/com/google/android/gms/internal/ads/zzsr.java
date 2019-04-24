// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzsm, zzaoj

final class zzsr
	implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
{

	zzsr(zzsm zzsm1, zzaoj zzaoj1)
	{
		zzbnn = zzsm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzsm zzbnn>
		zzbno = zzaoj1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzaoj zzbno>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		synchronized(zzsm.zzb(zzbnn))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field zzsm zzbnn>
	//*   2    4:invokestatic    #29  <Method Object zzsm.zzb(zzsm)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			zzbno.setException(((Throwable) (new RuntimeException("Connection failed."))));
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field zzaoj zzbno>
	//    8   14:new             #31  <Class RuntimeException>
	//    9   17:dup             
	//   10   18:ldc1            #33  <String "Connection failed.">
	//   11   20:invokespecial   #36  <Method void RuntimeException(String)>
	//   12   23:invokevirtual   #42  <Method void zzaoj.setException(Throwable)>
		}
	//   13   26:aload_1         
	//   14   27:monitorexit     
		return;
	//   15   28:return          
		exception;
	//   16   29:astore_2        
		connectionresult;
	//   17   30:aload_1         
		JVM INSTR monitorexit ;
	//   18   31:monitorexit     
		throw exception;
	//   19   32:aload_2         
	//   20   33:athrow          
	}

	private final zzsm zzbnn;
	private final zzaoj zzbno;
}
