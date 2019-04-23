// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.internal.maps.zzb;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzbf

public abstract class zzbg extends zzb
	implements zzbf
{

	public zzbg()
	{
		super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.maps.internal.IOnPolylineClickListener">
	//    2    3:invokespecial   #13  <Method void zzb(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          22
		{
			zza(zzaa.zzi(parcel.readStrongBinder()));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//    6   10:invokestatic    #30  <Method com.google.android.gms.internal.maps.zzz zzaa.zzi(android.os.IBinder)>
	//    7   13:invokevirtual   #34  <Method void zza(com.google.android.gms.internal.maps.zzz)>
			parcel1.writeNoException();
	//    8   16:aload_3         
	//    9   17:invokevirtual   #37  <Method void Parcel.writeNoException()>
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		} else
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
	}
}
