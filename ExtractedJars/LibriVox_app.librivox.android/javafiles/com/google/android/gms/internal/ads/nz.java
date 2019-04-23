// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, nx, oa

public final class nz extends bcj
	implements nx
{

	public static nx a(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager">
	//    6    9:invokeinterface #16  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof nx)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class nx>
	//*  10   19:ifeq            27
			return (nx)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class nx>
	//   13   26:areturn         
		else
			return ((nx) (new oa(ibinder)));
	//   14   27:new             #18  <Class oa>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #22  <Method void oa(IBinder)>
	//   18   35:areturn         
	}
}
