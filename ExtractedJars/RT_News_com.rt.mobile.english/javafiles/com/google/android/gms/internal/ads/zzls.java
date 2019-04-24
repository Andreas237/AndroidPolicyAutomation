// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzlr, zzel

public abstract class zzls extends zzek
	implements zzlr
{

	public zzls()
	{
		super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 70
	//	               2 63
	//	               3 56
	//	               4 49
	//	               5 38
		default:
			return false;
	//    2   36:iconst_0        
	//    3   37:ireturn         

		case 5: // '\005'
			onVideoMute(zzel.zza(parcel));
	//    4   38:aload_0         
	//    5   39:aload_2         
	//    6   40:invokestatic    #24  <Method boolean zzel.zza(Parcel)>
	//    7   43:invokevirtual   #28  <Method void onVideoMute(boolean)>
			break;

	//*   8   46:goto            74
		case 4: // '\004'
			onVideoEnd();
	//    9   49:aload_0         
	//   10   50:invokevirtual   #31  <Method void onVideoEnd()>
			break;

	//*  11   53:goto            74
		case 3: // '\003'
			onVideoPause();
	//   12   56:aload_0         
	//   13   57:invokevirtual   #34  <Method void onVideoPause()>
			break;

	//*  14   60:goto            74
		case 2: // '\002'
			onVideoPlay();
	//   15   63:aload_0         
	//   16   64:invokevirtual   #37  <Method void onVideoPlay()>
			break;

	//*  17   67:goto            74
		case 1: // '\001'
			onVideoStart();
	//   18   70:aload_0         
	//   19   71:invokevirtual   #40  <Method void onVideoStart()>
			break;
		}
		parcel1.writeNoException();
	//   20   74:aload_3         
	//   21   75:invokevirtual   #45  <Method void Parcel.writeNoException()>
		return true;
	//   22   78:iconst_1        
	//   23   79:ireturn         
	}
}
