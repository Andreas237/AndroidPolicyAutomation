// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzsf, zzsk, zzaoj, zzakb, 
//			zzso, zzsm, zzsg

final class zzsp
	implements Runnable
{

	zzsp(zzso zzso1, zzsf zzsf1, zzaoj zzaoj1, zzsg zzsg)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzbnq = zzso1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field zzso zzbnq>
		zzbnr = zzsf1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field zzsf zzbnr>
		zzbns = zzaoj1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field zzaoj zzbns>
		zzbnt = zzsg;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field zzsg zzbnt>
	//   14   25:return          
	}

	public final void run()
	{
		zzso zzso1 = zzbnq;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzso zzbnq>
	//    2    4:astore_1        
		zzsf zzsf1 = zzbnr;
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field zzsf zzbnr>
	//    5    9:astore_3        
		zzaoj zzaoj1 = zzbns;
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field zzaoj zzbns>
	//    8   14:astore_2        
		zzsg zzsg = zzbnt;
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field zzsg zzbnt>
	//   11   19:astore          4
		try
		{
			zzaoj1.set(((Object) (zzsf1.zzlb().zza(zzsg))));
	//   12   21:aload_2         
	//   13   22:aload_3         
	//   14   23:invokevirtual   #37  <Method zzsk zzsf.zzlb()>
	//   15   26:aload           4
	//   16   28:invokeinterface #43  <Method android.os.ParcelFileDescriptor zzsk.zza(zzsg)>
	//   17   33:invokevirtual   #49  <Method void zzaoj.set(Object)>
			return;
	//   18   36:return          
		}
		catch(RemoteException remoteexception)
	//*  19   37:astore_3        
		{
			zzakb.zzb("Unable to obtain a cache service instance.", ((Throwable) (remoteexception)));
	//   20   38:ldc1            #51  <String "Unable to obtain a cache service instance.">
	//   21   40:aload_3         
	//   22   41:invokestatic    #57  <Method void zzakb.zzb(String, Throwable)>
			zzaoj1.setException(((Throwable) (remoteexception)));
	//   23   44:aload_2         
	//   24   45:aload_3         
	//   25   46:invokevirtual   #61  <Method void zzaoj.setException(Throwable)>
			zzsm.zza(zzso1.zzbnn);
	//   26   49:aload_1         
	//   27   50:getfield        #67  <Field zzsm zzso.zzbnn>
	//   28   53:invokestatic    #72  <Method void zzsm.zza(zzsm)>
			return;
	//   29   56:return          
		}
	}

	private final zzso zzbnq;
	private final zzsf zzbnr;
	private final zzaoj zzbns;
	private final zzsg zzbnt;
}
