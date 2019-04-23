// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzan

public abstract class zzao extends zzb
	implements zzan
{

	public zzao()
	{
		super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.maps.internal.IOnMapLongClickListener">
	//    2    3:invokespecial   #13  <Method void zzb(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          25
		{
			onMapLongClick((LatLng)zzc.zza(parcel, LatLng.CREATOR));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:getstatic       #24  <Field android.os.Parcelable$Creator LatLng.CREATOR>
	//    6   10:invokestatic    #30  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    7   13:checkcast       #20  <Class LatLng>
	//    8   16:invokevirtual   #34  <Method void onMapLongClick(LatLng)>
			parcel1.writeNoException();
	//    9   19:aload_3         
	//   10   20:invokevirtual   #39  <Method void Parcel.writeNoException()>
			return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		} else
		{
			return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
		}
	}
}
