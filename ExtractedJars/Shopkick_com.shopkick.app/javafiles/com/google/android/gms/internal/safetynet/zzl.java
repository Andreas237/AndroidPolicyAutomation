// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzx, zzi

final class zzl extends zzk.zzb
{

	zzl(GoogleApiClient googleapiclient, byte abyte0[], String s)
	{
		zzw = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field byte[] zzw>
		zzx = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #14  <Field String zzx>
		super(googleapiclient);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #17  <Method void zzk$zzb(GoogleApiClient)>
	//    9   15:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		zzx zzx1 = (zzx)anyclient;
	//    0    0:aload_1         
	//    1    1:checkcast       #24  <Class zzx>
	//    2    4:astore_3        
		zzg zzg = zzaf;
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field zzg zzaf>
	//    5    9:astore          4
		byte abyte0[] = zzw;
	//    6   11:aload_0         
	//    7   12:getfield        #12  <Field byte[] zzw>
	//    8   15:astore          5
		String s = zzx;
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field String zzx>
	//   11   21:astore_2        
		anyclient = ((com.google.android.gms.common.api.Api.AnyClient) (s));
	//   12   22:aload_2         
	//   13   23:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  14   24:aload_2         
	//*  15   25:invokestatic    #34  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   28:ifeq            38
			anyclient = ((com.google.android.gms.common.api.Api.AnyClient) (zzx1.zzb("com.google.android.safetynet.ATTEST_API_KEY")));
	//   17   31:aload_3         
	//   18   32:ldc1            #36  <String "com.google.android.safetynet.ATTEST_API_KEY">
	//   19   34:invokevirtual   #40  <Method String zzx.zzb(String)>
	//   20   37:astore_1        
		((zzi)zzx1.getService()).zza(zzg, abyte0, ((String) (anyclient)));
	//   21   38:aload_3         
	//   22   39:invokevirtual   #44  <Method android.os.IInterface zzx.getService()>
	//   23   42:checkcast       #46  <Class zzi>
	//   24   45:aload           4
	//   25   47:aload           5
	//   26   49:aload_1         
	//   27   50:invokeinterface #50  <Method void zzi.zza(zzg, byte[], String)>
	//   28   55:return          
	}

	private final byte zzw[];
	private final String zzx;
}
