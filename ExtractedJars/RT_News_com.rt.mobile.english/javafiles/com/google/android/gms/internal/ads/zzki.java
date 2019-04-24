// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzkh

public abstract class zzki extends zzek
	implements zzkh
{

	public zzki()
	{
		super("com.google.android.gms.ads.internal.client.IAdListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 7: default 44
	//	               1 92
	//	               2 81
	//	               3 74
	//	               4 67
	//	               5 60
	//	               6 53
	//	               7 46
		default:
			return false;
	//    2   44:iconst_0        
	//    3   45:ireturn         

		case 7: // '\007'
			onAdImpression();
	//    4   46:aload_0         
	//    5   47:invokevirtual   #21  <Method void onAdImpression()>
			break;

	//*   6   50:goto            96
		case 6: // '\006'
			onAdClicked();
	//    7   53:aload_0         
	//    8   54:invokevirtual   #24  <Method void onAdClicked()>
			break;

	//*   9   57:goto            96
		case 5: // '\005'
			onAdOpened();
	//   10   60:aload_0         
	//   11   61:invokevirtual   #27  <Method void onAdOpened()>
			break;

	//*  12   64:goto            96
		case 4: // '\004'
			onAdLoaded();
	//   13   67:aload_0         
	//   14   68:invokevirtual   #30  <Method void onAdLoaded()>
			break;

	//*  15   71:goto            96
		case 3: // '\003'
			onAdLeftApplication();
	//   16   74:aload_0         
	//   17   75:invokevirtual   #33  <Method void onAdLeftApplication()>
			break;

	//*  18   78:goto            96
		case 2: // '\002'
			onAdFailedToLoad(parcel.readInt());
	//   19   81:aload_0         
	//   20   82:aload_2         
	//   21   83:invokevirtual   #39  <Method int Parcel.readInt()>
	//   22   86:invokevirtual   #43  <Method void onAdFailedToLoad(int)>
			break;

	//*  23   89:goto            96
		case 1: // '\001'
			onAdClosed();
	//   24   92:aload_0         
	//   25   93:invokevirtual   #46  <Method void onAdClosed()>
			break;
		}
		parcel1.writeNoException();
	//   26   96:aload_3         
	//   27   97:invokevirtual   #49  <Method void Parcel.writeNoException()>
		return true;
	//   28  100:iconst_1        
	//   29  101:ireturn         
	}
}
