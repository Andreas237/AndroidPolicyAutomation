// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bxz, byb

public abstract class bya extends bcj
	implements bxz
{

	public static bxz a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IMuteThisAdListener">
	//    6    9:invokeinterface #16  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof bxz)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class bxz>
	//*  10   19:ifeq            27
			return (bxz)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class bxz>
	//   13   26:areturn         
		else
			return ((bxz) (new byb(ibinder)));
	//   14   27:new             #18  <Class byb>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #22  <Method void byb(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          15
		{
			a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #28  <Method void a()>
			parcel1.writeNoException();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #33  <Method void Parcel.writeNoException()>
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
