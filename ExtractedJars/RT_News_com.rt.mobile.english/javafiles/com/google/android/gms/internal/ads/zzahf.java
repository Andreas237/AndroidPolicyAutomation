// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzahe, zzahg, zzagu, 
//			zzagw

public abstract class zzahf extends zzek
	implements zzahe
{

	public zzahf()
	{
		super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzahe zzz(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzahe)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzahe>
	//*  10   19:ifeq            27
			return (zzahe)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzahe>
	//   13   26:areturn         
		else
			return ((zzahe) (new zzahg(ibinder)));
	//   14   27:new             #24  <Class zzahg>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzahg(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 8: default 48
	//	               1 154
	//	               2 147
	//	               3 140
	//	               4 133
	//	               5 75
	//	               6 68
	//	               7 57
	//	               8 50
		default:
			return false;
	//    2   48:iconst_0        
	//    3   49:ireturn         

		case 8: // '\b'
			onRewardedVideoCompleted();
	//    4   50:aload_0         
	//    5   51:invokevirtual   #34  <Method void onRewardedVideoCompleted()>
			break;
	//    6   54:goto            158

		case 7: // '\007'
			onRewardedVideoAdFailedToLoad(parcel.readInt());
	//    7   57:aload_0         
	//    8   58:aload_2         
	//    9   59:invokevirtual   #40  <Method int Parcel.readInt()>
	//   10   62:invokevirtual   #44  <Method void onRewardedVideoAdFailedToLoad(int)>
			break;
	//   11   65:goto            158

		case 6: // '\006'
			onRewardedVideoAdLeftApplication();
	//   12   68:aload_0         
	//   13   69:invokevirtual   #47  <Method void onRewardedVideoAdLeftApplication()>
			break;
	//   14   72:goto            158

		case 5: // '\005'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   15   75:aload_2         
	//   16   76:invokevirtual   #51  <Method IBinder Parcel.readStrongBinder()>
	//   17   79:astore_2        
			if(parcel == null)
	//*  18   80:aload_2         
	//*  19   81:ifnonnull       89
			{
				parcel = null;
	//   20   84:aconst_null     
	//   21   85:astore_2        
			} else
	//*  22   86:goto            125
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
	//   23   89:aload_2         
	//   24   90:ldc1            #53  <String "com.google.android.gms.ads.internal.reward.client.IRewardItem">
	//   25   92:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   26   97:astore          5
				if(iinterface instanceof zzagu)
	//*  27   99:aload           5
	//*  28  101:instanceof      #55  <Class zzagu>
	//*  29  104:ifeq            116
					parcel = ((Parcel) ((zzagu)iinterface));
	//   30  107:aload           5
	//   31  109:checkcast       #55  <Class zzagu>
	//   32  112:astore_2        
				else
	//*  33  113:goto            125
					parcel = ((Parcel) (new zzagw(((IBinder) (parcel)))));
	//   34  116:new             #57  <Class zzagw>
	//   35  119:dup             
	//   36  120:aload_2         
	//   37  121:invokespecial   #58  <Method void zzagw(IBinder)>
	//   38  124:astore_2        
			}
			zza(((zzagu) (parcel)));
	//   39  125:aload_0         
	//   40  126:aload_2         
	//   41  127:invokevirtual   #62  <Method void zza(zzagu)>
			break;

	//*  42  130:goto            158
		case 4: // '\004'
			onRewardedVideoAdClosed();
	//   43  133:aload_0         
	//   44  134:invokevirtual   #65  <Method void onRewardedVideoAdClosed()>
			break;

	//*  45  137:goto            158
		case 3: // '\003'
			onRewardedVideoStarted();
	//   46  140:aload_0         
	//   47  141:invokevirtual   #68  <Method void onRewardedVideoStarted()>
			break;

	//*  48  144:goto            158
		case 2: // '\002'
			onRewardedVideoAdOpened();
	//   49  147:aload_0         
	//   50  148:invokevirtual   #71  <Method void onRewardedVideoAdOpened()>
			break;

	//*  51  151:goto            158
		case 1: // '\001'
			onRewardedVideoAdLoaded();
	//   52  154:aload_0         
	//   53  155:invokevirtual   #74  <Method void onRewardedVideoAdLoaded()>
			break;
		}
		parcel1.writeNoException();
	//   54  158:aload_3         
	//   55  159:invokevirtual   #77  <Method void Parcel.writeNoException()>
		return true;
	//   56  162:iconst_1        
	//   57  163:ireturn         
	}
}
