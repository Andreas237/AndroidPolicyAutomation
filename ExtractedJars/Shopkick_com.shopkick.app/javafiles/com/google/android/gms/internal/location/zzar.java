// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzb, zzaq, zzc

public abstract class zzar extends zzb
	implements zzaq
{

	public zzar()
	{
		super("com.google.android.gms.location.internal.ISettingsCallbacks");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.location.internal.ISettingsCallbacks">
	//    2    3:invokespecial   #13  <Method void zzb(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          21
		{
			zza((LocationSettingsResult)zzc.zza(parcel, LocationSettingsResult.CREATOR));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:getstatic       #24  <Field android.os.Parcelable$Creator LocationSettingsResult.CREATOR>
	//    6   10:invokestatic    #30  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    7   13:checkcast       #20  <Class LocationSettingsResult>
	//    8   16:invokevirtual   #33  <Method void zza(LocationSettingsResult)>
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		} else
		{
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		}
	}
}
