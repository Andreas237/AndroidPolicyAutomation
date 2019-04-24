// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzeh, zzea, zzdg, zzeg

final class zzeb extends zzeh
{

	zzeb(zzea zzea1, zzeg zzeg1)
	{
		zzyb = zzea1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzea zzyb>
		zzya = zzeg1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field zzeg zzya>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #17  <Method void zzeh()>
	//    8   14:return          
	}

	public final void zzr(int i)
		throws RemoteException
	{
		zzea.zzdd().d("onRemoteDisplayEnded", new Object[0]);
	//    0    0:invokestatic    #28  <Method zzdg zzea.zzdd()>
	//    1    3:ldc1            #30  <String "onRemoteDisplayEnded">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #38  <Method void zzdg.d(String, Object[])>
		if(zzya != null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #14  <Field zzeg zzya>
	//*   7   16:ifnull          29
			zzya.zzr(i);
	//    8   19:aload_0         
	//    9   20:getfield        #14  <Field zzeg zzya>
	//   10   23:iload_1         
	//   11   24:invokeinterface #42  <Method void zzeg.zzr(int)>
		if(zzea.zzb(zzyb) != null)
	//*  12   29:aload_0         
	//*  13   30:getfield        #12  <Field zzea zzyb>
	//*  14   33:invokestatic    #46  <Method com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionCallbacks zzea.zzb(zzea)>
	//*  15   36:ifnull          59
			zzea.zzb(zzyb).onRemoteDisplayEnded(new Status(i));
	//   16   39:aload_0         
	//   17   40:getfield        #12  <Field zzea zzyb>
	//   18   43:invokestatic    #46  <Method com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionCallbacks zzea.zzb(zzea)>
	//   19   46:new             #48  <Class Status>
	//   20   49:dup             
	//   21   50:iload_1         
	//   22   51:invokespecial   #50  <Method void Status(int)>
	//   23   54:invokeinterface #55  <Method void com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionCallbacks.onRemoteDisplayEnded(Status)>
	//   24   59:return          
	}

	private final zzeg zzya;
	private final zzea zzyb;
}
