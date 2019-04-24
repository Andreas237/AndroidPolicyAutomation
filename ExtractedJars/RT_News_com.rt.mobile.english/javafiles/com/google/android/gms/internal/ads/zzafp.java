// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzafn, zzajm, zzakb, zzaej, 
//			zzaeq, zzaef

final class zzafp
	implements Runnable
{

	zzafp(zzafn zzafn1, zzaef zzaef, zzaeq zzaeq1)
	{
		zzchm = zzafn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzafn zzchm>
		zzchk = zzaef;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field zzaef zzchk>
		zzchl = zzaeq1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field zzaeq zzchl>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		Object obj;
		try
		{
			obj = ((Object) (zzchm.zzb(zzchk)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzafn zzchm>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field zzaef zzchk>
	//    4    8:invokevirtual   #35  <Method zzaej zzafn.zzb(zzaef)>
	//    5   11:astore_1        
		}
	//*   6   12:goto            33
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   15:astore_1        
		{
			zzbv.zzeo().zza(((Throwable) (obj)), "AdRequestServiceImpl.loadAdAsync");
	//    8   16:invokestatic    #41  <Method zzajm zzbv.zzeo()>
	//    9   19:aload_1         
	//   10   20:ldc1            #43  <String "AdRequestServiceImpl.loadAdAsync">
	//   11   22:invokevirtual   #49  <Method void zzajm.zza(Throwable, String)>
			zzakb.zzc("Could not fetch ad response due to an Exception.", ((Throwable) (obj)));
	//   12   25:ldc1            #51  <String "Could not fetch ad response due to an Exception.">
	//   13   27:aload_1         
	//   14   28:invokestatic    #57  <Method void zzakb.zzc(String, Throwable)>
			obj = null;
	//   15   31:aconst_null     
	//   16   32:astore_1        
		}
		Object obj1 = obj;
	//   17   33:aload_1         
	//   18   34:astore_2        
		if(obj == null)
	//*  19   35:aload_1         
	//*  20   36:ifnonnull       48
			obj1 = ((Object) (new zzaej(0)));
	//   21   39:new             #59  <Class zzaej>
	//   22   42:dup             
	//   23   43:iconst_0        
	//   24   44:invokespecial   #62  <Method void zzaej(int)>
	//   25   47:astore_2        
		try
		{
			zzchl.zza(((zzaej) (obj1)));
	//   26   48:aload_0         
	//   27   49:getfield        #20  <Field zzaeq zzchl>
	//   28   52:aload_2         
	//   29   53:invokeinterface #67  <Method void zzaeq.zza(zzaej)>
			return;
	//   30   58:return          
		}
		catch(RemoteException remoteexception)
	//*  31   59:astore_1        
		{
			zzakb.zzc("Fail to forward ad response.", ((Throwable) (remoteexception)));
	//   32   60:ldc1            #69  <String "Fail to forward ad response.">
	//   33   62:aload_1         
	//   34   63:invokestatic    #57  <Method void zzakb.zzc(String, Throwable)>
		}
	//   35   66:return          
	}

	private final zzaef zzchk;
	private final zzaeq zzchl;
	private final zzafn zzchm;
}
