// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzps, zzpu

public abstract class zzpt extends zzek
	implements zzps
{

	public zzpt()
	{
		super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IAttributionInfo">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzps zzg(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.formats.client.IAttributionInfo">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzps)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzps>
	//*  10   19:ifeq            27
			return (zzps)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzps>
	//   13   26:areturn         
		else
			return ((zzps) (new zzpu(ibinder)));
	//   14   27:new             #24  <Class zzpu>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzpu(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     2 3: default 24
	//	               2 43
	//	               3 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 3: // '\003'
			parcel = ((Parcel) (zzjr()));
	//    4   26:aload_0         
	//    5   27:invokevirtual   #35  <Method java.util.List zzjr()>
	//    6   30:astore_2        
			parcel1.writeNoException();
	//    7   31:aload_3         
	//    8   32:invokevirtual   #40  <Method void Parcel.writeNoException()>
			parcel1.writeList(((java.util.List) (parcel)));
	//    9   35:aload_3         
	//   10   36:aload_2         
	//   11   37:invokevirtual   #44  <Method void Parcel.writeList(java.util.List)>
			break;

	//*  12   40:goto            57
		case 2: // '\002'
			parcel = ((Parcel) (getText()));
	//   13   43:aload_0         
	//   14   44:invokevirtual   #48  <Method String getText()>
	//   15   47:astore_2        
			parcel1.writeNoException();
	//   16   48:aload_3         
	//   17   49:invokevirtual   #40  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   18   52:aload_3         
	//   19   53:aload_2         
	//   20   54:invokevirtual   #51  <Method void Parcel.writeString(String)>
			break;
		}
		return true;
	//   21   57:iconst_1        
	//   22   58:ireturn         
	}
}
