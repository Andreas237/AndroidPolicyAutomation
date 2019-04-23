// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzal

public abstract class zzam extends zzb
	implements zzal
{

	public zzam()
	{
		super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.maps.internal.IOnMapLoadedCallback">
	//    2    3:invokespecial   #13  <Method void zzb(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          15
		{
			onMapLoaded();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #21  <Method void onMapLoaded()>
			parcel1.writeNoException();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #26  <Method void Parcel.writeNoException()>
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		} else
		{
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		}
	}
}
