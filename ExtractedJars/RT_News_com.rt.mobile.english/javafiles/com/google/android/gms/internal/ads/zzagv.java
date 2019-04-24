// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzagu

public abstract class zzagv extends zzek
	implements zzagu
{

	public zzagv()
	{
		super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardItem">
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
	//	               1 43
	//	               2 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 2: // '\002'
			i = getAmount();
	//    4   26:aload_0         
	//    5   27:invokevirtual   #22  <Method int getAmount()>
	//    6   30:istore_1        
			parcel1.writeNoException();
	//    7   31:aload_3         
	//    8   32:invokevirtual   #27  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//    9   35:aload_3         
	//   10   36:iload_1         
	//   11   37:invokevirtual   #31  <Method void Parcel.writeInt(int)>
			break;

	//*  12   40:goto            57
		case 1: // '\001'
			parcel = ((Parcel) (getType()));
	//   13   43:aload_0         
	//   14   44:invokevirtual   #35  <Method String getType()>
	//   15   47:astore_2        
			parcel1.writeNoException();
	//   16   48:aload_3         
	//   17   49:invokevirtual   #27  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   18   52:aload_3         
	//   19   53:aload_2         
	//   20   54:invokevirtual   #38  <Method void Parcel.writeString(String)>
			break;
		}
		return true;
	//   21   57:iconst_1        
	//   22   58:ireturn         
	}
}
