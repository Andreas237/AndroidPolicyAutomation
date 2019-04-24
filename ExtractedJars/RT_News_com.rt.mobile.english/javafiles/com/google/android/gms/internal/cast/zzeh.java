// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzb, zzeg

public abstract class zzeh extends zzb
	implements zzeg
{

	public zzeh()
	{
		super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks">
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
			zzr(parcel.readInt());
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #24  <Method int Parcel.readInt()>
	//    6   10:invokevirtual   #28  <Method void zzr(int)>
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
