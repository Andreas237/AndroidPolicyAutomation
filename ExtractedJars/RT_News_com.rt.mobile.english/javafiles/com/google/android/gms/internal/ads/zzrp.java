// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzro

public abstract class zzrp extends zzek
	implements zzro
{

	public zzrp()
	{
		super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 33
	//	               2 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 2: // '\002'
			onUnconfirmedClickCancelled();
	//    4   26:aload_0         
	//    5   27:invokevirtual   #21  <Method void onUnconfirmedClickCancelled()>
			break;

	//*   6   30:goto            41
		case 1: // '\001'
			onUnconfirmedClickReceived(parcel.readString());
	//    7   33:aload_0         
	//    8   34:aload_2         
	//    9   35:invokevirtual   #27  <Method String Parcel.readString()>
	//   10   38:invokevirtual   #30  <Method void onUnconfirmedClickReceived(String)>
			break;
		}
		parcel1.writeNoException();
	//   11   41:aload_3         
	//   12   42:invokevirtual   #33  <Method void Parcel.writeNoException()>
		return true;
	//   13   45:iconst_1        
	//   14   46:ireturn         
	}
}
